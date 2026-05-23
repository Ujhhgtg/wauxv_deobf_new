package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8ValueArray extends ObjectReaderPrimitive {
    final Function<byte[], Object> builder;
    final long features;
    final String format;
    static final ObjectReaderImplInt8ValueArray INSTANCE = new ObjectReaderImplInt8ValueArray(null);
    static final long HASH_TYPE = Fnv.hashCode64("[B");

    public ObjectReaderImplInt8ValueArray(String str) {
        super(byte[].class);
        this.format = str;
        this.builder = null;
        this.features = 0L;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Byte.TYPE);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to byte ")));
                }
                bByteValue = ((Byte) typeConvert.apply(obj)).byteValue();
            }
            bArr[i] = bByteValue;
            i++;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        byte[] bArrDecode;
        int iIndexOf;
        if (jSONReader.nextIfMatch(-110)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt8Array.HASH_TYPE) {
                throw new JSONException("not support autoType : " + jSONReader.getString());
            }
        }
        if (jSONReader.isBinary()) {
            bArrDecode = jSONReader.readBinary();
        } else if (jSONReader.isString()) {
            String string = jSONReader.readString();
            if (string != null && (iIndexOf = string.indexOf(";base64,")) != -1) {
                string = string.substring(iIndexOf + 8);
            }
            bArrDecode = Base64.getDecoder().decode(string);
        } else {
            int iStartArray = jSONReader.startArray();
            if (iStartArray == -1) {
                return null;
            }
            byte[] bArr = new byte[iStartArray];
            for (int i = 0; i < iStartArray; i++) {
                bArr[i] = (byte) jSONReader.readInt32Value();
            }
            bArrDecode = bArr;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArrDecode) : bArrDecode;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        byte[] bArrDecode = null;
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                throw new JSONException(jSONReader.info("TODO"));
            }
            if ((jSONReader.features(j | this.features) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = jSONReader.readBase64();
            } else {
                String string = jSONReader.readString();
                if (!string.isEmpty()) {
                    int iIndexOf = string.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        throw new JSONException(jSONReader.info("illegal input : ".concat(string)));
                    }
                    bArrDecode = Base64.getDecoder().decode(string.substring(iIndexOf + 8));
                }
            }
            Function<byte[], Object> function = this.builder;
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("input end"));
            }
            int i2 = i + 1;
            if (i2 - bArrCopyOf.length > 0) {
                int length = bArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            }
            bArrCopyOf[i] = (byte) jSONReader.readInt32Value();
            i = i2;
        }
        jSONReader.nextIfComma();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
        Function<byte[], Object> function2 = this.builder;
        return function2 != null ? function2.apply(bArrCopyOf2) : bArrCopyOf2;
    }

    public ObjectReaderImplInt8ValueArray(Function<byte[], Object> function, String str) {
        super(byte[].class);
        this.format = str;
        this.features = "base64".equals(str) ? JSONReader.Feature.Base64StringAsByteArray.mask : 0L;
        this.builder = function;
    }
}
