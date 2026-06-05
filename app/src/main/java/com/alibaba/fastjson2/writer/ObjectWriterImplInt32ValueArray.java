package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt32ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, int[]> function;
    static final ObjectWriterImplInt32ValueArray INSTANCE = new ObjectWriterImplInt32ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[I");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[I");

    public ObjectWriterImplInt32ValueArray(Function<Object, int[]> function) {
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Function<Object, int[]> function = this.function;
        int[] iArrApply = function != null ? function.apply(obj) : (int[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(iArrApply);
        } else {
            jSONWriter.writeInt32(iArrApply);
        }
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
        Function<Object, int[]> function = this.function;
        int[] iArrApply = function != null ? function.apply(obj) : (int[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(iArrApply);
        } else {
            jSONWriter.writeInt32(iArrApply);
        }
    }
}
