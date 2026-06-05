package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicLongArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicLongArray INSTANCE = new ObjectWriterImplAtomicLongArray();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.startArray();
        for (int i = 0; i < atomicLongArray.length(); i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt64(atomicLongArray.get(i));
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.startArray(atomicLongArray.length());
        for (int i = 0; i < atomicLongArray.length(); i++) {
            jSONWriter.writeInt64(atomicLongArray.get(i));
        }
    }
}
