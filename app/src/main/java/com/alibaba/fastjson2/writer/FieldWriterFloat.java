package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterFloat<T> extends FieldWriter<T> {
    public FieldWriterFloat(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public float getFieldValueFloat(T t) {
        if (t != null) {
            return this.propertyAccessor.getFloatValue(t);
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Float f = (Float) this.propertyAccessor.getObject(t);
            if (f == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFloatValue(jSONWriter, f, features);
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    public final void writeFloatValue(JSONWriter jSONWriter, Float f, long j) {
        float fFloatValue = f.floatValue();
        if (fFloatValue == 0.0f && (JSONWriter.Feature.NotWriteDefaultValue.mask & j) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else if ((j & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(fFloatValue));
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Float f = (Float) this.propertyAccessor.getObject(t);
        if (f == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        float fFloatValue = f.floatValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
