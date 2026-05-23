package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleValue<T> extends FieldWriterDouble<T> {
    public FieldWriterDoubleValue(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    private void writeDoubleValue(JSONWriter jSONWriter, double d, long j) {
        if (d == 0.0d && (JSONWriter.Feature.NotWriteDefaultValue.mask & j) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(d, decimalFormat);
        } else if ((j & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(d));
        } else {
            jSONWriter.writeDouble(d);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDouble, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            double doubleValue = this.propertyAccessor.getDoubleValue(t);
            if (doubleValue == 0.0d && this.defaultValue == null && (4096L & features) != 0) {
                return false;
            }
            writeDoubleValue(jSONWriter, doubleValue, features);
            return true;
        } catch (RuntimeException e) {
            if ((32768L & features) != 0) {
                return false;
            }
            throw e;
        }
    }
}
