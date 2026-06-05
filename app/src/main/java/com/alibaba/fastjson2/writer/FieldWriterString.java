package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterString<T> extends FieldWriter<T> {
    public FieldWriterString(String str, int i, long j, String str2, Locale locale, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, locale, str3, String.class, String.class, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) throws Exception {
        long features = this.features | jSONWriter.getFeatures();
        try {
            String strTrim = (String) this.propertyAccessor.getObject(t);
            if (strTrim == null) {
                if ((8388688 & features) == 0 || (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & features) != 0) {
                    return false;
                }
            } else if (this.trim) {
                strTrim = strTrim.trim();
            }
            if (strTrim != null && strTrim.isEmpty() && (JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & features) != 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if (strTrim == null) {
                if ((features & 8388672) != 0) {
                    jSONWriter.writeString("");
                } else {
                    jSONWriter.writeNull();
                }
                return true;
            }
            if (this.symbol && jSONWriter.jsonb) {
                jSONWriter.writeSymbol(strTrim);
            } else if (this.raw) {
                jSONWriter.writeRaw(strTrim);
            } else {
                jSONWriter.writeString(strTrim);
            }
            return true;
        } catch (Exception e) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        String strTrim = (String) this.propertyAccessor.getObject(t);
        if (this.trim && strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(strTrim);
        } else if (this.raw) {
            jSONWriter.writeRaw(strTrim);
        } else {
            jSONWriter.writeString(strTrim);
        }
    }
}
