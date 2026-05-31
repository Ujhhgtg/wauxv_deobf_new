package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplNumberArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplNumberArray INSTANCE = new ObjectReaderImplNumberArray();

    public ObjectReaderImplNumberArray() {
        super(Number[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Number[] numberArr = new Number[collection.size()];
        int i = 0;
        for (Object objApply : collection) {
            if (objApply != null && !(objApply instanceof Number)) {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), Number.class);
                if (typeConvert == null) {
                    throw new JSONException(AbstractC1095.m2798(objApply, new StringBuilder("can not cast to Number ")));
                }
                objApply = typeConvert.apply(objApply);
            }
            numberArr[i] = (Number) objApply;
            i++;
        }
        return numberArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Number[] numberArr = new Number[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            numberArr[i] = jSONReader.readNumber();
        }
        return numberArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            throw new JSONException(jSONReader.info("TODO"));
        }
        Number[] numberArr = new Number[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i2 = i + 1;
            if (i2 - numberArr.length > 0) {
                int length = numberArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                numberArr = (Number[]) Arrays.copyOf(numberArr, i3);
            }
            numberArr[i] = jSONReader.readNumber();
            i = i2;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(numberArr, i);
    }
}
