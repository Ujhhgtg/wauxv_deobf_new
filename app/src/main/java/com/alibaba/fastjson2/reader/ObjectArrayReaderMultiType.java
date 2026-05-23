package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.MultiType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayReaderMultiType implements ObjectReader {
    final ObjectReader[] readers;
    final Type[] types;

    public ObjectArrayReaderMultiType(MultiType multiType) {
        int size = multiType.size();
        Type[] typeArr = new Type[size];
        for (int i = 0; i < multiType.size(); i++) {
            typeArr[i] = multiType.getType(i);
        }
        this.types = typeArr;
        this.readers = new ObjectReader[size];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        return new Object[this.types.length];
    }

    public ObjectReader getObjectReader(JSONReader jSONReader, int i) {
        ObjectReader objectReader = this.readers[i];
        if (objectReader != null) {
            return objectReader;
        }
        ObjectReader objectReader2 = jSONReader.getObjectReader(this.types[i]);
        this.readers[i] = objectReader2;
        return objectReader2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.reader.ObjectReader] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.alibaba.fastjson2.reader.ObjectArrayReaderMultiType] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        ?? r10;
        ?? r4;
        long j2;
        ?? object;
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        ?? r12 = new Object[this.types.length];
        int i = 0;
        while (i < iStartArray) {
            if (r10.isReference()) {
                String reference = r10.readReference();
                if ("..".equals(reference)) {
                    r10 = jSONReader;
                    object = r12;
                } else {
                    r10 = jSONReader;
                    r10.addResolveTask(r12, i, JSONPath.of(reference));
                    object = 0;
                }
                r4 = r10;
                j2 = j;
            } else {
                r10 = jSONReader;
                r4 = r10;
                j2 = j;
                object = getObjectReader(r10, i).readObject(r4, this.types[i], Integer.valueOf(i), j2);
            }
            r12[i] = object;
            i++;
            r10 = r4;
            j = j2;
        }
        r10 = jSONReader;
        return r12;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        long j2;
        Object object;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        JSONReader jSONReader2 = jSONReader;
        if (jSONReader2.nextIfNullOrEmptyString()) {
            return null;
        }
        Object[] objArr = new Object[this.types.length];
        if (!jSONReader2.nextIfArrayStart()) {
            throw new JSONException(jSONReader2.info("TODO"));
        }
        int i = 0;
        JSONReader jSONReader3 = jSONReader2;
        while (!jSONReader3.nextIfArrayEnd()) {
            if (jSONReader3.isReference()) {
                String reference = jSONReader3.readReference();
                if ("..".equals(reference)) {
                    object = objArr;
                } else {
                    jSONReader3.addResolveTask(objArr, i, JSONPath.of(reference));
                    object = null;
                }
                j2 = j;
            } else {
                JSONReader jSONReader4 = jSONReader3;
                j2 = j;
                object = getObjectReader(jSONReader4, i).readObject(jSONReader4, this.types[i], Integer.valueOf(i), j2);
                jSONReader3 = jSONReader4;
            }
            objArr[i] = object;
            jSONReader3.nextIfComma();
            i++;
            j = j2;
            jSONReader3 = jSONReader3;
        }
        jSONReader3.nextIfComma();
        return objArr;
    }
}
