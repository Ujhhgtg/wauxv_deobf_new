package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderAtomicReference<T> extends FieldReader<T> {
    final Type referenceType;

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public FieldReaderAtomicReference(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Method method, Field field) {
        Type type2;
        super(str, type, cls, i, j, str2, null, null, jSONSchema, method, field);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                type2 = actualTypeArguments[0];
            } else {
                type2 = null;
            }
        } else {
            type2 = null;
        }
        this.referenceType = type2;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (obj == null) {
            return;
        }
        if (this.readOnly) {
            ((AtomicReference) this.propertyAccessor.getObject(t)).set(obj);
        } else {
            this.propertyAccessor.setObject(t, new AtomicReference(obj));
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (jSONReader.nextIfNull()) {
            return;
        }
        accept(t, jSONReader.read(this.referenceType));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.read(this.referenceType);
    }
}
