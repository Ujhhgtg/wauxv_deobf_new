package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt16Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt16Array INSTANCE = new ObjectReaderImplInt16Array();
    static final long HASH_TYPE = Fnv.hashCode64("[Short");

    public ObjectReaderImplInt16Array() {
        super(Short[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Short shValueOf;
        Short[] shArr = new Short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                shValueOf = null;
            } else if (obj instanceof Number) {
                shValueOf = Short.valueOf(((Number) obj).shortValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Short.class);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to Short ")));
                }
                shValueOf = (Short) typeConvert.apply(obj);
            }
            shArr[i] = shValueOf;
            i++;
        }
        return shArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt16ValueArray.HASH_TYPE) {
                throw new JSONException(jSONReader.info("not support type " + jSONReader.getString()));
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Short[] shArr = new Short[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            Integer int32 = jSONReader.readInt32();
            shArr[i] = int32 == null ? null : Short.valueOf(int32.shortValue());
        }
        return shArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                throw new JSONException(jSONReader.info("TODO"));
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            throw new JSONException(jSONReader.info("not support input ".concat(string)));
        }
        Short[] shArr = new Short[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - shArr.length > 0) {
                int length = shArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                shArr = (Short[]) Arrays.copyOf(shArr, i3);
            }
            Integer int32 = jSONReader.readInt32();
            shArr[i] = Short.valueOf(int32 == null ? (short) 0 : int32.shortValue());
            i = i2;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(shArr, i);
    }
}
