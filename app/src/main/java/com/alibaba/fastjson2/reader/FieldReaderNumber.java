package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderNumber<T, V> extends FieldReader<T> {
    public FieldReaderNumber(String str, Class<V> cls, int i, long j, String str2, Locale locale, Number number, JSONSchema jSONSchema, Method method, Field field, BiConsumer<T, V> biConsumer) {
        super(str, cls, cls, i, j, str2, locale, number, jSONSchema, method, field, biConsumer, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) throws Exception {
        Number number;
        try {
            number = jSONReader.readNumber();
        } catch (Exception e) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e;
            }
            number = null;
        }
        this.propertyAccessor.setObject(t, number);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, int i) {
        this.propertyAccessor.setIntValue(t, i);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, long j) {
        this.propertyAccessor.setLongValue(t, j);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readNumber();
    }
}
