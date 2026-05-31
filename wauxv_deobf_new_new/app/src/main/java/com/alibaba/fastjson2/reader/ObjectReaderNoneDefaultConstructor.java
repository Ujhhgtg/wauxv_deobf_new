package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderNoneDefaultConstructor<T> extends ObjectReaderAdapter<T> {
    final BiFunction bifunction;
    final Function<Map<Long, Object>, T> creatorFunction;
    final FactoryFunction factoryFunction;
    final Function function;
    final Constructor noneDefaultConstructor;
    final Map<Long, FieldReader> paramFieldReaderMap;
    final String[] paramNames;
    final FieldReader[] setterFieldReaders;

    public ObjectReaderNoneDefaultConstructor(Class cls, String str, String str2, long j, Function<Map<Long, Object>, T> function, List<Constructor> list, String[] strArr, FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2, Class[] clsArr, String[] strArr2) {
        super(cls, str, str2, j, null, null, null, clsArr, strArr2, null, concat(fieldReaderArr, fieldReaderArr2));
        this.paramNames = strArr;
        this.creatorFunction = function;
        this.setterFieldReaders = fieldReaderArr2;
        this.paramFieldReaderMap = new HashMap();
        for (FieldReader fieldReader : fieldReaderArr) {
            this.paramFieldReaderMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldReader);
        }
        if (this.creatorFunction instanceof ConstructorFunction) {
            this.noneDefaultConstructor = ((ConstructorFunction) function).constructor;
        } else {
            this.noneDefaultConstructor = null;
        }
        if (function instanceof ConstructorFunction) {
            ConstructorFunction constructorFunction = (ConstructorFunction) function;
            this.bifunction = constructorFunction.biFunction;
            this.function = constructorFunction.function;
            this.factoryFunction = null;
            return;
        }
        if (!(function instanceof FactoryFunction)) {
            this.bifunction = null;
            this.function = null;
            this.factoryFunction = null;
        } else {
            FactoryFunction factoryFunction = (FactoryFunction) function;
            this.bifunction = factoryFunction.biFunction;
            this.function = factoryFunction.function;
            this.factoryFunction = factoryFunction;
        }
    }

    public static FieldReader[] concat(FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2) {
        if (fieldReaderArr2 == null) {
            return fieldReaderArr;
        }
        int length = fieldReaderArr.length;
        FieldReader[] fieldReaderArr3 = (FieldReader[]) Arrays.copyOf(fieldReaderArr, fieldReaderArr2.length + length);
        System.arraycopy(fieldReaderArr2, 0, fieldReaderArr3, length, fieldReaderArr2.length);
        return fieldReaderArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Collection collection, long j) {
        Class<?> cls;
        Class<?> cls2;
        Function typeConvert;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                break;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            if (next != null && (cls = next.getClass()) != (cls2 = fieldReader.fieldClass) && (typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, cls2)) != 0) {
                next = typeConvert.apply(next);
            }
            linkedHashMap.put(Long.valueOf(fieldReader.isParameter() ? fieldReader.paramNameHash : fieldReader.fieldNameHash), next);
            i++;
        }
        return createInstanceNoneDefaultConstructor(linkedHashMap);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstanceNoneDefaultConstructor(Map<Long, Object> map) {
        return this.creatorFunction.apply(map);
    }

    public Collection<FieldReader> getParameterFieldReaders() {
        return this.paramFieldReaderMap.values();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Map<Long, Object> map;
        if (jSONReader.jsonb) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        jSONReader.nextIfArrayStart();
        LinkedHashMap linkedHashMap = null;
        int i = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                break;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            Object fieldValue = fieldReader.readFieldValue(jSONReader);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldValue);
            i++;
            linkedHashMap = linkedHashMap;
        }
        if (!jSONReader.nextIfArrayEnd()) {
            throw new JSONException(jSONReader.info("array not end, " + jSONReader.current()));
        }
        jSONReader.nextIfComma();
        if (linkedHashMap == null) {
            map = linkedHashMap;
            map = Collections.EMPTY_MAP;
        }
        map = linkedHashMap;
        return createInstanceNoneDefaultConstructor(map);
    }

    public T readFromCSV(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                jSONReader.nextIfMatch('\n');
                return createInstanceNoneDefaultConstructor(linkedHashMap);
            }
            FieldReader fieldReader = fieldReaderArr[i];
            linkedHashMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldReader.readFieldValue(jSONReader));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor<T>] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        ?? linkedHashMap;
        ObjectReader objectReaderAutoType;
        ObjectReader objectReaderCheckAutoType;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        byte type2 = jSONReader.getType();
        HashMap map = null;
        if (type2 == -81) {
            jSONReader.next();
            return null;
        }
        if (type2 == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j)) != null && objectReaderCheckAutoType != this) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        int i = 0;
        if (!jSONReader.isArray()) {
            jSONReader.nextIfObjectStart();
            int i2 = 0;
            HashMap map2 = null;
            linkedHashMap = 0;
            while (!jSONReader.nextIfObjectEnd()) {
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                if (fieldNameHashCode != 0) {
                    if (fieldNameHashCode == ObjectReader.HASH_TYPE && i2 == 0) {
                        long typeHashCode = jSONReader.readTypeHashCode();
                        JSONReader.Context context = jSONReader.getContext();
                        ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(typeHashCode);
                        if (objectReaderAutoType2 == null) {
                            String string = jSONReader.getString();
                            objectReaderAutoType = context.getObjectReaderAutoType(string, this.objectClass);
                            if (objectReaderAutoType == null) {
                                throw new JSONException(jSONReader.info("autoType not support : " + string));
                            }
                        } else {
                            objectReaderAutoType = objectReaderAutoType2;
                        }
                        T t = (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j);
                        jSONReader.nextIfComma();
                        return t;
                    }
                    FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                    if (fieldReader == null) {
                        processExtra(jSONReader, null);
                    } else if (jSONReader.isReference()) {
                        jSONReader.next();
                        String string2 = jSONReader.readString();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(Long.valueOf(fieldNameHashCode), string2);
                    } else {
                        Object fieldValue = fieldReader.readFieldValue(jSONReader);
                        if (linkedHashMap == 0) {
                            linkedHashMap = linkedHashMap;
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap = linkedHashMap;
                        linkedHashMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldValue);
                    }
                }
                i2++;
                linkedHashMap = linkedHashMap;
            }
            map = map2;
        } else {
            if (!jSONReader.isSupportBeanArray()) {
                throw new JSONException(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            }
            int iStartArray = jSONReader.startArray();
            int i3 = 0;
            linkedHashMap = 0;
            while (i3 < iStartArray) {
                FieldReader fieldReader2 = this.fieldReaders[i3];
                Object fieldValue2 = fieldReader2.readFieldValue(jSONReader);
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(fieldReader2.fieldNameHash), fieldValue2);
                i3++;
                linkedHashMap = linkedHashMap;
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        T t2 = (T) createInstanceNoneDefaultConstructor(linkedHashMap);
        if (this.setterFieldReaders != null) {
            while (true) {
                FieldReader[] fieldReaderArr = this.setterFieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader3 = fieldReaderArr[i];
                fieldReader3.accept(t2, linkedHashMap.get(Long.valueOf(fieldReader3.fieldNameHash)));
                i++;
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                FieldReader fieldReader4 = getFieldReader(l.longValue());
                if ("..".equals(str)) {
                    fieldReader4.accept(t2, t2);
                } else {
                    fieldReader4.addResolveTask(jSONReader, t2, str);
                }
            }
        }
        return t2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        String str;
        String str2;
        FieldReader fieldReaderLCase;
        Class cls;
        Class cls2;
        Map<Long, Object> map;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        int i = 0;
        LinkedHashMap linkedHashMap = null;
        if (jSONReader.isSupportBeanArray(j | this.features) && jSONReader.nextIfArrayStart()) {
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader = fieldReaderArr[i];
                Object fieldValue = fieldReader.readFieldValue(jSONReader);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(fieldReader.fieldNameHash), fieldValue);
                i++;
                linkedHashMap = linkedHashMap;
            }
            if (!jSONReader.nextIfArrayEnd()) {
                throw new JSONException(jSONReader.info("array not end, " + jSONReader.current()));
            }
            jSONReader.nextIfComma();
            if (linkedHashMap == null) {
                map = linkedHashMap;
                map = Collections.EMPTY_MAP;
            }
            map = linkedHashMap;
            return createInstanceNoneDefaultConstructor(map);
        }
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isTypeRedirect()) {
                jSONReader.setTypeRedirect(false);
            } else if (jSONReader.nextIfNullOrEmptyString()) {
                return null;
            }
        }
        JSONReader.Context context = jSONReader.getContext();
        long features = this.features | j | context.getFeatures();
        int i2 = 0;
        LinkedHashMap linkedHashMap2 = null;
        IdentityHashMap identityHashMap = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.typeKeyHashCode && i2 == 0) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    if (typeHashCode != this.typeNameHash) {
                        ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & features) != 0 ? jSONReader.getObjectReaderAutoType(typeHashCode, this.objectClass, this.features) : context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass);
                        if (objectReaderAutoType == null) {
                            objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass, this.features);
                        }
                        ObjectReader objectReader = objectReaderAutoType;
                        if (objectReader != null) {
                            T t = (T) objectReader.readObject(jSONReader, type, obj, 0L);
                            jSONReader.nextIfComma();
                            return t;
                        }
                    }
                } else if (!jSONReader.nextIfNull()) {
                    FieldReader fieldReader2 = getFieldReader(fieldNameHashCode);
                    FieldReader fieldReader3 = this.paramFieldReaderMap.get(Long.valueOf(fieldNameHashCode));
                    if (fieldReader3 != null && fieldReader2 != null && (cls2 = fieldReader3.fieldClass) != null && !cls2.equals(fieldReader2.fieldClass)) {
                        fieldReader2 = fieldReader3;
                    }
                    if (fieldReader2 == null && (JSONReader.Feature.SupportSmartMatch.mask & features) != 0) {
                        fieldReader2 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                        if (fieldReader2 == null) {
                            String fieldName = jSONReader.getFieldName();
                            if (fieldName.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(fieldName.substring(2)))) != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
                                fieldReader2 = fieldReaderLCase;
                            }
                        }
                        if (fieldReader2 != null && linkedHashMap2 != null && linkedHashMap2.containsKey(Long.valueOf(fieldReader2.fieldNameHash))) {
                            fieldReader2 = null;
                        }
                    }
                    if (fieldReader2 == null) {
                        processExtra(jSONReader, null);
                    } else if (jSONReader.isReference()) {
                        String reference = jSONReader.readReference();
                        if (identityHashMap == null) {
                            identityHashMap = new IdentityHashMap();
                        }
                        identityHashMap.put(fieldReader2, reference);
                    } else {
                        Object fieldValue2 = fieldReader2.readFieldValue(jSONReader);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                        }
                        linkedHashMap2.put(Long.valueOf(fieldReader2.isParameter() ? fieldReader2.paramNameHash : fieldReader2.fieldNameHash), fieldValue2);
                    }
                }
            }
            i2++;
        }
        if (this.hasDefaultValue) {
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            for (FieldReader fieldReader4 : this.fieldReaders) {
                if (fieldReader4.defaultValue != null) {
                    linkedHashMap2.putIfAbsent(Long.valueOf(fieldReader4.fieldNameHash), fieldReader4.defaultValue);
                }
            }
        }
        T tApply = this.creatorFunction.apply(linkedHashMap2 == null ? Collections.EMPTY_MAP : linkedHashMap2);
        if (this.setterFieldReaders != null && linkedHashMap2 != null) {
            while (true) {
                FieldReader[] fieldReaderArr2 = this.setterFieldReaders;
                if (i >= fieldReaderArr2.length) {
                    break;
                }
                FieldReader fieldReader5 = fieldReaderArr2[i];
                FieldReader fieldReader6 = this.paramFieldReaderMap.get(Long.valueOf(fieldReader5.fieldNameHash));
                if ((fieldReader6 == null || fieldReader6.fieldClass.equals(fieldReader5.fieldClass)) && (obj2 = linkedHashMap2.get(Long.valueOf(fieldReader5.fieldNameHash))) != null && (fieldReader6 == null || ((str = fieldReader6.fieldName) != null && (str2 = fieldReader5.fieldName) != null && str.equals(str2)))) {
                    fieldReader5.accept(tApply, obj2);
                }
                i++;
            }
        }
        if (identityHashMap != null) {
            for (Map.Entry entry : identityHashMap.entrySet()) {
                ((FieldReader) entry.getKey()).addResolveTask(jSONReader, tApply, (String) entry.getValue());
            }
        }
        jSONReader.nextIfComma();
        return tApply;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.fastjson2.reader.ObjectReader, com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor, com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor<T>] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.function.Function] */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j) {
        Class<?> cls;
        Class<?> cls2;
        Type type;
        ?? typeConvert;
        long j2;
        Class<?> cls3;
        Class<?> cls4;
        ?? typeConvert2;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(getTypeKey());
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & j) != 0 ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return (T) objectReaderAutoType.createInstance(map, j);
            }
        }
        ?? linkedHashMap = 0;
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            FieldReader fieldReader = getFieldReader(string);
            if (fieldReader != null) {
                if (value != null && (cls3 = value.getClass()) != (cls4 = fieldReader.fieldClass) && (typeConvert2 = defaultObjectReaderProvider.getTypeConvert(cls3, cls4)) != 0) {
                    value = typeConvert2.apply(value);
                }
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                if (fieldReader.isParameter()) {
                    j2 = fieldReader.paramNameHash;
                } else {
                    j2 = fieldReader.fieldNameHash;
                }
                linkedHashMap.put(Long.valueOf(j2), value);
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        T t = (T) createInstanceNoneDefaultConstructor(linkedHashMap);
        if (this.setterFieldReaders != null) {
            int i = 0;
            while (true) {
                FieldReader[] fieldReaderArr = this.setterFieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader2 = fieldReaderArr[i];
                Object objCreateInstance = map.get(fieldReader2.fieldName);
                if (objCreateInstance != null) {
                    Field field = fieldReader2.field;
                    if (field != null && Modifier.isFinal(field.getModifiers())) {
                        try {
                            Object objInvoke = fieldReader2.method.invoke(t, null);
                            if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                                cls = objCreateInstance.getClass();
                                cls2 = fieldReader2.fieldClass;
                                type = fieldReader2.fieldType;
                                if (!(type instanceof Class)) {
                                    objCreateInstance = TypeUtils.cast(objCreateInstance, type, defaultObjectReaderProvider);
                                } else if (cls != cls2) {
                                    typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, cls2);
                                    if (typeConvert != 0) {
                                        objCreateInstance = typeConvert.apply(objCreateInstance);
                                    } else if (objCreateInstance instanceof Map) {
                                        objCreateInstance = fieldReader2.getObjectReader(JSONFactory.createReadContext(defaultObjectReaderProvider, new JSONReader.Feature[0])).createInstance((Map) objCreateInstance, fieldReader2.features | j);
                                    }
                                }
                                fieldReader2.accept(t, objCreateInstance);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        cls = objCreateInstance.getClass();
                        cls2 = fieldReader2.fieldClass;
                        type = fieldReader2.fieldType;
                        if (!(type instanceof Class)) {
                            objCreateInstance = TypeUtils.cast(objCreateInstance, type, defaultObjectReaderProvider);
                        } else if (cls != cls2) {
                            typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, cls2);
                            if (typeConvert != 0) {
                                objCreateInstance = typeConvert.apply(objCreateInstance);
                            } else if (objCreateInstance instanceof Map) {
                                objCreateInstance = fieldReader2.getObjectReader(JSONFactory.createReadContext(defaultObjectReaderProvider, new JSONReader.Feature[0])).createInstance((Map) objCreateInstance, fieldReader2.features | j);
                            }
                        }
                        fieldReader2.accept(t, objCreateInstance);
                    }
                }
                i++;
            }
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T createInstance(Object[] objArr) {
        try {
            Function function = this.function;
            if (function != 0) {
                return (T) function.apply(objArr[0]);
            }
            BiFunction biFunction = this.bifunction;
            if (biFunction != 0) {
                return (T) biFunction.apply(objArr[0], objArr[1]);
            }
            FactoryFunction factoryFunction = this.factoryFunction;
            if (factoryFunction != null) {
                return (T) factoryFunction.createInstance(objArr);
            }
            return (T) this.noneDefaultConstructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            e = e;
            throw new JSONException("invoke constructor error, " + this.constructor, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new JSONException("invoke constructor error, " + this.constructor, e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new JSONException("invoke constructor error, " + this.constructor, e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new JSONException("invoke constructor error, " + this.constructor, e);
        }
    }
}
