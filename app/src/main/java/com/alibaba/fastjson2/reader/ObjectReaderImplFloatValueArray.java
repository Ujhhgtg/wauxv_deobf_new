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
class ObjectReaderImplFloatValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplFloatValueArray INSTANCE = new ObjectReaderImplFloatValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[F");
    final Function<float[], Object> builder;

    public ObjectReaderImplFloatValueArray(Function<float[], Object> function) {
        super(float[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        float fFloatValue;
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fFloatValue = 0.0f;
            } else if (obj instanceof Number) {
                fFloatValue = ((Number) obj).floatValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Float.TYPE);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4799Ujhhgtgfeyxiexzf(obj, new StringBuilder("can not cast to float ")));
                }
                fFloatValue = ((Float) typeConvert.apply(obj)).floatValue();
            }
            fArr[i] = fFloatValue;
            i++;
        }
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArr) : fArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            throw new JSONException("not support autoType : " + jSONReader.getString());
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        float[] fArr = new float[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            fArr[i] = jSONReader.readFloatValue();
        }
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArr) : fArr;
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
        float[] fArrCopyOf = new float[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - fArrCopyOf.length > 0) {
                int length = fArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
            }
            fArrCopyOf[i] = jSONReader.readFloatValue();
            i = i2;
        }
        jSONReader.nextIfComma();
        float[] fArrCopyOf2 = Arrays.copyOf(fArrCopyOf, i);
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArrCopyOf2) : fArrCopyOf2;
    }
}
