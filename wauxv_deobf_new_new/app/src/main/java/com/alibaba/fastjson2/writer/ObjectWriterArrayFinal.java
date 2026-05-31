package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArrayFinal extends ObjectWriterPrimitiveImpl {
    public final DecimalFormat format;
    final Class itemClass;
    volatile ObjectWriter itemObjectWriter;
    public final boolean refDetect;
    final byte[] typeNameBytes;
    final long typeNameHash;
    public static final ObjectWriterArrayFinal FLOAT_ARRAY = new ObjectWriterArrayFinal(Float.class, null);
    public static final ObjectWriterArrayFinal DOUBLE_ARRAY = new ObjectWriterArrayFinal(Double.class, null);
    public static final ObjectWriterArrayFinal DECIMAL_ARRAY = new ObjectWriterArrayFinal(BigDecimal.class, null);

    public ObjectWriterArrayFinal(Class cls, DecimalFormat decimalFormat) {
        this.itemClass = cls;
        this.format = decimalFormat;
        String str = "[" + TypeUtils.getTypeName(cls);
        this.typeNameBytes = JSONB.toBytes(str);
        this.typeNameHash = Fnv.hashCode64(str);
        this.refDetect = !ObjectWriterProvider.isNotReferenceDetect(cls);
    }

    public ObjectWriter getItemObjectWriter(JSONWriter jSONWriter) {
        ObjectWriter objectWriter;
        ObjectWriter objectWriter2 = this.itemObjectWriter;
        if (objectWriter2 != null) {
            return objectWriter2;
        }
        Class cls = this.itemClass;
        if (cls == Float.class) {
            objectWriter = this.format != null ? new ObjectWriterImplFloat(this.format) : ObjectWriterImplFloat.INSTANCE;
        } else if (cls == Double.class) {
            objectWriter = this.format != null ? new ObjectWriterImplDouble(this.format) : ObjectWriterImplDouble.INSTANCE;
        } else if (cls == BigDecimal.class) {
            objectWriter = this.format != null ? new ObjectWriterImplBigDecimal(this.format, null) : ObjectWriterImplBigDecimal.INSTANCE;
        } else {
            objectWriter = jSONWriter.getObjectWriter(cls);
        }
        this.itemObjectWriter = objectWriter;
        return objectWriter;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String path;
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect) {
            zIsRefDetect = this.refDetect;
        }
        Object[] objArr = (Object[]) obj;
        jSONWriter.startArray();
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                ObjectWriter itemObjectWriter = getItemObjectWriter(jSONWriter);
                if (!zIsRefDetect || (path = jSONWriter.setPath(i, obj3)) == null) {
                    itemObjectWriter.write(jSONWriter, obj3, Integer.valueOf(i), this.itemClass, j);
                    if (zIsRefDetect) {
                        jSONWriter.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        JSONWriter jSONWriter2;
        long j2;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect) {
            zIsRefDetect = this.refDetect;
        }
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(this.typeNameBytes, this.typeNameHash);
        }
        jSONWriter.startArray(objArr.length);
        int i = 0;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                ObjectWriter itemObjectWriter = getItemObjectWriter(jSONWriter);
                if (!zIsRefDetect || (path = jSONWriter.setPath(i, obj3)) == null) {
                    jSONWriter2 = jSONWriter;
                    j2 = j;
                    itemObjectWriter.writeJSONB(jSONWriter2, obj3, Integer.valueOf(i), this.itemClass, j2);
                    if (zIsRefDetect) {
                        jSONWriter2.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
                i++;
                jSONWriter = jSONWriter2;
                j = j2;
            }
            jSONWriter2 = jSONWriter;
            j2 = j;
            i++;
            jSONWriter = jSONWriter2;
            j = j2;
        }
    }
}
