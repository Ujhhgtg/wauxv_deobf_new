package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapTyped implements ObjectReader {
    final Function builder;
    final Constructor defaultConstructor;
    final long features;
    final Class instanceType;
    ObjectReader keyObjectReader;
    final Type keyType;
    final Class mapType;
    final boolean multiValue;
    final Class valueClass;
    ObjectReader valueObjectReader;
    final Type valueType;

    public ObjectReaderImplMapTyped(Class cls, Class cls2, Type type, Type type2, long j, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.mapType = cls;
        this.instanceType = cls2;
        this.keyType = type;
        this.valueType = type2;
        this.valueClass = TypeUtils.getClass(type2);
        this.features = j;
        this.builder = function;
        this.multiValue = cls2 != null && "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
        for (Constructor<?> constructor2 : cls2.getDeclaredConstructors()) {
            if (constructor2.getParameterCount() == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
        }
        this.defaultConstructor = constructor;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Class cls = this.instanceType;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) createInstance(j);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.keyType;
            Object string = (type == null || type == String.class) ? key.toString() : TypeUtils.cast(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.valueType;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(type2);
                    }
                    value = this.valueObjectReader.createInstance((Map) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == TypeUtils.CLASS_JSON_ARRAY_1x) && this.valueClass == List.class) {
                    if (this.valueObjectReader == null) {
                        this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(type2);
                    }
                    value = this.valueObjectReader.createInstance((List) value, j);
                } else {
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, type2);
                    if (typeConvert != null) {
                        value = typeConvert.apply(value);
                    } else if (value instanceof Map) {
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(this.valueType);
                        }
                        value = this.valueObjectReader.createInstance((Map) value, j);
                    } else if ((value instanceof Collection) && !this.multiValue) {
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = defaultObjectReaderProvider.getObjectReader(this.valueType);
                        }
                        value = this.valueObjectReader.createInstance((Collection) value, j);
                    } else if (!cls2.isInstance(value)) {
                        throw new JSONException("can not convert from " + cls2 + " to " + this.valueType);
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.builder;
        return function != null ? function.apply(map2) : map2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.mapType;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Function buildFunction;
        ObjectReader objectReaderCheckAutoType;
        Map map;
        Object fieldName;
        Object obj2;
        Object jSONBObject;
        Object any;
        Type type2;
        Function function = this.builder;
        if (jSONReader.getType() == -110) {
            objectReaderCheckAutoType = jSONReader.checkAutoType(this.mapType, 0L, this.features | j);
            if (objectReaderCheckAutoType == null || objectReaderCheckAutoType == this) {
                buildFunction = function;
            } else {
                buildFunction = objectReaderCheckAutoType.getBuildFunction();
                if (!(objectReaderCheckAutoType instanceof ObjectReaderImplMap) && !(objectReaderCheckAutoType instanceof ObjectReaderImplMapTyped)) {
                    return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
                }
            }
        } else {
            buildFunction = function;
            objectReaderCheckAutoType = null;
        }
        byte type3 = jSONReader.getType();
        if (type3 == -81) {
            jSONReader.next();
            return null;
        }
        if (type3 == -90) {
            jSONReader.next();
        }
        long features = j | jSONReader.getContext().getFeatures();
        if (objectReaderCheckAutoType != null) {
            map = (Map) objectReaderCheckAutoType.createInstance(features);
        } else {
            map = this.instanceType == HashMap.class ? new HashMap() : (Map) createInstance(j);
        }
        Map map2 = map;
        int i = 0;
        while (jSONReader.getType() != -91) {
            if (this.keyType == String.class || jSONReader.isString()) {
                fieldName = jSONReader.readFieldName();
            } else {
                if (jSONReader.isReference()) {
                    String reference = jSONReader.readReference();
                    any = new ReferenceKey(i);
                    jSONReader.addResolveTask(map2, any, JSONPath.of(reference));
                } else {
                    if (this.keyObjectReader == null && (type2 = this.keyType) != null) {
                        this.keyObjectReader = jSONReader.getObjectReader(type2);
                    }
                    ObjectReader objectReader = this.keyObjectReader;
                    if (objectReader == null) {
                        any = jSONReader.readAny();
                    } else {
                        fieldName = objectReader.readJSONBObject(jSONReader, null, null, j);
                    }
                }
                fieldName = any;
            }
            if (jSONReader.isReference()) {
                String reference2 = jSONReader.readReference();
                if ("..".equals(reference2)) {
                    map2.put(fieldName, map2);
                } else {
                    jSONReader.addResolveTask(map2, fieldName, JSONPath.of(reference2));
                    if (!(map2 instanceof ConcurrentMap)) {
                        map2.put(fieldName, null);
                    }
                }
            } else if (jSONReader.nextIfNull()) {
                map2.put(fieldName, null);
            } else {
                if (this.valueType == Object.class) {
                    jSONBObject = jSONReader.readAny();
                    obj2 = fieldName;
                } else {
                    ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(this.valueClass, 0L, j);
                    if (objectReaderCheckAutoType2 == null || objectReaderCheckAutoType2 == this) {
                        obj2 = fieldName;
                        if (this.valueObjectReader == null) {
                            this.valueObjectReader = jSONReader.getObjectReader(this.valueType);
                        }
                        jSONBObject = this.valueObjectReader.readJSONBObject(jSONReader, this.valueType, obj2, j);
                    } else {
                        obj2 = fieldName;
                        jSONBObject = objectReaderCheckAutoType2.readJSONBObject(jSONReader, this.valueType, obj2, j);
                    }
                }
                if (jSONBObject != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & features) == 0) {
                    map2.put(obj2, jSONBObject);
                }
            }
            i++;
            j = j;
        }
        jSONReader.next();
        if (buildFunction != null) {
            return (buildFunction == ObjectReaderImplMap.ENUM_MAP_BUILDER && map2.isEmpty()) ? new EnumMap((Class) this.keyType) : buildFunction.apply(map2);
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Map enumMap;
        ObjectReader objectReader;
        JSONReader jSONReader2;
        Object string;
        JSONReader jSONReader3;
        Map map;
        Object object;
        Object objPut;
        JSONReader jSONReader4 = jSONReader;
        Object objCast = null;
        int i = 0;
        if (!jSONReader4.nextIfObjectStart()) {
            if (!jSONReader4.isTypeRedirect()) {
                if (jSONReader4.nextIfNullOrEmptyString()) {
                    return null;
                }
                throw new JSONException(jSONReader4.info("expect '{', but '" + jSONReader4.current() + "'"));
            }
            jSONReader4.setTypeRedirect(false);
            i = 1;
        }
        JSONReader.Context context = jSONReader4.getContext();
        long features = context.getFeatures() | j;
        Class cls = this.instanceType;
        if (cls == HashMap.class) {
            Supplier<Map> objectSupplier = context.getObjectSupplier();
            if (this.mapType != Map.class || objectSupplier == null) {
                enumMap = new HashMap();
            } else {
                enumMap = (this.keyType == String.class || !objectSupplier.getClass().getName().equals("com.alibaba.fastjson.JSONObject$Creator")) ? TypeUtils.getInnerMap(objectSupplier.get()) : new HashMap();
            }
        } else {
            enumMap = (cls == EnumMap.class && (this.keyType instanceof Class)) ? new EnumMap((Class) this.keyType) : (Map) createInstance(features);
        }
        Map map2 = enumMap;
        int i2 = i;
        while (!jSONReader4.nextIfObjectEnd() && !jSONReader4.isEnd()) {
            if (!jSONReader4.nextIfNull()) {
                if (this.keyType == String.class) {
                    String fieldName = jSONReader4.readFieldName();
                    if (i2 == 0 && (JSONReader.Feature.SupportAutoType.mask & features) != 0 && fieldName.equals(getTypeKey())) {
                        ObjectReader objectReaderAutoType = jSONReader4.getObjectReaderAutoType(jSONReader4.readTypeHashCode(), this.mapType, j);
                        if (objectReaderAutoType != null && (objectReaderAutoType instanceof ObjectReaderImplMap) && !map2.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType).instanceType)) {
                            map2 = (Map) objectReaderAutoType.createInstance(j);
                        }
                    } else {
                        if (fieldName == null) {
                            fieldName = jSONReader4.readString();
                            if (!jSONReader4.nextIfMatch(':')) {
                                throw new JSONException(jSONReader4.info("illegal json"));
                            }
                        }
                        jSONReader3 = jSONReader4;
                        objCast = fieldName;
                    }
                } else if (i2 != 0 || ((!jSONReader4.isEnabled(JSONReader.Feature.SupportAutoType) && jSONReader4.getContext().getContextAutoTypeBeforeHandler() == null) || jSONReader4.current() != '\"')) {
                    objectReader = this.keyObjectReader;
                    if (objectReader != null) {
                        jSONReader2 = jSONReader;
                        string = objectReader.readObject(jSONReader2, null, null, 0L);
                    } else {
                        jSONReader2 = jSONReader;
                        string = jSONReader2.read(this.keyType);
                    }
                    if (string == null && Enum.class.isAssignableFrom((Class) this.keyType)) {
                        string = jSONReader2.getString();
                        jSONReader2.nextIfMatch(':');
                    }
                    if (i2 == 0 || (JSONReader.Feature.SupportAutoType.mask & features) == 0 || !string.equals(getTypeKey())) {
                        jSONReader3 = jSONReader2;
                        jSONReader3.nextIfMatch(':');
                        objCast = string;
                    } else {
                        ObjectReader objectReaderAutoType2 = jSONReader.getObjectReaderAutoType(jSONReader.readTypeHashCode(), this.mapType, j);
                        if (objectReaderAutoType2 != null && (objectReaderAutoType2 instanceof ObjectReaderImplMap) && !map2.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType2).instanceType)) {
                            map = (Map) objectReaderAutoType2.createInstance(j);
                            map2 = map;
                        }
                    }
                } else {
                    Type type2 = this.keyType;
                    if ((type2 instanceof Class) && Enum.class.isAssignableFrom((Class) type2)) {
                        objectReader = this.keyObjectReader;
                        if (objectReader != null) {
                            jSONReader2 = jSONReader;
                            string = objectReader.readObject(jSONReader2, null, null, 0L);
                        } else {
                            jSONReader2 = jSONReader;
                            string = jSONReader2.read(this.keyType);
                        }
                        if (string == null) {
                            string = jSONReader2.getString();
                            jSONReader2.nextIfMatch(':');
                        }
                        if (true) {
                        }
                        jSONReader3 = jSONReader2;
                        jSONReader3.nextIfMatch(':');
                        objCast = string;
                    } else {
                        String fieldName2 = jSONReader4.readFieldName();
                        if (fieldName2.equals(getTypeKey())) {
                            ObjectReader objectReaderAutoType3 = jSONReader4.getObjectReaderAutoType(jSONReader4.readTypeHashCode(), this.mapType, j);
                            if (objectReaderAutoType3 != null && (objectReaderAutoType3 instanceof ObjectReaderImplMap) && !map2.getClass().equals(((ObjectReaderImplMap) objectReaderAutoType3).instanceType)) {
                                map = (Map) objectReaderAutoType3.createInstance(j);
                                map2 = map;
                            }
                        } else {
                            objCast = TypeUtils.cast(fieldName2, this.keyType);
                            jSONReader3 = jSONReader;
                        }
                    }
                }
                i2++;
                jSONReader4 = jSONReader;
                objCast = null;
            } else {
                if (!jSONReader4.nextIfMatch(':')) {
                    throw new JSONException(jSONReader4.info("illegal json"));
                }
                jSONReader3 = jSONReader4;
            }
            if (this.valueObjectReader == null) {
                this.valueObjectReader = jSONReader3.getObjectReader(this.valueType);
            }
            if (jSONReader3.isReference()) {
                String reference = jSONReader3.readReference();
                if ("..".equals(reference)) {
                    object = map2;
                    if ((object == null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & features) == 0) && (objPut = map2.put(objCast, object)) != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & features) != 0) {
                        if (objPut instanceof Collection) {
                            ((Collection) objPut).add(object);
                            map2.put(objCast, objPut);
                        } else {
                            map2.put(objCast, JSONArray.of(objPut, object));
                        }
                    }
                } else {
                    jSONReader3.addResolveTask(map2, objCast, JSONPath.of(reference));
                }
            } else if (this.multiValue && jSONReader3.nextIfArrayStart()) {
                JSONArray jSONArray = new JSONArray();
                while (!jSONReader3.nextIfArrayEnd()) {
                    jSONArray.add(this.valueObjectReader.readObject(jSONReader, this.valueType, obj, 0L));
                    jSONReader3 = jSONReader;
                }
                map2.put(objCast, jSONArray);
            } else {
                object = this.valueObjectReader.readObject(jSONReader, this.valueType, obj, 0L);
                if (object == null) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(object);
                        map2.put(objCast, objPut);
                    } else {
                        map2.put(objCast, JSONArray.of(objPut, object));
                    }
                } else if (objPut instanceof Collection) {
                    ((Collection) objPut).add(object);
                    map2.put(objCast, objPut);
                } else {
                    map2.put(objCast, JSONArray.of(objPut, object));
                }
            }
            i2++;
            jSONReader4 = jSONReader;
            objCast = null;
        }
        jSONReader.nextIfComma();
        Function function = this.builder;
        return function != null ? function.apply(map2) : map2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j) {
        Class cls = this.instanceType;
        if (cls != null && !cls.isInterface()) {
            try {
                Constructor constructor = this.defaultConstructor;
                if (constructor != null) {
                    return constructor.newInstance(null);
                }
                return this.instanceType.newInstance();
            } catch (Exception e) {
                throw new JSONException("create map error", e);
            }
        }
        return new HashMap();
    }
}
