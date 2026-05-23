package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListInt64 implements ObjectReader {
    final Class instanceType;
    final long instanceTypeHash;
    final Class listType;

    public ObjectReaderImplListInt64(Class cls, Class cls2) {
        this.listType = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = Fnv.hashCode64(TypeUtils.getTypeName(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j) {
        Class cls = this.instanceType;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create list error, type " + this.instanceType);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Collection jSONArray;
        Function buildFunction;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        Class objectClass = this.listType;
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(objectClass, this.instanceTypeHash, j);
        if (objectReaderCheckAutoType != null) {
            objectClass = objectReaderCheckAutoType.getObjectClass();
        }
        if (objectClass == ArrayList.class) {
            jSONArray = new ArrayList();
        } else if (objectClass == JSONArray.class) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = (objectClass == null || objectClass == this.listType) ? (Collection) createInstance(jSONReader.getContext().getFeatures() | j) : (Collection) objectReaderCheckAutoType.createInstance(j);
        }
        int iStartArray = jSONReader.startArray();
        for (int i = 0; i < iStartArray; i++) {
            jSONArray.add(jSONReader.readInt64());
        }
        return (objectReaderCheckAutoType == null || (buildFunction = objectReaderCheckAutoType.getBuildFunction()) == null) ? jSONArray : (Collection) buildFunction.apply(jSONArray);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isString()) {
            Collection collection = (Collection) createInstance(jSONReader.getContext().getFeatures() | j);
            String string = jSONReader.readString();
            if (string.indexOf(44) != -1) {
                for (String str : string.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(string)));
            }
            jSONReader.nextIfComma();
            return collection;
        }
        boolean zNextIfSet = jSONReader.nextIfSet();
        if (jSONReader.current() != '[') {
            throw new JSONException(jSONReader.info("format error"));
        }
        jSONReader.next();
        Collection linkedHashSet = (zNextIfSet && this.instanceType == Collection.class) ? new LinkedHashSet() : (Collection) createInstance(jSONReader.getContext().getFeatures() | j);
        while (!jSONReader.isEnd()) {
            if (jSONReader.nextIfArrayEnd()) {
                jSONReader.nextIfComma();
                return linkedHashSet;
            }
            linkedHashSet.add(jSONReader.readInt64());
        }
        throw new JSONException(jSONReader.info("illegal input error"));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Collection collection2 = (Collection) createInstance(j);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(TypeUtils.toLong(it.next()));
        }
        return collection2;
    }
}
