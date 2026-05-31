package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplAtomicReference extends ObjectReaderPrimitive {
    static final ObjectReaderImplAtomicReference INSTANCE = new ObjectReaderImplAtomicReference(Object.class);
    final Type referenceType;

    public ObjectReaderImplAtomicReference(Type type) {
        super(AtomicReference.class);
        this.referenceType = type;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return new AtomicReference(jSONReader.read(this.referenceType));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return new AtomicReference(jSONReader.read(this.referenceType));
    }
}
