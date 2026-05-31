package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCollection extends ObjectWriterPrimitiveImpl {
    long features;
    Type itemType;
    static final ObjectWriterImplCollection INSTANCE = new ObjectWriterImplCollection();
    static final byte[] LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES = JSONB.toBytes(TypeUtils.getTypeName(LinkedHashSet.class));
    static final long LINKED_HASH_SET_JSONB_TYPE_HASH = Fnv.hashCode64(TypeUtils.getTypeName(LinkedHashSet.class));
    static final byte[] TREE_SET_JSONB_TYPE_NAME_BYTES = JSONB.toBytes(TypeUtils.getTypeName(TreeSet.class));
    static final long TREE_SET_JSONB_TYPE_HASH = Fnv.hashCode64(TypeUtils.getTypeName(TreeSet.class));

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j);
            return;
        }
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (obj instanceof Set) {
            long features = jSONWriter.getFeatures(this.features | j);
            if (jSONWriter.isWriteTypeInfo(obj, features) && (features & JSONWriter.Feature.NotWriteSetClassName.mask) == 0) {
                jSONWriter.writeRaw("Set");
            }
        }
        jSONWriter.startArray();
        Class<?> cls = null;
        int i = 0;
        ObjectWriter objectWriter = null;
        for (Object obj3 : (Iterable) obj) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            if (obj3 == null) {
                jSONWriter.writeNull();
                i++;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    objectWriter = jSONWriter.getObjectWriter(cls2);
                    cls = cls2;
                }
                ObjectWriter objectWriter2 = objectWriter;
                objectWriter2.write(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                i++;
                objectWriter = objectWriter2;
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Type type2;
        Class<?> cls2;
        Type type3;
        String path;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls3 = null;
        if (type instanceof Class) {
            cls = (Class) type;
            type2 = null;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            type2 = actualTypeArguments.length == 1 ? actualTypeArguments[0] : null;
            Type rawType = parameterizedType.getRawType();
            cls = rawType instanceof Class ? (Class) rawType : null;
        } else {
            cls = null;
            type2 = null;
        }
        Collection collection = (Collection) obj;
        Class<?> cls4 = obj.getClass();
        boolean zIsWriteTypeInfo = jSONWriter.isWriteTypeInfo(obj, cls);
        if (zIsWriteTypeInfo && ((cls == Set.class && cls4 == HashSet.class) || (type == Collection.class && cls4 == ArrayList.class))) {
            zIsWriteTypeInfo = false;
        }
        if (zIsWriteTypeInfo) {
            if (cls4 == LinkedHashSet.class) {
                jSONWriter.writeTypeName(LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES, LINKED_HASH_SET_JSONB_TYPE_HASH);
            } else if (cls4 == TreeSet.class) {
                jSONWriter.writeTypeName(TREE_SET_JSONB_TYPE_NAME_BYTES, TREE_SET_JSONB_TYPE_HASH);
            } else {
                jSONWriter.writeTypeName(TypeUtils.getTypeName(cls4));
            }
        }
        boolean zIsRefDetect = (collection.size() <= 1 || (collection instanceof SortedSet) || (collection instanceof LinkedHashSet)) ? jSONWriter.isRefDetect() : false;
        jSONWriter.startArray(collection.size());
        ObjectWriter objectWriter = null;
        int i = 0;
        for (Object obj3 : collection) {
            if (obj3 == null) {
                jSONWriter.writeNull();
                cls2 = cls3;
            } else {
                Class<?> cls5 = obj3.getClass();
                if (cls5 == cls3) {
                    cls2 = cls3;
                } else {
                    objectWriter = jSONWriter.getObjectWriter(cls5);
                    cls2 = cls5;
                }
                boolean z = zIsRefDetect && !ObjectWriterProvider.isNotReferenceDetect(cls5);
                if (!z || (path = jSONWriter.setPath(i, obj3)) == null) {
                    type3 = type2;
                    objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), type3, j);
                    if (z) {
                        jSONWriter.popPath(obj3);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj3);
                }
                i++;
                type2 = type3;
                cls3 = cls2;
            }
            type3 = type2;
            i++;
            type2 = type3;
            cls3 = cls2;
        }
    }
}
