package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterBigInteger implements ObjectWriter {
    static final ObjectWriterBigInteger INSTANCE = new ObjectWriterBigInteger(0);
    final long features;

    public ObjectWriterBigInteger(long j) {
        this.features = j;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeBigInt((BigInteger) obj, j);
        }
    }
}
