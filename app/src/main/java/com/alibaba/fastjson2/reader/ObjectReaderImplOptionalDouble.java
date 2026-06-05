package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.OptionalDouble;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptionalDouble extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptionalDouble INSTANCE = new ObjectReaderImplOptionalDouble();

    public ObjectReaderImplOptionalDouble() {
        super(OptionalDouble.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Double d = jSONReader.readDouble();
        return d == null ? OptionalDouble.empty() : OptionalDouble.of(d.doubleValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Double d = jSONReader.readDouble();
        return d == null ? OptionalDouble.empty() : OptionalDouble.of(d.doubleValue());
    }
}
