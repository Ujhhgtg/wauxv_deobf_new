package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt64 extends ObjectReaderPrimitive<Long> {
    static final ObjectReaderImplInt64 INSTANCE = new ObjectReaderImplInt64();

    public ObjectReaderImplInt64() {
        super(Long.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Long readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.readInt64();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Long readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.readInt64();
    }
}
