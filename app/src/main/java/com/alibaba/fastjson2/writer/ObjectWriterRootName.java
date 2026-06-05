package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterRootName<T> extends ObjectWriterAdapter<T> {
    final String rootName;

    public ObjectWriterRootName(Class<T> cls, String str, String str2, String str3, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.rootName = str3;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter
    public JSONObject toJSONObject(T t, long j) {
        return JSONObject.of(this.rootName, (Object) super.toJSONObject(t, j));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        jSONWriter.writeColon();
        super.write(jSONWriter, obj, obj2, type, j);
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.startObject();
        jSONWriter.writeName(this.rootName);
        super.writeJSONB(jSONWriter, obj, obj2, type, j);
        jSONWriter.endObject();
    }
}
