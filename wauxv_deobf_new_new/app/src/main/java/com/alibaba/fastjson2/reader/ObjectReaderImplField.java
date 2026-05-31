package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplField implements ObjectReader {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");

    private Field getField(long j, String str, String str2) {
        if ((j & JSONReader.Feature.SupportClassForName.mask) == 0) {
            throw new JSONException("ClassForName not support");
        }
        try {
            return TypeUtils.loadClass(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            throw new JSONException("method not found", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.startArray() == 2) {
            return getField(j | jSONReader.getContext().getFeatures(), jSONReader.readString(), jSONReader.readString());
        }
        throw new JSONException("not support input " + jSONReader.info());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.nextIfArrayStart()) {
            throw new JSONException("not support input " + jSONReader.info());
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getField(jSONReader.getContext().getFeatures() | j, string2, string);
        }
        throw new JSONException("not support input " + jSONReader.info());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readObject(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j) : readArrayMappingObject(jSONReader, type, obj, j);
            }
            throw new JSONException("not support input " + jSONReader.info());
        }
        String string = null;
        String string2 = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == HASH_DECLARING_CLASS) {
                string2 = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_NAME) {
                string = jSONReader.readString();
            } else {
                jSONReader.skipValue();
            }
        }
        if (!jSONReader.jsonb) {
            jSONReader.nextIfComma();
        }
        return getField(j | jSONReader.getContext().getFeatures(), string, string2);
    }
}
