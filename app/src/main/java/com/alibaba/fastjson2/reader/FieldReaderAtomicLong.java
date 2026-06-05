package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicLong<T> extends FieldReader<T> {
    public FieldReaderAtomicLong(String str, Class cls, int i, JSONSchema jSONSchema, Method method, Field field) {
        super(str, cls, cls, i, 0L, null, null, null, jSONSchema, method, field);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (this.readOnly) {
            if (obj != null) {
                ((AtomicLong) this.propertyAccessor.getObject(t)).set(((Number) obj).longValue());
            }
        } else {
            if (!(obj instanceof AtomicLong) && (obj instanceof Number)) {
                obj = new AtomicLong(((Number) obj).longValue());
            }
            this.propertyAccessor.setObject(t, obj);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        accept(t, jSONReader.readInt64());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        long int64Value = jSONReader.readInt64Value();
        if (jSONReader.wasNull()) {
            return null;
        }
        return new AtomicLong(int64Value);
    }
}
