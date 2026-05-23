package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter11<T> extends ObjectWriterAdapter<T> {
    public final FieldWriter fieldWriter0;
    public final FieldWriter fieldWriter1;
    public final FieldWriter fieldWriter10;
    public final FieldWriter fieldWriter2;
    public final FieldWriter fieldWriter3;
    public final FieldWriter fieldWriter4;
    public final FieldWriter fieldWriter5;
    public final FieldWriter fieldWriter6;
    public final FieldWriter fieldWriter7;
    public final FieldWriter fieldWriter8;
    public final FieldWriter fieldWriter9;

    public ObjectWriter11(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.fieldWriter0 = list.get(0);
        this.fieldWriter1 = list.get(1);
        this.fieldWriter2 = list.get(2);
        this.fieldWriter3 = list.get(3);
        this.fieldWriter4 = list.get(4);
        this.fieldWriter5 = list.get(5);
        this.fieldWriter6 = list.get(6);
        this.fieldWriter7 = list.get(7);
        this.fieldWriter8 = list.get(8);
        this.fieldWriter9 = list.get(9);
        this.fieldWriter10 = list.get(10);
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
        FieldWriter fieldWriter3 = this.fieldWriter2;
        if (j == fieldWriter3.hashCode) {
            return fieldWriter3;
        }
        FieldWriter fieldWriter4 = this.fieldWriter3;
        if (j == fieldWriter4.hashCode) {
            return fieldWriter4;
        }
        FieldWriter fieldWriter5 = this.fieldWriter4;
        if (j == fieldWriter5.hashCode) {
            return fieldWriter5;
        }
        FieldWriter fieldWriter6 = this.fieldWriter5;
        if (j == fieldWriter6.hashCode) {
            return fieldWriter6;
        }
        FieldWriter fieldWriter7 = this.fieldWriter6;
        if (j == fieldWriter7.hashCode) {
            return fieldWriter7;
        }
        FieldWriter fieldWriter8 = this.fieldWriter7;
        if (j == fieldWriter8.hashCode) {
            return fieldWriter8;
        }
        FieldWriter fieldWriter9 = this.fieldWriter8;
        if (j == fieldWriter9.hashCode) {
            return fieldWriter9;
        }
        FieldWriter fieldWriter10 = this.fieldWriter9;
        if (j == fieldWriter10.hashCode) {
            return fieldWriter10;
        }
        FieldWriter fieldWriter11 = this.fieldWriter10;
        if (j == fieldWriter11.hashCode) {
            return fieldWriter11;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long features = this.features | j | jSONWriter.getFeatures();
        boolean z = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        if (jSONWriter.jsonb) {
            if (z) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j);
                return;
            }
        }
        if (z) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j | this.features);
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
        this.fieldWriter2.write(jSONWriter, obj);
        this.fieldWriter3.write(jSONWriter, obj);
        this.fieldWriter4.write(jSONWriter, obj);
        this.fieldWriter5.write(jSONWriter, obj);
        this.fieldWriter6.write(jSONWriter, obj);
        this.fieldWriter7.write(jSONWriter, obj);
        this.fieldWriter8.write(jSONWriter, obj);
        this.fieldWriter9.write(jSONWriter, obj);
        this.fieldWriter10.write(jSONWriter, obj);
        jSONWriter.endObject();
    }
}
