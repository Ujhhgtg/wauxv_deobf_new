package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt32 extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt32 INSTANCE = new ObjectWriterImplInt32();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(iIntValue);
        } else {
            jSONWriter.writeInt32(iIntValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(iIntValue);
        } else {
            jSONWriter.writeInt32(iIntValue);
        }
    }
}
