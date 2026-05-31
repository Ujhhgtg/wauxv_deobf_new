package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.reader.CharArrayValueConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.stream.StreamReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class CSVReaderUTF16<T> extends CSVReader<T> {
    static final Map<Long, Function<Consumer, CharArrayValueConsumer>> valueConsumerCreators = new ConcurrentHashMap();
    char[] buf;
    Reader input;
    CharArrayValueConsumer valueConsumer;

    /* JADX INFO: compiled from: obf */
    public class CharArrayConsumerImpl<T> implements CharArrayValueConsumer {
        final Consumer<T> consumer;
        protected T object;

        public CharArrayConsumerImpl(Consumer<T> consumer) {
            this.consumer = consumer;
        }

        @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
        public void accept(int i, int i2, char[] cArr, int i3, int i4) {
            if (i2 >= ((StreamReader) CSVReaderUTF16.this).fieldReaders.length || i4 == 0) {
                return;
            }
            FieldReader fieldReader = ((StreamReader) CSVReaderUTF16.this).fieldReaders[i2];
            fieldReader.accept(this.object, CSVReaderUTF16.this.readValue(cArr, i3, i4, fieldReader.fieldType));
        }

        @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
        public final void afterRow(int i) {
            this.consumer.accept(this.object);
            this.object = null;
        }

        @Override // com.alibaba.fastjson2.reader.CharArrayValueConsumer
        public final void beforeRow(int i) {
            if (((StreamReader) CSVReaderUTF16.this).objectCreator != null) {
                this.object = (T) ((StreamReader) CSVReaderUTF16.this).objectCreator.get();
            }
        }
    }

    public CSVReaderUTF16(StreamReader.Feature... featureArr) {
        for (StreamReader.Feature feature : featureArr) {
            this.features |= feature.mask;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$statAll$0(int i, int i2, char[] cArr, int i3, int i4) {
        getColumnStat(i2).stat(cArr, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$statAll$1(int i, int i2, char[] cArr, int i3, int i4) {
        getColumnStat(i2).stat(cArr, i3, i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Reader reader = this.input;
        if (reader != null) {
            IOUtils.close(reader);
        }
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public boolean isEnd() {
        return this.inputEnd;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public void readAll() {
        CharArrayValueConsumer<T> charArrayValueConsumer = this.valueConsumer;
        if (charArrayValueConsumer == null) {
            throw new JSONException("unsupported operation, consumer is null");
        }
        readAll(charArrayValueConsumer, Integer.MAX_VALUE);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public void readLineObjectAll(boolean z, Consumer<T> consumer) {
        Class<T> cls;
        if (z) {
            readHeader();
        }
        int i = 0;
        if (this.fieldReaders != null) {
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            if (this.fieldReaders == null && (cls = this.objectClass) != null) {
                this.fieldReaders = ((ObjectReaderAdapter) defaultObjectReaderProvider.getObjectReader(cls)).getFieldReaders();
                this.objectCreator = defaultObjectReaderProvider.createObjectCreator(this.objectClass, this.features);
            }
            String[] strArr = new String[this.fieldReaders.length + 1];
            strArr[0] = this.objectClass.getName();
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                int i2 = i + 1;
                strArr[i2] = fieldReaderArr[i].fieldName;
                i = i2;
            }
            long jHashCode64 = Fnv.hashCode64(strArr);
            Map<Long, Function<Consumer, CharArrayValueConsumer>> map = valueConsumerCreators;
            Function<Consumer, CharArrayValueConsumer> functionCreateCharArrayValueConsumerCreator = map.get(Long.valueOf(jHashCode64));
            if (functionCreateCharArrayValueConsumerCreator == null && (functionCreateCharArrayValueConsumerCreator = defaultObjectReaderProvider.createCharArrayValueConsumerCreator(this.objectClass, this.fieldReaders)) != null) {
                map.putIfAbsent(Long.valueOf(jHashCode64), functionCreateCharArrayValueConsumerCreator);
            }
            CharArrayValueConsumer charArrayValueConsumerApply = functionCreateCharArrayValueConsumerCreator != null ? functionCreateCharArrayValueConsumerCreator.apply(consumer) : null;
            if (charArrayValueConsumerApply == null) {
                charArrayValueConsumerApply = new CharArrayConsumerImpl<>(consumer);
            }
            readAll(charArrayValueConsumerApply, Integer.MAX_VALUE);
            return;
        }
        while (true) {
            Object[] lineValues = readLineValues(false);
            if (lineValues == null) {
                return;
            } else {
                consumer.accept(lineValues);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:202:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public Object[] readLineValues(boolean z) {
        Object[] objArr;
        int i;
        Object str;
        char c;
        Type[] typeArr;
        Type type;
        Object str2;
        ?? r10;
        char[] cArr;
        int i2;
        int i3;
        int i4;
        char[] cArr2;
        char c2;
        int i5;
        try {
            if (this.inputEnd) {
                return null;
            }
            if ((this.input == null && this.off >= this.end) || !seekLine()) {
                return null;
            }
            List<String> list = this.columns;
            if (list != null) {
                objArr = z ? new String[list.size()] : new Object[list.size()];
            } else {
                objArr = null;
            }
            int i6 = this.lineStart;
            int i7 = i6;
            ?? arrayList = 0;
            boolean z2 = false;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i = this.lineEnd;
                if (i6 >= i) {
                    break;
                }
                char[] cArr3 = this.buf;
                char c3 = cArr3[i6];
                if (z2) {
                    if (c3 == '\"') {
                        int i11 = i6 + 1;
                        if (i11 >= i) {
                            if (i11 == i) {
                                break;
                            }
                        } else {
                            char c4 = cArr3[i11];
                            if (c4 == '\"') {
                                i8 += 2;
                                i10++;
                                i6 = i11;
                            } else if (c4 == ',') {
                                i6 = i11;
                                c3 = c4;
                            }
                        }
                        c = c3;
                        i6 = i6;
                        if (c == ',') {
                            typeArr = this.types;
                            if (typeArr != null || i9 >= typeArr.length) {
                                type = null;
                            } else {
                                type = typeArr[i9];
                            }
                            if (z2) {
                                if (i10 == 0) {
                                    int i12 = i8 - i10;
                                    cArr = new char[i12];
                                    i2 = i8 + i7;
                                    i3 = i7 + 1;
                                    i4 = 0;
                                    while (i3 < i2) {
                                        cArr2 = this.buf;
                                        c2 = cArr2[i3];
                                        int i13 = i4 + 1;
                                        cArr[i4] = c2;
                                        if (c2 == '\"') {
                                            i5 = i3 + 1;
                                            if (cArr2[i5] == '\"') {
                                                i3 = i5;
                                            }
                                        }
                                        i3++;
                                        i4 = i13;
                                    }
                                    if (type != null || type == String.class || type == Object.class || z) {
                                        str2 = new String(cArr);
                                    } else {
                                        try {
                                            str2 = readValue(cArr, 0, i12, type);
                                        } catch (Exception e) {
                                            str2 = error(i9, e);
                                        }
                                    }
                                } else if (type != null || type == String.class || type == Object.class || z) {
                                    str2 = new String(cArr3, i7 + 1, i8);
                                } else {
                                    try {
                                        str2 = readValue(cArr3, i7 + 1, i8, type);
                                    } catch (Exception e2) {
                                        str2 = error(i9, e2);
                                    }
                                }
                            } else if (type == null && type != String.class && type != Object.class && !z) {
                                try {
                                    str2 = readValue(cArr3, i7, i8, type);
                                } catch (Exception e3) {
                                    str2 = error(i9, e3);
                                }
                            } else if (i8 == 1) {
                                str2 = TypeUtils.toString(cArr3[i7]);
                            } else if (i8 == 2) {
                                str2 = TypeUtils.toString(cArr3[i7], cArr3[i7 + 1]);
                            } else {
                                str2 = new String(cArr3, i7, i8);
                            }
                            if (objArr != null) {
                                if (arrayList == 0) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(str2);
                                r10 = arrayList;
                            } else if (i9 < objArr.length) {
                                r10 = arrayList;
                                objArr[i9] = str2;
                                r10 = arrayList;
                            }
                            r10 = arrayList;
                            i9++;
                            i7 = i6 + 1;
                            z2 = false;
                            i8 = 0;
                            i10 = 0;
                            arrayList = r10;
                        } else {
                            i8++;
                            arrayList = arrayList;
                        }
                    } else {
                        i8++;
                    }
                } else if (c3 == '\"') {
                    z2 = true;
                } else {
                    c = c3;
                    i6 = i6;
                    if (c == ',') {
                        typeArr = this.types;
                        if (typeArr != null) {
                            type = null;
                        } else {
                            type = null;
                        }
                        if (z2) {
                            if (i10 == 0) {
                                int i14 = i8 - i10;
                                cArr = new char[i14];
                                i2 = i8 + i7;
                                i3 = i7 + 1;
                                i4 = 0;
                                while (i3 < i2) {
                                    cArr2 = this.buf;
                                    c2 = cArr2[i3];
                                    int i15 = i4 + 1;
                                    cArr[i4] = c2;
                                    if (c2 == '\"') {
                                        i5 = i3 + 1;
                                        if (cArr2[i5] == '\"') {
                                            i3 = i5;
                                        }
                                    }
                                    i3++;
                                    i4 = i15;
                                }
                                if (type != null) {
                                    str2 = new String(cArr);
                                } else {
                                    str2 = new String(cArr);
                                }
                            } else if (type != null) {
                                str2 = new String(cArr3, i7 + 1, i8);
                            } else {
                                str2 = new String(cArr3, i7 + 1, i8);
                            }
                        } else if (type == null) {
                            if (i8 == 1) {
                                str2 = TypeUtils.toString(cArr3[i7]);
                            } else if (i8 == 2) {
                                str2 = TypeUtils.toString(cArr3[i7], cArr3[i7 + 1]);
                            } else {
                                str2 = new String(cArr3, i7, i8);
                            }
                        } else if (i8 == 1) {
                            str2 = TypeUtils.toString(cArr3[i7]);
                        } else if (i8 == 2) {
                            str2 = TypeUtils.toString(cArr3[i7], cArr3[i7 + 1]);
                        } else {
                            str2 = new String(cArr3, i7, i8);
                        }
                        if (objArr != null) {
                            if (arrayList == 0) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(str2);
                            r10 = arrayList;
                        } else if (i9 < objArr.length) {
                            r10 = arrayList;
                            objArr[i9] = str2;
                            r10 = arrayList;
                        }
                        r10 = arrayList;
                        i9++;
                        i7 = i6 + 1;
                        z2 = false;
                        i8 = 0;
                        i10 = 0;
                        arrayList = r10;
                    } else {
                        i8++;
                        arrayList = arrayList;
                    }
                }
                i6++;
                arrayList = arrayList;
            }
            if (i8 > 0 || z2) {
                Type[] typeArr2 = this.types;
                Type type2 = (typeArr2 == null || i9 >= typeArr2.length) ? null : typeArr2[i9];
                if (z2) {
                    if (i10 == 0) {
                        str = (type2 == null || type2 == String.class || type2 == Object.class || z) ? new String(this.buf, i7 + 1, i8) : readValue(this.buf, i7 + 1, i8, type2);
                    } else {
                        int i16 = i8 - i10;
                        char[] cArr4 = new char[i16];
                        int i17 = i7 + 1;
                        int i18 = 0;
                        while (i17 < i) {
                            char[] cArr5 = this.buf;
                            char c5 = cArr5[i17];
                            int i19 = i18 + 1;
                            cArr4[i18] = c5;
                            if (c5 == '\"') {
                                int i20 = i17 + 1;
                                if (cArr5[i20] == '\"') {
                                    i17 = i20;
                                }
                            }
                            i17++;
                            i18 = i19;
                        }
                        if (type2 == null || type2 == String.class || type2 == Object.class || z) {
                            str = new String(cArr4);
                        } else {
                            try {
                                str = readValue(cArr4, 0, i16, type2);
                            } catch (Exception e4) {
                                str = error(i9, e4);
                            }
                        }
                    }
                } else if (type2 != null && type2 != String.class && type2 != Object.class && !z) {
                    try {
                        str = readValue(this.buf, i7, i8, type2);
                    } catch (Exception e5) {
                        str = error(i9, e5);
                    }
                } else if (i8 == 1) {
                    str = TypeUtils.toString(this.buf[i7]);
                } else if (i8 == 2) {
                    char[] cArr6 = this.buf;
                    str = TypeUtils.toString(cArr6[i7], cArr6[i7 + 1]);
                } else {
                    str = new String(this.buf, i7, i8);
                }
                if (objArr == null) {
                    if (arrayList == 0) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(str);
                } else if (i9 < objArr.length) {
                    objArr[i9] = str;
                }
            }
            if (objArr == null && arrayList != 0) {
                objArr = z ? new String[arrayList.size()] : new Object[arrayList.size()];
                arrayList.toArray(objArr);
            }
            if (this.input == null && this.off == this.end) {
                this.inputEnd = true;
            }
            return objArr;
        } catch (IOException e6) {
            throw new JSONException("seekLine error", e6);
        }
    }

    public Object readValue(char[] cArr, int i, int i2, Type type) {
        if (i2 == 0) {
            return null;
        }
        if (type == Integer.class) {
            return Integer.valueOf(TypeUtils.parseInt(cArr, i, i2));
        }
        if (type == Long.class) {
            return Long.valueOf(TypeUtils.parseLong(cArr, i, i2));
        }
        if (type == BigDecimal.class) {
            return TypeUtils.parseBigDecimal(cArr, i, i2);
        }
        if (type == Float.class) {
            return Float.valueOf(TypeUtils.parseFloat(cArr, i, i2));
        }
        if (type == Double.class) {
            return Double.valueOf(TypeUtils.parseDouble(cArr, i, i2));
        }
        if (type == Date.class) {
            return new Date(DateUtils.parseMillis(cArr, i, i2, DateUtils.DEFAULT_ZONE_ID));
        }
        return type == Boolean.class ? TypeUtils.parseBoolean(cArr, i, i2) : TypeUtils.cast(new String(cArr, i, i2), type);
    }

    @Override // com.alibaba.fastjson2.stream.StreamReader
    public boolean seekLine() throws IOException {
        int i;
        Reader reader;
        char[] cArr = this.buf;
        int i2 = this.off;
        if (cArr == null && (reader = this.input) != null) {
            cArr = new char[524288];
            this.buf = cArr;
            int i3 = reader.read(cArr);
            if (i3 == -1) {
                this.inputEnd = true;
                return false;
            }
            this.end = i3;
        }
        int i4 = 0;
        while (true) {
            if (i4 < 3) {
                this.lineTerminated = false;
                i = this.end;
                int i5 = i2;
                while (true) {
                    int i6 = i5 + 4;
                    if (i6 >= i || CSVReaderUTF8.containsQuoteOrLineSeparator(IOUtils.getLongUnaligned(cArr, i5))) {
                        break;
                    }
                    i5 = i6;
                }
                while (i5 < i) {
                    char c = cArr[i5];
                    if (c == '\"') {
                        int i7 = this.lineSize;
                        this.lineSize = i7 + 1;
                        if (this.quote) {
                            int i8 = i5 + 1;
                            if (i8 >= i) {
                                break;
                            }
                            if (cArr[i8] == '\"') {
                                this.lineSize = i7 + 2;
                                i5 = i8;
                            } else {
                                this.quote = false;
                            }
                        } else {
                            this.quote = true;
                        }
                        i5++;
                    } else {
                        if (this.quote) {
                            this.lineSize++;
                        } else {
                            if (c == '\n') {
                                if (this.lineSize > 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                                    this.rowCount++;
                                }
                                this.lineTerminated = true;
                                this.lineSize = 0;
                                this.lineEnd = i5;
                                this.lineStart = this.lineNextStart;
                                i2 = i5 + 1;
                                this.lineNextStart = i2;
                                break;
                            }
                            if (c == '\r') {
                                if (this.lineSize > 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                                    this.rowCount++;
                                }
                                this.lineTerminated = true;
                                this.lineSize = 0;
                                this.lineEnd = i5;
                                int i9 = i5 + 1;
                                if (i9 >= i) {
                                    break;
                                }
                                if (cArr[i9] == '\n') {
                                    i5 = i9;
                                }
                                this.lineStart = this.lineNextStart;
                                i2 = i5 + 1;
                                this.lineNextStart = i2;
                                break;
                            }
                            this.lineSize++;
                        }
                        i5++;
                    }
                }
                if (!this.lineTerminated) {
                    if (this.input != null && !this.inputEnd) {
                        int i10 = i - i2;
                        if (i2 > 0) {
                            if (i10 > 0) {
                                System.arraycopy(cArr, i2, cArr, 0, i10);
                            }
                            this.lineNextStart = 0;
                            this.lineStart = 0;
                            this.quote = false;
                            i2 = 0;
                            i = i10;
                        }
                        int i11 = this.input.read(cArr, i, cArr.length - i);
                        if (i11 == -1) {
                            this.inputEnd = true;
                            if (i2 == i) {
                                this.off = i2;
                                return false;
                            }
                        } else {
                            this.end = i + i11;
                            i4++;
                        }
                    }
                    this.lineStart = this.lineNextStart;
                    this.lineEnd = i;
                    this.rowCount++;
                    this.lineSize = 0;
                    i2 = i;
                    break;
                }
                break;
            }
            this.off = i2;
            return true;
        }
        this.lineTerminated = i2 == i;
        this.off = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public void statAll() {
        readAll(new C0019(this, 0), Integer.MAX_VALUE);
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public void statAll(int i) {
        readAll(new C0019(this, 1), i);
    }

    public CSVReaderUTF16(Reader reader, Class<T> cls) {
        super(cls);
        this.input = reader;
    }

    @Override // com.alibaba.fastjson2.support.csv.CSVReader
    public void readAll(int i) {
        CharArrayValueConsumer<T> charArrayValueConsumer = this.valueConsumer;
        if (charArrayValueConsumer != null) {
            readAll(charArrayValueConsumer, i);
            return;
        }
        throw new JSONException("unsupported operation, consumer is null");
    }

    public CSVReaderUTF16(Reader reader, CharArrayValueConsumer charArrayValueConsumer) {
        this.valueConsumer = charArrayValueConsumer;
        this.input = reader;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x009e A[SYNTHETIC] */
    public void readAll(CharArrayValueConsumer<T> charArrayValueConsumer, int i) {
        int i2;
        int i3;
        int i4;
        char[] cArr;
        int i5;
        int i6;
        int i7;
        char[] cArr2;
        char c;
        int i8;
        CharArrayValueConsumer<T> charArrayValueConsumer2 = charArrayValueConsumer;
        charArrayValueConsumer2.start();
        int i9 = 0;
        while (true) {
            if (i9 >= i && i >= 0) {
                break;
            }
            try {
                if (this.inputEnd || ((this.input == null && this.off >= this.end) || !seekLine())) {
                    break;
                    break;
                    break;
                }
                charArrayValueConsumer2.beforeRow(this.rowCount);
                int i10 = this.lineStart;
                int i11 = i10;
                boolean z = false;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i2 = this.lineEnd;
                    i3 = i12;
                    if (i10 >= i2) {
                        break;
                    }
                    char[] cArr3 = this.buf;
                    char c2 = cArr3[i10];
                    if (z) {
                        if (c2 == '\"') {
                            int i15 = i10 + 1;
                            if (i15 >= i2) {
                                if (i15 == i2) {
                                    break;
                                }
                            } else {
                                char c3 = cArr3[i15];
                                if (c3 == '\"') {
                                    i13 += 2;
                                    i12 = i3 + 1;
                                    i10 = i15;
                                } else if (c3 == ',') {
                                    c2 = c3;
                                    i10 = i15;
                                }
                            }
                            i4 = i10;
                            if (c2 == ',') {
                                if (z) {
                                    charArrayValueConsumer.accept(this.rowCount, i14, cArr3, i11, i13);
                                } else if (i3 == 0) {
                                    charArrayValueConsumer2.accept(this.rowCount, i14, cArr3, i11 + 1, i13);
                                } else {
                                    int i16 = i14;
                                    int i17 = i13 - i3;
                                    cArr = new char[i17];
                                    i5 = i13 + i11;
                                    i6 = i11 + 1;
                                    i7 = 0;
                                    while (i6 < i5) {
                                        cArr2 = this.buf;
                                        c = cArr2[i6];
                                        int i18 = i7 + 1;
                                        cArr[i7] = c;
                                        if (c == '\"') {
                                            i8 = i6 + 1;
                                            if (cArr2[i8] == '\"') {
                                                i6 = i8;
                                            }
                                        }
                                        i6++;
                                        i7 = i18;
                                    }
                                    charArrayValueConsumer.accept(this.rowCount, i16, cArr, 0, i17);
                                    i14 = i16;
                                }
                                i14++;
                                i11 = i4 + 1;
                                i10 = i4;
                                z = false;
                                i12 = 0;
                                i13 = 0;
                            } else {
                                i13++;
                                i10 = i4;
                                i12 = i3;
                            }
                        } else {
                            i13++;
                            i12 = i3;
                        }
                    } else if (c2 == '\"') {
                        i12 = i3;
                        z = true;
                    } else {
                        i4 = i10;
                        if (c2 == ',') {
                            if (z) {
                                charArrayValueConsumer.accept(this.rowCount, i14, cArr3, i11, i13);
                            } else if (i3 == 0) {
                                charArrayValueConsumer2.accept(this.rowCount, i14, cArr3, i11 + 1, i13);
                            } else {
                                int i19 = i14;
                                int i110 = i13 - i3;
                                cArr = new char[i110];
                                i5 = i13 + i11;
                                i6 = i11 + 1;
                                i7 = 0;
                                while (i6 < i5) {
                                    cArr2 = this.buf;
                                    c = cArr2[i6];
                                    int i111 = i7 + 1;
                                    cArr[i7] = c;
                                    if (c == '\"') {
                                        i8 = i6 + 1;
                                        if (cArr2[i8] == '\"') {
                                            i6 = i8;
                                        }
                                    }
                                    i6++;
                                    i7 = i111;
                                }
                                charArrayValueConsumer.accept(this.rowCount, i19, cArr, 0, i110);
                                i14 = i19;
                            }
                            i14++;
                            i11 = i4 + 1;
                            i10 = i4;
                            z = false;
                            i12 = 0;
                            i13 = 0;
                        } else {
                            i13++;
                            i10 = i4;
                            i12 = i3;
                        }
                    }
                    i10++;
                    charArrayValueConsumer2 = charArrayValueConsumer;
                }
                if (i13 <= 0) {
                    charArrayValueConsumer2 = charArrayValueConsumer;
                } else if (!z) {
                    charArrayValueConsumer2 = charArrayValueConsumer;
                    charArrayValueConsumer2.accept(this.rowCount, i14, this.buf, i11, i13);
                } else if (i3 == 0) {
                    charArrayValueConsumer2 = charArrayValueConsumer;
                    charArrayValueConsumer2.accept(this.rowCount, i14, this.buf, i11 + 1, i13);
                } else {
                    int i20 = i14;
                    int i21 = i13 - i3;
                    char[] cArr4 = new char[i21];
                    int i22 = i11 + 1;
                    int i23 = 0;
                    while (i22 < i2) {
                        char[] cArr5 = this.buf;
                        char c4 = cArr5[i22];
                        int i24 = i23 + 1;
                        cArr4[i23] = c4;
                        if (c4 == '\"') {
                            int i25 = i22 + 1;
                            if (cArr5[i25] == '\"') {
                                i22 = i25;
                            }
                        }
                        i22++;
                        i23 = i24;
                    }
                    charArrayValueConsumer2 = charArrayValueConsumer;
                    charArrayValueConsumer2.accept(this.rowCount, i20, cArr4, 0, i21);
                }
                charArrayValueConsumer2.afterRow(this.rowCount);
                i9++;
            } catch (IOException e) {
                throw new JSONException("seekLine error", e);
            }
        }
        charArrayValueConsumer2.end();
    }

    public CSVReaderUTF16(Reader reader, Type[] typeArr) {
        super(typeArr);
        this.input = reader;
    }

    public CSVReaderUTF16(char[] cArr, int i, int i2, Class<T> cls) {
        super(cls);
        this.buf = cArr;
        this.off = i;
        this.end = i + i2;
    }

    public CSVReaderUTF16(char[] cArr, int i, int i2, CharArrayValueConsumer charArrayValueConsumer) {
        this.valueConsumer = charArrayValueConsumer;
        this.buf = cArr;
        this.off = i;
        this.end = i + i2;
    }

    public CSVReaderUTF16(char[] cArr, int i, int i2, Type[] typeArr) {
        super(typeArr);
        this.buf = cArr;
        this.off = i;
        this.end = i + i2;
    }
}
