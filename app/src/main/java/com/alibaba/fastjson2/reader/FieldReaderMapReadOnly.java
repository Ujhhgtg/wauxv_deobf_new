package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderMapReadOnly<T> extends FieldReaderMap<T> {
    public FieldReaderMapReadOnly(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Method method, Field field, String str3, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, null, null, jSONSchema, method, field, null, str3, biConsumer);
    }

    private Map getReadOnlyMap(Object obj) {
        try {
            return (Map) this.propertyAccessor.getObject(obj);
        } catch (Exception unused) {
            throw new JSONException(AbstractC2784.m4752(new StringBuilder("set "), this.fieldName, " error"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        Map readOnlyMap;
        if (obj == null || (readOnlyMap = getReadOnlyMap(t)) == Collections.EMPTY_MAP || readOnlyMap == null || "java.util.Collections$UnmodifiableMap".equals(readOnlyMap.getClass().getName())) {
            return;
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(obj);
        }
        readOnlyMap.putAll((Map) obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMap, com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T t, Object obj, long j) {
        if (this.arrayToMapKey == null || !(obj instanceof Collection)) {
            super.acceptAny(t, obj, j);
        } else {
            FieldReaderObject.arrayToMap(getReadOnlyMap(t), (Collection) obj, this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, this.features | j), this.arrayToMapDuplicateHandler);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(Object obj, String str, Object obj2) {
        getReadOnlyMap(obj).put(str, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = getObjectReader(jSONReader);
        if (objectReader instanceof ObjectReaderImplMap) {
            ObjectReaderImplString objectReaderImplString = ObjectReaderImplString.INSTANCE;
            this.itemReader = objectReaderImplString;
            return objectReaderImplString;
        }
        if (!(objectReader instanceof ObjectReaderImplMapTyped)) {
            return ObjectReaderImplObject.INSTANCE;
        }
        ObjectReader objectReader2 = jSONReader.getObjectReader(((ObjectReaderImplMapTyped) objectReader).valueType);
        this.itemReader = objectReader2;
        return objectReader2;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        getReadOnlyMap(obj).put(jSONReader.getFieldName(), getItemObjectReader(jSONReader).readObject(jSONReader, getItemType(), this.fieldName, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMap, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (this.arrayToMapKey != null && jSONReader.isArray()) {
            FieldReaderObject.arrayToMap(getReadOnlyMap(t), jSONReader.readArray(this.valueType), this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, this.features), this.arrayToMapDuplicateHandler);
            return;
        }
        if (this.initReader == null) {
            this.initReader = jSONReader.getContext().getObjectReader(this.fieldType);
        }
        accept(t, jSONReader.jsonb ? this.initReader.readJSONBObject(jSONReader, getItemType(), this.fieldName, this.features) : this.initReader.readObject(jSONReader, getItemType(), this.fieldName, this.features));
    }
}
