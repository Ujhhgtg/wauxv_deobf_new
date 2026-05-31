package com.alibaba.fastjson2.support;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaders;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriters;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class LambdaMiscCodec {
    static volatile Throwable errorLast;
    static volatile boolean hppcError;

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorBiFunction implements BiFunction {
        final Constructor constructor;

        public ConstructorBiFunction(Constructor constructor) {
            this.constructor = constructor;
        }

        @Override // java.util.function.BiFunction
        public Object apply(Object obj, Object obj2) {
            try {
                return this.constructor.newInstance(obj, obj2);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorFunction implements Function {
        final Constructor constructor;

        public ConstructorFunction(Constructor constructor) {
            this.constructor = constructor;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            try {
                return this.constructor.newInstance(obj);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorSupplier implements Supplier {
        final Constructor constructor;

        public ConstructorSupplier(Constructor constructor) {
            this.constructor = constructor;
        }

        @Override // java.util.function.Supplier
        public Object get() {
            try {
                return this.constructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FactoryFunction implements Function {
        final Method method;

        public FactoryFunction(Method method) {
            this.method = method;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            try {
                return this.method.invoke(null, obj);
            } catch (Exception e) {
                throw new JSONException("createInstance error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class GetterFunction implements Function {
        final Method method;

        public GetterFunction(Method method) {
            this.method = method;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            try {
                return this.method.invoke(obj, null);
            } catch (Exception e) {
                throw new JSONException("createInstance error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectBiFunction implements BiFunction {
        final Method method;

        public ReflectBiFunction(Method method) {
            this.method = method;
        }

        @Override // java.util.function.BiFunction
        public Object apply(Object obj, Object obj2) {
            try {
                return Modifier.isStatic(this.method.getModifiers()) ? this.method.invoke(null, obj, obj2) : this.method.invoke(obj, obj2);
            } catch (IllegalAccessException e) {
                e = e;
                throw new JSONException("invoke error", e);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectLongFunction implements LongFunction {
        final Constructor constructor;

        public ReflectLongFunction(Constructor constructor) {
            this.constructor = constructor;
        }

        @Override // java.util.function.LongFunction
        public Object apply(long j) {
            try {
                return this.constructor.newInstance(Long.valueOf(j));
            } catch (Exception e) {
                throw new JSONException("createInstance error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectObjIntConsumer implements ObjIntConsumer {
        final Method method;

        public ReflectObjIntConsumer(Method method) {
            this.method = method;
        }

        @Override // java.util.function.ObjIntConsumer
        public void accept(Object obj, int i) {
            try {
                this.method.invoke(obj, Integer.valueOf(i));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectSupplier implements Supplier {
        final Method method;

        public ReflectSupplier(Method method) {
            this.method = method;
        }

        @Override // java.util.function.Supplier
        public Object get() {
            try {
                return this.method.invoke(null, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JSONException("invoke error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectToIntFunction implements ToIntFunction {
        final Method method;

        public ReflectToIntFunction(Method method) {
            this.method = method;
        }

        @Override // java.util.function.ToIntFunction
        public int applyAsInt(Object obj) {
            try {
                return ((Integer) this.method.invoke(obj, null)).intValue();
            } catch (Exception e) {
                throw new JSONException("applyAsInt error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ReflectToLongFunction implements ToLongFunction {
        final Method method;

        public ReflectToLongFunction(Method method) {
            this.method = method;
        }

        @Override // java.util.function.ToLongFunction
        public long applyAsLong(Object obj) {
            try {
                return ((Long) this.method.invoke(obj, null)).longValue();
            } catch (Exception e) {
                throw new JSONException("applyAsLong error", e);
            }
        }
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

    public static BiFunction createBiFunction(Method method) {
        MethodType methodType;
        MethodHandle methodHandle;
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> cls2 = parameterTypes[1];
                MethodHandle methodHandleFindStatic = lookupTrustedLookup.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls, cls2));
                methodType = MethodType.methodType(returnType, cls, cls2);
                methodHandle = methodHandleFindStatic;
            } else {
                MethodHandle methodHandleFindVirtual = lookupTrustedLookup.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType, cls));
                methodType = MethodType.methodType(returnType, declaringClass, box(cls));
                methodHandle = methodHandleFindVirtual;
            }
            return (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_BI_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT, methodHandle, methodType).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectBiFunction(method);
        }
    }

    public static Function createFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ConstructorFunction(constructor);
        }
    }

    public static LongFunction createLongFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            return (LongFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_LONG_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_LONG, lookupTrustedLookup.findConstructor(declaringClass, TypeUtils.METHOD_TYPE_VOID_LONG), MethodType.methodType(declaringClass, (Class<?>) Long.TYPE)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectLongFunction(constructor);
        }
    }

    public static ObjIntConsumer createObjIntConsumer(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class cls = Void.TYPE;
            Class cls2 = Integer.TYPE;
            return (ObjIntConsumer) LambdaMetafactory.metafactory(lookupTrustedLookup, "accept", TypeUtils.METHOD_TYPE_OBJECT_INT_CONSUMER, TypeUtils.METHOD_TYPE_VOID_OBJECT_INT, lookupTrustedLookup.findVirtual(declaringClass, method.getName(), MethodType.methodType((Class<?>) cls, (Class<?>) cls2)), MethodType.methodType(cls, declaringClass, cls2)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectObjIntConsumer(method);
        }
    }

    public static Supplier createSupplier(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", TypeUtils.METHOD_TYPE_SUPPLIER, TypeUtils.METHOD_TYPE_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE)), MethodType.methodType(declaringClass)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ConstructorSupplier(constructor);
        }
    }

    public static ToIntFunction createToIntFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class cls = Integer.TYPE;
            return (ToIntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "applyAsInt", TypeUtils.METHOD_TYPE_TO_INT_FUNCTION, TypeUtils.METHOD_TYPE_INT_OBJECT, lookupTrustedLookup.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectToIntFunction(method);
        }
    }

    public static ToLongFunction createToLongFunction(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class cls = Long.TYPE;
            return (ToLongFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "applyAsLong", TypeUtils.METHOD_TYPE_TO_LONG_FUNCTION, TypeUtils.METHOD_TYPE_LONG_OBJECT, lookupTrustedLookup.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectToLongFunction(method);
        }
    }

    public static ObjectReader getObjectReader(Class cls) {
        if (hppcError) {
            return null;
        }
        String name = cls.getName();
        if (!name.equals("com.carrotsearch.hppc.LongHashSet")) {
            if (!name.equals("gnu.trove.set.hash.TShortHashSet")) {
                if (name.equals("com.carrotsearch.hppc.CharHashSet") || name.equals("com.carrotsearch.hppc.CharArrayList")) {
                    try {
                        return ObjectReaders.fromCharArray(createFunction(cls.getMethod("from", char[].class)));
                    } catch (NoSuchMethodException | SecurityException e) {
                        throw new JSONException("illegal state", e);
                    }
                }
                if (!name.equals("com.carrotsearch.hppc.IntArrayList")) {
                    if (!name.equals("gnu.trove.list.array.TLongArrayList")) {
                        if (!name.equals("gnu.trove.list.array.TShortArrayList")) {
                            if (!name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                if (name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                    try {
                                        return ObjectReaders.fromShortArray(createFunction(cls.getMethod("from", short[].class)));
                                    } catch (NoSuchMethodException | SecurityException e2) {
                                        throw new JSONException("illegal state", e2);
                                    }
                                }
                                if (name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                    try {
                                        return ObjectReaders.fromDoubleArray(createFunction(cls.getMethod("from", double[].class)));
                                    } catch (NoSuchMethodException | SecurityException e3) {
                                        throw new JSONException("illegal state", e3);
                                    }
                                }
                                if (name.equals("com.carrotsearch.hppc.ByteArrayList")) {
                                    try {
                                        return ObjectReaders.fromByteArray(createFunction(cls.getMethod("from", byte[].class)));
                                    } catch (NoSuchMethodException | SecurityException e4) {
                                        throw new JSONException("illegal state", e4);
                                    }
                                }
                                if (!name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                    if (name.equals("gnu.trove.list.array.TCharArrayList")) {
                                        try {
                                            return ObjectReaders.fromCharArray(createFunction(cls.getConstructor(char[].class)));
                                        } catch (NoSuchMethodException | SecurityException e5) {
                                            throw new JSONException("illegal state", e5);
                                        }
                                    }
                                    if (name.equals("gnu.trove.list.array.TFloatArrayList")) {
                                        try {
                                            return ObjectReaders.fromFloatArray(createFunction(cls.getConstructor(float[].class)));
                                        } catch (NoSuchMethodException | SecurityException e6) {
                                            throw new JSONException("illegal state", e6);
                                        }
                                    }
                                    if (!name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                        if (name.equals("com.carrotsearch.hppc.FloatArrayList")) {
                                            try {
                                                return ObjectReaders.fromFloatArray(createFunction(cls.getMethod("from", float[].class)));
                                            } catch (NoSuchMethodException | SecurityException e7) {
                                                throw new JSONException("illegal state", e7);
                                            }
                                        }
                                        if (!name.equals("com.carrotsearch.hppc.IntHashSet")) {
                                            if (!name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                if (!name.equals("gnu.trove.list.array.TByteArrayList")) {
                                                    if (name.equals("org.bson.types.Decimal128")) {
                                                        try {
                                                            return ObjectReaders.fromBigDecimal(createFunction(cls.getConstructor(BigDecimal.class)));
                                                        } catch (NoSuchMethodException | SecurityException e8) {
                                                            throw new JSONException("illegal state", e8);
                                                        }
                                                    }
                                                    if (!name.equals("gnu.trove.set.hash.TByteHashSet")) {
                                                        if (!name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                            if (!name.equals("gnu.trove.list.array.TDoubleArrayList")) {
                                                                return null;
                                                            }
                                                            try {
                                                                return ObjectReaders.fromDoubleArray(createFunction(cls.getConstructor(double[].class)));
                                                            } catch (NoSuchMethodException | SecurityException e9) {
                                                                throw new JSONException("illegal state", e9);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        return ObjectReaders.fromByteArray(createFunction(cls.getConstructor(byte[].class)));
                                    } catch (NoSuchMethodException | SecurityException e10) {
                                        throw new JSONException("illegal state", e10);
                                    }
                                }
                            }
                            try {
                                return ObjectReaders.fromIntArray(createFunction(cls.getConstructor(int[].class)));
                            } catch (NoSuchMethodException | SecurityException e11) {
                                throw new JSONException("illegal state", e11);
                            }
                        }
                    }
                    try {
                        return ObjectReaders.fromLongArray(createFunction(cls.getConstructor(long[].class)));
                    } catch (NoSuchMethodException | SecurityException e12) {
                        throw new JSONException("illegal state", e12);
                    }
                }
                try {
                    return ObjectReaders.fromIntArray(createFunction(cls.getMethod("from", int[].class)));
                } catch (NoSuchMethodException | SecurityException e13) {
                    throw new JSONException("illegal state", e13);
                }
            }
            try {
                return ObjectReaders.fromShortArray(createFunction(cls.getConstructor(short[].class)));
            } catch (NoSuchMethodException | SecurityException e14) {
                throw new JSONException("illegal state", e14);
            }
        }
        try {
            return ObjectReaders.fromLongArray(createFunction(cls.getMethod("from", long[].class)));
        } catch (NoSuchMethodException | SecurityException e15) {
            throw new JSONException("illegal state", e15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        if (r0.equals("gnu.trove.list.array.TDoubleArrayList") == false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectWriter getObjectWriter(Type type, Class cls) {
        if (hppcError) {
            return null;
        }
        String name = cls.getName();
        if (!name.equals("com.carrotsearch.hppc.LongHashSet")) {
            if (!name.equals("gnu.trove.set.hash.TShortHashSet")) {
                if (!name.equals("com.carrotsearch.hppc.CharHashSet") && !name.equals("com.carrotsearch.hppc.CharArrayList")) {
                    if (!name.equals("com.carrotsearch.hppc.IntArrayList")) {
                        if (!name.equals("gnu.trove.list.array.TLongArrayList")) {
                            if (name.equals("com.carrotsearch.hppc.BitSet")) {
                                MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
                                try {
                                    return ObjectWriters.ofToBooleanArray(createToLongFunction(cls.getMethod("size", null)), (BiFunction<Object, Integer, Boolean>) (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(BiFunction.class), MethodType.methodType(Object.class, Object.class, Object.class), lookupTrustedLookup.findVirtual(cls, "get", MethodType.methodType((Class<?>) Boolean.TYPE, (Class<?>) Integer.TYPE)), MethodType.methodType(Boolean.class, cls, Integer.class)).getTarget().invokeExact());
                                } catch (Throwable unused) {
                                    hppcError = true;
                                }
                            } else if (!name.equals("gnu.trove.list.array.TShortArrayList")) {
                                if (!name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                    if (!name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                        if (!name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                            if (!name.equals("com.carrotsearch.hppc.ByteArrayList")) {
                                                if (!name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                                    if (!name.equals("gnu.trove.list.array.TCharArrayList")) {
                                                        if (!name.equals("gnu.trove.list.array.TFloatArrayList")) {
                                                            if (!name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                                                if (!name.equals("com.carrotsearch.hppc.FloatArrayList")) {
                                                                    if (!name.equals("com.carrotsearch.hppc.IntHashSet") && !name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                                        if (!name.equals("gnu.trove.list.array.TByteArrayList")) {
                                                                            if (name.equals("org.bson.types.Decimal128")) {
                                                                                try {
                                                                                    return ObjectWriters.ofToBigDecimal(createFunction(cls.getMethod("bigDecimalValue", null)));
                                                                                } catch (NoSuchMethodException | SecurityException e) {
                                                                                    throw new JSONException("illegal state", e);
                                                                                }
                                                                            }
                                                                            if (!name.equals("gnu.trove.set.hash.TByteHashSet")) {
                                                                                if (!name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            return ObjectWriters.ofToFloatArray(createFunction(cls.getMethod("toArray", null)));
                                                        } catch (NoSuchMethodException | SecurityException e2) {
                                                            throw new JSONException("illegal state", e2);
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                return ObjectWriters.ofToByteArray(createFunction(cls.getMethod("toArray", null)));
                                            } catch (NoSuchMethodException | SecurityException e3) {
                                                throw new JSONException("illegal state", e3);
                                            }
                                        }
                                        try {
                                            return ObjectWriters.ofToDoubleArray(createFunction(cls.getMethod("toArray", null)));
                                        } catch (NoSuchMethodException | SecurityException e4) {
                                            throw new JSONException("illegal state", e4);
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                    }
                    try {
                        return ObjectWriters.ofToIntArray(createFunction(cls.getMethod("toArray", null)));
                    } catch (NoSuchMethodException | SecurityException e5) {
                        throw new JSONException("illegal state", e5);
                    }
                }
                try {
                    return ObjectWriters.ofToCharArray(createFunction(cls.getMethod("toArray", null)));
                } catch (NoSuchMethodException | SecurityException e6) {
                    throw new JSONException("illegal state", e6);
                }
            }
            try {
                return ObjectWriters.ofToShortArray(createFunction(cls.getMethod("toArray", null)));
            } catch (NoSuchMethodException | SecurityException e7) {
                throw new JSONException("illegal state", e7);
            }
        }
        try {
            return ObjectWriters.ofToLongArray(createFunction(cls.getMethod("toArray", null)));
        } catch (NoSuchMethodException | SecurityException e8) {
            throw new JSONException("illegal state", e8);
        }
    }

    public static Supplier createSupplier(Method method) {
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", TypeUtils.METHOD_TYPE_SUPPLIER, TypeUtils.METHOD_TYPE_OBJECT, lookupTrustedLookup.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType)), MethodType.methodType(returnType)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ReflectSupplier(method);
        }
    }

    public static Function createFunction(Method method) {
        Class<?> cls;
        MethodHandle methodHandleFindVirtual;
        Class<?> declaringClass = method.getDeclaringClass();
        int modifiers = method.getModifiers();
        Class<?>[] parameterTypes = method.getParameterTypes();
        boolean zIsStatic = Modifier.isStatic(modifiers);
        Class<?> returnType = method.getReturnType();
        if (parameterTypes.length == 1 && zIsStatic) {
            cls = parameterTypes[0];
        } else {
            if (parameterTypes.length != 0 || zIsStatic) {
                throw new JSONException("not support parameters " + method);
            }
            cls = declaringClass;
        }
        try {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            if (zIsStatic) {
                methodHandleFindVirtual = lookupTrustedLookup.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls));
            } else {
                methodHandleFindVirtual = lookupTrustedLookup.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType));
            }
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, methodHandleFindVirtual, MethodType.methodType(returnType, cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            if (!Modifier.isStatic(method.getModifiers())) {
                return new GetterFunction(method);
            }
            return new FactoryFunction(method);
        }
    }

    public static BiFunction createBiFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            Class<?> cls2 = parameterTypes[1];
            return (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_BI_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE, cls, cls2)), MethodType.methodType(declaringClass, box(cls), box(cls2))).getTarget().invokeExact();
        } catch (Throwable th) {
            errorLast = th;
            return new ConstructorBiFunction(constructor);
        }
    }
}
