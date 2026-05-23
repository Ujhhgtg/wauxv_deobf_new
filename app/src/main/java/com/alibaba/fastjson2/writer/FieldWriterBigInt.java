package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigInt<T> extends FieldWriter<T> {
    public FieldWriterBigInt(String str, int i, long j, String str2, Locale locale, String str3, Field field, Method method, Function<T, BigInteger> function) {
        super(str, i, j, str2, locale, str3, BigInteger.class, BigInteger.class, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            BigInteger bigInteger = (BigInteger) this.propertyAccessor.getObject(t);
            if (bigInteger == null && (16777296 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeBigInt(bigInteger, features);
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
        jSONWriter.writeBigInt((BigInteger) this.propertyAccessor.getObject(t), this.features);
    }
}
