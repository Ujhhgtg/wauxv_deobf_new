package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import p000.AbstractC1095;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static final long NONE_DIRECT_FEATURES = ((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask) | JSONWriter.Feature.NotWriteEmptyArray.mask) | JSONWriter.Feature.NotWriteDefaultValue.mask;
    static ObjectReader<JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: obf */
    public static class NameConsumer implements Consumer<Method> {
        final Annotation annotation;
        String name;

        public NameConsumer(Annotation annotation) {
            this.annotation = annotation;
        }

        @Override // java.util.function.Consumer
        public void accept(Method method) {
            if ("name".equals(method.getName())) {
                try {
                    String str = (String) method.invoke(this.annotation, null);
                    if (str.isEmpty()) {
                        return;
                    }
                    this.name = str;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) JSON.toJSON(obj);
    }

    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : BeanUtils.getAnnotations(method)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
            if (jSONField != null) {
                strName = jSONField.name();
                if (strName.isEmpty()) {
                    strName = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(clsAnnotationType.getName())) {
                NameConsumer nameConsumer = new NameConsumer(annotation);
                BeanUtils.annotationMethods(clsAnnotationType, nameConsumer);
                String str = nameConsumer.name;
                if (str != null) {
                    strName = str;
                }
            }
        }
        return strName;
    }

    public static void nameFilter(Iterable<?> iterable, NameFilter nameFilter) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(nameFilter);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable<?>) obj, nameFilter);
            }
        }
    }

    public static JSONObject of() {
        return new JSONObject();
    }

    public static JSONObject parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseObject(str, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) JSON.parseObject(str, (Class) cls);
    }

    public static void valueFilter(Iterable<?> iterable, ValueFilter valueFilter) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, valueFilter);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable<?>) obj, valueFilter);
            }
        }
    }

    public boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public void copyTo(Object obj, JSONReader.Feature... featureArr) {
        long jOf = JSONFactory.defaultReaderFeatures | JSONReader.Feature.of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jOf);
        JSONFactory.getDefaultObjectReaderProvider().getObjectReader(obj.getClass(), zIsEnabled).accept(obj, this, jOf);
    }

    public Object eval(JSONPath jSONPath) {
        return jSONPath.eval(this);
    }

    public JSONObject fluentPut(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public void forEachArrayObject(String str, Consumer<JSONObject> consumer) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            consumer.accept(jSONArray.getJSONObject(i));
        }
    }

    @Deprecated
    public void forEchArrayObject(String str, Consumer<JSONObject> consumer) {
        forEachArrayObject(str, consumer);
    }

    public Object get(String str) {
        return super.get((Object) str);
    }

    public BigDecimal getBigDecimal(String str) {
        Object obj = super.get((Object) str);
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

    public BigInteger getBigInteger(String str) {
        Object obj = super.get((Object) str);
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

    public Boolean getBoolean(String str) {
        Object obj = super.get((Object) str);
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
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str2) || SdkVersion.MINI_VERSION.equals(str2));
    }

    public boolean getBooleanValue(String str) {
        Boolean bool = getBoolean(str);
        return bool != null && bool.booleanValue();
    }

    public Object getByPath(String str) {
        JSONPath jSONPathOf = JSONPath.of(str);
        return jSONPathOf instanceof JSONPathSingleName ? get(((JSONPathSingleName) jSONPathOf).name) : jSONPathOf.eval(this);
    }

    public Byte getByte(String str) {
        Object obj = super.get((Object) str);
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

    public byte getByteValue(String str) {
        Byte b = getByte(str);
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Base64.getDecoder().decode((String) obj);
        }
        throw new JSONException("can not cast to byte[], value : " + obj);
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj);
        }
        return obj instanceof Number ? new Date(((Number) obj).longValue()) : TypeUtils.toDate(obj);
    }

    public Double getDouble(String str) {
        Object obj = super.get((Object) str);
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

    public double getDoubleValue(String str) {
        Double d = getDouble(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public Float getFloat(String str) {
        Object obj = super.get((Object) str);
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

    public float getFloatValue(String str) {
        Float f = getFloat(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public Instant getInstant(String str) {
        Object obj = super.get((Object) str);
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

    public int getIntValue(String str) {
        return getIntValue(str, 0);
    }

    public Integer getInteger(String str) {
        Object obj = super.get((Object) str);
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

    public JSONArray getJSONArray(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof JSONObject) {
            return JSONArray.of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.charAt(0) != '[') {
                return JSONArray.of((Object) str2);
            }
            JSONReader jSONReaderOf = JSONReader.of(str2);
            if (arrayReader == null) {
                arrayReader = jSONReaderOf.getObjectReader(JSONArray.class);
            }
            return arrayReader.readObject(jSONReaderOf, null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            put(str, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayOf = JSONArray.of((Object[]) obj);
            put(str, jSONArrayOf);
            return jSONArrayOf;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i = 0; i < length; i++) {
            jSONArray2.add(Array.get(obj, i));
        }
        put(str, jSONArray2);
        return jSONArray2;
    }

    public JSONObject getJSONObject(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return JSONFactory.OBJECT_READER.readObject(JSONReader.of(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            return null;
        }
        JSONObject jSONObject2 = ((ObjectWriterAdapter) objectWriter).toJSONObject(obj);
        put(str, jSONObject2);
        return jSONObject2;
    }

    public <T> List<T> getList(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, featureArr);
    }

    public LocalDate getLocalDate(String str) {
        return getLocalDate(str, null);
    }

    public LocalDateTime getLocalDateTime(String str) {
        return getLocalDateTime(str, null);
    }

    public LocalTime getLocalTime(String str) {
        return getLocalTime(str, null);
    }

    public Long getLong(String str) {
        Object obj = super.get((Object) str);
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

    public long getLongValue(String str) {
        return getLongValue(str, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        ObjectReader objectReader = null;
        if (t == 0) {
            return null;
        }
        if (cls != Object.class || featureArr.length != 0) {
            boolean z = false;
            for (JSONReader.Feature feature : featureArr) {
                if (feature == JSONReader.Feature.FieldBased) {
                    z = true;
                    break;
                }
            }
            Class<?> cls2 = t.getClass();
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t);
            }
            if (t instanceof Map) {
                return (T) defaultObjectReaderProvider.getObjectReader(cls, z).createInstance((Map) t, featureArr);
            }
            if (t instanceof Collection) {
                return (T) defaultObjectReaderProvider.getObjectReader(cls, z).createInstance((Collection) t, featureArr);
            }
            Class<?> mapping = TypeUtils.getMapping(cls);
            if (!mapping.isInstance(t)) {
                if (t instanceof String) {
                    String str2 = (String) t;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                    if (mapping.isEnum()) {
                        objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z);
                        if (objectReader instanceof ObjectReaderImplEnum) {
                            return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str2));
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
        }
        return t;
    }

    public OffsetDateTime getOffsetDateTime(String str) {
        return getOffsetDateTime(str, null);
    }

    public OffsetTime getOffsetTime(String str) {
        return getOffsetTime(str, null);
    }

    public Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public Short getShort(String str) {
        Object obj = super.get((Object) str);
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

    public short getShortValue(String str) {
        Short sh = getShort(str);
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public int getSize(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public ZonedDateTime getZonedDateTime(String str) {
        return getZonedDateTime(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0194  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x012a, please report this as an issue */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Function typeConvert;
        boolean zStartsWith;
        Class<?> declaringClass;
        String strSubstring;
        String name = method.getName();
        int parameterCount = method.getParameterCount();
        Class<?> returnType = method.getReturnType();
        Class<?> cls = Void.TYPE;
        if (parameterCount == 1) {
            if ("equals".equals(name)) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            Class<?> cls2 = interfaces.length == 1 ? interfaces[0] : null;
            if (returnType != cls && returnType != cls2) {
                throw new JSONException(AbstractC1095.m2800("This method '", name, "' is not a setter"));
            }
            String jSONFieldName = getJSONFieldName(method);
            if (jSONFieldName == null) {
                if (!name.startsWith("set")) {
                    throw new JSONException(AbstractC1095.m2800("This method '", name, "' is not a setter"));
                }
                String strSubstring2 = name.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new JSONException(AbstractC1095.m2800("This method '", name, "' is an illegal setter"));
                }
                jSONFieldName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            }
            put(jSONFieldName, objArr[0]);
            if (returnType != cls) {
                return obj;
            }
            return null;
        }
        if (parameterCount != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (returnType == cls) {
            throw new JSONException(AbstractC1095.m2800("This method '", name, "' is not a getter"));
        }
        String jSONFieldName2 = getJSONFieldName(method);
        if (jSONFieldName2 == null) {
            if (name.startsWith("get")) {
                zStartsWith = false;
            } else {
                zStartsWith = name.startsWith("with");
                if (!zStartsWith) {
                    if (name.startsWith("is")) {
                        if ("hashCode".equals(name)) {
                            return Integer.valueOf(hashCode());
                        }
                        if ("toString".equals(name)) {
                            return toString();
                        }
                        if (name.startsWith("entrySet")) {
                            return entrySet();
                        }
                        if ("size".equals(name)) {
                            return Integer.valueOf(size());
                        }
                        declaringClass = method.getDeclaringClass();
                        if (declaringClass.isInterface() || Modifier.isAbstract(method.getModifiers()) || JDKUtils.ANDROID || JDKUtils.GRAAL) {
                            throw new JSONException(AbstractC1095.m2800("This method '", name, "' is not a getter"));
                        }
                        return (Object) JDKUtils.trustedLookup(declaringClass).findSpecial(declaringClass, method.getName(), MethodType.methodType(returnType), declaringClass).invoke(obj);
                    }
                    if ("isEmpty".equals(name)) {
                        obj2 = get("empty");
                        if (obj2 == null) {
                            return Boolean.valueOf(isEmpty());
                        }
                    } else {
                        strSubstring = name.substring(2);
                        if (!strSubstring.isEmpty()) {
                            throw new JSONException(AbstractC1095.m2800("This method '", name, "' is an illegal getter"));
                        }
                        obj2 = get(Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1));
                        if (obj2 == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
            int length = name.length();
            int i = zStartsWith ? 4 : 3;
            if (length > i) {
                char[] cArr = new char[name.length() - i];
                name.getChars(i, name.length(), cArr, 0);
                char c = cArr[0];
                if (c >= 'A' && c <= 'Z') {
                    cArr[0] = (char) (c + ' ');
                }
                String str = new String(cArr);
                if (str.isEmpty()) {
                    throw new JSONException(AbstractC1095.m2800("This method '", name, "' is an illegal getter"));
                }
                obj2 = get(str);
                if (obj2 == null) {
                    return null;
                }
            } else {
                if (name.startsWith("is")) {
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(hashCode());
                    }
                    if ("toString".equals(name)) {
                        return toString();
                    }
                    if (name.startsWith("entrySet")) {
                        return entrySet();
                    }
                    if ("size".equals(name)) {
                        return Integer.valueOf(size());
                    }
                    declaringClass = method.getDeclaringClass();
                    if (declaringClass.isInterface()) {
                    }
                    throw new JSONException(AbstractC1095.m2800("This method '", name, "' is not a getter"));
                }
                if ("isEmpty".equals(name)) {
                    obj2 = get("empty");
                    if (obj2 == null) {
                        return Boolean.valueOf(isEmpty());
                    }
                } else {
                    strSubstring = name.substring(2);
                    if (!strSubstring.isEmpty()) {
                        throw new JSONException(AbstractC1095.m2800("This method '", name, "' is an illegal getter"));
                    }
                    obj2 = get(Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1));
                    if (obj2 == null) {
                        return Boolean.FALSE;
                    }
                }
            }
        } else {
            obj2 = get(jSONFieldName2);
            if (obj2 == null) {
                return null;
            }
        }
        return (returnType.isInstance(obj2) || (typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj2.getClass(), method.getGenericReturnType())) == null) ? obj2 : typeConvert.apply(obj2);
    }

    public boolean isArray(Object obj) {
        Object obj2 = super.get(obj);
        if (obj2 instanceof JSONArray) {
            return true;
        }
        return obj2 != null && obj2.getClass().isArray();
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.isValid(this);
    }

    public JSONArray putArray(String str) {
        JSONArray jSONArray = new JSONArray();
        put(str, jSONArray);
        return jSONArray;
    }

    public JSONObject putObject(String str) {
        JSONObject jSONObject = new JSONObject();
        put(str, jSONObject);
        return jSONObject;
    }

    public <T> T to(Function<JSONObject, T> function) {
        return function.apply(this);
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

    public <T> T toJavaObject(Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) to((Class) cls, featureArr);
    }

    @Override // java.util.AbstractMap
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

    public JSONObject(int i) {
        super(i);
    }

    public static JSONObject from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONObject) JSON.toJSON(obj, featureArr);
    }

    public static JSONObject of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1, 1.0f);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, (Class) cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, featureArr);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public JSONObject clone() {
        return new JSONObject(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) {
            return super.containsKey(obj) || super.containsKey((Object) obj.toString());
        }
        return super.containsKey(obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        return (((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) && (obj2 = super.get((Object) obj.toString())) != null) ? obj2 : super.get(obj);
    }

    public int getIntValue(String str, int i) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (!(obj instanceof String)) {
                throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to int value"));
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
            }
        }
        return i;
    }

    public LocalDate getLocalDate(String str, LocalDate localDate) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return localDate;
        }
        return obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return localDateTime;
        }
        return obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return localTime;
        }
        return obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    public long getLongValue(String str, long j) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (!(obj instanceof String)) {
                throw new JSONException(AbstractC1095.m2799(obj, new StringBuilder("Can not cast '"), "' to long value"));
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
            }
        }
        return j;
    }

    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return offsetDateTime;
        }
        return obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return offsetTime;
        }
        return obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        return ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? super.getOrDefault((Object) obj.toString(), obj2) : super.getOrDefault(obj, obj2);
    }

    public String getString(String str, String str2) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return str2;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Date) {
            return DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID);
        }
        return ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : JSON.toJSONString(obj);
    }

    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return zonedDateTime;
        }
        return obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    public <T> T to(Type type, JSONReader.Feature... featureArr) {
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z = true;
            }
            j |= feature.mask;
        }
        return type == String.class ? (T) toString() : (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type, z).createInstance(this, j);
    }

    public <T> T toJavaObject(Type type, JSONReader.Feature... featureArr) {
        return (T) to(type, featureArr);
    }

    public JSONObject(int i, float f) {
        super(i, f);
    }

    public static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, type, featureArr);
    }

    public boolean getBooleanValue(String str, boolean z) {
        Boolean bool = getBoolean(str);
        return bool == null ? z : bool.booleanValue();
    }

    public <T> T toJavaObject(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) to(typeReference, featureArr);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static <T> T parseObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, typeReference, featureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject parseObject(String str) {
        return JSON.parseObject(str);
    }

    public static void nameFilter(Map map, NameFilter nameFilter) {
        String str;
        String strProcess;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(nameFilter);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable<?>) value, nameFilter);
            }
            if ((key instanceof String) && (strProcess = nameFilter.process(map, (str = (String) key), value)) != null && !strProcess.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(strProcess, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    public static void valueFilter(Map map, ValueFilter valueFilter) {
        Object objApply;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, valueFilter);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable<?>) value, valueFilter);
            }
            if ((key instanceof String) && (objApply = valueFilter.apply(map, (String) key, value)) != value) {
                entry.setValue(objApply);
            }
        }
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterOf = JSONWriter.of(featureArr);
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

    public Date getDate(String str, Date date) {
        Date date2 = getDate(str);
        return date2 == null ? date : date2;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    public <T> T to(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) to(typeReference.getType(), featureArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T to(Class<T> cls, JSONReader.Feature... featureArr) {
        long jOf = JSONFactory.defaultReaderFeatures | JSONReader.Feature.of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jOf);
        if (cls == String.class) {
            return (T) toString();
        }
        if (cls == JSON.class) {
            return this;
        }
        if (cls == Void.class || cls == Void.TYPE) {
            return null;
        }
        return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls, zIsEnabled).createInstance(this, jOf);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    public void valueFilter(ValueFilter valueFilter) {
        valueFilter(this, valueFilter);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5, Object... objArr) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        if (objArr != null && objArr.length > 0) {
            of(jSONObject, objArr);
        }
        return jSONObject;
    }

    public void nameFilter(NameFilter nameFilter) {
        nameFilter(this, nameFilter);
    }

    private static JSONObject of(JSONObject jSONObject, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            if ((length & 1) == 1) {
                throw new JSONException("The length of kvArray cannot be odd");
            }
            boolean z = false;
            for (int i = 0; i < length; i += 2) {
                int i2 = i + 1;
                Object obj = objArr[i];
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (z) {
                        if (!jSONObject.containsKey(str)) {
                            jSONObject.put(str, objArr[i2]);
                        } else {
                            throw new JSONException("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                        }
                    } else if (jSONObject.put(str, objArr[i2]) == null) {
                        z = objArr[i2] == null;
                    } else {
                        throw new JSONException("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    }
                } else {
                    throw new JSONException("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
                }
            }
            return jSONObject;
        }
        throw new JSONException("The kvArray cannot be empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Type type, JSONReader.Feature... featureArr) {
        T t = (T) super.get((Object) str);
        if (t == 0) {
            return null;
        }
        if (type != Object.class || featureArr.length != 0) {
            boolean z = false;
            for (JSONReader.Feature feature : featureArr) {
                if (feature == JSONReader.Feature.FieldBased) {
                    z = true;
                    break;
                }
            }
            Class<?> cls = t.getClass();
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, type);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t);
            }
            if (t instanceof Map) {
                return (T) defaultObjectReaderProvider.getObjectReader(type, z).createInstance((Map) t, featureArr);
            }
            if (t instanceof Collection) {
                return (T) defaultObjectReaderProvider.getObjectReader(type, z).createInstance((Collection) t, featureArr);
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t)) {
                if (t instanceof String) {
                    String str2 = (String) t;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                JSONReader jSONReaderOf = JSONReader.of(JSON.toJSONString(t));
                jSONReaderOf.context.config(featureArr);
                return (T) defaultObjectReaderProvider.getObjectReader(type, z).readObject(jSONReaderOf, null, null, 0L);
            }
        }
        return t;
    }

    public <T> T getObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) getObject(str, typeReference.type, featureArr);
    }

    public <T> T getObject(String str, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
