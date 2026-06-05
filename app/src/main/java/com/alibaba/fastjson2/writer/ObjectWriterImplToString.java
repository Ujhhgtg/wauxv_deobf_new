package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplToString extends ObjectWriterPrimitiveImpl {
    private final boolean direct;
    public static final ObjectWriterImplToString INSTANCE = new ObjectWriterImplToString(false);
    public static final ObjectWriterImplToString DIRECT = new ObjectWriterImplToString(true);

    public ObjectWriterImplToString() {
        this(false);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        String string = obj.toString();
        if (this.direct) {
            jSONWriter.writeRaw(string);
        } else {
            jSONWriter.writeString(string);
        }
    }

    public ObjectWriterImplToString(boolean z) {
        this.direct = z;
    }
}
