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
final class ObjectReaderImplDoubleArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleArray INSTANCE = new ObjectReaderImplDoubleArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Double");

    public ObjectReaderImplDoubleArray() {
        super(Double[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Double dValueOf;
        Double[] dArr = new Double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dValueOf = null;
            } else if (obj instanceof Number) {
                dValueOf = Double.valueOf(((Number) obj).doubleValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Double.class);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to Double ")));
                }
                dValueOf = (Double) typeConvert.apply(obj);
            }
            dArr[i] = dValueOf;
            i++;
        }
        return dArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(-110) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            throw new JSONException("not support autoType : " + jSONReader.getString());
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Double[] dArr = new Double[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            dArr[i] = jSONReader.readDouble();
        }
        return dArr;
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
        Double[] dArr = new Double[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - dArr.length > 0) {
                int length = dArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                dArr = (Double[]) Arrays.copyOf(dArr, i3);
            }
            dArr[i] = jSONReader.readDouble();
            i = i2;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(dArr, i);
    }
}
