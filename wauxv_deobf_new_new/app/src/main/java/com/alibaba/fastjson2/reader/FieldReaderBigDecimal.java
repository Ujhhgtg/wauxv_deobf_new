package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderBigDecimal<T, V> extends FieldReader<T> {
    public FieldReaderBigDecimal(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer<T, V> biConsumer) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        this.propertyAccessor.setObject(t, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) throws Exception {
        BigDecimal bigDecimal;
        try {
            bigDecimal = jSONReader.readBigDecimal();
        } catch (Exception e) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e;
            }
            bigDecimal = null;
        }
        this.propertyAccessor.setObject(t, bigDecimal);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readBigDecimal();
    }
}
