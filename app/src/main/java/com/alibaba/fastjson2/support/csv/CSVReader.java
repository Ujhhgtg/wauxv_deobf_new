package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ByteArrayValueConsumer;
import com.alibaba.fastjson2.reader.CharArrayValueConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.stream.StreamReader;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class CSVReader<T> extends StreamReader<T> implements Closeable {
    protected Class<T> objectClass;
    private boolean objectSupport;
    boolean quote;

    public CSVReader() {
        this.objectSupport = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readHeader$0(String[] strArr, int i) {
        this.columnStats.add(new StreamReader.ColumnStat(strArr[i]));
    }

    public static <T> CSVReader<T> of(Reader reader, Class<T> cls) {
        return new CSVReaderUTF16(reader, cls);
    }

    public static int rowCount(String str, StreamReader.Feature... featureArr) {
        CSVReaderUTF8 cSVReaderUTF8 = new CSVReaderUTF8(featureArr);
        cSVReaderUTF8.rowCount(str, str.length());
        return cSVReaderUTF8.rowCount();
    }

    public void config(StreamReader.Feature... featureArr) {
        for (StreamReader.Feature feature : featureArr) {
            this.features |= feature.mask;
        }
    }

    public Object error(int i, Exception exc) {
        String strM4748;
        this.errorCount++;
        getColumnStat(i).errors++;
        String str = null;
        if ((this.features & StreamReader.Feature.ErrorAsNull.mask) != 0) {
            return null;
        }
        String strM4751 = AbstractC2784.m4751(new StringBuilder("read csv error, line "), this.rowCount, ", column ");
        List<String> list = this.columns;
        if (list != null && i < list.size()) {
            str = this.columns.get(i);
        }
        if (str == null || str.isEmpty()) {
            strM4748 = strM4751 + i;
        } else {
            strM4748 = AbstractC2784.m4748(strM4751, str);
        }
        throw new JSONException(strM4748, exc);
    }

    public int errorCount() {
        return this.errorCount;
    }

    public String getColumn(int i) {
        List<String> list = this.columns;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.columns.get(i);
    }

    public StreamReader.ColumnStat getColumnStat(String str) {
        List<StreamReader.ColumnStat> list = this.columnStats;
        if (list == null) {
            return null;
        }
        for (StreamReader.ColumnStat columnStat : list) {
            if (str.equals(columnStat.name)) {
                return columnStat;
            }
        }
        return null;
    }

    public List<StreamReader.ColumnStat> getColumnStats() {
        return this.columnStats;
    }

    public Type getColumnType(int i) {
        Type[] typeArr = this.types;
        if (typeArr == null || i >= typeArr.length) {
            return null;
        }
        return typeArr[i];
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public abstract boolean isEnd();

    public boolean isObjectSupport() {
        return this.objectSupport;
    }

    public abstract void readAll();

    public abstract void readAll(int i);

    public List<String> readHeader() {
        this.objectSupport = true;
        final String[] strArr = (String[]) readLineValues(true);
        if (this.objectClass != null) {
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            boolean z = (this.features & JSONReader.Feature.FieldBased.mask) != 0;
            Type[] typeArr = new Type[strArr.length];
            ObjectReader[] objectReaderArr = new ObjectReader[strArr.length];
            FieldReader[] fieldReaderArr = new FieldReader[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                FieldReader fieldReaderCreateFieldReader = defaultObjectReaderProvider.createFieldReader(this.objectClass, strArr[i].trim(), this.features);
                if (fieldReaderCreateFieldReader != null) {
                    fieldReaderArr[i] = fieldReaderCreateFieldReader;
                    Type typeNonePrimitive = fieldReaderCreateFieldReader.fieldType;
                    if (typeNonePrimitive instanceof Class) {
                        Class cls = (Class) typeNonePrimitive;
                        if (cls.isPrimitive()) {
                            typeNonePrimitive = TypeUtils.nonePrimitive(cls);
                        }
                    }
                    typeArr[i] = typeNonePrimitive;
                    objectReaderArr[i] = defaultObjectReaderProvider.getObjectReader(typeNonePrimitive, z);
                } else {
                    typeArr[i] = String.class;
                }
            }
            this.types = typeArr;
            this.typeReaders = objectReaderArr;
            this.fieldReaders = fieldReaderArr;
            this.objectCreator = defaultObjectReaderProvider.createObjectCreator(this.objectClass, this.features);
        }
        this.columns = Arrays.asList(strArr);
        this.columnStats = new ArrayList();
        IntStream.range(0, strArr.length).forEach(new IntConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᲈᤞᲀ
            @Override // java.util.function.IntConsumer
            public final void accept(int i2) {
                this.f2254.lambda$readHeader$0(strArr, i2);
            }
        });
        if (this.rowCount == 1) {
            this.rowCount = this.lineTerminated ? 0 : -1;
        }
        return this.columns;
    }

    public final String[] readLine() {
        return (String[]) readLineValues(true);
    }

    public List<String[]> readLineAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String[] line = readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    @Override // com.alibaba.fastjson2.stream.StreamReader
    public T readLineObject() {
        if (!this.objectSupport) {
            throw new UnsupportedOperationException("this method should not be called, try specify objectClass or method readLineValues instead ?");
        }
        if (this.inputEnd && this.off == this.end) {
            return null;
        }
        int i = 0;
        if (this.fieldReaders == null) {
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            Class<T> cls = this.objectClass;
            if (cls == null) {
                throw new JSONException("not support operation, objectClass is null");
            }
            ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (this.features & JSONReader.Feature.FieldBased.mask) != 0);
            if (!(objectReader instanceof ObjectReaderAdapter)) {
                throw new JSONException("not support operation : " + this.objectClass);
            }
            FieldReader[] fieldReaders = ((ObjectReaderAdapter) objectReader).getFieldReaders();
            this.fieldReaders = fieldReaders;
            this.types = new Type[fieldReaders.length];
            int i2 = 0;
            while (true) {
                Type[] typeArr = this.types;
                if (i2 >= typeArr.length) {
                    break;
                }
                typeArr[i2] = this.fieldReaders[i2].fieldType;
                i2++;
            }
            this.objectCreator = defaultObjectReaderProvider.createObjectCreator(this.objectClass, this.features);
        }
        if (this.objectCreator == null) {
            throw new JSONException("not support operation, objectClass is null");
        }
        Object[] lineValues = readLineValues(false);
        if (lineValues == null) {
            return null;
        }
        if (this.fieldReaders == null) {
            throw new JSONException("not support operation, objectClass is null");
        }
        T t = (T) this.objectCreator.get();
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                return t;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            if (fieldReader != null) {
                fieldReader.accept(t, lineValues[i]);
            }
            i++;
        }
    }

    public void readLineObjectAll(Consumer<T> consumer) {
        readLineObjectAll(true, consumer);
    }

    public abstract void readLineObjectAll(boolean z, Consumer<T> consumer);

    public final Object[] readLineValues() {
        return readLineValues(false);
    }

    public abstract Object[] readLineValues(boolean z);

    public void skipLines(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        for (int i2 = 0; i2 < i; i2++) {
            seekLine();
        }
    }

    public abstract void statAll();

    public abstract void statAll(int i);

    public static <T> CSVReader of(String str, Class<T> cls) {
        Function<String, byte[]> function;
        if (JDKUtils.JVM_VERSION > 8 && (function = JDKUtils.STRING_VALUE) != null) {
            try {
                if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
                    byte[] bArrApply = function.apply(str);
                    return new CSVReaderUTF8(bArrApply, 0, bArrApply.length, StandardCharsets.ISO_8859_1, cls);
                }
            } catch (Exception unused) {
                throw new JSONException("unsafe get String.coder error");
            }
        }
        char[] charArray = JDKUtils.getCharArray(str);
        return new CSVReaderUTF16(charArray, 0, charArray.length, cls);
    }

    public List<T> readLineObjectAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            T lineObject = readLineObject();
            if (lineObject == null) {
                return arrayList;
            }
            arrayList.add(lineObject);
        }
    }

    public CSVReader(Class<T> cls) {
        this.objectSupport = true;
        this.objectClass = cls;
    }

    public void config(StreamReader.Feature feature, boolean z) {
        if (z) {
            this.features = feature.mask | this.features;
        } else {
            this.features = (~feature.mask) & this.features;
        }
    }

    public static int rowCount(byte[] bArr, StreamReader.Feature... featureArr) {
        CSVReaderUTF8 cSVReaderUTF8 = new CSVReaderUTF8(featureArr);
        cSVReaderUTF8.rowCount(bArr, bArr.length);
        return cSVReaderUTF8.rowCount();
    }

    public StreamReader.ColumnStat getColumnStat(int i) {
        if (this.columnStats == null) {
            this.columnStats = new ArrayList();
        }
        if (i >= this.columnStats.size()) {
            int size = this.columnStats.size();
            StreamReader.ColumnStat columnStat = null;
            while (size <= i) {
                List<String> list = this.columns;
                StreamReader.ColumnStat columnStat2 = new StreamReader.ColumnStat((list == null || i >= list.size()) ? null : this.columns.get(i));
                this.columnStats.add(columnStat2);
                size++;
                columnStat = columnStat2;
            }
            return columnStat;
        }
        return this.columnStats.get(i);
    }

    public CSVReader(Type[] typeArr) {
        super(typeArr);
        this.objectSupport = false;
    }

    public static int rowCount(char[] cArr, StreamReader.Feature... featureArr) {
        CSVReaderUTF16 cSVReaderUTF16 = new CSVReaderUTF16(featureArr);
        cSVReaderUTF16.rowCount(cArr, cArr.length);
        return cSVReaderUTF16.rowCount();
    }

    public static <T> CSVReader<T> of(char[] cArr, Class<T> cls) {
        return new CSVReaderUTF16(cArr, 0, cArr.length, cls);
    }

    public static <T> CSVReader<T> of(byte[] bArr, Class<T> cls) {
        return of(bArr, 0, bArr.length, StandardCharsets.UTF_8, cls);
    }

    public static int rowCount(File file) throws IOException {
        if (!file.exists()) {
            return -1;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int iRowCount = rowCount(fileInputStream);
            fileInputStream.close();
            return iRowCount;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static CSVReader of(File file, Type... typeArr) {
        return new CSVReaderUTF8(Files.newInputStream(file.toPath(), new OpenOption[0]), StandardCharsets.UTF_8, typeArr);
    }

    public static CSVReader of(File file, ByteArrayValueConsumer byteArrayValueConsumer) {
        return of(file, StandardCharsets.UTF_8, byteArrayValueConsumer);
    }

    public static CSVReader of(File file, Charset charset, ByteArrayValueConsumer byteArrayValueConsumer) {
        if (charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(Files.newInputStream(file.toPath(), new OpenOption[0]), charset, byteArrayValueConsumer);
        }
        throw new JSONException("not support charset : " + charset);
    }

    public static int rowCount(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[524288];
        CSVReaderUTF8 cSVReaderUTF8 = new CSVReaderUTF8(new StreamReader.Feature[0]);
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return cSVReaderUTF8.rowCount();
            }
            cSVReaderUTF8.rowCount(bArr, i);
        }
    }

    public static CSVReader of(File file, CharArrayValueConsumer charArrayValueConsumer) {
        return of(file, StandardCharsets.UTF_8, charArrayValueConsumer);
    }

    public static CSVReader of(File file, Charset charset, CharArrayValueConsumer charArrayValueConsumer) {
        return new CSVReaderUTF16(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), charset), charArrayValueConsumer);
    }

    public static CSVReader of(File file, Charset charset, Type... typeArr) {
        if (JDKUtils.JVM_VERSION != 8 && charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(Files.newInputStream(file.toPath(), new OpenOption[0]), charset, typeArr);
        }
        return new CSVReaderUTF16(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), charset), typeArr);
    }

    public int rowCount() {
        return this.lineTerminated ? this.rowCount : this.rowCount + 1;
    }

    public void rowCount(String str, int i) {
        this.lineTerminated = false;
        int i2 = 0;
        while (i2 < i) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"') {
                this.lineSize++;
                if (this.quote) {
                    int i3 = i2 + 1;
                    if (i3 >= i) {
                        return;
                    }
                    if (str.charAt(i3) == '\"') {
                        i2 = i3;
                    } else {
                        this.quote = false;
                    }
                } else {
                    this.quote = true;
                }
            } else if (this.quote) {
                this.lineSize++;
            } else if (cCharAt == '\n') {
                if (this.lineSize > 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                    this.rowCount++;
                    this.lineSize = 0;
                }
                this.lineTerminated = i2 + 1 == i;
            } else if (cCharAt == '\r') {
                this.lineTerminated = true;
                if (this.lineSize > 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                    this.rowCount++;
                }
                this.lineSize = 0;
                int i4 = i2 + 1;
                if (i4 >= i) {
                    return;
                }
                if (str.charAt(i4) == '\n') {
                    i2 = i4;
                }
                this.lineTerminated = i2 + 1 == i;
            } else {
                this.lineSize++;
            }
            i2++;
        }
    }

    public static <T> CSVReader<T> of(File file, Class<T> cls) {
        return of(file, StandardCharsets.UTF_8, cls);
    }

    public static <T> CSVReader<T> of(File file, Charset charset, Class<T> cls) {
        if (JDKUtils.JVM_VERSION != 8 && charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(Files.newInputStream(file.toPath(), new OpenOption[0]), charset, cls);
        }
        return new CSVReaderUTF16(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), charset), cls);
    }

    public static CSVReader of(InputStream inputStream, Type... typeArr) {
        return of(inputStream, StandardCharsets.UTF_8, typeArr);
    }

    public static <T> CSVReader<T> of(InputStream inputStream, Class<T> cls) {
        return of(inputStream, StandardCharsets.UTF_8, cls);
    }

    public static <T> CSVReader<T> of(InputStream inputStream, Charset charset, Class<T> cls) {
        if (JDKUtils.JVM_VERSION != 8 && charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(inputStream, charset, cls);
        }
        return new CSVReaderUTF16(new InputStreamReader(inputStream, charset), cls);
    }

    public static CSVReader of(InputStream inputStream, Charset charset, Type... typeArr) {
        if (JDKUtils.JVM_VERSION != 8 && charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(inputStream, charset, typeArr);
        }
        return new CSVReaderUTF16(new InputStreamReader(inputStream, charset), typeArr);
    }

    public static CSVReader of(Reader reader, Type... typeArr) {
        return new CSVReaderUTF16(reader, typeArr);
    }

    public static CSVReader of(String str, Type... typeArr) {
        Function<String, byte[]> function;
        if (JDKUtils.JVM_VERSION > 8 && (function = JDKUtils.STRING_VALUE) != null) {
            try {
                if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
                    byte[] bArrApply = function.apply(str);
                    return new CSVReaderUTF8(bArrApply, 0, bArrApply.length, typeArr);
                }
            } catch (Exception unused) {
                throw new JSONException("unsafe get String.coder error");
            }
        }
        char[] charArray = JDKUtils.getCharArray(str);
        return new CSVReaderUTF16(charArray, 0, charArray.length, typeArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6 A[SYNTHETIC] */
    public void rowCount(byte[] bArr, int i) {
        byte b;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        this.lineTerminated = false;
        int i4 = 0;
        while (i4 < i) {
            if (i4 + 4 < i) {
                byte b2 = bArr[i4];
                byte b3 = bArr[i4 + 1];
                byte b4 = bArr[i4 + 2];
                int i5 = i4 + 3;
                byte b5 = bArr[i5];
                if (b2 > 34 && b3 > 34 && b4 > 34 && b5 > 34) {
                    this.lineSize += 4;
                    i4 = i5;
                } else {
                    b = bArr[i4];
                    if (b == 34) {
                        this.lineSize++;
                        if (this.quote) {
                            i3 = i4 + 1;
                            if (i3 >= i) {
                                return;
                            }
                            if (bArr[i3] == 34) {
                                i4 = i3;
                            } else {
                                this.quote = false;
                            }
                        } else {
                            this.quote = true;
                        }
                    } else if (this.quote) {
                        this.lineSize++;
                    } else if (b == 10) {
                        if (this.lineSize <= 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                            this.rowCount++;
                        }
                        this.lineSize = 0;
                        if (i4 + 1 == i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.lineTerminated = z2;
                    } else if (b == 13) {
                        if (this.lineSize <= 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                            this.rowCount++;
                        }
                        this.lineTerminated = true;
                        this.lineSize = 0;
                        i2 = i4 + 1;
                        if (i2 >= i) {
                            return;
                        }
                        if (bArr[i2] == 10) {
                            i4 = i2;
                        }
                        if (i4 + 1 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.lineTerminated = z;
                    } else {
                        this.lineSize++;
                    }
                }
            } else {
                b = bArr[i4];
                if (b == 34) {
                    this.lineSize++;
                    if (this.quote) {
                        this.quote = true;
                    } else {
                        i3 = i4 + 1;
                        if (i3 >= i) {
                            return;
                        }
                        if (bArr[i3] == 34) {
                            i4 = i3;
                        } else {
                            this.quote = false;
                        }
                    }
                } else if (this.quote) {
                    this.lineSize++;
                } else if (b == 10) {
                    if (this.lineSize <= 0) {
                        this.rowCount++;
                    } else {
                        this.rowCount++;
                    }
                    this.lineSize = 0;
                    if (i4 + 1 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.lineTerminated = z2;
                } else if (b == 13) {
                    if (this.lineSize <= 0) {
                        this.rowCount++;
                    } else {
                        this.rowCount++;
                    }
                    this.lineTerminated = true;
                    this.lineSize = 0;
                    i2 = i4 + 1;
                    if (i2 >= i) {
                        return;
                    }
                    if (bArr[i2] == 10) {
                        i4 = i2;
                    }
                    if (i4 + 1 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.lineTerminated = z;
                } else {
                    this.lineSize++;
                }
            }
            i4++;
        }
    }

    public static CSVReader of(char[] cArr, Type... typeArr) {
        return new CSVReaderUTF16(cArr, 0, cArr.length, typeArr);
    }

    public static <T> CSVReader<T> of(char[] cArr, int i, int i2, CharArrayValueConsumer charArrayValueConsumer) {
        return new CSVReaderUTF16(cArr, i, i2, charArrayValueConsumer);
    }

    public static CSVReader of(byte[] bArr, Type... typeArr) {
        return new CSVReaderUTF8(bArr, 0, bArr.length, typeArr);
    }

    public static CSVReader of(byte[] bArr, ByteArrayValueConsumer byteArrayValueConsumer) {
        return of(bArr, 0, bArr.length, StandardCharsets.UTF_8, byteArrayValueConsumer);
    }

    public static <T> CSVReader<T> of(byte[] bArr, int i, int i2, Charset charset, ByteArrayValueConsumer byteArrayValueConsumer) {
        return new CSVReaderUTF8(bArr, i, i2, charset, byteArrayValueConsumer);
    }

    public static <T> CSVReader<T> of(byte[] bArr, Charset charset, Class<T> cls) {
        return of(bArr, 0, bArr.length, charset, cls);
    }

    public static <T> CSVReader<T> of(byte[] bArr, int i, int i2, Class<T> cls) {
        return new CSVReaderUTF8(bArr, i, i2, StandardCharsets.UTF_8, cls);
    }

    public static <T> CSVReader<T> of(byte[] bArr, int i, int i2, Charset charset, Class<T> cls) {
        if (charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            return new CSVReaderUTF8(bArr, i, i2, charset, cls);
        }
        char[] cArr = new char[i2];
        return new CSVReaderUTF16(cArr, 0, IOUtils.decodeUTF8(bArr, i, i2, cArr), cls);
    }

    public static <T> CSVReader<T> of(char[] cArr, int i, int i2, Class<T> cls) {
        return new CSVReaderUTF16(cArr, i, i2, cls);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7 A[SYNTHETIC] */
    public void rowCount(char[] cArr, int i) {
        char c;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        this.lineTerminated = false;
        int i4 = 0;
        while (i4 < i) {
            if (i4 + 4 < i) {
                char c2 = cArr[i4];
                char c3 = cArr[i4 + 1];
                char c4 = cArr[i4 + 2];
                int i5 = i4 + 3;
                char c5 = cArr[i5];
                if (c2 > '\"' && c3 > '\"' && c4 > '\"' && c5 > '\"') {
                    this.lineSize += 4;
                    i4 = i5;
                } else {
                    c = cArr[i4];
                    if (c == '\"') {
                        this.lineSize++;
                        if (this.quote) {
                            i3 = i4 + 1;
                            if (i3 >= i) {
                                return;
                            }
                            if (cArr[i3] == '\"') {
                                i4 = i3;
                            } else {
                                this.quote = false;
                            }
                        } else {
                            this.quote = true;
                        }
                    } else if (this.quote) {
                        this.lineSize++;
                    } else if (c == '\n') {
                        if (this.lineSize <= 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                            this.rowCount++;
                        }
                        this.lineSize = 0;
                        if (i4 + 1 == i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.lineTerminated = z2;
                    } else if (c == '\r' && (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) != 0) {
                        this.lineSize++;
                    } else {
                        if (this.lineSize > 0) {
                            this.rowCount++;
                        }
                        this.lineTerminated = true;
                        this.lineSize = 0;
                        i2 = i4 + 1;
                        if (i2 >= i) {
                            return;
                        }
                        if (cArr[i2] == '\n') {
                            i4 = i2;
                        }
                        if (i4 + 1 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.lineTerminated = z;
                    }
                }
            } else {
                c = cArr[i4];
                if (c == '\"') {
                    this.lineSize++;
                    if (this.quote) {
                        this.quote = true;
                    } else {
                        i3 = i4 + 1;
                        if (i3 >= i) {
                            return;
                        }
                        if (cArr[i3] == '\"') {
                            i4 = i3;
                        } else {
                            this.quote = false;
                        }
                    }
                } else if (this.quote) {
                    this.lineSize++;
                } else if (c == '\n') {
                    if (this.lineSize <= 0) {
                        this.rowCount++;
                    } else {
                        this.rowCount++;
                    }
                    this.lineSize = 0;
                    if (i4 + 1 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.lineTerminated = z2;
                } else if (c == '\r') {
                    if (this.lineSize > 0) {
                        this.rowCount++;
                    }
                    this.lineTerminated = true;
                    this.lineSize = 0;
                    i2 = i4 + 1;
                    if (i2 >= i) {
                        return;
                    }
                    if (cArr[i2] == '\n') {
                        i4 = i2;
                    }
                    if (i4 + 1 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.lineTerminated = z;
                } else {
                    if (this.lineSize > 0) {
                        this.rowCount++;
                    }
                    this.lineTerminated = true;
                    this.lineSize = 0;
                    i2 = i4 + 1;
                    if (i2 >= i) {
                        return;
                    }
                    if (cArr[i2] == '\n') {
                        i4 = i2;
                    }
                    if (i4 + 1 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.lineTerminated = z;
                }
            }
            i4++;
        }
    }
}
