package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplMapEntry extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplMapEntry INSTANCE = new ObjectWriterImplMapEntry();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            jSONWriter.writeNull();
            return;
        }
        jSONWriter.startObject();
        Object key = entry.getKey();
        if ((jSONWriter.context.getFeatures() & (JSONWriter.Feature.WriteNonStringKeyAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) != 0) {
            jSONWriter.writeAny(key == null ? "null" : key.toString());
        } else {
            jSONWriter.writeAny(key);
        }
        jSONWriter.writeColon();
        jSONWriter.writeAny(entry.getValue());
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            jSONWriter.writeNull();
            return;
        }
        jSONWriter.startArray(2);
        Object key = entry.getKey();
        if ((jSONWriter.context.getFeatures() & (JSONWriter.Feature.WriteNonStringKeyAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) != 0) {
            jSONWriter.writeAny(key == null ? "null" : key.toString());
        } else {
            jSONWriter.writeAny(key);
        }
        jSONWriter.writeAny(entry.getValue());
    }
}
