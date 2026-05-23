package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt64<T> extends FieldWriter<T> {
    final boolean browserCompatible;

    public FieldWriterInt64(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
        this.browserCompatible = (j & JSONWriter.Feature.BrowserCompatible.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Long l = (Long) this.propertyAccessor.getObject(t);
            if (l != null) {
                writeInt64(jSONWriter, l.longValue());
                return true;
            }
            if ((16777296 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64Null(features);
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
        long features = jSONWriter.getFeatures() | this.features;
        if (j == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return;
        }
        boolean z = false;
        boolean z2 = (features & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        writeFieldName(jSONWriter);
        if (!z2) {
            if (this.browserCompatible && !TypeUtils.isJavaScriptSupport(j) && !jSONWriter.jsonb) {
                z = true;
            }
            z2 = z;
        }
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
