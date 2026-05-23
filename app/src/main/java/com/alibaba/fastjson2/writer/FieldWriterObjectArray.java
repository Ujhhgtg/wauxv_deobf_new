package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterObjectArray<T> extends FieldWriter<T> {
    final Class itemClass;
    ObjectWriter itemObjectWriter;
    final Type itemType;

    public FieldWriterObjectArray(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method, Function function) {
        super(str, i, j, str2, null, str3, type2, cls, field, method, function);
        this.itemType = type;
        if (type instanceof Class) {
            this.itemClass = (Class) type;
        } else {
            this.itemClass = TypeUtils.getMapping(type);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        if (type != null && type != this.itemType) {
            return jSONWriter.getObjectWriter(type, TypeUtils.getClass(type));
        }
        ObjectWriter objectWriter = this.itemObjectWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        if (type == Float[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, this.decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY;
        }
        if (type == Double[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, this.decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY;
        }
        if (type == BigDecimal[].class) {
            return this.decimalFormat != null ? new ObjectWriterArrayFinal(BigDecimal.class, this.decimalFormat) : ObjectWriterArrayFinal.DECIMAL_ARRAY;
        }
        if (type == Float.class) {
            return this.decimalFormat != null ? new ObjectWriterImplFloat(this.decimalFormat) : ObjectWriterImplFloat.INSTANCE;
        }
        if (type == Double.class) {
            return this.decimalFormat != null ? new ObjectWriterImplDouble(this.decimalFormat) : ObjectWriterImplDouble.INSTANCE;
        }
        if (type == BigDecimal.class) {
            return this.decimalFormat != null ? new ObjectWriterImplBigDecimal(this.decimalFormat, null) : ObjectWriterImplBigDecimal.INSTANCE;
        }
        ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(this.itemType, this.itemClass);
        this.itemObjectWriter = objectWriter2;
        return objectWriter2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) getFieldValue(t);
        if (objArr != null) {
            writeArray(jSONWriter, true, objArr);
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeArrayNull();
        return true;
    }

    public void writeArray(JSONWriter jSONWriter, boolean z, Object[] objArr) {
        Class<?> cls;
        Class<?> cls2;
        boolean z2;
        String path;
        String path2;
        JSONWriter jSONWriter2 = jSONWriter;
        long features = this.features | jSONWriter.getFeatures();
        if (objArr.length != 0 || (67108864L & features) == 0) {
            if (z) {
                writeFieldName(jSONWriter);
            }
            boolean zIsRefDetect = jSONWriter.isRefDetect();
            if (zIsRefDetect && (path2 = jSONWriter.setPath(this.fieldName, objArr)) != null) {
                jSONWriter.writeReference(path2);
                return;
            }
            boolean z3 = (features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
            Class<?> cls3 = null;
            if (!jSONWriter2.jsonb) {
                jSONWriter.startArray();
                int i = 0;
                ObjectWriter itemWriter = null;
                while (i < objArr.length) {
                    if (i != 0) {
                        jSONWriter.writeComma();
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        jSONWriter.writeNull();
                    } else if (z3) {
                        jSONWriter.writeString(obj.toString());
                    } else {
                        Class<?> cls4 = obj.getClass();
                        if (cls4 == cls3) {
                            cls = cls3;
                        } else {
                            itemWriter = getItemWriter(jSONWriter, cls4);
                            cls = cls4;
                        }
                        itemWriter.write(jSONWriter2, obj, Integer.valueOf(i), this.itemType, this.features);
                        cls3 = cls;
                    }
                    i++;
                    jSONWriter2 = jSONWriter;
                }
                jSONWriter.endArray();
                return;
            }
            Class<?> cls5 = objArr.getClass();
            if (cls5 != this.fieldClass) {
                jSONWriter.writeTypeName(TypeUtils.getTypeName(cls5));
            }
            int length = objArr.length;
            jSONWriter.startArray(length);
            ObjectWriter objectWriter = null;
            boolean z4 = zIsRefDetect;
            for (int i2 = 0; i2 < length; i2++) {
                boolean z5 = z4;
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    jSONWriter.writeNull();
                    z4 = z5;
                } else {
                    Class<?> cls6 = obj2.getClass();
                    if (cls6 != cls3) {
                        boolean zIsRefDetect2 = jSONWriter.isRefDetect();
                        ObjectWriter itemWriter2 = getItemWriter(jSONWriter, cls6);
                        if (zIsRefDetect2) {
                            zIsRefDetect2 = !ObjectWriterProvider.isNotReferenceDetect(cls6);
                        }
                        z2 = zIsRefDetect2;
                        objectWriter = itemWriter2;
                        cls2 = cls6;
                    } else {
                        cls2 = cls3;
                        z2 = z5;
                    }
                    if (!z2 || (path = jSONWriter.setPath(i2, obj2)) == null) {
                        objectWriter.writeJSONB(jSONWriter2, obj2, Integer.valueOf(i2), this.itemType, this.features);
                        if (z2) {
                            jSONWriter.popPath(obj2);
                        }
                    } else {
                        jSONWriter.writeReference(path);
                        jSONWriter.popPath(obj2);
                    }
                    z4 = z2;
                    cls3 = cls2;
                }
            }
            if (zIsRefDetect) {
                jSONWriter.popPath(objArr);
            }
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) getFieldValue(t);
        if (objArr == null) {
            jSONWriter.writeNull();
        } else {
            writeArray(jSONWriter, false, objArr);
        }
    }
}
