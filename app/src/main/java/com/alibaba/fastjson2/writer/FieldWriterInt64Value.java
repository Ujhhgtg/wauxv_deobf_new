package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt64Value<T> extends FieldWriter<T> {
    final boolean browserCompatible;

    public FieldWriterInt64Value(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
        this.browserCompatible = (j & JSONWriter.Feature.BrowserCompatible.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public long getFieldValueLong(T t) {
        if (t != null) {
            return this.propertyAccessor.getLongValue(t);
        }
        throw new RuntimeException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            long longValue = this.propertyAccessor.getLongValue(t);
            if (longValue == 0 && this.defaultValue == null && (features & 4096L) != 0) {
                return false;
            }
            writeInt64(jSONWriter, longValue);
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt64(JSONWriter jSONWriter, long j) {
        boolean z = false;
        boolean z2 = ((jSONWriter.getFeatures() | this.features) & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        if (!z2) {
            if (this.browserCompatible && !TypeUtils.isJavaScriptSupport(j) && !jSONWriter.jsonb) {
                z = true;
            }
            z2 = z;
        }
        writeFieldName(jSONWriter);
        if (z2) {
            jSONWriter.writeString(j);
        } else {
            jSONWriter.writeInt64(j);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Long l = (Long) this.propertyAccessor.getObject(t);
        if (l == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt64(l);
        }
    }
}
