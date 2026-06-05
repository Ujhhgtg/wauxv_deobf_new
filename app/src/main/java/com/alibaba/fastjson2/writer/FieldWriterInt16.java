package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt16<T> extends FieldWriter<T> {
    public FieldWriterInt16(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public short getFieldValueShort(T t) {
        if (t != null) {
            return this.propertyAccessor.getShortValue(t);
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplInt16.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Short sh = (Short) this.propertyAccessor.getObject(t);
            if (sh == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt16(jSONWriter, sh.shortValue());
            return true;
        } catch (RuntimeException e) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e;
        }
    }

    public final void writeInt16(JSONWriter jSONWriter, short s) {
        long features = jSONWriter.getFeatures(this.features);
        if (s == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return;
        }
        if ((features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            writeFieldName(jSONWriter);
            jSONWriter.writeString(Short.toString(s));
        } else {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt16(s);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Short sh = (Short) this.propertyAccessor.getObject(t);
        if (sh == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(sh.shortValue());
        }
    }
}
