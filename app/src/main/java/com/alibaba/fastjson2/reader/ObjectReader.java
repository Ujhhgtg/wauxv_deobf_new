package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReader<T> {
    public static final long HASH_TYPE = Fnv.hashCode64("@type");
    public static final String VALUE_NAME = "@value";

    default T accept(T t, Map map, long j) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            FieldReader fieldReader = getFieldReader(string);
            if (fieldReader == null) {
                acceptExtra(t, string, entry.getValue(), j);
            } else {
                fieldReader.acceptAny(t, value, j);
            }
        }
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(t) : t;
    }

    default void acceptExtra(Object obj, String str, Object obj2, long j) {
    }

    default ObjectReader autoType(JSONReader.Context context, long j) {
        return context.getObjectReaderAutoType(j);
    }

    default T createInstance() {
        return createInstance(0L);
    }

    default T createInstanceNoneDefaultConstructor(Map<Long, Object> map) {
        throw new UnsupportedOperationException();
    }

    default Function getBuildFunction() {
        return null;
    }

    default long getFeatures() {
        return 0L;
    }

    default FieldReader getFieldReader(long j) {
        return null;
    }

    default FieldReader getFieldReaderLCase(long j) {
        return null;
    }

    default Class<T> getObjectClass() {
        return null;
    }

    default String getTypeKey() {
        return "@type";
    }

    default long getTypeKeyHash() {
        return HASH_TYPE;
    }

    default T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    default T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    default T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.isArray() && jSONReader.isSupportBeanArray()) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j);
        }
        jSONReader.nextIfObjectStart();
        JSONReader.Context context = jSONReader.getContext();
        long features = context.getFeatures() | j;
        int i = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == getTypeKeyHash() && i == 0) {
                ObjectReader objectReaderAutoType = autoType(context, jSONReader.readTypeHashCode());
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        throw new JSONException(jSONReader.info("No suitable ObjectReader found for " + string));
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | features)) {
                    long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                    if (nameHashCodeLCase != fieldNameHashCode) {
                        fieldReader = getFieldReaderLCase(nameHashCodeLCase);
                    }
                }
                if (fieldReader == null) {
                    jSONReader.skipValue();
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(features);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i++;
        }
        return tCreateInstance != null ? tCreateInstance : createInstance(features);
    }

    T readObject(JSONReader jSONReader, Type type, Object obj, long j);

    default T readObject(String str, JSONReader.Feature... featureArr) {
        JSONReader jSONReaderOf = JSONReader.of(str, JSONFactory.createReadContext(featureArr));
        try {
            T object = readObject(jSONReaderOf, null, null, getFeatures());
            if (jSONReaderOf != null) {
                jSONReaderOf.close();
            }
            return object;
        } catch (Throwable th) {
            if (jSONReaderOf == null) {
                throw th;
            }
            try {
                jSONReaderOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    default boolean setFieldValue(Object obj, String str, long j, int i) {
        FieldReader fieldReader = getFieldReader(j);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, i);
        return true;
    }

    default void acceptExtra(Object obj, String str, Object obj2) {
        acceptExtra(obj, str, obj2, getFeatures());
    }

    default ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j) {
        return objectReaderProvider.getObjectReader(j);
    }

    default T createInstance(long j) {
        throw new UnsupportedOperationException();
    }

    default FieldReader getFieldReader(String str) {
        long jHashCode64 = Fnv.hashCode64(str);
        FieldReader fieldReader = getFieldReader(jHashCode64);
        if (fieldReader == null && (fieldReader = getFieldReaderLCase(jHashCode64)) == null) {
            long jHashCode64LCase = Fnv.hashCode64LCase(str);
            if (jHashCode64LCase != jHashCode64) {
                return getFieldReaderLCase(jHashCode64LCase);
            }
        }
        return fieldReader;
    }

    default T createInstance(Collection collection) {
        return createInstance(collection, 0L);
    }

    default boolean setFieldValue(Object obj, String str, long j, long j2) {
        FieldReader fieldReader = getFieldReader(j);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, j2);
        return true;
    }

    default T createInstance(Collection collection, JSONReader.Feature... featureArr) {
        return createInstance(collection, JSONReader.Feature.of(featureArr));
    }

    default T createInstance(Collection collection, long j) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, getFeatures());
    }

    default boolean setFieldValue(Object obj, String str, Object obj2) {
        FieldReader fieldReader = getFieldReader(str);
        if (fieldReader == null) {
            return false;
        }
        fieldReader.accept(obj, obj2);
        return true;
    }

    default T createInstance(Map map, JSONReader.Feature... featureArr) {
        long j = 0;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
        }
        return createInstance(map, j);
    }

    default T readObject(JSONReader jSONReader, long j) {
        return readObject(jSONReader, null, null, j);
    }

    default T createInstance(Map map, long j) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(getTypeKey());
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (this instanceof ObjectReaderSeeAlso)) ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return objectReaderAutoType.createInstance(map, j);
            }
        }
        return accept(createInstance(0L), map, j);
    }
}
