package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderAnySetter<T> extends FieldReaderObject<T> {
    public FieldReaderAnySetter(Type type, Class cls, int i, long j, String str, JSONSchema jSONSchema, Method method) {
        super("$$any$$", type, cls, i, j, str, null, null, jSONSchema, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(Object obj, String str, Object obj2) {
        try {
            this.method.invoke(obj, str, obj2);
        } catch (Exception unused) {
            throw new JSONException("any set error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = jSONReader.getObjectReader(this.fieldType);
        this.itemReader = objectReader;
        return objectReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        try {
            this.method.invoke(obj, jSONReader.getFieldName(), getItemObjectReader(jSONReader).readObject(jSONReader, this.fieldType, this.fieldName, 0L));
        } catch (Exception e) {
            throw new JSONException(jSONReader.info("any set error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        throw new UnsupportedOperationException();
    }
}
