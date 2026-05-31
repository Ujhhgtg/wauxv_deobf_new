package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.ObjDoubleConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDoubleValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderDoubleValue(String str, int i, long j, String str2, Locale locale, Double d, JSONSchema jSONSchema, Method method, Field field, ObjDoubleConsumer<T> objDoubleConsumer, String str3, Parameter parameter) {
        Class cls = Double.TYPE;
        super(str, cls, cls, i, j, str2, locale, d, jSONSchema, method, field, objDoubleConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, double d) {
        this.propertyAccessor.setDoubleValue(t, d);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        this.propertyAccessor.setDoubleValue(t, jSONReader.readDoubleValue());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Double.valueOf(jSONReader.readDoubleValue());
    }
}
