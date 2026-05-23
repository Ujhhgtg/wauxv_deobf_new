package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptional extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplOptional INSTANCE = new ObjectWriterImplOptional(null, null);
    long features;
    final String format;
    final Locale locale;
    Type valueType;

    public ObjectWriterImplOptional(String str, Locale locale) {
        this.format = str;
        this.locale = locale;
    }

    public static ObjectWriterImplOptional of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectWriterImplOptional(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = optional.get();
        Class<?> cls = obj3.getClass();
        String str = this.format;
        ObjectWriter objectWriter = str != null ? FieldWriter.getObjectWriter(null, null, str, this.locale, cls) : null;
        if (objectWriter == null) {
            objectWriter = jSONWriter.getObjectWriter(cls);
        }
        objectWriter.write(jSONWriter, obj3, obj2, this.valueType, this.features);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            jSONWriter.writeNull();
        } else {
            Object obj3 = optional.get();
            jSONWriter.getObjectWriter(obj3.getClass()).writeJSONB(jSONWriter, obj3, obj2, null, j);
        }
    }

    public ObjectWriterImplOptional(Type type, String str, Locale locale) {
        this.valueType = type;
        this.format = str;
        this.locale = locale;
    }
}
