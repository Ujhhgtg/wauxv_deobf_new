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
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplDoubleValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleValueArray INSTANCE = new ObjectReaderImplDoubleValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[D");
    final Function<double[], Object> builder;

    public ObjectReaderImplDoubleValueArray(Function<double[], Object> function) {
        super(double[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        double dDoubleValue;
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dDoubleValue = 0.0d;
            } else if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Double.TYPE);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1095.m2798(obj, new StringBuilder("can not cast to double ")));
                }
                dDoubleValue = ((Double) typeConvert.apply(obj)).doubleValue();
            }
            dArr[i] = dDoubleValue;
            i++;
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
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
        double[] dArr = new double[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            dArr[i] = jSONReader.readDoubleValue();
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
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
        double[] dArrCopyOf = new double[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - dArrCopyOf.length > 0) {
                int length = dArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
            }
            dArrCopyOf[i] = jSONReader.readDoubleValue();
            i = i2;
        }
        jSONReader.nextIfComma();
        double[] dArrCopyOf2 = Arrays.copyOf(dArrCopyOf, i);
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArrCopyOf2) : dArrCopyOf2;
    }
}
