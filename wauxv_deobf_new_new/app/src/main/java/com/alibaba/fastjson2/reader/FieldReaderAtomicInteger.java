package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderAtomicInteger<T> extends FieldReader<T> {
    public FieldReaderAtomicInteger(String str, Class cls, int i, JSONSchema jSONSchema, Method method, Field field) {
        super(str, cls, cls, i, 0L, null, null, null, jSONSchema, method, field);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (this.readOnly) {
            if (obj != null) {
                ((AtomicInteger) this.propertyAccessor.getObject(t)).set(TypeUtils.toIntValue(obj));
            }
        } else {
            if (!(obj instanceof AtomicInteger) && (obj instanceof Number)) {
                obj = new AtomicInteger(((Number) obj).intValue());
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
        accept(t, jSONReader.readInt32());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        int int32Value = jSONReader.readInt32Value();
        if (jSONReader.wasNull()) {
            return null;
        }
        return new AtomicInteger(int32Value);
    }
}
