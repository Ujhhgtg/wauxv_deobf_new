package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.modules.ObjectCodecProvider;
import com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.GuavaSupport;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import org.w3c.dom.Node;
import p000.C2260;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterProvider implements ObjectCodecProvider {
    static final int ENUM = 16384;
    static final int NAME_COMPATIBLE_WITH_FILED = 64;
    static final int[] NOT_REFERENCES_TYPE_HASH_CODES;
    static final int[] PRIMITIVE_HASH_CODES;
    static final int TYPE_DATE_MASK = 16;
    static final int TYPE_DECIMAL_MASK = 8;
    static final int TYPE_ENUM_MASK = 32;
    static final int TYPE_INT32_MASK = 2;
    static final int TYPE_INT64_MASK = 4;
    boolean alphabetic;
    final ConcurrentMap<Type, ObjectWriter> cache;
    final ConcurrentMap<Type, ObjectWriter> cacheFieldBased;
    final ObjectWriterCreator creator;
    boolean disableArrayMapping;
    boolean disableAutoType;
    boolean disableJSONB;
    boolean disableReferenceDetect;
    final ConcurrentMap<Class, Class> mixInCache;
    final List<ObjectWriterModule> modules;
    PropertyNamingStrategy namingStrategy;
    boolean skipTransient;
    volatile long userDefineMask;

    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, Calendar.class, UUID.class, Locale.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, ZoneId.class, ZonedDateTime.class, OffsetDateTime.class, OffsetTime.class, AtomicInteger.class, AtomicLong.class, String.class, StackTraceElement.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), Collections.EMPTY_SET.getClass()};
        int[] iArr = new int[39];
        for (int i = 0; i < 39; i++) {
            iArr[i] = System.identityHashCode(clsArr[i]);
        }
        Arrays.sort(iArr);
        PRIMITIVE_HASH_CODES = iArr;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 42);
        iArrCopyOf[41] = System.identityHashCode(Class.class);
        iArrCopyOf[40] = System.identityHashCode(int[].class);
        iArrCopyOf[39] = System.identityHashCode(long[].class);
        Arrays.sort(iArrCopyOf);
        NOT_REFERENCES_TYPE_HASH_CODES = iArrCopyOf;
    }

    public ObjectWriterProvider() {
        this((PropertyNamingStrategy) null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0170  */
    private ObjectWriter getObjectWriterInternal(Type type, Class cls, boolean z) {
        ObjectWriter objectWriter;
        Class<?> superclass = cls.getSuperclass();
        if (!cls.isEnum() && superclass != null && superclass.isEnum()) {
            return getObjectWriter(superclass, superclass, z);
        }
        String name = cls.getName();
        if (z) {
            if ((superclass != null && superclass != Object.class && "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName())) || name.equals("cn.hutool.core.map.CaseInsensitiveLinkedMap") || name.equals("cn.hutool.json.JSONObject") || name.equals("cn.hutool.core.map.CaseInsensitiveMap") || name.equals("springfox.documentation.spring.web.json.Json") || name.equals("cn.hutool.json.JSONArray")) {
                z = false;
            }
        } else if (name.equals("org.springframework.core.ResolvableType")) {
            z = true;
        }
        ObjectWriter objectWriter2 = z ? this.cacheFieldBased.get(type) : this.cache.get(type);
        if (objectWriter2 != null) {
            return objectWriter2;
        }
        if (TypeUtils.isProxy(cls)) {
            if (superclass == Object.class) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!TypeUtils.isProxy(cls2)) {
                        superclass = cls2;
                        break;
                    }
                }
            }
            if (cls == type) {
                type = superclass;
            }
            if (z) {
                objectWriter = this.cacheFieldBased.get(type);
                z = false;
            } else {
                objectWriter = this.cache.get(type);
            }
            objectWriter2 = objectWriter;
            if (objectWriter2 != null) {
                return objectWriter2;
            }
            cls = superclass;
        }
        if (!z || !Iterable.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            for (int i = 0; i < this.modules.size(); i++) {
                objectWriter2 = this.modules.get(i).getObjectWriter(type, cls);
                if (objectWriter2 != null) {
                    ObjectWriter objectWriterPutIfAbsent = z ? this.cacheFieldBased.putIfAbsent(type, objectWriter2) : this.cache.putIfAbsent(type, objectWriter2);
                    return objectWriterPutIfAbsent != null ? objectWriterPutIfAbsent : objectWriter2;
                }
            }
        }
        if (Node.class.isAssignableFrom(cls)) {
            return ObjectWriterImplXmlNode.INSTANCE;
        }
        if (name.equals("android.net.Uri$HierarchicalUri")) {
            objectWriter2 = ObjectWriterImplToString.INSTANCE;
        } else if (name.equals("com.google.common.collect.HashMultimap")) {
            objectWriter2 = GuavaSupport.createAsMapWriter(cls);
        } else if (name.equals("android.net.Uri$StringUri")) {
            objectWriter2 = ObjectWriterImplToString.INSTANCE;
        } else if (name.equals("com.clickhouse.data.value.UnsignedLong")) {
            objectWriter2 = new ObjectWriterImplToString(true);
        } else if (name.equals("com.alibaba.fastjson.JSONObject")) {
            objectWriter2 = ObjectWriterImplMap.of(cls);
        } else if (name.equals("com.google.common.collect.LinkedListMultimap") || name.equals("com.google.common.collect.TreeMultimap") || name.equals("com.google.common.collect.ArrayListMultimap") || name.equals("com.google.common.collect.LinkedHashMultimap")) {
            objectWriter2 = GuavaSupport.createAsMapWriter(cls);
        } else if (name.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
            objectWriter2 = ObjectWriterImplList.INSTANCE;
        } else if (name.equals("android.net.Uri$OpaqueUri")) {
            objectWriter2 = ObjectWriterImplToString.INSTANCE;
        }
        if (objectWriter2 == null && !z && Map.class.isAssignableFrom(cls) && BeanUtils.isExtendedMap(cls)) {
            return ObjectWriterImplMap.of(cls);
        }
        if (objectWriter2 != null) {
            return objectWriter2;
        }
        ObjectWriter objectWriterCreateObjectWriter = getCreator().createObjectWriter(cls, z ? JSONWriter.Feature.FieldBased.mask : 0L, this);
        ObjectWriter objectWriterPutIfAbsent2 = z ? this.cacheFieldBased.putIfAbsent(type, objectWriterCreateObjectWriter) : this.cache.putIfAbsent(type, objectWriterCreateObjectWriter);
        return objectWriterPutIfAbsent2 != null ? objectWriterPutIfAbsent2 : objectWriterCreateObjectWriter;
    }

    public static boolean isNotReferenceDetect(Class<?> cls) {
        if (Arrays.binarySearch(NOT_REFERENCES_TYPE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    public static boolean isPrimitiveOrEnum(Class<?> cls) {
        if (Arrays.binarySearch(PRIMITIVE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$0(ClassLoader classLoader, Map.Entry entry) {
        return ((Class) entry.getKey()).getClassLoader() == classLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$1(ClassLoader classLoader, IdentityHashMap identityHashMap, Map.Entry entry) {
        return match((Type) entry.getKey(), (ObjectWriter) entry.getValue(), classLoader, identityHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$2(ClassLoader classLoader, IdentityHashMap identityHashMap, Map.Entry entry) {
        return match((Type) entry.getKey(), (ObjectWriter) entry.getValue(), classLoader, identityHashMap);
    }

    public static boolean match(Type type, ObjectWriter objectWriter, ClassLoader classLoader, IdentityHashMap<ObjectWriter, Object> identityHashMap) {
        Class<?> cls = TypeUtils.getClass(type);
        if (cls != null && cls.getClassLoader() == classLoader) {
            return true;
        }
        if (identityHashMap.containsKey(objectWriter)) {
            return false;
        }
        if (objectWriter instanceof ObjectWriterImplMap) {
            ObjectWriterImplMap objectWriterImplMap = (ObjectWriterImplMap) objectWriter;
            Class<?> cls2 = TypeUtils.getClass(objectWriterImplMap.valueType);
            if (cls2 != null && cls2.getClassLoader() == classLoader) {
                return true;
            }
            Class<?> cls3 = TypeUtils.getClass(objectWriterImplMap.keyType);
            return cls3 != null && cls3.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterImplCollection) {
            Class<?> cls4 = TypeUtils.getClass(((ObjectWriterImplCollection) objectWriter).itemType);
            return cls4 != null && cls4.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterImplOptional) {
            Class<?> cls5 = TypeUtils.getClass(((ObjectWriterImplOptional) objectWriter).valueType);
            return cls5 != null && cls5.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterAdapter) {
            identityHashMap.put(objectWriter, null);
            List<FieldWriter> list = ((ObjectWriterAdapter) objectWriter).fieldWriters;
            for (int i = 0; i < list.size(); i++) {
                FieldWriter fieldWriter = list.get(i);
                if ((fieldWriter instanceof FieldWriterObject) && match(null, ((FieldWriterObject) fieldWriter).initObjectWriter, classLoader, identityHashMap)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        BeanUtils.cleanupCache(cls);
    }

    public void cleanupMixIn() {
        this.mixInCache.clear();
    }

    public void clear() {
        this.mixInCache.clear();
        this.cache.clear();
        this.cacheFieldBased.clear();
    }

    @SafeVarargs
    public final void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        for (Class<? extends Enum> cls : clsArr) {
            register(cls, getCreator().createObjectWriter(cls));
        }
    }

    public BeanInfo createBeanInfo() {
        return new BeanInfo(this);
    }

    public void getBeanInfo(BeanInfo beanInfo, Class cls) {
        PropertyNamingStrategy propertyNamingStrategy = this.namingStrategy;
        if (propertyNamingStrategy != null && propertyNamingStrategy != PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue) {
            beanInfo.namingStrategy = propertyNamingStrategy.name();
        }
        for (int i = 0; i < this.modules.size(); i++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getBeanInfo(beanInfo, cls);
            }
        }
    }

    public ObjectWriterCreator getCreator() {
        ObjectWriterCreator contextWriterCreator = JSONFactory.getContextWriterCreator();
        return contextWriterCreator != null ? contextWriterCreator : this.creator;
    }

    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Field field) {
        for (int i = 0; i < this.modules.size(); i++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(beanInfo, fieldInfo, cls, field);
            }
        }
    }

    @Override // com.alibaba.fastjson2.modules.ObjectCodecProvider
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    public List<ObjectWriterModule> getModules() {
        return this.modules;
    }

    public PropertyNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public ObjectWriter getObjectWriter(Type type, String str, Locale locale) {
        if (type == Double.class) {
            return new ObjectWriterImplDouble(new DecimalFormat(str));
        }
        if (type == Float.class) {
            return new ObjectWriterImplFloat(new DecimalFormat(str));
        }
        if (type == BigDecimal.class) {
            return new ObjectWriterImplBigDecimal(new DecimalFormat(str), null);
        }
        if (type == LocalDate.class) {
            return ObjectWriterImplLocalDate.of(str, null);
        }
        if (type == LocalDateTime.class) {
            return new ObjectWriterImplLocalDateTime(str, null);
        }
        if (type == LocalTime.class) {
            return new ObjectWriterImplLocalTime(str, null);
        }
        if (type == Date.class) {
            return new ObjectWriterImplDate(str, null);
        }
        if (type == OffsetDateTime.class) {
            return ObjectWriterImplOffsetDateTime.of(str, null);
        }
        return type == ZonedDateTime.class ? new ObjectWriterImplZonedDateTime(str, null) : getObjectWriter(type);
    }

    public ObjectWriter getObjectWriterFromCache(Type type, Class cls, boolean z) {
        return z ? this.cacheFieldBased.get(type) : this.cache.get(type);
    }

    public void init() {
        this.modules.add(new ObjectWriterBaseModule(this));
    }

    public boolean isAlphabetic() {
        return this.alphabetic;
    }

    public boolean isDisableArrayMapping() {
        return this.disableArrayMapping;
    }

    public boolean isDisableAutoType() {
        return this.disableAutoType;
    }

    public boolean isDisableJSONB() {
        return this.disableJSONB;
    }

    public boolean isDisableReferenceDetect() {
        return this.disableReferenceDetect;
    }

    public boolean isSkipTransient() {
        return this.skipTransient;
    }

    public void mixIn(Class cls, Class cls2) {
        if (cls2 == null) {
            this.mixInCache.remove(cls);
        } else {
            this.mixInCache.put(cls, cls2);
        }
        this.cache.remove(cls);
    }

    public ObjectWriter register(Type type, ObjectWriter objectWriter) {
        return register(type, objectWriter, (JSONFactory.getDefaultWriterFeatures() & JSONWriter.Feature.FieldBased.mask) != 0);
    }

    public ObjectWriter registerIfAbsent(Type type, ObjectWriter objectWriter) {
        return registerIfAbsent(type, objectWriter, false);
    }

    public void setAlphabetic(boolean z) {
        this.alphabetic = z;
    }

    public void setCompatibleWithFieldName(boolean z) {
        if (z) {
            this.userDefineMask |= 64;
        } else {
            this.userDefineMask &= -65;
        }
    }

    public void setDisableArrayMapping(boolean z) {
        this.disableArrayMapping = z;
    }

    public void setDisableAutoType(boolean z) {
        this.disableAutoType = z;
    }

    public void setDisableJSONB(boolean z) {
        this.disableJSONB = z;
    }

    public void setDisableReferenceDetect(boolean z) {
        this.disableReferenceDetect = z;
    }

    public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this.namingStrategy = propertyNamingStrategy;
    }

    public void setSkipTransient(boolean z) {
        this.skipTransient = z;
    }

    public ObjectWriter unregister(Type type) {
        return unregister(type, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    public ObjectWriterProvider(PropertyNamingStrategy propertyNamingStrategy) {
        ObjectWriterCreator objectWriterCreator;
        this.cache = new ConcurrentHashMap();
        this.cacheFieldBased = new ConcurrentHashMap();
        this.mixInCache = new ConcurrentHashMap();
        this.modules = new ArrayList();
        this.disableReferenceDetect = JSONFactory.isDisableReferenceDetect();
        this.disableArrayMapping = JSONFactory.isDisableArrayMapping();
        this.disableJSONB = JSONFactory.isDisableJSONB();
        this.disableAutoType = JSONFactory.isDisableAutoType();
        this.skipTransient = JSONFactory.isDefaultSkipTransient();
        this.alphabetic = JSONFactory.isDefaultWriterAlphabetic();
        init();
        String str = JSONFactory.CREATOR;
        int iHashCode = str.hashCode();
        if (iHashCode != -1110092857) {
            if (iHashCode == 96891) {
                str.equals("asm");
            } else if (iHashCode == 1085265597 && str.equals("reflect")) {
                objectWriterCreator = ObjectWriterCreator.INSTANCE;
            }
            objectWriterCreator = null;
            try {
                if (!JDKUtils.ANDROID && !JDKUtils.GRAAL) {
                    objectWriterCreator = ObjectWriterCreatorASM.INSTANCE;
                }
            } catch (Throwable unused) {
            }
            if (objectWriterCreator == null) {
                objectWriterCreator = ObjectWriterCreator.INSTANCE;
            }
        } else if (str.equals("lambda")) {
            objectWriterCreator = ObjectWriterCreator.INSTANCE;
        } else {
            objectWriterCreator = null;
            if (!JDKUtils.ANDROID) {
                objectWriterCreator = ObjectWriterCreatorASM.INSTANCE;
            }
            if (objectWriterCreator == null) {
                objectWriterCreator = ObjectWriterCreator.INSTANCE;
            }
        }
        this.creator = objectWriterCreator;
        this.namingStrategy = propertyNamingStrategy;
    }

    public ObjectWriter registerIfAbsent(Type type, ObjectWriter objectWriter, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).putIfAbsent(type, objectWriter);
    }

    public ObjectWriter unregister(Type type, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).remove(type);
    }

    public ObjectWriter register(Type type, ObjectWriter objectWriter, boolean z) {
        if (type == Integer.class) {
            if (objectWriter != null && objectWriter != ObjectWriterImplInt32.INSTANCE) {
                this.userDefineMask |= 2;
            } else {
                this.userDefineMask &= -3;
            }
        } else if (type != Long.class && type != Long.TYPE) {
            if (type == BigDecimal.class) {
                if (objectWriter != null && objectWriter != ObjectWriterImplBigDecimal.INSTANCE) {
                    this.userDefineMask |= 8;
                } else {
                    this.userDefineMask &= -9;
                }
            } else if (type == Date.class) {
                if (objectWriter != null && objectWriter != ObjectWriterImplDate.INSTANCE) {
                    this.userDefineMask |= 16;
                } else {
                    this.userDefineMask &= -17;
                }
            } else if (type == Enum.class) {
                if (objectWriter == null) {
                    this.userDefineMask &= -33;
                } else {
                    this.userDefineMask |= 32;
                }
            }
        } else if (objectWriter != null && objectWriter != ObjectWriterImplInt64.INSTANCE) {
            this.userDefineMask |= 4;
        } else {
            this.userDefineMask &= -5;
        }
        ConcurrentMap<Type, ObjectWriter> concurrentMap = z ? this.cacheFieldBased : this.cache;
        if (objectWriter == null) {
            return concurrentMap.remove(type);
        }
        return concurrentMap.put(type, objectWriter);
    }

    public boolean unregister(Type type, ObjectWriter objectWriter) {
        return unregister(type, objectWriter, false);
    }

    public void cleanup(final ClassLoader classLoader) {
        this.mixInCache.entrySet().removeIf(new C2260(3, classLoader));
        final IdentityHashMap identityHashMap = new IdentityHashMap();
        final int i = 0;
        this.cache.entrySet().removeIf(new Predicate() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᲈᤝᲇ
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (0) {
                    case 0:
                        return ObjectWriterProvider.lambda$cleanup$1(classLoader, identityHashMap, (Map.Entry) obj);
                    default:
                        return ObjectWriterProvider.lambda$cleanup$2(classLoader, identityHashMap, (Map.Entry) obj);
                }
            }
        });
        final int i2 = 1;
        this.cacheFieldBased.entrySet().removeIf(new Predicate() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᲈᤝᲇ
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (1) {
                    case 0:
                        return ObjectWriterProvider.lambda$cleanup$1(classLoader, identityHashMap, (Map.Entry) obj);
                    default:
                        return ObjectWriterProvider.lambda$cleanup$2(classLoader, identityHashMap, (Map.Entry) obj);
                }
            }
        });
        BeanUtils.cleanupCache(classLoader);
    }

    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Method method) {
        for (int i = 0; i < this.modules.size(); i++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(beanInfo, fieldInfo, cls, method);
            }
        }
    }

    public boolean unregister(Type type, ObjectWriter objectWriter, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).remove(type, objectWriter);
    }

    public boolean unregister(ObjectWriterModule objectWriterModule) {
        return this.modules.remove(objectWriterModule);
    }

    public ObjectWriter getObjectWriter(Class cls) {
        return getObjectWriter((Type) cls, cls, false);
    }

    public ObjectWriterProvider(ObjectWriterCreator objectWriterCreator) {
        this.cache = new ConcurrentHashMap();
        this.cacheFieldBased = new ConcurrentHashMap();
        this.mixInCache = new ConcurrentHashMap();
        this.modules = new ArrayList();
        this.disableReferenceDetect = JSONFactory.isDisableReferenceDetect();
        this.disableArrayMapping = JSONFactory.isDisableArrayMapping();
        this.disableJSONB = JSONFactory.isDisableJSONB();
        this.disableAutoType = JSONFactory.isDisableAutoType();
        this.skipTransient = JSONFactory.isDefaultSkipTransient();
        this.alphabetic = JSONFactory.isDefaultWriterAlphabetic();
        init();
        this.creator = objectWriterCreator;
    }

    public ObjectWriter getObjectWriter(Type type, Class cls) {
        return getObjectWriter(type, cls, false);
    }

    public ObjectWriter getObjectWriter(Type type) {
        return getObjectWriter(type, (Class) TypeUtils.getClass(type), false);
    }

    public ObjectWriter getObjectWriter(Type type, Class cls, String str, boolean z) {
        ObjectWriter objectWriter = getObjectWriter(type, cls, z);
        return (str != null && type == LocalDateTime.class && objectWriter == ObjectWriterImplLocalDateTime.INSTANCE) ? ObjectWriterImplLocalDateTime.of(str, null) : objectWriter;
    }

    public boolean register(ObjectWriterModule objectWriterModule) {
        for (int size = this.modules.size() - 1; size >= 0; size--) {
            if (this.modules.get(size) == objectWriterModule) {
                return false;
            }
        }
        objectWriterModule.init(this);
        this.modules.add(0, objectWriterModule);
        return true;
    }

    public ObjectWriter getObjectWriter(Type type, Class cls, boolean z) {
        ObjectWriter objectWriter;
        if (z) {
            objectWriter = this.cacheFieldBased.get(type);
        } else {
            objectWriter = this.cache.get(type);
        }
        return objectWriter != null ? objectWriter : getObjectWriterInternal(type, cls, z);
    }
}
