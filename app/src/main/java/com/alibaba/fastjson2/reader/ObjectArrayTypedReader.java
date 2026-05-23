package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayTypedReader extends ObjectReaderPrimitive {
    final Class componentClass;
    final long componentClassHash;
    final Class componentType;
    final String typeName;
    final long typeNameHashCode;

    public ObjectArrayTypedReader(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.componentType = componentType;
        String typeName = TypeUtils.getTypeName(componentType);
        this.componentClassHash = Fnv.hashCode64(typeName);
        String strM4757 = AbstractC2784.m4757("[", typeName);
        this.typeName = strM4757;
        this.typeNameHashCode = Fnv.hashCode64(strM4757);
        this.componentClass = TypeUtils.getClass(componentType);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        Class<?> cls;
        Function typeConvert;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.componentClass, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && (cls = next.getClass()) != this.componentType && (typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(cls, this.componentType)) != null) {
                next = typeConvert.apply(next);
            }
            if (!this.componentType.isInstance(next)) {
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(this.componentType);
                if (next instanceof Map) {
                    next = objectReader.createInstance((Map) next, new JSONReader.Feature[0]);
                } else if (next instanceof Collection) {
                    next = objectReader.createInstance((Collection) next, j);
                } else if (next instanceof Object[]) {
                    next = objectReader.createInstance(JSONArray.of((Object[]) next), j);
                } else if (next != null) {
                    Class<?> cls2 = next.getClass();
                    if (!cls2.isArray()) {
                        throw new JSONException("component type not match, expect " + this.componentType.getName() + ", but " + cls2);
                    }
                    int length = Array.getLength(next);
                    JSONArray jSONArray = new JSONArray(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONArray.add(Array.get(next, i2));
                    }
                    next = objectReader.createInstance(jSONArray, j);
                } else {
                    continue;
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object jSONBObject;
        Object obj2;
        if (jSONReader.getType() == -110) {
            jSONReader.next();
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != ObjectArrayReader.TYPE_HASH_CODE && typeHashCode != this.typeNameHashCode) {
                if (!jSONReader.isSupportAutoType(j)) {
                    throw new JSONException(jSONReader.info("not support autotype : " + jSONReader.getString()));
                }
                ObjectReader objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, this.objectClass, j);
                if (objectReaderAutoType != null) {
                    return objectReaderAutoType.readObject(jSONReader, type, obj, j);
                }
                throw new JSONException(jSONReader.info("autoType not support : " + jSONReader.getString()));
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.componentClass, iStartArray);
        for (int i = 0; i < iStartArray; i++) {
            if (jSONReader.isReference()) {
                String reference = jSONReader.readReference();
                if ("..".equals(reference)) {
                    obj2 = objArr;
                } else {
                    jSONReader.addResolveTask(objArr, i, JSONPath.of(reference));
                    obj2 = null;
                }
                jSONBObject = obj2;
            } else {
                ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.componentClass, this.componentClassHash, j);
                jSONBObject = objectReaderCheckAutoType != null ? objectReaderCheckAutoType.readJSONBObject(jSONReader, null, null, j) : jSONReader.read(this.componentType);
            }
            objArr[i] = jSONBObject;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.nextIfArrayStart()) {
            Object[] objArrCopyOf = (Object[]) Array.newInstance((Class<?>) this.componentType, 16);
            int i = 0;
            while (!jSONReader.nextIfArrayEnd()) {
                int i2 = i + 1;
                if (i2 - objArrCopyOf.length > 0) {
                    int length = objArrCopyOf.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                objArrCopyOf[i] = jSONReader.read(this.componentType);
                jSONReader.nextIfComma();
                i = i2;
            }
            jSONReader.nextIfMatch(',');
            return Arrays.copyOf(objArrCopyOf, i);
        }
        if (jSONReader.current() == '{') {
            jSONReader.next();
            if (jSONReader.readFieldNameHashCode() == ObjectReader.HASH_TYPE) {
                jSONReader.readString();
            }
        }
        if (jSONReader.isString()) {
            String string = jSONReader.readString();
            if (string == null || string.isEmpty()) {
                return null;
            }
            if (ObjectReader.VALUE_NAME.equals(string)) {
                jSONReader.next();
                Object object = readObject(jSONReader, type, obj, j);
                jSONReader.nextIfObjectEnd();
                return object;
            }
        }
        throw new JSONException(jSONReader.info("TODO"));
    }
}
