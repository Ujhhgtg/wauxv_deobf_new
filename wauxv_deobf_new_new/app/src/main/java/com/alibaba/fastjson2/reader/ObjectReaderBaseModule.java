package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONBuilder;
import com.alibaba.fastjson2.annotation.JSONCompiler;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.impl.StringToAny;
import com.alibaba.fastjson2.function.impl.ToBigDecimal;
import com.alibaba.fastjson2.function.impl.ToBigInteger;
import com.alibaba.fastjson2.function.impl.ToBoolean;
import com.alibaba.fastjson2.function.impl.ToByte;
import com.alibaba.fastjson2.function.impl.ToDouble;
import com.alibaba.fastjson2.function.impl.ToFloat;
import com.alibaba.fastjson2.function.impl.ToInteger;
import com.alibaba.fastjson2.function.impl.ToLong;
import com.alibaba.fastjson2.function.impl.ToNumber;
import com.alibaba.fastjson2.function.impl.ToShort;
import com.alibaba.fastjson2.function.impl.ToString;
import com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.ApacheLang3Support;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.GuavaSupport;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.KotlinUtils;
import com.alibaba.fastjson2.util.MapMultiValueType;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.bv;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import p000.C0278;
import p000.C0384;
import p000.C0385;
import p000.C0461;
import p000.C2276;
import p000.C2277;
import p000.C2278;
import p000.C2279;
import p000.C2280;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderBaseModule implements ObjectReaderModule {
    static Method METHOD_getPermittedSubclasses;
    final ReaderAnnotationProcessor annotationProcessor = new ReaderAnnotationProcessor();
    final ObjectReaderProvider provider;

    public ObjectReaderBaseModule(ObjectReaderProvider objectReaderProvider) {
        this.provider = objectReaderProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getBeanInfo1xJSONPOJOBuilder(BeanInfo beanInfo, Class<?> cls, Annotation annotation, Class<? extends Annotation> cls2) {
        BeanUtils.annotationMethods(cls2, new C2277(annotation, beanInfo, cls, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x005e A[SYNTHETIC] */
    public void getCreator(BeanInfo beanInfo, Class<?> cls, Constructor constructor) {
        Constructor<?> declaredConstructor;
        String name;
        if (cls.isEnum()) {
            return;
        }
        boolean z = false;
        for (Annotation annotation : BeanUtils.getAnnotations(constructor)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONCreator jSONCreator = (JSONCreator) BeanUtils.findAnnotation(annotation, JSONCreator.class);
            if (jSONCreator != null) {
                String[] strArrParameterNames = jSONCreator.parameterNames();
                if (strArrParameterNames.length != 0) {
                    beanInfo.createParameterNames = strArrParameterNames;
                }
                if (jSONCreator == annotation) {
                    z = true;
                } else {
                    z = true;
                    name = clsAnnotationType.getName();
                    if (name.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                        if (JSONFactory.isUseJacksonAnnotation()) {
                            z = true;
                        }
                    } else if (!name.equals("com.alibaba.fastjson.annotation.JSONCreator") || name.equals("com.alibaba.fastjson2.annotation.JSONCreator")) {
                        BeanUtils.annotationMethods(clsAnnotationType, new C0384(annotation, beanInfo, 6));
                        z = true;
                    }
                }
            } else {
                name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                    if (!name.equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                    }
                    BeanUtils.annotationMethods(clsAnnotationType, new C0384(annotation, beanInfo, 6));
                    z = true;
                } else if (JSONFactory.isUseJacksonAnnotation()) {
                    z = true;
                }
            }
        }
        if (z) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            if (declaredConstructor != null) {
                beanInfo.creatorConstructor = declaredConstructor;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBeanInfo1xJSONPOJOBuilder$4(Annotation annotation, BeanInfo beanInfo, Class cls, Method method) {
        try {
            String name = method.getName();
            int iHashCode = name.hashCode();
            if (iHashCode != 672684058) {
                if (iHashCode != 2068281583) {
                    if (iHashCode == 2092901112 && name.equals("withPrefix")) {
                        String str = (String) method.invoke(annotation, null);
                        if (str.isEmpty()) {
                            return;
                        }
                        beanInfo.builderWithPrefix = str;
                        return;
                    }
                    return;
                }
                if (!name.equals("buildMethod")) {
                    return;
                }
            } else if (!name.equals("buildMethodName")) {
                return;
            }
            beanInfo.buildMethod = BeanUtils.buildMethod(cls, (String) method.invoke(annotation, null));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCreator$5(Annotation annotation, BeanInfo beanInfo, Method method) {
        try {
            if ("parameterNames".equals(method.getName())) {
                String[] strArr = (String[]) method.invoke(annotation, null);
                if (strArr.length != 0) {
                    beanInfo.createParameterNames = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCreator$6(Annotation annotation, BeanInfo beanInfo, Method method) {
        try {
            if ("parameterNames".equals(method.getName())) {
                String[] strArr = (String[]) method.invoke(annotation, null);
                if (strArr.length != 0) {
                    beanInfo.createParameterNames = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCreator$7(Annotation annotation, BeanInfo beanInfo, Method method) {
        try {
            if ("parameterNames".equals(method.getName())) {
                String[] strArr = (String[]) method.invoke(annotation, null);
                if (strArr.length != 0) {
                    beanInfo.createParameterNames = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InetAddress lambda$getObjectReader$10(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            throw new JSONException("create address error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Path lambda$getObjectReader$8(String str) {
        return Paths.get(str, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URL lambda$getObjectReader$9(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new JSONException("read URL error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$2(Object obj) {
        if (obj == null || "null".equals(obj) || obj.equals(0L)) {
            return null;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(((Long) obj).longValue()), ZoneId.systemDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$3(Object obj) {
        if (obj == null || "null".equals(obj) || "".equals(obj)) {
            return null;
        }
        return UUID.fromString((String) obj);
    }

    public static ObjectReader typedMap(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new ObjectReaderImplMapString(cls, cls2, 0L) : new ObjectReaderImplMapTyped(cls, cls2, type, type2, 0L, null);
    }

    @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
    public void getBeanInfo(BeanInfo beanInfo, Class<?> cls) {
        ReaderAnnotationProcessor readerAnnotationProcessor = this.annotationProcessor;
        if (readerAnnotationProcessor != null) {
            readerAnnotationProcessor.getBeanInfo(beanInfo, cls);
        }
    }

    @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
        ReaderAnnotationProcessor readerAnnotationProcessor = this.annotationProcessor;
        if (readerAnnotationProcessor != null) {
            readerAnnotationProcessor.getFieldInfo(fieldInfo, cls, field);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x0268  */
    /* JADX WARN: Code duplicated, block: B:232:0x0278  */
    /* JADX WARN: Code duplicated, block: B:236:0x0286  */
    /* JADX WARN: Code duplicated, block: B:239:0x0292  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
    public ObjectReader getObjectReader(ObjectReaderProvider objectReaderProvider, Type type) {
        String str;
        Type type2;
        Class cls;
        byte b;
        Class cls2;
        Class cls3;
        Class clsLoadClass;
        if (type == String.class || type == CharSequence.class) {
            return ObjectReaderImplString.INSTANCE;
        }
        if (type == Character.TYPE || type == Character.class) {
            return ObjectReaderImplCharacter.INSTANCE;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return ObjectReaderImplBoolean.INSTANCE;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return ObjectReaderImplByte.INSTANCE;
        }
        if (type == Short.TYPE || type == Short.class) {
            return ObjectReaderImplShort.INSTANCE;
        }
        Class cls4 = Integer.TYPE;
        if (type == cls4 || type == Integer.class) {
            return ObjectReaderImplInteger.INSTANCE;
        }
        if (type == Long.TYPE || type == Long.class) {
            return ObjectReaderImplInt64.INSTANCE;
        }
        if (type == Float.TYPE || type == Float.class) {
            return ObjectReaderImplFloat.INSTANCE;
        }
        if (type == Double.TYPE || type == Double.class) {
            return ObjectReaderImplDouble.INSTANCE;
        }
        if (type == BigInteger.class) {
            return ObjectReaderImplBigInteger.INSTANCE;
        }
        if (type == BigDecimal.class) {
            return ObjectReaderImplBigDecimal.INSTANCE;
        }
        if (type == Number.class) {
            return ObjectReaderImplNumber.INSTANCE;
        }
        if (type == BitSet.class) {
            return ObjectReaderImplBitSet.INSTANCE;
        }
        if (type == OptionalInt.class) {
            return ObjectReaderImplOptionalInt.INSTANCE;
        }
        if (type == OptionalLong.class) {
            return ObjectReaderImplOptionalLong.INSTANCE;
        }
        if (type == OptionalDouble.class) {
            return ObjectReaderImplOptionalDouble.INSTANCE;
        }
        if (type == Optional.class) {
            return ObjectReaderImplOptional.INSTANCE;
        }
        if (type == UUID.class) {
            return ObjectReaderImplUUID.INSTANCE;
        }
        int i = 3;
        if (type == Duration.class) {
            return new ObjectReaderImplFromString(Duration.class, new C2278(i));
        }
        int i2 = 19;
        if (type == Period.class) {
            return new ObjectReaderImplFromString(Period.class, new C0278(i2));
        }
        if (type == Year.class) {
            return ObjectReaderImplYear.INSTANCE;
        }
        if (type == YearMonth.class) {
            return ObjectReaderImplYearMonth.INSTANCE;
        }
        if (type == MonthDay.class) {
            return ObjectReaderImplMonthDay.INSTANCE;
        }
        if (type == HijrahDate.class) {
            return ObjectReaderImplHijrahDate.INSTANCE;
        }
        if (type == JapaneseDate.class) {
            return ObjectReaderImplJapaneseDate.INSTANCE;
        }
        if (type == MinguoDate.class) {
            return ObjectReaderImplMinguoDate.INSTANCE;
        }
        if (type == ThaiBuddhistDate.class) {
            return ObjectReaderImplThaiBuddhistDate.INSTANCE;
        }
        int i3 = 22;
        if (type == AtomicBoolean.class) {
            return new ObjectReaderImplFromBoolean(AtomicBoolean.class, new C0278(i3));
        }
        int i4 = 23;
        if (type == URI.class) {
            return new ObjectReaderImplFromString(URI.class, new C0278(i4));
        }
        int i5 = 24;
        if (type == Charset.class) {
            return new ObjectReaderImplFromString(Charset.class, new C0278(i5));
        }
        int i6 = 25;
        if (type == File.class) {
            return new ObjectReaderImplFromString(File.class, new C0278(i6));
        }
        int i7 = 26;
        if (type == Path.class) {
            return new ObjectReaderImplFromString(Path.class, new C0278(i7));
        }
        int i8 = 27;
        if (type == URL.class) {
            return new ObjectReaderImplFromString(URL.class, new C0278(i8));
        }
        int i9 = 28;
        if (type == Pattern.class) {
            return new ObjectReaderImplFromString(Pattern.class, new C0278(i9));
        }
        if (type == Class.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        if (type == Method.class) {
            return new ObjectReaderImplMethod();
        }
        if (type == Field.class) {
            return new ObjectReaderImplField();
        }
        if (type == Type.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "org.springframework.security.authentication.UsernamePasswordAuthenticationToken":
                str = "org.springframework.security.jackson2.UsernamePasswordAuthenticationTokenMixin";
                if (str != null && objectReaderProvider.mixInCache.get(type) == null) {
                    clsLoadClass = TypeUtils.loadClass(str);
                    if (clsLoadClass == null && "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin".equals(str)) {
                        clsLoadClass = TypeUtils.loadClass("com.alibaba.fastjson2.internal.mixin.spring.SimpleGrantedAuthorityMixin");
                    }
                    if (clsLoadClass != null) {
                        objectReaderProvider.mixInCache.putIfAbsent((Class) type, clsLoadClass);
                    }
                }
                if (type != Map.class || type == AbstractMap.class) {
                    return ObjectReaderImplMap.of(null, (Class) type, 0L);
                }
                if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
                    return typedMap((Class) type, ConcurrentHashMap.class, null, Object.class);
                }
                if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
                    return typedMap((Class) type, ConcurrentSkipListMap.class, null, Object.class);
                }
                if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
                    return typedMap((Class) type, TreeMap.class, null, Object.class);
                }
                if (type == Calendar.class || "javax.xml.datatype.XMLGregorianCalendar".equals(typeName)) {
                    return ObjectReaderImplCalendar.INSTANCE;
                }
                if (type == Date.class) {
                    return ObjectReaderImplDate.INSTANCE;
                }
                if (type == LocalDate.class) {
                    return ObjectReaderImplLocalDate.INSTANCE;
                }
                if (type == LocalTime.class) {
                    return ObjectReaderImplLocalTime.INSTANCE;
                }
                if (type == LocalDateTime.class) {
                    return ObjectReaderImplLocalDateTime.INSTANCE;
                }
                if (type == ZonedDateTime.class) {
                    return ObjectReaderImplZonedDateTime.INSTANCE;
                }
                if (type == OffsetDateTime.class) {
                    return ObjectReaderImplOffsetDateTime.INSTANCE;
                }
                if (type == OffsetTime.class) {
                    return ObjectReaderImplOffsetTime.INSTANCE;
                }
                if (type == ZoneOffset.class) {
                    return new ObjectReaderImplFromString(ZoneOffset.class, new C2278(4));
                }
                if (type == Instant.class) {
                    return ObjectReaderImplInstant.INSTANCE;
                }
                if (type == Locale.class) {
                    return ObjectReaderImplLocale.INSTANCE;
                }
                if (type == Currency.class) {
                    return ObjectReaderImplCurrency.INSTANCE;
                }
                if (type == ZoneId.class) {
                    return new ObjectReaderImplFromString(ZoneId.class, new C2278(5));
                }
                if (type == TimeZone.class) {
                    return new ObjectReaderImplFromString(TimeZone.class, new C2278(6));
                }
                if (type == char[].class) {
                    return ObjectReaderImplCharValueArray.INSTANCE;
                }
                if (type == float[].class) {
                    return ObjectReaderImplFloatValueArray.INSTANCE;
                }
                if (type == double[].class) {
                    return ObjectReaderImplDoubleValueArray.INSTANCE;
                }
                if (type == boolean[].class) {
                    return ObjectReaderImplBoolValueArray.INSTANCE;
                }
                if (type == byte[].class) {
                    return ObjectReaderImplInt8ValueArray.INSTANCE;
                }
                if (type == short[].class) {
                    return ObjectReaderImplInt16ValueArray.INSTANCE;
                }
                if (type == int[].class) {
                    return ObjectReaderImplInt32ValueArray.INSTANCE;
                }
                if (type == long[].class) {
                    return ObjectReaderImplInt64ValueArray.INSTANCE;
                }
                if (type == Byte[].class) {
                    return ObjectReaderImplInt8Array.INSTANCE;
                }
                if (type == Short[].class) {
                    return ObjectReaderImplInt16Array.INSTANCE;
                }
                if (type == Integer[].class) {
                    return ObjectReaderImplInt32Array.INSTANCE;
                }
                if (type == Long[].class) {
                    return ObjectReaderImplInt64Array.INSTANCE;
                }
                if (type == Float[].class) {
                    return ObjectReaderImplFloatArray.INSTANCE;
                }
                if (type == Double[].class) {
                    return ObjectReaderImplDoubleArray.INSTANCE;
                }
                if (type == Number[].class) {
                    return ObjectReaderImplNumberArray.INSTANCE;
                }
                if (type == String[].class) {
                    return ObjectReaderImplStringArray.INSTANCE;
                }
                if (type == AtomicInteger.class) {
                    return new ObjectReaderImplFromInt(AtomicInteger.class, new C0461(8));
                }
                if (type == AtomicLong.class) {
                    return new ObjectReaderImplFromLong(AtomicLong.class, new C2276());
                }
                if (type == AtomicIntegerArray.class) {
                    return new ObjectReaderImplInt32ValueArray(AtomicIntegerArray.class, new C0278(16));
                }
                if (type == AtomicLongArray.class) {
                    return new ObjectReaderImplInt64ValueArray(AtomicLongArray.class, new C0278(17));
                }
                if (type == AtomicReference.class) {
                    return ObjectReaderImplAtomicReference.INSTANCE;
                }
                if (type instanceof MultiType) {
                    return new ObjectArrayReaderMultiType((MultiType) type);
                }
                if (type instanceof MapMultiValueType) {
                    return new ObjectReaderImplMapMultiValueType((MapMultiValueType) type);
                }
                if (type == StringBuffer.class || type == StringBuilder.class) {
                    try {
                        Class cls5 = (Class) type;
                        return new ObjectReaderImplValue(cls5, String.class, String.class, 0L, null, null, null, cls5.getConstructor(String.class), null, null);
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class || type == Stack.class) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == NavigableSet.class || type == SortedSet.class) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == ConcurrentLinkedDeque.class || type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == ObjectReaderImplList.CLASS_EMPTY_SET || type == ObjectReaderImplList.CLASS_EMPTY_LIST || type == ObjectReaderImplList.CLASS_SINGLETON || type == ObjectReaderImplList.CLASS_SINGLETON_LIST || type == ObjectReaderImplList.CLASS_ARRAYS_LIST || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_SET || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_SORTED_SET || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_NAVIGABLE_SET) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == TypeUtils.CLASS_SINGLE_SET) {
                    return ObjectReaderImplList.of(type, null, 0L);
                }
                if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
                    return ObjectReaderImplObject.INSTANCE;
                }
                if (type == Map.Entry.class) {
                    return new ObjectReaderImplMapEntry(null, null);
                }
                if (type instanceof Class) {
                    Class cls6 = (Class) type;
                    if (BeanUtils.isExtendedMap(cls6)) {
                        return null;
                    }
                    if (Map.class.isAssignableFrom(cls6)) {
                        return ObjectReaderImplMap.of(null, cls6, 0L);
                    }
                    cls = ConcurrentSkipListMap.class;
                    if (Collection.class.isAssignableFrom(cls6)) {
                        return ObjectReaderImplList.of(cls6, cls6, 0L);
                    }
                    if (cls6.isArray()) {
                        return cls6.getComponentType() == Object.class ? ObjectArrayReader.INSTANCE : new ObjectArrayTypedReader(cls6);
                    }
                    if (JSONPObject.class.isAssignableFrom(cls6)) {
                        return new ObjectReaderImplJSONP(cls6);
                    }
                    ObjectReaderCreator creator = JSONFactory.getDefaultObjectReaderProvider().getCreator();
                    if (cls6 == StackTraceElement.class) {
                        try {
                            type2 = ConcurrentNavigableMap.class;
                            try {
                                return creator.createObjectReaderNoneDefaultConstructor(cls6.getConstructor(String.class, String.class, String.class, cls4), "className", "methodName", "fileName", "lineNumber");
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            type2 = ConcurrentNavigableMap.class;
                        }
                    } else {
                        type2 = ConcurrentNavigableMap.class;
                    }
                } else {
                    type2 = ConcurrentNavigableMap.class;
                    cls = ConcurrentSkipListMap.class;
                }
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type rawType = parameterizedType.getRawType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 2) {
                        Type type3 = actualTypeArguments[0];
                        Type type4 = actualTypeArguments[1];
                        if (rawType == Map.class || rawType == AbstractMap.class || rawType == HashMap.class) {
                            return typedMap((Class) rawType, HashMap.class, type3, type4);
                        }
                        if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                            return typedMap((Class) rawType, ConcurrentHashMap.class, type3, type4);
                        }
                        Class cls7 = cls;
                        if (rawType == type2 || rawType == cls7) {
                            return typedMap((Class) rawType, cls7, type3, type4);
                        }
                        if (rawType == LinkedHashMap.class || rawType == TreeMap.class || rawType == Hashtable.class) {
                            Class cls8 = (Class) rawType;
                            return typedMap(cls8, cls8, type3, type4);
                        }
                        if (rawType == Map.Entry.class) {
                            return new ObjectReaderImplMapEntry(type3, type4);
                        }
                        String typeName2 = rawType.getTypeName();
                        typeName2.getClass();
                        switch (typeName2) {
                            case "com.google.common.collect.SingletonImmutableBiMap":
                                return new ObjectReaderImplMapTyped((Class) rawType, HashMap.class, type3, type4, 0L, GuavaSupport.singletonBiMapConverter());
                            case "org.springframework.util.LinkedMultiValueMap":
                                return ObjectReaderImplMap.of(type, (Class) rawType, 0L);
                            case "org.apache.commons.lang3.tuple.Pair":
                            case "org.apache.commons.lang3.tuple.ImmutablePair":
                                return new ApacheLang3Support.PairReader((Class) rawType, type3, type4);
                            case "com.google.common.collect.ImmutableMap":
                            case "com.google.common.collect.RegularImmutableMap":
                                return new ObjectReaderImplMapTyped((Class) rawType, HashMap.class, type3, type4, 0L, GuavaSupport.immutableMapConverter());
                            default:
                                break;
                        }
                    } else if (actualTypeArguments.length == 1) {
                        Type type5 = actualTypeArguments[0];
                        Class<?> mapping = TypeUtils.getMapping(type5);
                        if (rawType == Iterable.class || rawType == Collection.class || rawType == List.class || rawType == AbstractCollection.class || rawType == AbstractList.class) {
                            cls2 = ArrayList.class;
                        } else {
                            cls2 = ArrayList.class;
                            if (rawType != cls2 && rawType != Stack.class) {
                                if (rawType == Queue.class || rawType == Deque.class || rawType == AbstractSequentialList.class) {
                                    cls3 = LinkedList.class;
                                } else {
                                    cls3 = LinkedList.class;
                                    if (rawType != cls3) {
                                        if (rawType == Set.class || rawType == AbstractSet.class || rawType == EnumSet.class) {
                                            if (mapping == String.class) {
                                                return new ObjectReaderImplListStr((Class) rawType, HashSet.class);
                                            }
                                            return mapping == Long.class ? new ObjectReaderImplListInt64((Class) rawType, HashSet.class) : ObjectReaderImplList.of(type, null, 0L);
                                        }
                                        if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                            if (type5 == String.class) {
                                                return new ObjectReaderImplListStr((Class) rawType, TreeSet.class);
                                            }
                                            return mapping == Long.class ? new ObjectReaderImplListInt64((Class) rawType, TreeSet.class) : ObjectReaderImplList.of(type, null, 0L);
                                        }
                                        if (rawType != ConcurrentLinkedDeque.class && rawType != ConcurrentLinkedQueue.class && rawType != ConcurrentSkipListSet.class && rawType != LinkedHashSet.class && rawType != HashSet.class && rawType != TreeSet.class && rawType != CopyOnWriteArrayList.class) {
                                            String typeName3 = rawType.getTypeName();
                                            typeName3.getClass();
                                            switch (typeName3.hashCode()) {
                                                case -1986714303:
                                                    if (!typeName3.equals("com.google.common.collect.ImmutableList")) {
                                                    }
                                                    break;
                                                case -681075156:
                                                    if (!typeName3.equals("com.google.common.collect.SingletonImmutableSet")) {
                                                    }
                                                    break;
                                                case 572464727:
                                                    if (!typeName3.equals("cn.hutool.core.lang.tree.Tree")) {
                                                    }
                                                    break;
                                                case 905750367:
                                                    if (!typeName3.equals("com.google.common.collect.ImmutableSet")) {
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            /*  JADX ERROR: Method code generation error
                                                java.lang.NullPointerException: Switch insn not found in header
                                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                */
                                            /*
                                                Method dump skipped, instruction units count: 3884
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderBaseModule.getObjectReader(com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.reflect.Type):com.alibaba.fastjson2.reader.ObjectReader");
                                        }

                                        @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
                                        public ObjectReaderProvider getProvider() {
                                            return this.provider;
                                        }

                                        @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
                                        public void init(ObjectReaderProvider objectReaderProvider) {
                                            Class<Boolean> cls;
                                            int i;
                                            Class cls2;
                                            Class<BigDecimal> cls3;
                                            Class<BigInteger> cls4;
                                            Type[] typeArr;
                                            Class<Byte> cls5;
                                            Class<BigInteger> cls6;
                                            Class cls7;
                                            Class<BigDecimal> cls8;
                                            Class<Short> cls9;
                                            Class<Byte> cls10;
                                            Class cls11;
                                            Class<Short> cls12;
                                            Class<Integer> cls13;
                                            Class<Boolean> cls14;
                                            Class cls15;
                                            Class<Integer> cls16;
                                            Class<Long> cls17;
                                            Class<Character> cls18;
                                            Class cls19;
                                            Class<Long> cls20;
                                            Class<Float> cls21;
                                            Long l;
                                            Class<Float> cls22;
                                            Long l2 = 0L;
                                            Double dValueOf = Double.valueOf(0.0d);
                                            Function c0278 = new C0278(29);
                                            Class<Character> cls23 = Character.class;
                                            Class cls24 = Character.TYPE;
                                            objectReaderProvider.registerTypeConvert(cls23, cls24, c0278);
                                            Type[] typeArr2 = {Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Number.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class};
                                            Function toBoolean = new ToBoolean(null);
                                            int i2 = 0;
                                            while (true) {
                                                cls = Boolean.class;
                                                i = 12;
                                                if (i2 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr2[i2], cls, toBoolean);
                                                i2++;
                                            }
                                            Function toBoolean2 = new ToBoolean(Boolean.FALSE);
                                            int i3 = 0;
                                            while (true) {
                                                cls2 = Boolean.TYPE;
                                                if (i3 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr2[i3], cls2, toBoolean2);
                                                i3++;
                                            }
                                            Function toString = new ToString();
                                            for (int i4 = 0; i4 < 12; i4++) {
                                                objectReaderProvider.registerTypeConvert(typeArr2[i4], String.class, toString);
                                            }
                                            Function toBigDecimal = new ToBigDecimal();
                                            int i5 = 0;
                                            while (true) {
                                                cls3 = BigDecimal.class;
                                                if (i5 >= i) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr2[i5], cls3, toBigDecimal);
                                                i5++;
                                                i = 12;
                                            }
                                            Function toBigInteger = new ToBigInteger();
                                            int i6 = 0;
                                            while (true) {
                                                cls4 = BigInteger.class;
                                                typeArr = typeArr2;
                                                if (i6 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i6], cls4, toBigInteger);
                                                i6++;
                                                typeArr2 = typeArr;
                                            }
                                            Function toByte = new ToByte(null);
                                            int i7 = 0;
                                            while (true) {
                                                cls5 = Byte.class;
                                                cls6 = cls4;
                                                if (i7 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i7], cls5, toByte);
                                                i7++;
                                                cls4 = cls6;
                                            }
                                            Function toByte2 = new ToByte((byte) 0);
                                            int i8 = 0;
                                            while (true) {
                                                cls7 = Byte.TYPE;
                                                cls8 = cls3;
                                                if (i8 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i8], cls7, toByte2);
                                                i8++;
                                                cls3 = cls8;
                                            }
                                            Function toShort = new ToShort(null);
                                            int i9 = 0;
                                            while (true) {
                                                cls9 = Short.class;
                                                cls10 = cls5;
                                                if (i9 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i9], cls9, toShort);
                                                i9++;
                                                cls5 = cls10;
                                            }
                                            Function toShort2 = new ToShort((short) 0);
                                            int i10 = 0;
                                            while (true) {
                                                cls11 = Short.TYPE;
                                                cls12 = cls9;
                                                if (i10 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i10], cls11, toShort2);
                                                i10++;
                                                cls9 = cls12;
                                            }
                                            Function toInteger = new ToInteger(null);
                                            int i11 = 0;
                                            while (true) {
                                                cls13 = Integer.class;
                                                cls14 = cls;
                                                if (i11 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i11], cls13, toInteger);
                                                i11++;
                                                cls = cls14;
                                            }
                                            Function toInteger2 = new ToInteger(0);
                                            int i12 = 0;
                                            while (true) {
                                                cls15 = Integer.TYPE;
                                                cls16 = cls13;
                                                if (i12 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i12], cls15, toInteger2);
                                                i12++;
                                                cls13 = cls16;
                                            }
                                            Function toLong = new ToLong(null);
                                            int i13 = 0;
                                            while (true) {
                                                cls17 = Long.class;
                                                cls18 = cls23;
                                                if (i13 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i13], cls17, toLong);
                                                i13++;
                                                cls23 = cls18;
                                            }
                                            Function toLong2 = new ToLong(l2);
                                            int i14 = 0;
                                            while (true) {
                                                cls19 = Long.TYPE;
                                                cls20 = cls17;
                                                if (i14 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i14], cls19, toLong2);
                                                i14++;
                                                cls17 = cls20;
                                            }
                                            Function toFloat = new ToFloat(null);
                                            int i15 = 0;
                                            while (true) {
                                                cls21 = Float.class;
                                                l = l2;
                                                if (i15 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i15], cls21, toFloat);
                                                i15++;
                                                l2 = l;
                                            }
                                            Function toFloat2 = new ToFloat(Float.valueOf(0.0f));
                                            for (int i16 = 0; i16 < 12; i16++) {
                                                objectReaderProvider.registerTypeConvert(typeArr[i16], Float.TYPE, toFloat2);
                                            }
                                            Function toDouble = new ToDouble(null);
                                            int i17 = 0;
                                            while (true) {
                                                cls22 = cls21;
                                                if (i17 >= 12) {
                                                    break;
                                                }
                                                objectReaderProvider.registerTypeConvert(typeArr[i17], Double.class, toDouble);
                                                i17++;
                                                cls21 = cls22;
                                            }
                                            Function toDouble2 = new ToDouble(dValueOf);
                                            for (int i18 = 0; i18 < 12; i18++) {
                                                objectReaderProvider.registerTypeConvert(typeArr[i18], Double.TYPE, toDouble2);
                                            }
                                            Function toNumber = new ToNumber(dValueOf);
                                            for (int i19 = 0; i19 < 12; i19++) {
                                                objectReaderProvider.registerTypeConvert(typeArr[i19], Number.class, toNumber);
                                            }
                                            objectReaderProvider.registerTypeConvert(String.class, cls24, new StringToAny(cls24, '0'));
                                            objectReaderProvider.registerTypeConvert(String.class, cls2, new StringToAny(cls2, Boolean.FALSE));
                                            Float fValueOf = Float.valueOf(0.0f);
                                            Class cls25 = Float.TYPE;
                                            objectReaderProvider.registerTypeConvert(String.class, cls25, new StringToAny(cls25, fValueOf));
                                            Class cls26 = Double.TYPE;
                                            objectReaderProvider.registerTypeConvert(String.class, cls26, new StringToAny(cls26, dValueOf));
                                            objectReaderProvider.registerTypeConvert(String.class, cls7, new StringToAny(cls7, (byte) 0));
                                            objectReaderProvider.registerTypeConvert(String.class, cls11, new StringToAny(cls11, (short) 0));
                                            objectReaderProvider.registerTypeConvert(String.class, cls15, new StringToAny(cls15, 0));
                                            objectReaderProvider.registerTypeConvert(String.class, cls19, new StringToAny(cls19, l));
                                            objectReaderProvider.registerTypeConvert(String.class, cls18, new StringToAny(cls18, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls14, new StringToAny(cls14, null));
                                            objectReaderProvider.registerTypeConvert(String.class, Double.class, new StringToAny(Double.class, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls22, new StringToAny(cls22, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls10, new StringToAny(cls10, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls12, new StringToAny(cls12, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls16, new StringToAny(cls16, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls20, new StringToAny(cls20, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls8, new StringToAny(cls8, null));
                                            objectReaderProvider.registerTypeConvert(String.class, cls6, new StringToAny(cls6, null));
                                            objectReaderProvider.registerTypeConvert(String.class, Number.class, new StringToAny(cls8, null));
                                            objectReaderProvider.registerTypeConvert(String.class, Collection.class, new StringToAny(Collection.class, null));
                                            objectReaderProvider.registerTypeConvert(String.class, List.class, new StringToAny(List.class, null));
                                            objectReaderProvider.registerTypeConvert(String.class, JSONArray.class, new StringToAny(JSONArray.class, null));
                                            objectReaderProvider.registerTypeConvert(cls14, cls2, new C2278(0));
                                            objectReaderProvider.registerTypeConvert(cls20, LocalDateTime.class, new C2278(1));
                                            objectReaderProvider.registerTypeConvert(String.class, UUID.class, new C2278(2));
                                        }

                                        @Override // com.alibaba.fastjson2.modules.ObjectReaderModule
                                        public ReaderAnnotationProcessor getAnnotationProcessor() {
                                            return this.annotationProcessor;
                                        }

                                        /* JADX INFO: compiled from: obf */
                                        public class ReaderAnnotationProcessor implements ObjectReaderAnnotationProcessor {
                                            public ReaderAnnotationProcessor() {
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$getBeanInfo$0(BeanInfo beanInfo, Class cls, Method method) {
                                                ObjectReaderBaseModule.this.getCreator(beanInfo, (Class<?>) cls, method);
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$getBeanInfo$1(BeanInfo beanInfo, Class cls, Constructor constructor) {
                                                ObjectReaderBaseModule.this.getCreator(beanInfo, (Class<?>) cls, constructor);
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$getBeanInfo$2(BeanInfo beanInfo, Class cls, Method method) {
                                                ObjectReaderBaseModule.this.getCreator(beanInfo, (Class<?>) cls, method);
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$getBeanInfo$3(BeanInfo beanInfo, Class cls, Constructor constructor) {
                                                ObjectReaderBaseModule.this.getCreator(beanInfo, (Class<?>) cls, constructor);
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            /* JADX WARN: Code duplicated, block: B:88:0x013b A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:3:0x0005, B:7:0x0015, B:9:0x001d, B:11:0x0022, B:12:0x0029, B:14:0x002c, B:16:0x003e, B:19:0x0048, B:18:0x0044, B:20:0x004f, B:22:0x0059, B:24:0x0061, B:26:0x0066, B:28:0x0069, B:60:0x00df, B:63:0x00e5, B:65:0x00eb, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008a, B:39:0x0092, B:41:0x0097, B:42:0x00a3, B:44:0x00ab, B:46:0x00b3, B:48:0x00b6, B:50:0x00be, B:52:0x00c4, B:54:0x00cc, B:56:0x00d4, B:58:0x00d7, B:67:0x00ee, B:69:0x00f6, B:71:0x00fd, B:86:0x0133, B:88:0x013b, B:72:0x0100, B:74:0x0108, B:76:0x0110, B:78:0x0113, B:80:0x011b, B:82:0x0123, B:84:0x012b, B:90:0x013e, B:92:0x0146, B:94:0x0152, B:96:0x0155, B:98:0x015d, B:100:0x0165, B:102:0x016d, B:104:0x0175, B:106:0x017a, B:108:0x017d, B:110:0x0185, B:112:0x018e, B:114:0x0196, B:116:0x019b, B:117:0x01a5, B:129:0x01e5, B:119:0x01a9, B:121:0x01b1, B:122:0x01bb, B:124:0x01c3, B:125:0x01cd, B:127:0x01d5, B:128:0x01df, B:130:0x01e8, B:132:0x01f0, B:134:0x01f8, B:136:0x0200, B:138:0x0208, B:140:0x0210), top: B:143:0x0005 }] */
                                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                            public /* synthetic */ void lambda$getBeanInfo1x$7(Annotation annotation, BeanInfo beanInfo, Method method) {
                                                String str;
                                                Class<? extends JSONReader.AutoTypeBeforeHandler> cls;
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    int i = 0;
                                                    switch (name.hashCode()) {
                                                        case -1678076717:
                                                            if (name.equals("deserializer")) {
                                                                Class cls2 = (Class) objInvoke;
                                                                if (ObjectReader.class.isAssignableFrom(cls2)) {
                                                                    beanInfo.deserializer = cls2;
                                                                }
                                                            }
                                                            break;
                                                        case -1275293551:
                                                            if (name.equals("disableAutoType") && Boolean.TRUE.equals(objInvoke)) {
                                                                beanInfo.readerFeatures |= FieldInfo.DISABLE_AUTO_TYPE;
                                                                break;
                                                            }
                                                            break;
                                                        case -1073807344:
                                                            if (name.equals("parseFeatures")) {
                                                                Enum[] enumArr = (Enum[]) objInvoke;
                                                                int length = enumArr.length;
                                                                while (i < length) {
                                                                    String strName = enumArr[i].name();
                                                                    switch (strName.hashCode()) {
                                                                        case -1604251670:
                                                                            strName.equals("TrimStringFieldValue");
                                                                            break;
                                                                        case -894003883:
                                                                            if (strName.equals("SupportArrayToBean")) {
                                                                                beanInfo.readerFeatures |= JSONReader.Feature.SupportArrayToBean.mask;
                                                                            }
                                                                            break;
                                                                        case -200815016:
                                                                            if (strName.equals("SupportAutoType")) {
                                                                                beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                                                                            }
                                                                            break;
                                                                        case 2005790178:
                                                                            if (strName.equals("InitStringFieldAsEmpty")) {
                                                                                beanInfo.readerFeatures |= JSONReader.Feature.InitStringFieldAsEmpty.mask;
                                                                            }
                                                                            break;
                                                                    }
                                                                    i++;
                                                                }
                                                            }
                                                            break;
                                                        case -1052827512:
                                                            if (name.equals("naming")) {
                                                                beanInfo.namingStrategy = ((Enum) objInvoke).name();
                                                            }
                                                            break;
                                                        case -1008770331:
                                                            if (name.equals("orders")) {
                                                                String[] strArr = (String[]) objInvoke;
                                                                if (strArr.length != 0) {
                                                                    beanInfo.orders = strArr;
                                                                }
                                                            }
                                                            break;
                                                        case -1006295438:
                                                            if (name.equals("disableJSONB") && Boolean.TRUE.equals(objInvoke)) {
                                                                beanInfo.readerFeatures |= FieldInfo.DISABLE_JSONB;
                                                                break;
                                                            }
                                                            break;
                                                        case -907987551:
                                                            if (name.equals("schema")) {
                                                                String strTrim = ((String) objInvoke).trim();
                                                                if (!strTrim.isEmpty()) {
                                                                    beanInfo.schema = strTrim;
                                                                }
                                                            }
                                                            break;
                                                        case -853109563:
                                                            if (!name.equals("typeKey")) {
                                                            }
                                                            str = (String) objInvoke;
                                                            if (!str.isEmpty()) {
                                                                beanInfo.typeKey = str;
                                                            }
                                                            break;
                                                        case -682633786:
                                                            if (name.equals("disableReferenceDetect") && Boolean.TRUE.equals(objInvoke)) {
                                                                beanInfo.readerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
                                                                break;
                                                            }
                                                            break;
                                                        case -676507419:
                                                            if (name.equals("typeName")) {
                                                                String str2 = (String) objInvoke;
                                                                if (!str2.isEmpty()) {
                                                                    beanInfo.typeName = str2;
                                                                }
                                                            }
                                                            break;
                                                        case -618447321:
                                                            if (name.equals("seeAlsoDefault")) {
                                                                Class cls3 = (Class) objInvoke;
                                                                if (cls3 != Void.class) {
                                                                    beanInfo.seeAlsoDefault = cls3;
                                                                }
                                                                str = (String) objInvoke;
                                                                if (!str.isEmpty()) {
                                                                    beanInfo.typeKey = str;
                                                                }
                                                            }
                                                            break;
                                                        case -432515134:
                                                            if (!name.equals("autoTypeBeforeHandler")) {
                                                            }
                                                            cls = (Class) objInvoke;
                                                            if (cls == JSONReader.AutoTypeBeforeHandler.class && JSONReader.AutoTypeBeforeHandler.class.isAssignableFrom(cls)) {
                                                                beanInfo.autoTypeBeforeHandler = cls;
                                                                break;
                                                            }
                                                            break;
                                                        case -167039347:
                                                            if (name.equals("rootName")) {
                                                                String str3 = (String) objInvoke;
                                                                if (!str3.isEmpty()) {
                                                                    beanInfo.rootName = str3;
                                                                }
                                                            }
                                                            break;
                                                        case 230944667:
                                                            if (name.equals("builder")) {
                                                                processBuilder(beanInfo, (Class) objInvoke);
                                                            }
                                                            break;
                                                        case 1053501509:
                                                            if (name.equals("deserializeUsing")) {
                                                                Class cls4 = (Class) objInvoke;
                                                                if (ObjectReader.class.isAssignableFrom(cls4)) {
                                                                    beanInfo.deserializer = cls4;
                                                                }
                                                            }
                                                            break;
                                                        case 1401959644:
                                                            if (name.equals("deserializeFeatures")) {
                                                                JSONReader.Feature[] featureArr = (JSONReader.Feature[]) objInvoke;
                                                                int length2 = featureArr.length;
                                                                while (i < length2) {
                                                                    beanInfo.readerFeatures = featureArr[i].mask | beanInfo.readerFeatures;
                                                                    i++;
                                                                }
                                                            }
                                                            break;
                                                        case 1533080381:
                                                            if (name.equals("disableArrayMapping") && Boolean.TRUE.equals(objInvoke)) {
                                                                beanInfo.readerFeatures |= FieldInfo.DISABLE_ARRAY_MAPPING;
                                                                break;
                                                            }
                                                            break;
                                                        case 1706529099:
                                                            if (name.equals("autoTypeCheckHandler")) {
                                                                cls = (Class) objInvoke;
                                                                if (cls == JSONReader.AutoTypeBeforeHandler.class) {
                                                                }
                                                            }
                                                            break;
                                                        case 1752415457:
                                                            if (name.equals("ignores")) {
                                                                String[] strArr2 = (String[]) objInvoke;
                                                                if (strArr2.length > 0) {
                                                                    beanInfo.ignores = strArr2;
                                                                }
                                                            }
                                                            break;
                                                        case 1970571962:
                                                            if (name.equals("seeAlso")) {
                                                                Class<?>[] clsArr = (Class[]) objInvoke;
                                                                if (clsArr.length != 0) {
                                                                    beanInfo.seeAlso = clsArr;
                                                                    beanInfo.seeAlsoNames = new String[clsArr.length];
                                                                    while (i < clsArr.length) {
                                                                        Class<?> cls5 = clsArr[i];
                                                                        BeanInfo beanInfo2 = new BeanInfo(JSONFactory.getDefaultObjectReaderProvider());
                                                                        processSeeAlsoAnnotation(beanInfo2, cls5);
                                                                        String simpleName = beanInfo2.typeName;
                                                                        if (simpleName == null || simpleName.isEmpty()) {
                                                                            simpleName = cls5.getSimpleName();
                                                                        }
                                                                        beanInfo.seeAlsoNames[i] = simpleName;
                                                                        i++;
                                                                    }
                                                                    beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$getFieldInfo$9(String str, FieldInfo fieldInfo, Class cls, String str2, String str3, Field field) {
                                                String strSubstring;
                                                if ((field.getType() == Boolean.TYPE || field.getType() == Boolean.class) && field.getName().startsWith("is")) {
                                                    strSubstring = field.getName().substring(2);
                                                    if (!strSubstring.isEmpty()) {
                                                        strSubstring = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                                                    }
                                                } else {
                                                    strSubstring = "";
                                                }
                                                if (field.getName().equals(str) || strSubstring.equals(str)) {
                                                    if (!Modifier.isStatic(field.getModifiers())) {
                                                        getFieldInfo(fieldInfo, cls, field);
                                                    }
                                                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                                                } else if (field.getName().equals(str2)) {
                                                    if (!Modifier.isStatic(field.getModifiers())) {
                                                        getFieldInfo(fieldInfo, cls, field);
                                                    }
                                                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                                                } else if (field.getName().equals(str3)) {
                                                    if (!Modifier.isStatic(field.getModifiers())) {
                                                        getFieldInfo(fieldInfo, cls, field);
                                                    }
                                                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                            public static /* synthetic */ void lambda$processJSONField1x$14(Annotation annotation, FieldInfo fieldInfo, Method method) {
                                                int iIntValue;
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    switch (name.hashCode()) {
                                                        case -1268779017:
                                                            if (name.equals("format")) {
                                                                String str = (String) objInvoke;
                                                                if (!str.isEmpty()) {
                                                                    String strTrim = str.trim();
                                                                    if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                                                                        strTrim = strTrim.replace("T", "'T'");
                                                                    }
                                                                    fieldInfo.format = strTrim;
                                                                }
                                                            }
                                                            break;
                                                        case -1206994319:
                                                            if (name.equals("ordinal") && (iIntValue = ((Integer) objInvoke).intValue()) != 0) {
                                                                fieldInfo.ordinal = iIntValue;
                                                                break;
                                                            }
                                                            break;
                                                        case -1073807344:
                                                            if (name.equals("parseFeatures")) {
                                                                for (Enum r0 : (Enum[]) objInvoke) {
                                                                    String strName = r0.name();
                                                                    int iHashCode = strName.hashCode();
                                                                    if (iHashCode != -894003883) {
                                                                        if (iHashCode != -200815016) {
                                                                            if (iHashCode == 2005790178 && strName.equals("InitStringFieldAsEmpty")) {
                                                                                fieldInfo.features |= JSONReader.Feature.InitStringFieldAsEmpty.mask;
                                                                            }
                                                                        } else if (strName.equals("SupportAutoType")) {
                                                                            fieldInfo.features |= JSONReader.Feature.SupportAutoType.mask;
                                                                        }
                                                                    } else if (strName.equals("SupportArrayToBean")) {
                                                                        fieldInfo.features |= JSONReader.Feature.SupportArrayToBean.mask;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case -987658292:
                                                            if (name.equals("unwrapped") && ((Boolean) objInvoke).booleanValue()) {
                                                                fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                                break;
                                                            }
                                                            break;
                                                        case -659125328:
                                                            if (name.equals("defaultValue")) {
                                                                String str2 = (String) objInvoke;
                                                                if (!str2.isEmpty()) {
                                                                    fieldInfo.defaultValue = str2;
                                                                }
                                                            }
                                                            break;
                                                        case -224599314:
                                                            if (name.equals("alternateNames")) {
                                                                String[] strArr = (String[]) objInvoke;
                                                                if (strArr.length != 0) {
                                                                    if (fieldInfo.alternateNames == null) {
                                                                        fieldInfo.alternateNames = strArr;
                                                                    } else {
                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                        linkedHashSet.addAll(Arrays.asList(strArr));
                                                                        linkedHashSet.addAll(Arrays.asList(fieldInfo.alternateNames));
                                                                        fieldInfo.alternateNames = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 3373707:
                                                            if (name.equals("name")) {
                                                                String str3 = (String) objInvoke;
                                                                if (!str3.isEmpty()) {
                                                                    fieldInfo.fieldName = str3;
                                                                }
                                                            }
                                                            break;
                                                        case 102727412:
                                                            if (name.equals("label")) {
                                                                String str4 = (String) objInvoke;
                                                                if (!str4.isEmpty()) {
                                                                    fieldInfo.label = str4;
                                                                }
                                                            }
                                                            break;
                                                        case 1053501509:
                                                            if (name.equals("deserializeUsing")) {
                                                                Class<?> cls = (Class) objInvoke;
                                                                if (ObjectReader.class.isAssignableFrom(cls)) {
                                                                    fieldInfo.readUsing = cls;
                                                                }
                                                            }
                                                            break;
                                                        case 1746983807:
                                                            if (name.equals("deserialize") && !((Boolean) objInvoke).booleanValue()) {
                                                                fieldInfo.ignore = true;
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processJacksonJsonAlias$13(Annotation annotation, FieldInfo fieldInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if ("value".equals(name)) {
                                                        String[] strArr = (String[]) objInvoke;
                                                        if (strArr.length != 0) {
                                                            fieldInfo.alternateNames = strArr;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$processJacksonJsonDeserialize$10(Annotation annotation, FieldInfo fieldInfo, Method method) {
                                                Class<?> clsProcessUsing;
                                                Class<?> clsProcessUsing2;
                                                Class<?> clsProcessUsing3;
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    int iHashCode = name.hashCode();
                                                    if (iHashCode == 111582340) {
                                                        if (!name.equals("using") || (clsProcessUsing = processUsing((Class) objInvoke)) == null) {
                                                            return;
                                                        }
                                                        fieldInfo.readUsing = clsProcessUsing;
                                                        return;
                                                    }
                                                    if (iHashCode == 491860325) {
                                                        if (!name.equals("keyUsing") || (clsProcessUsing2 = processUsing((Class) objInvoke)) == null) {
                                                            return;
                                                        }
                                                        fieldInfo.keyUsing = clsProcessUsing2;
                                                        return;
                                                    }
                                                    if (iHashCode == 2034063763 && name.equals("valueUsing") && (clsProcessUsing3 = processUsing((Class) objInvoke)) != null) {
                                                        fieldInfo.keyUsing = clsProcessUsing3;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public /* synthetic */ void lambda$processJacksonJsonDeserializer$5(Annotation annotation, BeanInfo beanInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if (!"using".equals(name) && !"contentUsing".equals(name)) {
                                                        if ("builder".equals(name)) {
                                                            processBuilder(beanInfo, (Class) objInvoke);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    Class clsProcessUsing = processUsing((Class) objInvoke);
                                                    if (clsProcessUsing != null) {
                                                        beanInfo.deserializer = clsProcessUsing;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processJacksonJsonProperty$11(Annotation annotation, FieldInfo fieldInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    int iHashCode = name.hashCode();
                                                    if (iHashCode == -1423461020) {
                                                        if (name.equals(bv.Q)) {
                                                            fieldInfo.ignore = "READ_ONLY".equals(((Enum) objInvoke).name());
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (iHashCode == -393139297) {
                                                        if (name.equals("required") && ((Boolean) objInvoke).booleanValue()) {
                                                            fieldInfo.required = true;
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (iHashCode == 111972721 && name.equals("value")) {
                                                        String str = (String) objInvoke;
                                                        if (str.isEmpty()) {
                                                            return;
                                                        }
                                                        String str2 = fieldInfo.fieldName;
                                                        if (str2 == null || str2.isEmpty()) {
                                                            fieldInfo.fieldName = str;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processJacksonJsonSetter$12(Annotation annotation, FieldInfo fieldInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if (name.hashCode() == 111972721 && name.equals("value")) {
                                                        String str = (String) objInvoke;
                                                        if (str.isEmpty()) {
                                                            return;
                                                        }
                                                        fieldInfo.fieldName = str;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processJacksonJsonSubTypes$4(Annotation annotation, BeanInfo beanInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if ("value".equals(name)) {
                                                        Object[] objArr = (Object[]) objInvoke;
                                                        if (objArr.length != 0) {
                                                            beanInfo.seeAlso = new Class[objArr.length];
                                                            beanInfo.seeAlsoNames = new String[objArr.length];
                                                            for (int i = 0; i < objArr.length; i++) {
                                                                BeanUtils.processJacksonJsonSubTypesType(beanInfo, i, (Annotation) objArr[i]);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processJacksonJsonTypeInfo$6(Annotation annotation, BeanInfo beanInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if ("property".equals(name)) {
                                                        String str = (String) objInvoke;
                                                        if (str.isEmpty()) {
                                                            return;
                                                        }
                                                        beanInfo.typeKey = str;
                                                        beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static /* synthetic */ void lambda$processSeeAlsoAnnotation$8(Annotation annotation, BeanInfo beanInfo, Method method) {
                                                String name = method.getName();
                                                try {
                                                    Object objInvoke = method.invoke(annotation, null);
                                                    if ("typeName".equals(name)) {
                                                        String str = (String) objInvoke;
                                                        if (str.isEmpty()) {
                                                            return;
                                                        }
                                                        beanInfo.typeName = str;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
                                            /* JADX WARN: Code duplicated, block: B:18:0x0049  */
                                            /* JADX WARN: Code duplicated, block: B:20:0x0051  */
                                            /* JADX WARN: Code duplicated, block: B:22:0x0059  */
                                            /* JADX WARN: Code duplicated, block: B:24:0x0061  */
                                            /* JADX WARN: Code duplicated, block: B:26:0x0069  */
                                            /* JADX WARN: Code duplicated, block: B:28:0x0071  */
                                            /* JADX WARN: Code duplicated, block: B:30:0x0079  */
                                            /* JADX WARN: Code duplicated, block: B:32:0x0081  */
                                            /* JADX WARN: Code duplicated, block: B:34:0x0089  */
                                            /* JADX WARN: Code duplicated, block: B:39:0x009c  */
                                            /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
                                            /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
                                            /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
                                            /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
                                            /* JADX WARN: Code duplicated, block: B:48:0x00bc A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:49:0x00be  */
                                            /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
                                            /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
                                            /* JADX WARN: Code duplicated, block: B:54:0x00ce A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
                                            /* JADX WARN: Code duplicated, block: B:56:0x00da  */
                                            /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
                                            /* JADX WARN: Code duplicated, block: B:66:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:68:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:70:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:72:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:76:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:80:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:82:0x00e3 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:9:0x001b  */
                                            private void processAnnotation(FieldInfo fieldInfo, Annotation[] annotationArr) {
                                                boolean zIsUseJacksonAnnotation;
                                                String name;
                                                for (Annotation annotation : annotationArr) {
                                                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                    JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
                                                    if (jSONField != null) {
                                                        getFieldInfo(fieldInfo, jSONField);
                                                        if (jSONField != annotation) {
                                                            if (clsAnnotationType == JSONCompiler.class && ((JSONCompiler) annotation).value() == JSONCompiler.CompilerOption.LAMBDA) {
                                                                fieldInfo.features |= FieldInfo.JIT;
                                                            }
                                                            zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                                                            name = clsAnnotationType.getName();
                                                            if (name.equals("com.google.gson.annotations.SerializedName")) {
                                                                if (JSONFactory.isUseGsonAnnotation()) {
                                                                    BeanUtils.processGsonSerializedName(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonManagedReference")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    fieldInfo.features |= JSONWriter.Feature.ReferenceDetection.mask;
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonDeserialize(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    BeanUtils.processJacksonJsonFormat(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonSetter")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonSetter(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonAlias(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonProperty(fieldInfo, annotation);
                                                                }
                                                            } else if (!name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                                                processJSONField1x(fieldInfo, annotation);
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonBackReference") && zIsUseJacksonAnnotation) {
                                                                fieldInfo.features |= FieldInfo.BACKR_REFERENCE;
                                                            }
                                                        }
                                                    } else {
                                                        if (clsAnnotationType == JSONCompiler.class) {
                                                            fieldInfo.features |= FieldInfo.JIT;
                                                        }
                                                        zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                                                        name = clsAnnotationType.getName();
                                                        if (name.equals("com.google.gson.annotations.SerializedName")) {
                                                            if (name.equals("com.fasterxml.jackson.annotation.JsonManagedReference")) {
                                                                if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                                                                    if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                                                                        if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                                                                            if (name.equals("com.fasterxml.jackson.annotation.JsonSetter")) {
                                                                                if (name.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                                                                                    if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                                                                                        if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                                                                                            if (!name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                                                                                processJSONField1x(fieldInfo, annotation);
                                                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonBackReference")) {
                                                                                                fieldInfo.features |= FieldInfo.BACKR_REFERENCE;
                                                                                            }
                                                                                        } else if (zIsUseJacksonAnnotation) {
                                                                                            processJacksonJsonProperty(fieldInfo, annotation);
                                                                                        }
                                                                                    } else if (zIsUseJacksonAnnotation) {
                                                                                        fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                                                    }
                                                                                } else if (zIsUseJacksonAnnotation) {
                                                                                    processJacksonJsonAlias(fieldInfo, annotation);
                                                                                }
                                                                            } else if (zIsUseJacksonAnnotation) {
                                                                                processJacksonJsonSetter(fieldInfo, annotation);
                                                                            }
                                                                        } else if (zIsUseJacksonAnnotation) {
                                                                            BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation);
                                                                        }
                                                                    } else if (zIsUseJacksonAnnotation) {
                                                                        BeanUtils.processJacksonJsonFormat(fieldInfo, annotation);
                                                                    }
                                                                } else if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonDeserialize(fieldInfo, annotation);
                                                                }
                                                            } else if (zIsUseJacksonAnnotation) {
                                                                fieldInfo.features |= JSONWriter.Feature.ReferenceDetection.mask;
                                                            }
                                                        } else if (JSONFactory.isUseGsonAnnotation()) {
                                                            BeanUtils.processGsonSerializedName(fieldInfo, annotation);
                                                        }
                                                    }
                                                }
                                            }

                                            private void processBuilder(BeanInfo beanInfo, Class cls) {
                                                if (cls == Void.TYPE || cls == Void.class) {
                                                    return;
                                                }
                                                beanInfo.builder = cls;
                                                for (Annotation annotation : BeanUtils.getAnnotations(cls)) {
                                                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                    String name = clsAnnotationType.getName();
                                                    if ("com.alibaba.fastjson.annotation.JSONPOJOBuilder".equals(name) || "com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder".equals(name)) {
                                                        ObjectReaderBaseModule.this.getBeanInfo1xJSONPOJOBuilder(beanInfo, cls, annotation, clsAnnotationType);
                                                    } else {
                                                        JSONBuilder jSONBuilder = (JSONBuilder) BeanUtils.findAnnotation(cls, JSONBuilder.class);
                                                        if (jSONBuilder != null) {
                                                            beanInfo.buildMethod = BeanUtils.buildMethod(cls, jSONBuilder.buildMethod());
                                                            String strWithPrefix = jSONBuilder.withPrefix();
                                                            if (!strWithPrefix.isEmpty()) {
                                                                beanInfo.builderWithPrefix = strWithPrefix;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (beanInfo.buildMethod == null) {
                                                    beanInfo.buildMethod = BeanUtils.buildMethod(cls, "build");
                                                }
                                                if (beanInfo.buildMethod == null) {
                                                    beanInfo.buildMethod = BeanUtils.buildMethod(cls, "create");
                                                }
                                            }

                                            private void processJSONField1x(FieldInfo fieldInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C0385(annotation, fieldInfo, 6));
                                            }

                                            private void processJacksonJsonAlias(FieldInfo fieldInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C0385(annotation, fieldInfo, 4));
                                            }

                                            private void processJacksonJsonDeserialize(FieldInfo fieldInfo, Annotation annotation) {
                                                if (JSONFactory.isUseJacksonAnnotation()) {
                                                    BeanUtils.annotationMethods(annotation.getClass(), new C2277(this, annotation, fieldInfo));
                                                }
                                            }

                                            private void processJacksonJsonDeserializer(BeanInfo beanInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C2280(this, annotation, beanInfo, 0));
                                            }

                                            private void processJacksonJsonProperty(FieldInfo fieldInfo, Annotation annotation) {
                                                if (JSONFactory.isUseJacksonAnnotation()) {
                                                    BeanUtils.annotationMethods(annotation.getClass(), new C0385(annotation, fieldInfo, 7));
                                                }
                                            }

                                            private void processJacksonJsonSetter(FieldInfo fieldInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C0385(annotation, fieldInfo, 5));
                                            }

                                            private void processJacksonJsonSubTypes(BeanInfo beanInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C0384(annotation, beanInfo, 9));
                                            }

                                            private void processJacksonJsonTypeInfo(BeanInfo beanInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C0384(annotation, beanInfo, 7));
                                            }

                                            private void processSeeAlsoAnnotation(BeanInfo beanInfo, Class<?> cls) {
                                                Class cls2 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls);
                                                if (cls2 == null && "org.apache.commons.lang3.tuple.Triple".equals(cls.getName())) {
                                                    ObjectReaderBaseModule.this.provider.mixIn(cls, ApacheLang3Support.TripleMixIn.class);
                                                    cls2 = ApacheLang3Support.TripleMixIn.class;
                                                }
                                                if (cls2 != null && cls2 != cls) {
                                                    beanInfo.mixIn = true;
                                                    processSeeAlsoAnnotation(beanInfo, BeanUtils.getAnnotations(cls2));
                                                }
                                                processSeeAlsoAnnotation(beanInfo, BeanUtils.getAnnotations(cls));
                                            }

                                            private Class processUsing(Class cls) {
                                                if ("com.fasterxml.jackson.databind.JsonDeserializer$None".equals(cls.getName()) || !ObjectReader.class.isAssignableFrom(cls)) {
                                                    return null;
                                                }
                                                return cls;
                                            }

                                            @Override // com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor
                                            public void getBeanInfo(final BeanInfo beanInfo, final Class<?> cls) {
                                                Class cls2 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls);
                                                if (cls2 == null && "org.apache.commons.lang3.tuple.Triple".equals(cls.getName())) {
                                                    ObjectReaderBaseModule.this.provider.mixIn(cls, ApacheLang3Support.TripleMixIn.class);
                                                    cls2 = ApacheLang3Support.TripleMixIn.class;
                                                }
                                                final int i = 0;
                                                final int i2 = 1;
                                                if (cls2 != null && cls2 != cls) {
                                                    beanInfo.mixIn = true;
                                                    getBeanInfo(beanInfo, BeanUtils.getAnnotations(cls2));
                                                    BeanUtils.staticMethod(cls2, new Consumer(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤝᲇᤞ

                                                        /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                                                        public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7401;

                                                        {
                                                            this.f7401 = this;
                                                        }

                                                        @Override // java.util.function.Consumer
                                                        public final void accept(Object obj) {
                                                            switch (i) {
                                                                case 0:
                                                                    this.f7401.lambda$getBeanInfo$0(beanInfo, cls, (Method) obj);
                                                                    break;
                                                                case 1:
                                                                    this.f7401.lambda$getBeanInfo$1(beanInfo, cls, (Constructor) obj);
                                                                    break;
                                                                case 2:
                                                                    this.f7401.lambda$getBeanInfo$2(beanInfo, cls, (Method) obj);
                                                                    break;
                                                                default:
                                                                    this.f7401.lambda$getBeanInfo$3(beanInfo, cls, (Constructor) obj);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    BeanUtils.constructor(cls2, new Consumer(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤝᲇᤞ

                                                        /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                                                        public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7401;

                                                        {
                                                            this.f7401 = this;
                                                        }

                                                        @Override // java.util.function.Consumer
                                                        public final void accept(Object obj) {
                                                            switch (i2) {
                                                                case 0:
                                                                    this.f7401.lambda$getBeanInfo$0(beanInfo, cls, (Method) obj);
                                                                    break;
                                                                case 1:
                                                                    this.f7401.lambda$getBeanInfo$1(beanInfo, cls, (Constructor) obj);
                                                                    break;
                                                                case 2:
                                                                    this.f7401.lambda$getBeanInfo$2(beanInfo, cls, (Method) obj);
                                                                    break;
                                                                default:
                                                                    this.f7401.lambda$getBeanInfo$3(beanInfo, cls, (Constructor) obj);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                Class<? super Object> cls3 = null;
                                                for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class && superclass != Enum.class; superclass = superclass.getSuperclass()) {
                                                    BeanInfo beanInfo2 = new BeanInfo(JSONFactory.getDefaultObjectReaderProvider());
                                                    getBeanInfo(beanInfo2, superclass);
                                                    Class<?>[] clsArr = beanInfo2.seeAlso;
                                                    if (clsArr != null) {
                                                        int length = clsArr.length;
                                                        int i3 = 0;
                                                        while (true) {
                                                            if (i3 >= length) {
                                                                cls3 = superclass;
                                                                break;
                                                            } else if (clsArr[i3] == cls) {
                                                                break;
                                                            } else {
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (cls3 != null) {
                                                    getBeanInfo(beanInfo, cls3);
                                                }
                                                Annotation[] annotations = BeanUtils.getAnnotations(cls);
                                                getBeanInfo(beanInfo, annotations);
                                                for (Annotation annotation : annotations) {
                                                    boolean zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                                                    String name = annotation.annotationType().getName();
                                                    if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                                                        if (zIsUseJacksonAnnotation) {
                                                            processJacksonJsonDeserializer(beanInfo, annotation);
                                                        }
                                                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                                                        if (zIsUseJacksonAnnotation) {
                                                            BeanUtils.processJacksonJsonFormat(beanInfo, annotation);
                                                        }
                                                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                                                        if (zIsUseJacksonAnnotation) {
                                                            processJacksonJsonSubTypes(beanInfo, annotation);
                                                        }
                                                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                                                        if (zIsUseJacksonAnnotation) {
                                                            processJacksonJsonTypeInfo(beanInfo, annotation);
                                                        }
                                                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                                                        if (zIsUseJacksonAnnotation) {
                                                            BeanUtils.processJacksonJsonTypeName(beanInfo, annotation);
                                                        }
                                                    } else if (name.equals("ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᛸᲀᲁᲈ")) {
                                                        beanInfo.kotlin = true;
                                                    } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                                                        getBeanInfo1x(beanInfo, annotation);
                                                    }
                                                }
                                                if (JDKUtils.JVM_VERSION >= 17 && beanInfo.seeAlso == null && cls.isAnnotationPresent(JSONType.class)) {
                                                    try {
                                                        Method method = ObjectReaderBaseModule.METHOD_getPermittedSubclasses;
                                                        if (method == null) {
                                                            method = Class.class.getMethod("getPermittedSubclasses", null);
                                                            ObjectReaderBaseModule.METHOD_getPermittedSubclasses = method;
                                                        }
                                                        Class<?>[] clsArr2 = (Class[]) method.invoke(cls, null);
                                                        beanInfo.seeAlso = clsArr2;
                                                        beanInfo.seeAlsoNames = new String[clsArr2.length];
                                                        while (i < clsArr2.length) {
                                                            Class<?> cls4 = clsArr2[i];
                                                            BeanInfo beanInfo3 = new BeanInfo(ObjectReaderBaseModule.this.provider);
                                                            processSeeAlsoAnnotation(beanInfo3, cls4);
                                                            String simpleName = beanInfo3.typeName;
                                                            if (simpleName == null || simpleName.isEmpty()) {
                                                                simpleName = cls4.getSimpleName();
                                                            }
                                                            beanInfo.seeAlsoNames[i] = simpleName;
                                                            i++;
                                                        }
                                                        beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                                final int i4 = 2;
                                                BeanUtils.staticMethod(cls, new Consumer(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤝᲇᤞ

                                                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                                                    public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7401;

                                                    {
                                                        this.f7401 = this;
                                                    }

                                                    @Override // java.util.function.Consumer
                                                    public final void accept(Object obj) {
                                                        switch (i4) {
                                                            case 0:
                                                                this.f7401.lambda$getBeanInfo$0(beanInfo, cls, (Method) obj);
                                                                break;
                                                            case 1:
                                                                this.f7401.lambda$getBeanInfo$1(beanInfo, cls, (Constructor) obj);
                                                                break;
                                                            case 2:
                                                                this.f7401.lambda$getBeanInfo$2(beanInfo, cls, (Method) obj);
                                                                break;
                                                            default:
                                                                this.f7401.lambda$getBeanInfo$3(beanInfo, cls, (Constructor) obj);
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i5 = 3;
                                                BeanUtils.constructor(cls, new Consumer(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤝᲇᤞ

                                                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                                                    public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7401;

                                                    {
                                                        this.f7401 = this;
                                                    }

                                                    @Override // java.util.function.Consumer
                                                    public final void accept(Object obj) {
                                                        switch (i5) {
                                                            case 0:
                                                                this.f7401.lambda$getBeanInfo$0(beanInfo, cls, (Method) obj);
                                                                break;
                                                            case 1:
                                                                this.f7401.lambda$getBeanInfo$1(beanInfo, cls, (Constructor) obj);
                                                                break;
                                                            case 2:
                                                                this.f7401.lambda$getBeanInfo$2(beanInfo, cls, (Method) obj);
                                                                break;
                                                            default:
                                                                this.f7401.lambda$getBeanInfo$3(beanInfo, cls, (Constructor) obj);
                                                                break;
                                                        }
                                                    }
                                                });
                                                if (beanInfo.creatorConstructor == null && (beanInfo.readerFeatures & JSONReader.Feature.FieldBased.mask) == 0 && beanInfo.kotlin) {
                                                    KotlinUtils.getConstructor(cls, beanInfo);
                                                }
                                            }

                                            public void getBeanInfo1x(BeanInfo beanInfo, Annotation annotation) {
                                                BeanUtils.annotationMethods(annotation.getClass(), new C2280(this, annotation, beanInfo, 1));
                                            }

                                            @Override // com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor
                                            public void getFieldInfo(FieldInfo fieldInfo, Class cls, Constructor constructor, int i, Parameter parameter) {
                                                Class cls2;
                                                Constructor declaredConstructor;
                                                Annotation[] annotations = null;
                                                if (cls != null && (cls2 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls)) != null && cls2 != cls) {
                                                    try {
                                                        declaredConstructor = cls2.getDeclaredConstructor(constructor.getParameterTypes());
                                                    } catch (NoSuchMethodException unused) {
                                                        declaredConstructor = null;
                                                    }
                                                    if (declaredConstructor != null) {
                                                        processAnnotation(fieldInfo, BeanUtils.getAnnotations(declaredConstructor.getParameters()[i]));
                                                    }
                                                }
                                                if (Modifier.isStatic(constructor.getDeclaringClass().getModifiers())) {
                                                    try {
                                                        annotations = BeanUtils.getAnnotations(parameter);
                                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    }
                                                } else {
                                                    Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                                                    if (parameterAnnotations.length != constructor.getParameterCount()) {
                                                        i--;
                                                    }
                                                    if (i >= 0 && i < parameterAnnotations.length) {
                                                        annotations = parameterAnnotations[i];
                                                    }
                                                }
                                                if (annotations == null || annotations.length <= 0) {
                                                    return;
                                                }
                                                processAnnotation(fieldInfo, annotations);
                                            }

                                            private void processSeeAlsoAnnotation(BeanInfo beanInfo, Annotation[] annotationArr) {
                                                for (Annotation annotation : annotationArr) {
                                                    BeanUtils.annotationMethods(annotation.annotationType(), new C0384(annotation, beanInfo, 8));
                                                }
                                            }

                                            @Override // com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor
                                            public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method, int i, Parameter parameter) {
                                                Class cls2;
                                                Method method2;
                                                if (cls != null && (cls2 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls)) != null && cls2 != cls) {
                                                    try {
                                                        method2 = cls2.getMethod(method.getName(), method.getParameterTypes());
                                                    } catch (NoSuchMethodException unused) {
                                                        method2 = null;
                                                    }
                                                    if (method2 != null) {
                                                        processAnnotation(fieldInfo, BeanUtils.getAnnotations(method2.getParameters()[i]));
                                                    }
                                                }
                                                processAnnotation(fieldInfo, BeanUtils.getAnnotations(parameter));
                                            }

                                            @Override // com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor
                                            public void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
                                                Class cls2;
                                                Field declaredField;
                                                if (cls != null && (cls2 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls)) != null && cls2 != cls) {
                                                    try {
                                                        declaredField = cls2.getDeclaredField(field.getName());
                                                    } catch (Exception unused) {
                                                        declaredField = null;
                                                    }
                                                    if (declaredField != null) {
                                                        getFieldInfo(fieldInfo, cls2, declaredField);
                                                    }
                                                }
                                                processAnnotation(fieldInfo, BeanUtils.getAnnotations(field));
                                            }

                                            /* JADX WARN: Code duplicated, block: B:106:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:108:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:110:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:112:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:114:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:116:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:118:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:120:0x010f A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:31:0x007b A[PHI: r9
                                              0x007b: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:27:0x006e, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
                                            /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
                                            /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                                            /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
                                            /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
                                            /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
                                            /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
                                            /* JADX WARN: Code duplicated, block: B:53:0x00da  */
                                            /* JADX WARN: Code duplicated, block: B:54:0x00de A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
                                            /* JADX WARN: Code duplicated, block: B:56:0x00e8 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
                                            /* JADX WARN: Code duplicated, block: B:58:0x00ee A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
                                            /* JADX WARN: Code duplicated, block: B:60:0x00f4 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
                                            /* JADX WARN: Code duplicated, block: B:62:0x00fa A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
                                            /* JADX WARN: Code duplicated, block: B:64:0x0100 A[DONT_INVERT] */
                                            /* JADX WARN: Code duplicated, block: B:65:0x0102  */
                                            /* JADX WARN: Code duplicated, block: B:66:0x0106  */
                                            /* JADX WARN: Code duplicated, block: B:68:0x010c  */
                                            @Override // com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor
                                            public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method) {
                                                String str;
                                                String str2;
                                                char cCharAt;
                                                char cCharAt2;
                                                boolean zIsUseJacksonAnnotation;
                                                String name;
                                                Method declaredMethod;
                                                Method method2;
                                                String name2 = method.getName();
                                                String str3 = null;
                                                if (cls != null) {
                                                    Class superclass = cls.getSuperclass();
                                                    Method method3 = BeanUtils.getMethod(superclass, method);
                                                    if (method3 != null) {
                                                        getFieldInfo(fieldInfo, superclass, method3);
                                                    }
                                                    for (Class<?> cls2 : cls.getInterfaces()) {
                                                        if (cls2 != Serializable.class && (method2 = BeanUtils.getMethod(cls2, method)) != null) {
                                                            getFieldInfo(fieldInfo, superclass, method2);
                                                        }
                                                    }
                                                    Class cls3 = ObjectReaderBaseModule.this.provider.mixInCache.get(cls);
                                                    if (cls3 != null && cls3 != cls) {
                                                        try {
                                                            declaredMethod = cls3.getDeclaredMethod(name2, method.getParameterTypes());
                                                        } catch (Exception unused) {
                                                            declaredMethod = null;
                                                        }
                                                        if (declaredMethod != null) {
                                                            getFieldInfo(fieldInfo, cls3, declaredMethod);
                                                        }
                                                    }
                                                }
                                                String strName = null;
                                                for (Annotation annotation : BeanUtils.getAnnotations(method)) {
                                                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                    JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
                                                    if (jSONField != null) {
                                                        getFieldInfo(fieldInfo, jSONField);
                                                        strName = jSONField.name();
                                                        if (jSONField != annotation) {
                                                            if (clsAnnotationType == JSONCompiler.class && ((JSONCompiler) annotation).value() == JSONCompiler.CompilerOption.LAMBDA) {
                                                                fieldInfo.features |= FieldInfo.JIT;
                                                            }
                                                            zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                                                            name = clsAnnotationType.getName();
                                                            if (name.equals("com.google.gson.annotations.SerializedName")) {
                                                                if (JSONFactory.isUseGsonAnnotation()) {
                                                                    BeanUtils.processGsonSerializedName(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonDeserialize(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    BeanUtils.processJacksonJsonFormat(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonAlias(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    processJacksonJsonProperty(fieldInfo, annotation);
                                                                }
                                                            } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnySetter")) {
                                                                if (zIsUseJacksonAnnotation) {
                                                                    fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                                }
                                                            } else if (!name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                                                processJSONField1x(fieldInfo, annotation);
                                                            }
                                                        }
                                                    } else {
                                                        if (clsAnnotationType == JSONCompiler.class) {
                                                            fieldInfo.features |= FieldInfo.JIT;
                                                        }
                                                        zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                                                        name = clsAnnotationType.getName();
                                                        if (name.equals("com.google.gson.annotations.SerializedName")) {
                                                            if (name.equals("com.fasterxml.jackson.databind.annotation.JsonDeserialize")) {
                                                                if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                                                                    if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                                                                        if (name.equals("com.fasterxml.jackson.annotation.JsonAlias")) {
                                                                            if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                                                                                if (name.equals("com.fasterxml.jackson.annotation.JsonAnySetter")) {
                                                                                    if (!name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                                                                        processJSONField1x(fieldInfo, annotation);
                                                                                    }
                                                                                } else if (zIsUseJacksonAnnotation) {
                                                                                    fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                                                }
                                                                            } else if (zIsUseJacksonAnnotation) {
                                                                                processJacksonJsonProperty(fieldInfo, annotation);
                                                                            }
                                                                        } else if (zIsUseJacksonAnnotation) {
                                                                            processJacksonJsonAlias(fieldInfo, annotation);
                                                                        }
                                                                    } else if (zIsUseJacksonAnnotation) {
                                                                        BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation);
                                                                    }
                                                                } else if (zIsUseJacksonAnnotation) {
                                                                    BeanUtils.processJacksonJsonFormat(fieldInfo, annotation);
                                                                }
                                                            } else if (zIsUseJacksonAnnotation) {
                                                                processJacksonJsonDeserialize(fieldInfo, annotation);
                                                            }
                                                        } else if (JSONFactory.isUseGsonAnnotation()) {
                                                            BeanUtils.processGsonSerializedName(fieldInfo, annotation);
                                                        }
                                                    }
                                                }
                                                if (name2.startsWith("set")) {
                                                    str = BeanUtils.setterName(name2, (String) null);
                                                } else {
                                                    str = BeanUtils.getterName(name2, (String) null);
                                                }
                                                String str4 = str;
                                                if (str4.length() <= 1 || (cCharAt = str4.charAt(0)) < 'A' || cCharAt > 'Z' || (cCharAt2 = str4.charAt(1)) < 'A' || cCharAt2 > 'Z' || !(strName == null || strName.isEmpty())) {
                                                    str2 = null;
                                                } else {
                                                    char[] charArray = str4.toCharArray();
                                                    charArray[0] = (char) (charArray[0] + ' ');
                                                    String str5 = new String(charArray);
                                                    charArray[1] = (char) (charArray[1] + ' ');
                                                    str3 = new String(charArray);
                                                    str2 = str5;
                                                }
                                                BeanUtils.declaredFields(cls, new C2279(this, str4, fieldInfo, cls, str2, str3));
                                                if (str2 != null && fieldInfo.fieldName == null && fieldInfo.alternateNames == null) {
                                                    fieldInfo.alternateNames = new String[]{str2, str3};
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:9:0x001a  */
                                            private void getBeanInfo(BeanInfo beanInfo, Annotation[] annotationArr) {
                                                for (Annotation annotation : annotationArr) {
                                                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                    JSONType jSONType = (JSONType) BeanUtils.findAnnotation(annotation, JSONType.class);
                                                    if (jSONType != null) {
                                                        getBeanInfo1x(beanInfo, annotation);
                                                        if (jSONType != annotation) {
                                                            if (clsAnnotationType != JSONCompiler.class && ((JSONCompiler) annotation).value() == JSONCompiler.CompilerOption.LAMBDA) {
                                                                beanInfo.readerFeatures |= FieldInfo.JIT;
                                                            }
                                                        }
                                                    } else if (clsAnnotationType != JSONCompiler.class) {
                                                    }
                                                }
                                            }

                                            private void getFieldInfo(FieldInfo fieldInfo, JSONField jSONField) {
                                                if (jSONField == null) {
                                                    return;
                                                }
                                                String strName = jSONField.name();
                                                if (!strName.isEmpty()) {
                                                    fieldInfo.fieldName = strName;
                                                }
                                                String str = jSONField.format();
                                                if (!str.isEmpty()) {
                                                    String strTrim = str.trim();
                                                    if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                                                        strTrim = strTrim.replace("T", "'T'");
                                                    }
                                                    fieldInfo.format = strTrim;
                                                }
                                                String strLabel = jSONField.label();
                                                if (!strLabel.isEmpty()) {
                                                    fieldInfo.label = strLabel.trim();
                                                }
                                                String strDefaultValue = jSONField.defaultValue();
                                                if (!strDefaultValue.isEmpty()) {
                                                    fieldInfo.defaultValue = strDefaultValue;
                                                }
                                                String strLocale = jSONField.locale();
                                                if (!strLocale.isEmpty()) {
                                                    String[] strArrSplit = strLocale.split("_");
                                                    if (strArrSplit.length == 2) {
                                                        fieldInfo.locale = new Locale(strArrSplit[0], strArrSplit[1]);
                                                    }
                                                }
                                                String[] strArrAlternateNames = jSONField.alternateNames();
                                                if (strArrAlternateNames.length != 0) {
                                                    if (fieldInfo.alternateNames == null) {
                                                        fieldInfo.alternateNames = strArrAlternateNames;
                                                    } else {
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet(strArrAlternateNames.length + fieldInfo.alternateNames.length, 1.0f);
                                                        Collections.addAll(linkedHashSet, strArrAlternateNames);
                                                        Collections.addAll(linkedHashSet, fieldInfo.alternateNames);
                                                        fieldInfo.alternateNames = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                                                    }
                                                }
                                                boolean zDeserialize = jSONField.deserialize();
                                                boolean z = !zDeserialize;
                                                if (!fieldInfo.ignore) {
                                                    fieldInfo.ignore = z;
                                                }
                                                for (JSONReader.Feature feature : jSONField.deserializeFeatures()) {
                                                    fieldInfo.features |= feature.mask;
                                                    if (fieldInfo.ignore && zDeserialize && feature == JSONReader.Feature.FieldBased) {
                                                        fieldInfo.ignore = false;
                                                    }
                                                }
                                                int iOrdinal = jSONField.ordinal();
                                                if (iOrdinal != 0) {
                                                    fieldInfo.ordinal = iOrdinal;
                                                }
                                                if (jSONField.value()) {
                                                    fieldInfo.features |= FieldInfo.VALUE_MASK;
                                                }
                                                if (jSONField.unwrapped()) {
                                                    fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                                                }
                                                if (jSONField.required()) {
                                                    fieldInfo.required = true;
                                                }
                                                String strTrim2 = jSONField.schema().trim();
                                                if (!strTrim2.isEmpty()) {
                                                    fieldInfo.schema = strTrim2;
                                                }
                                                Class<?> clsDeserializeUsing = jSONField.deserializeUsing();
                                                if (ObjectReader.class.isAssignableFrom(clsDeserializeUsing)) {
                                                    fieldInfo.readUsing = clsDeserializeUsing;
                                                }
                                                String strTrim3 = jSONField.arrayToMapKey().trim();
                                                if (!strTrim3.isEmpty()) {
                                                    fieldInfo.arrayToMapKey = strTrim3;
                                                }
                                                Class<?> clsArrayToMapDuplicateHandler = jSONField.arrayToMapDuplicateHandler();
                                                if (clsArrayToMapDuplicateHandler != Void.class) {
                                                    fieldInfo.arrayToMapDuplicateHandler = clsArrayToMapDuplicateHandler;
                                                }
                                                Class<?> clsContentAs = jSONField.contentAs();
                                                if (clsContentAs != Void.class) {
                                                    fieldInfo.contentAs = clsContentAs;
                                                }
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public void getCreator(BeanInfo beanInfo, Class<?> cls, Method method) {
                                            if (method.getDeclaringClass() == Enum.class) {
                                                return;
                                            }
                                            String name = method.getName();
                                            if (cls.isEnum() && "values".equals(name)) {
                                                return;
                                            }
                                            Annotation[] annotations = BeanUtils.getAnnotations(method);
                                            int length = annotations.length;
                                            Method declaredMethod = null;
                                            int i = 0;
                                            JSONCreator jSONCreator = null;
                                            boolean z = false;
                                            while (i < length) {
                                                Annotation annotation = annotations[i];
                                                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                JSONCreator jSONCreator2 = (JSONCreator) BeanUtils.findAnnotation(annotation, JSONCreator.class);
                                                if (jSONCreator2 != annotation) {
                                                    String name2 = clsAnnotationType.getName();
                                                    if (name2.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                                                        if (JSONFactory.isUseJacksonAnnotation()) {
                                                            BeanUtils.annotationMethods(clsAnnotationType, new C0384(annotation, beanInfo, 5));
                                                            z = true;
                                                        }
                                                    } else if (name2.equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                                                        BeanUtils.annotationMethods(clsAnnotationType, new C0384(annotation, beanInfo, 4));
                                                        z = true;
                                                    }
                                                }
                                                i++;
                                                jSONCreator = jSONCreator2;
                                            }
                                            if (jSONCreator != null) {
                                                String[] strArrParameterNames = jSONCreator.parameterNames();
                                                if (strArrParameterNames.length != 0) {
                                                    beanInfo.createParameterNames = strArrParameterNames;
                                                }
                                                z = true;
                                            }
                                            if (z) {
                                                try {
                                                    declaredMethod = cls.getDeclaredMethod(name, method.getParameterTypes());
                                                } catch (NoSuchMethodException unused) {
                                                }
                                                if (declaredMethod != null) {
                                                    beanInfo.createMethod = declaredMethod;
                                                }
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static /* synthetic */ Object lambda$init$0(Object obj) {
                                            return obj;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static /* synthetic */ Object lambda$init$1(Object obj) {
                                            return obj;
                                        }
                                    }
