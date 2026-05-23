package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter2<T> extends ObjectWriterAdapter<T> {
    public final FieldWriter fieldWriter0;
    public final FieldWriter fieldWriter1;

    public ObjectWriter2(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.fieldWriter0 = list.get(0);
        this.fieldWriter1 = list.get(1);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public final FieldWriter getFieldWriter(long j) {
        FieldWriter fieldWriter = this.fieldWriter0;
        if (j == fieldWriter.hashCode) {
            return fieldWriter;
        }
        FieldWriter fieldWriter2 = this.fieldWriter1;
        if (j == fieldWriter2.hashCode) {
            return fieldWriter2;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long features = this.features | j | jSONWriter.getFeatures();
        if (jSONWriter.jsonb) {
            if ((features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j);
                return;
            }
        }
        if ((JSONWriter.Feature.BeanToArray.mask & features) != 0) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j);
            return;
        }
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj, obj2, type, 0L);
            return;
        }
        jSONWriter.startObject();
        if (jSONWriter.isWriteTypeInfo(obj, this.features | j)) {
            writeTypeInfo(jSONWriter);
        }
        this.fieldWriter0.write(jSONWriter, obj);
        this.fieldWriter1.write(jSONWriter, obj);
        jSONWriter.endObject();
    }
}
