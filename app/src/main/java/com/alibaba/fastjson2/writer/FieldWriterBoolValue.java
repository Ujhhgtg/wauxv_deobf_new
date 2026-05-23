package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBoolValue<T> extends FieldWriterBool<T> {
    public FieldWriterBoolValue(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterBool, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            boolean booleanValue = this.propertyAccessor.getBooleanValue(t);
            if (!booleanValue && this.defaultValue == null && (features & 4096L) != 0) {
                return false;
            }
            writeBool(jSONWriter, booleanValue);
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }
}
