package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplGenericArray implements ObjectReader {
    final Class arrayClass;
    final String arrayClassName;
    final long arrayClassNameHash;
    final Type arrayType;
    final Class<?> componentClass;
    ObjectReader itemObjectReader;
    final Type itemType;

    public ObjectReaderImplGenericArray(GenericArrayType genericArrayType) {
        this.arrayType = genericArrayType;
        this.arrayClass = TypeUtils.getClass(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.itemType = genericComponentType;
        Class<?> mapping = TypeUtils.getMapping(genericComponentType);
        this.componentClass = mapping;
        String str = "[" + TypeUtils.getTypeName(mapping);
        this.arrayClassName = str;
        this.arrayClassNameHash = Fnv.hashCode64(str);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != this.arrayClassNameHash) {
            throw new JSONException(AbstractC2844.m4790("not support input typeName ", jSONReader.getString()));
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0 && this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.getContext().getObjectReader(this.itemType);
        }
        Object objNewInstance = Array.newInstance(this.componentClass, iStartArray);
        int i = 0;
        while (i < iStartArray) {
            JSONReader jSONReader2 = jSONReader;
            Array.set(objNewInstance, i, this.itemObjectReader.readJSONBObject(jSONReader2, this.itemType, null, 0L));
            i++;
            jSONReader = jSONReader2;
        }
        return objNewInstance;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object string;
        if (this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.getContext().getObjectReader(this.itemType);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        JSONReader jSONReader2 = jSONReader;
        if (jSONReader2.readIfNull()) {
            return null;
        }
        char cCurrent = jSONReader2.current();
        if (cCurrent == '\"') {
            if (!(type instanceof GenericArrayType) || ((GenericArrayType) type).getGenericComponentType() != Byte.TYPE) {
                if (jSONReader2.readString().isEmpty()) {
                    return null;
                }
                throw new JSONException(jSONReader2.info());
            }
            if ((jSONReader2.features(j) & JSONReader.Feature.Base64StringAsByteArray.mask) == 0) {
                return jSONReader2.readBinary();
            }
            return Base64.getDecoder().decode(jSONReader2.readString());
        }
        ArrayList arrayList = new ArrayList();
        if (cCurrent != '[') {
            throw new JSONException(jSONReader2.info());
        }
        jSONReader2.next();
        while (!jSONReader2.nextIfArrayEnd()) {
            JSONReader jSONReader3 = jSONReader2;
            ObjectReader objectReader = this.itemObjectReader;
            if (objectReader != null) {
                string = objectReader.readObject(jSONReader3, this.itemType, null, 0L);
                jSONReader2 = jSONReader3;
            } else {
                jSONReader2 = jSONReader3;
                if (this.itemType != String.class) {
                    throw new JSONException(jSONReader2.info("TODO : " + this.itemType));
                }
                string = jSONReader2.readString();
            }
            arrayList.add(string);
            jSONReader2.nextIfComma();
        }
        jSONReader2.nextIfComma();
        Object objNewInstance = Array.newInstance(this.componentClass, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
