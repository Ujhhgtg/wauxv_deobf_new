package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderCharValue(String str, int i, long j, String str2, Locale locale, Character ch, JSONSchema jSONSchema, Method method, Field field, ObjCharConsumer<T> objCharConsumer, String str3, Parameter parameter) {
        Class cls = Character.TYPE;
        super(str, cls, cls, i, j, str2, locale, ch, jSONSchema, method, field, objCharConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, char c) {
        this.propertyAccessor.setCharValue(t, c);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        char charValue = jSONReader.readCharValue();
        if (charValue == 0 && jSONReader.wasNull()) {
            return;
        }
        this.propertyAccessor.setCharValue(t, charValue);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        String string = jSONReader.readString();
        char cCharAt = 0;
        if (string != null && !string.isEmpty()) {
            cCharAt = string.charAt(0);
        }
        return Character.valueOf(cCharAt);
    }
}
