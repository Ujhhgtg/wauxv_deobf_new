package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactoryLambda;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p000.C1310;
import p000.C1313;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyAccessorFactoryLambda extends PropertyAccessorFactory {
    private static final boolean USE_UNSAFE;

    static {
        USE_UNSAFE = JDKUtils.UNSAFE != null;
    }

    public static Class<?> box(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        return cls == Double.TYPE ? Double.class : cls;
    }

    public static boolean isChainableSetter(Method method) {
        return method.getReturnType() == method.getDeclaringClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte lambda$getByte$0(Method method, Object obj) {
        return (byte) getInt(method).applyAsInt(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ char lambda$getChar$2(Method method, Object obj) {
        return (char) getInt(method).applyAsInt(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getFloat$6(ToDoubleFunction toDoubleFunction, Object obj) {
        return (float) toDoubleFunction.applyAsDouble(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ short lambda$getShort$1(Method method, Object obj) {
        return (short) getInt(method).applyAsInt(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setByte$3(Method method, Object obj, byte b) {
        setInt(method).accept(obj, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setChar$4(Method method, Object obj, char c) {
        setInt(method).accept(obj, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setFloat$7(BiConsumer biConsumer, Object obj, float f) {
        biConsumer.accept(obj, Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShort$5(Method method, Object obj, short s) {
        setInt(method).accept(obj, s);
    }

    private MethodHandles.Lookup lookup(Method method) {
        return lookup(method.getDeclaringClass());
    }

    public static void validateMethodAndParameterType(Method method, Class<?> cls) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1 || !parameterTypes[0].equals(cls)) {
            throw validateMethodAndParameterTypeError(cls, parameterTypes);
        }
    }

    private static IllegalArgumentException validateMethodAndParameterTypeError(Class<?> cls, Class<?>[] clsArr) {
        StringBuilder sb = new StringBuilder("Method parameter type mismatch. Expected: ");
        sb.append(cls.getSimpleName());
        sb.append(", Actual: ");
        sb.append(clsArr.length > 0 ? clsArr[0].getSimpleName() : "no parameters");
        return new IllegalArgumentException(sb.toString());
    }

    public static void validateMethodAndReturnType(Method method, Class<?> cls) {
        if (!method.getReturnType().equals(cls)) {
            throw validateMethodAndReturnTypeEror(method, cls);
        }
    }

    private static IllegalArgumentException validateMethodAndReturnTypeEror(Method method, Class<?> cls) {
        return new IllegalArgumentException("Method return type mismatch. Expected: " + cls.getSimpleName() + ", Actual: " + method.getReturnType().getSimpleName());
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public PropertyAccessor create(String str, Class<?> cls, Type type, Method method, Method method2, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        if (cls == null) {
            if (method != null) {
                cls = method.getReturnType();
            } else {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else if (parameterTypes.length == 2 && String.class.equals(parameterTypes[0])) {
                    cls = parameterTypes[1];
                }
            }
        }
        Class<?> cls2 = cls;
        if (!(method != null ? method.getDeclaringClass() : method2.getDeclaringClass()).getName().contains("$$Lambda") && (method2 == null || !isChainableSetter(method2))) {
            if (cls2 == Boolean.TYPE) {
                return create(str, getBoolean(method), setBoolean(method2));
            }
            if (JDKUtils.JVM_VERSION == 8) {
                if (cls2 == Byte.TYPE) {
                    return create(str, getByte(method), setByte(method2));
                }
                if (cls2 == Short.TYPE) {
                    return create(str, getShort(method), setShort(method2));
                }
                if (cls2 == Character.TYPE) {
                    return create(str, getChar(method), setChar(method2));
                }
            }
            if (cls2 == Integer.TYPE) {
                return create(str, getInt(method), setInt(method2));
            }
            if (cls2 == Long.TYPE) {
                return create(str, getLong(method), setLong(method2));
            }
            if (cls2 == Float.TYPE) {
                return create(str, getFloat(method), setFloat(method2));
            }
            if (cls2 == Double.TYPE) {
                return create(str, getDouble(method), setDouble(method2));
            }
            if (!cls2.isPrimitive()) {
                if (type == null) {
                    if (method != null) {
                        type = method.getGenericReturnType();
                    } else {
                        Type[] genericParameterTypes = method2.getGenericParameterTypes();
                        if (genericParameterTypes.length == 1) {
                            type = genericParameterTypes[0];
                        } else if (genericParameterTypes.length == 2 && String.class.equals(genericParameterTypes[0])) {
                            type = genericParameterTypes[1];
                        }
                    }
                }
                return create(str, cls2, type, getObject(method), setObject(str, method2), biFunction);
            }
        }
        return super.create(str, cls2, type, method, method2, biFunction);
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public BiFunction createBiFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            Class<?> cls2 = parameterTypes[1];
            return (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_BI_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE, cls, cls2)), MethodType.methodType(declaringClass, box(cls), box(cls2))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createBiFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public DoubleFunction createDoubleFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (DoubleFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_DOUBLE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_DOUBLE, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createDoubleFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public Function createFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public IntFunction createIntFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createIntFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public LongFunction createLongFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (LongFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_LONG_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_LONG, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createLongFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public Supplier createSupplier(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", TypeUtils.METHOD_TYPE_SUPPLIER, TypeUtils.METHOD_TYPE_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE)), MethodType.methodType(declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createSupplier(constructor);
        }
    }

    public Predicate<Object> getBoolean(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Boolean.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (Predicate) LambdaMetafactory.metafactory(lookup, "test", MethodType.methodType(Predicate.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ToByteFunction<Object> getByte(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToByteFunction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲇᲈᲁᤝ
            @Override // com.alibaba.fastjson2.function.ToByteFunction
            public final byte applyAsByte(Object obj) {
                return this.f7850.lambda$getByte$0(method, obj);
            }
        };
    }

    public ToCharFunction<Object> getChar(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToCharFunction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᲇᤝᲁ
            @Override // com.alibaba.fastjson2.function.ToCharFunction
            public final char applyAsChar(Object obj) {
                return this.f7859.lambda$getChar$2(method, obj);
            }
        };
    }

    public ToDoubleFunction<Object> getDouble(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Double.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToDoubleFunction) LambdaMetafactory.metafactory(lookup, "applyAsDouble", MethodType.methodType(ToDoubleFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ToFloatFunction<Object> getFloat(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Float.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            final ToDoubleFunction toDoubleFunctionInvokeExact = (ToDoubleFunction) LambdaMetafactory.metafactory(lookup, "applyAsDouble", MethodType.methodType(ToDoubleFunction.class), MethodType.methodType((Class<?>) Double.TYPE, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
            return new ToFloatFunction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᲁᤝᲇ
                @Override // com.alibaba.fastjson2.function.ToFloatFunction
                public final float applyAsFloat(Object obj) {
                    return PropertyAccessorFactoryLambda.lambda$getFloat$6(toDoubleFunctionInvokeExact, obj);
                }
            };
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ToIntFunction<Object> getInt(Method method) {
        if (method == null) {
            return null;
        }
        Class<?> returnType = method.getReturnType();
        Class cls = Integer.TYPE;
        if (!returnType.equals(cls) && !returnType.equals(Short.TYPE) && !returnType.equals(Byte.TYPE) && !returnType.equals(Character.TYPE)) {
            throw validateMethodAndReturnTypeEror(method, cls);
        }
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToIntFunction) LambdaMetafactory.metafactory(lookup, "applyAsInt", MethodType.methodType(ToIntFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ToLongFunction<Object> getLong(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Long.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToLongFunction) LambdaMetafactory.metafactory(lookup, "applyAsLong", MethodType.methodType(ToLongFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public Function<Object, Object> getObject(Method method) {
        if (method == null) {
            return null;
        }
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(method.getDeclaringClass());
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupTrustedLookup.unreflect(method), MethodType.methodType(method.getReturnType(), method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ToShortFunction<Object> getShort(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToShortFunction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᲁᲇᤝ
            @Override // com.alibaba.fastjson2.function.ToShortFunction
            public final short applyAsShort(Object obj) {
                return this.f7857.lambda$getShort$1(method, obj);
            }
        };
    }

    public ObjBoolConsumer setBoolean(Method method) {
        if (method == null) {
            return null;
        }
        validateMethodAndParameterType(method, Boolean.TYPE);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(BiConsumer.class);
            Class cls = Void.TYPE;
            return new C1310((BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls, Object.class, Object.class), methodHandleUnreflect, MethodType.methodType(cls, method.getDeclaringClass(), Boolean.class)).getTarget().invokeExact(), 1);
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ObjByteConsumer<Object> setByte(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjByteConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᤝᲇᲁ
            @Override // com.alibaba.fastjson2.function.ObjByteConsumer
            public final void accept(Object obj, byte b) {
                this.f7854.lambda$setByte$3(method, obj, b);
            }
        };
    }

    public ObjCharConsumer<Object> setChar(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjCharConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲇᲈᤝᲁ
            @Override // com.alibaba.fastjson2.function.ObjCharConsumer
            public final void accept(Object obj, char c) {
                this.f7848.lambda$setChar$4(method, obj, c);
            }
        };
    }

    public ObjDoubleConsumer<Object> setDouble(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Double.TYPE;
        validateMethodAndParameterType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(ObjDoubleConsumer.class);
            Class cls2 = Void.TYPE;
            return (ObjDoubleConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls2, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls2, method.getDeclaringClass(), cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ObjFloatConsumer setFloat(Method method) {
        if (method == null) {
            return null;
        }
        validateMethodAndParameterType(method, Float.TYPE);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(BiConsumer.class);
            Class cls = Void.TYPE;
            return new C1313((BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls, Object.class, Object.class), methodHandleUnreflect, MethodType.methodType(cls, method.getDeclaringClass(), Float.class)).getTarget().invokeExact(), 1);
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public ObjIntConsumer<Object> setInt(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class cls = Integer.TYPE;
        if (length == 1) {
            Class<?> cls2 = parameterTypes[0];
            if (cls2.equals(cls) || cls2.equals(Short.TYPE) || cls2.equals(Byte.TYPE) || cls2.equals(Character.TYPE)) {
                MethodHandles.Lookup lookup = lookup(method);
                try {
                    MethodHandle methodHandleUnreflect = lookup.unreflect(method);
                    MethodType methodType = MethodType.methodType(ObjIntConsumer.class);
                    Class cls3 = Void.TYPE;
                    return (ObjIntConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls3, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls3, method.getDeclaringClass(), cls2)).getTarget().invokeExact();
                } catch (Throwable th) {
                    throw new RuntimeException("Failed to create lambda for method: " + method, th);
                }
            }
        }
        throw validateMethodAndParameterTypeError(cls, parameterTypes);
    }

    public ObjLongConsumer<Object> setLong(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Long.TYPE;
        validateMethodAndParameterType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(ObjLongConsumer.class);
            Class cls2 = Void.TYPE;
            return (ObjLongConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls2, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls2, method.getDeclaringClass(), cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th);
        }
    }

    public BiConsumer<Object, Object> setObject(Method method) {
        return setObject(null, method);
    }

    public ObjShortConsumer<Object> setShort(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjShortConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲇᲁᲈᤝ
            @Override // com.alibaba.fastjson2.function.ObjShortConsumer
            public final void accept(Object obj, short s) {
                this.f7846.lambda$setShort$5(method, obj, s);
            }
        };
    }

    public MethodHandles.Lookup lookup(Class<?> cls) {
        return USE_UNSAFE ? JDKUtils.trustedLookup(cls) : MethodHandles.lookup().in(cls);
    }

    public BiConsumer<Object, Object> setObject(final String str, Method method) {
        if (method == null) {
            return null;
        }
        MethodHandles.Lookup lookup = lookup(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class cls = Void.TYPE;
        if (length == 2 && parameterTypes[0].equals(String.class)) {
            try {
                final BiFunction biFunctionInvokeExact = (BiFunction) LambdaMetafactory.metafactory(lookup, "accept", MethodType.methodType(BiFunction.class), MethodType.methodType(cls, Object.class, Object.class, Object.class), lookup.unreflect(method), MethodType.methodType(cls, method.getDeclaringClass(), String.class, method.getParameterTypes()[1])).getTarget().invokeExact();
                return new BiConsumer() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲈᤝᲁᲇ
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        biFunctionInvokeExact.apply(str, obj2);
                    }
                };
            } catch (Throwable th) {
                throw new RuntimeException("Failed to create lambda for method: " + method, th);
            }
        }
        if (parameterTypes.length != 1) {
            throw new IllegalArgumentException("Method must have exactly one parameter");
        }
        try {
            return (BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", MethodType.methodType(BiConsumer.class), MethodType.methodType(cls, Object.class, Object.class), lookup.unreflect(method), MethodType.methodType(cls, method.getDeclaringClass(), method.getParameterTypes()[0])).getTarget().invokeExact();
        } catch (Throwable th2) {
            throw new RuntimeException("Failed to create lambda for method: " + method, th2);
        }
    }

    public PropertyAccessor createSupplier(String str, Method method, Method method2) {
        return create(str, (Class<?>) null, (Type) null, method, method2);
    }
}
