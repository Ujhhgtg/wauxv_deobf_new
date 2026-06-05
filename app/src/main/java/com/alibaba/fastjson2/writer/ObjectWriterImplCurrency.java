package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCurrency extends ObjectWriterPrimitiveImpl {
    final Class defineClass;
    static final ObjectWriterImplCurrency INSTANCE = new ObjectWriterImplCurrency(null);
    static final ObjectWriterImplCurrency INSTANCE_FOR_FIELD = new ObjectWriterImplCurrency(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes(TypeUtils.getTypeName(Currency.class));
    static final long JSONB_TYPE_HASH = Fnv.hashCode64(TypeUtils.getTypeName(Currency.class));

    public ObjectWriterImplCurrency(Class cls) {
        this.defineClass = cls;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeString(((Currency) obj).getCurrencyCode());
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Currency currency = (Currency) obj;
        if (jSONWriter.isWriteTypeInfo(currency) && this.defineClass == null) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        jSONWriter.writeString(currency.getCurrencyCode());
    }
}
