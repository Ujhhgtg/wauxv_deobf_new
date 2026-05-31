package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCalendar<T> extends FieldWriterDate<T> {
    public FieldWriterCalendar(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (this.format == null) {
            ObjectWriterImplCalendar objectWriterImplCalendar = ObjectWriterImplCalendar.INSTANCE;
            this.dateWriter = objectWriterImplCalendar;
            return objectWriterImplCalendar;
        }
        ObjectWriterImplCalendar objectWriterImplCalendar2 = new ObjectWriterImplCalendar(this.format, null);
        this.dateWriter = objectWriterImplCalendar2;
        return objectWriterImplCalendar2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Calendar calendar = (Calendar) this.propertyAccessor.getObject(t);
            if (calendar != null) {
                writeDate(jSONWriter, calendar.getTimeInMillis());
                return true;
            }
            if ((features & 16) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeNull();
            return true;
        } catch (RuntimeException e) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Calendar calendar = (Calendar) this.propertyAccessor.getObject(t);
        if (calendar == null) {
            jSONWriter.writeNull();
        } else {
            writeDate(jSONWriter, false, calendar.getTimeInMillis());
        }
    }
}
