package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMillis<T> extends FieldWriterDate<T> {
    public FieldWriterMillis(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return Long.valueOf(this.propertyAccessor.getLongValue(t));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long longValue = this.propertyAccessor.getLongValue(t);
        if (longValue == 0 && (this.features & JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) != 0) {
            return false;
        }
        writeDate(jSONWriter, longValue);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        writeDate(jSONWriter, false, this.propertyAccessor.getLongValue(t));
    }
}
