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
public final class ObjectReaderImplInt32ValueArray extends ObjectReaderPrimitive {
    final Function<int[], Object> builder;
    static final ObjectReaderImplInt32ValueArray INSTANCE = new ObjectReaderImplInt32ValueArray(int[].class, null);
    public static final long HASH_TYPE = Fnv.hashCode64("[I");

    public ObjectReaderImplInt32ValueArray(Class cls, Function<int[], Object> function) {
        super(cls);
        this.builder = function;
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
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE) {
                throw new JSONException("not support autoType : " + jSONReader.getString());
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        int[] iArr = new int[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            iArr[i] = jSONReader.readInt32Value();
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
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
        int[] iArrCopyOf = new int[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - iArrCopyOf.length > 0) {
                int length = iArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            }
            iArrCopyOf[i] = jSONReader.readInt32Value();
            i = i2;
        }
        jSONReader.nextIfComma();
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, i);
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArrCopyOf2) : iArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        int iIntValue;
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                iIntValue = 0;
            } else if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Integer.TYPE);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4799Ujhhgtgfeyxiexzf(obj, new StringBuilder("can not cast to int ")));
                }
                iIntValue = ((Integer) typeConvert.apply(obj)).intValue();
            }
            iArr[i] = iIntValue;
            i++;
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
    }
}
