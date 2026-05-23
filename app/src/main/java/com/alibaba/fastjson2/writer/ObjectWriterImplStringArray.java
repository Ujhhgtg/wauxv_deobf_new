package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplStringArray extends ObjectWriterPrimitiveImpl {
    static final byte[] TYPE_NAME_BYTES = JSONB.toBytes("[String");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[String");
    static final ObjectWriterImplStringArray INSTANCE = new ObjectWriterImplStringArray();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
        } else {
            jSONWriter.writeString((String[]) obj);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
            jSONWriter.writeTypeName(TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        String[] strArr = (String[]) obj;
        jSONWriter.startArray(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                jSONWriter.writeString(str);
            } else if (jSONWriter.isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                jSONWriter.writeString("");
            } else {
                jSONWriter.writeNull();
            }
        }
    }
}
