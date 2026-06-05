package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt64ValueArrayFinalField<T> extends FieldReaderObject<T> {
    public FieldReaderInt64ValueArrayFinalField(String str, Class cls, int i, long j, String str2, long[] jArr, JSONSchema jSONSchema, Field field) {
        super(str, cls, cls, i, j, str2, null, jArr, jSONSchema, null, field, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (jSONReader.readIfNull()) {
            return;
        }
        try {
            long[] jArr = (long[]) this.propertyAccessor.getObject(t);
            if (jSONReader.nextIfArrayStart()) {
                int i = 0;
                while (!jSONReader.nextIfArrayEnd()) {
                    long int64Value = jSONReader.readInt64Value();
                    if (jArr != null && i < jArr.length) {
                        jArr[i] = int64Value;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            throw new JSONException(jSONReader.info("set " + this.fieldName + " error"), e);
        }
    }
}
