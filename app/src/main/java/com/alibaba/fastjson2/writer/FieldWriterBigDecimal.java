package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimal<T> extends FieldWriter<T> {
    public FieldWriterBigDecimal(String str, int i, long j, String str2, Locale locale, String str3, Field field, Method method, Function<T, BigDecimal> function) {
        super(str, i, j, str2, locale, str3, BigDecimal.class, BigDecimal.class, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            BigDecimal bigDecimal = (BigDecimal) this.propertyAccessor.getObject(t);
            if (bigDecimal == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeDecimal(bigDecimal, features, this.decimalFormat);
            return true;
        } catch (RuntimeException e) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        jSONWriter.writeDecimal((BigDecimal) this.propertyAccessor.getObject(t), this.features, this.decimalFormat);
    }
}
