package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
abstract class ObjectReaderPrimitive<T> implements ObjectReader<T> {
    protected final Class objectClass;

    public ObjectReaderPrimitive(Class cls) {
        this.objectClass = cls;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j) {
        throw new JSONException("createInstance not supported ".concat(this.objectClass.getName()));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.objectClass;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public abstract T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j);
}
