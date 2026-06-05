package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterObjectFinal<T> extends FieldWriterObject<T> {
    final Class fieldClass;
    final Type fieldType;
    volatile ObjectWriter objectWriter;
    final boolean refDetect;

    public FieldWriterObjectFinal(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, function);
        this.fieldType = type;
        this.fieldClass = cls;
        this.refDetect = !ObjectWriterProvider.isNotReferenceDetect(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (this.fieldClass != cls) {
            return super.getObjectWriter(jSONWriter, cls);
        }
        if (this.objectWriter != null) {
            return this.objectWriter;
        }
        ObjectWriter objectWriter = super.getObjectWriter(jSONWriter, cls);
        this.objectWriter = objectWriter;
        return objectWriter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        FieldWriterObjectFinal<T> fieldWriterObjectFinal;
        JSONWriter jSONWriter2;
        try {
            Object fieldValue = getFieldValue(t);
            if (fieldValue == null) {
                if (((this.features | jSONWriter.getFeatures()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                if (this.fieldClass.isArray()) {
                    jSONWriter.writeArrayNull();
                } else {
                    Class<?> cls = this.fieldClass;
                    if (cls == StringBuffer.class || cls == StringBuilder.class) {
                        jSONWriter.writeStringNull();
                    } else {
                        jSONWriter.writeObjectNull(cls);
                    }
                }
                return true;
            }
            ObjectWriter objectWriter = getObjectWriter(jSONWriter, this.fieldClass);
            if (this.unwrapped) {
                jSONWriter2 = jSONWriter;
                fieldWriterObjectFinal = this;
                if (writeWithUnwrapped(jSONWriter2, fieldValue, this.features, this.refDetect, objectWriter)) {
                    objectWriter = objectWriter;
                    return true;
                }
            } else {
                fieldWriterObjectFinal = this;
                jSONWriter2 = jSONWriter;
            }
            objectWriter = objectWriter;
            writeFieldName(jSONWriter2);
            if (jSONWriter2.jsonb) {
                objectWriter.writeJSONB(jSONWriter2, fieldValue, fieldWriterObjectFinal.fieldName, fieldWriterObjectFinal.fieldType, fieldWriterObjectFinal.features);
            } else {
                objectWriter.write(jSONWriter2, fieldValue, fieldWriterObjectFinal.fieldName, fieldWriterObjectFinal.fieldType, fieldWriterObjectFinal.features);
            }
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        JSONWriter jSONWriter2;
        Object fieldValue = getFieldValue(t);
        if (fieldValue == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean z = this.refDetect && jSONWriter.isRefDetect();
        if (z) {
            if (fieldValue == t) {
                jSONWriter.writeReference("..");
                return;
            }
            String path = jSONWriter.setPath(this.fieldName, fieldValue);
            if (path != null) {
                jSONWriter.writeReference(path);
                jSONWriter.popPath(fieldValue);
                return;
            }
        }
        ObjectWriter objectWriter = getObjectWriter(jSONWriter, this.fieldClass);
        boolean z2 = (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.BeanToArray.mask) != 0;
        if (jSONWriter.jsonb) {
            if (z2) {
                jSONWriter2 = jSONWriter;
                objectWriter.writeArrayMappingJSONB(jSONWriter2, fieldValue, this.fieldName, this.fieldType, this.features);
            } else {
                jSONWriter2 = jSONWriter;
                objectWriter.writeJSONB(jSONWriter2, fieldValue, this.fieldName, this.fieldType, this.features);
            }
        } else if (z2) {
            jSONWriter2 = jSONWriter;
            objectWriter.writeArrayMapping(jSONWriter2, fieldValue, this.fieldName, this.fieldType, this.features);
        } else {
            jSONWriter2 = jSONWriter;
            objectWriter.write(jSONWriter2, fieldValue, this.fieldName, this.fieldType, this.features);
        }
        if (z) {
            jSONWriter2.popPath(fieldValue);
        }
    }
}
