package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListEnum extends ObjectWriterPrimitiveImpl {
    final Class defineClass;
    final Class enumType;
    final long features;
    byte[] typeNameJSONB;

    public ObjectWriterImplListEnum(Class cls, Class cls2, long j) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            String str = (String) list.get(i);
            if (str == null) {
                jSONWriter.writeNull();
            } else {
                jSONWriter.writeString(str);
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        JSONWriter jSONWriter2;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (jSONWriter.isWriteTypeInfo(obj) && this.defineClass != cls) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName(cls));
        }
        List list = TypeUtils.toList(obj);
        int size = list.size();
        jSONWriter.startArray(size);
        boolean zIsEnabled = jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString);
        int i = 0;
        while (i < size) {
            Enum r4 = (Enum) list.get(i);
            if (r4 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = r4.getClass();
                if (cls2 != this.enumType) {
                    jSONWriter2 = jSONWriter;
                    jSONWriter.getObjectWriter(cls2).writeJSONB(jSONWriter2, r4, null, this.enumType, this.features | j);
                } else {
                    jSONWriter2 = jSONWriter;
                    jSONWriter2.writeString(zIsEnabled ? r4.toString() : r4.name());
                }
            }
            i++;
            jSONWriter = jSONWriter2;
        }
        jSONWriter.endArray();
    }
}
