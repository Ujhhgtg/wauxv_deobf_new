package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONSchemaValidException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.schema.UnresolvedReference;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.umeng.analytics.pro.ek;
import com.umeng.analytics.pro.g;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import p000.C2497feyxiexzfUjhhgtg;
import p000.C2500feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@JSONType(serializer = JSONSchemaWriter.class)
public abstract class JSONSchema {
    final String customErrorMessage;
    final String description;
    final String title;
    static final Map<String, JSONSchema> CACHE = new ConcurrentHashMap();
    static final JSONReader.Context CONTEXT = JSONFactory.createReadContext();
    static final ValidateResult SUCCESS = new ValidateResult(true, "success", new Object[0]);
    static final ValidateResult FAIL_INPUT_NULL = new ValidateResult(false, "input null", new Object[0]);
    static final ValidateResult FAIL_INPUT_NOT_ENCODED = new ValidateResult(false, "input not encoded string", new Object[0]);
    static final ValidateResult FAIL_ANY_OF = new ValidateResult(false, "anyOf fail", new Object[0]);
    static final ValidateResult FAIL_ONE_OF = new ValidateResult(false, "oneOf fail", new Object[0]);
    static final ValidateResult FAIL_NOT = new ValidateResult(false, "not fail", new Object[0]);
    static final ValidateResult FAIL_TYPE_NOT_MATCH = new ValidateResult(false, "type not match", new Object[0]);
    static final ValidateResult FAIL_PROPERTY_NAME = new ValidateResult(false, "propertyName not match", new Object[0]);
    static final ValidateResult CONTAINS_NOT_MATCH = new ValidateResult(false, "contains not match", new Object[0]);
    static final ValidateResult UNIQUE_ITEMS_NOT_MATCH = new ValidateResult(false, "uniqueItems not match", new Object[0]);
    static final ValidateResult REQUIRED_NOT_MATCH = new ValidateResult(false, "required", new Object[0]);

