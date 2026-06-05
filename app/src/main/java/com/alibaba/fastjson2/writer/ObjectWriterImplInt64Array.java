package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64Array extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt64Array INSTANCE = new ObjectWriterImplInt64Array();
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Long");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Long");

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!jSONWriter.isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) {
                jSONWriter.writeNull();
                return;
            } else {
                jSONWriter.startArray();
                jSONWriter.endArray();
                return;
            }
        }
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        Long[] lArr = (Long[]) obj;
        jSONWriter.startArray();
        for (int i = 0; i < lArr.length; i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            Long l = lArr[i];
            if (l == null) {
                jSONWriter.writeNull();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    jSONWriter.writeString(jLongValue);
                } else {
                    jSONWriter.writeInt64(jLongValue);
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
        Long[] lArr = (Long[]) obj;
        jSONWriter.startArray(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                jSONWriter.writeNull();
            } else {
                long jLongValue = l.longValue();
                if (z) {
                    jSONWriter.writeString(jLongValue);
                } else {
                    jSONWriter.writeInt64(jLongValue);
                }
            }
        }
    }
}
