package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.OptionalLong;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptionalLong extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptionalLong INSTANCE = new ObjectReaderImplOptionalLong();

    public ObjectReaderImplOptionalLong() {
        super(OptionalLong.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Long int64 = jSONReader.readInt64();
        return int64 == null ? OptionalLong.empty() : OptionalLong.of(int64.longValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Long int64 = jSONReader.readInt64();
        return int64 == null ? OptionalLong.empty() : OptionalLong.of(int64.longValue());
    }
}
