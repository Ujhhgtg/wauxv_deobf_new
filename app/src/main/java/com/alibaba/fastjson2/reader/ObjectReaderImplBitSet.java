package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.BitSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplBitSet extends ObjectReaderPrimitive<BitSet> {
    static final ObjectReaderImplBitSet INSTANCE = new ObjectReaderImplBitSet();
    public static final long HASH_TYPE = Fnv.hashCode64("BitSet");

    public ObjectReaderImplBitSet() {
        super(BitSet.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j) {
        return super.createInstance(j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public BitSet readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfMatch(-110) || jSONReader.readTypeHashCode() == HASH_TYPE) {
            return BitSet.valueOf(jSONReader.readBinary());
        }
        throw new JSONException(jSONReader.info(jSONReader.getString()));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public BitSet readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return BitSet.valueOf(jSONReader.readBinary());
    }
}
