package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterLocalDate<T> extends FieldWriterObjectFinal<T> {
    public FieldWriterLocalDate(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObjectFinal, com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        LocalDate localDate = (LocalDate) this.propertyAccessor.getObject(t);
        if (localDate == null) {
            if (((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeNull();
            return true;
        }
        writeFieldName(jSONWriter);
        if (this.objectWriter == null) {
            this.objectWriter = getObjectWriter(jSONWriter, LocalDate.class);
        }
        if (this.objectWriter != ObjectWriterImplLocalDate.INSTANCE) {
            this.objectWriter.write(jSONWriter, localDate, this.fieldName, ((FieldWriterObjectFinal) this).fieldClass, this.features);
        } else {
            jSONWriter.writeLocalDate(localDate);
        }
        return true;
    }
}
