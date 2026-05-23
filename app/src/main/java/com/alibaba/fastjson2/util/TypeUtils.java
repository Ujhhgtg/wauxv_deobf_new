package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderImplInstant;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl;
import com.umeng.analytics.pro.ek;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import okhttp3.HttpUrl;
import p000.AbstractC1194;
import p000.AbstractC2668;
import p000.AbstractC2784;
import p000.C2257;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final BigInteger BIGINT_INT32_MAX;
    public static final BigInteger BIGINT_INT32_MIN;
    public static final BigInteger BIGINT_INT64_MAX;
    public static final BigInteger BIGINT_INT64_MIN;
    public static final BigInteger BIGINT_JAVASCRIPT_HIGH;
    public static final BigInteger BIGINT_JAVASCRIPT_LOW;
    static final double[] BIG_10_POW;
    static final Cache CACHE;
    static final AtomicReferenceFieldUpdater<Cache, char[]> CHARS_UPDATER;
    public static final Class CLASS_JSON_ARRAY_1x;
    public static final Class CLASS_JSON_OBJECT_1x;
    public static final Field FIELD_JSON_OBJECT_1x_map;
    private static final double L = 3.321928094887362d;
    static final long LONG_JAVASCRIPT_HIGH = 9007199254740991L;
    static final long LONG_JAVASCRIPT_LOW = -9007199254740991L;
    static volatile MethodHandle METHOD_NEW_PROXY_INSTANCE = null;
    static volatile boolean METHOD_NEW_PROXY_INSTANCE_ERROR = false;
    public static final MethodType METHOD_TYPE_INT_OBJECT;
    public static final MethodType METHOD_TYPE_LONG_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT_DOUBLE;
    public static final MethodType METHOD_TYPE_OBJECT_INT;
    public static final MethodType METHOD_TYPE_OBJECT_LONG;
    public static final MethodType METHOD_TYPE_OBJECT_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT_OBJECT_OBJECT;
    public static final MethodType METHOD_TYPE_VOID;
    public static final MethodType METHOD_TYPE_VOID_INT;
    public static final MethodType METHOD_TYPE_VOID_LONG;
    public static final MethodType METHOD_TYPE_VOID_OBJECT_INT;
    public static final MethodType METHOD_TYPE_VOID_STRING;
    public static final MethodType METHOD_TYPE_VOO;
    static final Map<Class, String> NAME_MAPPINGS;
    private static final int P_D = 53;
    private static final int P_F = 24;
    private static final int Q_MAX_D = 971;
    private static final int Q_MAX_F = 104;
    private static final int Q_MIN_D = -1074;
    private static final int Q_MIN_F = -149;
    static final float[] SINGLE_SMALL_10_POW;
    public static final double[] SMALL_10_POW;
    static final double[] TINY_10_POW;
    static final Map<String, Class> TYPE_MAPPINGS;
    public static final Class CLASS_SINGLE_SET = Collections.singleton(1).getClass();
    public static final Class CLASS_SINGLE_LIST = Collections.singletonList(1).getClass();
    public static final Class CLASS_UNMODIFIABLE_COLLECTION = Collections.unmodifiableCollection(new ArrayList()).getClass();
    public static final Class CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(new ArrayList()).getClass();
    public static final Class CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(new HashSet()).getClass();
    public static final Class CLASS_UNMODIFIABLE_SORTED_SET = Collections.unmodifiableSortedSet(new TreeSet()).getClass();
    public static final Class CLASS_UNMODIFIABLE_NAVIGABLE_SET = Collections.unmodifiableNavigableSet(new TreeSet()).getClass();
    public static final ParameterizedType PARAM_TYPE_LIST_STR = new ParameterizedTypeImpl(List.class, String.class);
    public static final MethodType METHOD_TYPE_SUPPLIER = MethodType.methodType(Supplier.class);
    public static final MethodType METHOD_TYPE_FUNCTION = MethodType.methodType(Function.class);
    public static final MethodType METHOD_TYPE_TO_INT_FUNCTION = MethodType.methodType(ToIntFunction.class);
    public static final MethodType METHOD_TYPE_TO_LONG_FUNCTION = MethodType.methodType(ToLongFunction.class);
    public static final MethodType METHOD_TYPE_OBJECT_INT_CONSUMER = MethodType.methodType(ObjIntConsumer.class);
    public static final MethodType METHOD_TYPE_INT_FUNCTION = MethodType.methodType(IntFunction.class);
    public static final MethodType METHOD_TYPE_LONG_FUNCTION = MethodType.methodType(LongFunction.class);
    public static final MethodType METHOD_TYPE_DOUBLE_FUNCTION = MethodType.methodType(DoubleFunction.class);
    public static final MethodType METHOD_TYPE_BI_FUNCTION = MethodType.methodType(BiFunction.class);
    public static final MethodType METHOD_TYPE_BI_CONSUMER = MethodType.methodType(BiConsumer.class);

    /* JADX INFO: compiled from: obf */
    public static class Cache {
        volatile char[] chars;
    }

    /* JADX INFO: compiled from: obf */
    public static class X1 {
        static final Function<byte[], char[]> TO_CHARS;

        static {
            Function<byte[], char[]> functionInvokeExact;
            if (JDKUtils.JVM_VERSION > 9) {
                try {
                    Class<?> cls = Class.forName("java.lang.StringLatin1");
                    MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
                    functionInvokeExact = (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupTrustedLookup.findStatic(cls, "toChars", MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)), MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)).getTarget().invokeExact();
                } catch (Throwable unused) {
                    functionInvokeExact = null;
                }
            } else {
                functionInvokeExact = null;
            }
            if (functionInvokeExact == null) {
                functionInvokeExact = new C2257(29);
            }
            TO_CHARS = functionInvokeExact;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class X2 {
        static final char END = '~';
        static final int SIZE2 = 95;
        static final char START = ' ';
        static final String[] chars;
        static final String[] chars2;

        static {
            String[] strArr = new String[128];
            for (char c = 0; c < 128; c = (char) (c + 1)) {
                strArr[c] = Character.toString(c);
            }
            chars = strArr;
            String[] strArr2 = new String[9025];
            for (char c2 = ' '; c2 <= '~'; c2 = (char) (c2 + 1)) {
                for (char c3 = ' '; c3 <= '~'; c3 = (char) (c3 + 1)) {
                    strArr2[(c3 - ' ') + ((c2 - ' ') * 95)] = new String(new char[]{c2, c3});
                }
            }
            chars2 = strArr2;
        }
    }

    static {
        Class cls = Void.TYPE;
        METHOD_TYPE_VOO = MethodType.methodType(cls, Object.class, Object.class);
        METHOD_TYPE_OBJECT = MethodType.methodType(Object.class);
        METHOD_TYPE_OBJECT_OBJECT = MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class);
        Class cls2 = Integer.TYPE;
        METHOD_TYPE_INT_OBJECT = MethodType.methodType((Class<?>) cls2, (Class<?>) Object.class);
        Class cls3 = Long.TYPE;
        METHOD_TYPE_LONG_OBJECT = MethodType.methodType((Class<?>) cls3, (Class<?>) Object.class);
        METHOD_TYPE_VOID_OBJECT_INT = MethodType.methodType(cls, Object.class, cls2);
        METHOD_TYPE_OBJECT_LONG = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls3);
        Class cls4 = Double.TYPE;
        METHOD_TYPE_OBJECT_DOUBLE = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls4);
        METHOD_TYPE_VOID_LONG = MethodType.methodType((Class<?>) cls, (Class<?>) cls3);
        METHOD_TYPE_OBJECT_OBJECT_OBJECT = MethodType.methodType(Object.class, Object.class, Object.class);
        METHOD_TYPE_VOID = MethodType.methodType(cls);
        METHOD_TYPE_VOID_INT = MethodType.methodType((Class<?>) cls, (Class<?>) cls2);
        METHOD_TYPE_VOID_STRING = MethodType.methodType((Class<?>) cls, (Class<?>) String.class);
        METHOD_TYPE_OBJECT_INT = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls2);
        BIGINT_INT32_MIN = BigInteger.valueOf(-2147483648L);
        BIGINT_INT32_MAX = BigInteger.valueOf(2147483647L);
        BIGINT_INT64_MIN = BigInteger.valueOf(-9223372036854775808L);
        BIGINT_INT64_MAX = BigInteger.valueOf(9223372036854775807L);
        BIGINT_JAVASCRIPT_LOW = BigInteger.valueOf(-9007199254740991L);
        BIGINT_JAVASCRIPT_HIGH = BigInteger.valueOf(9007199254740991L);
        SMALL_10_POW = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        SINGLE_SMALL_10_POW = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        BIG_10_POW = new double[]{1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
        TINY_10_POW = new double[]{1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
        CACHE = new Cache();
        CHARS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(Cache.class, char[].class, "chars");
        NAME_MAPPINGS = new IdentityHashMap();
        TYPE_MAPPINGS = new ConcurrentHashMap();
        Class clsLoadClass = loadClass("com.alibaba.fastjson.JSONObject");
        CLASS_JSON_OBJECT_1x = clsLoadClass;
        Field declaredField = null;
        if (clsLoadClass != null) {
            try {
                declaredField = clsLoadClass.getDeclaredField("map");
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        FIELD_JSON_OBJECT_1x_map = declaredField;
        CLASS_JSON_ARRAY_1x = loadClass("com.alibaba.fastjson.JSONArray");
        Map<Class, String> map = NAME_MAPPINGS;
        map.put(Byte.TYPE, "B");
        map.put(Short.TYPE, "S");
        map.put(cls2, "I");
        map.put(cls3, "J");
        map.put(Float.TYPE, "F");
        map.put(cls4, "D");
        map.put(Character.TYPE, "C");
        map.put(Boolean.TYPE, "Z");
        map.put(Object[].class, "[O");
        map.put(Object[][].class, "[[O");
        map.put(byte[].class, "[B");
        map.put(byte[][].class, "[[B");
        map.put(short[].class, "[S");
        map.put(short[][].class, "[[S");
        map.put(int[].class, "[I");
        map.put(int[][].class, "[[I");
        map.put(long[].class, "[J");
        map.put(long[][].class, "[[J");
        map.put(float[].class, "[F");
        map.put(float[][].class, "[[F");
        map.put(double[].class, "[D");
        map.put(double[][].class, "[[D");
        map.put(char[].class, "[C");
        map.put(char[][].class, "[[C");
        map.put(boolean[].class, "[Z");
        map.put(boolean[][].class, "[[Z");
        map.put(Byte[].class, "[Byte");
        map.put(Byte[][].class, "[[Byte");
        map.put(Short[].class, "[Short");
        map.put(Short[][].class, "[[Short");
        map.put(Integer[].class, "[Integer");
        map.put(Integer[][].class, "[[Integer");
        map.put(Long[].class, "[Long");
        map.put(Long[][].class, "[[Long");
        map.put(Float[].class, "[Float");
        map.put(Float[][].class, "[[Float");
        map.put(Double[].class, "[Double");
        map.put(Double[][].class, "[[Double");
        map.put(Character[].class, "[Character");
        map.put(Character[][].class, "[[Character");
        map.put(Boolean[].class, "[Boolean");
        map.put(Boolean[][].class, "[[Boolean");
        map.put(String[].class, "[String");
        map.put(String[][].class, "[[String");
        map.put(BigDecimal[].class, "[BigDecimal");
        map.put(BigDecimal[][].class, "[[BigDecimal");
        map.put(BigInteger[].class, "[BigInteger");
        map.put(BigInteger[][].class, "[[BigInteger");
        map.put(UUID[].class, "[UUID");
        map.put(UUID[][].class, "[[UUID");
        map.put(Object.class, "Object");
        map.put(HashMap.class, "M");
        Map<String, Class> map2 = TYPE_MAPPINGS;
        map2.put("HashMap", HashMap.class);
        map2.put("java.util.HashMap", HashMap.class);
        map.put(LinkedHashMap.class, "LM");
        map2.put("LinkedHashMap", LinkedHashMap.class);
        map2.put("java.util.LinkedHashMap", LinkedHashMap.class);
        map.put(TreeMap.class, "TM");
        map2.put("TreeMap", TreeMap.class);
        map.put(ArrayList.class, "A");
        map2.put("ArrayList", ArrayList.class);
        map2.put("java.util.ArrayList", ArrayList.class);
        map.put(LinkedList.class, "LA");
        map2.put("LA", LinkedList.class);
        map2.put("LinkedList", LinkedList.class);
        map2.put("java.util.LinkedList", LinkedList.class);
        map2.put("java.util.concurrent.ConcurrentLinkedQueue", ConcurrentLinkedQueue.class);
        map2.put("java.util.concurrent.ConcurrentLinkedDeque", ConcurrentLinkedDeque.class);
        map.put(HashSet.class, "HashSet");
        map.put(TreeSet.class, "TreeSet");
        map.put(LinkedHashSet.class, "LinkedHashSet");
        map.put(ConcurrentHashMap.class, "ConcurrentHashMap");
        map.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
        map.put(ConcurrentLinkedDeque.class, "ConcurrentLinkedDeque");
        map.put(JSONObject.class, "JSONObject");
        map.put(JSONArray.class, "JSONArray");
        map.put(Currency.class, "Currency");
        map.put(TimeUnit.class, "TimeUnit");
        Class[] clsArr = {Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class};
        for (int i = 0; i < 68; i++) {
            Class cls5 = clsArr[i];
            Map<String, Class> map3 = TYPE_MAPPINGS;
            map3.put(cls5.getSimpleName(), cls5);
            map3.put(cls5.getName(), cls5);
            NAME_MAPPINGS.put(cls5, cls5.getSimpleName());
        }
        Map<String, Class> map4 = TYPE_MAPPINGS;
        map4.put("JO10", JSONObject1O.class);
        map4.put("[O", Object[].class);
        map4.put("[Ljava.lang.Object;", Object[].class);
        map4.put("[java.lang.Object", Object[].class);
        map4.put("[Object", Object[].class);
        map4.put("StackTraceElement", StackTraceElement.class);
        map4.put("[StackTraceElement", StackTraceElement[].class);
        String[] strArr = {"java.util.Collections$UnmodifiableMap", "java.util.Collections$UnmodifiableCollection"};
        for (int i2 = 0; i2 < 2; i2++) {
            Class clsLoadClass2 = loadClass(strArr[i2]);
            TYPE_MAPPINGS.put(clsLoadClass2.getName(), clsLoadClass2);
        }
        Class cls6 = CLASS_JSON_OBJECT_1x;
        if (cls6 != null) {
            Map<String, Class> map5 = TYPE_MAPPINGS;
            map5.putIfAbsent("JO1", cls6);
            map5.putIfAbsent(cls6.getName(), cls6);
        }
        Class cls7 = CLASS_JSON_ARRAY_1x;
        if (cls7 != null) {
            Map<String, Class> map6 = TYPE_MAPPINGS;
            map6.putIfAbsent("JA1", cls7);
            map6.putIfAbsent(cls7.getName(), cls7);
        }
        Map<Class, String> map7 = NAME_MAPPINGS;
        map7.put(new HashMap().keySet().getClass(), "Set");
        map7.put(new LinkedHashMap().keySet().getClass(), "Set");
        map7.put(new TreeMap().keySet().getClass(), "Set");
        map7.put(new ConcurrentHashMap().keySet().getClass(), "Set");
        map7.put(new ConcurrentSkipListMap().keySet().getClass(), "Set");
        Map<String, Class> map8 = TYPE_MAPPINGS;
        map8.put("Set", HashSet.class);
        map7.put(new HashMap().values().getClass(), "List");
        map7.put(new LinkedHashMap().values().getClass(), "List");
        map7.put(new TreeMap().values().getClass(), "List");
        map7.put(new ConcurrentHashMap().values().getClass(), "List");
        map7.put(new ConcurrentSkipListMap().values().getClass(), "List");
        map8.put("List", ArrayList.class);
        map8.put("java.util.ImmutableCollections$Map1", HashMap.class);
        map8.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
        map8.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
        map8.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
        map8.put("java.util.ImmutableCollections$List12", ArrayList.class);
        map8.put("java.util.ImmutableCollections$ListN", ArrayList.class);
        map8.put("java.util.ImmutableCollections$SubList", ArrayList.class);
        for (Map.Entry<Class, String> entry : map7.entrySet()) {
            TYPE_MAPPINGS.putIfAbsent(entry.getValue(), entry.getKey());
        }
    }

    public static Object[] cast(Object obj, Type[] typeArr) {
        if (obj == null) {
            return null;
        }
        int length = typeArr.length;
        Object[] objArr = new Object[length];
        int i = 0;
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                objArr[i] = cast(it.next(), typeArr[i]);
                i++;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (!cls.isArray()) {
                throw new JSONException("can not cast to types " + JSON.toJSONString(typeArr) + " from " + cls);
            }
            int length2 = Array.getLength(obj);
            while (i < length && i < length2) {
                objArr[i] = cast(Array.get(obj, i), typeArr[i]);
                i++;
            }
        }
        return objArr;
    }

    public static int compare(Object obj, Object obj2) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (cls == cls2) {
            return ((Comparable) obj).compareTo(obj2);
        }
        if (cls == BigDecimal.class) {
            if (cls2 == Integer.class || cls2 == Long.class) {
                obj2 = BigDecimal.valueOf(((Number) obj2).longValue());
            } else if (cls2 == Float.class || cls2 == Double.class) {
                obj2 = BigDecimal.valueOf(((Number) obj2).doubleValue());
            } else if (cls2 == BigInteger.class) {
                bigDecimal = new BigDecimal((BigInteger) obj2);
                obj2 = bigDecimal;
            }
        } else if (cls == BigInteger.class) {
            if (cls2 == Integer.class || cls2 == Long.class) {
                obj2 = BigInteger.valueOf(((Number) obj2).longValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    obj2 = BigDecimal.valueOf(((Number) obj2).doubleValue());
                    bigDecimal2 = new BigDecimal((BigInteger) obj);
                } else if (cls2 == BigDecimal.class) {
                    bigDecimal2 = new BigDecimal((BigInteger) obj);
                }
                obj = bigDecimal2;
            }
        } else if (cls == Long.class) {
            if (cls2 == Integer.class) {
                return Long.compare(((Long) obj).longValue(), ((Integer) obj2).intValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Long) obj).longValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(((Long) obj).longValue(), ((Number) obj2).doubleValue());
                }
                if (cls2 == BigInteger.class) {
                    obj = BigInteger.valueOf(((Long) obj).longValue());
                } else if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Long) obj).longValue());
                    bigDecimal = new BigDecimal((String) obj2);
                    obj2 = bigDecimal;
                }
            }
        } else if (cls == Integer.class) {
            if (cls2 == Long.class) {
                return Long.compare(((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Integer) obj).intValue());
            } else if (cls2 == BigInteger.class) {
                obj = BigInteger.valueOf(((Integer) obj).intValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(((Integer) obj).intValue(), ((Number) obj2).doubleValue());
                }
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Integer) obj).intValue());
                    bigDecimal = new BigDecimal((String) obj2);
                    obj2 = bigDecimal;
                }
            }
        } else if (cls == Double.class) {
            if (cls2 == Integer.class || cls2 == Long.class || cls2 == Float.class) {
                return Double.compare(((Double) obj).doubleValue(), ((Number) obj2).doubleValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Double) obj).doubleValue());
            } else {
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                    bigDecimal = new BigDecimal((String) obj2);
                } else if (cls2 == BigInteger.class) {
                    obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                    bigDecimal = new BigDecimal((BigInteger) obj2);
                }
                obj2 = bigDecimal;
            }
        } else if (cls == Float.class) {
            if (cls2 == Integer.class || cls2 == Long.class || cls2 == Double.class) {
                return Double.compare(((Float) obj).floatValue(), ((Number) obj2).doubleValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Float) obj).floatValue());
            } else {
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Float) obj).floatValue());
                    bigDecimal = new BigDecimal((String) obj2);
                } else if (cls2 == BigInteger.class) {
                    obj = BigDecimal.valueOf(((Float) obj).floatValue());
                    bigDecimal = new BigDecimal((BigInteger) obj2);
                }
                obj2 = bigDecimal;
            }
        } else if (cls == String.class) {
            String str = (String) obj;
            if (cls2 == Integer.class || cls2 == Long.class) {
                try {
                    return Long.compare(Long.parseLong(str), ((Number) obj2).longValue());
                } catch (NumberFormatException unused) {
                    obj = new BigDecimal(str);
                    obj2 = BigDecimal.valueOf(((Number) obj2).longValue());
                }
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(Double.parseDouble(str), ((Number) obj2).doubleValue());
                }
                if (cls2 == BigInteger.class) {
                    obj = new BigInteger(str);
                } else if (cls2 == BigDecimal.class) {
                    obj = new BigDecimal(str);
                }
            }
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ca A[PHI: r18
      0x00ca: PHI (r18v2 double) = (r18v0 double), (r18v4 double) binds: [B:85:0x0102, B:58:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    public static double doubleValue(boolean z, int i, byte[] bArr, int i2) {
        double d;
        long j;
        int i3;
        int i4;
        FDBigInteger fDBigIntegerRightInplaceSub;
        boolean z2;
        int i5 = i2;
        int length = SMALL_10_POW.length - 1;
        int iMin = Math.min(i5, 16);
        int i6 = bArr[0] + -48;
        int iMin2 = Math.min(iMin, 9);
        for (int i7 = 1; i7 < iMin2; i7++) {
            i6 = ((i6 * 10) + bArr[i7]) - 48;
        }
        long j2 = i6;
        while (iMin2 < iMin) {
            j2 = (j2 * 10) + ((long) (bArr[iMin2] + -48));
            iMin2++;
        }
        double d2 = j2;
        int i8 = i - iMin;
        if (i5 <= 15) {
            if (i8 == 0 || d2 == 0.0d) {
                return z ? -d2 : d2;
            }
            if (i8 >= 0) {
                if (i8 <= length) {
                    double d3 = d2 * SMALL_10_POW[i8];
                    return z ? -d3 : d3;
                }
                int i9 = 15 - iMin;
                if (i8 <= length + i9) {
                    double[] dArr = SMALL_10_POW;
                    double d4 = d2 * dArr[i9] * dArr[i8 - i9];
                    return z ? -d4 : d4;
                }
            } else if (i8 >= (-length)) {
                double d5 = d2 / SMALL_10_POW[-i8];
                return z ? -d5 : d5;
            }
        }
        if (i8 > 0) {
            if (i > 309) {
                return z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            int i10 = i8 & 15;
            if (i10 != 0) {
                d2 *= SMALL_10_POW[i10];
            }
            int i11 = i8 >> 4;
            if (i11 != 0) {
                int i12 = 0;
                while (i11 > 1) {
                    if ((i11 & 1) != 0) {
                        d2 *= BIG_10_POW[i12];
                    }
                    i12++;
                    i11 >>= 1;
                }
                double[] dArr2 = BIG_10_POW;
                d = dArr2[i12] * d2;
                if (!Double.isInfinite(d)) {
                    d2 = d;
                } else {
                    if (Double.isInfinite((d2 / 2.0d) * dArr2[i12])) {
                        return z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    d2 = 1.7976931348623157E308;
                }
            }
        } else if (i8 < 0) {
            int i13 = -i8;
            if (i < -325) {
                return z ? -0.0 : 0.0d;
            }
            int i14 = i13 & 15;
            if (i14 != 0) {
                d2 /= SMALL_10_POW[i14];
            }
            int i15 = i13 >> 4;
            if (i15 != 0) {
                int i16 = 0;
                while (i15 > 1) {
                    if ((i15 & 1) != 0) {
                        d2 *= TINY_10_POW[i16];
                    }
                    i16++;
                    i15 >>= 1;
                }
                double d6 = TINY_10_POW[i16];
                d = d2 * d6;
                if (d != 0.0d) {
                    d2 = d;
                } else {
                    if (d2 * 2.0d * d6 == 0.0d) {
                        return z ? -0.0 : 0.0d;
                    }
                    d2 = 4.9E-324;
                }
            }
        }
        double d7 = d2;
        if (i5 > 1100) {
            bArr[1100] = 49;
            i5 = 1101;
        }
        int i17 = i5;
        FDBigInteger fDBigInteger = new FDBigInteger(j2, bArr, iMin, i17);
        int i18 = i - i17;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d7);
        int iMax = Math.max(0, -i18);
        int iMax2 = Math.max(0, i18);
        FDBigInteger fDBigIntegerMultByPow52 = fDBigInteger.multByPow52(iMax2, 0);
        fDBigIntegerMultByPow52.makeImmutable();
        FDBigInteger fDBigIntegerLeftShift = null;
        int i19 = 0;
        do {
            int i20 = (int) (jDoubleToRawLongBits >>> 52);
            long j3 = 4503599627370495L & jDoubleToRawLongBits;
            if (i20 > 0) {
                j = j3 | 4503599627370496L;
            } else {
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3) - 11;
                j = j3 << iNumberOfLeadingZeros;
                i20 = 1 - iNumberOfLeadingZeros;
            }
            int i21 = i20 - 1023;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
            long j4 = j >>> iNumberOfTrailingZeros;
            int i22 = (i20 - 1075) + iNumberOfTrailingZeros;
            int i23 = 53 - iNumberOfTrailingZeros;
            if (i22 >= 0) {
                i4 = iMax + i22;
                i3 = iMax2;
            } else {
                i3 = iMax2 - i22;
                i4 = iMax;
            }
            int i24 = i21 <= -1023 ? i21 + iNumberOfTrailingZeros + 1023 : iNumberOfTrailingZeros + 1;
            int i25 = i4 + i24;
            int i26 = i3 + i24;
            int iMin3 = Math.min(i25, Math.min(i26, i4));
            int i27 = i26 - iMin3;
            int i28 = i4 - iMin3;
            FDBigInteger fDBigIntegerValueOfMulPow52 = FDBigInteger.valueOfMulPow52(j4, iMax, i25 - iMin3);
            if (fDBigIntegerLeftShift == null || i19 != i27) {
                fDBigIntegerLeftShift = fDBigIntegerMultByPow52.leftShift(i27);
                i19 = i27;
            }
            int iCmp = fDBigIntegerValueOfMulPow52.cmp(fDBigIntegerLeftShift);
            if (iCmp <= 0) {
                if (iCmp >= 0) {
                    break;
                }
                fDBigIntegerRightInplaceSub = fDBigIntegerLeftShift.rightInplaceSub(fDBigIntegerValueOfMulPow52);
                z2 = false;
            } else {
                fDBigIntegerRightInplaceSub = fDBigIntegerValueOfMulPow52.leftInplaceSub(fDBigIntegerLeftShift);
                if (i23 != 1 || i22 <= -1022 || (i28 = i28 - 1) >= 0) {
                    z2 = true;
                } else {
                    fDBigIntegerRightInplaceSub = fDBigIntegerRightInplaceSub.leftShift(1);
                    z2 = true;
                    i28 = 0;
                }
            }
            int iCmpPow52 = fDBigIntegerRightInplaceSub.cmpPow52(iMax, i28);
            if (iCmpPow52 < 0) {
                break;
            }
            if (iCmpPow52 == 0) {
                if ((jDoubleToRawLongBits & 1) == 0) {
                    break;
                }
                jDoubleToRawLongBits += z2 ? -1L : 1L;
                break;
            }
            jDoubleToRawLongBits += z2 ? -1L : 1L;
            if (jDoubleToRawLongBits == 0) {
                break;
            }
        } while (jDoubleToRawLongBits != 9218868437227405312L);
        if (z) {
            jDoubleToRawLongBits |= -9223372036854775808L;
        }
        return Double.longBitsToDouble(jDoubleToRawLongBits);
    }

    public static float floatValue(boolean z, int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        FDBigInteger fDBigIntegerRightInplaceSub;
        boolean z2;
        int i6 = i2;
        int length = SINGLE_SMALL_10_POW.length - 1;
        int i7 = 8;
        int iMin = Math.min(i6, 8);
        int i8 = bArr[0] + -48;
        for (int i9 = 1; i9 < iMin; i9++) {
            i8 = ((i8 * 10) + bArr[i9]) - 48;
        }
        float f = i8;
        int i10 = i - iMin;
        if (i6 <= 7) {
            if (i10 == 0 || f == 0.0f) {
                return z ? -f : f;
            }
            if (i10 >= 0) {
                if (i10 <= length) {
                    float f2 = f * SINGLE_SMALL_10_POW[i10];
                    return z ? -f2 : f2;
                }
                int i11 = 7 - iMin;
                if (i10 <= length + i11) {
                    float[] fArr = SINGLE_SMALL_10_POW;
                    float f3 = f * fArr[i11] * fArr[i10 - i11];
                    return z ? -f3 : f3;
                }
            } else if (i10 >= (-length)) {
                float f4 = f / SINGLE_SMALL_10_POW[-i10];
                return z ? -f4 : f4;
            }
        } else if (i >= i6 && i6 + i <= 15) {
            long j = i8;
            while (iMin < i6) {
                j = (j * 10) + ((long) (bArr[iMin] + -48));
                iMin++;
            }
            float f5 = (float) (j * SMALL_10_POW[i - i6]);
            return z ? -f5 : f5;
        }
        double d = f;
        if (i10 > 0) {
            if (i > 39) {
                return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            int i12 = i10 & 15;
            if (i12 != 0) {
                d *= SMALL_10_POW[i12];
            }
            int i13 = i10 >> 4;
            if (i13 != 0) {
                int i14 = 0;
                while (i13 > 0) {
                    if ((i13 & 1) != 0) {
                        d *= BIG_10_POW[i14];
                    }
                    i14++;
                    i13 >>= 1;
                }
            }
        } else if (i10 < 0) {
            int i15 = -i10;
            if (i < -46) {
                return z ? -0.0f : 0.0f;
            }
            int i16 = i15 & 15;
            if (i16 != 0) {
                d /= SMALL_10_POW[i16];
            }
            int i17 = i15 >> 4;
            if (i17 != 0) {
                int i18 = 0;
                while (i17 > 0) {
                    if ((i17 & 1) != 0) {
                        d *= TINY_10_POW[i18];
                    }
                    i18++;
                    i17 >>= 1;
                }
            }
        }
        float fMax = Math.max(1.4E-45f, Math.min(3.4028235E38f, (float) d));
        if (i6 > 200) {
            bArr[200] = 49;
            i6 = 201;
        }
        int i19 = i6;
        FDBigInteger fDBigInteger = new FDBigInteger(i8, bArr, iMin, i19);
        int i20 = i - i19;
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        int iMax = Math.max(0, -i20);
        int iMax2 = Math.max(0, i20);
        FDBigInteger fDBigIntegerMultByPow52 = fDBigInteger.multByPow52(iMax2, 0);
        fDBigIntegerMultByPow52.makeImmutable();
        FDBigInteger fDBigIntegerLeftShift = null;
        int i21 = 0;
        while (true) {
            int i22 = iFloatToRawIntBits >>> 23;
            int i23 = 8388607 & iFloatToRawIntBits;
            if (i22 > 0) {
                i3 = i23 | 8388608;
            } else {
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i23) - 8;
                i3 = i23 << iNumberOfLeadingZeros;
                i22 = 1 - iNumberOfLeadingZeros;
            }
            int i24 = i22 - 127;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i3);
            int i25 = i3 >>> iNumberOfTrailingZeros;
            int i26 = (i22 - 150) + iNumberOfTrailingZeros;
            int i27 = 24 - iNumberOfTrailingZeros;
            if (i26 >= 0) {
                i5 = iMax + i26;
                i4 = iMax2;
            } else {
                i4 = iMax2 - i26;
                i5 = iMax;
            }
            int i28 = i24 <= -127 ? i24 + iNumberOfTrailingZeros + 127 : iNumberOfTrailingZeros + 1;
            int i29 = i5 + i28;
            int i30 = i4 + i28;
            int iMin2 = Math.min(i29, Math.min(i30, i5));
            int i31 = i30 - iMin2;
            int i32 = i5 - iMin2;
            FDBigInteger fDBigIntegerValueOfMulPow52 = FDBigInteger.valueOfMulPow52(i25, iMax, i29 - iMin2);
            if (fDBigIntegerLeftShift == null || i21 != i31) {
                fDBigIntegerLeftShift = fDBigIntegerMultByPow52.leftShift(i31);
                i21 = i31;
            }
            int iCmp = fDBigIntegerValueOfMulPow52.cmp(fDBigIntegerLeftShift);
            if (iCmp <= 0) {
                if (iCmp >= 0) {
                    break;
                }
                fDBigIntegerRightInplaceSub = fDBigIntegerLeftShift.rightInplaceSub(fDBigIntegerValueOfMulPow52);
                z2 = false;
            } else {
                fDBigIntegerRightInplaceSub = fDBigIntegerValueOfMulPow52.leftInplaceSub(fDBigIntegerLeftShift);
                if (i27 != 1 || i26 <= -126 || (i32 = i32 - 1) >= 0) {
                    z2 = true;
                } else {
                    fDBigIntegerRightInplaceSub = fDBigIntegerRightInplaceSub.leftShift(1);
                    z2 = true;
                    i32 = 0;
                }
            }
            int iCmpPow52 = fDBigIntegerRightInplaceSub.cmpPow52(iMax, i32);
            if (iCmpPow52 < 0) {
                break;
            }
            if (iCmpPow52 == 0) {
                if ((iFloatToRawIntBits & 1) == 0) {
                    break;
                }
                iFloatToRawIntBits += z2 ? -1 : 1;
                break;
            }
            iFloatToRawIntBits += z2 ? -1 : 1;
            if (iFloatToRawIntBits == 0 || iFloatToRawIntBits == 2139095040) {
                break;
            }
            i7 = 8;
        }
        if (z) {
            iFloatToRawIntBits |= -2147483648;
        }
        return Float.intBitsToFloat(iFloatToRawIntBits);
    }

    public static Class<?> getArrayClass(Class cls) {
        if (cls == Integer.TYPE) {
            return int[].class;
        }
        if (cls == Byte.TYPE) {
            return byte[].class;
        }
        if (cls == Short.TYPE) {
            return short[].class;
        }
        if (cls == Long.TYPE) {
            return long[].class;
        }
        if (cls == String.class) {
            return String[].class;
        }
        return cls == Object.class ? Object[].class : Array.newInstance((Class<?>) cls, 1).getClass();
    }

    public static Class<?> getClass(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getClass(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getClass(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getClass(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? getArrayClass(getClass(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static Object getDefaultValue(Type type) {
        if (type == Integer.TYPE) {
            return 0;
        }
        if (type == Long.TYPE) {
            return 0L;
        }
        if (type == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (type == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (type == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (type == Short.TYPE) {
            return (short) 0;
        }
        if (type == Byte.TYPE) {
            return (byte) 0;
        }
        if (type == Character.TYPE) {
            return (char) 0;
        }
        if (type == Optional.class) {
            return Optional.empty();
        }
        if (type == OptionalInt.class) {
            return OptionalInt.empty();
        }
        if (type == OptionalLong.class) {
            return OptionalLong.empty();
        }
        if (type == OptionalDouble.class) {
            return OptionalDouble.empty();
        }
        return null;
    }

    public static Map getInnerMap(Map map) {
        Field field;
        Class cls = CLASS_JSON_OBJECT_1x;
        if (cls != null && cls.isInstance(map) && (field = FIELD_JSON_OBJECT_1x_map) != null) {
            try {
                return (Map) field.get(map);
            } catch (IllegalAccessException unused) {
            }
        }
        return map;
    }

    public static Type getMapValueType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length == 2 ? actualTypeArguments[1] : Object.class;
    }

    public static Class<?> getMapping(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getMapping(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getMapping(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getMapping(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? getArrayClass(getClass(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static String getTypeName(Class cls) {
        Map<Class, String> map = NAME_MAPPINGS;
        String str = map.get(cls);
        if (str != null) {
            return str;
        }
        if (Proxy.isProxyClass(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0) {
                cls = interfaces[0];
            }
        }
        String typeName = cls.getTypeName();
        
        if (typeName.equals("com.alibaba.fastjson.JSONObject")) {
            map.putIfAbsent(cls, "JO1");
            return map.get(cls);
        }
        if (typeName.equals("com.alibaba.fastjson.JSONArray")) {
            map.putIfAbsent(cls, "JA1");
            return map.get(cls);
        }
        int iIndexOf = typeName.indexOf(36);
        if (iIndexOf != -1 && isInteger(typeName.substring(iIndexOf + 1))) {
            Class superclass = cls.getSuperclass();
            if (Map.class.isAssignableFrom(superclass)) {
                return getTypeName(superclass);
            }
        }
        return typeName;
    }

    public static Type intern(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) ? PARAM_TYPE_LIST_STR : type;
    }

    public static boolean isFunction(Class cls) {
        if (!cls.isInterface()) {
            return false;
        }
        if (cls.getName().startsWith("java.util.function.")) {
            return true;
        }
        return cls.isAnnotationPresent(FunctionalInterface.class);
    }

    public static boolean isInt32(BigInteger bigInteger) {
        int i;
        long j = JDKUtils.FIELD_BIGINTEGER_MAG_OFFSET;
        if (j == -1) {
            return bigInteger.compareTo(BIGINT_INT32_MIN) >= 0 && bigInteger.compareTo(BIGINT_INT32_MAX) <= 0;
        }
        int[] iArr = (int[]) JDKUtils.UNSAFE.getObject(bigInteger, j);
        return iArr.length == 0 || (iArr.length == 1 && ((i = iArr[0]) >= 0 || (i == -2147483648 && bigInteger.signum() == -1)));
    }

    public static boolean isInt64(BigInteger bigInteger) {
        long j = JDKUtils.FIELD_BIGINTEGER_MAG_OFFSET;
        if (j != -1) {
            int[] iArr = (int[]) JDKUtils.UNSAFE.getObject(bigInteger, j);
            if (iArr.length <= 1) {
                return true;
            }
            if (iArr.length == 2) {
                int i = iArr[0];
                return i >= 0 || (i == -2147483648 && iArr[1] == 0 && bigInteger.signum() == -1);
            }
        }
        return bigInteger.compareTo(BIGINT_INT64_MIN) >= 0 && bigInteger.compareTo(BIGINT_INT64_MAX) <= 0;
    }

    public static boolean isInteger(BigDecimal bigDecimal) {
        int iScale = bigDecimal.scale();
        if (iScale == 0) {
            return true;
        }
        if (bigDecimal.precision() < 20) {
            long j = JDKUtils.FIELD_DECIMAL_INT_COMPACT_OFFSET;
            if (j != -1) {
                long j2 = JDKUtils.UNSAFE.getLong(bigDecimal, j);
                switch (iScale) {
                    case 1:
                        return j2 % 10 == 0;
                    case 2:
                        return j2 % 100 == 0;
                    case 3:
                        return j2 % 1000 == 0;
                    case 4:
                        return j2 % 10000 == 0;
                    case 5:
                        return j2 % 100000 == 0;
                    case 6:
                        return j2 % 1000000 == 0;
                    case 7:
                        return j2 % 10000000 == 0;
                    case 8:
                        return j2 % 100000000 == 0;
                    case 9:
                        return j2 % 1000000000 == 0;
                }
            }
        }
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).scale() == 0;
    }

    public static boolean isJavaScriptSupport(long j) {
        return j >= -9007199254740991L && j <= 9007199254740991L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0061  */
    /* JADX WARN: Code duplicated, block: B:51:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0081  */
    /* JADX WARN: Code duplicated, block: B:62:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0092  */
    /* JADX WARN: Code duplicated, block: B:66:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x009e  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00b8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static boolean isNumber(String str) {
        int i;
        int length;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        char cCharAt3;
        if (str != null && !str.isEmpty()) {
            char cCharAt4 = str.charAt(0);
            if (cCharAt4 != '-' && cCharAt4 != '+') {
                if (cCharAt4 != '.') {
                    i = 0;
                } else if (str.length() == 1) {
                    return false;
                }
                length = str.length();
                if (cCharAt4 == '.') {
                    z = true;
                } else {
                    z = false;
                }
                if (false) {
                    while (i < length) {
                        int i4 = i + 1;
                        char cCharAt5 = str.charAt(i);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            i = i4;
                            cCharAt4 = cCharAt5;
                            z2 = true;
                        } else {
                            i = i4;
                        }
                    }
                    return true;
                }
                z2 = false;
                if (cCharAt4 == '.') {
                    z3 = false;
                } else {
                    if (true) {
                        return true;
                    }
                    i3 = i + 1;
                    cCharAt3 = str.charAt(i);
                    if (cCharAt3 < '0' && cCharAt3 <= '9') {
                        while (i3 < length) {
                            i = i3 + 1;
                            cCharAt4 = str.charAt(i3);
                            if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                                i3 = i;
                            }
                        }
                        return true;
                    }
                    i = i3;
                    cCharAt4 = cCharAt3;
                    z3 = true;
                }
                if (false) {
                    return false;
                }
                if (true) {
                    if (i == length) {
                        return true;
                    }
                    i2 = i + 1;
                    cCharAt = str.charAt(i);
                    if (cCharAt != '+' || false) {
                        if (i2 < length) {
                            cCharAt = str.charAt(i2);
                            i2 = i + 2;
                        }
                    }
                    if (cCharAt >= '0' && cCharAt <= '9') {
                        while (i2 < length) {
                            int i5 = i2 + 1;
                            cCharAt2 = str.charAt(i2);
                            if (cCharAt2 < '0' && true) {
                                i2 = i5;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            if (str.length() == 1) {
                return false;
            }
            cCharAt4 = str.charAt(1);
            i = 1;
            length = str.length();
            if (cCharAt4 == '.') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (cCharAt4 == '.') {
                z3 = false;
            } else {
                if (true) {
                    return true;
                }
                i3 = i + 1;
                cCharAt3 = str.charAt(i);
                if (cCharAt3 < '0') {
                    i = i3;
                    cCharAt4 = cCharAt3;
                } else {
                    i = i3;
                    cCharAt4 = cCharAt3;
                }
                z3 = true;
            }
            if (false) {
            }
            if (true) {
            }
            if (false) {
                return true;
            }
            i2 = 2;
            cCharAt = str.charAt(1);
            if (cCharAt != '+') {
                if (2 < length) {
                    cCharAt = str.charAt(2);
                    i2 = 3;
                    if (cCharAt >= '0') {
                        while (3 < length) {
                            int i6 = 4;
                            cCharAt2 = str.charAt(3);
                            if (cCharAt2 < '0') {
                            }
                            return false;
                        }
                        return true;
                    }
                }
            } else if (2 < length) {
                cCharAt = str.charAt(2);
                i2 = 3;
                if (cCharAt >= '0') {
                    while (3 < length) {
                        int i7 = 4;
                        cCharAt2 = str.charAt(3);
                        if (cCharAt2 < '0') {
                        }
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isProxy(Class<?> cls) {
        String name = cls.getName();
        if (name.indexOf(36) != -1 && (name.contains("$EnhancerBySpringCGLIB$") || name.contains("$EnhancerByCGLIB$") || name.contains("$FastClassBySpringCGLIB$") || name.contains("$FastClassByCGLIB$") || name.contains("$EnhancerBySpringCGLIB$") || name.contains("$EnhancerByCGLIB$"))) {
            return true;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name2 = cls2.getName();
            if (name2.equals("javassist.util.proxy.ProxyObject") || name2.equals("org.springframework.cglib.proxy.Factory") || name2.equals("org.springframework.context.annotation.ConfigurationClassEnhancer$EnhancedConfiguration") || name2.equals("org.springframework.cloud.context.config.annotation.RefreshScope") || name2.equals("org.mockito.cglib.proxy.Factory") || name2.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject") || name2.equals("net.sf.cglib.proxy.Factory") || name2.equals("org.hibernate.proxy.HibernateProxy")) {
                return true;
            }
            if (name2.startsWith("org.springframework.cloud.context.config.annotation.") && name2.endsWith("RefreshScope")) {
                return true;
            }
        }
        return name.contains("$SpringCGLIB$") || name.contains("$SpringCGLIB$") || name.contains("$EnhancerBySpringCGLIB$");
    }

    public static boolean isUUID(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 32) {
            for (int i = 0; i < 32; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && (cCharAt < 'a' || cCharAt > 'f'))) {
                    return false;
                }
            }
            return true;
        }
        if (str.length() != 36) {
            return false;
        }
        for (int i2 = 0; i2 < 36; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (i2 == 8 || i2 == 13 || i2 == 18 || i2 == 23) {
                if (cCharAt2 != '-') {
                    return false;
                }
            } else if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Class loadClass(String str) {
        if (str.length() >= 192) {
            return null;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2073921873:
                if (str.equals("java.util.OptionalInt")) {
                    b = 0;
                }
                break;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    b = 1;
                }
                break;
            case -2010664371:
                if (str.equals("java.io.IOException")) {
                    b = 2;
                }
                break;
            case -1939501217:
                if (str.equals("Object")) {
                    b = 3;
                }
                break;
            case -1932803762:
                if (str.equals("HashMap")) {
                    b = 4;
                }
                break;
            case -1932797868:
                if (str.equals("HashSet")) {
                    b = 5;
                }
                break;
            case -1899270121:
                if (str.equals("java.util.LinkedList")) {
                    b = 6;
                }
                break;
            case -1808118735:
                if (str.equals("String")) {
                    b = 7;
                }
                break;
            case -1671476816:
                if (str.equals("ConcurrentLinkedDeque")) {
                    b = 8;
                }
                break;
            case -1659005919:
                if (str.equals("ConcurrentLinkedQueue")) {
                    b = 9;
                }
                break;
            case -1418007307:
                if (str.equals("LinkedHashMap")) {
                    b = 10;
                }
                break;
            case -1418001413:
                if (str.equals("LinkedHashSet")) {
                    b = 11;
                }
                break;
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    b = 12;
                }
                break;
            case -1402716492:
                if (str.equals("java.util.HashSet")) {
                    b = 13;
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    b = 14;
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    b = 15;
                }
                break;
            case -1374008726:
                if (str.equals("byte[]")) {
                    b = 16;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    b = 17;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    b = 18;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    b = 19;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    b = 20;
                }
                break;
            case -1074506598:
                if (str.equals("java.util.Collections$SingletonList")) {
                    b = 21;
                }
                break;
            case -958795145:
                if (str.equals("LinkedList")) {
                    b = 22;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    b = 23;
                }
                break;
            case -761719520:
                if (str.equals("java.util.Optional")) {
                    b = 24;
                }
                break;
            case -530663260:
                if (str.equals("java.lang.Class")) {
                    b = 25;
                }
                break;
            case -413661986:
                if (str.equals("java.util.Collections$EmptyMap")) {
                    b = 26;
                }
                break;
            case -413656092:
                if (str.equals("java.util.Collections$EmptySet")) {
                    b = 27;
                }
                break;
            case -113680546:
                if (str.equals("Calendar")) {
                    b = 28;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    b = 29;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    b = 30;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    b = 31;
                }
                break;
            case 68:
                if (str.equals("D")) {
                    b = 32;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b = 33;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b = 34;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b = 35;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    b = 36;
                }
                break;
            case 79 /* 79 */:
                if (str.equals("O")) {
                    b = 37;
                }
                break;
            case 83 /* 83 */:
                if (str.equals("S")) {
                    b = 38;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    b = 39;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b = 40;
                }
                break;
            case 2433:
                if (str.equals("LM")) {
                    b = 41;
                }
                break;
            case 2887:
                if (str.equals("[B")) {
                    b = 42;
                }
                break;
            case 2888:
                if (str.equals("[C")) {
                    b = 43;
                }
                break;
            case 2889:
                if (str.equals("[D")) {
                    b = 44;
                }
                break;
            case 2891:
                if (str.equals("[F")) {
                    b = 45;
                }
                break;
            case 2894:
                if (str.equals("[I")) {
                    b = 46;
                }
                break;
            case 2895:
                if (str.equals("[J")) {
                    b = 47;
                }
                break;
            case 2900:
                if (str.equals("[O")) {
                    b = 48;
                }
                break;
            case 2904:
                if (str.equals("[S")) {
                    b = 49;
                }
                break;
            case 2911:
                if (str.equals("[Z")) {
                    b = 50;
                }
                break;
            case 73612:
                if (str.equals("JO1")) {
                    b = 51;
                }
                break;
            case 77116:
                if (str.equals("Map")) {
                    b = 52;
                }
                break;
            case 83010:
                if (str.equals("Set")) {
                    b = 53;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    b = 54;
                }
                break;
            case 2122702:
                if (str.equals("Date")) {
                    b = 55;
                }
                break;
            case 2368702:
                if (str.equals("List")) {
                    b = 56;
                }
                break;
            case 2616251:
                if (str.equals("UUID")) {
                    b = 57;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    b = 58;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    b = 59;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    b = 60;
                }
                break;
            case 61358428:
                if (str.equals("java.util.Collections$EmptyList")) {
                    b = 61;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    b = 62;
                }
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    b = 63;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    b = 64;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    b = 65;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    b = 66;
                }
                break;
            case 133021628:
                if (str.equals("java.util.OptionalLong")) {
                    b = 67;
                }
                break;
            case 179563853:
                if (str.equals("java.util.Arrays$ArrayList")) {
                    b = 68;
                }
                break;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    b = 69;
                }
                break;
            case 578806391:
                if (str.equals("ArrayList")) {
                    b = 70;
                }
                break;
            case 600988612:
                if (str.equals("TreeSet")) {
                    b = 71;
                }
                break;
            case 889669201:
                if (str.equals("java.util.Collections$UnmodifiableRandomAccessList")) {
                    b = 72;
                }
                break;
            case 935176422:
                if (str.equals("java.util.Collections$SingletonSet")) {
                    b = 73;
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    b = 74;
                }
                break;
            case 1131069988:
                if (str.equals("java.util.TreeSet")) {
                    b = 75;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    b = 76;
                }
                break;
            case 1258621781:
                if (str.equals("java.util.LinkedHashMap")) {
                    b = 77;
                }
                break;
            case 1258627675:
                if (str.equals("java.util.LinkedHashSet")) {
                    b = 78;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    b = 79;
                }
                break;
            case 1372295063:
                if (str.equals("ConcurrentHashMap")) {
                    b = 80;
                }
                break;
            case 1645304908:
                if (str.equals("[String")) {
                    b = 81;
                }
                break;
            case 1752376903:
                if (str.equals("JSONObject")) {
                    b = 82;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    b = 83;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    b = 84;
                }
                break;
        }
        switch (b) {
            case 0:
                return OptionalInt.class;
            case 1:
                return Integer.class;
            case 2:
                return IOException.class;
            case 3:
            case 37:
            case 74:
                return Object.class;
            case 4:
            case 12 /* 12 */:
            case 36:
                return HashMap.class;
            case 5:
            case 13:
                return HashSet.class;
            case 6:
            case 22 /* 22 */:
            case 40:
                return LinkedList.class;
            case 7:
            case 76:
                return String.class;
            case 8:
                return ConcurrentLinkedDeque.class;
            case 9:
                return ConcurrentLinkedQueue.class;
            case 10:
            case 41:
            case 77:
                return LinkedHashMap.class;
            case 11:
            case 78:
                return LinkedHashSet.class;
            case 14 /* 14 */:
            case 52:
                return Map.class;
            case 15:
            case 53:
                return Set.class;
            case 16:
            case 42:
                return byte[].class;
            case 17 /* 17 */:
            case 43:
                return char[].class;
            case 18 /* 18 */:
            case 32:
                return Double.TYPE;
            case 19:
            case 29:
            case 70:
                return ArrayList.class;
            case 20:
            case 47:
                return long[].class;
            case 21 /* 21 */:
                return CLASS_SINGLE_LIST;
            case 23 /* 23 */:
            case 45:
                return float[].class;
            case 24:
                return Optional.class;
            case 25 /* 25 */:
                return Class.class;
            case 26:
                return Collections.EMPTY_MAP.getClass();
            case 27:
                return Collections.EMPTY_SET.getClass();
            case 28:
                return Calendar.class;
            case 30:
            case 58 /* 58 */:
                return Byte.TYPE;
            case 31:
            case 59:
                return Character.TYPE;
            case 33:
            case 64:
                return Float.TYPE;
            case 34:
            case 54 /* 54 */:
                return Integer.TYPE;
            case 35:
            case 60:
                return Long.TYPE;
            case 38:
            case 66:
                return Short.TYPE;
            case 39:
            case 62:
                return Boolean.TYPE;
            case 44:
            case 79 /* 79 */:
                return double[].class;
            case 46 /* 46 */:
            case 65:
                return int[].class;
            case 48:
                return Object[].class;
            case 49:
            case 84 /* 84 */:
                return short[].class;
            case 50 /* 50 */:
            case 83 /* 83 */:
                return boolean[].class;
            case 51 /* 51 */:
                str = "com.alibaba.fastjson.JSONObject";
                break;
            case 55 /* 55 */:
                return Date.class;
            case 56 /* 56 */:
            case 63:
                return List.class;
            case 57 /* 57 */:
                return UUID.class;
            case 61:
                return Collections.EMPTY_LIST.getClass();
            case 67:
                return OptionalLong.class;
            case 68:
                return Arrays.asList(1).getClass();
            case 69:
                return Long.class;
            case 71:
            case 75:
                return TreeSet.class;
            case 72:
                return CLASS_UNMODIFIABLE_LIST;
            case 73:
                return CLASS_SINGLE_SET;
            case 80:
                return ConcurrentHashMap.class;
            case 81:
                return String[].class;
            case 82:
                return JSONObject.class;
        }
        Class cls = TYPE_MAPPINGS.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.startsWith("java.util.ImmutableCollections$")) {
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return CLASS_UNMODIFIABLE_LIST;
            }
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = AbstractC2784.m4744(1, 1, str);
        }
        if (str.charAt(0) == '[' || str.endsWith("[]")) {
            Class clsLoadClass = loadClass(str.charAt(0) == '[' ? str.substring(1) : AbstractC2784.m4744(2, 0, str));
            if (clsLoadClass != null) {
                return Array.newInstance((Class<?>) clsLoadClass, 0).getClass();
            }
            throw new JSONException("load class error ".concat(str));
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return contextClassLoader.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        try {
            try {
                return JSON.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } catch (ClassNotFoundException unused4) {
            return Class.forName(str);
        }
    }

    public static <T> T newProxyInstance(Class<T> cls, JSONObject jSONObject) {
        MethodHandle methodHandleFindStatic = METHOD_NEW_PROXY_INSTANCE;
        if (methodHandleFindStatic == null) {
            try {
                Class<?> cls2 = Class.forName("java.lang.reflect.Proxy");
                methodHandleFindStatic = JDKUtils.trustedLookup(cls2).findStatic(cls2, "newProxyInstance", MethodType.methodType(Object.class, ClassLoader.class, Class[].class, InvocationHandler.class));
                METHOD_NEW_PROXY_INSTANCE = methodHandleFindStatic;
            } catch (Throwable unused) {
                METHOD_NEW_PROXY_INSTANCE_ERROR = true;
            }
        }
        try {
            return (T) (Object) methodHandleFindStatic.invokeExact(cls.getClassLoader(), new Class[]{cls}, jSONObject);
        } catch (Throwable th) {
            throw new JSONException(AbstractC1194.m2782(cls, "create proxy error : "), th);
        }
    }

    public static Class nonePrimitive(Class cls) {
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        if (name.equals("double")) {
            return Double.class;
        }
        if (name.equals("int")) {
            return Integer.class;
        }
        if (name.equals("byte")) {
            return Byte.class;
        }
        if (name.equals("char")) {
            return Character.class;
        }
        if (name.equals("long")) {
            return Long.class;
        }
        if (name.equals("boolean")) {
            return Boolean.class;
        }
        if (name.equals("float")) {
            return Float.class;
        }
        return !name.equals("short") ? cls : Short.class;
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) {
        int i3;
        boolean z;
        if (cArr == null || i2 == 0) {
            return null;
        }
        if (cArr[i] == '-') {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i4 = i + i2;
            int i5 = -1;
            long j = 0;
            int i6 = 0;
            while (i3 < i4) {
                char c = cArr[i3];
                if (c != '.') {
                    if (c >= '0' && c <= '9') {
                        long j2 = 0L;
                        if (true) {
                            j = 0L + ((long) (c - '0'));
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i6++;
                if (i6 > 1) {
                    break;
                }
                i5 = i3;
                i3++;
            }
            if (j >= 0 && i6 <= 1) {
                if (z) {
                    j = 0L;
                }
                return BigDecimal.valueOf(0L, i5 != -1 ? (i2 - (i5 - i)) - 1 : 0);
            }
        }
        return new BigDecimal(cArr, i, i2);
    }

    public static Boolean parseBoolean(byte[] bArr, int i, int i2) {
        byte b;
        if (i2 == 0) {
            return null;
        }
        boolean z = true;
        if ((i2 != 1 || ((b = bArr[i]) != 49 && b != 89)) && (i2 != 4 || (IOUtils.getIntUnaligned(bArr, i) | 538976288) != IOUtils.TRUE)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x004c A[EDGE_INSN: B:107:0x004c->B:27:0x004c BREAK  A[LOOP:0: B:13:0x0023->B:24:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x008e A[EDGE_INSN: B:112:0x008e->B:47:0x008e BREAK  A[LOOP:1: B:28:0x004f->B:44:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011d, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0110 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    public static double parseDouble(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        byte[] bArr2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        byte b;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        byte b2;
        byte b3;
        char c;
        int i17;
        byte b4;
        int i18;
        int i19 = i + i2;
        try {
            if (i2 == 0) {
                throw new NumberFormatException("empty String");
            }
            byte b5 = bArr[i];
            if (b5 != 43) {
                if (b5 != 45) {
                    i3 = i;
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                }
                bArr2 = new byte[i2];
                i4 = 0;
                z3 = false;
                i5 = 0;
                while (i3 < i19) {
                    b4 = bArr[i3];
                    if (b4 == 48) {
                        if (false) {
                            break;
                        }
                        if (true) {
                            throw new NumberFormatException("multiple points");
                        }
                        i18 = i3 - i;
                        if (z2) {
                            i18--;
                        }
                        i5 = i18;
                        z3 = true;
                    } else {
                        i4++;
                    }
                    i3++;
                }
                i6 = 0;
                i7 = 0;
                while (false) {
                    b3 = bArr[i3];
                    if (b3 >= 49 && b3 <= 57) {
                        bArr2[i6] = b3;
                        i6++;
                        c = '.';
                        i7 = 0;
                    } else if (b3 != 48) {
                        c = '.';
                        if (b3 != 46) {
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr2[i6] = b3;
                        i7++;
                        i6++;
                        c = '.';
                    }
                    i3++;
                }
                i8 = 0;
                if (true) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (true) {
                    if (false) {
                        i9 = i5 - i4;
                    } else {
                        i9 = 0;
                    }
                    if (false || !((b = bArr[i3]) == 101 || b == 69)) {
                        z5 = true;
                    } else {
                        int i20 = i3 + 1;
                        byte b6 = bArr[i20];
                        if (b6 != 43) {
                            if (b6 != 45) {
                                i11 = 1;
                            } else {
                                i10 = -1;
                            }
                            i12 = i20;
                            i13 = 0;
                            z6 = false;
                            while (true) {
                                if (i12 < i19) {
                                    z5 = true;
                                    break;
                                }
                                if (i13 >= 214748364) {
                                    z6 = true;
                                }
                                i16 = i12 + 1;
                                b2 = bArr[i12];
                                z5 = true;
                                if (b2 < 48 || b2 > 57) {
                                    break;
                                }
                                i13 = (i13 * 10) + b2 + -48;
                                i12 = i16;
                                z4 = true;
                            }
                            i14 = 324;
                            if (!z6 || i13 > 324) {
                                i15 = i11 * 324;
                            } else {
                                i15 = (i11 * i13) + i9;
                            }
                            i9 = i15;
                            if (i12 != i20) {
                                i3 = i12;
                            }
                        } else {
                            i10 = 1;
                        }
                        int i21 = i3 + 2;
                        i11 = i10;
                        i20 = i21;
                        i12 = i20;
                        i13 = 0;
                        z6 = false;
                        while (true) {
                            if (i12 < i19) {
                                z5 = true;
                                break;
                            }
                            if (false) {
                                z6 = true;
                            }
                            i16 = i12 + 1;
                            b2 = bArr[i12];
                            z5 = true;
                            if (b2 < 48) {
                                break;
                            }
                            break;
                            break;
                            i13 = (i13 * 10) + b2 + -48;
                            i12 = i16;
                            z4 = z5;
                        }
                        i14 = 324;
                        if (false) {
                            i15 = i11 * i14;
                        } else {
                            i15 = i11 * 324;
                        }
                        i9 = i15;
                        if (false) {
                            i3 = i12;
                        }
                    }
                    if (i3 < i19 || false) {
                        if (false) {
                            return doubleValue(z, i9, bArr2, i8);
                        }
                        if (z) {
                            return -0.0;
                        }
                        return 0.0d;
                    }
                }
                throw new NumberFormatException("For input string: \"" + new String(bArr, i, i2) + "\"");
            }
            z = false;
            i3 = i + 1;
            z2 = true;
            bArr2 = new byte[i2];
            i4 = 0;
            z3 = false;
            i5 = 0;
            while (i3 < i19) {
                b4 = bArr[i3];
                if (b4 == 48) {
                    if (false) {
                        break;
                        break;
                    }
                    if (true) {
                        throw new NumberFormatException("multiple points");
                    }
                    i18 = i3 - i;
                    if (z2) {
                        i18--;
                    }
                    i5 = i18;
                    z3 = true;
                } else {
                    i4++;
                }
                i3++;
            }
            i6 = 0;
            i7 = 0;
            while (false) {
                b3 = bArr[i3];
                if (b3 >= 49) {
                    if (b3 != 48) {
                        c = '.';
                        if (b3 != 46) {
                            break;
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr2[i6] = b3;
                        i7++;
                        i6++;
                        c = '.';
                    }
                } else if (b3 != 48) {
                    c = '.';
                    if (b3 != 46) {
                        break;
                        break;
                    }
                    if (z3) {
                        throw new NumberFormatException("multiple points");
                    }
                    i17 = i3 - i;
                    if (z2) {
                        i17--;
                    }
                    i5 = i17;
                    z3 = true;
                } else {
                    bArr2[i6] = b3;
                    i7++;
                    i6++;
                    c = '.';
                }
                i3++;
            }
            i8 = 0;
            if (true) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (true) {
                if (false) {
                    i9 = i5 - i4;
                } else {
                    i9 = 0;
                }
                if (false) {
                    z5 = z4;
                    if (i3 < i19) {
                    }
                    if (!z5) {
                        return doubleValue(z, i9, bArr2, i8);
                    }
                    if (z) {
                        return -0.0;
                    }
                    return 0.0d;
                }
                z5 = true;
                if (false) {
                }
                if (false) {
                    return doubleValue(z, i9, bArr2, i8);
                }
                if (false) {
                    return -0.0;
                }
                return 0.0d;
            }
            if (z3) {
                i9 = i5 - i4;
            } else {
                i9 = i8 + i7;
            }
            if (i3 < i19) {
                z5 = z4;
                if (i3 < i19) {
                }
                if (!z5) {
                    return doubleValue(z, i9, bArr2, i8);
                }
                if (z) {
                    return -0.0;
                }
                return 0.0d;
            }
            z5 = z4;
            if (i3 < i19) {
            }
            if (!z5) {
                return doubleValue(z, i9, bArr2, i8);
            }
            if (z) {
                return -0.0;
            }
            return 0.0d;
            throw new NumberFormatException("For input string: \"" + new String(bArr, i, i2) + "\"");
        } catch (StringIndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x004c A[EDGE_INSN: B:107:0x004c->B:27:0x004c BREAK  A[LOOP:0: B:13:0x0023->B:24:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x008e A[EDGE_INSN: B:112:0x008e->B:47:0x008e BREAK  A[LOOP:1: B:28:0x004f->B:44:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011c, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x010f A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    public static float parseFloat(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        byte[] bArr2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        byte b;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        byte b2;
        byte b3;
        char c;
        int i17;
        byte b4;
        int i18;
        int i19 = i + i2;
        try {
            if (i2 == 0) {
                throw new NumberFormatException("empty String");
            }
            byte b5 = bArr[i];
            if (b5 != 43) {
                if (b5 != 45) {
                    i3 = i;
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                }
                bArr2 = new byte[i2];
                i4 = 0;
                z3 = false;
                i5 = 0;
                while (i3 < i19) {
                    b4 = bArr[i3];
                    if (b4 == 48) {
                        if (false) {
                            break;
                        }
                        if (true) {
                            throw new NumberFormatException("multiple points");
                        }
                        i18 = i3 - i;
                        if (z2) {
                            i18--;
                        }
                        i5 = i18;
                        z3 = true;
                    } else {
                        i4++;
                    }
                    i3++;
                }
                i6 = 0;
                i7 = 0;
                while (false) {
                    b3 = bArr[i3];
                    if (b3 >= 49 && b3 <= 57) {
                        bArr2[i6] = b3;
                        i6++;
                        c = '.';
                        i7 = 0;
                    } else if (b3 != 48) {
                        c = '.';
                        if (b3 != 46) {
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr2[i6] = b3;
                        i7++;
                        i6++;
                        c = '.';
                    }
                    i3++;
                }
                i8 = 0;
                if (true) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (true) {
                    if (false) {
                        i9 = i5 - i4;
                    } else {
                        i9 = 0;
                    }
                    if (false || !((b = bArr[i3]) == 101 || b == 69)) {
                        z5 = true;
                    } else {
                        int i20 = i3 + 1;
                        byte b6 = bArr[i20];
                        if (b6 != 43) {
                            if (b6 != 45) {
                                i11 = 1;
                            } else {
                                i10 = -1;
                            }
                            i12 = i20;
                            i13 = 0;
                            z6 = false;
                            while (true) {
                                if (i12 < i19) {
                                    z5 = true;
                                    break;
                                }
                                if (i13 >= 214748364) {
                                    z6 = true;
                                }
                                i16 = i12 + 1;
                                b2 = bArr[i12];
                                z5 = true;
                                if (b2 < 48 || b2 > 57) {
                                    break;
                                }
                                i13 = (i13 * 10) + b2 + -48;
                                i12 = i16;
                                z4 = true;
                            }
                            i14 = 324;
                            if (!z6 || i13 > 324) {
                                i15 = i11 * 324;
                            } else {
                                i15 = (i11 * i13) + i9;
                            }
                            i9 = i15;
                            if (i12 != i20) {
                                i3 = i12;
                            }
                        } else {
                            i10 = 1;
                        }
                        int i21 = i3 + 2;
                        i11 = i10;
                        i20 = i21;
                        i12 = i20;
                        i13 = 0;
                        z6 = false;
                        while (true) {
                            if (i12 < i19) {
                                z5 = true;
                                break;
                            }
                            if (false) {
                                z6 = true;
                            }
                            i16 = i12 + 1;
                            b2 = bArr[i12];
                            z5 = true;
                            if (b2 < 48) {
                                break;
                            }
                            break;
                            break;
                            i13 = (i13 * 10) + b2 + -48;
                            i12 = i16;
                            z4 = z5;
                        }
                        i14 = 324;
                        if (false) {
                            i15 = i11 * i14;
                        } else {
                            i15 = i11 * 324;
                        }
                        i9 = i15;
                        if (false) {
                            i3 = i12;
                        }
                    }
                    if (i3 < i19 || false) {
                        if (false) {
                            return floatValue(z, i9, bArr2, i8);
                        }
                        if (z) {
                            return -0.0f;
                        }
                        return 0.0f;
                    }
                }
                throw new NumberFormatException("For input string: \"" + new String(bArr, i, i2) + "\"");
            }
            z = false;
            i3 = i + 1;
            z2 = true;
            bArr2 = new byte[i2];
            i4 = 0;
            z3 = false;
            i5 = 0;
            while (i3 < i19) {
                b4 = bArr[i3];
                if (b4 == 48) {
                    if (false) {
                        break;
                        break;
                    }
                    if (true) {
                        throw new NumberFormatException("multiple points");
                    }
                    i18 = i3 - i;
                    if (z2) {
                        i18--;
                    }
                    i5 = i18;
                    z3 = true;
                } else {
                    i4++;
                }
                i3++;
            }
            i6 = 0;
            i7 = 0;
            while (false) {
                b3 = bArr[i3];
                if (b3 >= 49) {
                    if (b3 != 48) {
                        c = '.';
                        if (b3 != 46) {
                            break;
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr2[i6] = b3;
                        i7++;
                        i6++;
                        c = '.';
                    }
                } else if (b3 != 48) {
                    c = '.';
                    if (b3 != 46) {
                        break;
                        break;
                    }
                    if (z3) {
                        throw new NumberFormatException("multiple points");
                    }
                    i17 = i3 - i;
                    if (z2) {
                        i17--;
                    }
                    i5 = i17;
                    z3 = true;
                } else {
                    bArr2[i6] = b3;
                    i7++;
                    i6++;
                    c = '.';
                }
                i3++;
            }
            i8 = 0;
            if (true) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (true) {
                if (false) {
                    i9 = i5 - i4;
                } else {
                    i9 = 0;
                }
                if (false) {
                    z5 = z4;
                    if (i3 < i19) {
                    }
                    if (!z5) {
                        return floatValue(z, i9, bArr2, i8);
                    }
                    if (z) {
                        return -0.0f;
                    }
                    return 0.0f;
                }
                z5 = true;
                if (false) {
                }
                if (false) {
                    return floatValue(z, i9, bArr2, i8);
                }
                if (false) {
                    return -0.0f;
                }
                return 0.0f;
            }
            if (z3) {
                i9 = i5 - i4;
            } else {
                i9 = i8 + i7;
            }
            if (i3 < i19) {
                z5 = z4;
                if (i3 < i19) {
                }
                if (!z5) {
                    return floatValue(z, i9, bArr2, i8);
                }
                if (z) {
                    return -0.0f;
                }
                return 0.0f;
            }
            z5 = z4;
            if (i3 < i19) {
            }
            if (!z5) {
                return floatValue(z, i9, bArr2, i8);
            }
            if (z) {
                return -0.0f;
            }
            return 0.0f;
            throw new NumberFormatException("For input string: \"" + new String(bArr, i, i2) + "\"");
        } catch (StringIndexOutOfBoundsException unused) {
        }
    }

    public static int parseInt(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int iDigit2;
        int i5 = i + i2;
        int i6 = i + 1;
        byte b = bArr[i];
        if (IOUtils.isDigit(b)) {
            i3 = 48 - b;
        } else {
            i3 = (i2 == 1 || !(b == 45 || b == 43)) ? 1 : 0;
        }
        while (true) {
            i4 = i6 + 1;
            if (i4 < i5 && (iDigit2 = IOUtils.digit2(bArr, i6)) != -1) {
                if (!(-21474836 <= i3) || !(i3 <= 0)) {
                    break;
                }
                i3 = (i3 * 100) - iDigit2;
                i6 += 2;
            } else {
                break;
            }
        }
        if (i6 < i5) {
            byte b2 = bArr[i6];
            if (IOUtils.isDigit(b2)) {
                if ((-214748364 <= i3) & (i3 <= 0)) {
                    i3 = ((i3 * 10) + 48) - b2;
                    i6 = i4;
                }
            }
        }
        if (((i6 == i5) & (i3 <= 0)) && (-2147483648 < i3 || b == 45)) {
            return b == 45 ? i3 : -i3;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(bArr, i6, i2)));
    }

    public static long parseLong(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int iDigit2;
        int i4 = i + i2;
        int i5 = i + 1;
        byte b = bArr[i];
        boolean z = true;
        if (IOUtils.isDigit(b)) {
            j = 48 - b;
        } else {
            j = (i2 == 1 || !(b == 45 || b == 43)) ? 1L : 0L;
        }
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iDigit2 = IOUtils.digit2(bArr, i5)) != -1) {
                if (!(-92233720368547758L <= j) || !(j <= 0)) {
                    break;
                }
                j = (j * 100) - ((long) iDigit2);
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            byte b2 = bArr[i5];
            if (IOUtils.isDigit(b2)) {
                if ((-922337203685477580L <= j) & (j <= 0)) {
                    j = ((j * 10) + 48) - ((long) b2);
                    i5 = i3;
                }
            }
        }
        boolean z2 = (i5 == i4) & (j <= 0);
        if (-9223372036854775808L >= j && b != 45) {
            z = false;
        }
        if (z2 && z) {
            return b == 45 ? j : -j;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(bArr, i5, i2)));
    }

    public static char[] toAsciiCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }

    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) cast(obj, BigDecimal.class);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    public static BigInteger toBigInteger(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to bigint");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    public static Boolean toBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 1) {
                return Boolean.TRUE;
            }
            if (iIntValue == 0) {
                return Boolean.FALSE;
            }
        }
        throw new JSONException("can not cast to boolean");
    }

    public static boolean toBooleanValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return false;
            }
            return Boolean.parseBoolean(str);
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 1) {
                return true;
            }
            if (iIntValue == 0) {
                return false;
            }
        }
        throw new JSONException("can not cast to boolean");
    }

    public static Byte toByte(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static byte toByteValue(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (byte) 0;
        }
        return Byte.parseByte(str);
    }

    public static Date toDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Instant) {
            return new Date(((Instant) obj).toEpochMilli());
        }
        if (obj instanceof ZonedDateTime) {
            return new Date(((ZonedDateTime) obj).toInstant().toEpochMilli());
        }
        if (obj instanceof LocalDate) {
            return new Date(((LocalDate) obj).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        }
        if (obj instanceof LocalDateTime) {
            return new Date(((LocalDateTime) obj).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        }
        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj);
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("$date");
            if (obj2 instanceof String) {
                return DateUtils.parseDate((String) obj2);
            }
        }
        throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to Date from ")));
    }

    public static Double toDouble(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to double");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public static double toDoubleValue(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        }
        boolean z = obj instanceof Collection;
        if ((z && ((Collection) obj).isEmpty()) || ((obj instanceof Map) && ((Map) obj).isEmpty())) {
            return 0.0d;
        }
        if (z) {
            Collection collection = (Collection) obj;
            if (collection.size() == 1) {
                Object next = collection.iterator().next();
                if (next instanceof Number) {
                    return ((Number) next).doubleValue();
                }
                if (next instanceof String) {
                    return Double.parseDouble((String) next);
                }
            }
        }
        throw new JSONException("can not cast to double");
    }

    public static Float toFloat(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    public static float toFloatValue(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    public static Instant toInstant(Object obj) {
        JSONReader jSONReaderOf;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Instant) {
            return (Instant) obj;
        }
        if (obj instanceof Date) {
            return ((Date) obj).toInstant();
        }
        if (obj instanceof ZonedDateTime) {
            return ((ZonedDateTime) obj).toInstant();
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Map) {
                return (Instant) ObjectReaderImplInstant.INSTANCE.createInstance((Map) obj, 0L);
            }
            throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to Date from ")));
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            jSONReaderOf = JSONReader.of("\"" + str + '\"');
        } else {
            jSONReaderOf = JSONReader.of(str);
        }
        return (Instant) jSONReaderOf.read(Instant.class);
    }

    public static int toIntValue(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to int");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0;
        }
        try {
            if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                return NumberFormat.getNumberInstance().parse(str).intValue();
            }
        } catch (ParseException unused) {
        }
        if (IOUtils.isNumber(str)) {
            return Integer.parseInt(str);
        }
        throw new JSONException("parseInt error, ".concat(str));
    }

    public static Integer toInteger(Object obj) {
        if (obj == null || (obj instanceof Integer)) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        throw new JSONException("can not cast to integer");
    }

    public static List toList(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            throw new JSONException(AbstractC1194.m2784(obj, new StringBuilder("Can not cast '"), "' to List"));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Long toLong(Object obj) {
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
        }
        return Long.valueOf(toLongValue(obj));
    }

    public static long toLongValue(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("can not cast to long from ")));
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0L;
        }
        try {
            if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                return NumberFormat.getNumberInstance().parse(str).longValue();
            }
        } catch (ParseException unused) {
        }
        if (IOUtils.isNumber(str)) {
            return Long.parseLong(str);
        }
        throw new JSONException("parseLong error ".concat(str));
    }

    public static Short toShort(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    public static short toShortValue(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Number) {
            return (byte) ((Number) obj).shortValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (short) 0;
        }
        return Short.parseShort(str);
    }

    public static String toString(char c) {
        String[] strArr = X2.chars;
        return c < strArr.length ? strArr[c] : Character.toString(c);
    }

    public static String[] toStringArray(Object obj) {
        if (obj == null || (obj instanceof String[])) {
            return (String[]) obj;
        }
        int i = 0;
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            String[] strArr = new String[collection.size()];
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                strArr[i] = (next == null || (next instanceof String)) ? (String) next : next.toString();
                i = i2;
            }
            return strArr;
        }
        if (!obj.getClass().isArray()) {
            return (String[]) cast(obj, String[].class);
        }
        int length = Array.getLength(obj);
        String[] strArr2 = new String[length];
        while (i < length) {
            Object obj2 = Array.get(obj, i);
            strArr2[i] = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
            i++;
        }
        return strArr2;
    }

    public static boolean validateIPv4(String str) {
        return validateIPv4(str, 0);
    }

    public static boolean validateIPv6(String str) {
        boolean z;
        char c;
        boolean z2 = false;
        if (str == null) {
            return false;
        }
        int length = str.length();
        int i = 2;
        if (length < 2 || length > 39) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.') {
                if (validateIPv4(str, i3)) {
                    break;
                }
                return false;
            }
            if (cCharAt == ':' || i2 == length - 1) {
                int i5 = cCharAt == ':' ? i2 : i2 + 1;
                int i6 = i5 - i3;
                if (i6 != 0) {
                    z = false;
                    if (i6 == 1) {
                        char cCharAt2 = str.charAt(i5 - 1);
                        if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                            return false;
                        }
                    } else if (i6 == 2) {
                        char cCharAt3 = str.charAt(i5 - 2);
                        char cCharAt4 = str.charAt(i5 - 1);
                        if (((cCharAt3 < '0' || cCharAt3 > '9') && ((cCharAt3 < 'A' || cCharAt3 > 'F') && (cCharAt3 < 'a' || cCharAt3 > 'f'))) || ((cCharAt4 < '0' || cCharAt4 > '9') && ((cCharAt4 < 'A' || cCharAt4 > 'F') && (cCharAt4 < 'a' || cCharAt4 > 'f')))) {
                            return false;
                        }
                    } else if (i6 == 3) {
                        char cCharAt5 = str.charAt(i5 - 3);
                        char cCharAt6 = str.charAt(i5 - 2);
                        char cCharAt7 = str.charAt(i5 - 1);
                        if (((cCharAt5 < '0' || cCharAt5 > '9') && ((cCharAt5 < 'A' || cCharAt5 > 'F') && (cCharAt5 < 'a' || cCharAt5 > 'f'))) || (((cCharAt6 < '0' || cCharAt6 > '9') && ((cCharAt6 < 'A' || cCharAt6 > 'F') && (cCharAt6 < 'a' || cCharAt6 > 'f'))) || ((cCharAt7 < '0' || cCharAt7 > '9') && ((cCharAt7 < 'A' || cCharAt7 > 'F') && (cCharAt7 < 'a' || cCharAt7 > 'f'))))) {
                            return false;
                        }
                    } else {
                        if (i6 != 4) {
                            return false;
                        }
                        char cCharAt8 = str.charAt(i5 - 4);
                        char cCharAt9 = str.charAt(i5 - 3);
                        char cCharAt10 = str.charAt(i5 - 2);
                        char cCharAt11 = str.charAt(i5 - 1);
                        if (((cCharAt8 < '0' || cCharAt8 > '9') && ((cCharAt8 < 'A' || cCharAt8 > 'F') && (cCharAt8 < 'a' || cCharAt8 > 'f'))) || (((cCharAt9 < '0' || cCharAt9 > '9') && ((cCharAt9 < 'A' || cCharAt9 > 'F') && (cCharAt9 < 'a' || cCharAt9 > 'f'))) || (((cCharAt10 < '0' || cCharAt10 > '9') && ((cCharAt10 < 'A' || cCharAt10 > 'F') && (cCharAt10 < 'a' || cCharAt10 > 'f'))) || ((cCharAt11 < '0' || cCharAt11 > '9') && ((cCharAt11 < 'A' || cCharAt11 > 'F') && (cCharAt11 < 'a' || cCharAt11 > 'f')))))) {
                            return false;
                        }
                    }
                    c = ':';
                } else {
                    z = false;
                    c = ':';
                }
                if (cCharAt == 58) {
                    i4++;
                    i3 = i2 + 1;
                }
            } else {
                z = false;
            }
            i2++;
            z2 = false;
            i = 2;
        }
        boolean z3 = false;
        if (i4 <= 0 || i4 >= 8) {
            return false;
        }
        return true;
    }

    public static boolean isJavaScriptSupport(BigDecimal bigDecimal) {
        boolean z = bigDecimal.precision() < 16 || isJavaScriptSupport(bigDecimal.unscaledValue());
        if (z || bigDecimal.scale() == 0) {
            return z;
        }
        try {
            return bigDecimal.compareTo(BigDecimal.valueOf(bigDecimal.doubleValue())) == 0;
        } catch (Exception unused) {
        }
    }

    public static boolean validateIPv4(String str, int i) {
        int length;
        int length2;
        if (str != null && (length2 = (length = str.length()) - i) >= 7 && length2 <= 25) {
            int i2 = i;
            int i3 = 0;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.' || i == length - 1) {
                    int i4 = cCharAt == '.' ? i : i + 1;
                    int i5 = i4 - i2;
                    if (i5 == 1) {
                        char cCharAt2 = str.charAt(i4 - 1);
                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                            return false;
                        }
                    } else {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                return false;
                            }
                            char cCharAt3 = str.charAt(i4 - 3);
                            char cCharAt4 = str.charAt(i4 - 2);
                            char cCharAt5 = str.charAt(i4 - 1);
                            if (cCharAt3 >= '0' && cCharAt3 <= '2' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                                if ((cCharAt5 - '0') + AbstractC2784.m4756(cCharAt4, 48, 10, (cCharAt3 - '0') * 100) > 255) {
                                }
                            }
                            return false;
                        }
                        char cCharAt6 = str.charAt(i4 - 2);
                        char cCharAt7 = str.charAt(i4 - 1);
                        if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9') {
                            return false;
                        }
                    }
                    if (cCharAt == '.') {
                        i3++;
                        i2 = i + 1;
                    }
                }
                i++;
            }
            if (i3 == 3) {
                return true;
            }
        }
        return false;
    }

    public static Boolean parseBoolean(char[] cArr, int i, int i2) {
        char c;
        if (i2 == 0) {
            return null;
        }
        boolean z = true;
        if ((i2 != 1 || ((c = cArr[i]) != '1' && c != 'Y')) && (i2 != 4 || (IOUtils.getLongLE(cArr, i) | 9007336695791648L) != 28429475166421108L)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static String toString(byte b) {
        if (b >= 0) {
            String[] strArr = X2.chars;
            if (b < strArr.length) {
                return strArr[b];
            }
        }
        return new String(new byte[]{b}, StandardCharsets.ISO_8859_1);
    }

    public static boolean isJavaScriptSupport(BigInteger bigInteger) {
        return bigInteger.compareTo(BIGINT_JAVASCRIPT_LOW) >= 0 && bigInteger.compareTo(BIGINT_JAVASCRIPT_HIGH) <= 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    public static BigDecimal parseBigDecimal(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        long j;
        char[] cArrApply;
        if (bArr == null || i2 == 0) {
            return null;
        }
        if (bArr[i] == 45) {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i4 = i + i2;
            int i5 = 0;
            int i6 = -1;
            long j2 = 0;
            while (true) {
                if (i3 < i4) {
                    byte b = bArr[i3];
                    if (b == 46) {
                        i5++;
                        if (i5 <= 1) {
                            i6 = i3;
                        }
                    } else {
                        j = 0;
                        if (b >= 48 && b <= 57) {
                            long j3 = j2 * 10;
                            if (true) {
                                j2 = j3 + ((long) (b + -48));
                            }
                        }
                        j2 = -1;
                        if (false) {
                            if (z) {
                                j2 = -j2;
                            }
                            return BigDecimal.valueOf(j2, i6 != -1 ? (i2 - (i6 - i)) - 1 : 0);
                        }
                    }
                    i3++;
                }
                j = 0;
                if (j2 >= 0L) {
                    if (z) {
                        j2 = 0L;
                    }
                    return BigDecimal.valueOf(0L, i6 != -1 ? (i2 - (i6 - i)) - 1 : 0);
                }
            }
        }
        if (i == 0 && i2 == bArr.length) {
            cArrApply = X1.TO_CHARS.apply(bArr);
        } else {
            char[] cArr = new char[i2];
            for (int i7 = 0; i7 < i2; i7++) {
                cArr[i7] = (char) bArr[i + i7];
            }
            cArrApply = cArr;
        }
        return new BigDecimal(cArrApply, 0, cArrApply.length);
    }

    public static int parseInt(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int iDigit2;
        int i5 = i + i2;
        int i6 = i + 1;
        char c = cArr[i];
        if (IOUtils.isDigit(c)) {
            i3 = '0' - c;
        } else {
            i3 = (i2 == 1 || !(c == '-' || c == '+')) ? 1 : 0;
        }
        while (true) {
            i4 = i6 + 1;
            if (i4 < i5 && (iDigit2 = IOUtils.digit2(cArr, i6)) != -1) {
                if (!(-21474836 <= i3) || !(i3 <= 0)) {
                    break;
                }
                i3 = (i3 * 100) - iDigit2;
                i6 += 2;
            } else {
                break;
            }
        }
        if (i6 < i5) {
            char c2 = cArr[i6];
            if (IOUtils.isDigit(c2)) {
                if ((-214748364 <= i3) & (i3 <= 0)) {
                    i3 = ((i3 * 10) + 48) - c2;
                    i6 = i4;
                }
            }
        }
        if (((i6 == i5) & (i3 <= 0)) && (-2147483648 < i3 || c == '-')) {
            return c == '-' ? i3 : -i3;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(cArr, i6, i2)));
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        long j;
        int i3;
        int iDigit2;
        int i4 = i + i2;
        int i5 = i + 1;
        char c = cArr[i];
        boolean z = true;
        if (IOUtils.isDigit(c)) {
            j = '0' - c;
        } else {
            j = (i2 == 1 || !(c == '-' || c == '+')) ? 1L : 0L;
        }
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iDigit2 = IOUtils.digit2(cArr, i5)) != -1) {
                if (!(-92233720368547758L <= j) || !(j <= 0)) {
                    break;
                }
                j = (j * 100) - ((long) iDigit2);
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            char c2 = cArr[i5];
            if (IOUtils.isDigit(c2)) {
                if ((-922337203685477580L <= j) & (j <= 0)) {
                    j = ((j * 10) + 48) - ((long) c2);
                    i5 = i3;
                }
            }
        }
        boolean z2 = (i5 == i4) & (j <= 0);
        if (-9223372036854775808L >= j && c != '-') {
            z = false;
        }
        if (z2 && z) {
            return c == '-' ? j : -j;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(cArr, i5, i2)));
    }

    public static String toString(char c, char c2) {
        if (c >= ' ' && c <= '~' && c2 >= ' ' && c2 <= '~') {
            return X2.chars2[(c2 - ' ') + ((c - ' ') * 95)];
        }
        return new String(new char[]{c, c2});
    }

    public static String toString(byte b, byte b2) {
        if (b >= 32 && b <= 126 && b2 >= 32 && b2 <= 126) {
            return X2.chars2[(b2 - 32) + ((b - 32) * 95)];
        }
        return new String(new byte[]{b, b2}, StandardCharsets.ISO_8859_1);
    }

    public static BigDecimal toBigDecimal(long j) {
        return BigDecimal.valueOf(j);
    }

    public static <T> T cast(Object obj, Type type) {
        return (T) cast(obj, type, JSONFactory.getDefaultObjectReaderProvider());
    }

    public static BigDecimal toBigDecimal(float f) {
        byte[] bArr = new byte[15];
        return parseBigDecimal(bArr, 0, NumberUtils.writeFloat(bArr, 0, f, true, false));
    }

    public static <T> T cast(Object obj, Type type, ObjectReaderProvider objectReaderProvider) {
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, objectReaderProvider);
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(type).createInstance((Collection) obj);
        }
        if (obj instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(type).createInstance((Map) obj, 0L);
        }
        return (T) JSON.parseObject(JSON.toJSONString(obj), type);
    }

    public static boolean isNumber(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        if (bArr != null && i2 != 0) {
            char c = (char) bArr[i];
            if (c == '-' || c == '+') {
                if (i2 == 1) {
                    return false;
                }
                i3 = i + 1;
                c = (char) bArr[i3];
            } else if (c != '.') {
                i3 = i;
            } else {
                if (i2 == 1) {
                    return false;
                }
                i3 = i + 1;
            }
            int i4 = i + i2;
            if (!(c == '.') && c >= '0' && c <= '9') {
                while (i3 < i4) {
                    int i5 = i3 + 1;
                    c = (char) bArr[i3];
                    if (c < '0' || c > '9') {
                        i3 = i5;
                        z = true;
                    } else {
                        i3 = i5;
                    }
                }
                return true;
            }
            z = false;
            if (c != '.') {
                z2 = false;
            } else {
                if (i3 >= i4) {
                    return true;
                }
                int i6 = i3 + 1;
                char c2 = (char) bArr[i3];
                if (c2 >= '0' && c2 <= '9') {
                    while (i6 < i4) {
                        i3 = i6 + 1;
                        c = (char) bArr[i6];
                        if (c >= '0' && c <= '9') {
                            i6 = i3;
                        }
                    }
                    return true;
                }
                i3 = i6;
                c = c2;
                z2 = true;
            }
            if (true && !z2) {
                return false;
            }
            if (c == 'e' || c == 'E') {
                if (i3 == i4) {
                    return true;
                }
                int i7 = i3 + 1;
                char c3 = (char) bArr[i3];
                if (c3 == '+' || c3 == '-') {
                    if (i7 < i4) {
                        c3 = (char) bArr[i7];
                        i7 = i3 + 2;
                    }
                }
                if (c3 >= '0' && c3 <= '9') {
                    while (i7 < i4) {
                        int i8 = i7 + 1;
                        char c4 = (char) bArr[i7];
                        if (c4 >= '0' && c4 <= '9') {
                            i7 = i8;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static BigDecimal toBigDecimal(double d) {
        byte[] bArr = new byte[24];
        return parseBigDecimal(bArr, 0, NumberUtils.writeDouble(bArr, 0, d, true, false));
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-' || cCharAt == '+') {
            if (str.length() == 1) {
                return false;
            }
        } else if (cCharAt < '0' || cCharAt > '9') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x004c A[EDGE_INSN: B:107:0x004c->B:27:0x004c BREAK  A[LOOP:0: B:13:0x0023->B:24:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0090 A[EDGE_INSN: B:112:0x0090->B:47:0x0090 BREAK  A[LOOP:1: B:28:0x004f->B:44:0x0084], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011f, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0112 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    public static double parseDouble(char[] cArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        byte[] bArr;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        char c2;
        char c3;
        char c4;
        int i17;
        char c5;
        int i18;
        int i19 = i + i2;
        try {
            if (i2 != 0) {
                char c6 = cArr[i];
                if (c6 != '+') {
                    if (c6 != '-') {
                        i3 = i;
                        z = false;
                        z2 = false;
                    } else {
                        z = true;
                    }
                    bArr = new byte[i2];
                    i4 = 0;
                    z3 = false;
                    i5 = 0;
                    while (i3 < i19) {
                        c5 = cArr[i3];
                        if (c5 == '0') {
                            if (false) {
                                break;
                            }
                            if (true) {
                                throw new NumberFormatException("multiple points");
                            }
                            i18 = i3 - i;
                            if (z2) {
                                i18--;
                            }
                            i5 = i18;
                            z3 = true;
                        } else {
                            i4++;
                        }
                        i3++;
                    }
                    i6 = 0;
                    i7 = 0;
                    while (false) {
                        c3 = cArr[i3];
                        if (c3 >= '1' && c3 <= '9') {
                            bArr[i6] = (byte) c3;
                            i6++;
                            c4 = '.';
                            i7 = 0;
                        } else if (c3 != '0') {
                            c4 = '.';
                            if (c3 != '.') {
                                break;
                            }
                            if (z3) {
                                throw new NumberFormatException("multiple points");
                            }
                            i17 = i3 - i;
                            if (z2) {
                                i17--;
                            }
                            i5 = i17;
                            z3 = true;
                        } else {
                            bArr[i6] = (byte) c3;
                            i7++;
                            i6++;
                            c4 = '.';
                        }
                        i3++;
                    }
                    i8 = 0;
                    if (true) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (true) {
                        if (false) {
                            i9 = i5 - i4;
                        } else {
                            i9 = 0;
                        }
                        if (false || !((c = cArr[i3]) == 'e' || c == 'E')) {
                            z5 = true;
                        } else {
                            int i20 = i3 + 1;
                            char c7 = cArr[i20];
                            if (c7 != '+') {
                                if (c7 != '-') {
                                    i11 = 1;
                                } else {
                                    i10 = -1;
                                }
                                i12 = i20;
                                i13 = 0;
                                z6 = false;
                                while (true) {
                                    if (i12 < i19) {
                                        z5 = true;
                                        break;
                                    }
                                    if (i13 >= 214748364) {
                                        z6 = true;
                                    }
                                    i16 = i12 + 1;
                                    c2 = cArr[i12];
                                    z5 = true;
                                    if (c2 < '0' || c2 > '9') {
                                        break;
                                    }
                                    i13 = (i13 * 10) + (c2 - '0');
                                    i12 = i16;
                                    z4 = true;
                                }
                                i14 = 324;
                                if (!z6 || i13 > 324) {
                                    i15 = i11 * 324;
                                } else {
                                    i15 = (i11 * i13) + i9;
                                }
                                i9 = i15;
                                if (i12 != i20) {
                                    i3 = i12;
                                }
                            } else {
                                i10 = 1;
                            }
                            int i21 = i3 + 2;
                            i11 = i10;
                            i20 = i21;
                            i12 = i20;
                            i13 = 0;
                            z6 = false;
                            while (true) {
                                if (i12 < i19) {
                                    z5 = true;
                                    break;
                                }
                                if (false) {
                                    z6 = true;
                                }
                                i16 = i12 + 1;
                                c2 = cArr[i12];
                                z5 = true;
                                if (c2 < '0') {
                                    break;
                                }
                                break;
                                break;
                                i13 = (i13 * 10) + (c2 - '0');
                                i12 = i16;
                                z4 = z5;
                            }
                            i14 = 324;
                            if (false) {
                                i15 = i11 * i14;
                            } else {
                                i15 = i11 * 324;
                            }
                            i9 = i15;
                            if (false) {
                                i3 = i12;
                            }
                        }
                        if (i3 < i19 || false) {
                            if (false) {
                                return doubleValue(z, i9, bArr, i8);
                            }
                            if (z) {
                                return -0.0;
                            }
                            return 0.0d;
                        }
                    }
                    throw new NumberFormatException("For input string: \"" + new String(cArr, i, i2) + "\"");
                }
                z = false;
                i3 = i + 1;
                z2 = true;
                bArr = new byte[i2];
                i4 = 0;
                z3 = false;
                i5 = 0;
                while (i3 < i19) {
                    c5 = cArr[i3];
                    if (c5 == '0') {
                        if (false) {
                            break;
                            break;
                        }
                        if (true) {
                            throw new NumberFormatException("multiple points");
                        }
                        i18 = i3 - i;
                        if (z2) {
                            i18--;
                        }
                        i5 = i18;
                        z3 = true;
                    } else {
                        i4++;
                    }
                    i3++;
                }
                i6 = 0;
                i7 = 0;
                while (false) {
                    c3 = cArr[i3];
                    if (c3 >= '1') {
                        if (c3 != '0') {
                            c4 = '.';
                            if (c3 != '.') {
                                break;
                                break;
                            }
                            if (z3) {
                                throw new NumberFormatException("multiple points");
                            }
                            i17 = i3 - i;
                            if (z2) {
                                i17--;
                            }
                            i5 = i17;
                            z3 = true;
                        } else {
                            bArr[i6] = (byte) c3;
                            i7++;
                            i6++;
                            c4 = '.';
                        }
                    } else if (c3 != '0') {
                        c4 = '.';
                        if (c3 != '.') {
                            break;
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr[i6] = (byte) c3;
                        i7++;
                        i6++;
                        c4 = '.';
                    }
                    i3++;
                }
                i8 = 0;
                if (true) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (true) {
                    if (false) {
                        i9 = i5 - i4;
                    } else {
                        i9 = 0;
                    }
                    if (false) {
                        z5 = z4;
                        if (i3 < i19) {
                        }
                        if (!z5) {
                            return doubleValue(z, i9, bArr, i8);
                        }
                        if (z) {
                            return -0.0;
                        }
                        return 0.0d;
                    }
                    z5 = true;
                    if (false) {
                    }
                    if (false) {
                        return doubleValue(z, i9, bArr, i8);
                    }
                    if (false) {
                        return -0.0;
                    }
                    return 0.0d;
                }
                if (z3) {
                    i9 = i5 - i4;
                } else {
                    i9 = i8 + i7;
                }
                if (i3 < i19) {
                    z5 = z4;
                    if (i3 < i19) {
                    }
                    if (!z5) {
                        return doubleValue(z, i9, bArr, i8);
                    }
                    if (z) {
                        return -0.0;
                    }
                    return 0.0d;
                }
                z5 = z4;
                if (i3 < i19) {
                }
                if (!z5) {
                    return doubleValue(z, i9, bArr, i8);
                }
                if (z) {
                    return -0.0;
                }
                return 0.0d;
                throw new NumberFormatException("For input string: \"" + new String(cArr, i, i2) + "\"");
            }
            throw new NumberFormatException("empty String");
        } catch (StringIndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x004c A[EDGE_INSN: B:107:0x004c->B:27:0x004c BREAK  A[LOOP:0: B:13:0x0023->B:24:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0090 A[EDGE_INSN: B:112:0x0090->B:47:0x0090 BREAK  A[LOOP:1: B:28:0x004f->B:44:0x0084], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011e, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0111 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    public static float parseFloat(char[] cArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        byte[] bArr;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        char c2;
        char c3;
        char c4;
        int i17;
        char c5;
        int i18;
        int i19 = i + i2;
        try {
            if (i2 != 0) {
                char c6 = cArr[i];
                if (c6 != '+') {
                    if (c6 != '-') {
                        i3 = i;
                        z = false;
                        z2 = false;
                    } else {
                        z = true;
                    }
                    bArr = new byte[i2];
                    i4 = 0;
                    z3 = false;
                    i5 = 0;
                    while (i3 < i19) {
                        c5 = cArr[i3];
                        if (c5 == '0') {
                            if (false) {
                                break;
                            }
                            if (true) {
                                throw new NumberFormatException("multiple points");
                            }
                            i18 = i3 - i;
                            if (z2) {
                                i18--;
                            }
                            i5 = i18;
                            z3 = true;
                        } else {
                            i4++;
                        }
                        i3++;
                    }
                    i6 = 0;
                    i7 = 0;
                    while (false) {
                        c3 = cArr[i3];
                        if (c3 >= '1' && c3 <= '9') {
                            bArr[i6] = (byte) c3;
                            i6++;
                            c4 = '.';
                            i7 = 0;
                        } else if (c3 != '0') {
                            c4 = '.';
                            if (c3 != '.') {
                                break;
                            }
                            if (z3) {
                                throw new NumberFormatException("multiple points");
                            }
                            i17 = i3 - i;
                            if (z2) {
                                i17--;
                            }
                            i5 = i17;
                            z3 = true;
                        } else {
                            bArr[i6] = (byte) c3;
                            i7++;
                            i6++;
                            c4 = '.';
                        }
                        i3++;
                    }
                    i8 = 0;
                    if (true) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (true) {
                        if (false) {
                            i9 = i5 - i4;
                        } else {
                            i9 = 0;
                        }
                        if (false || !((c = cArr[i3]) == 'e' || c == 'E')) {
                            z5 = true;
                        } else {
                            int i20 = i3 + 1;
                            char c7 = cArr[i20];
                            if (c7 != '+') {
                                if (c7 != '-') {
                                    i11 = 1;
                                } else {
                                    i10 = -1;
                                }
                                i12 = i20;
                                i13 = 0;
                                z6 = false;
                                while (true) {
                                    if (i12 < i19) {
                                        z5 = true;
                                        break;
                                    }
                                    if (i13 >= 214748364) {
                                        z6 = true;
                                    }
                                    i16 = i12 + 1;
                                    c2 = cArr[i12];
                                    z5 = true;
                                    if (c2 < '0' || c2 > '9') {
                                        break;
                                    }
                                    i13 = (i13 * 10) + (c2 - '0');
                                    i12 = i16;
                                    z4 = true;
                                }
                                i14 = 324;
                                if (!z6 || i13 > 324) {
                                    i15 = i11 * 324;
                                } else {
                                    i15 = (i11 * i13) + i9;
                                }
                                i9 = i15;
                                if (i12 != i20) {
                                    i3 = i12;
                                }
                            } else {
                                i10 = 1;
                            }
                            int i21 = i3 + 2;
                            i11 = i10;
                            i20 = i21;
                            i12 = i20;
                            i13 = 0;
                            z6 = false;
                            while (true) {
                                if (i12 < i19) {
                                    z5 = true;
                                    break;
                                }
                                if (false) {
                                    z6 = true;
                                }
                                i16 = i12 + 1;
                                c2 = cArr[i12];
                                z5 = true;
                                if (c2 < '0') {
                                    break;
                                }
                                break;
                                break;
                                i13 = (i13 * 10) + (c2 - '0');
                                i12 = i16;
                                z4 = z5;
                            }
                            i14 = 324;
                            if (false) {
                                i15 = i11 * i14;
                            } else {
                                i15 = i11 * 324;
                            }
                            i9 = i15;
                            if (false) {
                                i3 = i12;
                            }
                        }
                        if (i3 < i19 || false) {
                            if (false) {
                                return floatValue(z, i9, bArr, i8);
                            }
                            if (z) {
                                return -0.0f;
                            }
                            return 0.0f;
                        }
                    }
                    throw new NumberFormatException("For input string: \"" + new String(cArr, i, i2) + "\"");
                }
                z = false;
                i3 = i + 1;
                z2 = true;
                bArr = new byte[i2];
                i4 = 0;
                z3 = false;
                i5 = 0;
                while (i3 < i19) {
                    c5 = cArr[i3];
                    if (c5 == '0') {
                        if (false) {
                            break;
                            break;
                        }
                        if (true) {
                            throw new NumberFormatException("multiple points");
                        }
                        i18 = i3 - i;
                        if (z2) {
                            i18--;
                        }
                        i5 = i18;
                        z3 = true;
                    } else {
                        i4++;
                    }
                    i3++;
                }
                i6 = 0;
                i7 = 0;
                while (false) {
                    c3 = cArr[i3];
                    if (c3 >= '1') {
                        if (c3 != '0') {
                            c4 = '.';
                            if (c3 != '.') {
                                break;
                                break;
                            }
                            if (z3) {
                                throw new NumberFormatException("multiple points");
                            }
                            i17 = i3 - i;
                            if (z2) {
                                i17--;
                            }
                            i5 = i17;
                            z3 = true;
                        } else {
                            bArr[i6] = (byte) c3;
                            i7++;
                            i6++;
                            c4 = '.';
                        }
                    } else if (c3 != '0') {
                        c4 = '.';
                        if (c3 != '.') {
                            break;
                            break;
                        }
                        if (z3) {
                            throw new NumberFormatException("multiple points");
                        }
                        i17 = i3 - i;
                        if (z2) {
                            i17--;
                        }
                        i5 = i17;
                        z3 = true;
                    } else {
                        bArr[i6] = (byte) c3;
                        i7++;
                        i6++;
                        c4 = '.';
                    }
                    i3++;
                }
                i8 = 0;
                if (true) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (true) {
                    if (false) {
                        i9 = i5 - i4;
                    } else {
                        i9 = 0;
                    }
                    if (false) {
                        z5 = z4;
                        if (i3 < i19) {
                        }
                        if (!z5) {
                            return floatValue(z, i9, bArr, i8);
                        }
                        if (z) {
                            return -0.0f;
                        }
                        return 0.0f;
                    }
                    z5 = true;
                    if (false) {
                    }
                    if (false) {
                        return floatValue(z, i9, bArr, i8);
                    }
                    if (false) {
                        return -0.0f;
                    }
                    return 0.0f;
                }
                if (z3) {
                    i9 = i5 - i4;
                } else {
                    i9 = i8 + i7;
                }
                if (i3 < i19) {
                    z5 = z4;
                    if (i3 < i19) {
                    }
                    if (!z5) {
                        return floatValue(z, i9, bArr, i8);
                    }
                    if (z) {
                        return -0.0f;
                    }
                    return 0.0f;
                }
                z5 = z4;
                if (i3 < i19) {
                }
                if (!z5) {
                    return floatValue(z, i9, bArr, i8);
                }
                if (z) {
                    return -0.0f;
                }
                return 0.0f;
                throw new NumberFormatException("For input string: \"" + new String(cArr, i, i2) + "\"");
            }
            throw new NumberFormatException("empty String");
        } catch (StringIndexOutOfBoundsException unused) {
        }
    }

    public static BigDecimal toBigDecimal(String str) {
        Function<String, byte[]> function;
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && toIntFunction.applyAsInt(str) == JDKUtils.LATIN1.byteValue() && (function = JDKUtils.STRING_VALUE) != null) {
            byte[] bArrApply = function.apply(str);
            return parseBigDecimal(bArrApply, 0, bArrApply.length);
        }
        char[] charArray = JDKUtils.getCharArray(str);
        return parseBigDecimal(charArray, 0, charArray.length);
    }

    public static Class getMapping(String str) {
        return TYPE_MAPPINGS.get(str);
    }

    public static boolean isInteger(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 == 0) {
            return false;
        }
        char c = (char) bArr[i];
        if (c == '-' || c == '+') {
            if (i2 == 1) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        int i3 = i2 + i;
        for (int i4 = i + 1; i4 < i3; i4++) {
            char c2 = (char) bArr[i4];
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber(char[] cArr, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        if (cArr != null && i2 != 0) {
            char c = cArr[i];
            if (c == '-' || c == '+') {
                if (i2 == 1) {
                    return false;
                }
                i3 = i + 1;
                c = cArr[i3];
            } else if (c != '.') {
                i3 = i;
            } else {
                if (i2 == 1) {
                    return false;
                }
                i3 = i + 1;
            }
            int i4 = i + i2;
            if (!(c == '.') && c >= '0' && c <= '9') {
                while (i3 < i4) {
                    int i5 = i3 + 1;
                    c = cArr[i3];
                    if (c < '0' || c > '9') {
                        i3 = i5;
                        z = true;
                    } else {
                        i3 = i5;
                    }
                }
                return true;
            }
            z = false;
            if (c != '.') {
                z2 = false;
            } else {
                if (i3 >= i4) {
                    return true;
                }
                int i6 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 >= '0' && c2 <= '9') {
                    while (i6 < i4) {
                        i3 = i6 + 1;
                        c = cArr[i6];
                        if (c >= '0' && c <= '9') {
                            i6 = i3;
                        }
                    }
                    return true;
                }
                i3 = i6;
                c = c2;
                z2 = true;
            }
            if (true && !z2) {
                return false;
            }
            if (c == 'e' || c == 'E') {
                if (i3 == i4) {
                    return true;
                }
                int i7 = i3 + 1;
                char c3 = cArr[i3];
                if (c3 == '+' || c3 == '-') {
                    if (i7 < i4) {
                        c3 = cArr[i7];
                        i7 = i3 + 2;
                    }
                }
                if (c3 >= '0' && c3 <= '9') {
                    while (i7 < i4) {
                        int i8 = i7 + 1;
                        char c4 = cArr[i7];
                        if (c4 >= '0' && c4 <= '9') {
                            i7 = i8;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static <T> T cast(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, JSONFactory.getDefaultObjectReaderProvider());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ObjectReaderProvider objectReaderProvider) {
        Function function;
        Function function2;
        Function typeConvert;
        JSONReader jSONReaderOf;
        if (obj == 0) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (cls == Date.class) {
            return (T) toDate(obj);
        }
        if (cls == Instant.class) {
            return (T) toInstant(obj);
        }
        if (cls == LocalDate.class && (obj instanceof Date)) {
            return (T) ((Date) obj).toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDate();
        }
        if (cls == LocalDateTime.class && (obj instanceof Date)) {
            return (T) ((Date) obj).toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
        }
        if (obj instanceof Date) {
            long time = ((Date) obj).getTime();
            String name = cls.getName();
            if (name.equals("java.sql.Date")) {
                return (T) JdbcSupport.createDate(time);
            }
            if (name.equals("java.sql.Time")) {
                return (T) JdbcSupport.createTime(time);
            }
            if (name.equals("java.sql.Timestamp")) {
                return (T) JdbcSupport.createTimestamp(time);
            }
        }
        if (cls == String.class) {
            if (!(obj instanceof Character) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Enum)) {
                return (T) JSON.toJSONString(obj);
            }
            return (T) obj.toString();
        }
        if (cls == AtomicInteger.class) {
            return (T) new AtomicInteger(toIntValue(obj));
        }
        if (cls == AtomicLong.class) {
            return (T) new AtomicLong(toLongValue(obj));
        }
        if (cls == AtomicBoolean.class) {
            return (T) new AtomicBoolean(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(cls).createInstance((Map) obj, 0L);
        }
        Function typeConvert2 = objectReaderProvider.getTypeConvert(obj.getClass(), cls);
        if (typeConvert2 != null) {
            return (T) typeConvert2.apply(obj);
        }
        if (cls.isEnum()) {
            ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
            if (objectReader instanceof ObjectReaderImplEnum) {
                if (obj instanceof Integer) {
                    return (T) ((ObjectReaderImplEnum) objectReader).of(((Integer) obj).intValue());
                }
            } else {
                return (T) objectReader.readObject(JSONReader.of(JSON.toJSONString(obj)), cls, null, 0L);
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                if (cls == StringBuffer.class) {
                    return (T) new StringBuffer();
                }
                if (cls == StringBuilder.class) {
                    return (T) new StringBuilder();
                }
            }
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            char cCharAt = str.trim().charAt(0);
            if (cCharAt != '\"' && cCharAt != '{' && cCharAt != '[') {
                jSONReaderOf = JSONReader.of(JSON.toJSONString(str));
            } else {
                jSONReaderOf = JSONReader.of(str);
            }
            return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls).readObject(jSONReaderOf, cls, null, 0L);
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(cls).createInstance((Collection) obj);
        }
        String name2 = cls.getName();
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = ((Number) obj).longValue();
            if (name2.equals("java.time.LocalDateTime")) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), DateUtils.DEFAULT_ZONE_ID);
            }
            if (name2.equals("java.sql.Date")) {
                return (T) JdbcSupport.createDate(jLongValue);
            }
            if (name2.equals("java.sql.Time")) {
                return (T) JdbcSupport.createTime(jLongValue);
            }
            if (name2.equals("java.sql.Timestamp")) {
                return (T) JdbcSupport.createTimestamp(jLongValue);
            }
        }
        if (obj.getClass().getName().equals("org.bson.types.Decimal128") && cls == Double.class) {
            ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
            if ((objectWriter instanceof ObjectWriterPrimitiveImpl) && (function2 = ((ObjectWriterPrimitiveImpl) objectWriter).getFunction()) != null && (typeConvert = objectReaderProvider.getTypeConvert(function2.apply(obj).getClass(), Double.class)) != null) {
                return (T) typeConvert.apply(obj);
            }
        }
        ObjectWriter objectWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if ((objectWriter2 instanceof ObjectWriterPrimitiveImpl) && (function = ((ObjectWriterPrimitiveImpl) objectWriter2).getFunction()) != null) {
            T t = (T) function.apply(obj);
            if (cls.isInstance(t)) {
                return t;
            }
        }
        throw new JSONException(AbstractC1194.m2783(obj, AbstractC2668.m4679("can not cast to ", name2, ", from ")));
    }

    public static boolean isInteger(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return false;
        }
        char c = cArr[i];
        if (c == '-' || c == '+') {
            if (i2 == 1) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        int i3 = i2 + i;
        for (int i4 = i + 1; i4 < i3; i4++) {
            char c2 = cArr[i4];
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static BigDecimal toBigDecimal(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static BigDecimal toBigDecimal(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return parseBigDecimal(bArr, 0, bArr.length);
    }

    public static float floatValue(int i, long j, int i2) {
        float f;
        float fScalb;
        float f2;
        float f3;
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j))) - ((long) Math.ceil(((double) i2) * 3.321928094887362));
        if (jNumberOfLeadingZeros < -151) {
            f2 = i;
            f3 = 0.0f;
        } else if (jNumberOfLeadingZeros > 129) {
            f2 = i;
            f3 = Float.POSITIVE_INFINITY;
        } else {
            if (i2 != 0) {
                int i3 = ((int) jNumberOfLeadingZeros) - 27;
                int iDivideKnuthLong = (int) MutableBigInteger.divideKnuthLong(j, i3, i2);
                int i4 = j == 0 ? 0 : 1;
                int i5 = (-151) - i3;
                if (6 - Integer.numberOfLeadingZeros(iDivideKnuthLong) >= i5) {
                    f = i;
                    fScalb = Math.scalb(i4 | iDivideKnuthLong, i3);
                } else {
                    f = i;
                    fScalb = Math.scalb(i4 | (iDivideKnuthLong >> i5) | Integer.signum(iDivideKnuthLong & ((1 << i5) - 1)), -151);
                }
                return fScalb * f;
            }
            f2 = i;
            f3 = j;
        }
        return f2 * f3;
    }

    public static double doubleValue(int i, long j, int i2) {
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j))) - ((long) Math.ceil(((double) i2) * 3.321928094887362));
        if (jNumberOfLeadingZeros < -1076) {
            return ((double) i) * 0.0d;
        }
        if (jNumberOfLeadingZeros > 1025) {
            return ((double) i) * Double.POSITIVE_INFINITY;
        }
        if (i2 == 0) {
            return ((double) i) * j;
        }
        int i3 = ((int) jNumberOfLeadingZeros) - 56;
        long jDivideKnuthLong = MutableBigInteger.divideKnuthLong(j, i3, i2);
        int i4 = (-1076) - i3;
        if (9 - Long.numberOfLeadingZeros(jDivideKnuthLong) >= i4) {
            return Math.scalb(jDivideKnuthLong | 1, i3) * ((double) i);
        }
        return Math.scalb(((long) Long.signum(jDivideKnuthLong & ((1 << i4) - 1))) | (jDivideKnuthLong >> i4) | 1, -1076) * ((double) i);
    }
}
