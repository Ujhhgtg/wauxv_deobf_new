package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt16Value<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderInt16Value(String str, int i, long j, String str2, Locale locale, Short sh, JSONSchema jSONSchema, Method method, Field field, ObjShortConsumer<T> objShortConsumer, String str3, Parameter parameter) {
        Class cls = Short.TYPE;
        super(str, cls, cls, i, j, str2, locale, sh, jSONSchema, method, field, objShortConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, short s) {
        this.propertyAccessor.setShortValue(t, s);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        this.propertyAccessor.setShortValue(t, (short) jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.readInt32Value());
    }
}
