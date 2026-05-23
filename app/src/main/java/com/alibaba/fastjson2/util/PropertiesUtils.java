package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class PropertiesUtils {
    /* JADX WARN: Code duplicated, block: B:59:0x00ab A[PHI: r10
      0x00ab: PHI (r10v4 ??) = (r10v3 ??), (r10v8 ??) binds: [B:31:0x0063, B:40:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static void paths(ObjectWriterProvider objectWriterProvider, Map<Object, String> map, Map map2, String str, Object obj) {
        String strM2786;
        Class<?> cls;
        if (obj == null) {
            return;
        }
        if (map.put(obj, str) == null || (cls = obj.getClass()) == String.class || cls == Boolean.class || cls == Character.class || cls == UUID.class || (obj instanceof Enum) || (obj instanceof Number) || (obj instanceof Date)) {
            int i = 0;
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        String str2 = (String) key;
                        ?? IsEmpty = str2.isEmpty();
                        if (IsEmpty == 0) {
                            char cCharAt = str2.charAt(i);
                            IsEmpty = ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_') ? 1 : i;
                            if (IsEmpty == 0) {
                                int i2 = 1;
                                IsEmpty = IsEmpty;
                                while (i2 < str2.length()) {
                                    char cCharAt2 = str2.charAt(i2);
                                    IsEmpty = ((cCharAt2 < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_')) ? 1 : 0;
                                    if (IsEmpty != 0) {
                                        break;
                                    }
                                    i2++;
                                    IsEmpty = IsEmpty;
                                }
                            }
                        }
                        if (IsEmpty != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append('[');
                            strM2786 = AbstractC1194.m2786(sb, JSON.toJSONString(str2, JSONWriter.Feature.UseSingleQuotes), ']');
                        } else {
                            if (str != null) {
                                str2 = str + "." + str2;
                            }
                            strM2786 = str2;
                        }
                        paths(objectWriterProvider, map, map2, strM2786, entry.getValue());
                    }
                    i = 0;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    paths(objectWriterProvider, map, map2, str + "[" + i3 + "]", it.next());
                    i3++;
                }
                return;
            }
            Class<?> cls2 = obj.getClass();
            if (cls2.isArray()) {
                int length = Array.getLength(obj);
                for (int i4 = 0; i4 < length; i4++) {
                    paths(objectWriterProvider, map, map2, str + "[" + i4 + "]", Array.get(obj, i4));
                }
                return;
            }
            if (ObjectWriterProvider.isPrimitiveOrEnum(cls2)) {
                map2.put(str, obj.toString());
                return;
            }
            ObjectWriter objectWriter = objectWriterProvider.getObjectWriter((Class) cls2);
            if (objectWriter instanceof ObjectWriterAdapter) {
                try {
                    for (Map.Entry<String, Object> entry2 : ((ObjectWriterAdapter) objectWriter).toMap(obj).entrySet()) {
                        String key2 = entry2.getKey();
                        if (key2 != null) {
                            if (str != null) {
                                key2 = str + "." + key2;
                            }
                            paths(objectWriterProvider, map, map2, key2, entry2.getValue());
                        }
                    }
                } catch (Exception e) {
                    throw new JSONException("toJSON error", e);
                }
            }
        }
    }

    public static <T> T toJavaObject(Properties properties, Class<T> cls) {
        return (T) toJavaObject(properties, JSONFactory.getDefaultObjectReaderProvider(), cls, new JSONReader.Feature[0]);
    }

    public static Properties toProperties(Object obj) {
        return toProperties(JSONFactory.getDefaultObjectWriterProvider(), obj, new JSONWriter.Feature[0]);
    }

    public static <T> T toJavaObject(Properties properties, ObjectReaderProvider objectReaderProvider, Class<T> cls, JSONReader.Feature... featureArr) {
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls);
        T t = (T) objectReader.createInstance(JSONReader.Feature.of(featureArr));
        for (Map.Entry entry : properties.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str.lastIndexOf(".") == -1) {
                FieldReader fieldReader = objectReader.getFieldReader(str);
                if (fieldReader != null) {
                    fieldReader.accept(t, TypeUtils.cast(str2, fieldReader.fieldType));
                }
            } else {
                JSONPath.set(t, str, str2);
            }
        }
        return t;
    }

    public static Properties toProperties(ObjectWriterProvider objectWriterProvider, Object obj, JSONWriter.Feature... featureArr) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Properties properties = new Properties();
        paths(objectWriterProvider, identityHashMap, properties, null, obj);
        return properties;
    }
}
