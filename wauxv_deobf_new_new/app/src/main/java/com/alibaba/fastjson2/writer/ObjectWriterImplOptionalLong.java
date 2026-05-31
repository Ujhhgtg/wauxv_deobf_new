package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.OptionalLong;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptionalLong extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplOptionalLong INSTANCE = new ObjectWriterImplOptionalLong();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (optionalLong.isPresent()) {
            jSONWriter.writeInt64(optionalLong.getAsLong());
        } else {
            jSONWriter.writeNull();
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (optionalLong.isPresent()) {
            jSONWriter.writeInt64(optionalLong.getAsLong());
        } else {
            jSONWriter.writeNull();
        }
    }
}
