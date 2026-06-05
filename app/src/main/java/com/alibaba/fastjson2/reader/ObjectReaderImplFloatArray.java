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
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplFloatArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplFloatArray INSTANCE = new ObjectReaderImplFloatArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Float");

    public ObjectReaderImplFloatArray() {
        super(Float[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Float fValueOf;
        Float[] fArr = new Float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fValueOf = null;
            } else if (obj instanceof Number) {
                fValueOf = Float.valueOf(((Number) obj).floatValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Float.class);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4799Ujhhgtgfeyxiexzf(obj, new StringBuilder("can not cast to Float ")));
                }
                fValueOf = (Float) typeConvert.apply(obj);
            }
            fArr[i] = fValueOf;
            i++;
        }
        return fArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            throw new JSONException("not support autoType : " + jSONReader.getString());
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Float[] fArr = new Float[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            fArr[i] = jSONReader.readFloat();
        }
        return fArr;
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
        Float[] fArr = new Float[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - fArr.length > 0) {
                int length = fArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                fArr = (Float[]) Arrays.copyOf(fArr, i3);
            }
            fArr[i] = jSONReader.readFloat();
            i = i2;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(fArr, i);
    }
}
