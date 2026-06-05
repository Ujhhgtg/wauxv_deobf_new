package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.GuavaSupport;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import p000.C1297feyxiexzfUjhhgtg;
import p000.C1311feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListStr implements ObjectReader {
    final Class instanceType;
    final Class listType;

    public ObjectReaderImplListStr(Class cls, Class cls2) {
        this.listType = cls;
        this.instanceType = cls2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$0(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$1(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
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
    public Class getObjectClass() {
        return this.listType;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Collection kotlinEmptyList;
        JSONArray jSONArray;
        ArrayList arrayList;
        Class objectClass = this.instanceType;
        Function functionImmutableListConverter = null;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.listType, 0L, j);
        if (objectReaderCheckAutoType != null) {
            objectClass = objectReaderCheckAutoType.getObjectClass();
        }
        int i = 0;
        if (objectClass == ObjectReaderImplList.CLASS_ARRAYS_LIST) {
            int iStartArray = jSONReader.startArray();
            String[] strArr = new String[iStartArray];
            while (i < iStartArray) {
                strArr[i] = jSONReader.readString();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int iStartArray2 = jSONReader.startArray();
        if (objectClass == ArrayList.class) {
            if (iStartArray2 > 0) {
                kotlinEmptyList = arrayList;
                arrayList = new ArrayList(iStartArray2);
            } else {
                kotlinEmptyList = arrayList;
                arrayList = new ArrayList();
            }
        } else if (objectClass == JSONArray.class) {
            if (iStartArray2 > 0) {
                kotlinEmptyList = jSONArray;
                jSONArray = new JSONArray(iStartArray2);
            } else {
                kotlinEmptyList = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION) {
            ArrayList arrayList2 = new ArrayList();
            functionImmutableListConverter = new C1311feyxiexzfUjhhgtg(13);
            kotlinEmptyList = arrayList2;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST) {
            ArrayList arrayList3 = new ArrayList();
            functionImmutableListConverter = new C1311feyxiexzfUjhhgtg(14);
            kotlinEmptyList = arrayList3;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_SET) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            functionImmutableListConverter = new C1311feyxiexzfUjhhgtg(15);
            kotlinEmptyList = linkedHashSet;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_SORTED_SET) {
            TreeSet treeSet = new TreeSet();
            functionImmutableListConverter = new C1311feyxiexzfUjhhgtg(16);
            kotlinEmptyList = treeSet;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_NAVIGABLE_SET) {
            TreeSet treeSet2 = new TreeSet();
            functionImmutableListConverter = new C1311feyxiexzfUjhhgtg(17);
            kotlinEmptyList = treeSet2;
        } else if (objectClass == ObjectReaderImplList.CLASS_SINGLETON) {
            ArrayList arrayList4 = new ArrayList();
            functionImmutableListConverter = new C1297feyxiexzfUjhhgtg(i);
            kotlinEmptyList = arrayList4;
        } else if (objectClass == ObjectReaderImplList.CLASS_SINGLETON_LIST) {
            ArrayList arrayList5 = new ArrayList();
            functionImmutableListConverter = new C1297feyxiexzfUjhhgtg(1);
            kotlinEmptyList = arrayList5;
        } else if (objectClass == null || objectClass == this.listType) {
            kotlinEmptyList = (Collection) createInstance(jSONReader.getContext().getFeatures() | j);
        } else {
            String typeName = objectClass.getTypeName();
            typeName.getClass();
            if (typeName.equals("com.google.common.collect.ImmutableList")) {
                ArrayList arrayList6 = new ArrayList();
                functionImmutableListConverter = GuavaSupport.immutableListConverter();
                kotlinEmptyList = arrayList6;
            } else if (typeName.equals("上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱᛳ能不能ᛴᛱUjhhgtgᛱ")) {
                kotlinEmptyList = ObjectReaderImplList.getKotlinEmptyList(objectClass);
            } else if (typeName.equals("java.util.Collections$EmptySet")) {
                kotlinEmptyList = Collections.EMPTY_SET;
            } else if (typeName.equals("java.util.Collections$EmptyList")) {
                kotlinEmptyList = Collections.EMPTY_LIST;
            } else if (typeName.equals("上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱᛳᛴ能不能ᛱUjhhgtgᛱ")) {
                kotlinEmptyList = ObjectReaderImplList.getKotlinEmptySet(objectClass);
            } else if (typeName.equals("com.google.common.collect.ImmutableSet")) {
                ArrayList arrayList7 = new ArrayList();
                functionImmutableListConverter = GuavaSupport.immutableSetConverter();
                kotlinEmptyList = arrayList7;
            } else if (typeName.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                kotlinEmptyList = new ArrayList();
            } else if (typeName.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                kotlinEmptyList = new LinkedList();
            } else {
                try {
                    kotlinEmptyList = (Collection) objectClass.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {
                    throw new JSONException(jSONReader.info("create instance error " + objectClass), e);
                }
            }
        }
        while (i < iStartArray2) {
            kotlinEmptyList.add(jSONReader.readString());
            i++;
        }
        return functionImmutableListConverter != null ? (Collection) functionImmutableListConverter.apply(kotlinEmptyList) : kotlinEmptyList;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        Collection hashSet = jSONReader.nextIfSet() ? new HashSet() : (Collection) createInstance(jSONReader.getContext().getFeatures() | j);
        char cCurrent = jSONReader.current();
        if (cCurrent == '[') {
            jSONReader.next();
            while (!jSONReader.nextIfArrayEnd()) {
                String string = jSONReader.readString();
                if (string != null || !(hashSet instanceof SortedSet)) {
                    hashSet.add(string);
                }
            }
        } else {
            if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '{') {
                throw new JSONException(jSONReader.info());
            }
            String string2 = jSONReader.readString();
            if (string2 != null && !string2.isEmpty()) {
                hashSet.add(string2);
            }
        }
        jSONReader.nextIfComma();
        return hashSet;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        if (this.listType.isInstance(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return collection;
        }
        Collection collection2 = (Collection) createInstance(0L);
        for (Object obj : collection) {
            if (obj != null && !(obj instanceof String)) {
                collection2.add(JSON.toJSONString(obj));
            } else {
                collection2.add(obj);
            }
        }
        return collection2;
    }
}
