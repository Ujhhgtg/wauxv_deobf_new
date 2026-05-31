package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt32ValueArrayFinalField<T> extends FieldReader<T> {
    public FieldReaderInt32ValueArrayFinalField(String str, Class cls, int i, long j, String str2, int[] iArr, JSONSchema jSONSchema, Field field) {
        super(str, cls, cls, i, j, str2, null, iArr, jSONSchema, null, field, null, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        try {
            int[] iArr = (int[]) obj;
            System.arraycopy(iArr, 0, (int[]) this.propertyAccessor.getObject(t), 0, iArr.length);
        } catch (Exception e) {
            throw new JSONException(AbstractC2844.m4786(new StringBuilder("set "), this.fieldName, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (jSONReader.readIfNull()) {
            return;
        }
        try {
            int[] iArr = (int[]) this.propertyAccessor.getObject(t);
            if (jSONReader.nextIfArrayStart()) {
                int i = 0;
                while (!jSONReader.nextIfArrayEnd()) {
                    int int32Value = jSONReader.readInt32Value();
                    if (iArr != null && i < iArr.length) {
                        iArr[i] = int32Value;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            throw new JSONException(jSONReader.info("set " + this.fieldName + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readInt32ValueArray();
    }
}
