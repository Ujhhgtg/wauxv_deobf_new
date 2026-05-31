package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import p000.AbstractC1095;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static ObjectWriter<JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray() {
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) JSON.toJSON(obj);
    }

    public static JSONArray of(Object... objArr) {
        return new JSONArray(objArr);
    }

    public static JSONArray parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    public static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    public JSONArray addArray() {
        JSONArray jSONArray = new JSONArray();
        add(jSONArray);
        return jSONArray;
    }

    public JSONObject addObject() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject);
        return jSONObject;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return new JSONArray(this);
    }

    public JSONArray fluentAdd(Object obj) {
        add(obj);
        return this;
    }

    public JSONArray fluentAddAll(Collection<?> collection) {
        addAll(collection);
        return this;
    }

    public JSONArray fluentClear() {
        clear();
        return this;
    }

    public JSONArray fluentRemove(int i) {
        remove(i);
        return this;
    }

    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    public JSONArray fluentSet(int i, Object obj) {
        set(i, obj);
        return this;
    }

    public BigDecimal getBigDecimal(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Number)) {
            if (obj instanceof String) {
                return TypeUtils.toBigDecimal(((String) obj).trim());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to BigDecimal"));
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (obj instanceof Float) {
            return TypeUtils.toBigDecimal(((Float) obj).floatValue());
        }
        return obj instanceof Double ? TypeUtils.toBigDecimal(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
    }

    public BigInteger getBigInteger(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if (obj instanceof BigInteger) {
                return (BigInteger) obj;
            }
            return obj instanceof BigDecimal ? ((BigDecimal) obj).toBigInteger() : BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
            }
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to BigInteger"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return new BigInteger(strTrim);
    }

    public Boolean getBoolean(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to boolean"));
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str) || SdkVersion.MINI_VERSION.equals(str));
    }

    public boolean getBooleanValue(int i) {
        Boolean bool = getBoolean(i);
        return bool != null && bool.booleanValue();
    }

    public Byte getByte(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to byte"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(strTrim));
    }

    public byte getByteValue(int i) {
        Byte b = getByte(i);
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public Date getDate(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj);
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.toDate(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return new Date(jLongValue);
    }

    public Double getDouble(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to double"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(strTrim));
    }

    public double getDoubleValue(int i) {
        Double d = getDouble(i);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public Float getFloat(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to float"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(strTrim));
    }

    public float getFloatValue(int i) {
        Float f = getFloat(i);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public Instant getInstant(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Instant) {
            return (Instant) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.toInstant(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return Instant.ofEpochMilli(jLongValue);
    }

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to int value"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
    }

    public Integer getInteger(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1 : 0;
            }
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to Integer"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return strTrim.indexOf(46) != -1 ? Integer.valueOf((int) Double.parseDouble(strTrim)) : Integer.valueOf(Integer.parseInt(strTrim));
    }

    public JSONArray getJSONArray(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if (str.charAt(0) != '[') {
                return of((Object) str);
            }
            return JSONFactory.ARRAY_READER.readObject(JSONReader.of(str), null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            set(i, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayOf = of((Object[]) obj);
            set(i, jSONArrayOf);
            return jSONArrayOf;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i2 = 0; i2 < length; i2++) {
            jSONArray2.add(Array.get(obj, i2));
        }
        set(i, jSONArray2);
        return jSONArray2;
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return JSONFactory.OBJECT_READER.readObject(JSONReader.of(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        JSONObject jSONObject2 = objectWriter instanceof ObjectWriterAdapter ? ((ObjectWriterAdapter) objectWriter).toJSONObject(obj) : (JSONObject) JSON.toJSON(obj);
        set(i, jSONObject2);
        return jSONObject2;
    }

    public LocalDate getLocalDate(int i) {
        return getLocalDate(i, null);
    }

    public LocalDateTime getLocalDateTime(int i) {
        return getLocalDateTime(i, null);
    }

    public LocalTime getLocalTime(int i) {
        return getLocalTime(i, null);
    }

    public Long getLong(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1L : 0L;
            }
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to Long"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return strTrim.indexOf(46) != -1 ? Long.valueOf((long) Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
    }

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to long value"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0L;
        }
        return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
    }

    public <T> T getObject(int i, Type type, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        if (t == null) {
            return null;
        }
        Class<?> cls = t.getClass();
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, type);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t);
        }
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) defaultObjectReaderProvider.getObjectReader(type, z).createInstance((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) defaultObjectReaderProvider.getObjectReader(type, z).createInstance((Collection) t, j);
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        if (mapping.isInstance(t)) {
            return t;
        }
        JSONReader jSONReaderOf = JSONReader.of(JSON.toJSONString(t));
        jSONReaderOf.context.config(featureArr);
        return (T) defaultObjectReaderProvider.getObjectReader(mapping, z).readObject(jSONReaderOf, null, null, 0L);
    }

    public OffsetDateTime getOffsetDateTime(int i) {
        return getOffsetDateTime(i, null);
    }

    public OffsetTime getOffsetTime(int i) {
        return getOffsetTime(i, null);
    }

    public Short getShort(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to short"));
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(strTrim));
    }

    public short getShortValue(int i) {
        Short sh = getShort(i);
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public String getString(int i) {
        return getString(i, null);
    }

    public ZonedDateTime getZonedDateTime(int i) {
        return getZonedDateTime(i, null);
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.validate(this).isSuccess();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int size = super.size();
        if (i < 0) {
            int i2 = i + size;
            if (i2 >= 0) {
                return super.set(i2, obj);
            }
            super.add(0, obj);
            return null;
        }
        if (i < size) {
            return super.set(i, obj);
        }
        if (i < size + 4096) {
            while (true) {
                int i3 = i - 1;
                if (i == size) {
                    break;
                }
                super.add(null);
                i = i3;
            }
            super.add(obj);
        }
        return null;
    }

    public <T> T to(Type type) {
        return (T) to(type, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object objCreateInstance = get(i);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
                    if (typeConvert == 0) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i] = typeConvert.apply(objCreateInstance);
                }
            }
            tArr[i] = objCreateInstance;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.setRootObject(this);
            jSONWriterOfJSONB.write(this);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toJSONString(JSONWriter.Feature... featureArr) {
        return toString(featureArr);
    }

    public <T> List<T> toJavaList(Class<T> cls, JSONReader.Feature... featureArr) {
        return toList(cls, featureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) to(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> List<T> toList(Class<T> cls, JSONReader.Feature... featureArr) {
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object objCreateInstance = get(i);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
                    if (typeConvert == 0) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    arrayList.add(typeConvert.apply(objCreateInstance));
                }
            }
            arrayList.add(objCreateInstance);
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        JSONWriter jSONWriterOf = JSONWriter.of();
        try {
            jSONWriterOf.setRootObject(this);
            jSONWriterOf.write(this);
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf != null) {
                try {
                    jSONWriterOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public JSONArray(int i) {
        super(i);
    }

    public static JSONArray from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONArray) JSON.toJSON(obj, featureArr);
    }

    public static JSONArray of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, (Class) cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, featureArr);
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public LocalDate getLocalDate(int i, LocalDate localDate) {
        Object obj = super.get(i);
        if (obj == null) {
            return localDate;
        }
        return obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    public LocalDateTime getLocalDateTime(int i, LocalDateTime localDateTime) {
        Object obj = super.get(i);
        if (obj == null) {
            return localDateTime;
        }
        return obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    public LocalTime getLocalTime(int i, LocalTime localTime) {
        Object obj = super.get(i);
        if (obj == null) {
            return localTime;
        }
        return obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    public OffsetDateTime getOffsetDateTime(int i, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i);
        if (obj == null) {
            return offsetDateTime;
        }
        return obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    public OffsetTime getOffsetTime(int i, OffsetTime offsetTime) {
        Object obj = super.get(i);
        if (obj == null) {
            return offsetTime;
        }
        return obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    public String getString(int i, String str) {
        Object obj = get(i);
        if (obj == null) {
            return str;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Date) {
            return DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID);
        }
        return ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : JSON.toJSONString(obj);
    }

    public ZonedDateTime getZonedDateTime(int i, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i);
        if (obj == null) {
            return zonedDateTime;
        }
        return obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    public <T> T to(Type type, long j) {
        return type == String.class ? (T) toString() : (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type).createInstance(this, j);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        return JSON.parseArray(str, (Class) cls);
    }

    public JSONArray(Object... objArr) {
        super(objArr.length);
        super.addAll(Arrays.asList(objArr));
    }

    public static JSONArray of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    public static JSONArray of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T to(Class<T> cls) {
        if (cls == String.class) {
            return (T) toString();
        }
        return cls == JSON.class ? this : (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls).createInstance(this);
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterOf = JSONWriter.of(featureArr);
        try {
            if ((jSONWriterOf.context.features & JSONObject.NONE_DIRECT_FEATURES) == 0) {
                jSONWriterOf.write(this);
            } else {
                jSONWriterOf.setRootObject(this);
                if (arrayWriter == null) {
                    arrayWriter = jSONWriterOf.getObjectWriter(JSONArray.class, JSONArray.class);
                }
                arrayWriter.write(jSONWriterOf, this, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public Date getDate(int i, Date date) {
        Date date2 = getDate(i);
        return date2 == null ? date : date2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(int i, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) get(i);
        ObjectReader objectReader = null;
        if (t == 0) {
            return null;
        }
        Class<?> cls2 = t.getClass();
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t);
        }
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) defaultObjectReaderProvider.getObjectReader(cls, z).createInstance((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) defaultObjectReaderProvider.getObjectReader(cls, z).createInstance((Collection) t, j);
        }
        Class<?> mapping = TypeUtils.getMapping(cls);
        if (mapping.isInstance(t)) {
            return t;
        }
        if (t instanceof String) {
            String str = (String) t;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (mapping.isEnum()) {
                objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z);
                if (objectReader instanceof ObjectReaderImplEnum) {
                    return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str));
                }
            }
        }
        String jSONString = JSON.toJSONString(t);
        JSONReader jSONReaderOf = JSONReader.of(jSONString);
        jSONReaderOf.context.config(featureArr);
        if (objectReader == null) {
            objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z);
        }
        T t2 = (T) objectReader.readObject(jSONReaderOf, null, null, 0L);
        if (jSONReaderOf.isEnd()) {
            return t2;
        }
        throw new JSONException(AbstractC2844.m4790("not support input ", jSONString));
    }

    public <T> T getObject(int i, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
