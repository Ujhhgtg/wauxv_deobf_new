package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMethod implements ObjectReader<Method> {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");
    static final long HASH_PARAMETER_TYPES = Fnv.hashCode64("parameterTypes");

    private Method getMethod(long j, String str, String str2, List<String> list) {
        Class<?>[] clsArr;
        if ((j & JSONReader.Feature.SupportClassForName.mask) == 0) {
            throw new JSONException("ClassForName not support");
        }
        Class clsLoadClass = TypeUtils.loadClass(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i = 0; i < list.size(); i++) {
                clsArr2[i] = TypeUtils.loadClass(list.get(i));
            }
            clsArr = clsArr2;
        }
        try {
            return clsLoadClass.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new JSONException("method not found", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.startArray() != 3) {
            throw new JSONException("not support input " + jSONReader.info());
        }
        return getMethod(jSONReader.getContext().getFeatures() | j, jSONReader.readString(), jSONReader.readString(), jSONReader.readArray(String.class));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.nextIfArrayStart()) {
            throw new JSONException("not support input " + jSONReader.info());
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        List array = jSONReader.readArray(String.class);
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getMethod(jSONReader.getContext().getFeatures() | j, string2, string, array);
        }
        throw new JSONException("not support input " + jSONReader.info());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readObject(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j) : readArrayMappingObject(jSONReader, type, obj, j);
            }
            throw new JSONException("not support input " + jSONReader.info());
        }
        String string = null;
        String string2 = null;
        List array = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == HASH_DECLARING_CLASS) {
                string2 = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_NAME) {
                string = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_PARAMETER_TYPES) {
                array = jSONReader.readArray(String.class);
            } else {
                jSONReader.skipValue();
            }
        }
        if (!jSONReader.jsonb) {
            jSONReader.nextIfComma();
        }
        return getMethod(jSONReader.getContext().getFeatures() | j, string, string2, array);
    }
}
