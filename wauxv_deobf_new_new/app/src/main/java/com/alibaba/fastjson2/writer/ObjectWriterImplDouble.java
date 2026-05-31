package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDouble extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplDouble INSTANCE = new ObjectWriterImplDouble(null);
    private final DecimalFormat format;

    public ObjectWriterImplDouble(DecimalFormat decimalFormat) {
        this.format = decimalFormat;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String dateFormat;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        DecimalFormat decimalFormat = this.format;
        if (decimalFormat == null && (dateFormat = jSONWriter.getContext().getDateFormat()) != null && dateFormat.indexOf(35) != -1) {
            decimalFormat = new DecimalFormat(dateFormat);
        }
        if (decimalFormat != null) {
            jSONWriter.writeRaw(decimalFormat.format(obj));
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(dDoubleValue);
            return;
        }
        jSONWriter.writeDouble(dDoubleValue);
        long features = jSONWriter.getFeatures(j);
        if ((JSONWriter.Feature.WriteClassName.mask & features) == 0 || (JSONWriter.Feature.WriteNonStringKeyAsString.mask & features) != 0 || (features & JSONWriter.Feature.NotWriteNumberClassName.mask) != 0 || type == Double.class || type == Double.TYPE) {
            return;
        }
        jSONWriter.writeRaw('D');
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if ((j & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(dDoubleValue);
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }
}
