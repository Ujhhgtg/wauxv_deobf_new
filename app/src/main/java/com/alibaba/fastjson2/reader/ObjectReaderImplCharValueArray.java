package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCharValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplCharValueArray INSTANCE = new ObjectReaderImplCharValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[C");
    final Function<char[], Object> builder;

    public ObjectReaderImplCharValueArray(Function<char[], Object> function) {
        super(char[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            throw new JSONException("not support autoType : " + jSONReader.getString());
        }
        if (jSONReader.isString()) {
            return jSONReader.readString().toCharArray();
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        char[] cArr = new char[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            if (jSONReader.isInt()) {
                cArr[i] = (char) jSONReader.readInt32Value();
            } else {
                cArr[i] = jSONReader.readString().charAt(0);
            }
        }
        Function<char[], Object> function = this.builder;
        return function != null ? function.apply(cArr) : cArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.current() == '\"') {
            char[] charArray = jSONReader.readString().toCharArray();
            Function<char[], Object> function = this.builder;
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!jSONReader.nextIfArrayStart()) {
            throw new JSONException(jSONReader.info("TODO"));
        }
        char[] cArrCopyOf = new char[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i2 = i + 1;
            if (i2 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i3);
            }
            if (jSONReader.isInt()) {
                cArrCopyOf[i] = (char) jSONReader.readInt32Value();
            } else {
                String string = jSONReader.readString();
                cArrCopyOf[i] = string == null ? (char) 0 : string.charAt(0);
            }
            i = i2;
        }
        jSONReader.nextIfComma();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i);
        Function<char[], Object> function2 = this.builder;
        return function2 != null ? function2.apply(cArrCopyOf2) : cArrCopyOf2;
    }
}
