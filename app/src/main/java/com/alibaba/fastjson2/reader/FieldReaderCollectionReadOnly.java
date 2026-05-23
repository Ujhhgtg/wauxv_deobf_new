package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderCollectionReadOnly<T> extends FieldReaderObject<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public FieldReaderCollectionReadOnly(String str, Type type, Class cls, int i, long j, String str2, JSONSchema jSONSchema, Method method, Field field) {
        Type type2;
        super(str, type, cls, i, j, str2, null, null, jSONSchema, method, field, null);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                type2 = actualTypeArguments[0];
            } else {
                type2 = null;
            }
        } else {
            type2 = null;
        }
        this.itemType = type2;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Collection collection = (Collection) this.propertyAccessor.getObject(t);
            if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj)) {
                JSONSchema jSONSchema = this.schema;
                if (jSONSchema != null) {
                    jSONSchema.assertValidate(collection);
                    return;
                }
                return;
            }
            String name = collection.getClass().getName();
            if ("java.util.Collections$UnmodifiableRandomAccessList".equals(name) || "java.util.Arrays$ArrayList".equals(name) || "java.util.Collections$SingletonList".equals(name) || name.startsWith("java.util.ImmutableCollections$") || name.startsWith("java.util.Collections$Unmodifiable")) {
                return;
            }
            for (Object objCreateInstance : (Collection) obj) {
                if (objCreateInstance == null) {
                    collection.add(null);
                } else {
                    if (objCreateInstance instanceof Map) {
                        Type type = this.itemType;
                        if ((type instanceof Class) && !((Class) type).isAssignableFrom(objCreateInstance.getClass())) {
                            if (this.itemReader == null) {
                                this.itemReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemReader.createInstance((Map) objCreateInstance, 0L);
                        }
                    }
                    collection.add(objCreateInstance);
                }
            }
            JSONSchema jSONSchema2 = this.schema;
            if (jSONSchema2 != null) {
                jSONSchema2.assertValidate(collection);
            }
        } catch (Exception e) {
            throw new JSONException(AbstractC2784.m4752(new StringBuilder("set "), this.fieldName, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        if (this.initReader == null) {
            this.initReader = jSONReader.getContext().getObjectReader(this.fieldType);
        }
        accept(t, jSONReader.jsonb ? this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, 0L) : this.initReader.readObject(jSONReader, this.fieldType, this.fieldName, 0L));
    }
}
