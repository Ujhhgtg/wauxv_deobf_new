package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.JodaSupport;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.zip.GZIPOutputStream;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldWriter<T> implements Comparable {
    static final AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> initObjectWriterUpdater = AtomicReferenceFieldUpdater.newUpdater(FieldWriter.class, ObjectWriter.class, "initObjectWriter");
    final boolean backReference;
    public final DecimalFormat decimalFormat;
    Object defaultValue;
    public final long features;
    public final Field field;
    public final Class fieldClass;
    final boolean fieldClassSerializable;
    public final String fieldName;
    protected final long fieldOffset;
    public final Type fieldType;
    public final String format;
    protected Function function;
    final long hashCode;
    volatile ObjectWriter initObjectWriter;
    public final String label;
    public final Locale locale;
    final boolean managedReference;
    public final Method method;
    final byte[] nameJSONB;
    long nameSymbolCache;
    final char[] nameWithColonUTF16;
    final byte[] nameWithColonUTF8;
    public final int ordinal;
    transient JSONWriter.Path path;
    protected final boolean primitive;
    protected final PropertyAccessor propertyAccessor;
    final boolean raw;
    final JSONWriter.Path rootParentPath;
    final boolean symbol;
    final boolean trim;

    public FieldWriter(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        this(str, i, j, str2, locale, str3, type, cls, field, method, null);
    }

    private static PropertyAccessor createPropertyAccessor(String str, Type type, Class cls, Field field, Method method, Object obj) {
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        if (obj instanceof Function) {
            return propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) obj, (BiConsumer) null);
        }
        if (obj instanceof Predicate) {
            return propertyAccessorFactory.create(str, (Predicate) obj, (ObjBoolConsumer) null);
        }
        if (obj instanceof ToFloatFunction) {
            return propertyAccessorFactory.create(str, (ToFloatFunction) obj, (ObjFloatConsumer) null);
        }
        if (obj instanceof ToDoubleFunction) {
            return propertyAccessorFactory.create(str, (ToDoubleFunction) obj, (ObjDoubleConsumer) null);
        }
        if (obj instanceof ToCharFunction) {
            return propertyAccessorFactory.create(str, (ToCharFunction) obj, (ObjCharConsumer) null);
        }
        if (obj instanceof ToIntFunction) {
            return propertyAccessorFactory.create(str, (ToIntFunction) obj, (ObjIntConsumer) null);
        }
        if (obj instanceof ToByteFunction) {
            return propertyAccessorFactory.create(str, (ToByteFunction) obj, (ObjByteConsumer) null);
        }
        if (obj instanceof ToShortFunction) {
            return propertyAccessorFactory.create(str, (ToShortFunction) obj, (ObjShortConsumer) null);
        }
        if (obj instanceof ToLongFunction) {
            return propertyAccessorFactory.create(str, (ToLongFunction) obj, (ObjLongConsumer) null);
        }
        if (method != null) {
            return propertyAccessorFactory.create(method);
        }
        if (field != null) {
            return propertyAccessorFactory.create(field);
        }
        return null;
    }

    private boolean writeFieldNameSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j = this.nameSymbolCache;
        if (j == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode == -1) {
            return false;
        }
        jSONWriter.writeSymbol(-ordinalByHashCode);
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        JSONField jSONField;
        JSONField jSONField2;
        Field field;
        Field field2;
        FieldWriter fieldWriter = (FieldWriter) obj;
        int i = this.ordinal;
        int i2 = fieldWriter.ordinal;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int iCompareTo = this.fieldName.compareTo(fieldWriter.fieldName);
        if (iCompareTo == 0) {
            Member member = (this.method == null || ((field2 = this.field) != null && Modifier.isPublic(field2.getModifiers()))) ? this.field : this.method;
            Member member2 = (fieldWriter.method == null || ((field = fieldWriter.field) != null && Modifier.isPublic(field.getModifiers()))) ? fieldWriter.field : fieldWriter.method;
            if (member != null && member2 != null) {
                Class<?> declaringClass = member2.getDeclaringClass();
                Class<?> declaringClass2 = member.getDeclaringClass();
                if (declaringClass2 != declaringClass) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        return 1;
                    }
                    if (declaringClass.isAssignableFrom(declaringClass2)) {
                        return -1;
                    }
                }
                if (member instanceof Field) {
                    jSONField = (JSONField) ((Field) member).getAnnotation(JSONField.class);
                } else {
                    jSONField = true ? (JSONField) ((Method) member).getAnnotation(JSONField.class) : null;
                }
                if (member2 instanceof Field) {
                    jSONField2 = (JSONField) ((Field) member2).getAnnotation(JSONField.class);
                } else {
                    jSONField2 = member instanceof Method ? (JSONField) ((Method) member2).getAnnotation(JSONField.class) : null;
                }
                if (jSONField != null && jSONField2 == null) {
                    return -1;
                }
                if (jSONField == null && jSONField2 != null) {
                    return 1;
                }
            }
            if ((member instanceof Field) && (member2 instanceof Method) && ((Field) member).getType() == ((Method) member2).getReturnType()) {
                return -1;
            }
            boolean z = member instanceof Method;
            if (z && (member2 instanceof Field) && ((Method) member).getReturnType() == ((Field) member2).getType()) {
                return 1;
            }
            Class cls = fieldWriter.fieldClass;
            Class<?> cls2 = this.fieldClass;
            if (cls2 != cls && cls2 != null && cls != null) {
                if (cls2.isAssignableFrom(cls)) {
                    return 1;
                }
                if (cls.isAssignableFrom(cls2)) {
                    return -1;
                }
            }
            Class cls3 = Boolean.TYPE;
            if (cls2 == cls3 && cls != cls3) {
                return 1;
            }
            if (cls2 == Boolean.class && cls == Boolean.class && z && (member2 instanceof Method)) {
                String name = ((Method) member).getName();
                String name2 = ((Method) member2).getName();
                if (name.startsWith("is") && name2.startsWith("get")) {
                    return 1;
                }
                if (name.startsWith("get") && name2.startsWith("is")) {
                    return -1;
                }
            }
            if (z && (member2 instanceof Method)) {
                String name3 = ((Method) member).getName();
                String name4 = ((Method) member2).getName();
                if (!name3.equals(name4)) {
                    String str = BeanUtils.getterName(name3, (String) null);
                    String str2 = BeanUtils.getterName(name4, (String) null);
                    if (this.fieldName.equals(str) && !fieldWriter.fieldName.equals(str2)) {
                        return 1;
                    }
                    if (this.fieldName.equals(str2) && !fieldWriter.fieldName.equals(str)) {
                        return -1;
                    }
                }
            }
            if (cls2.isPrimitive() && !cls.isPrimitive()) {
                return -1;
            }
            if (!cls2.isPrimitive() && cls.isPrimitive()) {
                return 1;
            }
            if (cls2.getName().startsWith("java.") && !cls.getName().startsWith("java.")) {
                return -1;
            }
            if (!cls2.getName().startsWith("java.") && cls.getName().startsWith("java.")) {
                return 1;
            }
            Method method = this.method;
            if (method != null && fieldWriter.method == null) {
                return -1;
            }
            if (method == null && fieldWriter.method != null) {
                return 1;
            }
        }
        return iCompareTo;
    }

    public JSONException errorOnGet(Throwable th) {
        return new JSONException("field.get error, " + this.fieldName, th);
    }

    public Object getFieldValue(T t) {
        try {
            return this.propertyAccessor.getObject(t);
        } catch (Throwable th) {
            throw errorOnGet(th);
        }
    }

    public Function getFunction() {
        return this.function;
    }

    public ObjectWriter getInitWriter() {
        return null;
    }

    public Class getItemClass() {
        return null;
    }

    public Type getItemType() {
        return null;
    }

    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        return jSONWriter.getObjectWriter(type, (Class) null);
    }

    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (cls == Float[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, this.decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY;
        }
        if (cls == Double[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, this.decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY;
        }
        if (cls == BigDecimal[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(BigDecimal.class, this.decimalFormat) : ObjectWriterArrayFinal.DECIMAL_ARRAY;
        }
        return jSONWriter.getObjectWriter(cls);
    }

    public final JSONWriter.Path getPath(JSONWriter.Path path) {
        JSONWriter.Path path2 = this.path;
        if (path2 != null) {
            return path2.parent == path ? path2 : new JSONWriter.Path(path, this.fieldName);
        }
        JSONWriter.Path path3 = new JSONWriter.Path(path, this.fieldName);
        this.path = path3;
        return path3;
    }

    public final JSONWriter.Path getRootParentPath() {
        return this.rootParentPath;
    }

    public boolean isDateFormatISO8601() {
        return false;
    }

    public boolean isDateFormatMillis() {
        return false;
    }

    public boolean isFieldClassSerializable() {
        return this.fieldClassSerializable;
    }

    public boolean isRefDetect(Object obj, long j) {
        long j2 = j | this.features;
        return ((JSONWriter.Feature.ReferenceDetection.mask & j2) == 0 || (j2 & 144115188075855872L) != 0 || obj == null || ObjectWriterProvider.isNotReferenceDetect(obj.getClass())) ? false : true;
    }

    public void setDefaultValue(T t) {
        Object obj;
        if (Iterable.class.isAssignableFrom(this.fieldClass) || Map.class.isAssignableFrom(this.fieldClass)) {
            return;
        }
        Field field = this.field;
        if (field == null || t == null) {
            obj = null;
        } else {
            try {
                field.setAccessible(true);
                obj = this.field.get(t);
            } catch (Throwable unused) {
                obj = null;
            }
        }
        if (obj == null) {
            return;
        }
        Class cls = this.fieldClass;
        if (cls == Boolean.TYPE) {
            if (obj.equals(Boolean.FALSE)) {
                return;
            }
        } else if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE) {
            if (((Number) obj).doubleValue() == 0.0d) {
                return;
            }
        } else if (cls == Character.TYPE && ((Character) obj).charValue() == 0) {
            return;
        }
        this.defaultValue = obj;
    }

    public String toString() {
        return this.fieldName;
    }

    public boolean unwrapped() {
        return false;
    }

    public abstract boolean write(JSONWriter jSONWriter, T t);

    public void writeBinary(JSONWriter jSONWriter, byte[] bArr) {
        if (bArr == null) {
            if (jSONWriter.isWriteNulls()) {
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull();
                return;
            }
            return;
        }
        writeFieldName(jSONWriter);
        if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(bArr);
            return;
        }
        if ("base64".equals(this.format) || (this.format == null && (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0)) {
            jSONWriter.writeBase64(bArr);
            return;
        }
        if ("hex".equals(this.format)) {
            jSONWriter.writeHex(bArr);
            return;
        }
        if (!"gzip,base64".equals(this.format) && !"gzip".equals(this.format)) {
            jSONWriter.writeBinary(bArr);
            return;
        }
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                IOUtils.close(gZIPOutputStream);
                jSONWriter.writeBase64(byteArray);
            } catch (IOException e) {
                throw new JSONException("write gzipBytes error", e);
            }
        } catch (Throwable th) {
            IOUtils.close(gZIPOutputStream);
            throw th;
        }
    }

    public void writeBool(JSONWriter jSONWriter, boolean z) {
        throw new UnsupportedOperationException();
    }

    public void writeDate(JSONWriter jSONWriter, boolean z, Date date) {
        if (date != null) {
            writeDate(jSONWriter, z, date.getTime());
            return;
        }
        if (z) {
            writeFieldName(jSONWriter);
        }
        jSONWriter.writeNull();
    }

    public void writeDouble(JSONWriter jSONWriter, double d) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(d, decimalFormat);
        } else if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(d));
        } else {
            jSONWriter.writeDouble(d);
        }
    }

    public void writeEnum(JSONWriter jSONWriter, Enum r2) {
        writeFieldName(jSONWriter);
        jSONWriter.writeEnum(r2);
    }

    public void writeEnumJSONB(JSONWriter jSONWriter, Enum r2) {
        throw new UnsupportedOperationException();
    }

    public int writeEnumValueJSONB(byte[] bArr, int i, Enum r3, SymbolTable symbolTable, long j) {
        throw new UnsupportedOperationException();
    }

    public final void writeFieldName(JSONWriter jSONWriter) {
        if (jSONWriter.jsonb) {
            SymbolTable symbolTable = jSONWriter.symbolTable;
            if (symbolTable == null || !writeFieldNameSymbol(jSONWriter, symbolTable)) {
                jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
                return;
            }
            return;
        }
        if (!jSONWriter.useSingleQuote && (jSONWriter.context.getFeatures() & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.utf8) {
                jSONWriter.writeNameRaw(this.nameWithColonUTF8);
                return;
            } else if (jSONWriter.utf16) {
                jSONWriter.writeNameRaw(this.nameWithColonUTF16);
                return;
            }
        }
        jSONWriter.writeName(this.fieldName);
        jSONWriter.writeColon();
    }

    public final void writeFieldNameJSONB(JSONWriter jSONWriter) {
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !writeFieldNameSymbol(jSONWriter, symbolTable)) {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
    }

    public void writeFloat(JSONWriter jSONWriter, float f) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(f, decimalFormat);
        } else if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(f));
        } else {
            jSONWriter.writeFloat(f);
        }
    }

    public final boolean writeFloatNull(JSONWriter jSONWriter) {
        long features = jSONWriter.getFeatures(this.features);
        long j = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j2 = j | JSONWriter.Feature.NullAsDefaultValue.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j2 | JSONWriter.Feature.WriteNullNumberAsZero.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((features & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullNumberAsZero.mask)) != 0) {
            jSONWriter.writeFloat(0.0f);
            return true;
        }
        jSONWriter.writeNull();
        return true;
    }

    public void writeInt16(JSONWriter jSONWriter, short[] sArr) {
        if (sArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(sArr);
            } else {
                jSONWriter.writeInt16(sArr);
            }
        }
    }

    public void writeInt32(JSONWriter jSONWriter, int i) {
        writeFieldName(jSONWriter);
        jSONWriter.writeInt32(i);
    }

    public void writeInt64(JSONWriter jSONWriter, long j) {
        writeFieldName(jSONWriter);
        if (JSONWriter.isWriteAsString(j, this.features)) {
            jSONWriter.writeString(j);
        } else {
            jSONWriter.writeInt64(j);
        }
    }

    public final boolean writeIntNull(JSONWriter jSONWriter) {
        long features = this.features | jSONWriter.getFeatures();
        long j = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j2 = j | JSONWriter.Feature.NullAsDefaultValue.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j2 | JSONWriter.Feature.WriteNullNumberAsZero.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((features & (JSONWriter.Feature.WriteNullNumberAsZero.mask | JSONWriter.Feature.NullAsDefaultValue.mask)) != 0) {
            jSONWriter.writeInt32(0);
            return true;
        }
        jSONWriter.writeNull();
        return true;
    }

    public void writeList(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListStr(JSONWriter jSONWriter, boolean z, List<String> list) {
        throw new UnsupportedOperationException();
    }

    public void writeListValue(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListValueJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeString(JSONWriter jSONWriter, String str) {
        writeFieldName(jSONWriter);
        if (str == null && (this.features & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
            jSONWriter.writeString("");
            return;
        }
        if (this.trim && str != null) {
            str = str.trim();
        }
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(str);
        } else if (this.raw) {
            jSONWriter.writeRaw(str);
        } else {
            jSONWriter.writeString(str);
        }
    }

    public abstract void writeValue(JSONWriter jSONWriter, T t);

    public FieldWriter(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        char c;
        long j2 = (!"string".equals(str2) || cls == String.class) ? j : j | JSONWriter.Feature.WriteNonStringValueAsString.mask;
        this.fieldName = str;
        this.ordinal = i;
        this.format = str2;
        this.locale = locale;
        this.label = str3;
        this.hashCode = Fnv.hashCode64(str);
        this.features = j2;
        this.fieldType = TypeUtils.intern(type);
        this.fieldClass = cls;
        this.fieldClassSerializable = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.field = field;
        this.method = method;
        this.primitive = cls.isPrimitive();
        this.nameJSONB = JSONB.toBytes(str);
        this.decimalFormat = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.fieldOffset = field != null ? JDKUtils.UNSAFE.objectFieldOffset(field) : -1L;
        this.symbol = "symbol".equals(str2);
        this.trim = "trim".equals(str2);
        this.raw = (1125899906842624L & j2) != 0;
        this.managedReference = (JSONWriter.Feature.ReferenceDetection.mask & j2) != 0;
        this.backReference = (j2 & 2305843009213693952L) != 0;
        this.rootParentPath = new JSONWriter.Path(JSONWriter.Path.ROOT, str);
        int length = str.length();
        int i2 = length + 3;
        int i3 = i2;
        int i4 = 0;
        while (true) {
            c = 2047;
            if (i4 >= length) {
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                i3 = cCharAt > 2047 ? i3 + 2 : i3 + 1;
            }
            i4++;
        }
        byte[] bArr = new byte[i3];
        char c2 = '\"';
        bArr[0] = 34;
        int i5 = 0;
        int i6 = 1;
        while (i5 < length) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i6] = (byte) cCharAt2;
                i6++;
            } else if (cCharAt2 > 2047) {
                bArr[i6] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                int i7 = i6 + 2;
                bArr[i6 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i6 += 3;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i6 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            }
            i5++;
            c2 = 34;
            c = 2047;
        }
        byte b = 34;
        bArr[i6] = 34;
        bArr[i6 + 1] = 58;
        this.nameWithColonUTF8 = bArr;
        char[] cArr = new char[i2];
        cArr[0] = 34;
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = 34;
        cArr[length + 2] = ':';
        this.nameWithColonUTF16 = cArr;
        this.propertyAccessor = createPropertyAccessor(str, type, cls, field, method, obj);
        if (obj instanceof Function) {
            this.function = (Function) obj;
        }
    }

    public void writeBool(JSONWriter jSONWriter, boolean[] zArr) {
        if (zArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(zArr);
            } else {
                jSONWriter.writeBool(zArr);
            }
        }
    }

    public void writeDate(JSONWriter jSONWriter, long j) {
        writeDate(jSONWriter, true, j);
    }

    public final int writeFieldNameJSONB(byte[] bArr, int i) {
        byte[] bArr2 = this.nameJSONB;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return i + this.nameJSONB.length;
    }

    public void writeDate(JSONWriter jSONWriter, boolean z, long j) {
        long j2;
        long j3;
        if (jSONWriter.jsonb) {
            jSONWriter.writeMillis(j);
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        if (!isDateFormatMillis() && !context.isDateFormatMillis()) {
            ZoneId zoneId = context.getZoneId();
            if (context.getDateFormat() == null) {
                Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
                long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneId.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
                long jFloorDiv = Math.floorDiv(epochSecond, 86400L);
                int iFloorMod = (int) Math.floorMod(epochSecond, 86400L);
                long j4 = 719468 + jFloorDiv;
                if (j4 < 0) {
                    long j5 = ((jFloorDiv + 719469) / 146097) - 1;
                    j2 = j4 + ((-j5) * 146097);
                    j3 = j5 * 400;
                } else {
                    j2 = j4;
                    j3 = 0;
                }
                long j6 = ((j2 * 400) + 591) / 146097;
                long jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (j6 * 365)) - (j6 / 100), j2);
                if (jM4737 < 0) {
                    j6--;
                    jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (365 * j6)) - (j6 / 100), j2);
                }
                long j7 = j6 + j3;
                int i = (int) jM4737;
                int i2 = ((i * 5) + 2) / 153;
                int i3 = ((i2 + 2) % 12) + 1;
                int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
                int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(j7 + ((long) (i2 / 10)));
                long j8 = iFloorMod;
                ChronoField.SECOND_OF_DAY.checkValidValue(j8);
                int i5 = (int) (j8 / 3600);
                long j9 = j8 - ((long) (i5 * 3600));
                int i6 = (int) (j9 / 60);
                int i7 = (int) (j9 - ((long) (i6 * 60)));
                if (z) {
                    writeFieldName(jSONWriter);
                }
                jSONWriter.writeDateTime19(iCheckValidIntValue, i3, i4, i5, i6, i7);
                return;
            }
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), zoneId);
            if (!isDateFormatISO8601() && !context.isDateFormatISO8601()) {
                String str = context.getDateFormatter().format(zonedDateTimeOfInstant);
                if (z) {
                    writeFieldName(jSONWriter);
                }
                jSONWriter.writeString(str);
                return;
            }
            jSONWriter.writeDateTimeISO8601(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        if (z) {
            writeFieldName(jSONWriter);
        }
        jSONWriter.writeInt64(j);
    }

    public final int writeFieldNameJSONB(byte[] bArr, int i, JSONWriter jSONWriter) {
        return JSONB.IO.writeNameRaw(bArr, i, this.nameJSONB, this.hashCode, jSONWriter);
    }

    public void writeDouble(JSONWriter jSONWriter, double[] dArr) {
        if (dArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(dArr);
            } else {
                jSONWriter.writeDouble(dArr);
            }
        }
    }

    public void writeFloat(JSONWriter jSONWriter, float[] fArr) {
        if (fArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(fArr);
            } else {
                jSONWriter.writeFloat(fArr);
            }
        }
    }

    public int writeFieldNameSymbol(SymbolTable symbolTable) {
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j = this.nameSymbolCache;
        if (j == 0) {
            int ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            return ordinalByHashCode;
        }
        if (((int) j) == iIdentityHashCode) {
            return (int) (j >> 32);
        }
        int ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
        this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
        return ordinalByHashCode2;
    }

    public void writeString(JSONWriter jSONWriter, char[] cArr) {
        if (cArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if (cArr == null) {
                jSONWriter.writeStringNull();
            } else {
                jSONWriter.writeString(cArr, 0, cArr.length);
            }
        }
    }

    public void writeDouble(JSONWriter jSONWriter, Double d) {
        if (d == null) {
            long features = jSONWriter.getFeatures(this.features);
            if ((JSONWriter.Feature.WriteNulls.mask & features) == 0 || (features & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeNumberNull();
            return;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeDouble(d.doubleValue());
    }

    public static ObjectWriter getObjectWriter(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            if (cls.isAssignableFrom(cls2)) {
                return ObjectWriterImplMap.of(type, str, cls2);
            }
            return ObjectWriterImplMap.of(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplCalendar(str, locale);
            }
            return ObjectWriterImplCalendar.INSTANCE;
        }
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplZonedDateTime(str, locale);
            }
            return ObjectWriterImplZonedDateTime.INSTANCE;
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            if (str != null && !str.isEmpty()) {
                return ObjectWriterImplOffsetDateTime.of(str, locale);
            }
            return ObjectWriterImplOffsetDateTime.INSTANCE;
        }
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDateTime.class);
            if (objectWriter != null && objectWriter != ObjectWriterImplLocalDateTime.INSTANCE) {
                return objectWriter;
            }
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplLocalDateTime(str, locale);
            }
            return ObjectWriterImplLocalDateTime.INSTANCE;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDate.class);
            return (objectWriter2 == null || objectWriter2 == ObjectWriterImplLocalDate.INSTANCE) ? ObjectWriterImplLocalDate.of(str, locale) : objectWriter2;
        }
        if (LocalTime.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter3 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalTime.class);
            if (objectWriter3 != null && objectWriter3 != ObjectWriterImplLocalTime.INSTANCE) {
                return objectWriter3;
            }
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplLocalTime(str, locale);
            }
            return ObjectWriterImplLocalTime.INSTANCE;
        }
        if (Instant.class == cls2) {
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplInstant(str, locale);
            }
            return ObjectWriterImplInstant.INSTANCE;
        }
        if (BigDecimal.class == cls2) {
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterImplBigDecimal(new DecimalFormat(str), null);
            }
            return ObjectWriterImplBigDecimal.INSTANCE;
        }
        if (BigDecimal[].class == cls2) {
            if (str != null && !str.isEmpty()) {
                return new ObjectWriterArrayFinal(BigDecimal.class, new DecimalFormat(str));
            }
            return new ObjectWriterArrayFinal(BigDecimal.class, null);
        }
        if (Optional.class == cls2) {
            return ObjectWriterImplOptional.of(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("org.joda.time.LocalDate")) {
            return JodaSupport.createLocalDateWriter(cls2, str);
        }
        if (name.equals("java.sql.Date")) {
            return new ObjectWriterImplDate(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return JdbcSupport.createTimeWriter(str);
        }
        if (name.equals("java.sql.Timestamp")) {
            return JdbcSupport.createTimestampWriter(cls2, str);
        }
        if (name.equals("org.joda.time.LocalDateTime")) {
            return JodaSupport.createLocalDateTimeWriter(cls2, str);
        }
        return null;
    }
}
