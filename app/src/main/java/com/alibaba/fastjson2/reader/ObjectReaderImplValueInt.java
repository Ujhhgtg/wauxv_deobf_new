package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueInt<T> implements ObjectReader<T> {
    final long features;
    final IntFunction<T> function;
    final JSONSchema schema;

    public ObjectReaderImplValueInt(Class<T> cls, long j, JSONSchema jSONSchema, IntFunction<T> intFunction) {
        this.features = j;
        this.schema = jSONSchema;
        this.function = intFunction;
    }

    public static <T> ObjectReaderImplValueInt<T> of(Class<T> cls, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, 0L, null, intFunction);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readObject(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        int int32Value = jSONReader.readInt32Value();
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.validate(int32Value);
        }
        try {
            return this.function.apply(int32Value);
        } catch (Exception e) {
            throw new JSONException(jSONReader.info("create object error"), e);
        }
    }

    public static <T> ObjectReaderImplValueInt<T> of(Class<T> cls, long j, JSONSchema jSONSchema, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, j, jSONSchema, intFunction);
    }
}
