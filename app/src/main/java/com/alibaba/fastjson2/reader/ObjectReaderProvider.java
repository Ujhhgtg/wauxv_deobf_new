package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.FieldBiConsumer;
import com.alibaba.fastjson2.function.FieldConsumer;
import com.alibaba.fastjson2.modules.ObjectCodecProvider;
import com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import p000.AbstractC2668;
import p000.C2260;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderProvider implements ObjectCodecProvider {
    static final String[] AUTO_TYPE_ACCEPT_LIST;
    static JSONReader.AutoTypeBeforeHandler DEFAULT_AUTO_TYPE_BEFORE_HANDLER;
    static Consumer<Class> DEFAULT_AUTO_TYPE_HANDLER;
    static boolean DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR;
    static final String[] DENYS;
    static final ClassLoader FASTJSON2_CLASS_LOADER = JSON.class.getClassLoader();
    public static final boolean SAFE_MODE;
    static ObjectReaderCachePair readerCache;
    private long[] acceptHashCodes;
    final ObjectReaderCreator creator;
    PropertyNamingStrategy namingStrategy;
    final ConcurrentMap<Type, ObjectReader> cache = new ConcurrentHashMap();
    final ConcurrentMap<Type, ObjectReader> cacheFieldBased = new ConcurrentHashMap();
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, ObjectReader>> tclHashCaches = new ConcurrentHashMap();
    final ConcurrentMap<Long, ObjectReader> hashCache = new ConcurrentHashMap();
    final ConcurrentMap<Class, Class> mixInCache = new ConcurrentHashMap();
    final LRUAutoTypeCache autoTypeList = new LRUAutoTypeCache(1024);
    private final ConcurrentMap<Type, Map<Type, Function>> typeConverts = new ConcurrentHashMap();
    final List<ObjectReaderModule> modules = new CopyOnWriteArrayList();
    boolean disableReferenceDetect = JSONFactory.isDisableReferenceDetect();
    boolean disableArrayMapping = JSONFactory.isDisableArrayMapping();
    boolean disableJSONB = JSONFactory.isDisableJSONB();
    boolean disableAutoType = JSONFactory.isDisableAutoType();
    boolean disableSmartMatch = JSONFactory.isDisableSmartMatch();
    private JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = DEFAULT_AUTO_TYPE_BEFORE_HANDLER;
    private Consumer<Class> autoTypeHandler = DEFAULT_AUTO_TYPE_HANDLER;

    /* JADX INFO: compiled from: obf */
    public static final class LRUAutoTypeCache extends LinkedHashMap<String, Date> {
        private final int maxSize;

        public LRUAutoTypeCache(int i) {
            super(16, 0.75f, false);
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Date> entry) {
            return size() > this.maxSize;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ObjectReaderCachePair {
        final long hashCode;
        volatile int missCount;
        final ObjectReader reader;

        public ObjectReaderCachePair(long j, ObjectReader objectReader) {
            this.hashCode = j;
            this.reader = objectReader;
        }
    }

    static {
        Class clsLoadClass;
        Class clsLoadClass2;
        String property = System.getProperty("fastjson2.parser.deny");
        if (property == null) {
            property = JSONFactory.Conf.getProperty("fastjson2.parser.deny");
        }
        if (property == null || property.length() <= 0) {
            DENYS = new String[0];
        } else {
            DENYS = property.split(",");
        }
        String property2 = System.getProperty("fastjson2.autoTypeAccept");
        if (property2 == null) {
            property2 = JSONFactory.Conf.getProperty("fastjson2.autoTypeAccept");
        }
        if (property2 == null || property2.length() <= 0) {
            AUTO_TYPE_ACCEPT_LIST = new String[0];
        } else {
            AUTO_TYPE_ACCEPT_LIST = property2.split(",");
        }
        String property3 = System.getProperty("fastjson2.autoTypeBeforeHandler");
        if (property3 == null || property3.isEmpty()) {
            property3 = JSONFactory.Conf.getProperty("fastjson2.autoTypeBeforeHandler");
        }
        if (property3 != null) {
            property3 = property3.trim();
        }
        if (property3 != null && !property3.isEmpty() && (clsLoadClass2 = TypeUtils.loadClass(property3)) != null) {
            try {
                DEFAULT_AUTO_TYPE_BEFORE_HANDLER = (JSONReader.AutoTypeBeforeHandler) clsLoadClass2.newInstance();
            } catch (Exception unused) {
                DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR = true;
            }
        }
        String property4 = System.getProperty("fastjson2.autoTypeHandler");
        if (property4 == null || property4.isEmpty()) {
            property4 = JSONFactory.Conf.getProperty("fastjson2.autoTypeHandler");
        }
        if (property4 != null) {
            property4 = property4.trim();
        }
        if (property4 != null && !property4.isEmpty() && (clsLoadClass = TypeUtils.loadClass(property4)) != null) {
            try {
                DEFAULT_AUTO_TYPE_HANDLER = (Consumer) clsLoadClass.newInstance();
            } catch (Exception unused2) {
                DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR = true;
            }
        }
        String property5 = System.getProperty("fastjson.parser.safeMode");
        if (property5 == null || property5.isEmpty()) {
            property5 = JSONFactory.Conf.getProperty("fastjson.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = System.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = JSONFactory.Conf.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 != null) {
            property5 = property5.trim();
        }
        SAFE_MODE = "true".equals(property5);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fe  */
    public ObjectReaderProvider() {
        long[] jArr;
        ObjectReaderCreator objectReaderCreator;
        String[] strArr = AUTO_TYPE_ACCEPT_LIST;
        if (strArr != null) {
            jArr = new long[strArr.length + 1];
            int i = 0;
            while (true) {
                String[] strArr2 = AUTO_TYPE_ACCEPT_LIST;
                if (i >= strArr2.length) {
                    break;
                }
                jArr[i] = Fnv.hashCode64(strArr2[i]);
                i++;
            }
        } else {
            jArr = new long[1];
        }
        jArr[jArr.length - 1] = -6293031534589903644L;
        Arrays.sort(jArr);
        this.acceptHashCodes = jArr;
        this.hashCache.put(Long.valueOf(ObjectArrayReader.TYPE_HASH_CODE), ObjectArrayReader.INSTANCE);
        this.hashCache.put(-4834614249632438472L, ObjectReaderImplString.INSTANCE);
        this.hashCache.put(Long.valueOf(Fnv.hashCode64(TypeUtils.getTypeName(HashMap.class))), ObjectReaderImplMap.INSTANCE);
        String str = JSONFactory.CREATOR;
        int iHashCode = str.hashCode();
        if (iHashCode != -1110092857) {
            if (iHashCode == 96891) {
                str.equals("asm");
            } else if (iHashCode == 1085265597 && str.equals("reflect")) {
                objectReaderCreator = ObjectReaderCreator.INSTANCE;
            }
            objectReaderCreator = null;
            try {
                if (!JDKUtils.ANDROID && !JDKUtils.GRAAL) {
                    objectReaderCreator = ObjectReaderCreatorASM.INSTANCE;
                }
            } catch (Throwable unused) {
            }
            if (objectReaderCreator == null) {
                objectReaderCreator = ObjectReaderCreator.INSTANCE;
            }
        } else if (str.equals("lambda")) {
            objectReaderCreator = ObjectReaderCreator.INSTANCE;
        } else {
            objectReaderCreator = null;
            if (!JDKUtils.ANDROID) {
                objectReaderCreator = ObjectReaderCreatorASM.INSTANCE;
            }
            if (objectReaderCreator == null) {
                objectReaderCreator = ObjectReaderCreator.INSTANCE;
            }
        }
        this.creator = objectReaderCreator;
        this.modules.add(new ObjectReaderBaseModule(this));
        init();
    }

    private ObjectReader getObjectReaderInternal(Type type, boolean z) throws NoSuchMethodException {
        ObjectReader objectReader;
        ObjectReader objectReader2;
        Iterator<ObjectReaderModule> it = this.modules.iterator();
        ObjectReader objectReaderCreateObjectReader = null;
        while (it.hasNext()) {
            objectReaderCreateObjectReader = it.next().getObjectReader(this, type);
            if (objectReaderCreateObjectReader != null) {
                ObjectReader objectReaderPutIfAbsent = z ? this.cacheFieldBased.putIfAbsent(type, objectReaderCreateObjectReader) : this.cache.putIfAbsent(type, objectReaderCreateObjectReader);
                return objectReaderPutIfAbsent != null ? objectReaderPutIfAbsent : objectReaderCreateObjectReader;
            }
        }
        boolean z2 = false;
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type2 = bounds[0];
                if ((type2 instanceof Class) && (objectReader2 = getObjectReader(type2, z)) != null) {
                    ObjectReader previousObjectReader = getPreviousObjectReader(z, type, objectReader2);
                    return previousObjectReader != null ? previousObjectReader : objectReader2;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
                    if (superclass.getTypeParameters().length > 0) {
                        z2 = true;
                        break;
                    }
                }
                if ((actualTypeArguments.length == 0 || !z2) && (objectReader = getObjectReader(cls, z)) != null) {
                    ObjectReader previousObjectReader2 = getPreviousObjectReader(z, type, objectReader);
                    return previousObjectReader2 != null ? previousObjectReader2 : objectReader;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplList.of(type, cls, 0L);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplMap.of(type, cls, 0L);
                }
            }
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        String name = mapping.getName();
        if (!z && "com.google.common.collect.ArrayListMultimap".equals(name)) {
            objectReaderCreateObjectReader = ObjectReaderImplMap.of(null, mapping, 0L);
        }
        if (objectReaderCreateObjectReader == null) {
            objectReaderCreateObjectReader = getCreator().createObjectReader(mapping, type, z, this);
        }
        ObjectReader previousObjectReader3 = getPreviousObjectReader(z, type, objectReaderCreateObjectReader);
        return previousObjectReader3 != null ? previousObjectReader3 : objectReaderCreateObjectReader;
    }

    private ObjectReader getPreviousObjectReader(boolean z, Type type, ObjectReader objectReader) {
        return z ? this.cacheFieldBased.putIfAbsent(type, objectReader) : this.cache.putIfAbsent(type, objectReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$0(ClassLoader classLoader, Map.Entry entry) {
        return ((Class) entry.getKey()).getClassLoader() == classLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$1(ClassLoader classLoader, Map.Entry entry) {
        return match((Type) entry.getKey(), (ObjectReader) entry.getValue(), classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanup$2(ClassLoader classLoader, Map.Entry entry) {
        return match((Type) entry.getKey(), (ObjectReader) entry.getValue(), classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFieldReader$0(long j, AtomicReference atomicReference, Field field) {
        if (j == Fnv.hashCode64LCase(field.getName())) {
            atomicReference.set(field);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFieldReader$1(long j, AtomicReference atomicReference, Method method) {
        if (j == Fnv.hashCode64LCase(BeanUtils.setterName(method.getName(), PropertyNamingStrategy.CamelCase.name()))) {
            atomicReference.set(method);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createObjectCreator$0(ObjectReader objectReader) {
        return objectReader.createInstance(0L);
    }

    public static boolean match(Type type, ObjectReader objectReader, ClassLoader classLoader) {
        Class<?> cls = TypeUtils.getClass(type);
        if (cls != null && cls.getClassLoader() == classLoader) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (match(parameterizedType.getRawType(), objectReader, classLoader)) {
                return true;
            }
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (match(type2, objectReader, classLoader)) {
                    return true;
                }
            }
        }
        if (objectReader instanceof ObjectReaderImplMapTyped) {
            ObjectReaderImplMapTyped objectReaderImplMapTyped = (ObjectReaderImplMapTyped) objectReader;
            Class cls2 = objectReaderImplMapTyped.valueClass;
            if (cls2 != null && cls2.getClassLoader() == classLoader) {
                return true;
            }
            Class<?> cls3 = TypeUtils.getClass(objectReaderImplMapTyped.keyType);
            return cls3 != null && cls3.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplList) {
            Class cls4 = ((ObjectReaderImplList) objectReader).itemClass;
            return cls4 != null && cls4.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplOptional) {
            Class cls5 = ((ObjectReaderImplOptional) objectReader).itemClass;
            return cls5 != null && cls5.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderAdapter) {
            for (FieldReader fieldReader : ((ObjectReaderAdapter) objectReader).fieldReaders) {
                Class cls6 = fieldReader.fieldClass;
                if (cls6 != null && cls6.getClassLoader() == classLoader) {
                    return true;
                }
                Type type3 = fieldReader.fieldType;
                if ((type3 instanceof ParameterizedType) && match(type3, null, classLoader)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addAutoTypeAccept(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jHashCode64 = Fnv.hashCode64(str);
        if (Arrays.binarySearch(this.acceptHashCodes, jHashCode64) < 0) {
            long[] jArr = this.acceptHashCodes;
            int length = jArr.length;
            long[] jArr2 = new long[length + 1];
            jArr2[length] = jHashCode64;
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            Arrays.sort(jArr2);
            this.acceptHashCodes = jArr2;
        }
    }

    public final void afterAutoType(String str, Class cls) {
        Consumer<Class> consumer = this.autoTypeHandler;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.autoTypeList) {
            this.autoTypeList.putIfAbsent(str, new Date());
        }
    }

    public Class<?> checkAutoType(String str, Class<?> cls, long j) {
        long j2;
        Class<?> clsLoadClass;
        Class<?> clsApply;
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, cls, j)) != null) {
            afterAutoType(str, clsApply);
            return clsApply;
        }
        if (SAFE_MODE) {
            return null;
        }
        int length = str.length();
        if (length >= 192) {
            throw new JSONException("autoType is not support. ".concat(str));
        }
        if (str.charAt(0) == '[') {
            checkAutoType(str.substring(1), null, j);
        }
        if (cls != null && cls.getName().equals(str)) {
            afterAutoType(str, cls);
            return cls;
        }
        long j3 = 0;
        boolean z = (JSONReader.Feature.SupportAutoType.mask & j) != 0;
        long j4 = -3750763034362895579L;
        if (z) {
            long j5 = -3750763034362895579L;
            int i = 0;
            j2 = 1099511628211L;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                long j6 = 0L;
                long j7 = (j5 ^ ((long) cCharAt)) * 1099511628211L;
                if (Arrays.binarySearch(this.acceptHashCodes, j7) >= 0 && (clsLoadClass = TypeUtils.loadClass(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsLoadClass)) {
                        afterAutoType(str, clsLoadClass);
                        return clsLoadClass;
                    }
                    StringBuilder sbM4679 = AbstractC2668.m4679("type not match. ", str, " -> ");
                    sbM4679.append(cls.getName());
                    throw new JSONException(sbM4679.toString());
                }
                i++;
                j5 = j7;
                j3 = 0L;
            }
        } else {
            j2 = 1099511628211L;
        }
        long j8 = 0L;
        if (!z) {
            int i2 = 0;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '$') {
                    cCharAt2 = '.';
                }
                long j9 = (j4 ^ ((long) cCharAt2)) * 1099511628211L;
                if (Arrays.binarySearch(this.acceptHashCodes, j9) >= 0) {
                    Class<?> clsLoadClass2 = TypeUtils.loadClass(str);
                    if (clsLoadClass2 == null || cls == null || cls.isAssignableFrom(clsLoadClass2)) {
                        afterAutoType(str, clsLoadClass2);
                        return clsLoadClass2;
                    }
                    StringBuilder sbM46710 = AbstractC2668.m4679("type not match. ", str, " -> ");
                    sbM46710.append(cls.getName());
                    throw new JSONException(sbM46710.toString());
                }
                i2++;
                j4 = j9;
            }
        }
        if (!z) {
            return null;
        }
        Class<?> mapping = TypeUtils.getMapping(str);
        if (mapping != null) {
            if (cls == null || cls == Object.class || mapping == HashMap.class || cls.isAssignableFrom(mapping)) {
                afterAutoType(str, mapping);
                return mapping;
            }
            StringBuilder sbM46711 = AbstractC2668.m4679("type not match. ", str, " -> ");
            sbM46711.append(cls.getName());
            throw new JSONException(sbM46711.toString());
        }
        Class<?> clsLoadClass3 = TypeUtils.loadClass(str);
        if (clsLoadClass3 != null) {
            if (ClassLoader.class.isAssignableFrom(clsLoadClass3) || JDKUtils.isSQLDataSourceOrRowSet(clsLoadClass3)) {
                throw new JSONException("autoType is not support. ".concat(str));
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsLoadClass3)) {
                    afterAutoType(str, clsLoadClass3);
                    return clsLoadClass3;
                }
                if ((j & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != 0L) {
                    return cls;
                }
                StringBuilder sbM46712 = AbstractC2668.m4679("type not match. ", str, " -> ");
                sbM46712.append(cls.getName());
                throw new JSONException(sbM46712.toString());
            }
        }
        afterAutoType(str, clsLoadClass3);
        return clsLoadClass3;
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        Iterator<ConcurrentHashMap<Long, ObjectReader>> it = this.tclHashCaches.values().iterator();
        while (it.hasNext()) {
            Iterator<Map.Entry<Long, ObjectReader>> it2 = it.next().entrySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getValue().getObjectClass() == cls) {
                    it2.remove();
                }
            }
        }
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

    public Function<Consumer, CharArrayValueConsumer> createCharArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return this.creator.createCharArrayValueConsumerCreator(cls, fieldReaderArr);
    }

    public FieldReader createFieldReader(Class cls, String str, long j) {
        ObjectReader objectReader = (j & JSONReader.Feature.FieldBased.mask) != 0 ? this.cacheFieldBased.get(cls) : this.cache.get(cls);
        if (objectReader != null) {
            return objectReader.getFieldReader(str);
        }
        final AtomicReference atomicReference = new AtomicReference();
        final long jHashCode64LCase = Fnv.hashCode64LCase(str);
        final int i = 0;
        BeanUtils.fields(cls, new Consumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᲈᤞᲇ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (0) {
                    case 0:
                        ObjectReaderProvider.lambda$createFieldReader$0(jHashCode64LCase, atomicReference, (Field) obj);
                        break;
                    default:
                        ObjectReaderProvider.lambda$createFieldReader$1(jHashCode64LCase, atomicReference, (Method) obj);
                        break;
                }
            }
        });
        Field field = (Field) atomicReference.get();
        if (field != null) {
            return this.creator.createFieldReader(str, null, field.getType(), field);
        }
        final AtomicReference atomicReference2 = new AtomicReference();
        final int i2 = 1;
        BeanUtils.setters(cls, new Consumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᲈᤞᲇ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (1) {
                    case 0:
                        ObjectReaderProvider.lambda$createFieldReader$0(jHashCode64LCase, atomicReference2, (Field) obj);
                        break;
                    default:
                        ObjectReaderProvider.lambda$createFieldReader$1(jHashCode64LCase, atomicReference2, (Method) obj);
                        break;
                }
            }
        });
        Method method = (Method) atomicReference2.get();
        if (method == null) {
            return null;
        }
        Class<?> cls2 = method.getParameterTypes()[0];
        return this.creator.createFieldReaderMethod(cls, str, null, cls2, cls2, method);
    }

    public <T> Supplier<T> createObjectCreator(Class<T> cls, long j) {
        final ObjectReader objectReader = (j & JSONReader.Feature.FieldBased.mask) != 0 ? this.cacheFieldBased.get(cls) : this.cache.get(cls);
        if (objectReader != null) {
            return new Supplier() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᲇᲈᤞ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return ObjectReaderProvider.lambda$createObjectCreator$0(objectReader);
                }
            };
        }
        Constructor defaultConstructor = BeanUtils.getDefaultConstructor(cls, false);
        if (defaultConstructor != null) {
            return LambdaMiscCodec.createSupplier(defaultConstructor);
        }
        throw new JSONException("default constructor not found : ".concat(cls.getName()));
    }

    public <T> ObjectReader<T> createObjectReader(String[] strArr, Type[] typeArr, Supplier<T> supplier, FieldConsumer<T> fieldConsumer) {
        return createObjectReader(strArr, typeArr, null, supplier, fieldConsumer);
    }

    public Function<Consumer, ByteArrayValueConsumer> createValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return this.creator.createByteArrayValueConsumerCreator(cls, fieldReaderArr);
    }

    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    public Consumer<Class> getAutoTypeHandler() {
        return this.autoTypeHandler;
    }

    public Map<String, Date> getAutoTypeList() {
        return this.autoTypeList;
    }

    public void getBeanInfo(BeanInfo beanInfo, Class cls) {
        for (int i = 0; i < this.modules.size(); i++) {
            this.modules.get(i).getBeanInfo(beanInfo, cls);
        }
    }

    public ObjectReaderCreator getCreator() {
        ObjectReaderCreator contextReaderCreator = JSONFactory.getContextReaderCreator();
        return contextReaderCreator != null ? contextReaderCreator : this.creator;
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
        for (int i = 0; i < this.modules.size(); i++) {
            this.modules.get(i).getFieldInfo(fieldInfo, cls, field);
        }
    }

    @Override // com.alibaba.fastjson2.modules.ObjectCodecProvider
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    public List<ObjectReaderModule> getModules() {
        return this.modules;
    }

    public PropertyNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public ObjectReader getObjectReader(long j) {
        ObjectReaderCachePair objectReaderCachePair = readerCache;
        ObjectReader objectReader = null;
        if (objectReaderCachePair != null) {
            if (objectReaderCachePair.hashCode == j) {
                return objectReaderCachePair.reader;
            }
            int i = objectReaderCachePair.missCount;
            objectReaderCachePair.missCount = i + 1;
            if (i > 16) {
                readerCache = null;
            }
        }
        Long lValueOf = Long.valueOf(j);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != FASTJSON2_CLASS_LOADER) {
            ConcurrentHashMap<Long, ObjectReader> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                objectReader = concurrentHashMap.get(lValueOf);
            }
        }
        if (objectReader == null) {
            objectReader = this.hashCache.get(lValueOf);
        }
        if (objectReader != null && readerCache == null) {
            readerCache = new ObjectReaderCachePair(j, objectReader);
        }
        return objectReader;
    }

    public Function getTypeConvert(Type type, Type type2) {
        Map<Type, Function> map = this.typeConverts.get(type);
        if (map == null) {
            return null;
        }
        return map.get(type2);
    }

    public void init() {
        Iterator<ObjectReaderModule> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().init(this);
        }
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

    public boolean isDisableSmartMatch() {
        return this.disableSmartMatch;
    }

    public void mixIn(Class cls, Class cls2) {
        if (cls2 == null) {
            this.mixInCache.remove(cls);
        } else {
            this.mixInCache.put(cls, cls2);
        }
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
    }

    public ObjectReader register(Type type, ObjectReader objectReader, boolean z) {
        ConcurrentMap<Type, ObjectReader> concurrentMap = z ? this.cacheFieldBased : this.cache;
        return objectReader == null ? concurrentMap.remove(type) : concurrentMap.put(type, objectReader);
    }

    public void registerIfAbsent(long j, ObjectReader objectReader) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != JSON.class.getClassLoader()) {
            int iIdentityHashCode = System.identityHashCode(contextClassLoader);
            ConcurrentHashMap<Long, ObjectReader> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
            if (concurrentHashMap == null) {
                this.tclHashCaches.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap<>());
                concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
            }
            concurrentHashMap.putIfAbsent(Long.valueOf(j), objectReader);
        }
        this.hashCache.putIfAbsent(Long.valueOf(j), objectReader);
    }

    public void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    public Function registerTypeConvert(Type type, Type type2, Function function) {
        Map<Type, Function> map = this.typeConverts.get(type);
        if (map == null) {
            this.typeConverts.putIfAbsent(type, new ConcurrentHashMap());
            map = this.typeConverts.get(type);
        }
        return map.put(type2, function);
    }

    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    public void setAutoTypeHandler(Consumer<Class> consumer) {
        this.autoTypeHandler = consumer;
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

    public void setDisableSmartMatch(boolean z) {
        this.disableSmartMatch = z;
    }

    public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this.namingStrategy = propertyNamingStrategy;
    }

    public boolean unregister(ObjectReaderModule objectReaderModule) {
        return this.modules.remove(objectReaderModule);
    }

    public ObjectReader unregisterObjectReader(Type type) {
        return unregisterObjectReader(type, false);
    }

    public <T> ObjectReader<T> createObjectReader(String[] strArr, Type[] typeArr, long[] jArr, Supplier<T> supplier, FieldConsumer<T> fieldConsumer) {
        FieldReader[] fieldReaderArr = new FieldReader[strArr.length];
        int i = 0;
        while (i < strArr.length) {
            Type type = typeArr[i];
            fieldReaderArr[i] = this.creator.createFieldReader(strArr[i], type, TypeUtils.getClass(type), (jArr == null || i >= jArr.length) ? 0L : jArr[i], new FieldBiConsumer(i, fieldConsumer));
            i++;
        }
        return this.creator.createObjectReader(null, supplier, fieldReaderArr);
    }

    public void registerSeeAlsoSubType(Class cls, String str) {
        ObjectReaderSeeAlso objectReaderSeeAlso;
        ObjectReaderSeeAlso objectReaderSeeAlsoAddSubType;
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            throw new JSONException("superclass is null");
        }
        ObjectReader objectReader = getObjectReader(superclass);
        if (!(objectReader instanceof ObjectReaderSeeAlso) || (objectReaderSeeAlsoAddSubType = (objectReaderSeeAlso = (ObjectReaderSeeAlso) objectReader).addSubType(cls, str)) == objectReaderSeeAlso) {
            return;
        }
        if (this.cache.containsKey(superclass)) {
            this.cache.put(superclass, objectReaderSeeAlsoAddSubType);
        } else {
            this.cacheFieldBased.put(cls, objectReaderSeeAlsoAddSubType);
        }
    }

    public ObjectReader unregisterObjectReader(Type type, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).remove(type);
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Constructor constructor, int i, Parameter parameter) {
        int i2 = 0;
        while (i2 < this.modules.size()) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i2).getAnnotationProcessor();
            FieldInfo fieldInfo2 = fieldInfo;
            Class cls2 = cls;
            Constructor constructor2 = constructor;
            int i3 = i;
            Parameter parameter2 = parameter;
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo2, cls2, constructor2, i3, parameter2);
            }
            i2++;
            fieldInfo = fieldInfo2;
            cls = cls2;
            constructor = constructor2;
            i = i3;
            parameter = parameter2;
        }
    }

    public ObjectReader register(Type type, ObjectReader objectReader) {
        return register(type, objectReader, false);
    }

    public boolean unregisterObjectReader(Type type, ObjectReader objectReader) {
        return unregisterObjectReader(type, objectReader, false);
    }

    public boolean register(ObjectReaderModule objectReaderModule) {
        for (int size = this.modules.size() - 1; size >= 0; size--) {
            if (this.modules.get(size) == objectReaderModule) {
                return false;
            }
        }
        objectReaderModule.init(this);
        this.modules.add(0, objectReaderModule);
        return true;
    }

    public boolean unregisterObjectReader(Type type, ObjectReader objectReader, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).remove(type, objectReader);
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method, int i, Parameter parameter) {
        int i2 = 0;
        while (i2 < this.modules.size()) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i2).getAnnotationProcessor();
            FieldInfo fieldInfo2 = fieldInfo;
            Class cls2 = cls;
            Method method2 = method;
            int i3 = i;
            Parameter parameter2 = parameter;
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo2, cls2, method2, i3, parameter2);
            }
            i2++;
            fieldInfo = fieldInfo2;
            cls = cls2;
            method = method2;
            i = i3;
            parameter = parameter2;
        }
    }

    public ObjectReader registerIfAbsent(Type type, ObjectReader objectReader) {
        return registerIfAbsent(type, objectReader, false);
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method) {
        for (int i = 0; i < this.modules.size(); i++) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo, cls, method);
            }
        }
        if (fieldInfo.fieldName == null && fieldInfo.alternateNames == null) {
            String name = method.getName();
            if (name.startsWith("set")) {
                String strSubstring = name.substring(3);
                if (BeanUtils.getDeclaredField(cls, strSubstring) != null) {
                    fieldInfo.alternateNames = new String[]{strSubstring};
                }
            }
        }
    }

    public ObjectReader registerIfAbsent(Type type, ObjectReader objectReader, boolean z) {
        return (z ? this.cacheFieldBased : this.cache).putIfAbsent(type, objectReader);
    }

    public void cleanup(ClassLoader classLoader) {
        this.mixInCache.entrySet().removeIf(new C2260(0, classLoader));
        this.cache.entrySet().removeIf(new C2260(1, classLoader));
        this.cacheFieldBased.entrySet().removeIf(new C2260(2, classLoader));
        this.tclHashCaches.remove(Integer.valueOf(System.identityHashCode(classLoader)));
        BeanUtils.cleanupCache(classLoader);
    }

    public ObjectReader getObjectReader(String str, Class<?> cls, long j) {
        Class<?> clsCheckAutoType = checkAutoType(str, cls, j);
        if (clsCheckAutoType == null) {
            return null;
        }
        ObjectReader objectReader = getObjectReader(clsCheckAutoType, (j & JSONReader.Feature.FieldBased.mask) != 0);
        if (clsCheckAutoType != cls) {
            registerIfAbsent(Fnv.hashCode64(str), objectReader);
        }
        return objectReader;
    }

    public ObjectReader getObjectReader(Type type) {
        return getObjectReader(type, false);
    }

    public ObjectReader getObjectReader(Type type, boolean z) {
        ObjectReader objectReader;
        if (type == null) {
            type = Object.class;
        }
        if (z) {
            objectReader = this.cacheFieldBased.get(type);
        } else {
            objectReader = this.cache.get(type);
        }
        if (objectReader == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                objectReader = (z ? this.cacheFieldBased : this.cache).get(upperBounds[0]);
            }
        }
        return objectReader != null ? objectReader : getObjectReaderInternal(type, z);
    }

    public ObjectReaderProvider(ObjectReaderCreator objectReaderCreator) {
        long[] jArr;
        String[] strArr = AUTO_TYPE_ACCEPT_LIST;
        if (strArr == null) {
            jArr = new long[1];
        } else {
            jArr = new long[strArr.length + 1];
            int i = 0;
            while (true) {
                String[] strArr2 = AUTO_TYPE_ACCEPT_LIST;
                if (i >= strArr2.length) {
                    break;
                }
                jArr[i] = Fnv.hashCode64(strArr2[i]);
                i++;
            }
        }
        jArr[jArr.length - 1] = -6293031534589903644L;
        Arrays.sort(jArr);
        this.acceptHashCodes = jArr;
        this.hashCache.put(Long.valueOf(ObjectArrayReader.TYPE_HASH_CODE), ObjectArrayReader.INSTANCE);
        this.hashCache.put(-4834614249632438472L, ObjectReaderImplString.INSTANCE);
        this.hashCache.put(Long.valueOf(Fnv.hashCode64(TypeUtils.getTypeName(HashMap.class))), ObjectReaderImplMap.INSTANCE);
        this.creator = objectReaderCreator;
        this.modules.add(new ObjectReaderBaseModule(this));
        init();
    }

    @Deprecated
    public void addAutoTypeDeny(String str) {
    }
}
