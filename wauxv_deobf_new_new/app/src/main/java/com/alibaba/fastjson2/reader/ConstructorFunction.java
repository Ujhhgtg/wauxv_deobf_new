package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorFunction<T> implements Function<Map<Long, Object>, T> {
    Map<Set<Long>, Type[]> alternateConstructorArgTypes;
    Map<Set<Long>, Constructor> alternateConstructorMap;
    Map<Set<Long>, long[]> alternateConstructorNameHashCodes;
    Map<Set<Long>, String[]> alternateConstructorNames;
    final List<Constructor> alternateConstructors;
    final BiFunction biFunction;
    final Constructor constructor;
    final Function function;
    final long[] hashCodes;
    final boolean marker;
    final String[] paramNames;
    final Parameter[] parameters;

    public ConstructorFunction(List<Constructor> list, Constructor constructor, Function function, BiFunction biFunction, Constructor constructor2, String... strArr) {
        this.function = function;
        this.biFunction = biFunction;
        boolean z = constructor2 != null;
        this.marker = z;
        this.constructor = z ? constructor2 : constructor;
        Parameter[] parameters = constructor.getParameters();
        this.parameters = parameters;
        this.paramNames = strArr;
        this.hashCodes = new long[parameters.length];
        int i = 0;
        while (true) {
            Parameter[] parameterArr = this.parameters;
            if (i >= parameterArr.length) {
                break;
            }
            String name = i < strArr.length ? strArr[i] : parameterArr[i].getName();
            if (name == null) {
                name = AbstractC1095.m2794(i, "arg");
            }
            this.hashCodes[i] = Fnv.hashCode64(name);
            i++;
        }
        this.alternateConstructors = list;
        if (list != null) {
            int size = list.size();
            this.alternateConstructorMap = new HashMap(size, 1.0f);
            this.alternateConstructorNames = new HashMap(size, 1.0f);
            this.alternateConstructorArgTypes = new HashMap(size, 1.0f);
            this.alternateConstructorNameHashCodes = new HashMap(size, 1.0f);
            for (int i2 = 0; i2 < size; i2++) {
                Constructor constructor3 = list.get(i2);
                constructor3.setAccessible(true);
                String[] strArrLookupParameterNames = ASMUtils.lookupParameterNames(constructor3);
                Parameter[] parameters2 = constructor3.getParameters();
                FieldInfo fieldInfo = new FieldInfo();
                ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
                for (int i3 = 0; i3 < parameters2.length && i3 < strArrLookupParameterNames.length; i3++) {
                    fieldInfo.init();
                    defaultObjectReaderProvider.getFieldInfo(fieldInfo, constructor3.getDeclaringClass(), constructor3, i3, parameters2[i3]);
                    String str = fieldInfo.fieldName;
                    if (str != null) {
                        strArrLookupParameterNames[i3] = str;
                    }
                }
                long[] jArr = new long[strArrLookupParameterNames.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(strArrLookupParameterNames.length);
                for (int i4 = 0; i4 < strArrLookupParameterNames.length; i4++) {
                    long jHashCode64 = Fnv.hashCode64(strArrLookupParameterNames[i4]);
                    jArr[i4] = jHashCode64;
                    hashSet.add(Long.valueOf(jHashCode64));
                }
                this.alternateConstructorMap.put(hashSet, constructor3);
                this.alternateConstructorNames.put(hashSet, strArrLookupParameterNames);
                this.alternateConstructorNameHashCodes.put(hashSet, jArr);
                this.alternateConstructorArgTypes.put(hashSet, genericParameterTypes);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public T apply(Map<Long, Object> map) {
        Set<Long> setKeySet;
        Constructor constructor;
        int i = 0;
        for (long j : this.hashCodes) {
            if (!map.containsKey(Long.valueOf(j))) {
                if (this.alternateConstructorMap == null || (constructor = this.alternateConstructorMap.get((setKeySet = map.keySet()))) == null) {
                    break;
                    break;
                }
                long[] jArr = this.alternateConstructorNameHashCodes.get(setKeySet);
                Type[] typeArr = this.alternateConstructorArgTypes.get(setKeySet);
                Object[] objArr = new Object[jArr.length];
                while (i < jArr.length) {
                    Object defaultValue = map.get(Long.valueOf(jArr[i]));
                    Type type = typeArr[i];
                    if (defaultValue == null) {
                        defaultValue = TypeUtils.getDefaultValue(type);
                    }
                    objArr[i] = defaultValue;
                    i++;
                }
                try {
                    return (T) constructor.newInstance(objArr);
                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                    throw new JSONException("invoke constructor error, " + constructor, e);
                }
            }
        }
        if (this.function != null) {
            Parameter[] parameterArr = this.parameters;
            if (parameterArr.length == 1) {
                Parameter parameter = parameterArr[0];
                Object objCast = map.get(Long.valueOf(this.hashCodes[0]));
                Class<?> type2 = parameter.getType();
                if (objCast == null) {
                    objCast = TypeUtils.getDefaultValue(type2);
                } else if (!type2.isInstance(objCast)) {
                    objCast = TypeUtils.cast(objCast, (Class<Object>) type2);
                }
                return (T) this.function.apply(objCast);
            }
        }
        if (this.biFunction != null && this.parameters.length == 2) {
            Object objCast2 = map.get(Long.valueOf(this.hashCodes[0]));
            Class<?> type3 = this.parameters[0].getType();
            if (objCast2 == null) {
                objCast2 = TypeUtils.getDefaultValue(type3);
            } else if (!type3.isInstance(objCast2)) {
                objCast2 = TypeUtils.cast(objCast2, (Class<Object>) type3);
            }
            Object objCast3 = map.get(Long.valueOf(this.hashCodes[1]));
            Class<?> type4 = this.parameters[1].getType();
            if (objCast3 == null) {
                objCast3 = TypeUtils.getDefaultValue(type4);
            } else if (!type4.isInstance(objCast3)) {
                objCast3 = TypeUtils.cast(objCast3, (Class<Object>) type4);
            }
            return (T) this.biFunction.apply(objCast2, objCast3);
        }
        int length = this.parameters.length;
        Object[] objArr2 = new Object[this.constructor.getParameterCount()];
        if (this.marker) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Parameter parameter2 = this.parameters[i2];
                Class<?> type5 = parameter2.getType();
                Type parameterizedType = parameter2.getParameterizedType();
                Object objCast4 = map.get(Long.valueOf(this.hashCodes[i2]));
                if (objCast4 != null) {
                    if (!type5.isInstance(objCast4)) {
                        objCast4 = TypeUtils.cast(objCast4, (Class<Object>) type5);
                    } else if (parameterizedType instanceof ParameterizedType) {
                        objCast4 = TypeUtils.cast(objCast4, parameterizedType);
                    }
                    objArr2[i2] = objCast4;
                } else {
                    i3 |= 1 << i2;
                    if (type5.isPrimitive()) {
                        objArr2[i2] = TypeUtils.getDefaultValue(type5);
                    }
                }
                int i4 = i2 + 1;
                if (i4 % 32 == 0 || i4 == length) {
                    objArr2[(i2 / 32) + length] = Integer.valueOf(i3);
                    i3 = 0;
                }
                i2 = i4;
            }
        } else {
            while (i < length) {
                Parameter parameter3 = this.parameters[i];
                Class<?> type6 = parameter3.getType();
                Type parameterizedType2 = parameter3.getParameterizedType();
                Object objCast5 = map.get(Long.valueOf(this.hashCodes[i]));
                if (objCast5 == null) {
                    objCast5 = TypeUtils.getDefaultValue(type6);
                } else if (!type6.isInstance(objCast5)) {
                    objCast5 = TypeUtils.cast(objCast5, (Class<Object>) type6);
                } else if (parameterizedType2 instanceof ParameterizedType) {
                    objCast5 = TypeUtils.cast(objCast5, parameterizedType2);
                }
                objArr2[i] = objCast5;
                i++;
            }
        }
        try {
            return (T) this.constructor.newInstance(objArr2);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
            throw new JSONException("invoke constructor error, " + this.constructor, e2);
        }
    }
}
