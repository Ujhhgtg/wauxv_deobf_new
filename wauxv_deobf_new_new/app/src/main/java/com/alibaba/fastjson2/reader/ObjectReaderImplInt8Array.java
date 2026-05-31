package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;
import java.util.zip.GZIPInputStream;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8Array extends ObjectReaderPrimitive {
    final String format;
    static final ObjectReaderImplInt8Array INSTANCE = new ObjectReaderImplInt8Array(null);
    static final long HASH_TYPE = Fnv.hashCode64("[Byte");

    public ObjectReaderImplInt8Array(String str) {
        super(Byte[].class);
        this.format = str;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Byte bValueOf;
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bValueOf = null;
            } else if (obj instanceof Number) {
                bValueOf = Byte.valueOf(((Number) obj).byteValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Byte.class);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1095.m2798(obj, new StringBuilder("can not cast to Byte ")));
                }
                bValueOf = (Byte) typeConvert.apply(obj);
            }
            bArr[i] = bValueOf;
            i++;
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            throw new JSONException("not support autoType : " + jSONReader.getString());
        }
        if (jSONReader.isString() && "hex".equals(this.format)) {
            return jSONReader.readHex();
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Byte[] bArr = new Byte[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            Integer int32 = jSONReader.readInt32();
            bArr[i] = int32 == null ? null : Byte.valueOf(int32.byteValue());
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        int i = 0;
        if (jSONReader.nextIfArrayStart()) {
            Byte[] bArr = new Byte[16];
            while (!jSONReader.nextIfArrayEnd()) {
                if (jSONReader.isEnd()) {
                    throw new JSONException(jSONReader.info("input end"));
                }
                int i2 = i + 1;
                if (i2 - bArr.length > 0) {
                    int length = bArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    bArr = (Byte[]) Arrays.copyOf(bArr, i3);
                }
                Integer int32 = jSONReader.readInt32();
                bArr[i] = int32 == null ? null : Byte.valueOf(int32.byteValue());
                i = i2;
            }
            jSONReader.nextIfComma();
            return Arrays.copyOf(bArr, i);
        }
        if (jSONReader.current() == 'x') {
            return jSONReader.readBinary();
        }
        if (jSONReader.isString()) {
            if ("hex".equals(this.format)) {
                return jSONReader.readHex();
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            if ("base64".equals(this.format)) {
                return Base64.getDecoder().decode(string);
            }
            if ("gzip,base64".equals(this.format) || "gzip".equals(this.format)) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(string)));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        byte[] bArr2 = new byte[1024];
                        int i4 = gZIPInputStream.read(bArr2);
                        if (i4 == -1) {
                            jSONReader = byteArrayOutputStream.toByteArray();
                            return jSONReader;
                        }
                        if (i4 > 0) {
                            byteArrayOutputStream.write(bArr2, 0, i4);
                        }
                    }
                } catch (IOException e) {
                    throw new JSONException(jSONReader.info("unzip bytes error."), e);
                }
            }
        }
        throw new JSONException(jSONReader.info("TODO"));
    }
}
