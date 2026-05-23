package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicLongArrayReadOnly<T> extends FieldReader<T> {
    public FieldReaderAtomicLongArrayReadOnly(String str, Class cls, int i, JSONSchema jSONSchema, Method method, Field field) {
        super(str, cls, cls, i, 0L, null, null, null, jSONSchema, method, field);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.propertyAccessor.getObject(t);
            int i = 0;
            if (obj instanceof AtomicLongArray) {
                AtomicLongArray atomicLongArray2 = (AtomicLongArray) obj;
                while (i < atomicLongArray2.length()) {
                    atomicLongArray.set(i, atomicLongArray2.get(i));
                    i++;
                }
                return;
            }
            List list = (List) obj;
            while (i < list.size()) {
                atomicLongArray.set(i, TypeUtils.toIntValue(list.get(i)));
                i++;
            }
        } catch (Exception e) {
            throw new JSONException(AbstractC2784.m4752(new StringBuilder("set "), this.fieldName, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (jSONReader.readIfNull()) {
            return;
        }
        try {
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.method.invoke(t, null);
            if (jSONReader.nextIfArrayStart()) {
                int i = 0;
                while (!jSONReader.nextIfArrayEnd()) {
                    long int64Value = jSONReader.readInt64Value();
                    if (atomicLongArray != null && i < atomicLongArray.length()) {
                        atomicLongArray.set(i, int64Value);
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            throw new JSONException(jSONReader.info("set " + this.fieldName + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return jSONReader.readArray(Long.class);
    }
}
