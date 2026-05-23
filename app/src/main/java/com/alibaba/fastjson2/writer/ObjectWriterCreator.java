package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.function.FieldSupplier;
import com.alibaba.fastjson2.function.FieldSupplierFunction;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p000.C2263;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterCreator {
    public static final ObjectWriterCreator INSTANCE = new ObjectWriterCreator();
    static final Map<Class, LambdaInfo> lambdaMapping;
    protected final AtomicInteger jitErrorCount = new AtomicInteger();
    protected volatile Throwable jitErrorLast;

    /* JADX INFO: compiled from: obf */
    public static class LambdaInfo {
        final Class fieldClass;
        final MethodType invokedType;
        final String methodName;
        final MethodType methodType;
        final MethodType samMethodType;
        final Class supplierClass;

        public LambdaInfo(Class cls, Class cls2, String str) {
            this.fieldClass = cls;
            this.supplierClass = cls2;
            this.methodName = str;
            this.methodType = MethodType.methodType(cls);
            this.invokedType = MethodType.methodType(cls2);
            this.samMethodType = MethodType.methodType((Class<?>) cls, (Class<?>) Object.class);
        }
    }

    static {
        HashMap map = new HashMap();
        lambdaMapping = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new LambdaInfo(cls, Predicate.class, "test"));
        Class cls2 = Character.TYPE;
        map.put(cls2, new LambdaInfo(cls2, ToCharFunction.class, "applyAsChar"));
        Class cls3 = Byte.TYPE;
        map.put(cls3, new LambdaInfo(cls3, ToByteFunction.class, "applyAsByte"));
        Class cls4 = Short.TYPE;
        map.put(cls4, new LambdaInfo(cls4, ToShortFunction.class, "applyAsShort"));
        Class cls5 = Integer.TYPE;
        map.put(cls5, new LambdaInfo(cls5, ToIntFunction.class, "applyAsInt"));
        Class cls6 = Long.TYPE;
        map.put(cls6, new LambdaInfo(cls6, ToLongFunction.class, "applyAsLong"));
        Class cls7 = Float.TYPE;
        map.put(cls7, new LambdaInfo(cls7, ToFloatFunction.class, "applyAsFloat"));
        Class cls8 = Double.TYPE;
        map.put(cls8, new LambdaInfo(cls8, ToDoubleFunction.class, "applyAsDouble"));
    }

    public static void configSerializeFilters(BeanInfo beanInfo, ObjectWriterAdapter objectWriterAdapter) {
        for (Class<? extends Filter> cls : beanInfo.serializeFilters) {
            if (Filter.class.isAssignableFrom(cls)) {
                try {
                    objectWriterAdapter.setFilter(cls.newInstance());
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r3.getModifiers()) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFieldName(Class cls, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, boolean z, FieldInfo fieldInfo, Method method) {
        char cCharAt;
        Field field;
        String str = fieldInfo.fieldName;
        if (str != null && !str.isEmpty()) {
            return fieldInfo.fieldName;
        }
        if (z) {
            return method.getName();
        }
        String str2 = BeanUtils.getterName(method, beanInfo.kotlin, beanInfo.namingStrategy);
        if ((objectWriterProvider.userDefineMask & 64) != 0 && (field = BeanUtils.getField(cls, method)) != null) {
            return field.getName();
        }
        int length = str2.length();
        char cCharAt2 = length > 0 ? str2.charAt(0) : (char) 0;
        if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 1 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = str2.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
            char[] charArray = str2.toCharArray();
            if (cCharAt2 >= 'a') {
                charArray[0] = (char) (charArray[0] - ' ');
            } else {
                charArray[0] = (char) (charArray[0] + ' ');
            }
            Field declaredField = BeanUtils.getDeclaredField(cls, new String(charArray));
            if (declaredField != null) {
                for (int i = 2; i < charArray.length; i++) {
                    char c = charArray[i];
                    if (c < 'a' || c > 'z') {
                    }
                }
                return declaredField.getName();
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$0(FieldInfo fieldInfo, Class cls, long j, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createObjectWriter$1(FieldInfo fieldInfo, Class cls, long j, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, Map map, Field field) {
        fieldInfo.init();
        boolean z = (field.getModifiers() & 1) == 0;
        fieldInfo.isPrivate = z;
        fieldInfo.ignore = z;
        FieldWriter fieldWriterCreateFieldWriter = createFieldWriter(cls, j, objectWriterProvider, beanInfo, fieldInfo, field);
        if (fieldWriterCreateFieldWriter != null) {
            if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = true;
            }
            FieldWriter fieldWriter = (FieldWriter) map.putIfAbsent(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
            if (fieldWriter == null || fieldWriter.compareTo(fieldWriterCreateFieldWriter) <= 0) {
                return;
            }
            map.put(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    public /* synthetic */ void lambda$createObjectWriter$2(FieldInfo fieldInfo, long j, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, boolean z, Map map, Method method) {
        ObjectWriter objectWriter;
        ?? r1;
        boolean z2;
        FieldWriter fieldWriter;
        FieldWriter fieldWriterCreateFieldWriter;
        ?? r14;
        ?? r2;
        Method method2;
        FieldWriter fieldWriter2;
        char cCharAt;
        Object obj;
        FieldWriter fieldWriter3;
        ?? r3;
        boolean z3;
        String[] strArr;
        fieldInfo.init();
        fieldInfo.features = j;
        fieldInfo.format = beanInfo.format;
        objectWriterProvider.getFieldInfo(beanInfo, fieldInfo, cls, method);
        if (fieldInfo.ignore) {
            return;
        }
        ?? fieldName = getFieldName(cls, objectWriterProvider, beanInfo, z, fieldInfo, method);
        ?? r0 = beanInfo.includes;
        if (r0 != 0 && r0.length > 0) {
            for (?? r4 : r0) {
                if (!r4.equals(fieldName)) {
                }
            }
            return;
        }
        if ((beanInfo.writerFeatures & JSONWriter.Feature.WriteClassName.mask) == 0 || !fieldName.equals(beanInfo.typeKey)) {
            if (beanInfo.orders != null) {
                int i = 0;
                boolean z4 = false;
                while (true) {
                    strArr = beanInfo.orders;
                    if (i >= strArr.length) {
                        break;
                    }
                    if (fieldName.equals(strArr[i])) {
                        fieldInfo.ordinal = i;
                        z4 = true;
                    }
                    i++;
                }
                if (!z4 && fieldInfo.ordinal == 0) {
                    fieldInfo.ordinal = strArr.length;
                }
            }
            if (TypeUtils.isFunction(method.getReturnType())) {
                return;
            }
            Class<?> cls2 = fieldInfo.writeUsing;
            if (cls2 != null) {
                try {
                    Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objectWriter = (ObjectWriter) declaredConstructor.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    throw new JSONException("create writeUsing Writer error", e);
                }
            } else {
                objectWriter = null;
            }
            if (objectWriter == null && fieldInfo.fieldClassMixIn) {
                objectWriter = ObjectWriterBaseModule.VoidObjectWriter.INSTANCE;
            }
            ObjectWriter objectWriter2 = objectWriter;
            if ((beanInfo.readerFeatures & 18014398509481984L) != 0) {
                try {
                    r3 = this;
                    z3 = true;
                    fieldWriter = null;
                    try {
                        fieldWriterCreateFieldWriter = r3.createFieldWriterLambda(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.label, method, objectWriter2, fieldInfo.contentAs);
                        r2 = r3;
                        r14 = true;
                    } catch (Throwable th) {
                        th = th;
                        r3.jitErrorCount.incrementAndGet();
                        r3.jitErrorLast = th;
                        r1 = r3;
                        z2 = true;
                        fieldWriterCreateFieldWriter = fieldWriter;
                        r2 = r1;
                        r14 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r3 = this;
                    z3 = true;
                    fieldWriter = null;
                }
                if (fieldWriterCreateFieldWriter == null) {
                    method2 = method;
                    fieldWriterCreateFieldWriter = r2.createFieldWriter(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.label, method2, objectWriter2, fieldInfo.contentAs);
                } else {
                    method2 = method;
                }
                if (fieldInfo.writeUsing != null && (fieldWriterCreateFieldWriter instanceof FieldWriterObject)) {
                    ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = r14;
                }
                fieldWriter2 = (FieldWriter) map.putIfAbsent(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
                if (fieldWriter2 != null && fieldWriter2.compareTo(fieldWriterCreateFieldWriter) > 0) {
                    map.put(fieldName, fieldWriterCreateFieldWriter);
                }
                if (fieldWriter2 == null) {
                    cCharAt = fieldName.charAt(0);
                    if (cCharAt < 'A' && true) {
                        obj = ((char) (cCharAt + ' ')) + fieldName.substring(r14);
                    } else if (cCharAt >= 'a' || false) {
                        obj = fieldWriter;
                    } else {
                        obj = ((char) (cCharAt - ' ')) + fieldName.substring(r14);
                    }
                    if (obj != null || (fieldWriter3 = (FieldWriter) map.get(obj)) == null) {
                    }
                    Method method3 = fieldWriter3.method;
                    if (method3 == null || method3.equals(method2)) {
                        map.remove(obj);
                        return;
                    }
                    return;
                }
            }
            r1 = this;
            z2 = true;
            fieldWriter = null;
            fieldWriterCreateFieldWriter = fieldWriter;
            r2 = r1;
            r14 = true;
            if (true) {
                method2 = method;
                fieldWriterCreateFieldWriter = r2.createFieldWriter(objectWriterProvider, cls, fieldName, fieldInfo.ordinal, fieldInfo.features, fieldInfo.format, fieldInfo.locale, fieldInfo.label, method2, objectWriter2, fieldInfo.contentAs);
            } else {
                method2 = method;
            }
            if (fieldInfo.writeUsing != null) {
                ((FieldWriterObject) fieldWriterCreateFieldWriter).writeUsing = r14;
            }
            fieldWriter2 = (FieldWriter) map.putIfAbsent(fieldWriterCreateFieldWriter.fieldName, fieldWriterCreateFieldWriter);
            if (fieldWriter2 != null) {
                map.put(fieldName, fieldWriterCreateFieldWriter);
            }
            if (fieldWriter2 == null) {
                cCharAt = fieldName.charAt(0);
                if (cCharAt < 'A') {
                    if (false) {
                        obj = fieldWriter;
                    } else {
                        obj = fieldWriter;
                    }
                } else if (cCharAt >= 'a') {
                    obj = fieldWriter;
                } else {
                    obj = fieldWriter;
                }
                if (false) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.fastjson2.writer.ObjectWriter] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.alibaba.fastjson2.writer.ObjectWriterCreator] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.alibaba.fastjson2.writer.ObjectWriterImplMap] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.alibaba.fastjson2.writer.ObjectWriterBaseModule$VoidObjectWriter] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public FieldWriter createFieldWriter(Class cls, long j, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, FieldInfo fieldInfo, Field field) {
        String name;
        ?? Of;
        String str;
        Class<?> cls2;
        ObjectWriter objectWriter;
        String[] strArr;
        fieldInfo.features = (~JSONWriter.Feature.BeanToArray.mask) & j;
        objectWriterProvider.getFieldInfo(beanInfo, fieldInfo, cls, field);
        ObjectWriter objectWriter2 = null;
        if (fieldInfo.ignore || TypeUtils.isFunction(field.getType())) {
            return null;
        }
        String str2 = fieldInfo.fieldName;
        if (str2 == null || str2.isEmpty()) {
            name = field.getName();
            String str3 = beanInfo.namingStrategy;
            if (str3 != null) {
                name = BeanUtils.fieldName(name, str3);
            }
        } else {
            name = fieldInfo.fieldName;
        }
        if (beanInfo.orders != null) {
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = beanInfo.orders;
                if (i >= strArr.length) {
                    break;
                }
                if (name.equals(strArr[i])) {
                    fieldInfo.ordinal = i;
                    z = true;
                }
                i++;
            }
            if (!z && fieldInfo.ordinal == 0) {
                fieldInfo.ordinal = strArr.length;
            }
        }
        if (fieldInfo.ordinal == 0 && name.equals(beanInfo.typeKey)) {
            fieldInfo.ordinal = -1;
        }
        String[] strArr2 = beanInfo.includes;
        if (strArr2 != null && strArr2.length > 0) {
            for (String str4 : strArr2) {
                if (!str4.equals(name)) {
                }
            }
            return null;
        }
        Class<?> cls3 = fieldInfo.writeUsing;
        if (cls3 != null) {
            try {
                Constructor<?> declaredConstructor = cls3.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Of = (ObjectWriter) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create writeUsing Writer error", e);
            }
        } else {
            Of = 0;
        }
        try {
            field.setAccessible(true);
        } catch (Throwable unused) {
        }
        if (Of == 0 && fieldInfo.fieldClassMixIn) {
            Of = ObjectWriterBaseModule.VoidObjectWriter.INSTANCE;
        }
        if (Of == 0) {
            Class<?> type = field.getType();
            if (type == Date.class) {
                ObjectWriter objectWriter3 = objectWriterProvider.cache.get(Date.class);
                if (objectWriter3 != ObjectWriterImplDate.INSTANCE) {
                    Of = objectWriter3;
                }
            } else if (Map.class.isAssignableFrom(type) && ((cls2 = fieldInfo.keyUsing) != null || fieldInfo.valueUsing != null)) {
                if (cls2 != null) {
                    try {
                        Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        objectWriter = (ObjectWriter) declaredConstructor2.newInstance(null);
                    } catch (Exception unused2) {
                        objectWriter = null;
                    }
                } else {
                    objectWriter = null;
                }
                Class<?> cls4 = fieldInfo.valueUsing;
                if (cls4 != null) {
                    try {
                        Constructor<?> declaredConstructor3 = cls4.getDeclaredConstructor(null);
                        declaredConstructor3.setAccessible(true);
                        objectWriter2 = (ObjectWriter) declaredConstructor3.newInstance(null);
                    } catch (Exception unused3) {
                    }
                }
                if (objectWriter != null || objectWriter2 != null) {
                    Of = ObjectWriterImplMap.of(field.getType(), type);
                    Of.keyWriter = objectWriter;
                    Of.valueWriter = objectWriter2;
                }
            }
        }
        ?? r11 = Of;
        String str5 = fieldInfo.format;
        return createFieldWriter(objectWriterProvider, name, fieldInfo.ordinal, fieldInfo.features, (str5 != null || (str = beanInfo.format) == null) ? str5 : str, fieldInfo.locale, fieldInfo.label, field, r11, fieldInfo.contentAs);
    }

    public <T> FieldWriter<T> createFieldWriterLambda(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, String str3, Method method, ObjectWriter objectWriter, Class<?> cls2) {
        return createFieldWriterLambda(objectWriterProvider, cls, str, i, j, str2, null, str3, method, objectWriter, cls2);
    }

    public ObjectWriter createObjectWriter(List<FieldWriter> list) {
        return new ObjectWriterAdapter(null, null, null, 0L, list);
    }

    public ObjectWriter getInitWriter(ObjectWriterProvider objectWriterProvider, Class cls) {
        ObjectWriter objectWriter;
        ObjectWriter objectWriter2;
        ObjectWriter objectWriter3;
        ObjectWriter objectWriter4;
        if (cls == Date.class) {
            if ((objectWriterProvider.userDefineMask & 16) == 0 || (objectWriter4 = objectWriterProvider.cache.get(Date.class)) == ObjectWriterImplDate.INSTANCE) {
                return null;
            }
            return objectWriter4;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            if ((objectWriterProvider.userDefineMask & 2) == 0 || (objectWriter = objectWriterProvider.cache.get(Integer.class)) == ObjectWriterImplInt32.INSTANCE) {
                return null;
            }
            return objectWriter;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            if ((objectWriterProvider.userDefineMask & 4) == 0 || (objectWriter2 = objectWriterProvider.cache.get(Long.class)) == ObjectWriterImplInt64.INSTANCE) {
                return null;
            }
            return objectWriter2;
        }
        if (cls == BigDecimal.class) {
            if ((objectWriterProvider.userDefineMask & 8) == 0 || (objectWriter3 = objectWriterProvider.cache.get(BigDecimal.class)) == ObjectWriterImplBigDecimal.INSTANCE) {
                return null;
            }
            return objectWriter3;
        }
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        ObjectWriter objectWriter5 = objectWriterProvider.cache.get(cls);
        if (objectWriter5 instanceof ObjectWriterImplEnum) {
            return null;
        }
        return objectWriter5;
    }

    public void handleIgnores(BeanInfo beanInfo, List<FieldWriter> list) {
        String[] strArr = beanInfo.ignores;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FieldWriter fieldWriter = list.get(size);
            for (String str : beanInfo.ignores) {
                if (str.equals(fieldWriter.fieldName)) {
                    list.remove(size);
                    break;
                }
            }
        }
    }

    public Object lambdaGetter(Class cls, Class cls2, Method method) {
        MethodType methodType;
        MethodType methodType2;
        MethodType methodType3;
        String str;
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
        LambdaInfo lambdaInfo = lambdaMapping.get(cls2);
        if (lambdaInfo != null) {
            methodType = lambdaInfo.methodType;
            methodType2 = lambdaInfo.invokedType;
            str = lambdaInfo.methodName;
            methodType3 = lambdaInfo.samMethodType;
        } else {
            methodType = MethodType.methodType(cls2);
            methodType2 = TypeUtils.METHOD_TYPE_FUNCTION;
            methodType3 = TypeUtils.METHOD_TYPE_OBJECT_OBJECT;
            str = "apply";
        }
        String str2 = str;
        MethodType methodType4 = methodType3;
        try {
            MethodHandle methodHandleFindVirtual = lookupTrustedLookup.findVirtual(cls, method.getName(), methodType);
            return (Object) LambdaMetafactory.metafactory(lookupTrustedLookup, str2, methodType2, methodType4, methodHandleFindVirtual, methodHandleFindVirtual.type()).getTarget().invoke();
        } catch (Throwable th) {
            throw new JSONException("create fieldLambdaGetter error, method : " + method, th);
        }
    }

    public void setDefaultValue(List<FieldWriter> list, Class cls) {
        Object objNewInstance;
        Constructor defaultConstructor = BeanUtils.getDefaultConstructor(cls, true);
        if (defaultConstructor == null) {
            return;
        }
        int parameterCount = defaultConstructor.getParameterCount();
        try {
            defaultConstructor.setAccessible(true);
            if (parameterCount == 0) {
                objNewInstance = defaultConstructor.newInstance(null);
            } else if (parameterCount != 1) {
                return;
            } else {
                objNewInstance = defaultConstructor.newInstance(Boolean.TRUE);
            }
            Iterator<FieldWriter> it = list.iterator();
            while (it.hasNext()) {
                it.next().setDefaultValue(objNewInstance);
            }
        } catch (Exception unused) {
        }
    }

    public <T> FieldWriter<T> createFieldWriterLambda(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, ObjectWriter objectWriter, Class<?> cls2) {
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (((objectWriter != null || objectWriterProvider == null) ? objectWriter : getInitWriter(objectWriterProvider, returnType)) != null) {
            return null;
        }
        String name = cls.getName();
        if (name.indexOf(36) != -1 && name.contains("$$")) {
            return null;
        }
        Object objLambdaGetter = lambdaGetter(cls, returnType, method);
        Field field = BeanUtils.getField(cls, method);
        if (returnType == Integer.TYPE) {
            return new FieldWriterInt32Value(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Long.TYPE) {
            return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new FieldWriterInt64Value(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter) : new FieldWriterMillis(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Boolean.TYPE) {
            return new FieldWriterBoolValue(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Boolean.class) {
            return new FieldWriterBool(str, i, j, str2, locale, str3, Boolean.class, Boolean.class, field, method, objLambdaGetter);
        }
        if (returnType == Short.TYPE) {
            return new FieldWriterInt16Value(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Byte.TYPE) {
            return new FieldWriterInt8Value(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Float.TYPE) {
            return new FieldWriterFloatValue(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Float.class) {
            return new FieldWriterFloat(str, i, j, str2, locale, str3, Float.class, Float.class, field, method, objLambdaGetter);
        }
        if (returnType == Double.TYPE) {
            return new FieldWriterDoubleValue(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        if (returnType == Double.class) {
            return new FieldWriterDouble(str, i, j, str2, locale, str3, Double.class, Double.class, field, method, objLambdaGetter);
        }
        if (returnType == Character.TYPE) {
            return new FieldWriterCharValue(str, i, j, str2, locale, str3, returnType, returnType, field, method, objLambdaGetter);
        }
        return returnType == Character.class ? new FieldWriterChar(str, i, j, str2, locale, str3, Character.class, Character.class, field, method, objLambdaGetter) : createFieldWriter(objectWriterProvider, cls, str, i, j, str2, locale, str3, genericReturnType, returnType, field, method, (Function) objLambdaGetter, cls2);
    }

    public ObjectWriter createObjectWriter(FieldWriter... fieldWriterArr) {
        return createObjectWriter(Arrays.asList(fieldWriterArr));
    }

    public <T> ObjectWriter<T> createObjectWriter(String[] strArr, Type[] typeArr, FieldSupplier<T> fieldSupplier) {
        FieldWriter[] fieldWriterArr = new FieldWriter[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            Type type = typeArr[i];
            fieldWriterArr[i] = createFieldWriter(str, type, TypeUtils.getClass(type), new FieldSupplierFunction(fieldSupplier, i));
        }
        return createObjectWriter(fieldWriterArr);
    }

    public ObjectWriter createObjectWriter(Class cls) {
        return createObjectWriter(cls, 0L, JSONFactory.getDefaultObjectWriterProvider());
    }

    public ObjectWriter createObjectWriter(Class cls, FieldWriter... fieldWriterArr) {
        return createObjectWriter(cls, 0L, fieldWriterArr);
    }

    public ObjectWriter createObjectWriter(Class cls, long j, FieldWriter... fieldWriterArr) {
        if (fieldWriterArr.length == 0) {
            return createObjectWriter(cls, j, JSONFactory.getDefaultObjectWriterProvider());
        }
        if (cls != null) {
            String name = cls.getName();
            if ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(name)) {
                return new ObjectWriterAdapter(cls, null, null, j, Arrays.asList(fieldWriterArr));
            }
        }
        switch (fieldWriterArr.length) {
            case 1:
                if ((fieldWriterArr[0].features & 281474976710656L) == 0) {
                    return new ObjectWriter1(cls, null, null, j, Arrays.asList(fieldWriterArr));
                }
                return new ObjectWriterAdapter(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 2:
                return new ObjectWriter2(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 3:
                return new ObjectWriter3(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 4:
                return new ObjectWriter4(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 5:
                return new ObjectWriter5(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 6:
                return new ObjectWriter6(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 7:
                return new ObjectWriter7(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 8:
                return new ObjectWriter8(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 9:
                return new ObjectWriter9(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 10:
                return new ObjectWriter10(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 11:
                return new ObjectWriter11(cls, null, null, j, Arrays.asList(fieldWriterArr));
            case 12 /* 12 */:
                return new ObjectWriter12(cls, null, null, j, Arrays.asList(fieldWriterArr));
            default:
                return new ObjectWriterAdapter(cls, null, null, j, Arrays.asList(fieldWriterArr));
        }
    }

    public ObjectWriter createObjectWriter(Class cls, long j, List<ObjectWriterModule> list) {
        ObjectWriterProvider provider = null;
        for (ObjectWriterModule objectWriterModule : list) {
            if (provider == null) {
                provider = objectWriterModule.getProvider();
            }
        }
        return createObjectWriter(cls, j, provider);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0203  */
    /* JADX WARN: Code duplicated, block: B:85:0x0215  */
    public ObjectWriter createObjectWriter(Class cls, long j, final ObjectWriterProvider objectWriterProvider) {
        final Class cls2;
        final ObjectWriterCreator objectWriterCreator;
        ArrayList arrayList;
        Class cls3;
        ObjectWriterCreator objectWriterCreator2;
        Class cls4;
        BeanInfo beanInfo;
        ArrayList arrayList2;
        long j2;
        String name;
        ObjectWriterAdapter objectWriterAdapter;
        ArrayList arrayList3;
        String str;
        ObjectWriterAdapter objectWriterAdapter2;
        ObjectWriterAdapter objectWriter1;
        final BeanInfo beanInfoCreateBeanInfo = objectWriterProvider.createBeanInfo();
        beanInfoCreateBeanInfo.readerFeatures |= 18014398509481984L;
        objectWriterProvider.getBeanInfo(beanInfoCreateBeanInfo, cls);
        Class cls5 = beanInfoCreateBeanInfo.serializer;
        if (cls5 != null && ObjectWriter.class.isAssignableFrom(cls5)) {
            try {
                Constructor declaredConstructor = cls5.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectWriter) declaredConstructor.newInstance(null);
            } catch (Exception e) {
                throw new JSONException("create serializer error", e);
            }
        }
        boolean zIsRecord = BeanUtils.isRecord(cls);
        long j3 = beanInfoCreateBeanInfo.writerFeatures;
        if (beanInfoCreateBeanInfo.seeAlso != null) {
            j3 &= ~JSONWriter.Feature.WriteClassName.mask;
        }
        final long j4 = j | j3;
        boolean z = (JSONWriter.Feature.FieldBased.mask & j4) != 0;
        boolean z2 = (z && (zIsRecord || cls.isInterface())) ? false : z;
        final FieldInfo fieldInfo = new FieldInfo();
        if (z2) {
            final TreeMap treeMap = new TreeMap();
            final int i = 0;
            cls2 = cls;
            objectWriterCreator = this;
            BeanUtils.declaredFields(cls2, new Consumer(objectWriterCreator) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᤝᲈᲇ

                /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                public final /* synthetic */ ObjectWriterCreator f7334;

                {
                    this.f7334 = objectWriterCreator;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (0) {
                        case 0:
                            this.f7334.lambda$createObjectWriter$0(fieldInfo, cls2, j4, objectWriterProvider, beanInfoCreateBeanInfo, (TreeMap) treeMap, (Field) obj);
                            break;
                        default:
                            this.f7334.lambda$createObjectWriter$1(fieldInfo, cls2, j4, objectWriterProvider, beanInfoCreateBeanInfo, (LinkedHashMap) treeMap, (Field) obj);
                            break;
                    }
                }
            });
            arrayList = new ArrayList(treeMap.values());
        } else {
            cls2 = cls;
            objectWriterCreator = this;
            arrayList = new ArrayList();
            Iterator<ObjectWriterModule> it = objectWriterProvider.modules.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().createFieldWriters(objectWriterCreator, cls2, arrayList)) {
                    }
                } else {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (zIsRecord) {
                        cls3 = cls2;
                    } else {
                        final int i2 = 1;
                        Consumer consumer = new Consumer(objectWriterCreator) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᤝᲈᲇ

                            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
                            public final /* synthetic */ ObjectWriterCreator f7334;

                            {
                                this.f7334 = objectWriterCreator;
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                switch (1) {
                                    case 0:
                                        this.f7334.lambda$createObjectWriter$0(fieldInfo, cls2, j4, objectWriterProvider, beanInfoCreateBeanInfo, (TreeMap) linkedHashMap, (Field) obj);
                                        break;
                                    default:
                                        this.f7334.lambda$createObjectWriter$1(fieldInfo, cls2, j4, objectWriterProvider, beanInfoCreateBeanInfo, (LinkedHashMap) linkedHashMap, (Field) obj);
                                        break;
                                }
                            }
                        };
                        cls3 = cls2;
                        BeanUtils.declaredFields(cls3, consumer);
                    }
                    Class mixIn = objectWriterProvider.getMixIn(cls3);
                    boolean z3 = beanInfoCreateBeanInfo.kotlin;
                    Class cls6 = cls3;
                    C2263 c2263 = new C2263(this, fieldInfo, j4, beanInfoCreateBeanInfo, objectWriterProvider, cls6, zIsRecord, linkedHashMap, 0);
                    objectWriterCreator2 = this;
                    cls4 = cls6;
                    beanInfo = beanInfoCreateBeanInfo;
                    BeanUtils.getters(cls4, mixIn, z3, c2263);
                    arrayList2 = new ArrayList(linkedHashMap.values());
                    break;
                }
            }
            j2 = j | beanInfo.writerFeatures;
            if (false && Throwable.class.isAssignableFrom(cls4)) {
                return new ObjectWriterException(cls4, j2, arrayList2);
            }
            objectWriterCreator2.handleIgnores(beanInfo, arrayList2);
            if (beanInfo.alphabetic) {
                Collections.sort(arrayList2);
            }
            if (BeanUtils.isExtendedMap(cls4)) {
                arrayList2.add(ObjectWriters.fieldWriter("$super$", cls4.getGenericSuperclass(), cls4.getSuperclass(), Function.identity()));
            }
            objectWriterCreator2.setDefaultValue(arrayList2, cls4);
            name = cls4.getName();
            if ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name) && true && beanInfo.rootName == null) {
                switch (arrayList2.size()) {
                    case 1:
                        if ((arrayList2.get(0).features & 281474976710656L) != 0) {
                            objectWriterAdapter = null;
                        } else {
                            objectWriter1 = new ObjectWriter1(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                            objectWriterAdapter = objectWriter1;
                        }
                        break;
                    case 2:
                        objectWriter1 = new ObjectWriter2(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 3:
                        objectWriter1 = new ObjectWriter3(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 4:
                        objectWriter1 = new ObjectWriter4(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 5:
                        objectWriter1 = new ObjectWriter5(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 6:
                        objectWriter1 = new ObjectWriter6(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 7:
                        objectWriter1 = new ObjectWriter7(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 8:
                        objectWriter1 = new ObjectWriter8(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 9:
                        objectWriter1 = new ObjectWriter9(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 10:
                        objectWriter1 = new ObjectWriter10(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 11:
                        objectWriter1 = new ObjectWriter11(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    case 12 /* 12 */:
                        objectWriter1 = new ObjectWriter12(cls4, beanInfo.typeKey, beanInfo.typeName, j2, arrayList2);
                        objectWriterAdapter = objectWriter1;
                        break;
                    default:
                        objectWriterAdapter = null;
                        break;
                }
            } else {
                objectWriterAdapter = null;
            }
            if (objectWriterAdapter == null) {
                arrayList3 = arrayList2;
                str = beanInfo.rootName;
                if (str != null) {
                    objectWriterAdapter2 = new ObjectWriterRootName(cls, beanInfo.typeKey, beanInfo.typeName, str, j2, arrayList3);
                } else {
                    objectWriterAdapter2 = new ObjectWriterAdapter(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList3);
                }
                objectWriterAdapter = objectWriterAdapter2;
            }
            if (beanInfo.serializeFilters != null) {
                configSerializeFilters(beanInfo, objectWriterAdapter);
            }
            return objectWriterAdapter;
        }
        arrayList2 = arrayList;
        objectWriterCreator2 = objectWriterCreator;
        cls4 = cls2;
        beanInfo = beanInfoCreateBeanInfo;
        j2 = j | beanInfo.writerFeatures;
        if (true) {
        }
        objectWriterCreator2.handleIgnores(beanInfo, arrayList2);
        if (beanInfo.alphabetic) {
            Collections.sort(arrayList2);
        }
        if (BeanUtils.isExtendedMap(cls4)) {
            arrayList2.add(ObjectWriters.fieldWriter("$super$", cls4.getGenericSuperclass(), cls4.getSuperclass(), Function.identity()));
        }
        objectWriterCreator2.setDefaultValue(arrayList2, cls4);
        name = cls4.getName();
        if ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name)) {
            objectWriterAdapter = null;
        } else {
            objectWriterAdapter = null;
        }
        if (true) {
            arrayList3 = arrayList2;
            str = beanInfo.rootName;
            if (str != null) {
                objectWriterAdapter2 = new ObjectWriterRootName(cls, beanInfo.typeKey, beanInfo.typeName, str, j2, arrayList3);
            } else {
                objectWriterAdapter2 = new ObjectWriterAdapter(cls, beanInfo.typeKey, beanInfo.typeName, j2, arrayList3);
            }
            objectWriterAdapter = objectWriterAdapter2;
        }
        if (beanInfo.serializeFilters != null) {
            configSerializeFilters(beanInfo, objectWriterAdapter);
        }
        return objectWriterAdapter;
    }

    public <T> FieldWriter<T> createFieldWriter(String str, String str2, Field field) {
        return createFieldWriter(JSONFactory.getDefaultObjectWriterProvider(), str, 0, 0L, str2, null, field, null);
    }

    public <T> FieldWriter<T> createFieldWriter(String str, int i, long j, String str2, Field field) {
        return createFieldWriter(JSONFactory.getDefaultObjectWriterProvider(), str, i, j, str2, null, field, null);
    }

    public <T> FieldWriter<T> createFieldWriter(String str, int i, long j, String str2, String str3, Field field, ObjectWriter objectWriter) {
        return createFieldWriter(JSONFactory.getDefaultObjectWriterProvider(), str, i, j, str2, str3, field, objectWriter);
    }

    public final <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, String str, int i, long j, String str2, String str3, Field field, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, str, i, j, str2, (Locale) null, str3, field, objectWriter);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, String str, int i, long j, String str2, Locale locale, String str3, Field field, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, str, i, j, str2, locale, str3, field, objectWriter, (Class<?>) null);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, String str, int i, long j, String str2, Locale locale, String str3, Field field, ObjectWriter objectWriter, Class<?> cls) {
        ObjectWriter objectWriter2;
        Method method = (field.getDeclaringClass() == Throwable.class && "stackTrace".equals(field.getName())) ? BeanUtils.getMethod(Throwable.class, "getStackTrace") : null;
        if (method != null) {
            return createFieldWriter(objectWriterProvider, Throwable.class, str, i, j, str2, str3, method, objectWriter);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (objectWriter != null) {
            FieldWriterObject fieldWriterObject = new FieldWriterObject(str, i, j, str2, null, str3, genericType, type, field, null, null);
            fieldWriterObject.initValueClass = type;
            if (objectWriter != ObjectWriterBaseModule.VoidObjectWriter.INSTANCE) {
                fieldWriterObject.initObjectWriter = objectWriter;
            }
            return fieldWriterObject;
        }
        if (type == Boolean.TYPE) {
            return new FieldWriterBoolValue(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Byte.TYPE) {
            return new FieldWriterInt8Value(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Short.TYPE) {
            return new FieldWriterInt16Value(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Integer.TYPE) {
            return new FieldWriterInt32Value(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Long.TYPE) {
            if (str2 != null && !str2.isEmpty() && !"string".equals(str2)) {
                return new FieldWriterMillis(str, i, j, str2, locale, str3, type, type, field, null, null);
            }
            return new FieldWriterInt64Value(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Float.TYPE) {
            return new FieldWriterFloatValue(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Float.class) {
            return new FieldWriterFloat(str, i, j, str2, locale, str3, Float.class, Float.class, field, null, null);
        }
        if (type == Double.TYPE) {
            return new FieldWriterDoubleValue(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Double.class) {
            return new FieldWriterDouble(str, i, j, str2, locale, str3, Double.class, Double.class, field, null, null);
        }
        if (type == Character.TYPE) {
            return new FieldWriterCharValue(str, i, j, str2, locale, str3, type, type, field, null, null);
        }
        if (type == Character.class) {
            return new FieldWriterChar(str, i, j, str2, locale, str3, Character.class, Character.class, field, null, null);
        }
        if (type == BigInteger.class) {
            return new FieldWriterBigInt(str, i, j, str2, locale, str3, field, null, null);
        }
        if (type == BigDecimal.class) {
            return new FieldWriterBigDecimal(str, i, j, str2, locale, str3, field, null, null);
        }
        if (type == Date.class) {
            return new FieldWriterDate(str, i, j, str2, locale, str3, Date.class, Date.class, field, null, null);
        }
        if (type == LocalDate.class) {
            return new FieldWriterLocalDate(str, i, j, str2, locale, str3, genericType, LocalDate.class, field, null, null);
        }
        if (type == OffsetDateTime.class) {
            return new FieldWriterOffsetDateTime(str, i, j, str2, locale, str3, genericType, OffsetDateTime.class, field, null, null);
        }
        if (type == String.class) {
            return new FieldWriterString(str, i, j, str2, locale, str3, field, null, null);
        }
        if (type.isEnum()) {
            BeanInfo beanInfoCreateBeanInfo = objectWriterProvider.createBeanInfo();
            objectWriterProvider.getBeanInfo(beanInfoCreateBeanInfo, type);
            boolean z = beanInfoCreateBeanInfo.writeEnumAsJavaBean;
            if (!z && (objectWriter2 = objectWriterProvider.cache.get(type)) != null && !(objectWriter2 instanceof ObjectWriterImplEnum)) {
                z = true;
            }
            if (BeanUtils.getEnumValueField(type, objectWriterProvider) == null && !z && BeanUtils.getEnumAnnotationNames(type) == null) {
                return new FieldWriterEnum(str, i, j, str2, locale, str3, type, type, field, null, null);
            }
        }
        if (type != List.class && type != ArrayList.class && type != Iterable.class) {
            if (Map.class.isAssignableFrom(type)) {
                return new FieldWriterMap(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null, null, cls);
            }
            if (type.isArray() && !type.getComponentType().isPrimitive()) {
                Class<?> componentType = type.getComponentType();
                return new FieldWriterObjectArray(str, componentType, i, j, str2, str3, componentType, type, field, null, null);
            }
            return new FieldWriterObject(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null, null);
        }
        return new FieldWriterList(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i, j, str2, locale, str3, genericType, type, field, null, null, cls);
    }

    public <T> FieldWriter<T> createFieldWriter(Class<T> cls, String str, String str2, Method method) {
        return createFieldWriter(cls, str, 0, 0L, str2, method);
    }

    public <T> FieldWriter<T> createFieldWriter(Class<T> cls, String str, int i, long j, String str2, Method method) {
        return createFieldWriter((ObjectWriterProvider) null, cls, str, i, j, str2, (String) null, method, (ObjectWriter) null);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, String str3, Method method, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, cls, str, i, j, str2, (Locale) null, str3, method, objectWriter);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, ObjectWriter objectWriter) {
        return createFieldWriter(objectWriterProvider, cls, str, i, j, str2, locale, str3, method, objectWriter, (Class<?>) null);
    }

    public <T> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, ObjectWriter objectWriter, Class<?> cls2) {
        Type type;
        String str4;
        method.setAccessible(true);
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        ObjectWriter initWriter = (objectWriter == null && objectWriterProvider != null && (str2 == null || str2.isEmpty() || returnType != Date.class)) ? getInitWriter(objectWriterProvider, returnType) : objectWriter;
        if (initWriter != null) {
            FieldWriterObject fieldWriterObject = new FieldWriterObject(str, i, j, str2, locale, str3, genericReturnType, returnType, null, method, null);
            fieldWriterObject.initValueClass = returnType;
            if (initWriter != ObjectWriterBaseModule.VoidObjectWriter.INSTANCE) {
                fieldWriterObject.initObjectWriter = initWriter;
            }
            return fieldWriterObject;
        }
        String str5 = str == null ? BeanUtils.getterName(method, false, null) : str;
        Field field = (j & 4611686018427387904L) != 0 ? null : BeanUtils.getField(cls, method);
        if (returnType == Boolean.TYPE) {
            return new FieldWriterBoolValue(str5, i, j, str2, locale, str3, returnType, returnType, field, method, null);
        }
        String str6 = str5;
        if (returnType == Boolean.class) {
            return new FieldWriterBool(str6, i, j, str2, locale, str3, Boolean.class, Boolean.class, field, method, null);
        }
        if (returnType == Integer.TYPE) {
            return new FieldWriterInt32Value(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
        }
        if (returnType == Integer.class) {
            return new FieldWriterInt32(str6, i, j, str2, locale, str3, Integer.class, Integer.class, field, method, null);
        }
        if (returnType == Float.TYPE) {
            return new FieldWriterFloatValue(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
        }
        if (returnType == Float.class) {
            return new FieldWriterFloat(str6, i, j, str2, locale, str3, Float.class, Float.class, field, method, null);
        }
        if (returnType == Double.TYPE) {
            return new FieldWriterDoubleValue(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
        }
        if (returnType == Double.class) {
            return new FieldWriterDouble(str6, i, j, str2, locale, str3, Double.class, Double.class, field, method, null);
        }
        Class<?> cls3 = Long.TYPE;
        if (returnType != cls3 && returnType != Long.class) {
            if (returnType == Short.TYPE) {
                return new FieldWriterInt16Value(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
            }
            if (returnType == Short.class) {
                return new FieldWriterInt16(str6, i, j, str2, locale, str3, Short.class, Short.class, field, method, null);
            }
            if (returnType == Byte.TYPE) {
                return new FieldWriterInt8Value(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
            }
            if (returnType == Byte.class) {
                return new FieldWriterInt8(str6, i, j, str2, locale, str3, Byte.class, Byte.class, field, method, null);
            }
            if (returnType == Character.TYPE) {
                return new FieldWriterCharValue(str6, i, j, str2, locale, str3, returnType, returnType, field, null, null);
            }
            if (returnType == Character.class) {
                return new FieldWriterChar(str6, i, j, str2, locale, str3, Character.class, Character.class, field, null, null);
            }
            if (returnType == BigDecimal.class) {
                return new FieldWriterBigDecimal(str6, i, j, str2, locale, str3, field, method, null);
            }
            if (!returnType.isEnum() || BeanUtils.getEnumValueField(returnType, objectWriterProvider) != null || BeanUtils.isWriteEnumAsJavaBean(returnType) || BeanUtils.getEnumAnnotationNames(returnType) != null) {
                if (returnType == Date.class) {
                    if (str2 != null) {
                        String strTrim = str2.trim();
                        str4 = strTrim.isEmpty() ? null : strTrim;
                    } else {
                        str4 = str2;
                    }
                    return new FieldWriterDate(str6, i, j, str4, locale, str3, Date.class, Date.class, field, method, null);
                }
                if (returnType == LocalDate.class) {
                    return new FieldWriterLocalDate(str6, i, j, str2, locale, str3, genericReturnType, LocalDate.class, field, method, null);
                }
                if (returnType == OffsetDateTime.class) {
                    return new FieldWriterOffsetDateTime(str6, i, j, str2, locale, str3, genericReturnType, OffsetDateTime.class, field, method, null);
                }
                if (Calendar.class.isAssignableFrom(returnType)) {
                    return new FieldWriterCalendar(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
                }
                if (returnType == String.class) {
                    return new FieldWriterString(str6, i, j, str2, locale, str3, field, method, null);
                }
                if (returnType != List.class && returnType != ArrayList.class && returnType != Iterable.class) {
                    if (Map.class.isAssignableFrom(returnType)) {
                        return new FieldWriterMap(str6, i, j, str2, locale, str3, genericReturnType, returnType, field, method, null, cls2);
                    }
                    if (returnType != Float[].class && returnType != Double[].class && returnType != BigDecimal[].class) {
                        return new FieldWriterObject(str6, i, j, str2, locale, str3, genericReturnType, returnType, field, method, null);
                    }
                    return new FieldWriterObjectArray(str6, returnType.getComponentType(), i, j, str2, str3, genericReturnType, returnType, field, method, null);
                }
                if (genericReturnType instanceof ParameterizedType) {
                    type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                } else {
                    type = Object.class;
                }
                return new FieldWriterList(str6, type, i, j, str2, locale, str3, genericReturnType, returnType, field, method, null, cls2);
            }
            return new FieldWriterEnum(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
        }
        if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
            if (returnType != cls3) {
                if (true) {
                    return new FieldWriterInt64(str6, i, j, str2, locale, str3, Long.class, Long.class, field, method, null);
                }
            } else {
                return new FieldWriterInt64Value(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
            }
        }
        return new FieldWriterMillis(str6, i, j, str2, locale, str3, returnType, returnType, field, method, null);
    }

    public <T> FieldWriter createFieldWriter(String str, ToLongFunction<T> toLongFunction) {
        Class cls = Long.TYPE;
        return new FieldWriterInt64Value(str, 0, 0L, null, null, null, cls, cls, null, null, toLongFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToIntFunction<T> toIntFunction) {
        Class cls = Integer.TYPE;
        return new FieldWriterInt32Value(str, 0, 0L, null, null, null, cls, cls, null, null, toIntFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, Field field, Method method, ToIntFunction<T> toIntFunction) {
        Class cls = Integer.TYPE;
        return new FieldWriterInt32Value(str, 0, 0L, null, null, null, cls, cls, field, method, toIntFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToShortFunction<T> toShortFunction) {
        Class cls = Short.TYPE;
        return new FieldWriterInt16Value(str, 0, 0L, null, null, null, cls, cls, null, null, toShortFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToByteFunction<T> toByteFunction) {
        Class cls = Byte.TYPE;
        return new FieldWriterInt8Value(str, 0, 0L, null, null, null, cls, cls, null, null, toByteFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToFloatFunction<T> toFloatFunction) {
        Class cls = Double.TYPE;
        return new FieldWriterFloatValue(str, 0, 0L, null, null, null, cls, cls, null, null, toFloatFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToDoubleFunction<T> toDoubleFunction) {
        Class cls = Double.TYPE;
        return new FieldWriterDoubleValue(str, 0, 0L, null, null, null, cls, cls, null, null, toDoubleFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, ToCharFunction<T> toCharFunction) {
        Class cls = Character.TYPE;
        return new FieldWriterCharValue(str, 0, 0L, null, null, null, cls, cls, null, null, toCharFunction);
    }

    public <T> FieldWriter createFieldWriter(String str, Predicate<T> predicate) {
        Class cls = Boolean.TYPE;
        return new FieldWriterBoolValue(str, 0, 0L, null, null, null, cls, cls, null, null, predicate);
    }

    public <T, V> FieldWriter createFieldWriter(String str, Class cls, Function<T, V> function) {
        return createFieldWriter((ObjectWriterProvider) null, (Class) null, str, 0, 0L, (String) null, (String) null, cls, cls, (Method) null, function);
    }

    public <T, V> FieldWriter createFieldWriter(String str, Class cls, Field field, Method method, Function<T, V> function) {
        return createFieldWriter(null, null, str, 0, 0L, null, null, cls, cls, field, method, function);
    }

    public <T, V> FieldWriter createFieldWriter(String str, Type type, Class cls, Function<T, V> function) {
        return createFieldWriter((ObjectWriterProvider) null, (Class) null, str, 0, 0L, (String) null, (String) null, type, cls, (Method) null, function);
    }

    public <T, V> FieldWriter createFieldWriter(String str, long j, String str2, Class cls, Function<T, V> function) {
        return createFieldWriter((ObjectWriterProvider) null, (Class) null, str, 0, j, str2, (String) null, cls, cls, (Method) null, function);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, String str3, Type type, Class<V> cls2, Method method, Function<T, V> function) {
        return createFieldWriter(objectWriterProvider, cls, str, i, j, str2, null, str3, type, cls2, null, method, function);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, String str3, Type type, Class<V> cls2, Field field, Method method, Function<T, V> function) {
        return createFieldWriter(objectWriterProvider, cls, str, i, j, str2, null, str3, type, cls2, field, method, function);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, Locale locale, String str3, Type type, Class<V> cls2, Field field, Method method, Function<T, V> function) {
        return createFieldWriter(objectWriterProvider, cls, str, i, j, str2, locale, str3, type, cls2, field, method, function, null);
    }

    public <T, V> FieldWriter<T> createFieldWriter(ObjectWriterProvider objectWriterProvider, Class<T> cls, String str, int i, long j, String str2, Locale locale, String str3, Type type, Class<V> cls2, Field field, Method method, Function<T, V> function, Class<?> cls3) {
        ObjectWriter objectWriter;
        if (cls2 == Byte.class) {
            return new FieldWriterInt8(str, i, j, str2, locale, str3, type, Byte.class, field, method, function);
        }
        if (cls2 == Short.class) {
            return new FieldWriterInt16(str, i, j, str2, locale, str3, type, Short.class, field, method, function);
        }
        if (cls2 == Integer.class) {
            return new FieldWriterInt32(str, i, j, str2, locale, str3, type, Integer.class, field, method, function);
        }
        if (cls2 == Long.class) {
            return new FieldWriterInt64(str, i, j, str2, locale, str3, type, Long.class, field, method, function);
        }
        if (cls2 == BigInteger.class) {
            return new FieldWriterBigInt(str, i, j, str2, locale, str3, field, method, function);
        }
        if (cls2 == BigDecimal.class) {
            return new FieldWriterBigDecimal(str, i, j, str2, locale, str3, field, method, function);
        }
        if (cls2 == String.class) {
            return new FieldWriterString(str, i, j, str2, locale, str3, field, method, function);
        }
        if (cls2 == Date.class) {
            return new FieldWriterDate(str, i, j, str2, locale, str3, Date.class, Date.class, field, method, function);
        }
        if (cls2 == LocalDate.class) {
            return new FieldWriterLocalDate(str, i, j, str2, locale, str3, type, LocalDate.class, field, method, function);
        }
        if (cls2 == OffsetDateTime.class) {
            return new FieldWriterOffsetDateTime(str, i, j, str2, locale, str3, type, OffsetDateTime.class, field, method, function);
        }
        if (cls2 == UUID.class) {
            return new FieldWriterUUID(str, i, j, str2, locale, str3, field, method, function);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return new FieldWriterCalendar(str, i, j, str2, locale, str3, cls2, cls2, field, method, function);
        }
        if (cls2.isEnum()) {
            ObjectWriterProvider defaultObjectWriterProvider = objectWriterProvider == null ? JSONFactory.getDefaultObjectWriterProvider() : objectWriterProvider;
            BeanInfo beanInfoCreateBeanInfo = defaultObjectWriterProvider.createBeanInfo();
            defaultObjectWriterProvider.getBeanInfo(beanInfoCreateBeanInfo, cls2);
            boolean z = beanInfoCreateBeanInfo.writeEnumAsJavaBean;
            if (!z && (objectWriter = defaultObjectWriterProvider.cache.get(cls2)) != null && !(objectWriter instanceof ObjectWriterImplEnum)) {
                z = true;
            }
            if (!z && BeanUtils.getEnumValueField(cls2, defaultObjectWriterProvider) == null && BeanUtils.getEnumAnnotationNames(cls2) == null) {
                return new FieldWriterEnum(str, i, j, str2, locale, str3, cls2, cls2, field, method, function);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class || rawType == Iterable.class) && actualTypeArguments.length == 1) {
                return new FieldWriterList(str, actualTypeArguments[0], i, j, str2, locale, str3, type, cls2, field, method, function, cls3);
            }
            if ((rawType instanceof Class) && Map.class.isAssignableFrom((Class) rawType)) {
                return new FieldWriterMap(str, i, j, str2, locale, str3, type, cls2, field, method, function, cls3);
            }
        }
        if (Modifier.isFinal(cls2.getModifiers())) {
            return new FieldWriterObjectFinal(str, i, j, str2, locale, str3, type, cls2, field, method, function);
        }
        return new FieldWriterObject(str, i, j, str2, locale, str3, type, cls2, field, method, function);
    }
}
