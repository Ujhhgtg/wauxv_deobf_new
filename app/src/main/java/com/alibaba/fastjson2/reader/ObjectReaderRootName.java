package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderRootName<T> extends ObjectReaderAdapter<T> {
    final String rootName;
    final long rootNameHashCode;

    public ObjectReaderRootName(Class cls, String str, String str2, String str3, long j, JSONSchema jSONSchema, Supplier supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, FieldReader[] fieldReaderArr) {
        super(cls, str, str2, j, jSONSchema, supplier, function, clsArr, strArr, cls2, fieldReaderArr);
        this.rootName = str3;
        this.rootNameHashCode = str3 == null ? 0L : Fnv.hashCode64(str3);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j) {
        Map map2 = (Map) map.get(this.rootName);
        if (map2 == null) {
            return null;
        }
        return (T) super.createInstance(map2, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONReader jSONReader2;
        T t = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfObjectStart()) {
            throw new JSONException(jSONReader.info("read rootName error " + this.typeName));
        }
        while (!jSONReader.nextIfObjectEnd()) {
            if (this.rootNameHashCode == jSONReader.readFieldNameHashCode()) {
                Object jSONBObject = super.readJSONBObject(jSONReader, type, obj, j);
                jSONReader2 = jSONReader;
                t = (T) jSONBObject;
            } else {
                jSONReader2 = jSONReader;
                jSONReader2.skipValue();
            }
            jSONReader = jSONReader2;
            type = type;
            obj = obj;
            j = j;
        }
        return t;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONReader jSONReader2;
        T t = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfObjectStart()) {
            throw new JSONException(jSONReader.info("read rootName error " + this.typeName));
        }
        while (!jSONReader.nextIfObjectEnd()) {
            if (this.rootNameHashCode == jSONReader.readFieldNameHashCode()) {
                Object object = super.readObject(jSONReader, type, obj, j);
                jSONReader2 = jSONReader;
                t = (T) object;
            } else {
                jSONReader2 = jSONReader;
                jSONReader2.skipValue();
            }
            jSONReader = jSONReader2;
            type = type;
            obj = obj;
            j = j;
        }
        return t;
    }
}
