package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterArray INSTANCE = new ObjectWriterArray(Object.class);
    final Type itemType;
    final byte[] prefixBytes;
    final char[] prefixChars;
    final byte[] typeNameBytes;
    final long typeNameHash;

    public ObjectWriterArray(Type type) {
        String strM4757;
        this.itemType = type;
        if (type == Object.class) {
            this.typeNameBytes = JSONB.toBytes("[O");
            this.typeNameHash = Fnv.hashCode64("[0");
            strM4757 = "{\"@type\":\"[O";
        } else {
            String str = "[" + TypeUtils.getTypeName((Class) type);
            this.typeNameBytes = JSONB.toBytes(str);
            this.typeNameHash = Fnv.hashCode64(str);
            strM4757 = AbstractC2784.m4757("{\"@type\":\"", str);
        }
        String strM4748 = AbstractC2784.m4748(strM4757, "\",\"@value\":[");
        this.prefixChars = strM4748.toCharArray();
        this.prefixBytes = strM4748.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        ObjectWriter objectWriter;
        Class<?> cls;
        String path;
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsWriteTypeInfo = jSONWriter.isWriteTypeInfo(obj, type);
        if (!zIsWriteTypeInfo) {
            jSONWriter.startArray();
        } else if (jSONWriter.utf16) {
            jSONWriter.writeRaw(this.prefixChars);
        } else {
            jSONWriter.writeRaw(this.prefixBytes);
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        Object[] objArr = (Object[]) obj;
        Class<?> cls2 = null;
        ObjectWriter objectWriter2 = null;
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            ObjectWriter objectWriter3 = objectWriter2;
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.writeNull();
                objectWriter2 = objectWriter3;
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 == cls2) {
                    cls = cls2;
                    objectWriter = objectWriter3;
                } else {
                    zIsRefDetect = jSONWriter.isRefDetect();
                    objectWriter = jSONWriter.getObjectWriter(cls3);
                    if (zIsRefDetect) {
                        zIsRefDetect = !ObjectWriterProvider.isNotReferenceDetect(cls3);
                    }
                    cls = cls3;
                }
                if (!zIsRefDetect || (path = jSONWriter.setPath(i, obj3)) == null) {
                    objectWriter.write(jSONWriter, obj3, Integer.valueOf(i), this.itemType, j);
                    if (zIsRefDetect) {
                        jSONWriter.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
                objectWriter2 = objectWriter;
                cls2 = cls;
            }
        }
        jSONWriter.endArray();
        if (zIsWriteTypeInfo) {
            jSONWriter.endObject();
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(this.typeNameBytes, this.typeNameHash);
        }
        jSONWriter.startArray(objArr.length);
        Class<?> cls = null;
        int i = 0;
        boolean zIsRefDetect2 = zIsRefDetect;
        ObjectWriter objectWriter2 = null;
        while (i < objArr.length) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 == cls) {
                    objectWriter = objectWriter2;
                } else {
                    zIsRefDetect2 = jSONWriter.isRefDetect();
                    ObjectWriter objectWriter3 = jSONWriter.getObjectWriter(cls2);
                    if (zIsRefDetect2) {
                        zIsRefDetect2 = !ObjectWriterProvider.isNotReferenceDetect(cls2);
                    }
                    objectWriter = objectWriter3;
                    cls = cls2;
                }
                if (!zIsRefDetect2 || (path = jSONWriter.setPath(i, obj3)) == null) {
                    jSONWriter2 = jSONWriter;
                    objectWriter.writeJSONB(jSONWriter2, obj3, Integer.valueOf(i), this.itemType, 0L);
                    if (zIsRefDetect2) {
                        jSONWriter2.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                    jSONWriter2 = jSONWriter;
                }
                objectWriter2 = objectWriter;
            }
            i++;
            jSONWriter = jSONWriter2;
        }
    }
}
