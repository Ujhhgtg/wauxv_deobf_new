package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONCompiler;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.support.money.MoneySupport;
import com.alibaba.fastjson2.util.ApacheLang3Support;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.JodaSupport;
import com.alibaba.fastjson2.util.KotlinUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.ek;
import com.umeng.ccg.a;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
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
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0409;
import p000.C0410;
import p000.C1686;
import p000.C2246;
import p000.C2257;
import p000.C2261;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterBaseModule implements ObjectWriterModule {
    static ObjectWriterAdapter STACK_TRACE_ELEMENT_WRITER;
    final WriterAnnotationProcessor annotationProcessor = new WriterAnnotationProcessor();
    final ObjectWriterProvider provider;

    public ObjectWriterBaseModule(ObjectWriterProvider objectWriterProvider) {
        this.provider = objectWriterProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    private ObjectWriter createEnumWriter(Class cls) throws NoSuchMethodException {
        Class cls2;
        if (cls.isEnum()) {
            cls2 = cls;
        } else {
            Class superclass = cls.getSuperclass();
            if (superclass.isEnum()) {
                cls2 = superclass;
            } else {
                cls2 = cls;
            }
        }
        Member enumValueField = BeanUtils.getEnumValueField(cls2, this.provider);
        if (enumValueField == null) {
            Member enumValueField2 = BeanUtils.getEnumValueField(this.provider.mixInCache.get(cls2), this.provider);
            if (enumValueField2 instanceof Field) {
                try {
                    enumValueField = cls2.getField(((Field) enumValueField2).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else if (enumValueField2 instanceof Method) {
                enumValueField = cls2.getMethod(((Method) enumValueField2).getName(), null);
            }
        }
        Member member = enumValueField;
        BeanInfo beanInfoCreateBeanInfo = this.provider.createBeanInfo();
        for (Class<?> cls3 : cls2.getInterfaces()) {
            this.annotationProcessor.getBeanInfo(beanInfoCreateBeanInfo, cls3);
        }
        this.annotationProcessor.getBeanInfo(beanInfoCreateBeanInfo, cls2);
        if (beanInfoCreateBeanInfo.writeEnumAsJavaBean) {
            return null;
        }
        return new ObjectWriterImplEnum(null, cls2, member, BeanUtils.getEnumAnnotationNames(cls2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$getObjectWriter$0(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // com.alibaba.fastjson2.modules.ObjectWriterModule
    public ObjectWriterAnnotationProcessor getAnnotationProcessor() {
        return this.annotationProcessor;
    }

    public ObjectWriter getExternalObjectWriter(String str, Class cls) {
        str.getClass();
        switch (str) {
            case "org.joda.time.LocalDate":
                return JodaSupport.createLocalDateWriter(cls, null);
            case "org.joda.time.chrono.GregorianChronology":
                return JodaSupport.createGregorianChronologyWriter(cls);
            case "java.sql.Time":
                return JdbcSupport.createTimeWriter(null);
            case "org.joda.time.chrono.ISOChronology":
                return JodaSupport.createISOChronologyWriter(cls);
            case "org.joda.time.DateTime":
                return new ObjectWriterImplZonedDateTime(null, null, new JodaSupport.DateTime2ZDT());
            case "java.sql.Timestamp":
                return JdbcSupport.createTimestampWriter(cls, null);
            case "org.joda.time.LocalDateTime":
                return JodaSupport.createLocalDateTimeWriter(cls, null);
            default:
                if (JdbcSupport.isClob(cls)) {
                    return JdbcSupport.createClobWriter(cls);
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0197, code lost:
    
        if (r3.equals("gnu.trove.list.array.TDoubleArrayList") == false) goto L127;
     */
    @Override // com.alibaba.fastjson2.modules.ObjectWriterModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ObjectWriter getObjectWriter(Type type, Class cls) {
        Class mapping;
        ObjectWriter objectWriterCreateEnumWriter;
        Type type2 = type;
        if (type2 == String.class) {
            return ObjectWriterImplString.INSTANCE;
        }
        if (cls == null) {
            mapping = type2 instanceof Class ? (Class) type2 : TypeUtils.getMapping(type2);
        } else {
            mapping = cls;
        }
        String name = mapping.getName();
        ObjectWriter externalObjectWriter = getExternalObjectWriter(name, mapping);
        if (externalObjectWriter != null) {
            return externalObjectWriter;
        }
        if (!name.equals("java.awt.Color")) {
            if (!name.equals("java.util.regex.Pattern")) {
                if (!name.equals("com.google.common.collect.AbstractMapBasedMultimap$WrappedSet")) {
                    if (!name.equals("com.carrotsearch.hppc.LongHashSet") && !name.equals("gnu.trove.set.hash.TShortHashSet") && !name.equals("com.carrotsearch.hppc.CharHashSet")) {
                        if (!name.equals("java.nio.DirectByteBuffer")) {
                            if (name.equals("com.fasterxml.jackson.databind.node.ObjectNode")) {
                                return ObjectWriterImplToString.DIRECT;
                            }
                            if (name.equals("org.javamoney.moneta.internal.JDKCurrencyAdapter")) {
                                return ObjectWriterImplToString.INSTANCE;
                            }
                            if (!name.equals("com.carrotsearch.hppc.CharArrayList") && !name.equals("com.carrotsearch.hppc.IntArrayList") && !name.equals("gnu.trove.list.array.TLongArrayList") && !name.equals("com.carrotsearch.hppc.BitSet")) {
                                if (!name.equals("java.nio.HeapByteBuffer")) {
                                    if (!name.equals("gnu.trove.list.array.TShortArrayList") && !name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                        if (!name.equals("org.apache.commons.lang3.tuple.MutablePair")) {
                                            if (!name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                                if (!name.equals("java.nio.HeapByteBufferR")) {
                                                    if (name.equals("org.javamoney.moneta.Money")) {
                                                        return MoneySupport.createMonetaryAmountWriter();
                                                    }
                                                    if (!name.equals("org.apache.commons.lang3.tuple.Pair")) {
                                                        if (!name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                                            if (!name.equals("java.nio.MappedByteBuffer")) {
                                                                if (!name.equals("com.carrotsearch.hppc.ByteArrayList") && !name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                                                    if (!name.equals("net.sf.json.JSONNull")) {
                                                                        if (name.equals("org.javamoney.moneta.spi.DefaultNumberValue")) {
                                                                            return MoneySupport.createNumberValueWriter();
                                                                        }
                                                                        if (!name.equals("java.net.Inet6Address") && !name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                                                                            if (!name.equals("gnu.trove.list.array.TCharArrayList")) {
                                                                                if (!name.equals("org.apache.commons.lang3.tuple.ImmutablePair")) {
                                                                                    if (!name.equals("gnu.trove.list.array.TFloatArrayList") && !name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                                                                        if (!name.equals("java.net.Inet4Address")) {
                                                                                            if (!name.equals("com.carrotsearch.hppc.FloatArrayList") && !name.equals("com.carrotsearch.hppc.IntHashSet")) {
                                                                                                if (!name.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
                                                                                                    if (!name.equals("java.text.SimpleDateFormat")) {
                                                                                                        if (!name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                                                                            if (!name.equals("java.net.InetSocketAddress")) {
                                                                                                                if (!name.equals("gnu.trove.list.array.TByteArrayList") && !name.equals("org.bson.types.Decimal128") && !name.equals("gnu.trove.set.hash.TByteHashSet") && !name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                                                                                    if (!name.equals("java.nio.DirectByteBufferR")) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return new ApacheLang3Support.PairWriter(mapping);
                                    }
                                }
                            }
                        }
                        return new ObjectWriterImplInt8ValueArray(new C2257(14));
                    }
                    return LambdaMiscCodec.getObjectWriter(type2, mapping);
                }
                return null;
            }
            return ObjectWriterMisc.INSTANCE;
        }
        try {
            return new ObjectWriter4(mapping, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("r", mapping.getMethod("getRed", null)), ObjectWriters.fieldWriter("g", mapping.getMethod("getGreen", null)), ObjectWriters.fieldWriter("b", mapping.getMethod("getBlue", null)), ObjectWriters.fieldWriter("alpha", mapping.getMethod("getAlpha", null))));
        } catch (NoSuchMethodException unused) {
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class || rawType == ArrayList.class) {
                if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                    return ObjectWriterImplListStr.INSTANCE;
                }
                type2 = rawType;
            }
            if (Map.class.isAssignableFrom(mapping)) {
                return ObjectWriterImplMap.of(type2, mapping);
            }
            if (mapping == Optional.class && actualTypeArguments.length == 1) {
                return new ObjectWriterImplOptional(actualTypeArguments[0], null, null);
            }
        }
        if (type2 == LinkedList.class) {
            return ObjectWriterImplList.INSTANCE;
        }
        if (type2 == ArrayList.class || type2 == List.class || List.class.isAssignableFrom(mapping)) {
            return ObjectWriterImplList.INSTANCE;
        }
        if (Collection.class.isAssignableFrom(mapping)) {
            return ObjectWriterImplCollection.INSTANCE;
        }
        if (!BeanUtils.isExtendedMap(mapping)) {
            if (Map.class.isAssignableFrom(mapping)) {
                return ObjectWriterImplMap.of(mapping);
            }
            if (Map.Entry.class.isAssignableFrom(mapping)) {
                return ObjectWriterImplMapEntry.INSTANCE;
            }
            if (Path.class.isAssignableFrom(mapping)) {
                return ObjectWriterImplToString.INSTANCE;
            }
            if (type2 == Integer.class) {
                return ObjectWriterImplInt32.INSTANCE;
            }
            if (type2 == AtomicInteger.class) {
                return ObjectWriterImplAtomicInteger.INSTANCE;
            }
            if (type2 == Byte.class) {
                return ObjectWriterImplInt8.INSTANCE;
            }
            if (type2 == Short.class) {
                return ObjectWriterImplInt16.INSTANCE;
            }
            if (type2 == Long.class) {
                return ObjectWriterImplInt64.INSTANCE;
            }
            if (type2 == AtomicLong.class) {
                return ObjectWriterImplAtomicLong.INSTANCE;
            }
            if (type2 == AtomicReference.class) {
                return ObjectWriterImplAtomicReference.INSTANCE;
            }
            if (type2 == Float.class) {
                return ObjectWriterImplFloat.INSTANCE;
            }
            if (type2 == Double.class) {
                return ObjectWriterImplDouble.INSTANCE;
            }
            if (type2 == BigInteger.class) {
                return ObjectWriterBigInteger.INSTANCE;
            }
            if (type2 == BigDecimal.class) {
                return ObjectWriterImplBigDecimal.INSTANCE;
            }
            if (type2 == BitSet.class) {
                return ObjectWriterImplBitSet.INSTANCE;
            }
            if (type2 == OptionalInt.class) {
                return ObjectWriterImplOptionalInt.INSTANCE;
            }
            if (type2 == OptionalLong.class) {
                return ObjectWriterImplOptionalLong.INSTANCE;
            }
            if (type2 == OptionalDouble.class) {
                return ObjectWriterImplOptionalDouble.INSTANCE;
            }
            if (type2 == Optional.class) {
                return ObjectWriterImplOptional.INSTANCE;
            }
            if (type2 == Boolean.class) {
                return ObjectWriterImplBoolean.INSTANCE;
            }
            if (type2 == AtomicBoolean.class) {
                return ObjectWriterImplAtomicBoolean.INSTANCE;
            }
            if (type2 == AtomicIntegerArray.class) {
                return ObjectWriterImplAtomicIntegerArray.INSTANCE;
            }
            if (type2 == AtomicLongArray.class) {
                return ObjectWriterImplAtomicLongArray.INSTANCE;
            }
            if (type2 == Character.class) {
                return ObjectWriterImplCharacter.INSTANCE;
            }
            if (type2 instanceof Class) {
                Class cls2 = (Class) type2;
                if (TimeUnit.class.isAssignableFrom(cls2)) {
                    return new ObjectWriterImplEnum(null, TimeUnit.class, null, null, 0L);
                }
                if (Enum.class.isAssignableFrom(cls2) && (objectWriterCreateEnumWriter = createEnumWriter(cls2)) != null) {
                    return objectWriterCreateEnumWriter;
                }
                if (JSONPath.class.isAssignableFrom(cls2)) {
                    return ObjectWriterImplToString.INSTANCE;
                }
                if (cls2 == boolean[].class) {
                    return ObjectWriterImplBoolValueArray.INSTANCE;
                }
                if (cls2 == char[].class) {
                    return ObjectWriterImplCharValueArray.INSTANCE;
                }
                if (cls2 == StringBuffer.class || cls2 == StringBuilder.class) {
                    return ObjectWriterImplToString.INSTANCE;
                }
                if (cls2 == byte[].class) {
                    return ObjectWriterImplInt8ValueArray.INSTANCE;
                }
                if (cls2 == short[].class) {
                    return ObjectWriterImplInt16ValueArray.INSTANCE;
                }
                if (cls2 == int[].class) {
                    return ObjectWriterImplInt32ValueArray.INSTANCE;
                }
                if (cls2 == long[].class) {
                    return ObjectWriterImplInt64ValueArray.INSTANCE;
                }
                if (cls2 == float[].class) {
                    return ObjectWriterImplFloatValueArray.INSTANCE;
                }
                if (cls2 == double[].class) {
                    return ObjectWriterImplDoubleValueArray.INSTANCE;
                }
                if (cls2 == Byte[].class) {
                    return ObjectWriterImplInt8Array.INSTANCE;
                }
                if (cls2 == Integer[].class) {
                    return ObjectWriterImplInt32Array.INSTANCE;
                }
                if (cls2 == Long[].class) {
                    return ObjectWriterImplInt64Array.INSTANCE;
                }
                if (String[].class == cls2) {
                    return ObjectWriterImplStringArray.INSTANCE;
                }
                if (BigDecimal[].class == cls2) {
                    return ObjectWriterImpDecimalArray.INSTANCE;
                }
                if (Object[].class.isAssignableFrom(cls2)) {
                    if (cls2 == Object[].class) {
                        return ObjectWriterArray.INSTANCE;
                    }
                    Class<?> componentType = cls2.getComponentType();
                    return Modifier.isFinal(componentType.getModifiers()) ? new ObjectWriterArrayFinal(componentType, null) : new ObjectWriterArray(componentType);
                }
                if (cls2 == UUID.class) {
                    return ObjectWriterImplUUID.INSTANCE;
                }
                if (cls2 == Locale.class) {
                    return ObjectWriterImplLocale.INSTANCE;
                }
                if (cls2 == Currency.class) {
                    return ObjectWriterImplCurrency.INSTANCE;
                }
                if (TimeZone.class.isAssignableFrom(cls2)) {
                    return ObjectWriterImplTimeZone.INSTANCE;
                }
                if (JSONPObject.class.isAssignableFrom(cls2)) {
                    return new ObjectWriterImplJSONP();
                }
                if (cls2 == URI.class || cls2 == URL.class || cls2 == File.class || ZoneId.class.isAssignableFrom(cls2) || Charset.class.isAssignableFrom(cls2)) {
                    return ObjectWriterImplToString.INSTANCE;
                }
                ObjectWriter externalObjectWriter2 = getExternalObjectWriter(cls2.getName(), cls2);
                if (externalObjectWriter2 != null) {
                    return externalObjectWriter2;
                }
                BeanInfo beanInfoCreateBeanInfo = this.provider.createBeanInfo();
                Class mixIn = this.provider.getMixIn(cls2);
                if (mixIn != null) {
                    this.annotationProcessor.getBeanInfo(beanInfoCreateBeanInfo, mixIn);
                }
                if (Date.class.isAssignableFrom(cls2)) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplDate.INSTANCE : new ObjectWriterImplDate(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (Calendar.class.isAssignableFrom(cls2)) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplCalendar.INSTANCE : new ObjectWriterImplCalendar(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (ZonedDateTime.class == cls2) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplZonedDateTime.INSTANCE : new ObjectWriterImplZonedDateTime(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (OffsetDateTime.class == cls2) {
                    return ObjectWriterImplOffsetDateTime.of(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (LocalDateTime.class == cls2) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplLocalDateTime.INSTANCE : new ObjectWriterImplLocalDateTime(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (LocalDate.class == cls2) {
                    return ObjectWriterImplLocalDate.of(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (LocalTime.class == cls2) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplLocalTime.INSTANCE : new ObjectWriterImplLocalTime(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (OffsetTime.class == cls2) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplOffsetTime.INSTANCE : new ObjectWriterImplOffsetTime(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (Instant.class == cls2) {
                    return (beanInfoCreateBeanInfo.format == null && beanInfoCreateBeanInfo.locale == null) ? ObjectWriterImplInstant.INSTANCE : new ObjectWriterImplInstant(beanInfoCreateBeanInfo.format, beanInfoCreateBeanInfo.locale);
                }
                if (Duration.class == cls2 || Period.class == cls2 || Year.class == cls2 || YearMonth.class == cls2 || MonthDay.class == cls2 || HijrahDate.class == cls2 || JapaneseDate.class == cls2 || MinguoDate.class == cls2 || ThaiBuddhistDate.class == cls2) {
                    return ObjectWriterImplToString.INSTANCE;
                }
                if (StackTraceElement.class == cls2) {
                    if (STACK_TRACE_ELEMENT_WRITER == null) {
                        ObjectWriterCreator creator = this.provider.getCreator();
                        STACK_TRACE_ELEMENT_WRITER = new ObjectWriterAdapter(StackTraceElement.class, null, null, 0L, Arrays.asList(creator.createFieldWriter("fileName", String.class, BeanUtils.getDeclaredField(StackTraceElement.class, "fileName"), BeanUtils.getMethod(StackTraceElement.class, "getFileName"), new C2257(21)), creator.createFieldWriter("lineNumber", BeanUtils.getDeclaredField(StackTraceElement.class, "lineNumber"), BeanUtils.getMethod(StackTraceElement.class, "getLineNumber"), new C1686(2)), creator.createFieldWriter("className", String.class, BeanUtils.getDeclaredField(StackTraceElement.class, "declaringClass"), BeanUtils.getMethod(StackTraceElement.class, "getClassName"), new C2257(22)), creator.createFieldWriter("methodName", String.class, BeanUtils.getDeclaredField(StackTraceElement.class, "methodName"), BeanUtils.getMethod(StackTraceElement.class, "getMethodName"), new C2257(23))));
                    }
                    return STACK_TRACE_ELEMENT_WRITER;
                }
                if (Class.class == cls2) {
                    return ObjectWriterImplClass.INSTANCE;
                }
                if (Method.class == cls2) {
                    return new ObjectWriterAdapter(Method.class, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("declaringClass", Class.class, new C2257(24)), ObjectWriters.fieldWriter("name", String.class, new C2257(25)), ObjectWriters.fieldWriter("parameterTypes", Class[].class, new C2257(15))));
                }
                if (Field.class == cls2) {
                    return new ObjectWriterAdapter(Method.class, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("declaringClass", Class.class, new C2257(16)), ObjectWriters.fieldWriter("name", String.class, new C2257(17))));
                }
                if (ParameterizedType.class.isAssignableFrom(cls2)) {
                    return ObjectWriters.objectWriter(ParameterizedType.class, ObjectWriters.fieldWriter("actualTypeArguments", Type[].class, new C2257(18)), ObjectWriters.fieldWriter("ownerType", Type.class, new C2257(19)), ObjectWriters.fieldWriter("rawType", Type.class, new C2257(20)));
                }
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.modules.ObjectWriterModule
    public ObjectWriterProvider getProvider() {
        return this.provider;
    }

    /* JADX INFO: compiled from: obf */
    public class WriterAnnotationProcessor implements ObjectWriterAnnotationProcessor {
        public WriterAnnotationProcessor() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void applyFeatures(FieldInfo fieldInfo, Enum[] enumArr) {
            for (Enum r0 : enumArr) {
                String strName = r0.name();
                strName.getClass();
                byte b = -1;
                switch (strName.hashCode()) {
                    case -2118604473:
                        if (strName.equals("DisableCircularReferenceDetect")) {
                            b = 0;
                        }
                        break;
                    case -1937516631:
                        if (strName.equals("WriteNullNumberAsZero")) {
                            b = 1;
                        }
                        break;
                    case -1779797023:
                        if (strName.equals("IgnoreErrorGetter")) {
                            b = 2;
                        }
                        break;
                    case -527123134:
                        if (strName.equals("UseISO8601DateFormat")) {
                            b = 3;
                        }
                        break;
                    case -348914872:
                        if (strName.equals("WriteBigDecimalAsPlain")) {
                            b = 4;
                        }
                        break;
                    case -335314544:
                        if (strName.equals("WriteEnumUsingToString")) {
                            b = 5;
                        }
                        break;
                    case -211922948:
                        if (strName.equals("BrowserCompatible")) {
                            b = 6;
                        }
                        break;
                    case -102443356:
                        if (strName.equals("WriteNullStringAsEmpty")) {
                            b = 7;
                        }
                        break;
                    case -62964779:
                        if (strName.equals("NotWriteRootClassName")) {
                            b = 8;
                        }
                        break;
                    case 1009181687:
                        if (strName.equals("WriteNullListAsEmpty")) {
                            b = 9;
                        }
                        break;
                    case 1519175029:
                        if (strName.equals("WriteNonStringValueAsString")) {
                            b = 10;
                        }
                        break;
                    case 1808123471:
                        if (strName.equals("WriteNullBooleanAsFalse")) {
                            b = 11;
                        }
                        break;
                    case 1879776036:
                        if (strName.equals("WriteClassName")) {
                            b = 12;
                        }
                        break;
                    case 2049970061:
                        if (strName.equals("WriteMapNullValue")) {
                            b = ek.k;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        fieldInfo.features |= FieldInfo.DISABLE_REFERENCE_DETECT;
                        break;
                    case 1:
                        fieldInfo.features |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                        break;
                    case 2:
                        fieldInfo.features |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                        break;
                    case 3:
                        fieldInfo.format = "iso8601";
                        break;
                    case 4:
                        fieldInfo.features |= JSONWriter.Feature.WriteBigDecimalAsPlain.mask;
                        break;
                    case 5:
                        fieldInfo.features |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                        break;
                    case 6:
                        fieldInfo.features |= JSONWriter.Feature.BrowserCompatible.mask;
                        break;
                    case 7:
                        fieldInfo.features |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                        break;
                    case 8:
                        fieldInfo.features |= JSONWriter.Feature.NotWriteRootClassName.mask;
                        break;
                    case 9:
                        fieldInfo.features |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                        break;
                    case 10:
                        fieldInfo.features |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                        break;
                    case 11:
                        fieldInfo.features |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                        break;
                    case Opcodes.FCONST_1 /* 12 */:
                        fieldInfo.features |= JSONWriter.Feature.WriteClassName.mask;
                        break;
                    case 13:
                        fieldInfo.features |= JSONWriter.Feature.WriteNulls.mask;
                        break;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public /* synthetic */ void lambda$processJSONField1x$0(Annotation annotation, FieldInfo fieldInfo, Method method) {
            int iIntValue;
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                switch (name.hashCode()) {
                    case -1371565692:
                        if (name.equals("serializeUsing")) {
                            Class<?> cls = (Class) objInvoke;
                            if (ObjectWriter.class.isAssignableFrom(cls)) {
                                fieldInfo.writeUsing = cls;
                            }
                        }
                        break;
                    case -1268779017:
                        if (name.equals("format")) {
                            loadJsonFieldFormat(fieldInfo, (String) objInvoke);
                        }
                        break;
                    case -1206994319:
                        if (name.equals("ordinal") && (iIntValue = ((Integer) objInvoke).intValue()) != 0) {
                            fieldInfo.ordinal = iIntValue;
                            break;
                        }
                        break;
                    case -987658292:
                        if (name.equals("unwrapped") && ((Boolean) objInvoke).booleanValue()) {
                            fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                            break;
                        }
                        break;
                    case -940893828:
                        if (name.equals("serialzeFeatures")) {
                            applyFeatures(fieldInfo, (Enum[]) objInvoke);
                        }
                        break;
                    case -659125328:
                        if (name.equals("defaultValue")) {
                            String str = (String) objInvoke;
                            if (!str.isEmpty()) {
                                fieldInfo.defaultValue = str;
                            }
                        }
                        break;
                    case -573479200:
                        if (name.equals("serialize") && !((Boolean) objInvoke).booleanValue()) {
                            fieldInfo.ignore = true;
                            break;
                        }
                        break;
                    case 3373707:
                        if (name.equals("name")) {
                            String str2 = (String) objInvoke;
                            if (!str2.isEmpty()) {
                                fieldInfo.fieldName = str2;
                            }
                        }
                        break;
                    case 12396273:
                        if (name.equals("jsonDirect") && ((Boolean) objInvoke).booleanValue()) {
                            fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
                            break;
                        }
                        break;
                    case 102727412:
                        if (name.equals("label")) {
                            String str3 = (String) objInvoke;
                            if (!str3.isEmpty()) {
                                fieldInfo.label = str3;
                            }
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$processJacksonJsonIgnoreProperties$0(Annotation annotation, BeanInfo beanInfo, Method method) {
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                if ("value".equals(name)) {
                    String[] strArr = (String[]) objInvoke;
                    if (strArr.length != 0) {
                        beanInfo.ignores = strArr;
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$processJacksonJsonProperty$0(Annotation annotation, FieldInfo fieldInfo, Method method) {
            int iIntValue;
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                int iHashCode = name.hashCode();
                if (iHashCode == -1423461020) {
                    if (name.equals(bv.Q)) {
                        fieldInfo.ignore = "WRITE_ONLY".equals(((Enum) objInvoke).name());
                        return;
                    }
                    return;
                }
                if (iHashCode == 100346066) {
                    if (!name.equals(a.H) || (iIntValue = ((Integer) objInvoke).intValue()) == -1) {
                        return;
                    }
                    fieldInfo.ordinal = iIntValue;
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
        public static /* synthetic */ void lambda$processJacksonJsonPropertyOrder$0(Annotation annotation, BeanInfo beanInfo, AtomicBoolean atomicBoolean, Method method) {
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                if (!"value".equals(name)) {
                    if ("alphabetic".equals(name)) {
                        atomicBoolean.set(((Boolean) objInvoke).booleanValue());
                    }
                } else {
                    String[] strArr = (String[]) objInvoke;
                    if (strArr.length != 0) {
                        beanInfo.orders = strArr;
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processJacksonJsonSerialize$0(Annotation annotation, BeanInfo beanInfo, Method method) {
            Class clsProcessUsing;
            Class clsProcessUsing2;
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                int iHashCode = name.hashCode();
                if (iHashCode == 111582340) {
                    if (!name.equals("using") || (clsProcessUsing = processUsing((Class) objInvoke)) == null) {
                        return;
                    }
                    beanInfo.serializer = clsProcessUsing;
                    return;
                }
                if (iHashCode == 491860325 && name.equals("keyUsing") && (clsProcessUsing2 = processUsing((Class) objInvoke)) != null) {
                    beanInfo.serializer = clsProcessUsing2;
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public /* synthetic */ void lambda$processJacksonJsonSerialize$1(Annotation annotation, FieldInfo fieldInfo, Method method) {
            Class<?> cls;
            Class<?> clsProcessUsing;
            Class<?> clsProcessUsing2;
            Class<?> clsProcessUsing3;
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                switch (name.hashCode()) {
                    case -407108981:
                        if (name.equals("contentAs") && (cls = (Class) objInvoke) != Void.class) {
                            fieldInfo.contentAs = cls;
                            break;
                        }
                        break;
                    case 111582340:
                        if (name.equals("using") && (clsProcessUsing = processUsing((Class) objInvoke)) != null) {
                            fieldInfo.writeUsing = clsProcessUsing;
                            break;
                        }
                        break;
                    case 491860325:
                        if (name.equals("keyUsing") && (clsProcessUsing2 = processUsing((Class) objInvoke)) != null) {
                            fieldInfo.keyUsing = clsProcessUsing2;
                            break;
                        }
                        break;
                    case 2034063763:
                        if (name.equals("valueUsing") && (clsProcessUsing3 = processUsing((Class) objInvoke)) != null) {
                            fieldInfo.valueUsing = clsProcessUsing3;
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
        public static /* synthetic */ void lambda$processJacksonJsonSubTypes$0(Annotation annotation, BeanInfo beanInfo, Method method) {
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                if ("value".equals(name)) {
                    Annotation[] annotationArr = (Annotation[]) objInvoke;
                    if (annotationArr.length != 0) {
                        beanInfo.seeAlso = new Class[annotationArr.length];
                        beanInfo.seeAlsoNames = new String[annotationArr.length];
                        for (int i = 0; i < annotationArr.length; i++) {
                            BeanUtils.processJacksonJsonSubTypesType(beanInfo, i, annotationArr[i]);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$processJacksonJsonTypeInfo$0(Annotation annotation, BeanInfo beanInfo, Method method) {
            String name = method.getName();
            try {
                Object objInvoke = method.invoke(annotation, null);
                if ("property".equals(name)) {
                    String str = (String) objInvoke;
                    if (str.isEmpty()) {
                        return;
                    }
                    beanInfo.typeKey = str;
                    beanInfo.writerFeatures |= JSONWriter.Feature.WriteClassName.mask;
                }
            } catch (Throwable unused) {
            }
        }

        private void loadFieldInfo(FieldInfo fieldInfo, JSONField jSONField) {
            String strName = jSONField.name();
            if (!strName.isEmpty()) {
                fieldInfo.fieldName = strName;
            }
            String strDefaultValue = jSONField.defaultValue();
            if (!strDefaultValue.isEmpty()) {
                fieldInfo.defaultValue = strDefaultValue;
            }
            loadJsonFieldFormat(fieldInfo, jSONField.format());
            String strLabel = jSONField.label();
            if (!strLabel.isEmpty()) {
                fieldInfo.label = strLabel;
            }
            String strLocale = jSONField.locale();
            if (!strLocale.isEmpty()) {
                String[] strArrSplit = strLocale.split("_");
                if (strArrSplit.length == 2) {
                    fieldInfo.locale = new Locale(strArrSplit[0], strArrSplit[1]);
                }
            }
            boolean zSerialize = jSONField.serialize();
            boolean z = !zSerialize;
            if (!fieldInfo.ignore) {
                fieldInfo.ignore = z;
            }
            if (!jSONField.skipTransient()) {
                fieldInfo.skipTransient = false;
                if (fieldInfo.isTransient && !fieldInfo.isPrivate) {
                    fieldInfo.ignore = false;
                }
            }
            if (jSONField.unwrapped()) {
                fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
            }
            for (JSONWriter.Feature feature : jSONField.serializeFeatures()) {
                fieldInfo.features |= feature.mask;
                if (fieldInfo.ignore && !fieldInfo.isTransient && zSerialize && feature == JSONWriter.Feature.FieldBased) {
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
            if (jSONField.jsonDirect()) {
                fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
            }
            Class<?> clsSerializeUsing = jSONField.serializeUsing();
            if (ObjectWriter.class.isAssignableFrom(clsSerializeUsing)) {
                fieldInfo.writeUsing = clsSerializeUsing;
            }
            Class<?> clsContentAs = jSONField.contentAs();
            if (clsContentAs != Void.class) {
                fieldInfo.contentAs = clsContentAs;
            }
        }

        private void loadJsonFieldFormat(FieldInfo fieldInfo, String str) {
            if (str.isEmpty()) {
                return;
            }
            String strTrim = str.trim();
            if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                strTrim = strTrim.replace("T", "'T'");
            }
            if (strTrim.isEmpty()) {
                return;
            }
            fieldInfo.format = strTrim;
        }

        private void processAnnotations(FieldInfo fieldInfo, Annotation[] annotationArr) {
            for (Annotation annotation : annotationArr) {
                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
                if (jSONField != null) {
                    loadFieldInfo(fieldInfo, jSONField);
                } else {
                    if (clsAnnotationType == JSONCompiler.class && ((JSONCompiler) annotation).value() == JSONCompiler.CompilerOption.LAMBDA) {
                        fieldInfo.features |= FieldInfo.JIT;
                    }
                    boolean zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                    String name = clsAnnotationType.getName();
                    if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonInclude(fieldInfo, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonSerialize(fieldInfo, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonFormat(fieldInfo, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.VALUE_MASK;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonProperty(fieldInfo, annotation);
                        }
                    } else if (name.equals("java.beans.Transient")) {
                        if (fieldInfo.skipTransient) {
                            fieldInfo.ignore = true;
                        }
                        fieldInfo.isTransient = true;
                    } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                        processJSONField1x(fieldInfo, annotation);
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped") && zIsUseJacksonAnnotation) {
                        BeanUtils.processJacksonJsonUnwrapped(fieldInfo, annotation);
                    }
                }
            }
        }

        private void processJSONField1x(FieldInfo fieldInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C2261(this, annotation, fieldInfo, 1));
        }

        private void processJacksonJsonIgnoreProperties(BeanInfo beanInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C0409(annotation, beanInfo, 10));
        }

        private void processJacksonJsonProperty(FieldInfo fieldInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C0410(annotation, fieldInfo, 8));
        }

        private void processJacksonJsonPropertyOrder(BeanInfo beanInfo, Annotation annotation) {
            Class<?> cls = annotation.getClass();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            BeanUtils.annotationMethods(cls, new C2246(annotation, beanInfo, atomicBoolean, 3));
            String[] strArr = beanInfo.orders;
            if (strArr == null || strArr.length == 0) {
                beanInfo.alphabetic = atomicBoolean.get();
            }
        }

        private void processJacksonJsonSerialize(BeanInfo beanInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C2246(this, annotation, beanInfo));
        }

        private void processJacksonJsonSubTypes(BeanInfo beanInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C0409(annotation, beanInfo, 12));
        }

        private void processJacksonJsonTypeInfo(BeanInfo beanInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C0409(annotation, beanInfo, 13));
        }

        private Class processUsing(Class cls) {
            String name = cls.getName();
            if (!"com.fasterxml.jackson.databind.JsonSerializer$None".equals(name) && ObjectWriter.class.isAssignableFrom(cls)) {
                return cls;
            }
            if ("com.fasterxml.jackson.databind.ser.std.ToStringSerializer".equals(name)) {
                return ObjectWriterImplToString.class;
            }
            return null;
        }

        @Override // com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor
        public void getBeanInfo(BeanInfo beanInfo, Class cls) {
            Class cls2;
            String str;
            if (cls != null) {
                Class superclass = cls.getSuperclass();
                if (superclass != Object.class && superclass != null && superclass != Enum.class) {
                    getBeanInfo(beanInfo, superclass);
                }
                for (Class<?> cls3 : cls.getInterfaces()) {
                    if (cls3 != Serializable.class) {
                        getBeanInfo(beanInfo, cls3);
                    }
                }
                if (beanInfo.seeAlso != null && beanInfo.seeAlsoNames != null) {
                    int i = 0;
                    while (true) {
                        Class[] clsArr = beanInfo.seeAlso;
                        if (i >= clsArr.length) {
                            break;
                        }
                        if (clsArr[i] == cls) {
                            String[] strArr = beanInfo.seeAlsoNames;
                            if (i < strArr.length && (str = strArr[i]) != null && str.length() != 0) {
                                beanInfo.typeName = str;
                                break;
                            }
                        }
                        i++;
                    }
                }
            }
            JSONType jSONType = null;
            Annotation annotation = null;
            for (Annotation annotation2 : BeanUtils.getAnnotations(cls)) {
                Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
                if (jSONType == null) {
                    jSONType = (JSONType) BeanUtils.findAnnotation(annotation2, JSONType.class);
                }
                if (jSONType != annotation2) {
                    if (clsAnnotationType == JSONCompiler.class && ((JSONCompiler) annotation2).value() == JSONCompiler.CompilerOption.LAMBDA) {
                        beanInfo.writerFeatures |= FieldInfo.JIT;
                    }
                    boolean zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                    String name = clsAnnotationType.getName();
                    if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonInclude(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonSerialize(beanInfo, annotation2);
                            if (beanInfo.serializer != null && Enum.class.isAssignableFrom(cls)) {
                                beanInfo.writeEnumAsJavaBean = true;
                            }
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonFormat(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonSubTypes")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonSubTypes(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonPropertyOrder")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonPropertyOrder(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeInfo")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonTypeInfo(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonTypeName")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonTypeName(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnoreProperties")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonIgnoreProperties(beanInfo, annotation2);
                        }
                    } else if (name.equals("ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᤝᲀᲁᲈ")) {
                        beanInfo.kotlin = true;
                        KotlinUtils.getConstructor(cls, beanInfo);
                    } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                        annotation = annotation2;
                    }
                }
            }
            if (jSONType == null && (cls2 = ObjectWriterBaseModule.this.provider.mixInCache.get(cls)) != null) {
                beanInfo.mixIn = true;
                Annotation[] annotations = BeanUtils.getAnnotations(cls2);
                int i2 = 0;
                while (i2 < annotations.length) {
                    Annotation annotation3 = annotations[i2];
                    Class<? extends Annotation> clsAnnotationType2 = annotation3.annotationType();
                    JSONType jSONType2 = (JSONType) BeanUtils.findAnnotation(annotation3, JSONType.class);
                    if (jSONType2 != annotation3 && "com.alibaba.fastjson.annotation.JSONType".equals(clsAnnotationType2.getName())) {
                        annotation = annotation3;
                    }
                    i2++;
                    jSONType = jSONType2;
                }
            }
            if (jSONType != null) {
                Class<?>[] clsArrSeeAlso = jSONType.seeAlso();
                if (clsArrSeeAlso.length != 0) {
                    beanInfo.seeAlso = clsArrSeeAlso;
                }
                String strTypeKey = jSONType.typeKey();
                if (!strTypeKey.isEmpty()) {
                    beanInfo.typeKey = strTypeKey;
                }
                String strTypeName = jSONType.typeName();
                if (!strTypeName.isEmpty()) {
                    beanInfo.typeName = strTypeName;
                }
                for (JSONWriter.Feature feature : jSONType.serializeFeatures()) {
                    beanInfo.writerFeatures |= feature.mask;
                }
                beanInfo.namingStrategy = jSONType.naming().name();
                String[] strArrIgnores = jSONType.ignores();
                if (strArrIgnores.length > 0) {
                    beanInfo.ignores = strArrIgnores;
                }
                String[] strArrIncludes = jSONType.includes();
                if (strArrIncludes.length > 0) {
                    beanInfo.includes = strArrIncludes;
                }
                String[] strArrOrders = jSONType.orders();
                if (strArrOrders.length > 0) {
                    beanInfo.orders = strArrOrders;
                }
                Class<?> clsSerializer = jSONType.serializer();
                if (ObjectWriter.class.isAssignableFrom(clsSerializer)) {
                    beanInfo.serializer = clsSerializer;
                    beanInfo.writeEnumAsJavaBean = true;
                }
                Class<? extends Filter>[] clsArrSerializeFilters = jSONType.serializeFilters();
                if (clsArrSerializeFilters.length != 0) {
                    beanInfo.serializeFilters = clsArrSerializeFilters;
                }
                String str2 = jSONType.format();
                if (!str2.isEmpty()) {
                    beanInfo.format = str2;
                }
                String strLocale = jSONType.locale();
                if (!strLocale.isEmpty()) {
                    String[] strArrSplit = strLocale.split("_");
                    if (strArrSplit.length == 2) {
                        beanInfo.locale = new Locale(strArrSplit[0], strArrSplit[1]);
                    }
                }
                if (!jSONType.alphabetic()) {
                    beanInfo.alphabetic = false;
                }
                if (jSONType.writeEnumAsJavaBean()) {
                    beanInfo.writeEnumAsJavaBean = true;
                }
                String strRootName = jSONType.rootName();
                if (!strRootName.isEmpty()) {
                    beanInfo.rootName = strRootName;
                }
                if (beanInfo.skipTransient) {
                    beanInfo.skipTransient = jSONType.skipTransient();
                }
            } else if (annotation != null) {
                BeanUtils.annotationMethods(annotation.annotationType(), new C0409(beanInfo, annotation, 11));
            }
            Class[] clsArr2 = beanInfo.seeAlso;
            if (clsArr2 == null || clsArr2.length == 0) {
                return;
            }
            String str3 = beanInfo.typeName;
            if (str3 == null || str3.length() == 0) {
                for (Class cls4 : beanInfo.seeAlso) {
                    if (cls4 == cls) {
                        beanInfo.typeName = cls.getSimpleName();
                        return;
                    }
                }
            }
        }

        @Override // com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor
        public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Field field) {
            Class cls2;
            Field declaredField;
            JSONField jSONField = null;
            if (cls != null && (cls2 = ObjectWriterBaseModule.this.provider.mixInCache.get(cls)) != null && cls2 != cls) {
                try {
                    declaredField = cls2.getDeclaredField(field.getName());
                } catch (Exception unused) {
                    declaredField = null;
                }
                if (declaredField != null) {
                    getFieldInfo(beanInfo, fieldInfo, cls2, declaredField);
                }
            }
            if (ObjectWriterBaseModule.this.provider.mixInCache.get(field.getType()) != null) {
                fieldInfo.fieldClassMixIn = true;
            }
            if (Modifier.isTransient(field.getModifiers())) {
                fieldInfo.isTransient = true;
                if (fieldInfo.skipTransient && beanInfo.skipTransient) {
                    fieldInfo.ignore = true;
                }
            }
            Annotation[] annotations = BeanUtils.getAnnotations(field);
            if (annotations.length == 0 && KotlinUtils.isKotlin(cls)) {
                annotations = BeanUtils.getAnnotations(field.getType());
                Constructor kotlinConstructor = KotlinUtils.getKotlinConstructor(BeanUtils.getConstructor(cls));
                if (kotlinConstructor != null) {
                    String[] koltinConstructorParameters = KotlinUtils.getKoltinConstructorParameters(cls);
                    for (int i = 0; i < koltinConstructorParameters.length; i++) {
                        if (koltinConstructorParameters[i].equals(field.getName())) {
                            annotations = kotlinConstructor.getParameterAnnotations()[i];
                            break;
                        }
                    }
                    if (fieldInfo.ignore) {
                        for (Annotation annotation : annotations) {
                            if (annotation.annotationType() == JSONField.class) {
                                fieldInfo.ignore = !((JSONField) annotation).serialize();
                            }
                        }
                    }
                }
            }
            for (Annotation annotation2 : annotations) {
                Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
                if (jSONField != null || (jSONField = (JSONField) BeanUtils.findAnnotation(annotation2, JSONField.class)) != annotation2) {
                    String name = clsAnnotationType.getName();
                    boolean zIsUseJacksonAnnotation = JSONFactory.isUseJacksonAnnotation();
                    if (name.equals("com.google.gson.annotations.SerializedName")) {
                        if (JSONFactory.isUseGsonAnnotation()) {
                            BeanUtils.processGsonSerializedName(fieldInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonInclude")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonInclude(beanInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonManagedReference")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= JSONWriter.Feature.ReferenceDetection.mask;
                        }
                    } else if (name.equals("com.fasterxml.jackson.databind.annotation.JsonSerialize")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonSerialize(fieldInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonFormat(fieldInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonIgnore")) {
                        if (zIsUseJacksonAnnotation) {
                            BeanUtils.processJacksonJsonIgnore(fieldInfo, annotation2);
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonValue")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.VALUE_MASK;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonAnyGetter")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                        if (zIsUseJacksonAnnotation) {
                            processJacksonJsonProperty(fieldInfo, annotation2);
                        }
                    } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                        processJSONField1x(fieldInfo, annotation2);
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonBackReference")) {
                        if (zIsUseJacksonAnnotation) {
                            fieldInfo.features |= FieldInfo.BACKR_REFERENCE;
                        }
                    } else if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue") && zIsUseJacksonAnnotation) {
                        fieldInfo.features = FieldInfo.RAW_VALUE_MASK | fieldInfo.features;
                    }
                }
            }
            if (jSONField == null) {
                return;
            }
            loadFieldInfo(fieldInfo, jSONField);
            Class<?> clsWriteUsing = jSONField.writeUsing();
            if (ObjectWriter.class.isAssignableFrom(clsWriteUsing)) {
                fieldInfo.writeUsing = clsWriteUsing;
            }
            Class<?> clsSerializeUsing = jSONField.serializeUsing();
            if (ObjectWriter.class.isAssignableFrom(clsSerializeUsing)) {
                fieldInfo.writeUsing = clsSerializeUsing;
            }
            if (jSONField.jsonDirect()) {
                fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
            }
            if ((fieldInfo.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0 || String.class.equals(field.getType()) || fieldInfo.writeUsing != null) {
                return;
            }
            fieldInfo.writeUsing = ObjectWriterImplToString.class;
        }

        private void processJacksonJsonSerialize(FieldInfo fieldInfo, Annotation annotation) {
            BeanUtils.annotationMethods(annotation.getClass(), new C2261(this, annotation, fieldInfo, 0));
        }

        @Override // com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor
        public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Method method) {
            Field field;
            Method declaredMethod;
            Class cls2 = ObjectWriterBaseModule.this.provider.mixInCache.get(cls);
            String name = method.getName();
            if ("getTargetSql".equals(name) && cls != null && cls.getName().startsWith("com.baomidou.mybatisplus.")) {
                fieldInfo.features |= JSONWriter.Feature.IgnoreErrorGetter.mask;
            }
            if (cls2 != null && cls2 != cls) {
                try {
                    declaredMethod = cls2.getDeclaredMethod(name, method.getParameterTypes());
                } catch (Exception unused) {
                    declaredMethod = null;
                }
                if (declaredMethod != null) {
                    getFieldInfo(beanInfo, fieldInfo, cls2, declaredMethod);
                }
            }
            if (ObjectWriterBaseModule.this.provider.mixInCache.get(method.getReturnType()) != null) {
                fieldInfo.fieldClassMixIn = true;
            }
            Class cls3 = JDKUtils.CLASS_TRANSIENT;
            int i = 0;
            if (cls3 != null && method.getAnnotation(cls3) != null) {
                fieldInfo.ignore = true;
                fieldInfo.isTransient = true;
                if (!beanInfo.skipTransient) {
                    fieldInfo.skipTransient = false;
                    fieldInfo.ignore = false;
                }
            }
            if (cls != null) {
                Class superclass = cls.getSuperclass();
                Method method2 = BeanUtils.getMethod(superclass, method);
                boolean z = fieldInfo.ignore;
                if (method2 != null) {
                    getFieldInfo(beanInfo, fieldInfo, superclass, method2);
                    Field field2 = BeanUtils.getField(cls, method);
                    int modifiers = method2.getModifiers();
                    if (field2 != null && z != fieldInfo.ignore && !Modifier.isAbstract(modifiers) && !method2.equals(method)) {
                        fieldInfo.ignore = z;
                    }
                }
                for (Class<?> cls4 : cls.getInterfaces()) {
                    Method method3 = BeanUtils.getMethod(cls4, method);
                    if (superclass != null && method3 != null) {
                        getFieldInfo(beanInfo, fieldInfo, superclass, method3);
                    }
                }
            }
            fieldInfo.isPrivate = false;
            processAnnotations(fieldInfo, BeanUtils.getAnnotations(method));
            if (!cls.getName().startsWith("java.lang") && !BeanUtils.isRecord(cls) && (field = BeanUtils.getField(cls, method)) != null) {
                fieldInfo.features |= FieldInfo.FIELD_MASK;
                getFieldInfo(beanInfo, fieldInfo, cls, field);
            }
            boolean z2 = beanInfo.kotlin;
            if (!z2 || beanInfo.creatorConstructor == null || beanInfo.createParameterNames == null) {
                return;
            }
            String str = BeanUtils.getterName(method, z2, null);
            while (true) {
                String[] strArr = beanInfo.createParameterNames;
                if (i >= strArr.length) {
                    return;
                }
                if (str.equals(strArr[i])) {
                    Annotation[][] parameterAnnotations = beanInfo.creatorConstructor.getParameterAnnotations();
                    if (i < parameterAnnotations.length) {
                        processAnnotations(fieldInfo, parameterAnnotations[i]);
                        return;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class VoidObjectWriter implements ObjectWriter {
        public static final VoidObjectWriter INSTANCE = new VoidObjectWriter();

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        }
    }
}
