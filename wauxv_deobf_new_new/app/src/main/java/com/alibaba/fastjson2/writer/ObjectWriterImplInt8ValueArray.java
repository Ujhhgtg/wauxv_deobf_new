package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, byte[]> function;
    static final ObjectWriterImplInt8ValueArray INSTANCE = new ObjectWriterImplInt8ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[B");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[B");

    public ObjectWriterImplInt8ValueArray(Function<Object, byte[]> function) {
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        Function<Object, byte[]> function = this.function;
        byte[] bArrApply = function != null ? function.apply(obj) : (byte[]) obj;
        String dateFormat = jSONWriter.context.getDateFormat();
        GZIPOutputStream gZIPOutputStream = null;
        if ("millis".equals(dateFormat)) {
            dateFormat = null;
        }
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(bArrApply);
            return;
        }
        if ("gzip".equals(dateFormat) || "gzip,base64".equals(dateFormat)) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gZIPOutputStream = bArrApply.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArrApply.length) : new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArrApply);
                    gZIPOutputStream.finish();
                    bArrApply = byteArrayOutputStream.toByteArray();
                    IOUtils.close(gZIPOutputStream);
                } catch (IOException e) {
                    throw new JSONException("write gzipBytes error", e);
                }
            } catch (Throwable th) {
                IOUtils.close(gZIPOutputStream);
                throw th;
            }
        }
        if ("base64".equals(dateFormat) || "gzip,base64".equals(dateFormat) || (jSONWriter.getFeatures(j) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0) {
            jSONWriter.writeBase64(bArrApply);
        } else {
            jSONWriter.writeInt8(bArrApply);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            if (obj == byte[].class) {
                jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
            } else {
                jSONWriter.writeTypeName(obj.getClass().getName());
            }
        }
        Function<Object, byte[]> function = this.function;
        byte[] bArrApply = (function == null || obj == null) ? (byte[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0) {
            jSONWriter.writeString(bArrApply);
        } else {
            jSONWriter.writeBinary(bArrApply);
        }
    }
}
