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
class FieldWriterDouble<T> extends FieldWriter<T> {
    public FieldWriterDouble(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public double getFieldValueDouble(T t) {
        if (t != null) {
            return this.propertyAccessor.getDoubleValue(t);
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Double d = (Double) this.propertyAccessor.getObject(t);
            if (d == null) {
                return writeFloatNull(jSONWriter);
            }
            writeDoubleValue(jSONWriter, d, features);
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    public final void writeDoubleValue(JSONWriter jSONWriter, Double d, long j) {
        double dDoubleValue = d.doubleValue();
        if (dDoubleValue == 0.0d && (JSONWriter.Feature.NotWriteDefaultValue.mask & j) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dDoubleValue, decimalFormat);
        } else if ((j & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(dDoubleValue));
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Double d = (Double) this.propertyAccessor.getObject(t);
        if (d == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        double dDoubleValue = d.doubleValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dDoubleValue, decimalFormat);
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }
}