    /* JADX INFO: renamed from: com.alibaba.fastjson2.schema.JSONSchema$1, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type = iArr;
            try {
                iArr[Type.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Integer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Boolean.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Null.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Object.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[Type.Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class JSONSchemaWriter implements ObjectWriter {
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, java.lang.reflect.Type type, long j) {
            jSONWriter.write(((JSONSchema) obj).toJSONObject());
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum Type {
        Null,
        Boolean,
        Object,
        Array,
        Number,
        String,
        Integer,
        Enum,
        Const,
        OneOf,
        AllOf,
        AnyOf,
        Any,
        UnresolvedReference;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Type of(String str) {
            if (str == null) {
                return null;
            }
            byte b = -1;
            switch (str.hashCode()) {
                case -1950496919:
                    if (str.equals("Number")) {
                        b = 0;
                    }
                    break;
                case -1939501217:
                    if (str.equals("Object")) {
                        b = 1;
                    }
                    break;
                case -1808118735:
                    if (str.equals("String")) {
                        b = 2;
                    }
                    break;
                case -1034364087:
                    if (str.equals("number")) {
                        b = 3;
                    }
                    break;
                case -1023368385:
                    if (str.equals("object")) {
                        b = 4;
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        b = 5;
                    }
                    break;
                case -672261858:
                    if (str.equals("Integer")) {
                        b = 6;
                    }
                    break;
                case 2439591:
                    if (str.equals("Null")) {
                        b = 7;
                    }
                    break;
                case 3392903:
                    if (str.equals("null")) {
                        b = 8;
                    }
                    break;
                case 63537721:
                    if (str.equals("Array")) {
                        b = 9;
                    }
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        b = 10;
                    }
                    break;
                case 93090393:
                    if (str.equals("array")) {
                        b = 11;
                    }
                    break;
                case 1729365000:
                    if (str.equals("Boolean")) {
                        b = 12;
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        b = ek.k;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 3:
                    return Number;
                case 1:
                case 4:
                    return Object;
                case 2:
                case 5:
                    return String;
                case 6:
                case 13:
                    return Integer;
                case 7:
                case 8:
                    return Null;
                case 9:
                case 11:
                    return Array;
                case 10:
                case Opcodes.FCONST_1 /* 12 */:
                    return Boolean;
                default:
                    return null;
            }
        }
    }

    public JSONSchema(JSONObject jSONObject) {
        this.title = jSONObject.getString("title");
        this.description = jSONObject.getString("description");
        this.customErrorMessage = jSONObject.getString(g.U);
    }

    public static AllOf allOf(JSONObject jSONObject, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONObject.getJSONArray("allOf"), cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new AllOf(jSONSchemaArrMakeSchemaItems);
    }

    public static AnyOf anyOf(JSONObject jSONObject, Class cls) {
        return anyOf(jSONObject.getJSONArray("anyOf"), cls);
    }

    public static JSONObject injectIfPresent(JSONObject jSONObject, AllOf allOf, AnyOf anyOf, OneOf oneOf) {
        if (allOf != null) {
            jSONObject.put("allOf", allOf);
        }
        if (anyOf != null) {
            jSONObject.put("anyOf", anyOf);
        }
        if (oneOf != null) {
            jSONObject.put("oneOf", oneOf);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$of$0(JSONArray jSONArray, FieldReader fieldReader) {
        if (fieldReader.fieldClass.isPrimitive()) {
            jSONArray.add(fieldReader.fieldName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$of$1(ObjectSchema objectSchema, JSONSchema jSONSchema, FieldReader fieldReader) {
        Map<String, JSONSchema> map = objectSchema.properties;
        String str = fieldReader.fieldName;
        java.lang.reflect.Type type = fieldReader.fieldType;
        JSONSchema jSONSchema2 = objectSchema;
        if (jSONSchema != null) {
            jSONSchema2 = jSONSchema;
        }
        map.put(str, of(type, jSONSchema2));
    }

    public static JSONSchema[] makeSchemaItems(JSONArray jSONArray, Class cls) {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        int size = jSONArray.size();
        JSONSchema[] jSONSchemaArr = new JSONSchema[size];
        for (int i = 0; i < size; i++) {
            jSONSchemaArr[i] = of(jSONArray.getJSONObject(i), cls);
        }
        return jSONSchemaArr;
    }

    public static JSONSchema of(JSONObject jSONObject, Class cls) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        if (cls == null || cls == Object.class) {
            return of(jSONObject);
        }
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) {
            if (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) {
                return anyOf(jSONObject, cls);
            }
            if (jSONObject.containsKey("oneOf")) {
                return oneOf(jSONObject, cls);
            }
            return jSONObject.containsKey("not") ? ofNot(jSONObject, cls) : new IntegerSchema(jSONObject);
        }
        if (cls == BigDecimal.class || cls == Float.TYPE || cls == Double.TYPE || cls == Float.class || cls == Double.class || cls == Number.class) {
            if (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) {
                return anyOf(jSONObject, cls);
            }
            if (jSONObject.containsKey("oneOf")) {
                return oneOf(jSONObject, cls);
            }
            return jSONObject.containsKey("not") ? ofNot(jSONObject, cls) : new NumberSchema(jSONObject);
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return new BooleanSchema(jSONObject);
        }
        if (cls == String.class) {
            return new StringSchema(jSONObject);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return new ArraySchema(jSONObject, null);
        }
        return cls.isArray() ? new ArraySchema(jSONObject, null) : new ObjectSchema(jSONObject, null);
    }

    public static Not ofNot(JSONObject jSONObject, Class cls) {
        Object obj = jSONObject.get("not");
        if (obj instanceof Boolean) {
            return new Not(null, null, (Boolean) obj);
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new Not(null, new Type[]{Type.Any}, null);
        }
        if (jSONObject2.size() == 1) {
            Object obj2 = jSONObject2.get(g.y);
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                Type[] typeArr = new Type[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    typeArr[i] = (Type) jSONArray.getObject(i, Type.class, new JSONReader.Feature[0]);
                }
                return new Not(null, typeArr, null);
            }
        }
        return new Not(of(jSONObject2, cls), null, null);
    }

    public static JSONSchema ofValue(Object obj) {
        return ofValue(obj, null);
    }

    public static OneOf oneOf(JSONObject jSONObject, Class cls) {
        return oneOf(jSONObject.getJSONArray("oneOf"), cls);
    }

    public static JSONSchema parseSchema(String str) {
        if ("true".equals(str)) {
            return Any.INSTANCE;
        }
        if ("false".equals(str)) {
            return Any.NOT_ANY;
        }
        JSONReader jSONReaderOf = JSONReader.of(str);
        try {
            JSONSchema jSONSchemaOf = of((JSONObject) jSONReaderOf.getObjectReader(Object.class).readObject(jSONReaderOf, null, null, 0L));
            jSONReaderOf.close();
            return jSONSchemaOf;
        } catch (Throwable th) {
            if (jSONReaderOf == null) {
                throw th;
            }
            try {
                jSONReaderOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public void accept(Predicate<JSONSchema> predicate) {
        predicate.test(this);
    }

    public void assertValidate(Object obj) {
        ValidateResult validateResultValidate = validate(obj);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toJSONObject().equals(((JSONSchema) obj).toJSONObject());
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract Type getType();

    public int hashCode() {
        return toJSONObject().hashCode();
    }

    public boolean isValid(Object obj) {
        return validate(obj).isSuccess();
    }

    public JSONObject toJSONObject() {
        return new JSONObject();
    }

    public String toString() {
        return toJSONObject().toString();
    }

    public final ValidateResult validate(Object obj) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(obj);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public ValidateResult validateInternal(long j) {
        return validateInternal((Object) Long.valueOf(j));
    }

    public abstract ValidateResult validateInternal(Object obj);

    public static JSONSchema ofValue(Object obj, JSONSchema jSONSchema) {
        Class<?> cls = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                return new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
            }
            boolean z = true;
            Object obj2 = null;
            for (Object obj3 : collection) {
                if (obj3 != null) {
                    if (obj2 == null) {
                        obj2 = obj3;
                    }
                    if (cls == null) {
                        cls = obj3.getClass();
                    } else if (cls != obj3.getClass()) {
                        z = false;
                    }
                }
            }
            if (z) {
                JSONSchema jSONSchemaOfValue = Map.class.isAssignableFrom(cls) ? ofValue(obj2, jSONSchema) : of(cls, jSONSchema);
                ArraySchema arraySchema = new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
                arraySchema.itemSchema = jSONSchemaOfValue;
                return arraySchema;
            }
        }
        if (!(obj instanceof Map)) {
            return of(obj.getClass(), jSONSchema);
        }
        ObjectSchema objectSchema = new ObjectSchema(JSONObject.of(g.y, (Object) "object"), jSONSchema);
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                objectSchema.properties.put((String) key, value == null ? new StringSchema(JSONObject.of()) : ofValue(value, jSONSchema == null ? objectSchema : jSONSchema));
            }
        }
        return objectSchema;
    }

    public ValidateResult validateInternal(double d) {
        return validateInternal((Object) Double.valueOf(d));
    }

    public static AnyOf anyOf(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONArray, cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new AnyOf(jSONSchemaArrMakeSchemaItems);
    }

    public static OneOf oneOf(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONArray, cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new OneOf(jSONSchemaArrMakeSchemaItems);
    }

    public boolean isValid(long j) {
        return validate(j).isSuccess();
    }

    public ValidateResult validateInternal(Double d) {
        return validateInternal((Object) d);
    }

    public void assertValidate(Integer num) {
        ValidateResult validateResultValidate = validate(num);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(long j) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(j);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public ValidateResult validateInternal(Integer num) {
        return validateInternal((Object) num);
    }

    public JSONSchema(String str, String str2) {
        this.title = str;
        this.description = str2;
        this.customErrorMessage = null;
    }

    public boolean isValid(double d) {
        return validate(d).isSuccess();
    }

    public ValidateResult validateInternal(Long l) {
        return validateInternal((Object) l);
    }

    public ValidateResult validateInternal(Float f) {
        return validateInternal((Object) f);
    }

    public void assertValidate(Long l) {
        ValidateResult validateResultValidate = validate(l);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public boolean isValid(Double d) {
        return validate(d).isSuccess();
    }

    public final ValidateResult validate(double d) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(d);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public boolean isValid(float f) {
        return validate(f).isSuccess();
    }

    public void assertValidate(Double d) {
        ValidateResult validateResultValidate = validate(d);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Double d) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(d);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public boolean isValid(Float f) {
        return validate(f).isSuccess();
    }

    public void assertValidate(Float f) {
        ValidateResult validateResultValidate = validate(f);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public boolean isValid(Integer num) {
        return validate(num).isSuccess();
    }

    public final ValidateResult validate(Integer num) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(num);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public boolean isValid(Long l) {
        return validate(l).isSuccess();
    }

    public void assertValidate(long j) {
        ValidateResult validateResultValidate = validate(j);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Long l) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(l);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(double d) {
        ValidateResult validateResultValidate = validate(d);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Float f) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(f);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    @JSONCreator
    public static JSONSchema of(JSONObject jSONObject) {
        return of(jSONObject, (JSONSchema) null);
    }

    public static JSONSchema of(java.lang.reflect.Type type) {
        return of(type, (JSONSchema) null);
    }

    public static JSONSchema of(java.lang.reflect.Type type, JSONSchema jSONSchema) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            java.lang.reflect.Type rawType = parameterizedType.getRawType();
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            boolean z = rawType instanceof Class;
            if (z && Collection.class.isAssignableFrom((Class) rawType)) {
                ArraySchema arraySchema = new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
                if (actualTypeArguments.length == 1) {
                    java.lang.reflect.Type type2 = actualTypeArguments[0];
                    if (jSONSchema == null) {
                        jSONSchema = arraySchema;
                    }
                    arraySchema.itemSchema = of(type2, jSONSchema);
                }
                return arraySchema;
            }
            if (z && Map.class.isAssignableFrom((Class) rawType)) {
                return new ObjectSchema(JSONObject.of(g.y, (Object) "object"), jSONSchema);
            }
        }
        if (type instanceof GenericArrayType) {
            java.lang.reflect.Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            ArraySchema arraySchema2 = new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
            if (jSONSchema == null) {
                jSONSchema = arraySchema2;
            }
            arraySchema2.itemSchema = of(genericComponentType, jSONSchema);
            return arraySchema2;
        }
        if (type != Byte.TYPE && type != Short.TYPE && type != Integer.TYPE && type != Long.TYPE && type != Byte.class && type != Short.class && type != Integer.class && type != Long.class && type != BigInteger.class && type != AtomicInteger.class && type != AtomicLong.class) {
            if (type != Float.TYPE && type != Double.TYPE && type != Float.class && type != Double.class && type != BigDecimal.class) {
                if (type != Boolean.TYPE && type != Boolean.class && type != AtomicBoolean.class) {
                    if (type == String.class) {
                        return new StringSchema(JSONObject.of(g.y, (Object) "string"));
                    }
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (Enum.class.isAssignableFrom(cls)) {
                            Object[] enumConstants = cls.getEnumConstants();
                            String[] strArr = new String[enumConstants.length];
                            for (int i = 0; i < enumConstants.length; i++) {
                                strArr[i] = ((Enum) enumConstants[i]).name();
                            }
                            return new StringSchema(JSONObject.of(g.y, (Object) "string", "enum", (Object) strArr));
                        }
                        if (cls.isArray()) {
                            Class<?> componentType = cls.getComponentType();
                            ArraySchema arraySchema3 = new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
                            if (jSONSchema == null) {
                                jSONSchema = arraySchema3;
                            }
                            arraySchema3.itemSchema = of(componentType, jSONSchema);
                            return arraySchema3;
                        }
                        if (Map.class.isAssignableFrom(cls)) {
                            return new ObjectSchema(JSONObject.of(g.y, (Object) "object"), jSONSchema);
                        }
                        if (Collection.class.isAssignableFrom(cls)) {
                            return new ArraySchema(JSONObject.of(g.y, (Object) "array"), jSONSchema);
                        }
                    }
                    ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type);
                    if (objectReader instanceof ObjectReaderBean) {
                        ObjectReaderAdapter objectReaderAdapter = (ObjectReaderAdapter) objectReader;
                        JSONArray jSONArray = new JSONArray();
                        objectReaderAdapter.apply(new C2500feyxiexzfUjhhgtg(1, jSONArray));
                        ObjectSchema objectSchema = new ObjectSchema(JSONObject.of(g.y, (Object) "object", "required", (Object) jSONArray));
                        objectReaderAdapter.apply(new C2497feyxiexzfUjhhgtg(objectSchema, 6, jSONSchema));
                        return objectSchema;
                    }
                    throw new JSONException("TODO : " + type);
                }
                return new BooleanSchema(JSONObject.of(g.y, (Object) "boolean"));
            }
            return new NumberSchema(JSONObject.of(g.y, (Object) "number"));
        }
        return new IntegerSchema(JSONObject.of(g.y, (Object) "integer"));
    }

    public void addResolveTask(UnresolvedReference.ResolveTask resolveTask) {
    }

    @JSONCreator
    public static JSONSchema of(JSONObject jSONObject, JSONSchema jSONSchema) {
        Map<String, JSONSchema> map;
        Map<String, JSONSchema> map2;
        Map<String, JSONSchema> map3;
        JSONSchema jSONSchemaPutIfAbsent;
        int i = 0;
        if (jSONObject.size() == 1 && jSONObject.isArray(g.y)) {
            JSONArray jSONArray = jSONObject.getJSONArray(g.y);
            JSONSchema[] jSONSchemaArr = new JSONSchema[jSONArray.size()];
            while (i < jSONArray.size()) {
                jSONSchemaArr[i] = of(JSONObject.of(g.y, jSONArray.get(i)));
                i++;
            }
            return new AnyOf(jSONSchemaArr);
        }
        Type typeOf = Type.of(jSONObject.getString(g.y));
        if (typeOf == null) {
            Object[] objArr = (Object[]) jSONObject.getObject("enum", Object[].class, new JSONReader.Feature[0]);
            if (objArr != null) {
                int length = objArr.length;
                while (i < length) {
                    if (!(objArr[i] instanceof String)) {
                        return new EnumSchema(objArr);
                    }
                    i++;
                }
                return new StringSchema(jSONObject);
            }
            Object obj = jSONObject.get("const");
            if (obj instanceof String) {
                return new StringSchema(jSONObject);
            }
            if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                if (jSONObject.size() == 1) {
                    String string = jSONObject.getString("$ref");
                    if (string != null && !string.isEmpty()) {
                        if ("http://json-schema.org/draft-04/schema#".equals(string)) {
                            Map<String, JSONSchema> map4 = CACHE;
                            JSONSchema jSONSchemaOf = map4.get(string);
                            return (jSONSchemaOf != null || (jSONSchemaPutIfAbsent = map4.putIfAbsent(string, (jSONSchemaOf = of(JSON.parseObject(JSONSchema.class.getClassLoader().getResource("schema/draft-04.json")), (JSONSchema) null)))) == null) ? jSONSchemaOf : jSONSchemaPutIfAbsent;
                        }
                        if ("#".equals(string)) {
                            return jSONSchema;
                        }
                        if (jSONSchema instanceof ObjectSchema) {
                            ObjectSchema objectSchema = (ObjectSchema) jSONSchema;
                            map2 = objectSchema.definitions;
                            map3 = objectSchema.defs;
                            map = objectSchema.properties;
                        } else if (jSONSchema instanceof ArraySchema) {
                            ArraySchema arraySchema = (ArraySchema) jSONSchema;
                            map2 = arraySchema.definitions;
                            map3 = arraySchema.defs;
                            map = null;
                        } else {
                            map = null;
                            map2 = null;
                            map3 = null;
                        }
                        if (map2 != null && string.startsWith("#/definitions/")) {
                            return map2.get(string.substring(14));
                        }
                        if (map3 != null && string.startsWith("#/$defs/")) {
                            String strDecode = URLDecoder.decode(string.substring(8));
                            JSONSchema jSONSchema2 = map3.get(strDecode);
                            return jSONSchema2 == null ? new UnresolvedReference(strDecode) : jSONSchema2;
                        }
                        if (map != null && string.startsWith("#/properties/")) {
                            return map.get(string.substring(13));
                        }
                        if (string.startsWith("#/prefixItems/") && (jSONSchema instanceof ArraySchema)) {
                            return ((ArraySchema) jSONSchema).prefixItems[Integer.parseInt(string.substring(14))];
                        }
                    }
                    Object obj2 = jSONObject.get("exclusiveMaximum");
                    Object obj3 = jSONObject.get("exclusiveMinimum");
                    if (!(obj2 instanceof Integer) && !(obj3 instanceof Integer) && !(obj2 instanceof Long) && !(obj3 instanceof Long)) {
                        if ((obj2 instanceof Number) || (obj3 instanceof Number)) {
                            return new NumberSchema(jSONObject);
                        }
                    } else {
                        return new IntegerSchema(jSONObject);
                    }
                }
                if (!jSONObject.containsKey("properties") && !jSONObject.containsKey("dependentSchemas") && !jSONObject.containsKey("if") && !jSONObject.containsKey("required") && !jSONObject.containsKey("patternProperties") && !jSONObject.containsKey("additionalProperties") && !jSONObject.containsKey("minProperties") && !jSONObject.containsKey("maxProperties") && !jSONObject.containsKey("propertyNames") && !jSONObject.containsKey("$ref")) {
                    if (!jSONObject.containsKey("maxItems") && !jSONObject.containsKey("minItems") && !jSONObject.containsKey("additionalItems") && !jSONObject.containsKey("items") && !jSONObject.containsKey("prefixItems") && !jSONObject.containsKey("uniqueItems") && !jSONObject.containsKey("maxContains") && !jSONObject.containsKey("minContains")) {
                        if (!jSONObject.containsKey("pattern") && !jSONObject.containsKey("format") && !jSONObject.containsKey("minLength") && !jSONObject.containsKey("maxLength")) {
                            boolean zContainsKey = jSONObject.containsKey("allOf");
                            boolean zContainsKey2 = jSONObject.containsKey("anyOf");
                            boolean zContainsKey3 = jSONObject.containsKey("oneOf");
                            if (zContainsKey || zContainsKey2 || zContainsKey3) {
                                int i2 = (zContainsKey ? 1 : 0) + (zContainsKey2 ? 1 : 0) + (zContainsKey3 ? 1 : 0);
                                if (i2 == 1) {
                                    if (zContainsKey) {
                                        return new AllOf(jSONObject, jSONSchema);
                                    }
                                    if (zContainsKey2) {
                                        return new AnyOf(jSONObject, jSONSchema);
                                    }
                                    return new OneOf(jSONObject, jSONSchema);
                                }
                                JSONSchema[] jSONSchemaArr2 = new JSONSchema[i2];
                                if (zContainsKey) {
                                    jSONSchemaArr2[0] = new AllOf(jSONObject, jSONSchema);
                                    i = 1;
                                }
                                if (zContainsKey2) {
                                    jSONSchemaArr2[i] = new AnyOf(jSONObject, jSONSchema);
                                    i++;
                                }
                                if (zContainsKey3) {
                                    jSONSchemaArr2[i] = new OneOf(jSONObject, jSONSchema);
                                }
                                return new AllOf(jSONSchemaArr2);
                            }
                            if (jSONObject.containsKey("not")) {
                                return ofNot(jSONObject, null);
                            }
                            if (!(jSONObject.get("maximum") instanceof Number) && !(jSONObject.get("minimum") instanceof Number) && !jSONObject.containsKey("multipleOf")) {
                                if (jSONObject.isEmpty()) {
                                    return Any.INSTANCE;
                                }
                                if (jSONObject.size() == 1) {
                                    Object obj4 = jSONObject.get(g.y);
                                    if (obj4 instanceof JSONArray) {
                                        JSONArray jSONArray2 = (JSONArray) obj4;
                                        JSONSchema[] jSONSchemaArr3 = new JSONSchema[jSONArray2.size()];
                                        while (i < jSONArray2.size()) {
                                            Type typeOf2 = Type.of(jSONArray2.getString(i));
                                            switch (AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[typeOf2.ordinal()]) {
                                                case 1:
                                                    jSONSchemaArr3[i] = new StringSchema(JSONObject.of(g.y, (Object) "string"));
                                                    break;
                                                case 2:
                                                    jSONSchemaArr3[i] = new IntegerSchema(JSONObject.of(g.y, (Object) "integer"));
                                                    break;
                                                case 3:
                                                    jSONSchemaArr3[i] = new NumberSchema(JSONObject.of(g.y, (Object) "number"));
                                                    break;
                                                case 4:
                                                    jSONSchemaArr3[i] = new BooleanSchema(JSONObject.of(g.y, (Object) "boolean"));
                                                    break;
                                                case 5:
                                                    jSONSchemaArr3[i] = new NullSchema(JSONObject.of(g.y, (Object) "null"));
                                                    break;
                                                case 6:
                                                    jSONSchemaArr3[i] = new ObjectSchema(JSONObject.of(g.y, (Object) "object"));
                                                    break;
                                                case 7:
                                                    jSONSchemaArr3[i] = new ArraySchema(JSONObject.of(g.y, (Object) "array"), null);
                                                    break;
                                                default:
                                                    throw new JSONSchemaValidException("not support type : " + typeOf2);
                                            }
                                            i++;
                                        }
                                        return new AnyOf(jSONSchemaArr3);
                                    }
                                }
                                if (jSONObject.getString(g.y) != null) {
                                    throw new JSONSchemaValidException("not support type : " + jSONObject.getString(g.y));
                                }
                                throw new JSONSchemaValidException("type required");
                            }
                            return new NumberSchema(jSONObject);
                        }
                        return new StringSchema(jSONObject);
                    }
                    return new ArraySchema(jSONObject, jSONSchema);
                }
                return new ObjectSchema(jSONObject, jSONSchema);
            }
            return new IntegerSchema(jSONObject);
        }
        switch (AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[typeOf.ordinal()]) {
            case 1:
                return new StringSchema(jSONObject);
            case 2:
                return new IntegerSchema(jSONObject);
            case 3:
                return new NumberSchema(jSONObject);
            case 4:
                return new BooleanSchema(jSONObject);
            case 5:
                return new NullSchema(jSONObject);
            case 6:
                return new ObjectSchema(jSONObject, jSONSchema);
            case 7:
                return new ArraySchema(jSONObject, jSONSchema);
            default:
                throw new JSONSchemaValidException("not support type : " + typeOf);
        }
    }
}
