package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt16ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, short[]> function;
    static final ObjectWriterImplInt16ValueArray INSTANCE = new ObjectWriterImplInt16ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[S");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[S");

    public ObjectWriterImplInt16ValueArray(Function<Object, short[]> function) {
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Function<Object, short[]> function = this.function;
        short[] sArrApply = function != null ? function.apply(obj) : (short[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(sArrApply);
        } else {
            jSONWriter.writeInt16(sArrApply);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, short[]> function = this.function;
        short[] sArrApply = (function == null || obj == null) ? (short[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(sArrApply);
        } else {
            jSONWriter.writeInt16(sArrApply);
        }
    }
}
