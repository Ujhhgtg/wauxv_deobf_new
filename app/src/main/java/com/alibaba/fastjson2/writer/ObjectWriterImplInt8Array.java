package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt8Array INSTANCE = new ObjectWriterImplInt8Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Byte");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Byte");

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            Byte b = bArr[i];
            if (b == null) {
                jSONWriter.writeNull();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    jSONWriter.writeString(bByteValue);
                } else {
                    jSONWriter.writeInt8(bByteValue);
                }
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.startArray(bArr.length);
        for (Byte b : bArr) {
            if (b == null) {
                jSONWriter.writeNull();
            } else {
                byte bByteValue = b.byteValue();
                if (z) {
                    jSONWriter.writeString(bByteValue);
                } else {
                    jSONWriter.writeInt8(bByteValue);
                }
            }
        }
    }
}
