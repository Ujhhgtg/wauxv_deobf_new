package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterChar<T> extends FieldWriter<T> {
    public FieldWriterChar(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public char getFieldValueChar(T t) {
        if (t != null) {
            return this.propertyAccessor.getCharValue(t);
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Character ch = (Character) this.propertyAccessor.getObject(t);
            if (ch != null) {
                return writeChar(jSONWriter, ch.charValue());
            }
            if ((80 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if ((features & 64) == 0) {
                jSONWriter.writeNull();
                return true;
            }
            jSONWriter.writeString("\u0000");
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    public final boolean writeChar(JSONWriter jSONWriter, char c) {
        if (c == 0 && (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0 && this.defaultValue == null) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeChar(c);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Character ch = (Character) this.propertyAccessor.getObject(t);
        if (ch == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeChar(ch.charValue());
        }
    }
}
