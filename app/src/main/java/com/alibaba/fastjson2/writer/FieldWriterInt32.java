package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt32<T> extends FieldWriter<T> {
    final boolean toString;

    public FieldWriterInt32(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
        this.toString = (j & 256) != 0 || "string".equals(str2);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        try {
            return this.propertyAccessor.getObject(t);
        } catch (Throwable th) {
            throw errorOnGet(th);
        }
    }

    public int getFieldValueInt(T t) {
        if (t != null) {
            return this.propertyAccessor.getIntValue(t);
        }
        throw new JSONException("field.get error, ".concat(this.fieldName));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplInt32.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Integer num = (Integer) this.propertyAccessor.getObject(t);
            if (num == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt32(jSONWriter, num.intValue());
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt32(JSONWriter jSONWriter, int i) {
        long features = jSONWriter.getFeatures() | this.features;
        if (i == 0 && (features & 4096L) != 0 && this.defaultValue == null) {
            return;
        }
        if (this.toString) {
            writeFieldName(jSONWriter);
            jSONWriter.writeString(Integer.toString(i));
            return;
        }
        writeFieldName(jSONWriter);
        String str = this.format;
        if (str != null) {
            jSONWriter.writeInt32(i, str);
        } else {
            jSONWriter.writeInt32(i);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Integer num = (Integer) this.propertyAccessor.getObject(t);
        if (num == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(num);
        }
    }
}
