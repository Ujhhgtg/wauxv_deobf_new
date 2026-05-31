package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectWriterPrimitiveImpl<T> implements ObjectWriter<T> {
    public Function getFunction() {
        return null;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMapping(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        write(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        writeJSONB(jSONWriter, obj, null, null, 0L);
    }
}
