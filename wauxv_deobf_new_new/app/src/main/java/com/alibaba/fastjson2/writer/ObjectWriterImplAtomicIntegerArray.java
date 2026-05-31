package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplAtomicIntegerArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicIntegerArray INSTANCE = new ObjectWriterImplAtomicIntegerArray();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray();
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt32(atomicIntegerArray.get(i));
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray(atomicIntegerArray.length());
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            jSONWriter.writeInt32(atomicIntegerArray.get(i));
        }
    }
}
