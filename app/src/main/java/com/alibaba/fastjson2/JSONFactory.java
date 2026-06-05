package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactoryUnsafe;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Supplier;
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class JSONFactory {
    static final ObjectReader<JSONArray> ARRAY_READER;
    static final AtomicReferenceFieldUpdater<CacheItem, byte[]> BYTES_UPDATER;
    static final CacheItem[] CACHE_ITEMS;
    static final int CACHE_THRESHOLD = 8388608;
    static final AtomicReferenceFieldUpdater<CacheItem, char[]> CHARS_UPDATER;
    public static final String CREATOR;
    static final byte[] NIBBLES;
    static final ObjectReader<JSONObject> OBJECT_READER;
    public static final PropertyAccessorFactory PROPERTY_ACCESSOR_FACTORY;
    public static final String PROPERTY_AUTO_TYPE_ACCEPT = "fastjson2.autoTypeAccept";
    public static final String PROPERTY_AUTO_TYPE_BEFORE_HANDLER = "fastjson2.autoTypeBeforeHandler";
    public static final String PROPERTY_AUTO_TYPE_HANDLER = "fastjson2.autoTypeHandler";
    public static final String PROPERTY_DENY_PROPERTY = "fastjson2.parser.deny";
    static Supplier<List> defaultArraySupplier = null;
    static int defaultDecimalMaxScale = 2048;
    static final JSONPathCompiler defaultJSONPathCompiler;
    static int defaultMaxLevel;
    static final ObjectReaderProvider defaultObjectReaderProvider;
    static Supplier<Map> defaultObjectSupplier;
    static final ObjectWriterProvider defaultObjectWriterProvider;
    static long defaultReaderFeatures;
    static String defaultReaderFormat;
    static ZoneId defaultReaderZoneId;
    static boolean defaultSkipTransient;
    static boolean defaultWriterAlphabetic;
    static long defaultWriterFeatures;
    static String defaultWriterFormat;
    static ZoneId defaultWriterZoneId;
    static final boolean disableArrayMapping;
    static final boolean disableAutoType;
    static final boolean disableJSONB;
    static final boolean disableReferenceDetect;
    static final boolean disableSmartMatch;
    static volatile Throwable initErrorLast;
    private static volatile boolean jsonFieldDefaultValueCompatMode;
    static final ThreadLocal<JSONPathCompiler> jsonPathCompilerLocal;
    static final ThreadLocal<ObjectReaderCreator> readerCreatorLocal;
    static final ThreadLocal<ObjectReaderProvider> readerProviderLocal;
    static boolean useGsonAnnotation;
    static boolean useJacksonAnnotation;
    static final ThreadLocal<ObjectWriterCreator> writerCreatorLocal;
    static final NameCacheEntry[] NAME_CACHE = new NameCacheEntry[8192];
    static final NameCacheEntry2[] NAME_CACHE2 = new NameCacheEntry2[8192];
    static final char[] CA = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    static final int[] DIGITS2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};
    static final float[] FLOAT_10_POW = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    static final double[] DOUBLE_10_POW = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};

    /* JADX INFO: compiled from: obf */
    public static final class CacheItem {
        volatile byte[] bytes;
        volatile char[] chars;
    }

    /* JADX INFO: compiled from: obf */
    public static final class Conf {
        static final Properties DEFAULT_PROPERTIES;

        static {
            Properties properties = new Properties();
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            InputStream resourceAsStream = contextClassLoader != null ? contextClassLoader.getResourceAsStream("fastjson2.properties") : ClassLoader.getSystemResourceAsStream("fastjson2.properties");
            if (resourceAsStream != null) {
                try {
                    properties.load(resourceAsStream);
                } catch (IOException unused) {
                } finally {
                    IOUtils.close(resourceAsStream);
                }
            }
            DEFAULT_PROPERTIES = properties;
        }

        public static String getProperty(String str) {
            return DEFAULT_PROPERTIES.getProperty(str);
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface JSONPathCompiler {
        JSONPath compile(Class cls, JSONPath jSONPath);
    }

    /* JADX INFO: compiled from: obf */
    public interface JSONReaderUTF16Creator {
        JSONReader create(JSONReader.Context context, String str, char[] cArr, int i, int i2);
    }

    /* JADX INFO: compiled from: obf */
    public interface JSONReaderUTF8Creator {
        JSONReader create(JSONReader.Context context, String str, byte[] bArr, int i, int i2);
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameCacheEntry {
        final String name;
        final long value;

        public NameCacheEntry(String str, long j) {
            this.name = str;
            this.value = j;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameCacheEntry2 {
        final String name;
        final long value0;
        final long value1;

        public NameCacheEntry2(String str, long j, long j2) {
            this.name = str;
            this.value0 = j;
            this.value1 = j2;
        }
    }

    static {
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        PropertyAccessorFactory propertyAccessorFactoryUnsafe;
        Properties properties = Conf.DEFAULT_PROPERTIES;
        String property = System.getProperty("fastjson2.creator");
        if (property != null) {
            property = property.trim();
        }
        if ((property == null || property.isEmpty()) && (property = properties.getProperty("fastjson2.creator")) != null) {
            property = property.trim();
        }
        if (property == null) {
            property = "asm";
        }
        CREATOR = property;
        String property2 = System.getProperty("fastjson2.features");
        if (property2 == null) {
            property2 = getProperty("fastjson2.features");
        }
        if (property2 != null) {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            for (String str : property2.split(",")) {
                str.getClass();
                switch (str) {
                    case "disableAutoType":
                        z4 = true;
                        break;
                    case "disableJSONB":
                        z3 = true;
                        break;
                    case "disableReferenceDetect":
                        z = true;
                        break;
                    case "disableSmartMatch":
                        z5 = true;
                        break;
                    case "disableArrayMapping":
                        z2 = true;
                        break;
                }
            }
            b = 0;
        } else {
            b = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        disableReferenceDetect = z;
        disableArrayMapping = z2;
        disableJSONB = z3;
        disableAutoType = z4;
        disableSmartMatch = z5;
        useJacksonAnnotation = getPropertyBool(properties, "fastjson2.useJacksonAnnotation", true);
        useGsonAnnotation = getPropertyBool(properties, "fastjson2.useGsonAnnotation", true);
        defaultWriterAlphabetic = getPropertyBool(properties, "fastjson2.writer.alphabetic", true);
        defaultSkipTransient = getPropertyBool(properties, "fastjson2.writer.skipTransient", true);
        defaultMaxLevel = getPropertyInt(properties, "fastjson2.writer.maxLevel", 2048);
        JSONPathCompilerReflect jSONPathCompilerReflect = null;
        if (JDKUtils.JVM_VERSION >= 11) {
            try {
                propertyAccessorFactoryUnsafe = (PropertyAccessorFactory) Conf.class.getClassLoader().loadClass("com.alibaba.fastjson2.reflect.PropertyAccessorFactoryMethodHandle").newInstance();
            } catch (Exception unused) {
                propertyAccessorFactoryUnsafe = null;
            }
        } else {
            propertyAccessorFactoryUnsafe = null;
        }
        if (propertyAccessorFactoryUnsafe == null) {
            propertyAccessorFactoryUnsafe = JDKUtils.UNSAFE != null ? new PropertyAccessorFactoryUnsafe() : new PropertyAccessorFactory();
        }
        PROPERTY_ACCESSOR_FACTORY = propertyAccessorFactoryUnsafe;
        CacheItem[] cacheItemArr = new CacheItem[16];
        for (int i = b; i < 16; i++) {
            cacheItemArr[i] = new CacheItem();
        }
        CACHE_ITEMS = cacheItemArr;
        CHARS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, char[].class, "chars");
        BYTES_UPDATER = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, byte[].class, "bytes");
        defaultObjectWriterProvider = new ObjectWriterProvider();
        defaultObjectReaderProvider = new ObjectReaderProvider();
        String str2 = CREATOR;
        str2.getClass();
        if (str2.equals("lambda") || str2.equals("reflect")) {
            jSONPathCompilerReflect = JSONPathCompilerReflect.INSTANCE;
        } else {
            try {
                if (!JDKUtils.ANDROID && !JDKUtils.GRAAL) {
                    jSONPathCompilerReflect = JSONPathCompilerReflectASM.INSTANCE;
                }
            } catch (Throwable unused2) {
            }
            if (jSONPathCompilerReflect == null) {
                jSONPathCompilerReflect = JSONPathCompilerReflect.INSTANCE;
            }
        }
        defaultJSONPathCompiler = jSONPathCompilerReflect;
        readerCreatorLocal = new ThreadLocal<>();
        readerProviderLocal = new ThreadLocal<>();
        writerCreatorLocal = new ThreadLocal<>();
        jsonPathCompilerLocal = new ThreadLocal<>();
        ARRAY_READER = getDefaultObjectReaderProvider().getObjectReader(JSONArray.class);
        OBJECT_READER = getDefaultObjectReaderProvider().getObjectReader(JSONObject.class);
        byte[] bArr = new byte[bc.e];
        Arrays.fill(bArr, (byte) -1);
        bArr[48] = b;
        bArr[49] = 1;
        bArr[50] = 2;
        bArr[51] = 3;
        bArr[52] = 4;
        bArr[53] = 5;
        bArr[54] = 6;
        bArr[55] = 7;
        bArr[56] = 8;
        bArr[57] = 9;
        bArr[65] = 10;
        bArr[66] = 11;
        bArr[67] = 12;
        bArr[68] = ek.k;
        bArr[69] = ek.l;
        bArr[70] = ek.m;
        bArr[97] = 10;
        bArr[98] = 11;
        bArr[99] = 12;
        bArr[100] = ek.k;
        bArr[101] = ek.l;
        bArr[102] = ek.m;
        NIBBLES = bArr;
    }

    public static JSONReader.Context createReadContext() {
        return new JSONReader.Context(getDefaultObjectReaderProvider());
    }

    public static JSONWriter.Context createWriteContext() {
        return new JSONWriter.Context(defaultObjectWriterProvider);
    }

    public static ObjectReaderCreator getContextReaderCreator() {
        return readerCreatorLocal.get();
    }

    public static ObjectWriterCreator getContextWriterCreator() {
        return writerCreatorLocal.get();
    }

    public static Supplier<List> getDefaultArraySupplier() {
        return defaultArraySupplier;
    }

    public static JSONPathCompiler getDefaultJSONPathCompiler() {
        JSONPathCompiler jSONPathCompiler = jsonPathCompilerLocal.get();
        return jSONPathCompiler != null ? jSONPathCompiler : defaultJSONPathCompiler;
    }

    public static int getDefaultMaxLevel() {
        return defaultMaxLevel;
    }

    public static ObjectReaderProvider getDefaultObjectReaderProvider() {
        ObjectReaderProvider objectReaderProvider = readerProviderLocal.get();
        return objectReaderProvider != null ? objectReaderProvider : defaultObjectReaderProvider;
    }

    public static Supplier<Map> getDefaultObjectSupplier() {
        return defaultObjectSupplier;
    }

    public static ObjectWriterProvider getDefaultObjectWriterProvider() {
        return defaultObjectWriterProvider;
    }

    public static long getDefaultReaderFeatures() {
        return defaultReaderFeatures;
    }

    public static String getDefaultReaderFormat() {
        return defaultReaderFormat;
    }

    public static ZoneId getDefaultReaderZoneId() {
        return defaultReaderZoneId;
    }

    public static long getDefaultWriterFeatures() {
        return defaultWriterFeatures;
    }

    public static String getDefaultWriterFormat() {
        return defaultWriterFormat;
    }

    public static ZoneId getDefaultWriterZoneId() {
        return defaultWriterZoneId;
    }

    public static ObjectReader getObjectReader(Type type, long j) {
        return getDefaultObjectReaderProvider().getObjectReader(type, JSONReader.Feature.FieldBased.isEnabled(j));
    }

    public static ObjectWriter getObjectWriter(Type type, long j) {
        return getDefaultObjectWriterProvider().getObjectWriter(type, TypeUtils.getClass(type), JSONWriter.Feature.FieldBased.isEnabled(j));
    }

    public static String getProperty(String str) {
        return Conf.getProperty(str);
    }

    private static boolean getPropertyBool(Properties properties, String str, boolean z) {
        String property = System.getProperty(str);
        if (property != null) {
            String strTrim = property.trim();
            if (strTrim.isEmpty() && (strTrim = properties.getProperty(str)) != null) {
                strTrim = strTrim.trim();
            }
            if (z) {
                if ("false".equals(strTrim)) {
                    return false;
                }
            } else if ("true".equals(strTrim)) {
                return true;
            }
        }
        return z;
    }

    private static int getPropertyInt(Properties properties, String str, int i) {
        String property = System.getProperty(str);
        if (property != null) {
            property = property.trim();
            if (property.isEmpty() && (property = properties.getProperty(str)) != null) {
                property = property.trim();
            }
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean isDefaultSkipTransient() {
        return defaultSkipTransient;
    }

    public static boolean isDefaultWriterAlphabetic() {
        return defaultWriterAlphabetic;
    }

    public static boolean isDisableArrayMapping() {
        return disableArrayMapping;
    }

    public static boolean isDisableAutoType() {
        return disableAutoType;
    }

    public static boolean isDisableJSONB() {
        return disableJSONB;
    }

    public static boolean isDisableReferenceDetect() {
        return disableReferenceDetect;
    }

    public static boolean isDisableSmartMatch() {
        return disableSmartMatch;
    }

    public static boolean isJSONFieldDefaultValueCompatMode() {
        return jsonFieldDefaultValueCompatMode;
    }

    public static boolean isUseGsonAnnotation() {
        return useGsonAnnotation;
    }

    public static boolean isUseJacksonAnnotation() {
        return useJacksonAnnotation;
    }

    public static void setContextJSONPathCompiler(JSONPathCompiler jSONPathCompiler) {
        jsonPathCompilerLocal.set(jSONPathCompiler);
    }

    public static void setContextObjectReaderProvider(ObjectReaderProvider objectReaderProvider) {
        readerProviderLocal.set(objectReaderProvider);
    }

    public static void setContextReaderCreator(ObjectReaderCreator objectReaderCreator) {
        readerCreatorLocal.set(objectReaderCreator);
    }

    public static void setContextWriterCreator(ObjectWriterCreator objectWriterCreator) {
        writerCreatorLocal.set(objectWriterCreator);
    }

    public static void setDefaultArraySupplier(Supplier<List> supplier) {
        defaultArraySupplier = supplier;
    }

    public static void setDefaultMaxLevel(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "maxLevel must be positive, maxLevel "));
        }
        defaultMaxLevel = i;
    }

    public static void setDefaultObjectSupplier(Supplier<Map> supplier) {
        defaultObjectSupplier = supplier;
    }

    public static void setDefaultSkipTransient(boolean z) {
        defaultSkipTransient = z;
        defaultObjectWriterProvider.setSkipTransient(z);
    }

    public static void setDefaultWriterAlphabetic(boolean z) {
        defaultWriterAlphabetic = z;
        defaultObjectWriterProvider.setAlphabetic(z);
    }

    public static void setDisableArrayMapping(boolean z) {
        defaultObjectWriterProvider.setDisableArrayMapping(z);
        defaultObjectReaderProvider.setDisableArrayMapping(z);
    }

    public static void setDisableAutoType(boolean z) {
        defaultObjectWriterProvider.setDisableAutoType(z);
        defaultObjectReaderProvider.setDisableAutoType(z);
    }

    public static void setDisableJSONB(boolean z) {
        defaultObjectWriterProvider.setDisableJSONB(z);
        defaultObjectReaderProvider.setDisableJSONB(z);
    }

    public static void setDisableReferenceDetect(boolean z) {
        defaultObjectWriterProvider.setDisableReferenceDetect(z);
        defaultObjectReaderProvider.setDisableReferenceDetect(z);
    }

    public static void setDisableSmartMatch(boolean z) {
        defaultObjectReaderProvider.setDisableSmartMatch(z);
    }

    public static void setJSONFieldDefaultValueCompatMode(boolean z) {
        jsonFieldDefaultValueCompatMode = z;
    }

    public static void setUseGsonAnnotation(boolean z) {
        useGsonAnnotation = z;
    }

    public static void setUseJacksonAnnotation(boolean z) {
        useJacksonAnnotation = z;
    }

    public static JSONWriter.Context createWriteContext(ObjectWriterProvider objectWriterProvider, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(objectWriterProvider);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(long j) {
        return new JSONReader.Context(getDefaultObjectReaderProvider(), j);
    }

    public static JSONWriter.Context createWriteContext(JSONWriter.Feature... featureArr) {
        return new JSONWriter.Context(defaultObjectWriterProvider, featureArr);
    }

    public static JSONReader.Context createReadContext(JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(getDefaultObjectReaderProvider());
        for (JSONReader.Feature feature : featureArr) {
            context.features |= feature.mask;
        }
        return context;
    }

    public static JSONReader.Context createReadContext(Filter filter, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(getDefaultObjectReaderProvider());
        if (filter instanceof JSONReader.AutoTypeBeforeHandler) {
            context.autoTypeBeforeHandler = (JSONReader.AutoTypeBeforeHandler) filter;
        }
        if (filter instanceof ExtraProcessor) {
            context.extraProcessor = (ExtraProcessor) filter;
        }
        for (JSONReader.Feature feature : featureArr) {
            context.features |= feature.mask;
        }
        return context;
    }

    public static JSONReader.Context createReadContext(ObjectReaderProvider objectReaderProvider, JSONReader.Feature... featureArr) {
        if (objectReaderProvider == null) {
            objectReaderProvider = getDefaultObjectReaderProvider();
        }
        JSONReader.Context context = new JSONReader.Context(objectReaderProvider);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(SymbolTable symbolTable) {
        return new JSONReader.Context(getDefaultObjectReaderProvider(), symbolTable);
    }

    public static JSONReader.Context createReadContext(SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(getDefaultObjectReaderProvider(), symbolTable);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(Supplier<Map> supplier, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(getDefaultObjectReaderProvider());
        context.setObjectSupplier(supplier);
        context.config(featureArr);
        return context;
    }

    public static JSONReader.Context createReadContext(Supplier<Map> supplier, Supplier<List> supplier2, JSONReader.Feature... featureArr) {
        JSONReader.Context context = new JSONReader.Context(getDefaultObjectReaderProvider());
        context.setObjectSupplier(supplier);
        context.setArraySupplier(supplier2);
        context.config(featureArr);
        return context;
    }
}
