package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicInteger extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicInteger INSTANCE = new ObjectWriterImplAtomicInteger(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("AtomicInteger");
    final Class defineClass;

    public ObjectWriterImplAtomicInteger(Class cls) {
        this.defineClass = cls;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(((AtomicInteger) obj).intValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (jSONWriter.isWriteTypeInfo(atomicInteger, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, 7576651708426282938L);
        }
        jSONWriter.writeInt32(atomicInteger.intValue());
    }
}
