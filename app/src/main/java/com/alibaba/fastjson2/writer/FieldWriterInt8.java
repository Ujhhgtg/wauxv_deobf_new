package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt8<T> extends FieldWriter<T> {
    public FieldWriterInt8(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public byte getFieldValueByte(T t) {
        if (t != null) {
            return this.propertyAccessor.getByteValue(t);
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Byte b = (Byte) this.propertyAccessor.getObject(t);
            if (b == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt8(jSONWriter, b.byteValue());
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    public final boolean writeInt8(JSONWriter jSONWriter, byte b) {
        long features = jSONWriter.getFeatures(this.features);
        if (b == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return false;
        }
        boolean z = (features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        writeFieldName(jSONWriter);
        if (z) {
            jSONWriter.writeString(Byte.toString(b));
        } else {
            jSONWriter.writeInt8(b);
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Byte b = (Byte) this.propertyAccessor.getObject(t);
        if (b == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(b.byteValue());
        }
    }
}
