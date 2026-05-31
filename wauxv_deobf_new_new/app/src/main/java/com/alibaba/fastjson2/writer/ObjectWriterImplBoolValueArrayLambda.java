package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplBoolValueArrayLambda extends ObjectWriterPrimitiveImpl {
    private final BiFunction<Object, Integer, Boolean> functionGet;
    private final ToIntFunction functionSize;

    public ObjectWriterImplBoolValueArrayLambda(ToIntFunction toIntFunction, BiFunction<Object, Integer, Boolean> biFunction) {
        this.functionSize = toIntFunction;
        this.functionGet = biFunction;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray();
        for (int i = 0; i < iApplyAsInt; i++) {
            boolean zBooleanValue = this.functionGet.apply(obj, Integer.valueOf(i)).booleanValue();
            if (i != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeBool(zBooleanValue);
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
            jSONWriter.writeTypeName(ObjectWriterImplBoolValueArray.JSONB_TYPE_NAME_BYTES, ObjectWriterImplBoolValueArray.JSONB_TYPE_HASH);
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray(iApplyAsInt);
        for (int i = 0; i < iApplyAsInt; i++) {
            jSONWriter.writeBool(this.functionGet.apply(obj, Integer.valueOf(i)).booleanValue());
        }
    }
}
