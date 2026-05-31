package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderFloatValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderFloatValue(String str, int i, long j, String str2, Locale locale, Float f, JSONSchema jSONSchema, Method method, Field field, ObjFloatConsumer<T> objFloatConsumer, String str3, Parameter parameter) {
        Class cls = Float.TYPE;
        super(str, cls, cls, i, j, str2, locale, f, jSONSchema, method, field, objFloatConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, float f) {
        this.propertyAccessor.setFloatValue(t, f);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        this.propertyAccessor.setFloatValue(t, jSONReader.readFloatValue());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Float.valueOf(jSONReader.readFloatValue());
    }
}
