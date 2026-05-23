package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ContextAutoTypeBeforeHandler implements JSONReader.AutoTypeBeforeHandler {
    final long[] acceptHashCodes;
    final Map<Long, Class> classCache;
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> tclHashCaches;

    public ContextAutoTypeBeforeHandler(Class... clsArr) {
        this(false, clsArr);
    }

    public static String[] names(Collection<Class> collection) {
        HashSet hashSet = new HashSet();
        for (Class cls : collection) {
            if (cls != null) {
                hashSet.add(TypeUtils.getTypeName(cls));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private Class putCacheIfAbsent(long j, Class cls) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null || contextClassLoader == JSON.class.getClassLoader()) {
            return this.classCache.putIfAbsent(Long.valueOf(j), cls);
        }
        int iIdentityHashCode = System.identityHashCode(contextClassLoader);
        ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        if (concurrentHashMap == null) {
            this.tclHashCaches.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap<>());
            concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        }
        return concurrentHashMap.putIfAbsent(Long.valueOf(j), cls);
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(long j, Class<?> cls, long j2) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != JSON.class.getClassLoader()) {
            ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                return concurrentHashMap.get(Long.valueOf(j));
            }
        }
        return this.classCache.get(Long.valueOf(j));
    }

    public ContextAutoTypeBeforeHandler(boolean z, Class... clsArr) {
        this(z, names(Arrays.asList(clsArr)));
    }

    public ContextAutoTypeBeforeHandler(String... strArr) {
        this(false, strArr);
    }

    public ContextAutoTypeBeforeHandler(boolean z) {
        this(z, new String[0]);
    }

    public ContextAutoTypeBeforeHandler(boolean z, String... strArr) {
        this.tclHashCaches = new ConcurrentHashMap();
        this.classCache = new ConcurrentHashMap(16, 0.75f, 1);
        HashSet<String> hashSet = new HashSet();
        if (z) {
            Class[] clsArr = {Object.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Number.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class, AtomicBoolean.class, AtomicIntegerArray.class, AtomicLongArray.class, AtomicReference.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, String.class, UUID.class, Currency.class, BitSet.class, EnumSet.class, EnumSet.noneOf(TimeUnit.class).getClass(), Date.class, Calendar.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, SimpleDateFormat.class, DateTimeFormatter.class, TimeUnit.class, Set.class, HashSet.class, LinkedHashSet.class, TreeSet.class, List.class, ArrayList.class, LinkedList.class, ConcurrentLinkedQueue.class, ConcurrentSkipListSet.class, CopyOnWriteArrayList.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), TypeUtils.CLASS_SINGLE_SET, TypeUtils.CLASS_SINGLE_LIST, TypeUtils.CLASS_UNMODIFIABLE_COLLECTION, TypeUtils.CLASS_UNMODIFIABLE_LIST, TypeUtils.CLASS_UNMODIFIABLE_SET, TypeUtils.CLASS_UNMODIFIABLE_SORTED_SET, TypeUtils.CLASS_UNMODIFIABLE_NAVIGABLE_SET, Collections.unmodifiableMap(new HashMap()).getClass(), Collections.unmodifiableNavigableMap(new TreeMap()).getClass(), Collections.unmodifiableSortedMap(new TreeMap()).getClass(), Arrays.asList(new Object[0]).getClass(), Map.class, HashMap.class, Hashtable.class, TreeMap.class, LinkedHashMap.class, WeakHashMap.class, IdentityHashMap.class, ConcurrentMap.class, ConcurrentHashMap.class, ConcurrentSkipListMap.class, Exception.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, RuntimeException.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class};
            for (int i = 0; i < 103; i++) {
                hashSet.add(TypeUtils.getTypeName(clsArr[i]));
            }
            hashSet.addAll(Arrays.asList("javax.validation.ValidationException", "javax.validation.NoProviderFoundException"));
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                Class mapping = TypeUtils.getMapping(str);
                hashSet.add(mapping != null ? TypeUtils.getTypeName(mapping) : str);
            }
        }
        int size = hashSet.size();
        long[] jArrCopyOf = new long[size];
        int i2 = 0;
        for (String str2 : hashSet) {
            long j = -3750763034362895579L;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char cCharAt = str2.charAt(i3);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                j = (j ^ ((long) cCharAt)) * 1099511628211L;
            }
            jArrCopyOf[i2] = j;
            i2++;
        }
        jArrCopyOf = i2 != size ? Arrays.copyOf(jArrCopyOf, i2) : jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.acceptHashCodes = jArrCopyOf;
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(String str, Class<?> cls, long j) {
        long j2;
        Class<?> clsPutCacheIfAbsent;
        if ("O".equals(str)) {
            str = "Object";
        }
        int length = str.length();
        long j3 = -3750763034362895579L;
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '$') {
                cCharAt = '.';
            }
            long j4 = (j3 ^ ((long) cCharAt)) * 1099511628211L;
            if (Arrays.binarySearch(this.acceptHashCodes, j4) >= 0) {
                long jHashCode64 = Fnv.hashCode64(str);
                Class<?> clsApply = apply(jHashCode64, cls, j);
                if (clsApply == null && (clsApply = TypeUtils.loadClass(str)) != null && (clsPutCacheIfAbsent = putCacheIfAbsent(jHashCode64, clsApply)) != null) {
                    clsApply = clsPutCacheIfAbsent;
                }
                if (clsApply != null) {
                    return clsApply;
                }
            }
            i++;
            j3 = j4;
        }
        long jHashCode65 = Fnv.hashCode64(str);
        if (str.length() <= 0 || str.charAt(0) != '[') {
            j2 = j;
        } else {
            j2 = j;
            Class<?> clsApply2 = apply(jHashCode65, cls, j2);
            if (clsApply2 != null) {
                return clsApply2;
            }
            String strSubstring = str.substring(1);
            Class<?> componentType = cls != null ? cls.getComponentType() : null;
            Class<?> clsApply3 = apply(strSubstring, componentType, j2);
            if (clsApply3 != null) {
                if (clsApply3 != componentType) {
                    cls = TypeUtils.getArrayClass(clsApply3);
                }
                Class<?> clsPutCacheIfAbsent2 = putCacheIfAbsent(jHashCode65, cls);
                return clsPutCacheIfAbsent2 != null ? clsPutCacheIfAbsent2 : cls;
            }
        }
        Class mapping = TypeUtils.getMapping(str);
        if (mapping != null) {
            String typeName = TypeUtils.getTypeName(mapping);
            if (!str.equals(typeName)) {
                Class<?> clsApply4 = apply(typeName, cls, j2);
                if (clsApply4 != null) {
                    putCacheIfAbsent(jHashCode65, clsApply4);
                }
                return clsApply4;
            }
        }
        return null;
    }
}
