package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatValue<T> extends FieldWriterFloat<T> {
    public FieldWriterFloatValue(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    private void writeFloatValue(JSONWriter jSONWriter, float f, long j) {
        if (f == 0.0f && (JSONWriter.Feature.NotWriteDefaultValue.mask & j) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(f, decimalFormat);
        } else if ((j & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(f));
        } else {
            jSONWriter.writeFloat(f);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterFloat, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            float floatValue = this.propertyAccessor.getFloatValue(t);
            if (floatValue == 0.0f && this.defaultValue == null && (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & features) != 0) {
                return false;
            }
            writeFloatValue(jSONWriter, floatValue, features);
            return true;
        } catch (RuntimeException e) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e;
        }
    }
}
