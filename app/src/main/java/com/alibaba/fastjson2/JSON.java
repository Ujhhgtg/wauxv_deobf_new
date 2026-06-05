package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.AfterFilter;
import com.alibaba.fastjson2.filter.BeforeFilter;
import com.alibaba.fastjson2.filter.ContextNameFilter;
import com.alibaba.fastjson2.filter.ContextValueFilter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.filter.LabelFilter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.MapMultiValueType;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface JSON {
    public static final String VERSION = "2.0.61";

    static void config(JSONReader.Feature... featureArr) {
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.SupportAutoType) {
                throw new JSONException("not support config global autotype support");
            }
            JSONFactory.defaultReaderFeatures |= feature.mask;
        }
    }

    @SafeVarargs
    static void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        JSONFactory.getDefaultObjectWriterProvider().configEnumAsJavaBean(clsArr);
    }

    static void configReaderDateFormat(String str) {
        JSONFactory.defaultReaderFormat = str;
    }

    static void configReaderZoneId(ZoneId zoneId) {
        JSONFactory.defaultReaderZoneId = zoneId;
    }

    static void configWriterDateFormat(String str) {
        JSONFactory.defaultWriterFormat = str;
    }

    static void configWriterZoneId(ZoneId zoneId) {
        JSONFactory.defaultWriterZoneId = zoneId;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    static <T> T copy(T t, JSONWriter.Feature... featureArr) throws Throwable {
        JSONReader jSONReader;
        Throwable th;
        if (t == null) {
            return null;
        }
        Class<?> cls = t.getClass();
        if (ObjectWriterProvider.isPrimitiveOrEnum(cls)) {
            return t;
        }
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        boolean z2 = false;
        for (JSONWriter.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONWriter.Feature.FieldBased) {
                z = true;
            } else if (feature == JSONWriter.Feature.BeanToArray) {
                z2 = true;
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls, cls, z);
        ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z);
        if ((objectWriter instanceof ObjectWriterAdapter) && (objectReader instanceof ObjectReaderBean)) {
            List<FieldWriter> fieldWriters = objectWriter.getFieldWriters();
            int size = fieldWriters.size();
            if (objectReader instanceof ObjectReaderNoneDefaultConstructor) {
                HashMap map = new HashMap(size, 1.0f);
                for (int i = 0; i < size; i++) {
                    FieldWriter fieldWriter = fieldWriters.get(i);
                    map.put(fieldWriter.fieldName, fieldWriter.getFieldValue(t));
                }
                return (T) objectReader.createInstance(map, j);
            }
            T t2 = (T) objectReader.createInstance(j);
            for (int i2 = 0; i2 < size; i2++) {
                FieldWriter fieldWriter2 = fieldWriters.get(i2);
                FieldReader fieldReader = objectReader.getFieldReader(fieldWriter2.fieldName);
                if (fieldReader != null) {
                    fieldReader.accept(t2, copy(fieldWriter2.getFieldValue(t), new JSONWriter.Feature[0]));
                }
            }
            return t2;
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.config(JSONWriter.Feature.WriteClassName);
            objectWriter.writeJSONB(jSONWriterOfJSONB, t, null, null, 0L);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(bytes, JSONReader.Feature.SupportAutoType, JSONReader.Feature.SupportClassForName);
            if (z2) {
                try {
                    jSONReaderOfJSONB.context.config(JSONReader.Feature.SupportArrayToBean);
                } catch (Throwable th2) {
                    th = th2;
                    jSONReader = jSONReaderOfJSONB;
                    th = th;
                    if (jSONReader != null) {
                        throw th;
                    }
                    try {
                        jSONReader.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            }
            jSONReader = jSONReaderOfJSONB;
            try {
                T t3 = (T) objectReader.readJSONBObject(jSONReader, null, null, j);
                if (jSONReader != null) {
                    jSONReader.close();
                }
                return t3;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                if (jSONReader != null) {
                    throw th;
                }
                jSONReader.close();
                throw th;
            }
        } catch (Throwable th5) {
            if (jSONWriterOfJSONB == null) {
                throw th5;
            }
            try {
                jSONWriterOfJSONB.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    static <T> T copyTo(Object obj, Class<T> cls, JSONWriter.Feature... featureArr) throws Throwable {
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = obj.getClass();
        long j = JSONFactory.defaultReaderFeatures;
        boolean z = false;
        boolean z2 = false;
        for (JSONWriter.Feature feature : featureArr) {
            j |= feature.mask;
            if (feature == JSONWriter.Feature.FieldBased) {
                z = true;
            } else if (feature == JSONWriter.Feature.BeanToArray) {
                z2 = true;
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter(cls2, cls2, z);
        ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z);
        if (!(objectWriter instanceof ObjectWriterAdapter) || !(objectReader instanceof ObjectReaderBean)) {
            JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
            try {
                jSONWriterOfJSONB.config(JSONWriter.Feature.WriteClassName);
                objectWriter.writeJSONB(jSONWriterOfJSONB, obj, null, null, 0L);
                byte[] bytes = jSONWriterOfJSONB.getBytes();
                jSONWriterOfJSONB.close();
                JSONReader jSONReaderOfJSONB = JSONReader.ofJSONB(bytes, JSONReader.Feature.SupportAutoType, JSONReader.Feature.SupportClassForName);
                if (z2) {
                    try {
                        jSONReaderOfJSONB.context.config(JSONReader.Feature.SupportArrayToBean);
                    } catch (Throwable th) {
                        if (jSONReaderOfJSONB == null) {
                            throw th;
                        }
                        try {
                            jSONReaderOfJSONB.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                T t = (T) objectReader.readJSONBObject(jSONReaderOfJSONB, null, null, 0L);
                if (jSONReaderOfJSONB != null) {
                    jSONReaderOfJSONB.close();
                }
                return t;
            } catch (Throwable th3) {
                if (jSONWriterOfJSONB == null) {
                    throw th3;
                }
                try {
                    jSONWriterOfJSONB.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        List<FieldWriter> fieldWriters = objectWriter.getFieldWriters();
        if (objectReader instanceof ObjectReaderNoneDefaultConstructor) {
            HashMap map = new HashMap(fieldWriters.size(), 1.0f);
            for (int i = 0; i < fieldWriters.size(); i++) {
                FieldWriter fieldWriter = fieldWriters.get(i);
                map.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
            }
            return (T) objectReader.createInstance(map, j);
        }
        T t2 = (T) objectReader.createInstance(j);
        for (int i2 = 0; i2 < fieldWriters.size(); i2++) {
            FieldWriter fieldWriter2 = fieldWriters.get(i2);
            FieldReader fieldReader = objectReader.getFieldReader(fieldWriter2.fieldName);
            if (fieldReader != null) {
                Object fieldValue = fieldWriter2.getFieldValue(obj);
                Class cls3 = fieldWriter2.fieldClass;
                if (cls3 == Date.class && fieldReader.fieldClass == String.class) {
                    fieldValue = DateUtils.format((Date) fieldValue, fieldWriter2.format);
                } else if (cls3 == LocalDate.class && fieldReader.fieldClass == String.class) {
                    fieldValue = DateUtils.format((LocalDate) fieldValue, fieldWriter2.format);
                } else if (fieldValue != null && !fieldReader.supportAcceptType(fieldValue.getClass())) {
                    fieldValue = copy(fieldValue, new JSONWriter.Feature[0]);
                }
                fieldReader.accept(t2, fieldValue);
            }
        }
        return t2;
    }

    static boolean isEnabled(JSONReader.Feature feature) {
        return (JSONFactory.defaultReaderFeatures & feature.mask) != 0;
    }

    static boolean isValid(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(str);
                try {
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static boolean isValidArray(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(str);
                try {
                    if (!jSONReaderOf.isArray()) {
                        jSONReaderOf.close();
                        return false;
                    }
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static boolean isValidObject(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(str);
                try {
                    if (!jSONReaderOf.isObject()) {
                        jSONReaderOf.close();
                        return false;
                    }
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static void mixIn(Class<?> cls, Class<?> cls2) {
        JSONFactory.defaultObjectWriterProvider.mixIn(cls, cls2);
        JSONFactory.getDefaultObjectReaderProvider().mixIn(cls, cls2);
    }

    static Object parse(String str) {
        Object object;
        Object obj;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            char cCurrent = jSONReaderOf.current();
            if (context.objectSupplier == null && (context.features & JSONReader.Feature.UseNativeObject.mask) == 0 && (cCurrent == '{' || cCurrent == '[')) {
                if (cCurrent == '{') {
                    JSONObject jSONObject = new JSONObject();
                    jSONReaderOf.read(jSONObject, 0L);
                    obj = jSONObject;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    jSONReaderOf.read((List) jSONArray);
                    obj = jSONArray;
                }
                object = obj;
                if (jSONReaderOf.resolveTasks != null) {
                    jSONReaderOf.handleResolveTasks(obj);
                    object = obj;
                }
            } else {
                object = defaultObjectReaderProvider.getObjectReader(Object.class, false).readObject(jSONReaderOf, null, null, 0L);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONArray parseArray(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static ObjectReader<?> register(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.getDefaultObjectReaderProvider().register(type, objectReader);
    }

    static ObjectReader<?> registerIfAbsent(Type type, ObjectReader<?> objectReader) {
        return JSONFactory.getDefaultObjectReaderProvider().registerIfAbsent(type, objectReader);
    }

    static void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    static <T> T to(Class<T> cls, Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof JSONObject ? (T) ((JSONObject) obj).to((Class) cls, new JSONReader.Feature[0]) : (T) TypeUtils.cast(obj, (Class) cls, JSONFactory.getDefaultObjectReaderProvider());
    }

    static Object toJSON(Object obj) {
        return toJSON(obj, null);
    }

    static byte[] toJSONBytes(Object obj) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(new JSONWriter.Context(objectWriterProvider));
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterOfUTF8.context.features == 0) {
                    jSONWriterOfUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static String toJSONString(Object obj) {
        Object obj2;
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        try {
            JSONWriter jSONWriterOf = JSONWriter.of(context);
            try {
                try {
                    if (obj == null) {
                        jSONWriterOf.writeNull();
                    } else {
                        jSONWriterOf.rootObject = obj;
                        jSONWriterOf.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        if (cls != JSONObject.class || context.features != 0) {
                            obj2 = obj;
                            try {
                                objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOf, obj2, null, null, 0L);
                                String string = jSONWriterOf.toString();
                                jSONWriterOf.close();
                                return string;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (jSONWriterOf == null) {
                                    throw th2;
                                }
                                try {
                                    jSONWriterOf.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        jSONWriterOf.write((JSONObject) obj);
                    }
                    obj2 = obj;
                    String string2 = jSONWriterOf.toString();
                    jSONWriterOf.close();
                    return string2;
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = obj;
                }
            } catch (NullPointerException e) {
                e = e;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            } catch (NumberFormatException e2) {
                e = e2;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            }
        } catch (NullPointerException | NumberFormatException e3) {
            e = e3;
            obj2 = obj;
        }
    }

    static <T> T toJavaObject(Object obj, Class<T> cls) {
        return (T) to(cls, obj);
    }

    static int writeTo(OutputStream outputStream, Object obj) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Throwable th) {
                if (jSONWriterOfUTF8 == null) {
                    throw th;
                }
                try {
                    jSONWriterOfUTF8.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            throw new JSONException(e.getMessage(), e);
        }
    }

    static boolean isEnabled(JSONWriter.Feature feature) {
        return (JSONFactory.defaultWriterFeatures & feature.mask) != 0;
    }

    static ObjectReader<?> register(Type type, ObjectReader<?> objectReader, boolean z) {
        return JSONFactory.getDefaultObjectReaderProvider().register(type, objectReader, z);
    }

    static ObjectReader<?> registerIfAbsent(Type type, ObjectReader<?> objectReader, boolean z) {
        return JSONFactory.getDefaultObjectReaderProvider().registerIfAbsent(type, objectReader, z);
    }

    static void registerSeeAlsoSubType(Class cls, String str) {
        JSONFactory.getDefaultObjectReaderProvider().registerSeeAlsoSubType(cls, str);
    }

    static Object toJSON(Object obj, JSONWriter.Feature... featureArr) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj;
        }
        JSONWriter.Context contextCreateWriteContext = featureArr == null ? JSONFactory.createWriteContext() : JSONFactory.createWriteContext(featureArr);
        Class<?> cls = obj.getClass();
        ObjectWriter objectWriter = contextCreateWriteContext.getObjectWriter(cls, cls);
        if ((objectWriter instanceof ObjectWriterAdapter) && !contextCreateWriteContext.isEnabled(JSONWriter.Feature.ReferenceDetection) && (objectWriter.getFeatures() & JSONWriter.Feature.WriteClassName.mask) == 0) {
            return ((ObjectWriterAdapter) objectWriter).toJSONObject(obj, contextCreateWriteContext.features);
        }
        try {
            JSONWriter jSONWriterOf = JSONWriter.of(contextCreateWriteContext);
            try {
                objectWriter.write(jSONWriterOf, obj, null, null, contextCreateWriteContext.features);
                String string = jSONWriterOf.toString();
                jSONWriterOf.close();
                return parse(string);
            } catch (Throwable th) {
                if (jSONWriterOf == null) {
                    throw th;
                }
                try {
                    jSONWriterOf.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (NullPointerException | NumberFormatException e) {
            throw new JSONException("toJSONString error", e);
        }
    }

    static boolean register(ObjectReaderModule objectReaderModule) {
        return JSONFactory.getDefaultObjectReaderProvider().register(objectReaderModule);
    }

    static ObjectWriter<?> registerIfAbsent(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.getDefaultObjectWriterProvider().registerIfAbsent(type, objectWriter);
    }

    static ObjectWriter<?> registerIfAbsent(Type type, ObjectWriter<?> objectWriter, boolean z) {
        return JSONFactory.getDefaultObjectWriterProvider().registerIfAbsent(type, objectWriter, z);
    }

    static boolean register(ObjectWriterModule objectWriterModule) {
        return JSONFactory.getDefaultObjectWriterProvider().register(objectWriterModule);
    }

    static void config(JSONReader.Feature feature, boolean z) {
        if (feature == JSONReader.Feature.SupportAutoType && z) {
            throw new JSONException("not support config global autotype support");
        }
        if (z) {
            JSONFactory.defaultReaderFeatures = feature.mask | JSONFactory.defaultReaderFeatures;
        } else {
            JSONFactory.defaultReaderFeatures = (~feature.mask) & JSONFactory.defaultReaderFeatures;
        }
    }

    static ObjectWriter<?> register(Type type, ObjectWriter<?> objectWriter) {
        return JSONFactory.getDefaultObjectWriterProvider().register(type, objectWriter);
    }

    static boolean isValid(String str, JSONReader.Feature... featureArr) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(str, JSONFactory.createReadContext(featureArr));
                try {
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static ObjectWriter<?> register(Type type, ObjectWriter<?> objectWriter, boolean z) {
        return JSONFactory.getDefaultObjectWriterProvider().register(type, objectWriter, z);
    }

    static void register(Class cls, Filter filter) {
        if ((filter instanceof AfterFilter) || (filter instanceof BeforeFilter) || (filter instanceof ContextNameFilter) || (filter instanceof ContextValueFilter) || (filter instanceof LabelFilter) || (filter instanceof NameFilter) || (filter instanceof PropertyFilter) || (filter instanceof PropertyPreFilter) || (filter instanceof ValueFilter)) {
            JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(cls).setFilter(filter);
        }
    }

    static boolean isValidArray(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(bArr);
                try {
                    if (!jSONReaderOf.isArray()) {
                        jSONReaderOf.close();
                        return false;
                    }
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static boolean isValidObject(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(bArr);
                try {
                    if (!jSONReaderOf.isObject()) {
                        jSONReaderOf.close();
                        return false;
                    }
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static void config(JSONWriter.Feature... featureArr) {
        for (JSONWriter.Feature feature : featureArr) {
            JSONFactory.defaultWriterFeatures |= feature.mask;
        }
    }

    static void config(JSONWriter.Feature feature, boolean z) {
        if (z) {
            JSONFactory.defaultWriterFeatures = feature.mask | JSONFactory.defaultWriterFeatures;
        } else {
            JSONFactory.defaultWriterFeatures = (~feature.mask) & JSONFactory.defaultWriterFeatures;
        }
    }

    static boolean isValid(char[] cArr) {
        if (cArr != null && cArr.length != 0) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(cArr);
                try {
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Context context) {
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Throwable th) {
                if (jSONWriterOfUTF8 == null) {
                    throw th;
                }
                try {
                    jSONWriterOfUTF8.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            throw new JSONException(e.getMessage(), e);
        }
    }

    static JSONArray parseArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[] toJSONBytes(Object obj, Charset charset, JSONWriter.Feature... featureArr) {
        ObjectWriterProvider objectWriterProvider = JSONFactory.defaultObjectWriterProvider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(new JSONWriter.Context(objectWriterProvider, featureArr));
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterOfUTF8.context.features == 0) {
                    jSONWriterOfUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes(charset);
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[Catch: NumberFormatException -> 0x0033, NullPointerException -> 0x0036, SYNTHETIC, TRY_LEAVE, TryCatch #7 {NullPointerException -> 0x0036, NumberFormatException -> 0x0033, blocks: (B:14:0x002f, B:30:0x0049, B:29:0x0046, B:25:0x0040), top: B:47:0x000a, inners: #2 }] */
    static String toJSONString(Object obj, JSONWriter.Context context) throws Throwable {
        Object obj2;
        Throwable th;
        if (context == null) {
            context = JSONFactory.createWriteContext();
        }
        try {
            JSONWriter jSONWriterOf = JSONWriter.of(context);
            try {
                if (obj == null) {
                    try {
                        jSONWriterOf.writeNull();
                        obj2 = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = obj;
                        if (jSONWriterOf == null) {
                            throw th;
                        }
                        try {
                            jSONWriterOf.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } else {
                    try {
                        jSONWriterOf.rootObject = obj;
                        jSONWriterOf.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        obj2 = obj;
                        try {
                            context.getObjectWriter(cls, cls).write(jSONWriterOf, obj2, null, null, 0L);
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            if (jSONWriterOf == null) {
                                throw th;
                            }
                            jSONWriterOf.close();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj2 = obj;
                        th = th;
                        if (jSONWriterOf == null) {
                            throw th;
                        }
                        jSONWriterOf.close();
                        throw th;
                    }
                }
                String string = jSONWriterOf.toString();
                jSONWriterOf.close();
                return string;
            } catch (NullPointerException e) {
                e = e;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            } catch (NumberFormatException e2) {
                e = e2;
                throw new JSONException("JSON#toJSONString cannot serialize '" + obj2 + "'", e);
            }
        } catch (NullPointerException | NumberFormatException e3) {
            e = e3;
            obj2 = obj;
        }
    }

    static boolean isValid(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(bArr);
                try {
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static Object parse(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            context.config(featureArr);
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    jSONWriterOfUTF8.writeNull();
                } else {
                    jSONWriterOfUTF8.rootObject = obj;
                    jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                    Class<?> cls = obj.getClass();
                    context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Throwable th) {
                if (jSONWriterOfUTF8 == null) {
                    throw th;
                }
                try {
                    jSONWriterOfUTF8.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            throw new JSONException(e.getMessage(), e);
        }
    }

    static boolean isValid(byte[] bArr, Charset charset) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        return isValid(bArr, 0, bArr.length, charset);
    }

    static boolean isValid(byte[] bArr, int i, int i2, Charset charset) {
        if (bArr != null && bArr.length != 0 && i2 != 0) {
            try {
                JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset);
                try {
                    jSONReaderOf.skipValue();
                    boolean z = jSONReaderOf.isEnd() && !jSONReaderOf.comma;
                    jSONReaderOf.close();
                    return z;
                } catch (Throwable th) {
                    if (jSONReaderOf != null) {
                        try {
                            jSONReaderOf.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    static JSONArray parseArray(byte[] bArr, int i, int i2, Charset charset) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, int i, int i2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, i, i2, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriter jSONWriterOf = JSONWriter.of(context);
        try {
            if (obj == null) {
                jSONWriterOf.writeNull();
            } else {
                jSONWriterOf.rootObject = obj;
                jSONWriterOf.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOf, obj, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toJSONBytes(Object obj, Charset charset, JSONWriter.Context context) {
        ObjectWriterProvider objectWriterProvider = context.provider;
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && jSONWriterOfUTF8.context.features == 0) {
                    jSONWriterOfUTF8.write((JSONObject) obj);
                } else {
                    objectWriterProvider.getObjectWriter(cls, cls, (JSONFactory.defaultWriterFeatures & JSONWriter.Feature.FieldBased.mask) != 0).write(jSONWriterOfUTF8, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes(charset);
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static Object parse(String str, int i, int i2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i2 == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderOf = JSONReader.of(str, i, i2, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    /* JADX WARN: Code duplicated, block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[Catch: Exception -> 0x003c, SYNTHETIC, TRY_LEAVE, TryCatch #1 {Exception -> 0x003c, blocks: (B:17:0x0038, B:31:0x0050, B:30:0x004d, B:26:0x0047), top: B:38:0x0013, inners: #3 }] */
    static int writeTo(OutputStream outputStream, Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) throws Throwable {
        Object obj2;
        Throwable th;
        Throwable th2;
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    try {
                        jSONWriterOfUTF8.writeNull();
                        obj2 = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj;
                        if (jSONWriterOfUTF8 == null) {
                            throw th;
                        }
                        try {
                            jSONWriterOfUTF8.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                } else {
                    try {
                        jSONWriterOfUTF8.rootObject = obj;
                        jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        obj2 = obj;
                        try {
                            context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj2, null, null, 0L);
                        } catch (Throwable th5) {
                            th2 = th5;
                            th = th2;
                            if (jSONWriterOfUTF8 == null) {
                                throw th;
                            }
                            jSONWriterOfUTF8.close();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        obj2 = obj;
                        th = th2;
                        if (jSONWriterOfUTF8 == null) {
                            throw th;
                        }
                        jSONWriterOfUTF8.close();
                        throw th;
                    }
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Exception e) {
                e = e;
                throw new JSONException("JSON#writeTo cannot serialize '" + obj2 + "' to 'OutputStream'", e);
            }
        } catch (Exception e2) {
            e = e2;
            obj2 = obj;
        }
    }

    static Object parse(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(Object.class, false);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONArray parseArray(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(String str, int i, int i2, JSONReader.Context context) {
        if (str == null || str.isEmpty() || i2 == 0) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(str, i, i2, context);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, Filter filter, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriter jSONWriterOf = JSONWriter.of(context);
        try {
            if (obj == null) {
                jSONWriterOf.writeNull();
            } else {
                jSONWriterOf.rootObject = obj;
                jSONWriterOf.path = JSONWriter.Path.ROOT;
                if (filter != null) {
                    jSONWriterOf.context.configFilter(filter);
                }
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOf, obj, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toJSONBytes(Object obj, String str, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderOf = JSONReader.of(bArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    /* JADX WARN: Code duplicated, block: B:44:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[Catch: Exception -> 0x0047, SYNTHETIC, TRY_LEAVE, TryCatch #3 {Exception -> 0x0047, blocks: (B:21:0x0043, B:35:0x005b, B:34:0x0058, B:30:0x0052), top: B:46:0x001e, inners: #2 }] */
    static int writeTo(OutputStream outputStream, Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) throws Throwable {
        Object obj2;
        Throwable th;
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        try {
            JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
            try {
                if (obj == null) {
                    try {
                        jSONWriterOfUTF8.writeNull();
                        obj2 = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = obj;
                        if (jSONWriterOfUTF8 == null) {
                            throw th;
                        }
                        try {
                            jSONWriterOfUTF8.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } else {
                    try {
                        jSONWriterOfUTF8.rootObject = obj;
                        jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                        Class<?> cls = obj.getClass();
                        obj2 = obj;
                        try {
                            context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj2, null, null, 0L);
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            if (jSONWriterOfUTF8 == null) {
                                throw th;
                            }
                            jSONWriterOfUTF8.close();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj2 = obj;
                        th = th;
                        if (jSONWriterOfUTF8 == null) {
                            throw th;
                        }
                        jSONWriterOfUTF8.close();
                        throw th;
                    }
                }
                int iFlushTo = jSONWriterOfUTF8.flushTo(outputStream);
                jSONWriterOfUTF8.close();
                return iFlushTo;
            } catch (Exception e) {
                e = e;
                throw new JSONException("JSON#writeTo cannot serialize '" + obj2 + "' to 'OutputStream'", e);
            }
        } catch (Exception e2) {
            e = e2;
            obj2 = obj;
        }
    }

    static JSONObject parseObject(String str, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterOf = JSONWriter.of(context);
        try {
            if (obj == null) {
                jSONWriterOf.writeNull();
            } else {
                jSONWriterOf.rootObject = obj;
                jSONWriterOf.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOf, obj, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[] toJSONBytes(Object obj, Filter... filterArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static Object parse(byte[] bArr, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderOf = JSONReader.of(bArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONObject parseObject(Reader reader, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(reader, contextCreateReadContext);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, String str, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        JSONWriter jSONWriterOf = JSONWriter.of(context);
        try {
            if (obj == null) {
                jSONWriterOf.writeNull();
            } else {
                jSONWriterOf.rootObject = obj;
                jSONWriterOf.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOf, obj, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static Object parse(byte[] bArr, int i, int i2, Charset charset, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONArray parseArray(URL url, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONArray array = parseArray(inputStreamOpenStream, featureArr);
                if (inputStreamOpenStream == null) {
                    return array;
                }
                inputStreamOpenStream.close();
                return array;
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new JSONException("JSON#parseArray cannot parse '" + url + "' to '" + JSONArray.class + "'", e);
        }
    }

    static byte[] toJSONBytes(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(Reader reader, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(reader, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(char[] cArr, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(Object.class, false);
        JSONReader jSONReaderOf = JSONReader.of(cArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONObject parseObject(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterOf = JSONWriter.of(context);
        try {
            if (obj == null) {
                jSONWriterOf.writeNull();
            } else {
                jSONWriterOf.rootObject = obj;
                jSONWriterOf.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOf, obj, null, null, 0L);
            }
            String string = jSONWriterOf.toString();
            jSONWriterOf.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterOf == null) {
                throw th;
            }
            try {
                jSONWriterOf.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toJSONBytes(Object obj, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(InputStream inputStream, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(char[] cArr, JSONReader.Context context) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderOf = JSONReader.of(cArr, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONObject parseObject(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, JSONReader.Feature... featureArr) {
        return parse(inputStream, JSONFactory.createReadContext(featureArr));
    }

    static byte[] toJSONBytes(Object obj, String str, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        if (str != null && !str.isEmpty()) {
            context.setDateFormat(str);
        }
        if (filterArr != null && filterArr.length != 0) {
            context.configFilter(filterArr);
        }
        JSONWriter jSONWriterOfUTF8 = JSONWriter.ofUTF8(context);
        try {
            if (obj == null) {
                jSONWriterOfUTF8.writeNull();
            } else {
                jSONWriterOfUTF8.rootObject = obj;
                jSONWriterOfUTF8.path = JSONWriter.Path.ROOT;
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).write(jSONWriterOfUTF8, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterOfUTF8.getBytes();
            jSONWriterOfUTF8.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfUTF8 == null) {
                throw th;
            }
            try {
                jSONWriterOfUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static Object parse(InputStream inputStream, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReaderUTF8 jSONReaderUTF8 = new JSONReaderUTF8(context, inputStream);
        try {
            Object object = objectReader.readObject(jSONReaderUTF8, null, null, 0L);
            if (jSONReaderUTF8.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderUTF8.info("input not end"));
            }
            jSONReaderUTF8.close();
            return object;
        } catch (Throwable th) {
            try {
                jSONReaderUTF8.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static JSONArray parseArray(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, context);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            jSONReaderOf.read((List) jSONArray);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONArray);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONArray;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, Charset charset) {
        return parse(inputStream, charset, JSONFactory.createReadContext());
    }

    static Object parse(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(Object.class);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, context);
        try {
            Object object = objectReader.readObject(jSONReaderOf, null, null, 0L);
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
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

    static JSONObject parseObject(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(type);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(type);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(cls);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, Charset charset, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, context);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Type... typeArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            List<T> list = jSONReaderOf.readList(typeArr);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(list);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return list;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(URL url) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONObject object = parseObject(inputStreamOpenStream, StandardCharsets.UTF_8);
                if (inputStreamOpenStream == null) {
                    return object;
                }
                inputStreamOpenStream.close();
                return object;
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new JSONException("JSON#parseObject cannot parse '" + url + "'", e);
        }
    }

    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(cls);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, int i, int i2, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(cls);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(String str, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            jSONReaderOf.startArray();
            ArrayList arrayList = new ArrayList(typeArr.length);
            for (Type type : typeArr) {
                arrayList.add(jSONReaderOf.read(type));
            }
            jSONReaderOf.endArray();
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(arrayList);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return arrayList;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(char[] cArr, int i, int i2, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(cArr, i, i2, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, int i, int i2, Charset charset, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONReaderOf.read(jSONObject, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(jSONObject);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return jSONObject;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(Reader reader, Type type, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(reader, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(type);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(type);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> List<T> parseArray(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(cls);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(String str, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> List<T> parseArray(byte[] bArr, int i, int i2, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            List<T> array = jSONReaderOf.readArray(cls);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(array);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return array;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static <T> T parseObject(String str, Type type, String str2, Filter[] filterArr, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), null, filterArr, featureArr);
        context.setDateFormat(str2);
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            if (jSONReaderOf.nextIfNull()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type type, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T extends Map<String, Object>> T parseObject(String str, MapMultiValueType<T> mapMultiValueType) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(mapMultiValueType);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, mapMultiValueType, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type... typeArr) {
        return (T) parseObject(str, new MultiType(typeArr));
    }

    static <T> T parseObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(type, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, TypeReference<T> typeReference, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        Type type = typeReference.getType();
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(type, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, int i, int i2, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty() || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, i, i2, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Class<T> cls, JSONReader.Context context) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Class<T> cls, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str2 != null && !str2.isEmpty()) {
            contextCreateReadContext.setDateFormat(str2);
        }
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type type, Filter filter, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(String str, Type type, String str2, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str2 != null && !str2.isEmpty()) {
            contextCreateReadContext.setDateFormat(str2);
        }
        JSONReader jSONReaderOf = JSONReader.of(str, contextCreateReadContext);
        try {
            T t = (T) contextCreateReadContext.getObjectReader(type).readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(char[] cArr, int i, int i2, Type type, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(cArr, i, i2, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(char[] cArr, Class<T> cls) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Type type) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Class<T> cls) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(bArr, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.provider.getObjectReader(cls, (contextCreateReadContext.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(bArr, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Type type, String str, Filter[] filterArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context context = new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), null, filterArr, featureArr);
        context.setDateFormat(str);
        return (T) parseObject(bArr, type, context);
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Context context) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(bArr, context);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(char[] cArr, Class<T> cls, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(char[] cArr, Type type, JSONReader.Feature... featureArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(cArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Type type, Filter filter, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(filter, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, Type type, String str, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str != null && !str.isEmpty()) {
            contextCreateReadContext.setDateFormat(str);
        }
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(ByteBuffer byteBuffer, Class<T> cls) {
        if (byteBuffer == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(byteBuffer, (Charset) null, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(Reader reader, Type type, JSONReader.Feature... featureArr) {
        if (reader == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(reader, contextCreateReadContext);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        contextCreateReadContext.config(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, context);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(InputStream inputStream, Charset charset, Class<T> cls, JSONReader.Context context) {
        if (inputStream == null) {
            return null;
        }
        ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, context);
        try {
            if (jSONReaderOf.isEnd()) {
                jSONReaderOf.close();
                return null;
            }
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (context.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(URL url, Type type, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                T t = (T) parseObject(inputStreamOpenStream, type, featureArr);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return t;
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new JSONException("parseObject error", e);
        }
    }

    static <T> T parseObject(URL url, Class<T> cls, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                T t = (T) parseObject(inputStreamOpenStream, cls, featureArr);
                if (inputStreamOpenStream == null) {
                    return t;
                }
                inputStreamOpenStream.close();
                return t;
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new JSONException("JSON#parseObject cannot parse '" + url + "' to '" + cls + "'", e);
        }
    }

    static <T> T parseObject(URL url, Function<JSONObject, T> function, JSONReader.Feature... featureArr) {
        if (url == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                JSONObject object = parseObject(inputStreamOpenStream, featureArr);
                if (object == null) {
                    if (inputStreamOpenStream == null) {
                        return null;
                    }
                    inputStreamOpenStream.close();
                    return null;
                }
                T tApply = function.apply(object);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return tApply;
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new JSONException("JSON#parseObject cannot parse '" + url + "'", e);
        }
        throw new JSONException("JSON#parseObject cannot parse '" + url + "'", e);
    }

    static <T> T parseObject(InputStream inputStream, Type type, String str, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        if (str != null && !str.isEmpty()) {
            contextCreateReadContext.setDateFormat(str);
        }
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, StandardCharsets.UTF_8, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(InputStream inputStream, Charset charset, Type type, JSONReader.Feature... featureArr) {
        if (inputStream == null) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(inputStream, charset, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, int i, int i2, Charset charset, Type type) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, type, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, int i, int i2, Charset charset, Class<T> cls) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> T parseObject(byte[] bArr, int i, int i2, Charset charset, Class<T> cls, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0 || i2 == 0) {
            return null;
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, contextCreateReadContext);
        try {
            T t = (T) objectReader.readObject(jSONReaderOf, cls, null, 0L);
            if (jSONReaderOf.resolveTasks != null) {
                jSONReaderOf.handleResolveTasks(t);
            }
            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jSONReaderOf.info("input not end"));
            }
            jSONReaderOf.close();
            return t;
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

    static <T> void parseObject(InputStream inputStream, Type type, Consumer<T> consumer, JSONReader.Feature... featureArr) {
        parseObject(inputStream, StandardCharsets.UTF_8, '\n', type, (Consumer) consumer, featureArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(InputStream inputStream, Charset charset, char c, Type type, Consumer<T> consumer, JSONReader.Feature... featureArr) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i = 524288;
        if (andSet == null) {
            andSet = new byte[524288];
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(featureArr);
        byte[] bArrCopyOf = andSet;
        int length = 0;
        int i2 = 0;
        while (true) {
            try {
                try {
                    int i3 = inputStream.read(bArrCopyOf, length, bArrCopyOf.length - length);
                    if (i3 == -1) {
                        JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                        return;
                    }
                    int i4 = length + i3;
                    int i5 = length;
                    boolean z = false;
                    while (i5 < i4) {
                        if (bArrCopyOf[i5] == c) {
                            JSONReader jSONReaderOf = JSONReader.of(bArrCopyOf, i2, i5 - i2, charset, contextCreateReadContext);
                            if (objectReader == null) {
                                objectReader = contextCreateReadContext.getObjectReader(type);
                            }
                            ObjectReader objectReader2 = objectReader;
                            Object object = objectReader2.readObject(jSONReaderOf, type, null, 0L);
                            if (jSONReaderOf.resolveTasks != null) {
                                jSONReaderOf.handleResolveTasks(object);
                            }
                            if (jSONReaderOf.ch != 26 && (contextCreateReadContext.features & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                                throw new JSONException(jSONReaderOf.info("input not end"));
                            }
                            consumer.accept(object);
                            i2 = i5 + 1;
                            objectReader = objectReader2;
                            z = true;
                        } else {
                            i = i;
                            contextCreateReadContext = contextCreateReadContext;
                        }
                        i5++;
                        contextCreateReadContext = contextCreateReadContext;
                        i = i;
                    }
                    int i6 = i;
                    JSONReader.Context context = contextCreateReadContext;
                    if (i4 != bArrCopyOf.length) {
                        length = i4;
                    } else if (z) {
                        length = bArrCopyOf.length - i2;
                        System.arraycopy(bArrCopyOf, i2, bArrCopyOf, 0, length);
                        i2 = 0;
                    } else {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + i6);
                        length = i4;
                    }
                    contextCreateReadContext = context;
                    i = i6;
                } catch (IOException e) {
                    throw new JSONException("JSON#parseObject cannot parse the 'InputStream' to '" + type + "'", e);
                }
            } catch (Throwable th) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
                throw th;
            }
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArrCopyOf);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> void parseObject(Reader reader, char c, Type type, Consumer<T> consumer) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        ObjectReader objectReader = null;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new char[8192];
        }
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext();
        char[] cArrCopyOf = andSet;
        int length = 0;
        int i = 0;
        while (true) {
            try {
                try {
                    int i2 = reader.read(cArrCopyOf, length, cArrCopyOf.length - length);
                    if (i2 == -1) {
                        JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArrCopyOf);
                        return;
                    }
                    int i3 = length + i2;
                    boolean z = false;
                    for (int i4 = length; i4 < i3; i4++) {
                        if (cArrCopyOf[i4] == c) {
                            JSONReader jSONReaderOf = JSONReader.of(cArrCopyOf, i, i4 - i, contextCreateReadContext);
                            if (objectReader == null) {
                                objectReader = contextCreateReadContext.getObjectReader(type);
                            }
                            ObjectReader objectReader2 = objectReader;
                            consumer.accept(objectReader2.readObject(jSONReaderOf, type, null, 0L));
                            i = i4 + 1;
                            objectReader = objectReader2;
                            z = true;
                        }
                    }
                    if (i3 == cArrCopyOf.length) {
                        if (z) {
                            length = cArrCopyOf.length - i;
                            System.arraycopy(cArrCopyOf, i, cArrCopyOf, 0, length);
                            i = 0;
                        } else {
                            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length + 8192);
                        }
                    }
                    length = i3;
                } catch (IOException e) {
                    throw new JSONException("JSON#parseObject cannot parse the 'Reader' to '" + type + "'", e);
                }
            } catch (Throwable th) {
                JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArrCopyOf);
                throw th;
            }
        }
    }
}
