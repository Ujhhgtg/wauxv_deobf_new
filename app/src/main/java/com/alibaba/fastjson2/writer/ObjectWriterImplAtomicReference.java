package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicReference extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicReference INSTANCE = new ObjectWriterImplAtomicReference(null);
    final Class defineClass;

    public ObjectWriterImplAtomicReference(Class cls) {
        this.defineClass = cls;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.writeNull();
        }
        jSONWriter.writeAny(obj3);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.writeNull();
        }
        jSONWriter.writeAny(obj3);
    }
}
