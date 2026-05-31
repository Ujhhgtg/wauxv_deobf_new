package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import p000.AbstractC1095;
import p000.C0459;
import p000.C1704;
import p000.C2278;
import p000.C2279;
import p000.C2282;
import p000.C2283;
import p000.C2284;
import p000.C2286;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderCreator {
    public static final ObjectReaderCreator INSTANCE;
    public static final boolean JIT;
    protected static final Map<Class, LambdaSetterInfo> methodTypeMapping;
    protected final AtomicInteger jitErrorCount = new AtomicInteger();
    protected volatile Throwable jitErrorLast;

    /* JADX INFO: compiled from: obf */
    public static class LambdaSetterInfo {
        final Class fieldClass;
        final MethodType invokedType;
        final MethodType methodType;
        final MethodType sameMethodMethod;

        public LambdaSetterInfo(Class cls, Class cls2) {
            this.fieldClass = cls;
            Class cls3 = Void.TYPE;
            this.sameMethodMethod = MethodType.methodType(cls3, Object.class, cls);
            this.methodType = MethodType.methodType((Class<?>) cls3, (Class<?>) cls);
            this.invokedType = MethodType.methodType(cls2);
        }
    }

    static {
        JIT = (JDKUtils.ANDROID || JDKUtils.GRAAL) ? false : true;
        INSTANCE = new ObjectReaderCreator();
        HashMap map = new HashMap();
        methodTypeMapping = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new LambdaSetterInfo(cls, ObjBoolConsumer.class));
        Class cls2 = Byte.TYPE;
        map.put(cls2, new LambdaSetterInfo(cls2, ObjByteConsumer.class));
        Class cls3 = Short.TYPE;
        map.put(cls3, new LambdaSetterInfo(cls3, ObjShortConsumer.class));
        Class cls4 = Integer.TYPE;
        map.put(cls4, new LambdaSetterInfo(cls4, ObjIntConsumer.class));
        Class cls5 = Long.TYPE;
        map.put(cls5, new LambdaSetterInfo(cls5, ObjLongConsumer.class));
        Class cls6 = Character.TYPE;
        map.put(cls6, new LambdaSetterInfo(cls6, ObjCharConsumer.class));
        Class cls7 = Float.TYPE;
        map.put(cls7, new LambdaSetterInfo(cls7, ObjFloatConsumer.class));
        Class cls8 = Double.TYPE;
        map.put(cls8, new LambdaSetterInfo(cls8, ObjDoubleConsumer.class));
    }

    public static ObjectReader getInitReader(ObjectReaderProvider objectReaderProvider, Type type, Class cls, FieldInfo fieldInfo) {
        ObjectReader objectReader;
        ObjectReader objectReader2;
        ObjectReader initReader = fieldInfo.getInitReader();
        if (initReader == null && ((fieldInfo.keyUsing != null || fieldInfo.valueUsing != null) && Map.class.isAssignableFrom(cls))) {
            Class<?> cls2 = fieldInfo.keyUsing;
            ObjectReader objectReader3 = null;
            if (cls2 != null) {
                try {
                    Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objectReader2 = (ObjectReader) declaredConstructor.newInstance(null);
                } catch (Exception unused) {
                    objectReader2 = null;
                }
            } else {
                objectReader2 = null;
            }
            Class<?> cls3 = fieldInfo.valueUsing;
            if (cls3 != null) {
                try {
                    Constructor<?> declaredConstructor2 = cls3.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    objectReader3 = (ObjectReader) declaredConstructor2.newInstance(null);
                } catch (Exception unused2) {
                }
            }
            if (objectReader2 != null || objectReader3 != null) {
                ObjectReader objectReaderOf = ObjectReaderImplMap.of(type, cls, fieldInfo.features);
                if (objectReaderOf instanceof ObjectReaderImplMapTyped) {
                    ObjectReaderImplMapTyped objectReaderImplMapTyped = (ObjectReaderImplMapTyped) objectReaderOf;
                    if (objectReader2 != null) {
                        objectReaderImplMapTyped.keyObjectReader = objectReader2;
                    }
                    if (objectReader3 != null) {
                        objectReaderImplMapTyped.valueObjectReader = objectReader3;
                    }
                    return objectReaderImplMapTyped;
                }
            }
        }
        if (initReader != null) {
            return initReader;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            objectReader = objectReaderProvider.getObjectReader(Long.class);
            if (objectReader == ObjectReaderImplInt64.INSTANCE) {
                return initReader;
            }
        } else if (cls == BigDecimal.class) {
            objectReader = objectReaderProvider.getObjectReader(BigDecimal.class);
            if (objectReader == ObjectReaderImplBigDecimal.INSTANCE) {
                return initReader;
            }
        } else if (cls == BigInteger.class) {
            objectReader = objectReaderProvider.getObjectReader(BigInteger.class);
            if (objectReader == ObjectReaderImplBigInteger.INSTANCE) {
                return initReader;
            }
        } else if (cls != Date.class || (objectReader = objectReaderProvider.getObjectReader(Date.class)) == ObjectReaderImplDate.INSTANCE) {
            return initReader;
        }
        return objectReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createBuildFunction$7(Method method, Object obj) {
        try {
            return method.invoke(obj, null);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldReaders$2(FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, Map map, ObjectReaderProvider objectReaderProvider, Field field) {
        fieldInfo.init();
        fieldInfo.features = j | fieldInfo.features | JSONReader.Feature.FieldBased.mask;
        fieldInfo.format = str;
        createFieldReader(cls, type, str2, strArr, fieldInfo, field, (Map<String, List<FieldReader>>) map, objectReaderProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldReaders$3(FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, Map map, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo, Field field) {
        fieldInfo.init();
        fieldInfo.ignore = (field.getModifiers() & 1) == 0 && (JSONReader.Feature.FieldBased.mask & j) == 0;
        fieldInfo.features = j | fieldInfo.features;
        fieldInfo.format = str;
        createFieldReader(cls, type, str2, strArr, fieldInfo, field, (Map<String, List<FieldReader>>) map, objectReaderProvider);
        if (fieldInfo.required) {
            String name = fieldInfo.fieldName;
            if (name == null || name.isEmpty()) {
                name = field.getName();
            }
            beanInfo.required(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldReaders$4(FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, BeanInfo beanInfo, Map map, ObjectReaderProvider objectReaderProvider, Method method) {
        fieldInfo.init();
        fieldInfo.features = j | fieldInfo.features;
        fieldInfo.format = str;
        createFieldReader(cls, type, str2, strArr, beanInfo, fieldInfo, method, map, objectReaderProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldReaders$5(FieldInfo fieldInfo, long j, Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, Map map, ObjectReaderProvider objectReaderProvider, Method method) {
        fieldInfo.init();
        fieldInfo.features = j | fieldInfo.features;
        createFieldReader(cls, type, str, strArr, beanInfo, fieldInfo, method, map, objectReaderProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFieldReaders$6(Object obj, Object obj2) {
        Map map = (Map) obj;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if ((r26.readerFeatures & com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch.mask) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$createObjectReaderWithBuilder$0(FieldInfo fieldInfo, ObjectReaderProvider objectReaderProvider, Class cls, String str, Class cls2, BeanInfo beanInfo, int i, Map map, Type type, Method method) {
        Class cls3;
        Type type2;
        Class cls4;
        String str2;
        FieldInfo fieldInfo2;
        String[] strArr;
        int length;
        int i2;
        String str3;
        int i3;
        int i4;
        String[] strArr2;
        fieldInfo.init();
        objectReaderProvider.getFieldInfo(fieldInfo, cls, method);
        if (!fieldInfo.ignore) {
            String name = method.getName();
            String str4 = fieldInfo.fieldName;
            if (str4 == null || str4.isEmpty()) {
                if (name.length() > str.length() && name.startsWith(str)) {
                    name = BeanUtils.setterName(name, i);
                } else if (method.getDeclaringClass() != Object.class) {
                    cls3 = cls2;
                    if (method.getReturnType() == cls3) {
                        if (method.getAnnotation(JSONField.class) == null) {
                        }
                    }
                }
                if (method.getParameterCount() == 0) {
                    Class cls5 = cls3;
                    String str5 = name;
                    putIfAbsent(map, str5, createFieldReaderMethod(cls5, cls2, str5, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, method.getGenericReturnType(), method.getReturnType(), method, null), cls);
                    return;
                }
                String str6 = name;
                type2 = method.getGenericParameterTypes()[0];
                cls4 = method.getParameterTypes()[0];
                method.setAccessible(true);
                str2 = str6;
                putIfAbsent(map, str2, createFieldReaderMethod(cls2, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type2, cls4, method, null), cls);
                fieldInfo2 = fieldInfo;
                strArr = fieldInfo2.alternateNames;
                if (strArr != null) {
                    length = strArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        str3 = strArr[i2];
                        if (str2.equals(str3)) {
                            strArr2 = strArr;
                            i3 = length;
                            i4 = i2;
                        } else {
                            i3 = length;
                            i4 = i2;
                            strArr2 = strArr;
                            putIfAbsent(map, str3, createFieldReaderMethod(cls2, type, str3, fieldInfo2.ordinal, fieldInfo2.features, fieldInfo2.format, fieldInfo2.locale, fieldInfo2.defaultValue, fieldInfo2.schema, type2, cls4, method, null), cls);
                        }
                        i2 = i4 + 1;
                        fieldInfo2 = fieldInfo;
                        str2 = str2;
                        strArr = strArr2;
                        length = i3;
                    }
                }
            }
            name = fieldInfo.fieldName;
            cls3 = cls2;
            if (method.getParameterCount() == 0) {
                Class cls6 = cls3;
                String str7 = name;
                putIfAbsent(map, str7, createFieldReaderMethod(cls6, cls2, str7, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, method.getGenericReturnType(), method.getReturnType(), method, null), cls);
                return;
            }
            String str8 = name;
            type2 = method.getGenericParameterTypes()[0];
            cls4 = method.getParameterTypes()[0];
            method.setAccessible(true);
            str2 = str8;
            putIfAbsent(map, str2, createFieldReaderMethod(cls2, type, str8, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type2, cls4, method, null), cls);
            fieldInfo2 = fieldInfo;
            strArr = fieldInfo2.alternateNames;
            if (strArr != null) {
                length = strArr.length;
                i2 = 0;
                while (i2 < length) {
                    str3 = strArr[i2];
                    if (str2.equals(str3)) {
                        strArr2 = strArr;
                        i3 = length;
                        i4 = i2;
                    } else {
                        i3 = length;
                        i4 = i2;
                        strArr2 = strArr;
                        putIfAbsent(map, str3, createFieldReaderMethod(cls2, type, str3, fieldInfo2.ordinal, fieldInfo2.features, fieldInfo2.format, fieldInfo2.locale, fieldInfo2.defaultValue, fieldInfo2.schema, type2, cls4, method, null), cls);
                    }
                    i2 = i4 + 1;
                    fieldInfo2 = fieldInfo;
                    str2 = str2;
                    strArr = strArr2;
                    length = i3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createObjectReaderWithCreator$1(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo, Method method) {
        if (method.getReturnType() != cls) {
            return;
        }
        FieldInfo fieldInfo2 = new FieldInfo();
        objectReaderProvider.getFieldInfo(fieldInfo2, cls2, method);
        String str2 = fieldInfo2.fieldName;
        if (str2 == null) {
            str2 = BeanUtils.getterName(method, beanInfo.kotlin, PropertyNamingStrategy.CamelCase.name());
        }
        if (fieldInfo2.readUsing == null || !str.equals(str2)) {
            return;
        }
        fieldInfo.readUsing = fieldInfo2.readUsing;
    }

    private List<FieldReader> listOf(FieldReader fieldReader) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fieldReader);
        return arrayList;
    }

    private void putIfAbsent(Map<String, List<FieldReader>> map, String str, FieldReader fieldReader, Class cls) {
        FieldReader fieldReader2;
        List<FieldReader> list = map.get(str);
        if (list == null) {
            map.put(str, listOf(fieldReader));
            return;
        }
        if (fieldReader.isReadOnly()) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                fieldReader2 = null;
                break;
            }
            fieldReader2 = list.get(i);
            if (fieldReader2.sameTo(fieldReader)) {
                break;
            } else {
                i++;
            }
        }
        if (fieldReader2 == null) {
            list.add(fieldReader);
        } else if (fieldReader2.compareTo(fieldReader) > 0 || !fieldReader2.belongTo(cls)) {
            list.set(list.indexOf(fieldReader2), fieldReader);
        }
    }

    private FieldReader[] toFieldReaderArray(Map<String, List<FieldReader>> map) {
        FieldReader[] fieldReaderArr = new FieldReader[map.values().stream().mapToInt(new C1704(1)).sum()];
        ((List) map.values().stream().flatMap(new C2278(7)).collect(Collectors.toList())).toArray(fieldReaderArr);
        Arrays.sort(fieldReaderArr);
        return fieldReaderArr;
    }

    public <T, R> Function<T, R> createBuildFunction(Method method) {
        try {
            return createBuildFunctionLambda(method);
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            method.setAccessible(true);
            return new C2286(method, 0);
        }
    }

    public <T, R> Function<T, R> createBuildFunctionLambda(Method method) {
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(method.getDeclaringClass());
        try {
            MethodHandle methodHandleFindVirtual = lookupTrustedLookup.findVirtual(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType()));
            MethodType methodTypeType = methodHandleFindVirtual.type();
            return (Function) (Object) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, methodTypeType.erase(), methodHandleFindVirtual, methodTypeType).getTarget().invoke();
        } catch (Throwable th) {
            throw new JSONException("create fieldReader error", th);
        }
    }

    public Function<Consumer, ByteArrayValueConsumer> createByteArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return null;
    }

    public Function<Consumer, CharArrayValueConsumer> createCharArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return null;
    }

    public ObjectReader createEnumReader(Class cls, Method method, ObjectReaderProvider objectReaderProvider) throws NoSuchMethodException {
        Class mixIn;
        FieldInfo fieldInfo = new FieldInfo();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; enumArr != null && i < enumArr.length; i++) {
            Enum r4 = enumArr[i];
            String strName = r4.name();
            linkedHashMap.put(Long.valueOf(Fnv.hashCode64(strName)), r4);
            try {
                fieldInfo.init();
                objectReaderProvider.getFieldInfo(fieldInfo, cls, cls.getField(strName));
                String str = fieldInfo.fieldName;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64(str)), r4);
                }
                String[] strArr = fieldInfo.alternateNames;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64(str2)), r4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; enumArr != null && i2 < enumArr.length; i2++) {
            Enum r3 = enumArr[i2];
            String strName2 = r3.name();
            linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64LCase(strName2)), r3);
            String string = r3.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(Fnv.hashCode64LCase(string)), r3);
            }
        }
        int size = linkedHashMap.size();
        long[] jArr = new long[size];
        Iterator it = linkedHashMap.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        Arrays.sort(jArr);
        Member enumValueField = BeanUtils.getEnumValueField(cls, objectReaderProvider);
        if (enumValueField == null && objectReaderProvider.modules.size() > 0 && (mixIn = objectReaderProvider.getMixIn(cls)) != null) {
            Member enumValueField2 = BeanUtils.getEnumValueField(mixIn, objectReaderProvider);
            if (enumValueField2 instanceof Field) {
                try {
                    enumValueField = cls.getField(((Field) enumValueField2).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (enumValueField2 instanceof Method) {
                enumValueField = cls.getMethod(((Method) enumValueField2).getName(), null);
            }
        }
        Member member = enumValueField;
        Enum[] enumArr2 = new Enum[size];
        for (int i4 = 0; i4 < size; i4++) {
            enumArr2[i4] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i4]));
        }
        return new ObjectReaderImplEnum(cls, method, member, enumArr2, enumArr, jArr);
    }

    public <T> Function<Map<Long, Object>, T> createFactoryFunction(Method method, String... strArr) {
        method.setAccessible(true);
        return new FactoryFunction(method, strArr);
    }

    public void createFieldReader(Class cls, Type type, String str, String[] strArr, FieldInfo fieldInfo, Field field, Map<String, List<FieldReader>> map, ObjectReaderProvider objectReaderProvider) {
        String strFieldName;
        String[] strArr2;
        int i;
        int i2;
        Map<String, List<FieldReader>> map2;
        objectReaderProvider.getFieldInfo(fieldInfo, cls, field);
        if (!fieldInfo.ignore || ((fieldInfo.features & FieldInfo.UNWRAPPED_MASK) != 0 && Map.class.isAssignableFrom(field.getType()))) {
            String str2 = fieldInfo.fieldName;
            if (str2 == null || str2.isEmpty()) {
                String name = field.getName();
                strFieldName = str != null ? BeanUtils.fieldName(name, str) : name;
            } else {
                strFieldName = fieldInfo.fieldName;
            }
            if (strArr != null && strArr.length > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= strArr.length) {
                        if (fieldInfo.ordinal != 0) {
                            break;
                        }
                        fieldInfo.ordinal = strArr.length;
                        break;
                    } else {
                        if (strFieldName.equals(strArr[i3])) {
                            fieldInfo.ordinal = i3;
                            break;
                        }
                        i3++;
                    }
                }
            }
            Type genericType = field.getGenericType();
            Class<?> type2 = field.getType();
            ObjectReader initReader = getInitReader(objectReaderProvider, genericType, type2, fieldInfo);
            String str3 = fieldInfo.schema;
            if (fieldInfo.required && str3 == null) {
                str3 = "{\"required\":true}";
            }
            Class<?> cls2 = type2;
            Type type3 = genericType;
            String str4 = str3;
            String str5 = strFieldName;
            Map<String, List<FieldReader>> map3 = map;
            Class cls3 = cls;
            ObjectReaderCreator objectReaderCreator = this;
            FieldReader fieldReaderCreateFieldReader = objectReaderCreator.createFieldReader(cls3, type, str5, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, str4, type3, cls2, field, initReader, fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler());
            String str6 = str5;
            objectReaderCreator.putIfAbsent(map3, str6, fieldReaderCreateFieldReader, cls3);
            FieldInfo fieldInfo2 = fieldInfo;
            String[] strArr3 = fieldInfo2.alternateNames;
            if (strArr3 != null) {
                int length = strArr3.length;
                int i4 = 0;
                while (i4 < length) {
                    String str7 = strArr3[i4];
                    if (str6.equals(str7)) {
                        strArr2 = strArr3;
                        i2 = length;
                        i = i4;
                        map2 = map3;
                    } else {
                        strArr2 = strArr3;
                        String str8 = str4;
                        Type type4 = type3;
                        Class<?> cls4 = cls2;
                        i = i4;
                        i2 = length;
                        map2 = map3;
                        ObjectReaderCreator objectReaderCreator2 = objectReaderCreator;
                        Class cls5 = cls3;
                        FieldReader fieldReaderCreateFieldReader2 = objectReaderCreator2.createFieldReader(cls5, type, str7, fieldInfo2.ordinal, fieldInfo2.features, null, fieldInfo2.locale, fieldInfo2.defaultValue, str8, type4, cls4, field, null);
                        cls3 = cls5;
                        cls2 = cls4;
                        objectReaderCreator = objectReaderCreator2;
                        type3 = type4;
                        str4 = str8;
                        objectReaderCreator.putIfAbsent(map2, str7, fieldReaderCreateFieldReader2, cls3);
                    }
                    i4 = i + 1;
                    fieldInfo2 = fieldInfo;
                    map3 = map2;
                    str6 = str6;
                    strArr3 = strArr2;
                    length = i2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader createFieldReaderLambda(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, ObjectReader objectReader) {
        JSONSchema jSONSchemaOf;
        Object objApply = obj;
        if (objApply != null && objApply.getClass() != cls2) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
            if (typeConvert == 0) {
                throw new JSONException("illegal defaultValue : " + objApply + ", class " + cls2.getName());
            }
            objApply = typeConvert.apply(objApply);
        }
        Object obj2 = objApply;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaOf = null;
        } else {
            JSONObject object = JSON.parseObject(str3);
            if (object.isEmpty()) {
                jSONSchemaOf = null;
            } else {
                jSONSchemaOf = JSONSchema.of(object, cls2);
            }
        }
        JSONSchema jSONSchema = jSONSchemaOf;
        if (objectReader != null) {
            return createFieldReader(cls, type, str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, method, (BiConsumer) lambdaSetter(cls, cls2, method), objectReader);
        }
        if (type2 == Boolean.TYPE) {
            return new FieldReaderBoolValue(str, i, j, str2, locale, (Boolean) obj2, jSONSchema, method, null, (ObjBoolConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Byte.TYPE) {
            return new FieldReaderInt8Value(str, i, j, str2, locale, (Byte) obj2, jSONSchema, method, null, (ObjByteConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Short.TYPE) {
            return new FieldReaderInt16Value(str, i, j, str2, locale, (Short) obj2, jSONSchema, method, null, (ObjShortConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Integer.TYPE) {
            return new FieldReaderInt32Value(str, i, j, str2, locale, (Integer) obj2, jSONSchema, method, null, (ObjIntConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Long.TYPE) {
            return new FieldReaderInt64Value(str, i, j, str2, locale, (Long) obj2, jSONSchema, method, null, (ObjLongConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Character.TYPE) {
            return new FieldReaderCharValue(str, i, j, str2, null, (Character) obj2, jSONSchema, method, null, (ObjCharConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 == Float.TYPE) {
            return new FieldReaderFloatValue(str, i, j, str2, locale, (Float) obj2, jSONSchema, method, null, (ObjFloatConsumer) lambdaSetter(cls, cls2, method), null, null);
        }
        if (type2 != Double.TYPE) {
            return createFieldReader(cls, type, str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, method, (BiConsumer) lambdaSetter(cls, cls2, method), null);
        }
        return new FieldReaderDoubleValue(str, i, j, str2, locale, (Double) obj2, jSONSchema, method, null, (ObjDoubleConsumer) lambdaSetter(cls, cls2, method), null, null);
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, str2, null, null, null, type, cls2, method, null);
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i, long j, String str2, Type type2, Class cls2, String str3, Class cls3, Parameter parameter, JSONSchema jSONSchema) {
        return createFieldReaderParam(cls, type, str, i, j, str2, type2, cls2, str3, cls3, parameter, jSONSchema, null);
    }

    public FieldReader[] createFieldReaders(ObjectReaderProvider objectReaderProvider, Class cls, Type type, Executable executable, Parameter[] parameterArr, String... strArr) {
        ObjectReaderProvider objectReaderProvider2;
        Class<?> cls2;
        int i;
        String[] strArr2;
        Field declaredField;
        Class<?> declaringClass = executable != null ? executable.getDeclaringClass() : null;
        ArrayList arrayList = new ArrayList(parameterArr.length);
        int i2 = 0;
        while (i2 < parameterArr.length) {
            FieldInfo fieldInfo = new FieldInfo();
            Parameter parameter = parameterArr[i2];
            String name = i2 < strArr.length ? strArr[i2] : parameter.getName();
            boolean z = executable instanceof Constructor;
            if (z) {
                objectReaderProvider2 = objectReaderProvider;
                cls2 = declaringClass;
                objectReaderProvider2.getFieldInfo(fieldInfo, cls2, (Constructor) executable, i2, parameter);
            } else {
                objectReaderProvider2 = objectReaderProvider;
                cls2 = declaringClass;
            }
            if (z && (declaredField = BeanUtils.getDeclaredField(cls2, name)) != null) {
                objectReaderProvider2.getFieldInfo(fieldInfo, cls2, declaredField);
            }
            String str = fieldInfo.fieldName;
            String strM2794 = (str == null || str.isEmpty()) ? name : fieldInfo.fieldName;
            if (strM2794 == null) {
                strM2794 = AbstractC1095.m2794(i2, "arg");
            }
            String str2 = strM2794;
            if (name == null) {
                name = AbstractC1095.m2794(i2, "arg");
            }
            String str3 = name;
            ObjectReader initReader = getInitReader(objectReaderProvider2, parameter.getParameterizedType(), parameter.getType(), fieldInfo);
            Type parameterizedType = parameter.getParameterizedType();
            Type typeResolve = BeanUtils.resolve(type, cls, parameterizedType);
            Type type2 = typeResolve != null ? typeResolve : parameterizedType;
            declaringClass = cls2;
            ArrayList arrayList2 = arrayList;
            String str4 = str2;
            arrayList2.add(createFieldReaderParam(null, null, str2, i2, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, parameter.getType(), str3, declaringClass, parameter, null, initReader));
            String[] strArr3 = fieldInfo.alternateNames;
            if (strArr3 != null) {
                int i3 = 0;
                for (int length = strArr3.length; i3 < length; length = length) {
                    int i4 = i3;
                    String str5 = strArr3[i4];
                    if (str4.equals(str5)) {
                        strArr2 = strArr3;
                        i = i4;
                    } else {
                        i = i4;
                        strArr2 = strArr3;
                        arrayList2.add(createFieldReaderParam(null, null, str5, i2, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, type2, parameter.getType(), str3, declaringClass, parameter, null, initReader));
                    }
                    i3 = i + 1;
                    str4 = str4;
                    strArr3 = strArr2;
                }
            }
            i2++;
            arrayList = arrayList2;
        }
        return (FieldReader[]) arrayList.toArray(new FieldReader[0]);
    }

    public <T> Function<Map<Long, Object>, T> createFunction(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        return new ConstructorFunction(null, constructor, null, null, null, strArr);
    }

    public <T> IntFunction<T> createIntFunction(Constructor constructor) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID_INT), MethodType.methodType((Class<?>) declaringClass, (Class<?>) Integer.TYPE)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> ObjectReaderNoneDefaultConstructor createNoneDefaultConstructorObjectReader(Class cls, BeanInfo beanInfo, Function<Map<Long, Object>, T> function, List<Constructor> list, String[] strArr, FieldReader[] fieldReaderArr, FieldReader[] fieldReaderArr2) {
        return new ObjectReaderNoneDefaultConstructor(cls, beanInfo.typeKey, beanInfo.typeName, beanInfo.readerFeatures, function, list, strArr, fieldReaderArr, fieldReaderArr2, beanInfo.seeAlso, beanInfo.seeAlsoNames);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, null, createSupplier(cls), null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderFactoryMethod(Method method, String... strArr) {
        return new ObjectReaderNoneDefaultConstructor(null, null, null, 0L, createFactoryFunction(method, strArr), null, strArr, createFieldReaders(JSONFactory.getDefaultObjectReaderProvider(), null, null, method, method.getParameters(), strArr), null, null, null);
    }

    public <T> ObjectReader<T> createObjectReaderNoneDefaultConstructor(Constructor constructor, String... strArr) {
        Function<Map<Long, Object>, T> functionCreateFunction = createFunction(constructor, strArr);
        Class<T> declaringClass = constructor.getDeclaringClass();
        return createObjectReaderNoneDefaultConstructor(declaringClass, functionCreateFunction, createFieldReaders(JSONFactory.getDefaultObjectReaderProvider(), declaringClass, declaringClass, constructor, constructor.getParameters(), strArr));
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, Class[] clsArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), "@type", clsArr, null, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderWithBuilder(final Class<T> cls, final Type type, final ObjectReaderProvider objectReaderProvider, final BeanInfo beanInfo) {
        Method method = beanInfo.buildMethod;
        Function functionCreateBuildFunction = method != null ? createBuildFunction(method) : null;
        final Class<T> cls2 = beanInfo.builder;
        String str = beanInfo.builderWithPrefix;
        if (str == null || str.isEmpty()) {
            str = "with";
        }
        final String str2 = str;
        final int length = str2.length();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final FieldInfo fieldInfo = new FieldInfo();
        BeanUtils.setters((Class) cls2, false, (Consumer<Method>) new Consumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᲇᤞᤝ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f7428.lambda$createObjectReaderWithBuilder$0(fieldInfo, objectReaderProvider, cls, str2, cls2, beanInfo, length, linkedHashMap, type, (Method) obj);
            }
        });
        return createObjectReader(cls2, 0L, createSupplier(cls2), functionCreateBuildFunction, toFieldReaderArray(linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> ObjectReader<T> createObjectReaderWithCreator(Class<T> cls, Type type, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo) {
        Parameter[] parameters;
        Class<?> declaringClass;
        String[] strArrLookupParameterNames;
        long j;
        String[] strArr;
        Function<Map<Long, Object>, T> functionCreateFactoryFunction;
        FieldReader[] fieldReaderArr;
        JSONSchema jSONSchemaOf;
        IntFunction intFunctionCreateIntFunction;
        int i;
        ObjectReaderCreator objectReaderCreator;
        Parameter parameter;
        BeanInfo beanInfo2 = beanInfo;
        FieldInfo fieldInfo = new FieldInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Constructor constructor = beanInfo2.creatorConstructor;
        if (constructor != null) {
            parameters = constructor.getParameters();
            declaringClass = beanInfo2.creatorConstructor.getDeclaringClass();
            strArrLookupParameterNames = ASMUtils.lookupParameterNames(beanInfo2.creatorConstructor);
        } else {
            parameters = beanInfo2.createMethod.getParameters();
            declaringClass = beanInfo2.createMethod.getDeclaringClass();
            strArrLookupParameterNames = ASMUtils.lookupParameterNames(beanInfo2.createMethod);
        }
        Parameter[] parameterArr = parameters;
        Class<?> cls2 = declaringClass;
        String[] strArr2 = strArrLookupParameterNames;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= parameterArr.length) {
                j = 0;
                break;
            }
            fieldInfo.init();
            Parameter parameter2 = parameterArr[i3];
            Constructor constructor2 = beanInfo2.creatorConstructor;
            if (constructor2 != null) {
                objectReaderProvider.getFieldInfo(fieldInfo, cls, constructor2, i3, parameter2);
            } else {
                objectReaderProvider.getFieldInfo(fieldInfo, cls, beanInfo2.createMethod, i3, parameter2);
            }
            int i4 = i3;
            j = 0;
            Parameter parameter3 = parameter2;
            if (parameterArr.length == 1 && (fieldInfo.features & FieldInfo.VALUE_MASK) != 0) {
                break;
            }
            String name = fieldInfo.fieldName;
            if (name == null || name.isEmpty()) {
                String[] strArr3 = beanInfo2.createParameterNames;
                if (strArr3 != null && i4 < strArr3.length) {
                    name = strArr3[i4];
                }
                if (name == null || name.isEmpty()) {
                    name = parameter3.getName();
                }
            }
            if (name == null || name.isEmpty()) {
                name = strArr2[i4];
            } else if (!name.startsWith("arg")) {
                strArr2[i4] = name;
            } else if (strArr2 != null && strArr2.length > i4) {
                name = strArr2[i4];
            }
            FieldInfo fieldInfo2 = fieldInfo;
            String strM2794 = name;
            Class<?> type2 = parameter3.getType();
            BeanUtils.getters(cls, new C2279(type2, objectReaderProvider, cls, beanInfo, strM2794, fieldInfo2));
            if (strM2794 == null || strM2794.isEmpty()) {
                strM2794 = AbstractC1095.m2794(i4, "arg");
            }
            String str = strM2794;
            String[] strArr4 = strArr2;
            Type parameterizedType = parameter3.getParameterizedType();
            Parameter[] parameterArr2 = parameterArr;
            ObjectReaderCreator objectReaderCreator2 = this;
            linkedHashMap.put(str, objectReaderCreator2.listOf(objectReaderCreator2.createFieldReaderParam(cls, type, str, i4, fieldInfo2.features, fieldInfo2.format, parameterizedType, type2, str, cls2, parameter3, null, getInitReader(objectReaderProvider, parameterizedType, type2, fieldInfo2))));
            String[] strArr5 = fieldInfo2.alternateNames;
            if (strArr5 != null) {
                int i5 = 0;
                for (int length = strArr5.length; i5 < length; length = length) {
                    String str2 = strArr5[i5];
                    if (str.equals(str2)) {
                        Parameter parameter4 = parameter3;
                        objectReaderCreator = objectReaderCreator2;
                        parameter = parameter4;
                        i = i5;
                    } else {
                        String str3 = str;
                        i = i5;
                        FieldReader fieldReaderCreateFieldReaderParam = objectReaderCreator2.createFieldReaderParam(cls, type, str2, i4, fieldInfo2.features, fieldInfo2.format, parameterizedType, type2, str3, cls2, parameter3, null);
                        Parameter parameter5 = parameter3;
                        objectReaderCreator = objectReaderCreator2;
                        parameter = parameter5;
                        str = str3;
                        objectReaderCreator.putIfAbsent(linkedHashMap, str2, fieldReaderCreateFieldReaderParam, cls);
                    }
                    i5 = i + 1;
                    ObjectReaderCreator objectReaderCreator3 = objectReaderCreator;
                    parameter3 = parameter;
                    objectReaderCreator2 = objectReaderCreator3;
                    strArr5 = strArr5;
                }
            }
            i3 = i4 + 1;
            beanInfo2 = beanInfo;
            fieldInfo = fieldInfo2;
            parameterArr = parameterArr2;
            strArr2 = strArr4;
        }
        boolean[] zArr = null;
        functionCreateValueFunction = null;
        functionCreateValueFunction = null;
        functionCreateValueFunction = null;
        functionCreateValueFunction = null;
        Function functionCreateValueFunction = null;
        if (parameterArr.length != 1 || (fieldInfo.features & FieldInfo.VALUE_MASK) == j) {
            Constructor constructor3 = beanInfo.creatorConstructor;
            if (constructor3 != null) {
                strArr = strArr2;
                functionCreateFactoryFunction = createFunction(constructor3, beanInfo.markerConstructor, strArr);
            } else {
                strArr = strArr2;
                functionCreateFactoryFunction = createFactoryFunction(beanInfo.createMethod, strArr);
            }
            Function<Map<Long, Object>, T> function = functionCreateFactoryFunction;
            FieldReader[] fieldReaderArrCreateFieldReaders = createFieldReaders(cls, type);
            Arrays.sort(fieldReaderArrCreateFieldReaders);
            int i6 = 0;
            for (int i7 = 0; i7 < fieldReaderArrCreateFieldReaders.length; i7++) {
                if (linkedHashMap.containsKey(fieldReaderArrCreateFieldReaders[i7].fieldName)) {
                    if (zArr == null) {
                        zArr = new boolean[fieldReaderArrCreateFieldReaders.length];
                    }
                    zArr[i7] = true;
                    i6++;
                }
            }
            if (i6 > 0) {
                FieldReader[] fieldReaderArr2 = new FieldReader[fieldReaderArrCreateFieldReaders.length - i6];
                for (int i8 = 0; i8 < fieldReaderArrCreateFieldReaders.length; i8++) {
                    if (!zArr[i8]) {
                        fieldReaderArr2[i2] = fieldReaderArrCreateFieldReaders[i8];
                        i2++;
                    }
                }
                fieldReaderArr = fieldReaderArr2;
            } else {
                fieldReaderArr = fieldReaderArrCreateFieldReaders;
            }
            return createNoneDefaultConstructorObjectReader(cls, beanInfo, function, null, strArr, toFieldReaderArray(linkedHashMap), fieldReaderArr);
        }
        Constructor constructor4 = beanInfo.creatorConstructor;
        Type type3 = constructor4 == null ? beanInfo.createMethod.getGenericParameterTypes()[0] : constructor4.getGenericParameterTypes()[0];
        Constructor constructor5 = beanInfo.creatorConstructor;
        Class<?> cls3 = constructor5 == null ? beanInfo.createMethod.getParameterTypes()[0] : constructor5.getParameterTypes()[0];
        String str4 = fieldInfo.schema;
        if (str4 == null || str4.isEmpty()) {
            jSONSchemaOf = null;
        } else {
            JSONObject object = JSON.parseObject(fieldInfo.schema);
            if (object.isEmpty()) {
                jSONSchemaOf = null;
            } else {
                jSONSchemaOf = JSONSchema.of(object, cls3);
            }
        }
        Object objApply = fieldInfo.defaultValue;
        if (objApply != null && objApply.getClass() != cls3) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type3);
            if (typeConvert == 0) {
                throw new JSONException("illegal defaultValue : " + objApply + ", class " + cls3.getName());
            }
            objApply = typeConvert.apply(objApply);
        }
        i2 = (!JIT && (fieldInfo.features & FieldInfo.JIT) == j && (beanInfo.readerFeatures & FieldInfo.JIT) == j) ? 0 : 1;
        if (objApply == null && i2 != 0) {
            if (cls3 == Integer.TYPE) {
                Constructor constructor6 = beanInfo.creatorConstructor;
                if (constructor6 != null) {
                    intFunctionCreateIntFunction = createIntFunction(constructor6);
                } else {
                    Method method = beanInfo.createMethod;
                    intFunctionCreateIntFunction = method != null ? createIntFunction(method) : null;
                }
                if (intFunctionCreateIntFunction != null) {
                    return ObjectReaderImplValueInt.of(cls, fieldInfo.features, jSONSchemaOf, intFunctionCreateIntFunction);
                }
            } else if (cls3 == String.class) {
                Constructor constructor7 = beanInfo.creatorConstructor;
                if (constructor7 != null) {
                    functionCreateValueFunction = createStringFunction(constructor7);
                } else {
                    Method method2 = beanInfo.createMethod;
                    if (method2 != null) {
                        functionCreateValueFunction = createStringFunction(method2);
                    }
                }
                if (functionCreateValueFunction != null) {
                    return ObjectReaderImplValueString.of(cls, fieldInfo.features, jSONSchemaOf, functionCreateValueFunction);
                }
            }
        }
        if (i2 != 0 && !cls3.isPrimitive()) {
            Constructor constructor8 = beanInfo.creatorConstructor;
            if (constructor8 != null) {
                functionCreateValueFunction = createValueFunction(constructor8, cls3);
            } else {
                Method method3 = beanInfo.createMethod;
                if (method3 != null) {
                    functionCreateValueFunction = createValueFunction(method3, cls3);
                }
            }
        }
        return new ObjectReaderImplValue(cls, type3, cls3, fieldInfo.features, fieldInfo.format, objApply, jSONSchemaOf, beanInfo.creatorConstructor, beanInfo.createMethod, functionCreateValueFunction);
    }

    public <T> Function<String, T> createStringFunction(Constructor constructor) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID_STRING), MethodType.methodType((Class<?>) declaringClass, (Class<?>) String.class)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Supplier<T> createSupplier(Class<T> cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            return createSupplier((cls.getName().indexOf(36) == -1 || Modifier.isStatic(cls.getModifiers())) ? cls.getDeclaredConstructor(null) : cls.getDeclaredConstructor(cls.getDeclaringClass()));
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            throw new JSONException("get constructor error, class ".concat(cls.getName()), th);
        }
    }

    public <I, T> Function<I, T> createValueFunction(Constructor<T> constructor, Class<I> cls) {
        Class<T> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) cls)), MethodType.methodType((Class<?>) declaringClass, (Class<?>) cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public Object lambdaSetter(Class cls, Class cls2, Method method) {
        MethodType methodType;
        MethodType methodType2;
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
        Class<?> returnType = method.getReturnType();
        LambdaSetterInfo lambdaSetterInfo = methodTypeMapping.get(cls2);
        Class<?> cls3 = Void.TYPE;
        MethodType methodType3 = null;
        if (lambdaSetterInfo != null) {
            methodType = lambdaSetterInfo.sameMethodMethod;
            methodType2 = lambdaSetterInfo.invokedType;
            if (returnType == cls3) {
                methodType3 = lambdaSetterInfo.methodType;
            }
        } else {
            methodType = TypeUtils.METHOD_TYPE_VOO;
            methodType2 = TypeUtils.METHOD_TYPE_BI_CONSUMER;
        }
        MethodType methodType4 = methodType2;
        if (methodType3 == null) {
            methodType3 = MethodType.methodType(returnType, (Class<?>) cls2);
        }
        try {
            return (Object) LambdaMetafactory.metafactory(lookupTrustedLookup, "accept", methodType4, methodType, lookupTrustedLookup.findVirtual(cls, method.getName(), methodType3), MethodType.methodType(cls3, cls, cls2)).getTarget().invoke();
        } catch (Throwable th) {
            throw new JSONException("create fieldReader error", th);
        }
    }

    public <T> FieldReader createFieldReaderMethod(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, ObjectReader objectReader) {
        return createFieldReaderMethod(cls, type, str, i, j, str2, locale, obj, str3, type2, cls2, method, objectReader, null, null);
    }

    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i, long j, String str2, Type type2, Class cls2, String str3, Class cls3, Parameter parameter, JSONSchema jSONSchema, ObjectReader objectReader) {
        return createFieldReaderParam(cls, type, str, i, j, str2, null, null, type2, cls2, str3, cls3, parameter, jSONSchema, objectReader);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0330  */
    /* JADX WARN: Code duplicated, block: B:136:0x0345  */
    /* JADX WARN: Code duplicated, block: B:138:0x0349  */
    /* JADX WARN: Code duplicated, block: B:140:0x035e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0362  */
    /* JADX WARN: Code duplicated, block: B:144:0x0377  */
    /* JADX WARN: Code duplicated, block: B:146:0x037b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0390  */
    /* JADX WARN: Code duplicated, block: B:150:0x0394  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:158:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:168:0x040b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0411  */
    /* JADX WARN: Code duplicated, block: B:172:0x041b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0447  */
    /* JADX WARN: Code duplicated, block: B:177:0x044d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x044e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0468  */
    /* JADX WARN: Code duplicated, block: B:187:0x046c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0476  */
    /* JADX WARN: Code duplicated, block: B:191:0x047e  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:196:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:198:0x04db  */
    /* JADX WARN: Code duplicated, block: B:210:0x050f  */
    /* JADX WARN: Code duplicated, block: B:212:0x051b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0537  */
    /* JADX WARN: Code duplicated, block: B:219:0x053c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0554  */
    /* JADX WARN: Code duplicated, block: B:225:0x0559  */
    /* JADX WARN: Code duplicated, block: B:228:0x056f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0578  */
    /* JADX WARN: Code duplicated, block: B:232:0x057d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0583  */
    /* JADX WARN: Code duplicated, block: B:237:0x0589  */
    /* JADX WARN: Code duplicated, block: B:240:0x058e  */
    /* JADX WARN: Code duplicated, block: B:243:0x05af  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:250:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader createFieldReaderMethod(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, ObjectReader objectReader, String str4, BiConsumer biConsumer) {
        JSONSchema jSONSchemaOf;
        Type type3;
        Class<T> cls3;
        Type fieldType;
        Class<?> mapping;
        Class cls4;
        Class cls5;
        Type type4;
        Class<?> cls6;
        Type typeResolveCollectionItemType;
        Class<?> mapping2;
        Type type5;
        Class<?> cls7;
        Class cls8;
        Class cls9;
        Type[] actualTypeArguments;
        Type type6;
        Class<?> mapping3;
        Class cls10;
        Type type7;
        Field field;
        String name;
        String name2;
        String name3;
        Type type8;
        Object objApply = obj;
        if (method != null) {
            method.setAccessible(true);
        }
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        if (objApply != null && objApply.getClass() != cls2 && (!JSONFactory.isJSONFieldDefaultValueCompatMode() || !(objApply instanceof String) || !Date.class.isAssignableFrom(cls2))) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
            if (typeConvert != 0) {
                objApply = typeConvert.apply(objApply);
            } else {
                throw new JSONException("illegal defaultValue : " + objApply + ", class " + cls2.getName());
            }
        }
        Object obj2 = objApply;
        Field declaredField = null;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaOf = null;
        } else {
            JSONObject object = JSON.parseObject(str3);
            if (object.isEmpty()) {
                jSONSchemaOf = null;
            } else {
                jSONSchemaOf = JSONSchema.of(object, cls2);
            }
        }
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls2, i, j | FieldInfo.READ_USING_MASK, str2, locale, obj2, jSONSchemaOf, method, null, null);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        if (type2 == Boolean.TYPE) {
            return new FieldReaderBoolValue(str, i, j, str2, locale, (Boolean) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Boolean.class) {
            return new FieldReaderBool(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Byte.TYPE) {
            return new FieldReaderInt8Value(str, i, j, str2, locale, (Byte) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Short.TYPE) {
            return new FieldReaderInt16Value(str, i, j, str2, locale, (Short) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Integer.TYPE) {
            return new FieldReaderInt32Value(str, i, j, str2, locale, (Integer) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Long.TYPE) {
            return new FieldReaderInt64Value(str, i, j, str2, locale, (Long) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Float.TYPE) {
            return new FieldReaderFloatValue(str, i, j, str2, locale, (Float) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Double.TYPE) {
            return new FieldReaderDoubleValue(str, i, j, str2, locale, (Double) obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Byte.class) {
            return new FieldReaderInt8(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Short.class) {
            return new FieldReaderInt16(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Integer.class) {
            return new FieldReaderInt32(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Long.class) {
            return new FieldReaderInt64(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Float.class) {
            return new FieldReaderFloat(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == Double.class) {
            return new FieldReaderDouble(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimal(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigInteger(str, type2, cls2, i, j, str2, locale, (BigInteger) obj2, jSONSchemaOf, method, null, null);
        }
        if (type2 == String.class) {
            return new FieldReaderString(str, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null);
        }
        if (type2 == LocalDate.class) {
            return new FieldReaderLocalDate(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null);
        }
        if (type2 == OffsetDateTime.class) {
            return new FieldReaderOffsetDateTime(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null);
        }
        if (type2 == UUID.class) {
            return new FieldReaderUUID(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null);
        }
        if (type2 == String[].class) {
            return new FieldReaderStringArray(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null);
        }
        if (type2 instanceof Class) {
            type3 = type;
            if (type3 instanceof Class) {
                cls3 = cls;
                fieldType = null;
                mapping = null;
            }
            if (method.getParameterCount() == 0) {
                cls4 = cls2;
            } else {
                if (cls2 == AtomicInteger.class) {
                    return new FieldReaderAtomicInteger(str, cls2, i, jSONSchemaOf, method, null);
                }
                if (cls2 == AtomicLong.class) {
                    return new FieldReaderAtomicLong(str, cls2, i, jSONSchemaOf, method, null);
                }
                if (cls2 == AtomicIntegerArray.class) {
                    return new FieldReaderAtomicIntegerArrayReadOnly(str, cls2, i, jSONSchemaOf, method, null);
                }
                if (cls2 == AtomicLongArray.class) {
                    return new FieldReaderAtomicLongArrayReadOnly(str, cls2, i, jSONSchemaOf, method, null);
                }
                if (cls2 == AtomicBoolean.class) {
                    return new FieldReaderAtomicBooleanReadOnly(str, cls2, i, str2, (AtomicBoolean) obj2, jSONSchemaOf, method, null);
                }
                if (cls2 == AtomicReference.class) {
                    return new FieldReaderAtomicReference(str, type2, cls2, i, j, str2, jSONSchemaOf, method, null);
                }
                cls4 = cls2;
                if (Collection.class.isAssignableFrom(cls4)) {
                    name3 = method.getName();
                    if (name3.startsWith("get")) {
                        declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name3, PropertyNamingStrategy.CamelCase.name()));
                    }
                    if (fieldType != null) {
                        type8 = fieldType;
                    } else {
                        type8 = type2;
                    }
                    return new FieldReaderCollectionReadOnly(str, type8, cls4, i, j, str2, jSONSchemaOf, method, declaredField);
                }
                if (Map.class.isAssignableFrom(cls4)) {
                    name2 = method.getName();
                    if (name2.startsWith("get")) {
                        declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name2, PropertyNamingStrategy.CamelCase.name()));
                    }
                    return new FieldReaderMapReadOnly(str, type2, cls4, i, j, str2, jSONSchemaOf, method, declaredField, str4, biConsumer);
                }
                if (!cls3.isInterface()) {
                    return null;
                }
            }
            int i2 = 0;
            if (!List.class.isAssignableFrom(cls4) || "cn.hutool.json.JSONArray".equals(cls4.getName())) {
                if (fieldType instanceof ParameterizedType) {
                    actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        type6 = actualTypeArguments[0];
                        mapping3 = TypeUtils.getMapping(type6);
                        if (mapping3 == String.class) {
                            return new FieldReaderList(str, fieldType, cls4, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                        }
                        return new FieldReaderList(str, fieldType, mapping, type6, mapping3, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                    }
                } else {
                    cls5 = cls4;
                    type4 = fieldType;
                    cls6 = mapping;
                    typeResolveCollectionItemType = BeanUtils.resolveCollectionItemType(type4, cls5);
                    if (typeResolveCollectionItemType == null) {
                        cls7 = Object.class;
                        type5 = cls7;
                    } else {
                        mapping2 = TypeUtils.getMapping(typeResolveCollectionItemType);
                        if (mapping2 == String.class) {
                            cls8 = cls6;
                            if (type4 == null) {
                                type4 = type2;
                            }
                            if (cls8 == null) {
                                cls8 = cls5;
                            }
                            return new FieldReaderList(str, type4, cls8, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                        }
                        type5 = typeResolveCollectionItemType;
                        cls7 = mapping2;
                    }
                    cls9 = cls6;
                    if (type4 == null) {
                        type4 = type2;
                    }
                    if (cls9 == null) {
                        cls9 = cls5;
                    }
                    return new FieldReaderList(str, type4, cls9, type5, cls7, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                }
            }
            cls10 = cls4;
            type7 = fieldType;
            if (cls10 == Date.class) {
                return new FieldReaderDate(str, type2, cls10, i, j, str2, locale, obj2, jSONSchemaOf, null, method, null);
            }
            if (cls10 != StackTraceElement[].class && method.getDeclaringClass() == Throwable.class) {
                if (type7 == null) {
                    type7 = type2;
                }
                return new FieldReaderStackTrace(str, type7, cls10, i, j, str2, locale, obj2, jSONSchemaOf, method, null, new C2283(i2));
            }
            if ((j & FieldInfo.UNWRAPPED_MASK) != 0) {
                name = method.getName();
                if (name.startsWith("set")) {
                    declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.setterName(name, PropertyNamingStrategy.CamelCase.name()));
                    try {
                        declaredField.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                }
            }
            field = declaredField;
            if (Map.class.isAssignableFrom(cls10)) {
                if (type7 == null) {
                    type7 = type2;
                }
                return new FieldReaderMap(str, type7, cls10, i, j, str2, locale, obj2, jSONSchemaOf, method, field, null, str4, biConsumer);
            }
            if (type7 == null) {
                type7 = type2;
            }
            return new FieldReaderObject(str, type7, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, field, null);
        }
        type3 = type;
        cls3 = cls;
        fieldType = BeanUtils.getFieldType(TypeReference.get(type3), cls3, method, type2);
        mapping = TypeUtils.getMapping(fieldType);
        if (method.getParameterCount() == 0) {
            cls4 = cls2;
        } else {
            if (cls2 == AtomicInteger.class) {
                return new FieldReaderAtomicInteger(str, cls2, i, jSONSchemaOf, method, null);
            }
            if (cls2 == AtomicLong.class) {
                return new FieldReaderAtomicLong(str, cls2, i, jSONSchemaOf, method, null);
            }
            if (cls2 == AtomicIntegerArray.class) {
                return new FieldReaderAtomicIntegerArrayReadOnly(str, cls2, i, jSONSchemaOf, method, null);
            }
            if (cls2 == AtomicLongArray.class) {
                return new FieldReaderAtomicLongArrayReadOnly(str, cls2, i, jSONSchemaOf, method, null);
            }
            if (cls2 == AtomicBoolean.class) {
                return new FieldReaderAtomicBooleanReadOnly(str, cls2, i, str2, (AtomicBoolean) obj2, jSONSchemaOf, method, null);
            }
            if (cls2 == AtomicReference.class) {
                return new FieldReaderAtomicReference(str, type2, cls2, i, j, str2, jSONSchemaOf, method, null);
            }
            cls4 = cls2;
            if (Collection.class.isAssignableFrom(cls4)) {
                name3 = method.getName();
                if (name3.startsWith("get")) {
                    declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name3, PropertyNamingStrategy.CamelCase.name()));
                }
                if (fieldType != null) {
                    type8 = fieldType;
                } else {
                    type8 = type2;
                }
                return new FieldReaderCollectionReadOnly(str, type8, cls4, i, j, str2, jSONSchemaOf, method, declaredField);
            }
            if (Map.class.isAssignableFrom(cls4)) {
                name2 = method.getName();
                if (name2.startsWith("get")) {
                    declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.getterName(name2, PropertyNamingStrategy.CamelCase.name()));
                }
                return new FieldReaderMapReadOnly(str, type2, cls4, i, j, str2, jSONSchemaOf, method, declaredField, str4, biConsumer);
            }
            if (!cls3.isInterface()) {
                return null;
            }
        }
        int i3 = 0;
        if (!List.class.isAssignableFrom(cls4)) {
            if (fieldType instanceof ParameterizedType) {
                actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    type6 = actualTypeArguments[0];
                    mapping3 = TypeUtils.getMapping(type6);
                    if (mapping3 == String.class) {
                        return new FieldReaderList(str, fieldType, cls4, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                    }
                    return new FieldReaderList(str, fieldType, mapping, type6, mapping3, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                }
            } else {
                cls5 = cls4;
                type4 = fieldType;
                cls6 = mapping;
                typeResolveCollectionItemType = BeanUtils.resolveCollectionItemType(type4, cls5);
                if (typeResolveCollectionItemType == null) {
                    cls7 = Object.class;
                    type5 = cls7;
                } else {
                    mapping2 = TypeUtils.getMapping(typeResolveCollectionItemType);
                    if (mapping2 == String.class) {
                        cls8 = cls6;
                        if (type4 == null) {
                            type4 = type2;
                        }
                        if (cls8 == null) {
                            cls8 = cls5;
                        }
                        return new FieldReaderList(str, type4, cls8, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                    }
                    type5 = typeResolveCollectionItemType;
                    cls7 = mapping2;
                }
                cls9 = cls6;
                if (type4 == null) {
                    type4 = type2;
                }
                if (cls9 == null) {
                    cls9 = cls5;
                }
                return new FieldReaderList(str, type4, cls9, type5, cls7, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
            }
        } else if (fieldType instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                type6 = actualTypeArguments[0];
                mapping3 = TypeUtils.getMapping(type6);
                if (mapping3 == String.class) {
                    return new FieldReaderList(str, fieldType, cls4, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                }
                return new FieldReaderList(str, fieldType, mapping, type6, mapping3, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
            }
        } else {
            cls5 = cls4;
            type4 = fieldType;
            cls6 = mapping;
            typeResolveCollectionItemType = BeanUtils.resolveCollectionItemType(type4, cls5);
            if (typeResolveCollectionItemType == null) {
                cls7 = Object.class;
                type5 = cls7;
            } else {
                mapping2 = TypeUtils.getMapping(typeResolveCollectionItemType);
                if (mapping2 == String.class) {
                    cls8 = cls6;
                    if (type4 == null) {
                        type4 = type2;
                    }
                    if (cls8 == null) {
                        cls8 = cls5;
                    }
                    return new FieldReaderList(str, type4, cls8, String.class, String.class, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
                }
                type5 = typeResolveCollectionItemType;
                cls7 = mapping2;
            }
            cls9 = cls6;
            if (type4 == null) {
                type4 = type2;
            }
            if (cls9 == null) {
                cls9 = cls5;
            }
            return new FieldReaderList(str, type4, cls9, type5, cls7, i, j, str2, locale, obj2, jSONSchemaOf, method, null, null, null, null, null, null);
        }
        cls10 = cls4;
        type7 = fieldType;
        if (cls10 == Date.class) {
            return new FieldReaderDate(str, type2, cls10, i, j, str2, locale, obj2, jSONSchemaOf, null, method, null);
        }
        if (cls10 != StackTraceElement[].class) {
        }
        if ((j & FieldInfo.UNWRAPPED_MASK) != 0) {
            name = method.getName();
            if (name.startsWith("set")) {
                declaredField = BeanUtils.getDeclaredField(method.getDeclaringClass(), BeanUtils.setterName(name, PropertyNamingStrategy.CamelCase.name()));
                declaredField.setAccessible(true);
            }
        }
        field = declaredField;
        if (Map.class.isAssignableFrom(cls10)) {
            if (type7 == null) {
                type7 = type2;
            }
            return new FieldReaderMap(str, type7, cls10, i, j, str2, locale, obj2, jSONSchemaOf, method, field, null, str4, biConsumer);
        }
        if (type7 == null) {
            type7 = type2;
        }
        return new FieldReaderObject(str, type7, cls2, i, j, str2, locale, obj2, jSONSchemaOf, method, field, null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    public <T> FieldReader createFieldReaderParam(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, Type type2, Class cls2, String str3, Class cls3, Parameter parameter, JSONSchema jSONSchema, ObjectReader objectReader) {
        Class cls4;
        Type paramType;
        Class<?> mapping;
        Type type3;
        Class<?> cls5;
        Object objValueOf = obj;
        if ((objValueOf instanceof String) && cls2.isEnum()) {
            cls4 = cls2;
            objValueOf = Enum.valueOf(cls4, (String) objValueOf);
        } else {
            cls4 = cls2;
        }
        Object obj2 = objValueOf;
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls4, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        Class cls6 = Byte.TYPE;
        if (type2 == cls6) {
            return new FieldReaderInt8Value(str, i, j, str2, locale, (Byte) obj2, jSONSchema, null, null, null, str3, parameter);
        }
        if (type2 != cls6 && type2 != Byte.class) {
            Class cls7 = Short.TYPE;
            if (type2 == cls7) {
                return new FieldReaderInt16Value(str, i, j, str2, locale, (Short) obj2, jSONSchema, null, null, null, str3, parameter);
            }
            if (type2 != cls7 && type2 != Short.class) {
                Class cls8 = Integer.TYPE;
                if (type2 == cls8) {
                    return new FieldReaderInt32Value(str, i, j, str2, locale, (Integer) obj2, jSONSchema, null, null, null, str3, parameter);
                }
                if (type2 != cls8 && type2 != Integer.class) {
                    if (type2 == Long.TYPE) {
                        return new FieldReaderInt64Value(str, i, j, str2, locale, (Long) obj2, jSONSchema, null, null, null, str3, parameter);
                    }
                    if (type2 == Long.class) {
                        return new FieldReaderInt64(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
                    }
                    if ((type2 instanceof Class) || type == null) {
                        paramType = null;
                        mapping = null;
                    } else {
                        paramType = BeanUtils.getParamType(TypeReference.get(type), cls, cls3, parameter, type2);
                        mapping = paramType != null ? TypeUtils.getMapping(paramType) : null;
                    }
                    if (paramType == null) {
                        paramType = type2;
                    }
                    Class cls9 = mapping == null ? cls2 : mapping;
                    if (paramType instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) paramType).getActualTypeArguments();
                        if (actualTypeArguments.length == 1) {
                            Type type4 = actualTypeArguments[0];
                            cls5 = TypeUtils.getClass(null);
                            type3 = type4;
                        } else {
                            type3 = null;
                            cls5 = null;
                        }
                    } else {
                        type3 = null;
                        cls5 = null;
                    }
                    if (cls9 != null && Collection.class.isAssignableFrom(cls9) && type3 != null) {
                        return new FieldReaderList(str, paramType, cls9, type3, cls5, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter, null, null);
                    }
                    return new FieldReaderObject(str, paramType, cls9, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
                }
                return new FieldReaderInt32(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
            }
            return new FieldReaderInt16(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
        }
        return new FieldReaderInt8(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, null, null, str3, parameter);
    }

    public <T> Function<Map<Long, Object>, T> createFunction(Constructor constructor, Constructor constructor2, String... strArr) {
        if (constructor2 == null) {
            constructor.setAccessible(true);
        } else {
            constructor2.setAccessible(true);
        }
        return new ConstructorFunction(null, constructor, null, null, constructor2, strArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, 0L, null, supplier, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, String str, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), str, clsArr, strArr, null, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, null, j, null, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        return createObjectReader(cls, str, null, j, jSONSchema, supplier, function, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, String str, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, createSupplier(cls), str, clsArr, strArr, cls2, fieldReaderArr);
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new ObjectReaderAdapter(cls, str, null, j, jSONSchema, supplier, function, fieldReaderArr);
            }
        }
        if (str2 != null) {
            return new ObjectReaderRootName(cls, str, null, str2, j, jSONSchema, supplier, function, null, null, null, fieldReaderArr);
        }
        switch (fieldReaderArr.length) {
            case 1:
                return new ObjectReader1(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr[0]);
            case 2:
                return new ObjectReader2(cls, j, jSONSchema, supplier, function, fieldReaderArr[0], fieldReaderArr[1]);
            case 3:
                return new ObjectReader3(cls, supplier, j, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2]);
            case 4:
                return new ObjectReader4(cls, j, jSONSchema, supplier, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3]);
            case 5:
                return new ObjectReader5(cls, supplier, j, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3], fieldReaderArr[4]);
            case 6:
                return new ObjectReader6(cls, supplier, j, jSONSchema, function, fieldReaderArr[0], fieldReaderArr[1], fieldReaderArr[2], fieldReaderArr[3], fieldReaderArr[4], fieldReaderArr[5]);
            case 7:
                return new ObjectReader7(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            case 8:
                return new ObjectReader8(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            case 9:
                return new ObjectReader9(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            case 10:
                return new ObjectReader10(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            case 11:
                return new ObjectReader11(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            case Opcodes.FCONST_1 /* 12 */:
                return new ObjectReader12(cls, null, null, j, jSONSchema, supplier, function, fieldReaderArr);
            default:
                return new ObjectReaderAdapter(cls, str, null, j, jSONSchema, supplier, function, fieldReaderArr);
        }
    }

    public <T> ObjectReader<T> createObjectReaderNoneDefaultConstructor(Class cls, Function<Map<Long, Object>, T> function, FieldReader... fieldReaderArr) {
        return new ObjectReaderNoneDefaultConstructor(cls, null, null, 0L, function, null, null, fieldReaderArr, null, null, null);
    }

    public <T> ObjectReader<T> createObjectReaderSeeAlso(Class<T> cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        return new ObjectReaderSeeAlso(cls, supplier, str, clsArr, strArr, null, fieldReaderArr);
    }

    public <T> IntFunction<T> createIntFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) Integer.TYPE);
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Function<String, T> createStringFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) String.class);
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Supplier<T> createSupplier(Constructor<T> constructor) {
        return createSupplier(constructor, true);
    }

    public <I, T> Function<I, T> createValueFunction(Method method, Class cls) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) cls);
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            this.jitErrorCount.incrementAndGet();
            this.jitErrorLast = th;
            return null;
        }
    }

    public <T> Supplier<T> createSupplier(Constructor constructor, boolean z) {
        if (z & JIT) {
            Class<T> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            try {
                if (constructor.getParameterCount() == 0) {
                    MethodHandle methodHandleFindConstructor = lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID);
                    MethodType methodType = TypeUtils.METHOD_TYPE_SUPPLIER;
                    MethodType methodType2 = TypeUtils.METHOD_TYPE_OBJECT;
                    return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", methodType, methodType2, methodHandleFindConstructor, methodType2).getTarget().invokeExact();
                }
            } catch (Throwable th) {
                this.jitErrorCount.incrementAndGet();
                this.jitErrorLast = th;
            }
        }
        return new ConstructorSupplier(constructor);
    }

    public <T> ObjectReader<T> createObjectReader(Type type) {
        if (type instanceof Class) {
            return createObjectReader((Class) type);
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        return createObjectReader(mapping, createSupplier(mapping), createFieldReaders(mapping, type));
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls) {
        return createObjectReader(cls, cls, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0202  */
    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0214  */
    public void createFieldReader(Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, FieldInfo fieldInfo, Method method, Map<String, List<FieldReader>> map, ObjectReaderProvider objectReaderProvider) {
        String name;
        char cCharAt;
        int i;
        ObjectReaderCreator objectReaderCreator;
        FieldReader fieldReaderCreateFieldReaderMethod;
        Class cls2;
        ObjectReaderCreator objectReaderCreator2;
        FieldInfo fieldInfo2;
        String str2;
        Map<String, List<FieldReader>> map2;
        String[] strArr2;
        int length;
        int i2;
        String str3;
        ObjectReaderCreator objectReaderCreator3;
        Class cls3;
        int i3;
        String str4;
        Map<String, List<FieldReader>> map3;
        objectReaderProvider.getFieldInfo(fieldInfo, cls, method);
        if (fieldInfo.ignore) {
            return;
        }
        String str5 = fieldInfo.fieldName;
        if (str5 != null && !str5.isEmpty()) {
            name = fieldInfo.fieldName;
        } else {
            String name2 = method.getName();
            if (name2.startsWith("set")) {
                name = BeanUtils.setterName(name2, str);
            } else {
                name = BeanUtils.getterName(method, beanInfo.kotlin, str);
            }
            int length2 = name.length();
            char cCharAt2 = length2 > 0 ? name.charAt(0) : (char) 0;
            if ((length2 == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length2 > 2 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = name.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
                char[] charArray = name.toCharArray();
                if (length2 == 1) {
                    charArray[0] = (char) (charArray[0] - ' ');
                } else {
                    charArray[0] = (char) (charArray[0] + ' ');
                }
                Field declaredField = BeanUtils.getDeclaredField(cls, new String(charArray));
                if (declaredField != null) {
                    if (Modifier.isPublic(declaredField.getModifiers())) {
                        name = declaredField.getName();
                    } else if (length2 == 1) {
                        fieldInfo.alternateNames = new String[]{name};
                        name = declaredField.getName();
                    }
                }
            }
        }
        String str6 = name;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                if (i4 < strArr.length) {
                    if (str6.equals(strArr[i4])) {
                        fieldInfo.ordinal = i4;
                        break;
                    }
                    i4++;
                } else {
                    if (fieldInfo.ordinal != 0) {
                        break;
                    }
                    fieldInfo.ordinal = strArr.length;
                    break;
                }
            }
        }
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            putIfAbsent(map, str6, createFieldReaderMethod(cls, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, method.getGenericReturnType(), method.getReturnType(), method, fieldInfo.getInitReader(), fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler()), cls);
            return;
        }
        if (parameterCount == 2) {
            Class<?> cls4 = method.getParameterTypes()[1];
            Type type2 = method.getGenericParameterTypes()[1];
            method.setAccessible(true);
            FieldReaderAnySetter fieldReaderAnySetter = new FieldReaderAnySetter(type2, cls4, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, null, method);
            map.put(fieldReaderAnySetter.fieldName, listOf(fieldReaderAnySetter));
            return;
        }
        Type type3 = method.getGenericParameterTypes()[0];
        Class<?> cls5 = method.getParameterTypes()[0];
        if ((type3 instanceof Class) && Collection.class.isAssignableFrom((Class) type3)) {
            for (Class<?> cls6 : cls.getInterfaces()) {
                Method method2 = BeanUtils.getMethod(cls6, method);
                if (method2 != null) {
                    Type[] genericParameterTypes = method2.getGenericParameterTypes();
                    if (genericParameterTypes.length == 1) {
                        Type type4 = genericParameterTypes[0];
                        if (type4 instanceof ParameterizedType) {
                            type3 = type4;
                        }
                    }
                }
            }
        }
        Type type5 = type3;
        if (TypeUtils.isFunction(cls5)) {
            return;
        }
        ObjectReader initReader = getInitReader(objectReaderProvider, type5, cls5, fieldInfo);
        long j = fieldInfo.features;
        if ((FieldInfo.JIT & j) != 0) {
            str6 = str6;
            try {
                try {
                    try {
                        i = 0;
                        objectReaderCreator = this;
                        try {
                            fieldReaderCreateFieldReaderMethod = objectReaderCreator.createFieldReaderLambda(cls, type, str6, fieldInfo.ordinal, j, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type5, cls5, method, initReader);
                            str6 = str6;
                        } catch (Throwable th) {
                            th = th;
                            str6 = str6;
                            objectReaderCreator.jitErrorCount.incrementAndGet();
                            objectReaderCreator.jitErrorLast = th;
                            fieldReaderCreateFieldReaderMethod = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        str6 = str6;
                        objectReaderCreator = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    objectReaderCreator = this;
                    objectReaderCreator.jitErrorCount.incrementAndGet();
                    objectReaderCreator.jitErrorLast = th;
                    fieldReaderCreateFieldReaderMethod = null;
                    if (fieldReaderCreateFieldReaderMethod == null) {
                        objectReaderCreator2 = objectReaderCreator;
                        fieldInfo2 = fieldInfo;
                        cls2 = cls;
                        fieldReaderCreateFieldReaderMethod = objectReaderCreator2.createFieldReaderMethod(cls2, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type5, cls5, method, initReader, fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler());
                        type5 = type5;
                        cls5 = cls5;
                        initReader = initReader;
                    } else {
                        cls2 = cls;
                        objectReaderCreator2 = objectReaderCreator;
                        fieldInfo2 = fieldInfo;
                    }
                    str2 = str6;
                    map2 = map;
                    objectReaderCreator2.putIfAbsent(map2, str2, fieldReaderCreateFieldReaderMethod, cls2);
                    strArr2 = fieldInfo2.alternateNames;
                    if (strArr2 != null) {
                        length = strArr2.length;
                        i2 = i;
                        while (i2 < length) {
                            str3 = strArr2[i2];
                            if (str2.equals(str3)) {
                                objectReaderCreator3 = objectReaderCreator2;
                                cls3 = cls2;
                                str4 = str2;
                                map3 = map2;
                                i3 = length;
                            } else {
                                int i5 = fieldInfo2.ordinal;
                                int i6 = length;
                                long j2 = fieldInfo2.features;
                                String str7 = fieldInfo2.format;
                                Locale locale = fieldInfo2.locale;
                                String str8 = fieldInfo2.defaultValue;
                                String str9 = fieldInfo2.schema;
                                objectReaderCreator3 = objectReaderCreator2;
                                cls3 = cls2;
                                i3 = i6;
                                str4 = str2;
                                FieldReader fieldReaderCreateFieldReaderMethod2 = objectReaderCreator3.createFieldReaderMethod(cls3, type, str3, i5, j2, str7, locale, str8, str9, type5, cls5, method, initReader);
                                map3 = map;
                                objectReaderCreator3.putIfAbsent(map3, str3, fieldReaderCreateFieldReaderMethod2, cls3);
                            }
                            i2++;
                            cls2 = cls3;
                            map2 = map3;
                            str2 = str4;
                            length = i3;
                            objectReaderCreator2 = objectReaderCreator3;
                            fieldInfo2 = fieldInfo;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                i = 0;
            }
            if (fieldReaderCreateFieldReaderMethod == null) {
                objectReaderCreator2 = objectReaderCreator;
                fieldInfo2 = fieldInfo;
                cls2 = cls;
                fieldReaderCreateFieldReaderMethod = objectReaderCreator2.createFieldReaderMethod(cls2, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type5, cls5, method, initReader, fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler());
                type5 = type5;
                cls5 = cls5;
                initReader = initReader;
            } else {
                cls2 = cls;
                objectReaderCreator2 = objectReaderCreator;
                fieldInfo2 = fieldInfo;
            }
            str2 = str6;
            map2 = map;
            objectReaderCreator2.putIfAbsent(map2, str2, fieldReaderCreateFieldReaderMethod, cls2);
            strArr2 = fieldInfo2.alternateNames;
            if (strArr2 != null) {
                length = strArr2.length;
                i2 = i;
                while (i2 < length) {
                    str3 = strArr2[i2];
                    if (str2.equals(str3)) {
                        objectReaderCreator3 = objectReaderCreator2;
                        cls3 = cls2;
                        str4 = str2;
                        map3 = map2;
                        i3 = length;
                    } else {
                        int i7 = fieldInfo2.ordinal;
                        int i8 = length;
                        long j3 = fieldInfo2.features;
                        String str10 = fieldInfo2.format;
                        Locale locale2 = fieldInfo2.locale;
                        String str11 = fieldInfo2.defaultValue;
                        String str12 = fieldInfo2.schema;
                        objectReaderCreator3 = objectReaderCreator2;
                        cls3 = cls2;
                        i3 = i8;
                        str4 = str2;
                        FieldReader fieldReaderCreateFieldReaderMethod3 = objectReaderCreator3.createFieldReaderMethod(cls3, type, str3, i7, j3, str10, locale2, str11, str12, type5, cls5, method, initReader);
                        map3 = map;
                        objectReaderCreator3.putIfAbsent(map3, str3, fieldReaderCreateFieldReaderMethod3, cls3);
                    }
                    i2++;
                    cls2 = cls3;
                    map2 = map3;
                    str2 = str4;
                    length = i3;
                    objectReaderCreator2 = objectReaderCreator3;
                    fieldInfo2 = fieldInfo;
                }
            }
        }
        i = 0;
        objectReaderCreator = this;
        fieldReaderCreateFieldReaderMethod = null;
        if (fieldReaderCreateFieldReaderMethod == null) {
            objectReaderCreator2 = objectReaderCreator;
            fieldInfo2 = fieldInfo;
            cls2 = cls;
            fieldReaderCreateFieldReaderMethod = objectReaderCreator2.createFieldReaderMethod(cls2, type, str6, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.defaultValue, fieldInfo.schema, type5, cls5, method, initReader, fieldInfo.arrayToMapKey, fieldInfo.getInitArrayToMapDuplicateHandler());
            type5 = type5;
            cls5 = cls5;
            initReader = initReader;
        } else {
            cls2 = cls;
            objectReaderCreator2 = objectReaderCreator;
            fieldInfo2 = fieldInfo;
        }
        str2 = str6;
        map2 = map;
        objectReaderCreator2.putIfAbsent(map2, str2, fieldReaderCreateFieldReaderMethod, cls2);
        strArr2 = fieldInfo2.alternateNames;
        if (strArr2 != null) {
            length = strArr2.length;
            i2 = i;
            while (i2 < length) {
                str3 = strArr2[i2];
                if (str2.equals(str3)) {
                    objectReaderCreator3 = objectReaderCreator2;
                    cls3 = cls2;
                    str4 = str2;
                    map3 = map2;
                    i3 = length;
                } else {
                    int i9 = fieldInfo2.ordinal;
                    int i10 = length;
                    long j4 = fieldInfo2.features;
                    String str13 = fieldInfo2.format;
                    Locale locale3 = fieldInfo2.locale;
                    String str14 = fieldInfo2.defaultValue;
                    String str15 = fieldInfo2.schema;
                    objectReaderCreator3 = objectReaderCreator2;
                    cls3 = cls2;
                    i3 = i10;
                    str4 = str2;
                    FieldReader fieldReaderCreateFieldReaderMethod4 = objectReaderCreator3.createFieldReaderMethod(cls3, type, str3, i9, j4, str13, locale3, str14, str15, type5, cls5, method, initReader);
                    map3 = map;
                    objectReaderCreator3.putIfAbsent(map3, str3, fieldReaderCreateFieldReaderMethod4, cls3);
                }
                i2++;
                cls2 = cls3;
                map2 = map3;
                str2 = str4;
                length = i3;
                objectReaderCreator2 = objectReaderCreator3;
                fieldInfo2 = fieldInfo;
            }
        }
    }

    public <T> ObjectReader<T> createObjectReader(Class<T> cls, boolean z) {
        return createObjectReader(cls, cls, z, JSONFactory.getDefaultObjectReaderProvider());
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0236  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:224:0x037d  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> ObjectReader<T> createObjectReader(Class<T> cls, Type type, boolean z, ObjectReaderProvider objectReaderProvider) throws NoSuchMethodException {
        boolean z2;
        boolean z3;
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandlerNewInstance;
        String[] strArrLookupParameterNames;
        int i;
        ObjectReaderProvider objectReaderProvider2;
        Function functionCreateFunction;
        BiFunction biFunctionCreateBiFunction;
        JSONSchema jSONSchemaOf;
        Field field;
        Method method;
        BeanInfo beanInfo = new BeanInfo(objectReaderProvider);
        if (z) {
            beanInfo.readerFeatures |= JSONReader.Feature.FieldBased.mask;
        }
        Iterator<ObjectReaderModule> it = objectReaderProvider.modules.iterator();
        while (it.hasNext()) {
            ObjectReaderAnnotationProcessor annotationProcessor = it.next().getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getBeanInfo(beanInfo, cls);
            }
        }
        Class cls2 = beanInfo.deserializer;
        int i2 = 1;
        if (cls2 != null && ObjectReader.class.isAssignableFrom(cls2)) {
            try {
                Constructor<T> declaredConstructor = beanInfo.deserializer.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectReader) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create deserializer error", e);
            }
        }
        if (z) {
            beanInfo.readerFeatures |= JSONReader.Feature.FieldBased.mask;
        }
        if (Enum.class.isAssignableFrom(cls) && ((method = beanInfo.createMethod) == null || method.getParameterCount() == 1)) {
            return createEnumReader(cls, beanInfo.createMethod, objectReaderProvider);
        }
        if (Throwable.class.isAssignableFrom(cls)) {
            beanInfo.readerFeatures |= JSONReader.Feature.IgnoreSetNullValue.mask;
            z2 = false;
        } else {
            z2 = z;
        }
        if (cls == Class.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        boolean z4 = (z2 && cls.isInterface()) ? false : z2;
        FieldReader[] fieldReaderArrCreateFieldReaders = createFieldReaders(cls, type, beanInfo, z4, objectReaderProvider);
        boolean z5 = z4;
        ObjectReaderProvider objectReaderProvider3 = objectReaderProvider;
        int i3 = 0;
        while (true) {
            if (i3 >= fieldReaderArrCreateFieldReaders.length) {
                z3 = true;
                break;
            }
            if (!fieldReaderArrCreateFieldReaders[i3].isReadOnly()) {
                z3 = false;
                break;
            }
            i3++;
        }
        if (beanInfo.creatorConstructor == null && beanInfo.createMethod == null) {
            if (beanInfo.builder != null) {
                return createObjectReaderWithBuilder(cls, type, objectReaderProvider3, beanInfo);
            }
            boolean z6 = z3;
            ArrayList arrayList = new ArrayList();
            BeanUtils.constructor(cls, new C0459(arrayList, 1));
            if (Throwable.class.isAssignableFrom(cls)) {
                return new ObjectReaderException(cls, arrayList, fieldReaderArrCreateFieldReaders);
            }
            Class<?> declaringClass = cls.getDeclaringClass();
            int i4 = -1;
            Constructor constructor = null;
            Constructor constructor2 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    i5 = i4;
                    break;
                }
                Constructor constructor3 = (Constructor) arrayList.get(i5);
                if (constructor3.getParameterCount() == 0) {
                    constructor2 = constructor3;
                }
                if (declaringClass != null && constructor3.getParameterCount() == i2 && declaringClass.equals(constructor3.getParameterTypes()[0])) {
                    constructor = constructor3;
                    break;
                }
                if (constructor == null || constructor3.getParameterCount() == 0 || constructor.getParameterCount() < constructor3.getParameterCount()) {
                    i4 = i5;
                    constructor = constructor3;
                }
                i5++;
                i2 = 1;
            }
            if (i5 != -1) {
                arrayList.remove(i5);
            }
            if (constructor != null && constructor.getParameterCount() != 0 && beanInfo.seeAlso == null) {
                boolean zIsRecord = BeanUtils.isRecord(cls);
                constructor.setAccessible(true);
                String[] recordFieldNames = beanInfo.createParameterNames;
                if (zIsRecord && recordFieldNames == null) {
                    recordFieldNames = BeanUtils.getRecordFieldNames(cls);
                }
                if (recordFieldNames == null || recordFieldNames.length == 0) {
                    strArrLookupParameterNames = ASMUtils.lookupParameterNames(constructor);
                    Parameter[] parameters = constructor.getParameters();
                    FieldInfo fieldInfo = new FieldInfo();
                    int i6 = 0;
                    while (i6 < parameters.length && i6 < strArrLookupParameterNames.length) {
                        fieldInfo.init();
                        Constructor constructor4 = constructor;
                        objectReaderProvider3.getFieldInfo(fieldInfo, cls, constructor4, i6, parameters[i6]);
                        String str = fieldInfo.fieldName;
                        if (str != null) {
                            strArrLookupParameterNames[i6] = str;
                        }
                        i6++;
                        objectReaderProvider3 = objectReaderProvider;
                        constructor = constructor4;
                    }
                } else {
                    strArrLookupParameterNames = recordFieldNames;
                }
                Constructor constructor5 = constructor;
                if (constructor2 != null) {
                    i = 0;
                    for (String str2 : strArrLookupParameterNames) {
                        if (str2 != null) {
                            for (FieldReader fieldReader : fieldReaderArrCreateFieldReaders) {
                                if (fieldReader != null && str2.equals(fieldReader.fieldName)) {
                                    i++;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                if (!z5 && !Throwable.class.isAssignableFrom(cls) && constructor2 == null && i != strArrLookupParameterNames.length) {
                    if (constructor5.getParameterCount() == 1) {
                        FieldInfo fieldInfo2 = new FieldInfo();
                        objectReaderProvider2 = objectReaderProvider;
                        objectReaderProvider2.getFieldInfo(fieldInfo2, cls, constructor5, 0, constructor5.getParameters()[0]);
                        if (zIsRecord && (field = BeanUtils.getField(cls, fieldInfo2.fieldName)) != null) {
                            objectReaderProvider2.getFieldInfo(fieldInfo2, cls, field);
                        }
                        if ((fieldInfo2.features & FieldInfo.VALUE_MASK) != 0) {
                            Type type2 = constructor5.getGenericParameterTypes()[0];
                            Class<?> cls3 = constructor5.getParameterTypes()[0];
                            String str3 = fieldInfo2.schema;
                            if (str3 == null || str3.isEmpty()) {
                                jSONSchemaOf = null;
                            } else {
                                JSONObject object = JSON.parseObject(fieldInfo2.schema);
                                if (object.isEmpty()) {
                                    jSONSchemaOf = null;
                                } else {
                                    jSONSchemaOf = JSONSchema.of(object, cls3);
                                }
                            }
                            Object objApply = fieldInfo2.defaultValue;
                            if (objApply != null && objApply.getClass() != cls3) {
                                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
                                if (typeConvert != 0) {
                                    objApply = typeConvert.apply(objApply);
                                } else {
                                    throw new JSONException("illegal defaultValue : " + objApply + ", class " + cls3.getName());
                                }
                            }
                            return new ObjectReaderImplValue(cls, type2, cls3, fieldInfo2.features, fieldInfo2.format, objApply, jSONSchemaOf, constructor5, null, null);
                        }
                    } else {
                        objectReaderProvider2 = objectReaderProvider;
                    }
                    if (z6 && fieldReaderArrCreateFieldReaders.length != 0 && arrayList.isEmpty()) {
                        for (int i7 = 0; i7 < strArrLookupParameterNames.length; i7++) {
                            String str4 = strArrLookupParameterNames[i7];
                            for (FieldReader fieldReader2 : fieldReaderArrCreateFieldReaders) {
                                Field field2 = fieldReader2.field;
                                if (field2 != null && field2.getName().equals(str4) && !fieldReader2.fieldName.equals(str4)) {
                                    strArrLookupParameterNames[i7] = fieldReader2.fieldName;
                                    break;
                                }
                            }
                        }
                    }
                    if (!JIT) {
                        functionCreateFunction = null;
                        biFunctionCreateBiFunction = null;
                    } else if (constructor5.getParameterCount() == 1) {
                        functionCreateFunction = LambdaMiscCodec.createFunction(constructor5);
                        biFunctionCreateBiFunction = null;
                    } else if (constructor5.getParameterCount() == 2) {
                        biFunctionCreateBiFunction = LambdaMiscCodec.createBiFunction(constructor5);
                        functionCreateFunction = null;
                    } else {
                        functionCreateFunction = null;
                        biFunctionCreateBiFunction = null;
                    }
                    String[] strArr = strArrLookupParameterNames;
                    return createNoneDefaultConstructorObjectReader(cls, beanInfo, new ConstructorFunction(arrayList, constructor5, functionCreateFunction, biFunctionCreateBiFunction, null, strArr), arrayList, strArr, createFieldReaders(objectReaderProvider2, cls, type, constructor5, constructor5.getParameters(), strArr), fieldReaderArrCreateFieldReaders);
                }
            }
            Class[] clsArr = beanInfo.seeAlso;
            if (clsArr != null && clsArr.length != 0) {
                return createObjectReaderSeeAlso(cls, beanInfo.typeKey, clsArr, beanInfo.seeAlsoNames, beanInfo.seeAlsoDefault, fieldReaderArrCreateFieldReaders);
            }
            if (cls.isInterface()) {
                return new ObjectReaderInterface(cls, null, null, 0L, null, null, fieldReaderArrCreateFieldReaders);
            }
            ObjectReader<T> objectReaderCreateObjectReader = createObjectReader(cls, beanInfo.typeKey, beanInfo.rootName, beanInfo.readerFeatures, JSONSchema.of(JSON.parseObject(beanInfo.schema), cls), createSupplier(cls), null, fieldReaderArrCreateFieldReaders);
            if (objectReaderCreateObjectReader instanceof ObjectReaderBean) {
                Class<? extends JSONReader.AutoTypeBeforeHandler> cls4 = beanInfo.autoTypeBeforeHandler;
                if (cls4 != null) {
                    autoTypeBeforeHandler = null;
                    try {
                        Constructor<? extends JSONReader.AutoTypeBeforeHandler> declaredConstructor2 = cls4.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        autoTypeBeforeHandlerNewInstance = declaredConstructor2.newInstance(null);
                    } catch (Exception unused) {
                        autoTypeBeforeHandlerNewInstance = autoTypeBeforeHandler;
                    }
                    if (autoTypeBeforeHandlerNewInstance != null) {
                        ((ObjectReaderBean) objectReaderCreateObjectReader).setAutoTypeBeforeHandler(autoTypeBeforeHandlerNewInstance);
                    }
                } else {
                    autoTypeBeforeHandler = null;
                }
                autoTypeBeforeHandlerNewInstance = autoTypeBeforeHandler;
                if (autoTypeBeforeHandlerNewInstance != null) {
                    ((ObjectReaderBean) objectReaderCreateObjectReader).setAutoTypeBeforeHandler(autoTypeBeforeHandlerNewInstance);
                }
            }
            return objectReaderCreateObjectReader;
        }
        return createObjectReaderWithCreator(cls, type, objectReaderProvider3, beanInfo);
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls) {
        return createFieldReaders(cls, cls, null, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls, Type type) {
        return createFieldReaders(cls, type, null, false, JSONFactory.getDefaultObjectReaderProvider());
    }

    public <T> FieldReader[] createFieldReaders(Class<T> cls, Type type, BeanInfo beanInfo, boolean z, ObjectReaderProvider objectReaderProvider) {
        BeanInfo beanInfo2;
        LinkedHashMap linkedHashMap;
        ObjectReaderProvider objectReaderProvider2;
        LinkedHashMap linkedHashMap2;
        if (beanInfo == null) {
            BeanInfo beanInfo3 = new BeanInfo(objectReaderProvider);
            Iterator<ObjectReaderModule> it = objectReaderProvider.modules.iterator();
            while (it.hasNext()) {
                ObjectReaderAnnotationProcessor annotationProcessor = it.next().getAnnotationProcessor();
                if (annotationProcessor != null) {
                    annotationProcessor.getBeanInfo(beanInfo3, cls);
                }
            }
            beanInfo2 = beanInfo3;
        } else {
            beanInfo2 = beanInfo;
        }
        boolean zIsRecord = BeanUtils.isRecord(cls);
        String str = beanInfo2.namingStrategy;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        long j = beanInfo2.readerFeatures;
        String str2 = beanInfo2.format;
        FieldInfo fieldInfo = new FieldInfo();
        String[] strArr = beanInfo2.orders;
        if (z) {
            linkedHashMap2 = linkedHashMap3;
            BeanUtils.declaredFields(cls, new C2282(this, fieldInfo, j, str2, cls, type, str, strArr, linkedHashMap3, objectReaderProvider));
        } else {
            if (zIsRecord) {
                linkedHashMap = linkedHashMap3;
                objectReaderProvider2 = objectReaderProvider;
            } else {
                BeanInfo beanInfo4 = beanInfo2;
                objectReaderProvider2 = objectReaderProvider;
                linkedHashMap = linkedHashMap3;
                beanInfo2 = beanInfo4;
                BeanUtils.declaredFields(cls, new C2284(this, fieldInfo, j, str2, cls, type, str, strArr, linkedHashMap3, objectReaderProvider2, beanInfo4));
            }
            Class mixIn = objectReaderProvider2.getMixIn(cls);
            linkedHashMap2 = linkedHashMap;
            BeanUtils.setters(cls, beanInfo2, mixIn, new C2284(this, fieldInfo, j, str2, cls, type, str, strArr, beanInfo2, linkedHashMap2, objectReaderProvider));
            if (cls.isInterface()) {
                C2282 c2282 = new C2282(this, fieldInfo, j, cls, type, str, strArr, beanInfo2, linkedHashMap2, objectReaderProvider);
                linkedHashMap2 = linkedHashMap2;
                BeanUtils.getters(cls, c2282);
            }
        }
        Class<? super T> superclass = cls.getSuperclass();
        if (BeanUtils.isExtendedMap(cls)) {
            linkedHashMap2.put(BeanUtils.SUPER, listOf(ObjectReaders.fieldReader(BeanUtils.SUPER, cls.getGenericSuperclass(), superclass, new C2283(1))));
        }
        return toFieldReaderArray(linkedHashMap2);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, cls, str, 0, 0L, null, null, null, null, type, cls2, method, null);
    }

    public <T> FieldReader createFieldReader(Class<T> cls, String str, String str2, Type type, Class cls2, Method method) {
        return createFieldReaderMethod(cls, str, str2, type, cls2, method);
    }

    public <T> FieldReader<T> createFieldReader(String str, Type type, Field field) {
        return createFieldReader(str, null, type, field);
    }

    public <T> FieldReader<T> createFieldReader(String str, Field field) {
        return createFieldReader(str, null, field.getGenericType(), field);
    }

    public <T> FieldReader createFieldReader(String str, Method method) {
        Class<?> returnType;
        Type genericReturnType;
        Class<?> declaringClass = method.getDeclaringClass();
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            returnType = method.getReturnType();
            genericReturnType = method.getGenericReturnType();
        } else if (parameterCount == 1) {
            returnType = method.getParameterTypes()[0];
            genericReturnType = method.getGenericParameterTypes()[0];
        } else {
            throw new JSONException("illegal setter method " + method);
        }
        return createFieldReaderMethod(declaringClass, declaringClass, str, 0, 0L, null, null, null, null, genericReturnType, returnType, method, null);
    }

    public <T> FieldReader<T> createFieldReader(String str, String str2, Type type, Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        return createFieldReader(declaringClass, declaringClass, str, 0L, str2, type, field.getType(), field);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, long j, String str2, Type type2, Class cls2, Field field) {
        return createFieldReader(cls, type, str, 0, j, str2, null, null, null, type2, field.getType(), field, null, null, null);
    }

    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Field field, ObjectReader objectReader) {
        return createFieldReader(cls, type, str, 0, j, str2, locale, obj, str3, type2, field.getType(), field, objectReader, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldReader<T> createFieldReader(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Field field, ObjectReader objectReader, String str4, BiConsumer biConsumer) {
        JSONSchema jSONSchemaOf;
        Type fieldType;
        Class<?> mapping;
        Object objApply = obj;
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        if (objApply != null && objApply.getClass() != cls2) {
            Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), type2);
            if (typeConvert != 0) {
                objApply = typeConvert.apply(objApply);
            } else {
                throw new JSONException("illegal defaultValue : " + objApply + ", class " + cls2.getName());
            }
        }
        Object obj2 = objApply;
        Type typeResolveCollectionItemType = null;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaOf = null;
        } else {
            JSONObject object = JSON.parseObject(str3);
            if (object.isEmpty()) {
                jSONSchemaOf = null;
            } else {
                jSONSchemaOf = JSONSchema.of(object, cls2);
            }
        }
        if (field != null) {
            String name = cls.getName();
            if (!name.startsWith("java.lang") && !name.startsWith("java.time") && !field.getDeclaringClass().getName().startsWith("java.lang") && !field.getDeclaringClass().getName().startsWith("java.time")) {
                field.setAccessible(true);
            }
        }
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls2, i, j | FieldInfo.READ_USING_MASK, str2, locale, obj2, jSONSchemaOf, null, field, null);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        JSONSchema jSONSchema = jSONSchemaOf;
        if (cls2 == Integer.TYPE) {
            return new FieldReaderInt32Value(str, i, j, str2, locale, (Integer) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Integer.class) {
            return new FieldReaderInt32(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Long.TYPE) {
            return new FieldReaderInt64Value(str, i, j, str2, locale, (Long) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Long.class) {
            return new FieldReaderInt64(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Short.TYPE) {
            return new FieldReaderInt16Value(str, i, j, str2, locale, (Short) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Short.class) {
            return new FieldReaderInt16(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Boolean.TYPE) {
            return new FieldReaderBoolValue(str, i, j, str2, locale, (Boolean) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Boolean.class) {
            return new FieldReaderBool(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Byte.TYPE) {
            return new FieldReaderInt8Value(str, i, j, str2, locale, (Byte) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Byte.class) {
            return new FieldReaderInt8(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Float.TYPE) {
            return new FieldReaderFloatValue(str, i, j, str2, locale, (Float) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Float.class) {
            return new FieldReaderFloat(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Double.TYPE) {
            return new FieldReaderDoubleValue(str, i, j, str2, locale, (Double) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Double.class) {
            return new FieldReaderDouble(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == Character.TYPE) {
            return new FieldReaderCharValue(str, i, j, str2, locale, (Character) obj2, jSONSchema, null, field, null, null, null);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimal(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigInteger(str, type2, cls2, i, j, str2, locale, (BigInteger) obj2, jSONSchema, null, field, null);
        }
        if (cls2 == String.class) {
            return new FieldReaderString(str, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null);
        }
        if (type2 == String[].class) {
            return new FieldReaderStringArray(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null);
        }
        if (cls2 == Date.class) {
            return new FieldReaderDate(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, field, null, null);
        }
        if (cls2 == AtomicInteger.class) {
            return new FieldReaderAtomicInteger(str, cls2, i, jSONSchema, null, field);
        }
        if (cls2 == AtomicLong.class) {
            return new FieldReaderAtomicLong(str, cls2, i, jSONSchema, null, field);
        }
        if (cls2 == AtomicIntegerArray.class) {
            return new FieldReaderAtomicIntegerArrayReadOnly(str, cls2, i, jSONSchema, null, field);
        }
        if (cls2 == AtomicLongArray.class) {
            return new FieldReaderAtomicLongArrayReadOnly(str, cls2, i, jSONSchema, null, field);
        }
        if (cls2 == AtomicBoolean.class) {
            return new FieldReaderAtomicBooleanReadOnly(str, cls2, i, str2, (AtomicBoolean) obj2, jSONSchema, null, field);
        }
        if (cls2 == AtomicReference.class) {
            return new FieldReaderAtomicReference(str, type2, cls2, i, j, str2, jSONSchema, null, field);
        }
        if (type2 instanceof Class) {
            fieldType = null;
            mapping = null;
        } else {
            fieldType = BeanUtils.getFieldType(TypeReference.get(type), cls, field, type2);
            mapping = TypeUtils.getMapping(fieldType);
        }
        boolean zIsFinal = Modifier.isFinal(field.getModifiers());
        if (Collection.class.isAssignableFrom(cls2)) {
            if (fieldType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type3 = actualTypeArguments[0];
                    Type type4 = fieldType;
                    Class<?> mapping2 = TypeUtils.getMapping(type3);
                    if (mapping2 != String.class) {
                        return new FieldReaderList(str, type4, mapping, type3, mapping2, i, j, str2, locale, (Collection) obj2, jSONSchema, null, field, null, null, null, null, null);
                    }
                    if (!zIsFinal) {
                        return new FieldReaderList(str, type4, mapping, String.class, String.class, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null, null, null);
                    }
                    if ((j & JSONReader.Feature.FieldBased.mask) != 0) {
                        return new FieldReaderList(str, type4, mapping, String.class, String.class, i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null, null, null);
                    }
                    return new FieldReaderCollectionReadOnly(str, type4, mapping, i, j, str2, jSONSchema, null, field);
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                if (actualTypeArguments2.length > 0) {
                    typeResolveCollectionItemType = actualTypeArguments2[0];
                }
            } else {
                typeResolveCollectionItemType = BeanUtils.resolveCollectionItemType(fieldType, cls2);
            }
            if (typeResolveCollectionItemType == null) {
                typeResolveCollectionItemType = Object.class;
            }
            Type type5 = typeResolveCollectionItemType;
            return new FieldReaderList(str, type2, cls2, type5, TypeUtils.getClass(type5), i, j, str2, locale, obj2, jSONSchema, null, field, null, null, null, null, null);
        }
        Class<?> cls3 = mapping;
        if (Map.class.isAssignableFrom(cls2) && (fieldType instanceof ParameterizedType) && ((ParameterizedType) fieldType).getActualTypeArguments().length == 2 && zIsFinal && (j & JSONReader.Feature.FieldBased.mask) == 0) {
            return new FieldReaderMapReadOnly(str, fieldType, cls3, i, j, str2, jSONSchema, null, field, str4, biConsumer);
        }
        if (zIsFinal) {
            if (cls2 == int[].class) {
                return new FieldReaderInt32ValueArrayFinalField(str, cls2, i, j, str2, (int[]) obj2, jSONSchema, field);
            }
            if (cls2 == long[].class) {
                return new FieldReaderInt64ValueArrayFinalField(str, cls2, i, j, str2, (long[]) obj2, jSONSchema, field);
            }
        }
        if (cls3 != null) {
            long j2 = j & FieldInfo.UNWRAPPED_MASK;
            if (j2 != 0 && Map.class.isAssignableFrom(cls3)) {
                return new FieldReaderMapReadOnly(str, fieldType, cls2, i, j, str2, jSONSchema, null, field, str4, biConsumer);
            }
            Type type6 = fieldType;
            if (!Map.class.isAssignableFrom(cls3)) {
                return new FieldReaderObject(str, type6, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null);
            }
            if (j2 != 0) {
                return new FieldReaderMapReadOnly(str, type6, cls2, i, j, str2, jSONSchema, null, field, str4, biConsumer);
            }
            return new FieldReaderMap(str, type6, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null, str4, biConsumer);
        }
        if (cls2 == LocalDateTime.class) {
            return new FieldReaderLocalDateTime(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, field, null, null);
        }
        if (cls2 == ZonedDateTime.class) {
            return new FieldReaderZonedDateTime(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, field, null, null);
        }
        if (cls2 == Instant.class) {
            return new FieldReaderInstant(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, field, null, null);
        }
        return new FieldReaderObject(str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, null, field, null);
    }

    public <T, V> FieldReader createFieldReader(String str, Type type, Class<V> cls, long j, BiConsumer<T, V> biConsumer) {
        return createFieldReader(null, null, str, type, cls, 0, j, null, null, null, null, null, biConsumer, null);
    }

    public <T, V> FieldReader createFieldReader(String str, Type type, Class<V> cls, Method method, BiConsumer<T, V> biConsumer) {
        return createFieldReader(null, null, str, type, cls, 0, 0L, null, null, null, null, method, biConsumer, null);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    public <T, V> FieldReader createFieldReader(Class cls, Type type, String str, Type type2, Class<V> cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer<T, V> biConsumer, ObjectReader objectReader) {
        Method method2;
        Class mapping;
        Type type3;
        Type mapping2;
        if (objectReader != null) {
            FieldReaderObject fieldReaderObject = new FieldReaderObject(str, type2, cls2, i, j | FieldInfo.READ_USING_MASK, str2, locale, obj, jSONSchema, method, null, biConsumer);
            fieldReaderObject.initReader = objectReader;
            return fieldReaderObject;
        }
        if (cls2 == Integer.class) {
            return new FieldReaderInt32(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Long.class) {
            return new FieldReaderInt64(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == String.class) {
            return new FieldReaderString(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Boolean.class) {
            return new FieldReaderBool(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Short.class) {
            return new FieldReaderInt16(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Byte.class) {
            return new FieldReaderInt8(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldReaderBigDecimal(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer);
        }
        if (cls2 == BigInteger.class) {
            return new FieldReaderBigInteger(str, type2, cls2, i, j, str2, locale, (BigInteger) obj, jSONSchema, method, null, biConsumer);
        }
        if (cls2 == Float.class) {
            return new FieldReaderFloat(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Double.class) {
            return new FieldReaderDouble(str, cls2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null);
        }
        if (cls2 == Number.class) {
            return new FieldReaderNumber(str, cls2, i, j, str2, locale, (Number) obj, jSONSchema, method, null, biConsumer);
        }
        if (cls2 == Date.class) {
            return new FieldReaderDate(str, type2, cls2, i, j, str2, locale, obj, jSONSchema, null, method, biConsumer);
        }
        Type type4 = type2;
        Type fieldType = null;
        if (type4 instanceof Class) {
            method2 = method;
            mapping = null;
        } else {
            method2 = method;
            fieldType = BeanUtils.getFieldType(type != null ? TypeReference.get(type) : null, cls, method2, type4);
            mapping = TypeUtils.getMapping(fieldType);
        }
        if (cls2 != List.class && cls2 != ArrayList.class) {
            if (fieldType != null) {
                type4 = fieldType;
            }
            return new FieldReaderObject(str, type4, cls2, i, j, str2, locale, obj, jSONSchema, method2, null, biConsumer, null);
        }
        if (fieldType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) fieldType).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type5 = actualTypeArguments[0];
                mapping2 = TypeUtils.getMapping(type5);
                if (mapping2 == String.class) {
                    return new FieldReaderList(str, fieldType, mapping, String.class, String.class, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null, null, null);
                }
                type3 = type5;
            } else {
                type3 = Object.class;
                mapping2 = type3;
            }
        } else {
            type3 = Object.class;
            mapping2 = type3;
        }
        boolean z = fieldType == 0;
        if (z) {
            fieldType = type4;
        }
        if (z) {
            mapping = cls2;
        }
        return new FieldReaderList(str, fieldType, mapping, type3, mapping2, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer, null, null, null, null);
    }
}
