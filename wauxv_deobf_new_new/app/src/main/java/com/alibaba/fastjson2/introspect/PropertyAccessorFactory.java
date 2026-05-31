package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.internal.Cast;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import p000.C1311;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class PropertyAccessorFactory {

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorBiFunction extends ConstructorFunctionBase implements BiFunction {
        public ConstructorBiFunction(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.BiFunction
        public Object apply(Object obj, Object obj2) {
            try {
                return this.constructor.newInstance(obj, obj2);
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorDoubleFunction extends ConstructorFunctionBase implements DoubleFunction {
        public ConstructorDoubleFunction(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.DoubleFunction
        public Object apply(double d) {
            try {
                return this.constructor.newInstance(Double.valueOf(d));
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorFunction extends ConstructorFunctionBase implements Function {
        public ConstructorFunction(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            try {
                return this.constructor.newInstance(obj);
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static abstract class ConstructorFunctionBase {
        protected final Constructor constructor;

        public ConstructorFunctionBase(Constructor constructor) {
            this.constructor = constructor;
            setAccessible();
        }

        public JSONException errorOnNewInstance(Exception exc) {
            return new JSONException(this.constructor.toString().concat(" newInstance error"), exc);
        }

        public JSONException errorOnSetAccessible(Exception exc) {
            return new JSONException(this.constructor.toString().concat(" setAccessible error"), exc);
        }

        public void setAccessible() {
            try {
                this.constructor.setAccessible(true);
            } catch (Exception e) {
                throw new JSONException(e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorIntFunction extends ConstructorFunctionBase implements IntFunction {
        public ConstructorIntFunction(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.IntFunction
        public Object apply(int i) {
            try {
                return this.constructor.newInstance(Integer.valueOf(i));
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorLongFunction extends ConstructorFunctionBase implements LongFunction {
        public ConstructorLongFunction(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.LongFunction
        public Object apply(long j) {
            try {
                return this.constructor.newInstance(Long.valueOf(j));
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ConstructorSupplier extends ConstructorFunctionBase implements Supplier {
        public ConstructorSupplier(Constructor constructor) {
            super(constructor);
        }

        @Override // java.util.function.Supplier
        public Object get() {
            try {
                return this.constructor.newInstance(null);
            } catch (Exception e) {
                throw errorOnNewInstance(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static abstract class FieldAccessorReflect extends FieldAccessor {
        public FieldAccessorReflect(Field field) {
            super(field);
            try {
                field.setAccessible(true);
            } catch (RuntimeException e) {
                throw errorOnSetAccessible(field, e);
            }
        }

        private static JSONException errorOnSetAccessible(Field field, RuntimeException runtimeException) {
            return new JSONException(field.toString() + " setAccessible error", runtimeException);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectBigDecimal extends FieldAccessorReflect implements PropertyAccessorBigDecimal {
        public FieldAccessorReflectBigDecimal(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public BigDecimal getBigDecimal(Object obj) {
            try {
                return (BigDecimal) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public void setBigDecimal(Object obj, BigDecimal bigDecimal) {
            try {
                this.field.set(obj, bigDecimal);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectBigInteger extends FieldAccessorReflect implements PropertyAccessorBigInteger {
        public FieldAccessorReflectBigInteger(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public BigInteger getBigInteger(Object obj) {
            try {
                return (BigInteger) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public void setBigInteger(Object obj, BigInteger bigInteger) {
            try {
                this.field.set(obj, bigInteger);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectBoolean extends FieldAccessorReflect implements PropertyAccessorBoolean {
        public FieldAccessorReflectBoolean(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public Boolean getBoolean(Object obj) {
            try {
                return (Boolean) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public void setBoolean(Object obj, Boolean bool) {
            try {
                this.field.set(obj, bool);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectBooleanValue extends FieldAccessorReflect implements PropertyAccessorBooleanValue {
        public FieldAccessorReflectBooleanValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public boolean getBooleanValue(Object obj) {
            try {
                return this.field.getBoolean(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setBooleanValue(Object obj, boolean z) {
            try {
                this.field.setBoolean(obj, z);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectByte extends FieldAccessorReflect implements PropertyAccessorByte {
        public FieldAccessorReflectByte(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public Byte getByte(Object obj) {
            try {
                return (Byte) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public void setByte(Object obj, Byte b) {
            try {
                this.field.set(obj, b);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectByteValue extends FieldAccessorReflect implements PropertyAccessorByteValue {
        public FieldAccessorReflectByteValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public byte getByteValue(Object obj) {
            try {
                return this.field.getByte(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setByteValue(Object obj, byte b) {
            try {
                this.field.setByte(obj, b);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectCharValue extends FieldAccessorReflect implements PropertyAccessorCharValue {
        public FieldAccessorReflectCharValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public char getCharValue(Object obj) {
            try {
                return this.field.getChar(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setCharValue(Object obj, char c) {
            try {
                this.field.setChar(obj, c);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectCharacter extends FieldAccessorReflect implements PropertyAccessorCharacter {
        public FieldAccessorReflectCharacter(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public Character getCharacter(Object obj) {
            try {
                return (Character) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public void setCharacter(Object obj, Character ch) {
            try {
                this.field.set(obj, ch);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectDouble extends FieldAccessorReflect implements PropertyAccessorDouble {
        public FieldAccessorReflectDouble(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public Double getDouble(Object obj) {
            try {
                return (Double) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public void setDouble(Object obj, Double d) {
            try {
                this.field.set(obj, d);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectDoubleValue extends FieldAccessorReflect implements PropertyAccessorDoubleValue {
        public FieldAccessorReflectDoubleValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public double getDoubleValue(Object obj) {
            try {
                return this.field.getDouble(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setDoubleValue(Object obj, double d) {
            try {
                this.field.setDouble(obj, d);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectFloat extends FieldAccessorReflect implements PropertyAccessorFloat {
        public FieldAccessorReflectFloat(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public Float getFloat(Object obj) {
            try {
                return (Float) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public void setFloat(Object obj, Float f) {
            try {
                this.field.set(obj, f);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectFloatValue extends FieldAccessorReflect implements PropertyAccessorFloatValue {
        public FieldAccessorReflectFloatValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public float getFloatValue(Object obj) {
            try {
                return this.field.getFloat(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setFloatValue(Object obj, float f) {
            try {
                this.field.setFloat(obj, f);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectIntValue extends FieldAccessorReflect implements PropertyAccessorIntValue {
        public FieldAccessorReflectIntValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public int getIntValue(Object obj) {
            try {
                return this.field.getInt(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setIntValue(Object obj, int i) {
            try {
                this.field.setInt(obj, i);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectInteger extends FieldAccessorReflect implements PropertyAccessorInteger {
        public FieldAccessorReflectInteger(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public Integer getInteger(Object obj) {
            try {
                return (Integer) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public void setInteger(Object obj, Integer num) {
            try {
                this.field.set(obj, num);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectLong extends FieldAccessorReflect implements PropertyAccessorLong {
        public FieldAccessorReflectLong(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public Long getLong(Object obj) {
            try {
                return (Long) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public void setLong(Object obj, Long l) {
            try {
                this.field.set(obj, l);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectLongValue extends FieldAccessorReflect implements PropertyAccessorLongValue {
        public FieldAccessorReflectLongValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public long getLongValue(Object obj) {
            try {
                return this.field.getLong(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setLongValue(Object obj, long j) {
            try {
                this.field.setLong(obj, j);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectNumber extends FieldAccessorReflect implements PropertyAccessorNumber {
        public FieldAccessorReflectNumber(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public Number getNumber(Object obj) {
            try {
                return (Number) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public void setNumber(Object obj, Number number) {
            try {
                this.field.set(obj, number);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectObject extends FieldAccessorReflect implements PropertyAccessorObject {
        public FieldAccessorReflectObject(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public Object getObject(Object obj) {
            try {
                return this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setObject(Object obj, Object obj2) {
            try {
                this.field.set(obj, obj2);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectShort extends FieldAccessorReflect implements PropertyAccessorShort {
        public FieldAccessorReflectShort(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public Short getShort(Object obj) {
            try {
                return (Short) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public void setShort(Object obj, Short sh) {
            try {
                this.field.set(obj, sh);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectShortValue extends FieldAccessorReflect implements PropertyAccessorShortValue {
        public FieldAccessorReflectShortValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public short getShortValue(Object obj) {
            try {
                return this.field.getShort(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setShortValue(Object obj, short s) {
            try {
                this.field.setShort(obj, s);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorReflectString extends FieldAccessorReflect implements PropertyAccessorString {
        public FieldAccessorReflectString(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public String getString(Object obj) {
            try {
                return (String) this.field.get(obj);
            } catch (IllegalAccessException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public void setString(Object obj, String str) {
            try {
                this.field.set(obj, str);
            } catch (IllegalAccessException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorBigDecimal<T> extends FunctionAccessor<T> implements PropertyAccessorBigDecimal {
        private final Function<T, BigDecimal> getterFunc;
        private final BiConsumer<T, BigDecimal> setterFunc;

        public FunctionAccessorBigDecimal(String str, Function<T, BigDecimal> function, BiConsumer<T, BigDecimal> biConsumer, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
            super(str, BigDecimal.class, BigDecimal.class, function, biConsumer, biFunction);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public BigDecimal getBigDecimal(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public void setBigDecimal(Object obj, BigDecimal bigDecimal) {
            try {
                this.setterFunc.accept(obj, bigDecimal);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorBigInteger<T> extends FunctionAccessor<T> implements PropertyAccessorBigInteger {
        private final Function<T, BigInteger> getterFunc;
        private final BiConsumer<T, BigInteger> setterFunc;

        public FunctionAccessorBigInteger(String str, Function<T, BigInteger> function, BiConsumer<T, BigInteger> biConsumer, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
            super(str, BigInteger.class, BigInteger.class, function, biConsumer, biFunction);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public BigInteger getBigInteger(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public void setBigInteger(Object obj, BigInteger bigInteger) {
            try {
                this.setterFunc.accept(obj, bigInteger);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorBoolean<T> extends FunctionAccessor<T> implements PropertyAccessorBoolean {
        private final Function<T, Boolean> getterFunc;
        private final BiConsumer<T, Boolean> setterFunc;

        public FunctionAccessorBoolean(String str, Function<T, Boolean> function, BiConsumer<T, Boolean> biConsumer, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
            super(str, Boolean.class, Boolean.class, function, biConsumer, biFunction);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public Boolean getBoolean(Object obj) {
            return this.getterFunc.apply(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public void setBoolean(Object obj, Boolean bool) {
            try {
                this.setterFunc.accept(obj, bool);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorBooleanValue<T> extends FunctionAccessor<T> implements PropertyAccessorBooleanValue {
        private final Predicate<T> getterFunc;
        private final ObjBoolConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorBooleanValue(String str, Predicate<T> predicate, ObjBoolConsumer<T> objBoolConsumer) {
            Class cls = Boolean.TYPE;
            super(str, cls, cls, predicate, objBoolConsumer);
            this.getterFunc = predicate;
            this.setterFunc = objBoolConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public boolean getBooleanValue(Object obj) {
            return this.getterFunc.test(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setBooleanValue(Object obj, boolean z) {
            this.setterFunc.accept(obj, z);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorByte<T> extends FunctionAccessor<T> implements PropertyAccessorByte {
        private final Function<T, Byte> getterFunc;
        private final BiConsumer<T, Byte> setterFunc;

        public FunctionAccessorByte(String str, Function<T, Byte> function, BiConsumer<T, Byte> biConsumer) {
            super(str, Byte.class, Byte.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public Byte getByte(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public void setByte(Object obj, Byte b) {
            try {
                this.setterFunc.accept(obj, b);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorByteValue<T> extends FunctionAccessor<T> implements PropertyAccessorByteValue {
        private final ToByteFunction<T> getterFunc;
        private final ObjByteConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorByteValue(String str, ToByteFunction<T> toByteFunction, ObjByteConsumer<T> objByteConsumer) {
            Class cls = Byte.TYPE;
            super(str, cls, cls, toByteFunction, objByteConsumer);
            this.getterFunc = toByteFunction;
            this.setterFunc = objByteConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public byte getByteValue(Object obj) {
            return this.getterFunc.applyAsByte(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setByteValue(Object obj, byte b) {
            this.setterFunc.accept(obj, b);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorCharValue<T> extends FunctionAccessor<T> implements PropertyAccessorCharValue {
        private final ToCharFunction<T> getterFunc;
        private final ObjCharConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorCharValue(String str, ToCharFunction<T> toCharFunction, ObjCharConsumer<T> objCharConsumer) {
            Class cls = Character.TYPE;
            super(str, cls, cls, toCharFunction, objCharConsumer);
            this.getterFunc = toCharFunction;
            this.setterFunc = objCharConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public char getCharValue(Object obj) {
            return this.getterFunc.applyAsChar(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setCharValue(Object obj, char c) {
            this.setterFunc.accept(obj, c);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorCharacter<T> extends FunctionAccessor<T> implements PropertyAccessorCharacter {
        private final Function<T, Character> getterFunc;
        private final BiConsumer<T, Character> setterFunc;

        public FunctionAccessorCharacter(String str, Function<T, Character> function, BiConsumer<T, Character> biConsumer) {
            super(str, Character.class, Character.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public Character getCharacter(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public void setCharacter(Object obj, Character ch) {
            try {
                this.setterFunc.accept(obj, ch);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorDouble<T> extends FunctionAccessor<T> implements PropertyAccessorDouble {
        private final Function<T, Double> getterFunc;
        private final BiConsumer<T, Double> setterFunc;

        public FunctionAccessorDouble(String str, Function<T, Double> function, BiConsumer<T, Double> biConsumer) {
            super(str, Double.class, Double.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public Double getDouble(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public void setDouble(Object obj, Double d) {
            try {
                this.setterFunc.accept(obj, d);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorDoubleValue<T> extends FunctionAccessor implements PropertyAccessorDoubleValue {
        private final ToDoubleFunction<T> getterFunc;
        private final ObjDoubleConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorDoubleValue(String str, ToDoubleFunction<T> toDoubleFunction, ObjDoubleConsumer<T> objDoubleConsumer) {
            Class cls = Double.TYPE;
            super(str, cls, cls, toDoubleFunction, objDoubleConsumer);
            this.getterFunc = toDoubleFunction;
            this.setterFunc = objDoubleConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public double getDoubleValue(Object obj) {
            return this.getterFunc.applyAsDouble(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setDoubleValue(Object obj, double d) {
            this.setterFunc.accept(obj, d);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorFloat<T> extends FunctionAccessor<T> implements PropertyAccessorFloat {
        private final Function<T, Float> getterFunc;
        private final BiConsumer<T, Float> setterFunc;

        public FunctionAccessorFloat(String str, Function<T, Float> function, BiConsumer<T, Float> biConsumer) {
            super(str, Float.class, Float.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public Float getFloat(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public void setFloat(Object obj, Float f) {
            try {
                this.setterFunc.accept(obj, f);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorFloatValue<T> extends FunctionAccessor<T> implements PropertyAccessorFloatValue {
        private final ToFloatFunction<T> getterFunc;
        private final ObjFloatConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorFloatValue(String str, ToFloatFunction<T> toFloatFunction, ObjFloatConsumer<T> objFloatConsumer) {
            Class cls = Float.TYPE;
            super(str, cls, cls, toFloatFunction, objFloatConsumer);
            this.getterFunc = toFloatFunction;
            this.setterFunc = objFloatConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public float getFloatValue(Object obj) {
            return this.getterFunc.applyAsFloat(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setFloatValue(Object obj, float f) {
            this.setterFunc.accept(obj, f);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorIntValue<T> extends FunctionAccessor<T> implements PropertyAccessorIntValue {
        private final ToIntFunction<T> getterFunc;
        private final ObjIntConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorIntValue(String str, ToIntFunction<T> toIntFunction, ObjIntConsumer<T> objIntConsumer) {
            Class cls = Integer.TYPE;
            super(str, cls, cls, toIntFunction, objIntConsumer);
            this.getterFunc = toIntFunction;
            this.setterFunc = objIntConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public int getIntValue(Object obj) {
            return this.getterFunc.applyAsInt(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setIntValue(Object obj, int i) {
            this.setterFunc.accept(obj, i);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorInteger<T> extends FunctionAccessor<T> implements PropertyAccessorInteger {
        private final Function<T, Integer> getterFunc;
        private final BiConsumer<T, Integer> setterFunc;

        public FunctionAccessorInteger(String str, Function<T, Integer> function, BiConsumer<T, Integer> biConsumer) {
            super(str, Integer.class, Integer.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public Integer getInteger(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public void setInteger(Object obj, Integer num) {
            try {
                this.setterFunc.accept(obj, num);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorLong<T> extends FunctionAccessor<T> implements PropertyAccessorLong {
        private final Function<T, Long> getterFunc;
        private final BiConsumer<T, Long> setterFunc;

        public FunctionAccessorLong(String str, Function<T, Long> function, BiConsumer<T, Long> biConsumer) {
            super(str, Long.class, Long.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public Long getLong(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public void setLong(Object obj, Long l) {
            try {
                this.setterFunc.accept(obj, l);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorLongValue<T> extends FunctionAccessor<T> implements PropertyAccessorLongValue {
        private final ToLongFunction<T> getterFunc;
        private final ObjLongConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorLongValue(String str, ToLongFunction<T> toLongFunction, ObjLongConsumer<T> objLongConsumer) {
            Class cls = Long.TYPE;
            super(str, cls, cls, toLongFunction, objLongConsumer);
            this.getterFunc = toLongFunction;
            this.setterFunc = objLongConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public long getLongValue(Object obj) {
            return this.getterFunc.applyAsLong(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setLongValue(Object obj, long j) {
            this.setterFunc.accept(obj, j);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorNumber<T> extends FunctionAccessor<T> implements PropertyAccessorNumber {
        private final Function<T, Number> getterFunc;
        private final BiConsumer<T, Number> setterFunc;

        public FunctionAccessorNumber(String str, Function<T, Number> function, BiConsumer<T, Number> biConsumer) {
            super(str, Number.class, Number.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public Number getNumber(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public void setNumber(Object obj, Number number) {
            try {
                this.setterFunc.accept(obj, number);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorObject<T, V> extends FunctionAccessor implements PropertyAccessorObject {
        private final Function<T, V> getterFunc;
        private final BiConsumer<T, V> setterFunc;

        public FunctionAccessorObject(String str, Type type, Class<?> cls, Function<T, V> function, BiConsumer<T, V> biConsumer) {
            super(str, type, cls, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public Object getObject(Object obj) {
            return this.getterFunc.apply(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setObject(Object obj, Object obj2) {
            try {
                this.setterFunc.accept(obj, obj2);
            } catch (Exception e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorShort<T> extends FunctionAccessor<T> implements PropertyAccessorShort {
        private final Function<T, Short> getterFunc;
        private final BiConsumer<T, Short> setterFunc;

        public FunctionAccessorShort(String str, Function<T, Short> function, BiConsumer<T, Short> biConsumer) {
            super(str, Short.class, Short.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public Short getShort(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public void setShort(Object obj, Short sh) {
            try {
                this.setterFunc.accept(obj, sh);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorShortValue<T> extends FunctionAccessor<T> implements PropertyAccessorShortValue {
        private final ToShortFunction<T> getterFunc;
        private final ObjShortConsumer<T> setterFunc;

        /* JADX WARN: Illegal instructions before constructor call */
        public FunctionAccessorShortValue(String str, ToShortFunction<T> toShortFunction, ObjShortConsumer<T> objShortConsumer) {
            Class cls = Short.TYPE;
            super(str, cls, cls, toShortFunction, objShortConsumer);
            this.getterFunc = toShortFunction;
            this.setterFunc = objShortConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public short getShortValue(Object obj) {
            return this.getterFunc.applyAsShort(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setShortValue(Object obj, short s) {
            this.setterFunc.accept(obj, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FunctionAccessorString<T> extends FunctionAccessor<T> implements PropertyAccessorString {
        private final Function<T, String> getterFunc;
        private final BiConsumer<T, String> setterFunc;

        public FunctionAccessorString(String str, Function<T, String> function, BiConsumer<T, String> biConsumer) {
            super(str, String.class, String.class, function, biConsumer);
            this.getterFunc = function;
            this.setterFunc = biConsumer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public String getString(Object obj) {
            try {
                return this.getterFunc.apply(obj);
            } catch (Throwable th) {
                throw errorForGet(th);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public void setString(Object obj, String str) {
            try {
                this.setterFunc.accept(obj, str);
            } catch (Throwable th) {
                throw errorForSet(th);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorBigDecimal extends MethodAccessor implements PropertyAccessorBigDecimal {
        public MethodAccessorBigDecimal(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public BigDecimal getBigDecimal(Object obj) {
            try {
                return (BigDecimal) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public void setBigDecimal(Object obj, BigDecimal bigDecimal) {
            try {
                this.setter.invoke(obj, bigDecimal);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorBigInteger extends MethodAccessor implements PropertyAccessorBigInteger {
        public MethodAccessorBigInteger(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public BigInteger getBigInteger(Object obj) {
            try {
                return (BigInteger) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public void setBigInteger(Object obj, BigInteger bigInteger) {
            try {
                this.setter.invoke(obj, bigInteger);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorBoolean extends MethodAccessor implements PropertyAccessorBoolean {
        public MethodAccessorBoolean(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public Boolean getBoolean(Object obj) {
            try {
                return (Boolean) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public void setBoolean(Object obj, Boolean bool) {
            try {
                this.setter.invoke(obj, bool);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorBooleanValue extends MethodAccessor implements PropertyAccessorBooleanValue {
        public MethodAccessorBooleanValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public boolean getBooleanValue(Object obj) {
            try {
                return ((Boolean) this.getter.invoke(obj, null)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setBooleanValue(Object obj, boolean z) {
            try {
                this.setter.invoke(obj, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorByte extends MethodAccessor implements PropertyAccessorByte {
        public MethodAccessorByte(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public Byte getByte(Object obj) {
            try {
                return (Byte) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public void setByte(Object obj, Byte b) {
            try {
                this.setter.invoke(obj, b);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorByteValue extends MethodAccessor implements PropertyAccessorByteValue {
        public MethodAccessorByteValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public byte getByteValue(Object obj) {
            try {
                return ((Byte) this.getter.invoke(obj, null)).byteValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setByteValue(Object obj, byte b) {
            try {
                this.setter.invoke(obj, Byte.valueOf(b));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorCharValue extends MethodAccessor implements PropertyAccessorCharValue {
        public MethodAccessorCharValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public char getCharValue(Object obj) {
            try {
                return ((Character) this.getter.invoke(obj, null)).charValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setCharValue(Object obj, char c) {
            try {
                this.setter.invoke(obj, Character.valueOf(c));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorCharacter extends MethodAccessor implements PropertyAccessorCharacter {
        public MethodAccessorCharacter(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public Character getCharacter(Object obj) {
            try {
                return (Character) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public void setCharacter(Object obj, Character ch) {
            try {
                this.setter.invoke(obj, ch);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorDouble extends MethodAccessor implements PropertyAccessorDouble {
        public MethodAccessorDouble(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public Double getDouble(Object obj) {
            try {
                return (Double) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public void setDouble(Object obj, Double d) {
            try {
                this.setter.invoke(obj, d);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorDoubleValue extends MethodAccessor implements PropertyAccessorDoubleValue {
        public MethodAccessorDoubleValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public double getDoubleValue(Object obj) {
            try {
                return ((Double) this.getter.invoke(obj, null)).doubleValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setDoubleValue(Object obj, double d) {
            try {
                this.setter.invoke(obj, Double.valueOf(d));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorFloat extends MethodAccessor implements PropertyAccessorFloat {
        public MethodAccessorFloat(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public Float getFloat(Object obj) {
            try {
                return (Float) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public void setFloat(Object obj, Float f) {
            try {
                this.setter.invoke(obj, f);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorFloatValue extends MethodAccessor implements PropertyAccessorFloatValue {
        public MethodAccessorFloatValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public float getFloatValue(Object obj) {
            try {
                return ((Float) this.getter.invoke(obj, null)).floatValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setFloatValue(Object obj, float f) {
            try {
                this.setter.invoke(obj, Float.valueOf(f));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorIntValue extends MethodAccessor implements PropertyAccessorIntValue {
        public MethodAccessorIntValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public int getIntValue(Object obj) {
            try {
                return ((Integer) this.getter.invoke(obj, null)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setIntValue(Object obj, int i) {
            try {
                this.setter.invoke(obj, Integer.valueOf(i));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorInteger extends MethodAccessor implements PropertyAccessorInteger {
        public MethodAccessorInteger(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public Integer getInteger(Object obj) {
            try {
                return (Integer) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public void setInteger(Object obj, Integer num) {
            try {
                this.setter.invoke(obj, num);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorLong extends MethodAccessor implements PropertyAccessorLong {
        public MethodAccessorLong(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public Long getLong(Object obj) {
            try {
                return (Long) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public void setLong(Object obj, Long l) {
            try {
                this.setter.invoke(obj, l);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorLongValue extends MethodAccessor implements PropertyAccessorLongValue {
        public MethodAccessorLongValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public long getLongValue(Object obj) {
            try {
                return ((Long) this.getter.invoke(obj, null)).longValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setLongValue(Object obj, long j) {
            try {
                this.setter.invoke(obj, Long.valueOf(j));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorNumber extends MethodAccessor implements PropertyAccessorNumber {
        public MethodAccessorNumber(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public Number getNumber(Object obj) {
            try {
                return (Number) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public void setNumber(Object obj, Number number) {
            try {
                this.setter.invoke(obj, number);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorObject extends MethodAccessor implements PropertyAccessorObject {
        public MethodAccessorObject(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public Object getObject(Object obj) {
            try {
                return this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setObject(Object obj, Object obj2) {
            try {
                this.setter.invoke(obj, obj2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorShort extends MethodAccessor implements PropertyAccessorShort {
        public MethodAccessorShort(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public Short getShort(Object obj) {
            try {
                return (Short) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public void setShort(Object obj, Short sh) {
            try {
                this.setter.invoke(obj, sh);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorShortValue extends MethodAccessor implements PropertyAccessorShortValue {
        public MethodAccessorShortValue(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public short getShortValue(Object obj) {
            try {
                return ((Short) this.getter.invoke(obj, null)).shortValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setShortValue(Object obj, short s) {
            try {
                this.setter.invoke(obj, Short.valueOf(s));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MethodAccessorString extends MethodAccessor implements PropertyAccessorString {
        public MethodAccessorString(String str, Type type, Class<?> cls, Method method, Method method2) {
            super(str, type, cls, method, method2);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public String getString(Object obj) {
            try {
                return (String) this.getter.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForGet(e);
            }
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public void setString(Object obj, String str) {
            try {
                this.setter.invoke(obj, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw errorForSet(e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorBigDecimal extends PropertyAccessorObject {
        BigDecimal getBigDecimal(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getBigDecimal(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getBigDecimal(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getBigDecimal(obj));
        }

        void setBigDecimal(Object obj, BigDecimal bigDecimal);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setBigDecimal(obj, Cast.toBigDecimal(obj2));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorBigInteger extends PropertyAccessorObject {
        BigInteger getBigInteger(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getBigInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getBigInteger(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getBigInteger(obj));
        }

        void setBigInteger(Object obj, BigInteger bigInteger);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setBigInteger(obj, Cast.toBigInteger(obj2));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorBoolean extends PropertyAccessorObject {
        Boolean getBoolean(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getBoolean(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getBoolean(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getBoolean(obj));
        }

        void setBoolean(Object obj, Boolean bool);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setBoolean(obj, Cast.toBoolean(obj2));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorBooleanValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(Boolean.valueOf(getBooleanValue(obj)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Boolean.valueOf(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getBooleanValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setBooleanValue(obj, Cast.toBooleanValue(b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setBooleanValue(obj, Cast.toBooleanValue(c));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setBooleanValue(obj, Cast.toBooleanValue(d));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setBooleanValue(obj, Cast.toBooleanValue(f));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setBooleanValue(obj, Cast.toBooleanValue(i));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setBooleanValue(obj, Cast.toBooleanValue(j));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setBooleanValue(obj, Cast.toBooleanValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setBooleanValue(obj, Cast.toBooleanValue(s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorByte extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getByte(obj));
        }

        Byte getByte(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getByte(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getByte(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setByte(obj, Cast.toByte(Boolean.valueOf(z)));
        }

        void setByte(Object obj, Byte b);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setByte(obj, Byte.valueOf(b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setByte(obj, Cast.toByte(Character.valueOf(c)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setByte(obj, Cast.toByte(Double.valueOf(d)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setByte(obj, Cast.toByte(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setByte(obj, Cast.toByte(Integer.valueOf(i)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setByte(obj, Cast.toByte(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setByte(obj, Cast.toByte(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setByte(obj, Cast.toByte(Short.valueOf(s)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorByteValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue((int) getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Byte.valueOf(getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue((int) getByteValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setByteValue(obj, Cast.toByteValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setByteValue(obj, (byte) c);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setByteValue(obj, (byte) d);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setByteValue(obj, (byte) f);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setByteValue(obj, (byte) i);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setByteValue(obj, (byte) j);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setByteValue(obj, Cast.toByteValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setByteValue(obj, (byte) s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorCharValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Character.valueOf(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getCharValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setCharValue(obj, Cast.toCharValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setCharValue(obj, Cast.toCharValue(b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setCharValue(obj, Cast.toCharValue(d));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setCharValue(obj, Cast.toCharValue(f));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setCharValue(obj, Cast.toCharValue(i));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setCharValue(obj, Cast.toCharValue(j));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setCharValue(obj, Cast.toCharValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setCharValue(obj, Cast.toCharValue(s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorCharacter extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getCharacter(obj));
        }

        Character getCharacter(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getCharacter(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getCharacter(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setCharacter(obj, Cast.toCharacter(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setCharacter(obj, Cast.toCharacter(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setCharacter(obj, Character.valueOf(c));
        }

        void setCharacter(Object obj, Character ch);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setCharacter(obj, Cast.toCharacter(Double.valueOf(d)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setCharacter(obj, Cast.toCharacter(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setCharacter(obj, Cast.toCharacter(Integer.valueOf(i)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setCharacter(obj, Cast.toCharacter(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setCharacter(obj, Cast.toCharacter(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setCharacter(obj, Cast.toCharacter(Short.valueOf(s)));
        }

        default void setString(Object obj, String str) {
            setCharacter(obj, Cast.toCharacter(str));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorDouble extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getDouble(obj));
        }

        Double getDouble(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getDouble(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getDouble(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setDouble(obj, Cast.toDouble(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setDouble(obj, Cast.toDouble(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setDouble(obj, Cast.toDouble(Character.valueOf(c)));
        }

        void setDouble(Object obj, Double d);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setDouble(obj, Double.valueOf(d));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setDouble(obj, Cast.toDouble(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setDouble(obj, Cast.toDouble(Integer.valueOf(i)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setDouble(obj, Cast.toDouble(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setDouble(obj, Cast.toDouble(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setDouble(obj, Cast.toDouble(Short.valueOf(s)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorDoubleValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Double.valueOf(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getDoubleValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setDoubleValue(obj, Cast.toDoubleValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setDoubleValue(obj, Cast.toDoubleValue((int) b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setDoubleValue(obj, Cast.toDoubleValue(c));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setDoubleValue(obj, f);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setDoubleValue(obj, Cast.toDoubleValue(i));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setDoubleValue(obj, Cast.toDoubleValue(j));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setDoubleValue(obj, Cast.toDoubleValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setDoubleValue(obj, Cast.toDoubleValue((int) s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorFloat extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getFloat(obj));
        }

        Float getFloat(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getFloat(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getFloat(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setFloat(obj, Cast.toFloat(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setFloat(obj, Cast.toFloat(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setFloat(obj, Cast.toFloat(Character.valueOf(c)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setFloat(obj, Cast.toFloat(Double.valueOf(d)));
        }

        void setFloat(Object obj, Float f);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setFloat(obj, Float.valueOf(f));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setFloat(obj, Cast.toFloat(Integer.valueOf(i)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setFloat(obj, Cast.toFloat(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setFloat(obj, Cast.toFloat(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setFloat(obj, Cast.toFloat(Short.valueOf(s)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorFloatValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(Float.valueOf(getFloatValue(obj)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Float.valueOf(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getFloatValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setFloatValue(obj, Cast.toFloatValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setFloatValue(obj, b);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setFloatValue(obj, c);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setFloatValue(obj, (float) d);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setFloatValue(obj, i);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setFloatValue(obj, j);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setFloatValue(obj, Cast.toFloatValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setFloatValue(obj, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorIntValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Integer.valueOf(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getIntValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setIntValue(obj, Cast.toIntValue(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setIntValue(obj, b);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setIntValue(obj, c);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setIntValue(obj, (int) d);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setIntValue(obj, (int) f);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setIntValue(obj, (int) j);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setIntValue(obj, Cast.toIntValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setIntValue(obj, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorInteger extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getInteger(obj));
        }

        Integer getInteger(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getInteger(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getInteger(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setInteger(obj, Cast.toInteger(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setInteger(obj, Cast.toInteger(Character.valueOf(c)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setInteger(obj, Cast.toInteger(Double.valueOf(d)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setInteger(obj, Cast.toInteger(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setInteger(obj, Integer.valueOf(i));
        }

        void setInteger(Object obj, Integer num);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setInteger(obj, Cast.toInteger(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setInteger(obj, Cast.toInteger(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setInteger(obj, Cast.toInteger(Short.valueOf(s)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorLong extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getLong(obj));
        }

        Long getLong(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getLong(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getLong(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setLong(obj, Cast.toLong(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setLong(obj, Cast.toLong(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setLong(obj, Cast.toLong(Character.valueOf(c)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setLong(obj, Cast.toLong(Double.valueOf(d)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setLong(obj, Cast.toLong(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setLong(obj, Cast.toLong(Integer.valueOf(i)));
        }

        void setLong(Object obj, Long l);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setLong(obj, Long.valueOf(j));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setLong(obj, Cast.toLong(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setLong(obj, Cast.toLong(Short.valueOf(s)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorLongValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Long.valueOf(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getLongValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setLongValue(obj, Cast.toLongValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setLongValue(obj, b);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setLongValue(obj, c);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setLongValue(obj, (long) d);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setLongValue(obj, (long) f);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setLongValue(obj, i);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setLongValue(obj, Cast.toLongValue(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setLongValue(obj, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorNumber extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getNumber(obj));
        }

        Number getNumber(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getNumber(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getNumber(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setNumber(obj, Cast.toNumber(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setNumber(obj, Cast.toNumber(b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setNumber(obj, Cast.toNumber(c));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setNumber(obj, Double.valueOf(d));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setNumber(obj, Cast.toNumber(f));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setNumber(obj, Cast.toNumber(i));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setNumber(obj, Cast.toNumber(j));
        }

        void setNumber(Object obj, Number number);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setNumber(obj, Cast.toNumber(obj2));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setNumber(obj, Cast.toNumber(s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorObject extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getObject(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setObject(obj, Boolean.valueOf(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setObject(obj, Byte.valueOf(b));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setObject(obj, Character.valueOf(c));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setObject(obj, Double.valueOf(d));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setObject(obj, Float.valueOf(f));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setObject(obj, Integer.valueOf(i));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setObject(obj, Long.valueOf(j));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setObject(obj, Short.valueOf(s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorShort extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getShort(obj);
        }

        Short getShort(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getShort(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setShort(obj, Cast.toShort(Boolean.valueOf(z)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setShort(obj, Cast.toShort(Byte.valueOf(b)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setShort(obj, Cast.toShort(Character.valueOf(c)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setShort(obj, Cast.toShort(Double.valueOf(d)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setShort(obj, Cast.toShort(Float.valueOf(f)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setShort(obj, Cast.toShort(Integer.valueOf(i)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setShort(obj, Cast.toShort(Long.valueOf(j)));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setShort(obj, Cast.toShort(obj2));
        }

        void setShort(Object obj, Short sh);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setShortValue(Object obj, short s) {
            setShort(obj, Short.valueOf(s));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorShortValue extends PropertyAccessor {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue((int) getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return Short.valueOf(getShortValue(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setBooleanValue(Object obj, boolean z) {
            setShortValue(obj, Cast.toShortValue(z));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setByteValue(Object obj, byte b) {
            setShortValue(obj, b);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setCharValue(Object obj, char c) {
            setShortValue(obj, (short) c);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setDoubleValue(Object obj, double d) {
            setShortValue(obj, (short) d);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setFloatValue(Object obj, float f) {
            setShortValue(obj, (short) f);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setIntValue(Object obj, int i) {
            setShortValue(obj, (short) i);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setLongValue(Object obj, long j) {
            setShortValue(obj, (short) j);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setShortValue(obj, Cast.toShortValue(obj2));
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface PropertyAccessorString extends PropertyAccessorObject {
        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default boolean getBooleanValue(Object obj) {
            return Cast.toBooleanValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default byte getByteValue(Object obj) {
            return Cast.toByteValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default char getCharValue(Object obj) {
            return Cast.toCharValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default double getDoubleValue(Object obj) {
            return Cast.toDoubleValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default float getFloatValue(Object obj) {
            return Cast.toFloatValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default int getIntValue(Object obj) {
            return Cast.toIntValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default long getLongValue(Object obj) {
            return Cast.toLongValue(getString(obj));
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default Object getObject(Object obj) {
            return getString(obj);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorObject, com.alibaba.fastjson2.introspect.PropertyAccessor
        default short getShortValue(Object obj) {
            return Cast.toShortValue(getString(obj));
        }

        String getString(Object obj);

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        default void setObject(Object obj, Object obj2) {
            setString(obj, Cast.toString(obj2));
        }

        void setString(Object obj, String str);
    }

    /* JADX INFO: compiled from: obf */
    public static abstract class PropertyAccessorWrapper implements PropertyAccessor {
        final PropertyAccessor impl;

        public PropertyAccessorWrapper(PropertyAccessor propertyAccessor) {
            this.impl = propertyAccessor;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public final String name() {
            return this.impl.name();
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public final Class<?> propertyClass() {
            return this.impl.propertyClass();
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public final Type propertyType() {
            return this.impl.propertyType();
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public final boolean supportGet() {
            return this.impl.supportGet();
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public final boolean supportSet() {
            return this.impl.supportSet();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperBigDecimal extends PropertyAccessorWrapper implements PropertyAccessorBigDecimal {
        private PropertyAccessorBigDecimal bigDecimalImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperBigDecimal(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.bigDecimalImpl = (PropertyAccessorBigDecimal) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public BigDecimal getBigDecimal(Object obj) {
            BigDecimal bigDecimal = this.bigDecimalImpl.getBigDecimal(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bigDecimal);
            }
            return bigDecimal;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public void setBigDecimal(Object obj, BigDecimal bigDecimal) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bigDecimal);
            }
            this.bigDecimalImpl.setBigDecimal(obj, bigDecimal);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperBigInteger extends PropertyAccessorWrapper implements PropertyAccessorBigInteger {
        private PropertyAccessorBigInteger bigIntegerImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperBigInteger(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.bigIntegerImpl = (PropertyAccessorBigInteger) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public BigInteger getBigInteger(Object obj) {
            BigInteger bigInteger = this.bigIntegerImpl.getBigInteger(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bigInteger);
            }
            return bigInteger;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public void setBigInteger(Object obj, BigInteger bigInteger) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bigInteger);
            }
            this.bigIntegerImpl.setBigInteger(obj, bigInteger);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperBoolean extends PropertyAccessorWrapper implements PropertyAccessorBoolean {
        private PropertyAccessorBoolean booleanImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperBoolean(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.booleanImpl = (PropertyAccessorBoolean) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public Boolean getBoolean(Object obj) {
            Boolean bool = this.booleanImpl.getBoolean(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bool);
            }
            return bool;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public void setBoolean(Object obj, Boolean bool) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, bool);
            }
            this.booleanImpl.setBoolean(obj, bool);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperBooleanValue extends PropertyAccessorWrapper implements PropertyAccessorBooleanValue {
        private final ObjBoolConsumer getterConsumer;
        private final ObjBoolConsumer setterConsumer;

        public PropertyAccessorWrapperBooleanValue(PropertyAccessor propertyAccessor, ObjBoolConsumer objBoolConsumer, ObjBoolConsumer objBoolConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objBoolConsumer;
            this.setterConsumer = objBoolConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public boolean getBooleanValue(Object obj) {
            boolean booleanValue = this.impl.getBooleanValue(obj);
            ObjBoolConsumer objBoolConsumer = this.getterConsumer;
            if (objBoolConsumer != null) {
                objBoolConsumer.accept(obj, booleanValue);
            }
            return booleanValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setBooleanValue(Object obj, boolean z) {
            ObjBoolConsumer objBoolConsumer = this.setterConsumer;
            if (objBoolConsumer != null) {
                objBoolConsumer.accept(obj, z);
            }
            this.impl.setBooleanValue(obj, z);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperByte extends PropertyAccessorWrapper implements PropertyAccessorByte {
        private PropertyAccessorByte byteImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperByte(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.byteImpl = (PropertyAccessorByte) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public Byte getByte(Object obj) {
            Byte b = this.byteImpl.getByte(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, b);
            }
            return b;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public void setByte(Object obj, Byte b) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, b);
            }
            this.byteImpl.setByte(obj, b);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperByteValue extends PropertyAccessorWrapper implements PropertyAccessorByteValue {
        private final ObjByteConsumer getterConsumer;
        private final ObjByteConsumer setterConsumer;

        public PropertyAccessorWrapperByteValue(PropertyAccessor propertyAccessor, ObjByteConsumer objByteConsumer, ObjByteConsumer objByteConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objByteConsumer;
            this.setterConsumer = objByteConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public byte getByteValue(Object obj) {
            byte byteValue = this.impl.getByteValue(obj);
            ObjByteConsumer objByteConsumer = this.getterConsumer;
            if (objByteConsumer != null) {
                objByteConsumer.accept(obj, byteValue);
            }
            return byteValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setByteValue(Object obj, byte b) {
            ObjByteConsumer objByteConsumer = this.setterConsumer;
            if (objByteConsumer != null) {
                objByteConsumer.accept(obj, b);
            }
            this.impl.setByteValue(obj, b);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperCharValue extends PropertyAccessorWrapper implements PropertyAccessorCharValue {
        private final ObjCharConsumer getterConsumer;
        private final ObjCharConsumer setterConsumer;

        public PropertyAccessorWrapperCharValue(PropertyAccessor propertyAccessor, ObjCharConsumer objCharConsumer, ObjCharConsumer objCharConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objCharConsumer;
            this.setterConsumer = objCharConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public char getCharValue(Object obj) {
            char charValue = this.impl.getCharValue(obj);
            ObjCharConsumer objCharConsumer = this.getterConsumer;
            if (objCharConsumer != null) {
                objCharConsumer.accept(obj, charValue);
            }
            return charValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setCharValue(Object obj, char c) {
            ObjCharConsumer objCharConsumer = this.setterConsumer;
            if (objCharConsumer != null) {
                objCharConsumer.accept(obj, c);
            }
            this.impl.setCharValue(obj, c);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperCharacter extends PropertyAccessorWrapper implements PropertyAccessorCharacter {
        private PropertyAccessorCharacter characterImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperCharacter(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.characterImpl = (PropertyAccessorCharacter) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public Character getCharacter(Object obj) {
            Character character = this.characterImpl.getCharacter(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, character);
            }
            return character;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public void setCharacter(Object obj, Character ch) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, ch);
            }
            this.characterImpl.setCharacter(obj, ch);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperDouble extends PropertyAccessorWrapper implements PropertyAccessorDouble {
        private PropertyAccessorDouble doubleImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperDouble(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.doubleImpl = (PropertyAccessorDouble) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public Double getDouble(Object obj) {
            Double d = this.doubleImpl.getDouble(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, d);
            }
            return d;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public void setDouble(Object obj, Double d) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, d);
            }
            this.doubleImpl.setDouble(obj, d);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperDoubleValue extends PropertyAccessorWrapper implements PropertyAccessorDoubleValue {
        private final ObjDoubleConsumer getterConsumer;
        private final ObjDoubleConsumer setterConsumer;

        public PropertyAccessorWrapperDoubleValue(PropertyAccessor propertyAccessor, ObjDoubleConsumer objDoubleConsumer, ObjDoubleConsumer objDoubleConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objDoubleConsumer;
            this.setterConsumer = objDoubleConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public double getDoubleValue(Object obj) {
            double doubleValue = this.impl.getDoubleValue(obj);
            ObjDoubleConsumer objDoubleConsumer = this.getterConsumer;
            if (objDoubleConsumer != null) {
                objDoubleConsumer.accept(obj, doubleValue);
            }
            return doubleValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setDoubleValue(Object obj, double d) {
            ObjDoubleConsumer objDoubleConsumer = this.setterConsumer;
            if (objDoubleConsumer != null) {
                objDoubleConsumer.accept(obj, d);
            }
            this.impl.setDoubleValue(obj, d);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperFloat extends PropertyAccessorWrapper implements PropertyAccessorFloat {
        private PropertyAccessorFloat floatImpl;
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperFloat(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.floatImpl = (PropertyAccessorFloat) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public Float getFloat(Object obj) {
            Float f = this.floatImpl.getFloat(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, f);
            }
            return f;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public void setFloat(Object obj, Float f) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, f);
            }
            this.floatImpl.setFloat(obj, f);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperFloatValue extends PropertyAccessorWrapper implements PropertyAccessorFloatValue {
        private final ObjFloatConsumer getterConsumer;
        private final ObjFloatConsumer setterConsumer;

        public PropertyAccessorWrapperFloatValue(PropertyAccessor propertyAccessor, ObjFloatConsumer objFloatConsumer, ObjFloatConsumer objFloatConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objFloatConsumer;
            this.setterConsumer = objFloatConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public float getFloatValue(Object obj) {
            float floatValue = this.impl.getFloatValue(obj);
            ObjFloatConsumer objFloatConsumer = this.getterConsumer;
            if (objFloatConsumer != null) {
                objFloatConsumer.accept(obj, floatValue);
            }
            return floatValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setFloatValue(Object obj, float f) {
            ObjFloatConsumer objFloatConsumer = this.setterConsumer;
            if (objFloatConsumer != null) {
                objFloatConsumer.accept(obj, f);
            }
            this.impl.setFloatValue(obj, f);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperIntValue extends PropertyAccessorWrapper implements PropertyAccessorIntValue {
        private final ObjIntConsumer getterConsumer;
        private final ObjIntConsumer setterConsumer;

        public PropertyAccessorWrapperIntValue(PropertyAccessor propertyAccessor, ObjIntConsumer objIntConsumer, ObjIntConsumer objIntConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objIntConsumer;
            this.setterConsumer = objIntConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public int getIntValue(Object obj) {
            int intValue = this.impl.getIntValue(obj);
            ObjIntConsumer objIntConsumer = this.getterConsumer;
            if (objIntConsumer != null) {
                objIntConsumer.accept(obj, intValue);
            }
            return intValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setIntValue(Object obj, int i) {
            ObjIntConsumer objIntConsumer = this.setterConsumer;
            if (objIntConsumer != null) {
                objIntConsumer.accept(obj, i);
            }
            this.impl.setIntValue(obj, i);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperInteger extends PropertyAccessorWrapper implements PropertyAccessorInteger {
        private final BiConsumer getterConsumer;
        private PropertyAccessorInteger integerImpl;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperInteger(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.integerImpl = (PropertyAccessorInteger) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public Integer getInteger(Object obj) {
            Integer integer = this.integerImpl.getInteger(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, integer);
            }
            return integer;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public void setInteger(Object obj, Integer num) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, num);
            }
            this.integerImpl.setInteger(obj, num);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperLong extends PropertyAccessorWrapper implements PropertyAccessorLong {
        private final BiConsumer getterConsumer;
        private PropertyAccessorLong longImpl;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperLong(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.longImpl = (PropertyAccessorLong) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public Long getLong(Object obj) {
            Long l = this.longImpl.getLong(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, l);
            }
            return l;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public void setLong(Object obj, Long l) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, l);
            }
            this.longImpl.setLong(obj, l);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperLongValue extends PropertyAccessorWrapper implements PropertyAccessorLongValue {
        private final ObjLongConsumer getterConsumer;
        private final ObjLongConsumer setterConsumer;

        public PropertyAccessorWrapperLongValue(PropertyAccessor propertyAccessor, ObjLongConsumer objLongConsumer, ObjLongConsumer objLongConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objLongConsumer;
            this.setterConsumer = objLongConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public long getLongValue(Object obj) {
            long longValue = this.impl.getLongValue(obj);
            ObjLongConsumer objLongConsumer = this.getterConsumer;
            if (objLongConsumer != null) {
                objLongConsumer.accept(obj, longValue);
            }
            return longValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setLongValue(Object obj, long j) {
            ObjLongConsumer objLongConsumer = this.setterConsumer;
            if (objLongConsumer != null) {
                objLongConsumer.accept(obj, j);
            }
            this.impl.setLongValue(obj, j);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperNumber extends PropertyAccessorWrapper implements PropertyAccessorNumber {
        private final BiConsumer getterConsumer;
        private PropertyAccessorNumber numberImpl;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperNumber(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.numberImpl = (PropertyAccessorNumber) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public Number getNumber(Object obj) {
            Number number = this.numberImpl.getNumber(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, number);
            }
            return number;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public void setNumber(Object obj, Number number) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, number);
            }
            this.numberImpl.setNumber(obj, number);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperObject extends PropertyAccessorWrapper implements PropertyAccessorObject {
        private final BiConsumer getterConsumer;
        private PropertyAccessorObject objImpl;
        private final BiConsumer setterConsumer;

        public PropertyAccessorWrapperObject(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.objImpl = (PropertyAccessorObject) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public Object getObject(Object obj) {
            Object object = this.objImpl.getObject(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, object);
            }
            return object;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setObject(Object obj, Object obj2) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, obj2);
            }
            this.objImpl.setObject(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperShort extends PropertyAccessorWrapper implements PropertyAccessorShort {
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;
        private PropertyAccessorShort shortImpl;

        public PropertyAccessorWrapperShort(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.shortImpl = (PropertyAccessorShort) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public Short getShort(Object obj) {
            Short sh = this.shortImpl.getShort(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, sh);
            }
            return sh;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public void setShort(Object obj, Short sh) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, sh);
            }
            this.shortImpl.setShort(obj, sh);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperShortValue extends PropertyAccessorWrapper implements PropertyAccessorShortValue {
        private final ObjShortConsumer getterConsumer;
        private final ObjShortConsumer setterConsumer;

        public PropertyAccessorWrapperShortValue(PropertyAccessor propertyAccessor, ObjShortConsumer objShortConsumer, ObjShortConsumer objShortConsumer2) {
            super(propertyAccessor);
            this.getterConsumer = objShortConsumer;
            this.setterConsumer = objShortConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public short getShortValue(Object obj) {
            short shortValue = this.impl.getShortValue(obj);
            ObjShortConsumer objShortConsumer = this.getterConsumer;
            if (objShortConsumer != null) {
                objShortConsumer.accept(obj, shortValue);
            }
            return shortValue;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setShortValue(Object obj, short s) {
            ObjShortConsumer objShortConsumer = this.setterConsumer;
            if (objShortConsumer != null) {
                objShortConsumer.accept(obj, s);
            }
            this.impl.setShortValue(obj, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PropertyAccessorWrapperString extends PropertyAccessorWrapper implements PropertyAccessorString {
        private final BiConsumer getterConsumer;
        private final BiConsumer setterConsumer;
        private PropertyAccessorString stringImpl;

        public PropertyAccessorWrapperString(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
            super(propertyAccessor);
            this.stringImpl = (PropertyAccessorString) propertyAccessor;
            this.getterConsumer = biConsumer;
            this.setterConsumer = biConsumer2;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public String getString(Object obj) {
            String string = this.stringImpl.getString(obj);
            BiConsumer biConsumer = this.getterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, string);
            }
            return string;
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public void setString(Object obj, String str) {
            BiConsumer biConsumer = this.setterConsumer;
            if (biConsumer != null) {
                biConsumer.accept(obj, str);
            }
            this.stringImpl.setString(obj, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$create$0(PropertyAccessor propertyAccessor, Throwable th) {
        return (RuntimeException) th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$create$1(PropertyAccessor propertyAccessor, Throwable th) {
        return (RuntimeException) th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$create$2(PropertyAccessor propertyAccessor, Throwable th) {
        return (RuntimeException) th;
    }

    public PropertyAccessor create(Field field) {
        return createInternal(field);
    }

    public BiFunction createBiFunction(Constructor constructor) {
        return new ConstructorBiFunction(constructor);
    }

    public DoubleFunction createDoubleFunction(Constructor constructor) {
        return new ConstructorDoubleFunction(constructor);
    }

    public Function createFunction(Constructor constructor) {
        return new ConstructorFunction(constructor);
    }

    public IntFunction createIntFunction(Constructor constructor) {
        return new ConstructorIntFunction(constructor);
    }

    public PropertyAccessor createInternal(Field field) {
        if (field.getType() == Byte.TYPE) {
            return new FieldAccessorReflectByteValue(field);
        }
        if (field.getType() == Short.TYPE) {
            return new FieldAccessorReflectShortValue(field);
        }
        if (field.getType() == Integer.TYPE) {
            return new FieldAccessorReflectIntValue(field);
        }
        if (field.getType() == Long.TYPE) {
            return new FieldAccessorReflectLongValue(field);
        }
        if (field.getType() == Float.TYPE) {
            return new FieldAccessorReflectFloatValue(field);
        }
        if (field.getType() == Double.TYPE) {
            return new FieldAccessorReflectDoubleValue(field);
        }
        if (field.getType() == Boolean.TYPE) {
            return new FieldAccessorReflectBooleanValue(field);
        }
        if (field.getType() == Character.TYPE) {
            return new FieldAccessorReflectCharValue(field);
        }
        if (field.getType() == String.class) {
            return new FieldAccessorReflectString(field);
        }
        if (field.getType() == BigInteger.class) {
            return new FieldAccessorReflectBigInteger(field);
        }
        if (field.getType() == BigDecimal.class) {
            return new FieldAccessorReflectBigDecimal(field);
        }
        if (field.getType() == Boolean.class) {
            return new FieldAccessorReflectBoolean(field);
        }
        if (field.getType() == Byte.class) {
            return new FieldAccessorReflectByte(field);
        }
        if (field.getType() == Character.class) {
            return new FieldAccessorReflectCharacter(field);
        }
        if (field.getType() == Short.class) {
            return new FieldAccessorReflectShort(field);
        }
        if (field.getType() == Integer.class) {
            return new FieldAccessorReflectInteger(field);
        }
        if (field.getType() == Long.class) {
            return new FieldAccessorReflectLong(field);
        }
        if (field.getType() == Float.class) {
            return new FieldAccessorReflectFloat(field);
        }
        if (field.getType() == Double.class) {
            return new FieldAccessorReflectDouble(field);
        }
        return field.getType() == Number.class ? new FieldAccessorReflectNumber(field) : new FieldAccessorReflectObject(field);
    }

    public LongFunction createLongFunction(Constructor constructor) {
        return new ConstructorLongFunction(constructor);
    }

    public Supplier createSupplier(Constructor constructor) {
        return new ConstructorSupplier(constructor);
    }

    public PropertyAccessor create(Method method) {
        return create(method, new C1311(4));
    }

    public PropertyAccessor create(Method method, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        String name = method.getName();
        if (method.getParameterCount() == 0) {
            return create(BeanUtils.getterName(name, (String) null), (Class<?>) null, (Type) null, method, (Method) null, biFunction);
        }
        return create(BeanUtils.setterName(name, (String) null), (Class<?>) null, (Type) null, (Method) null, method, biFunction);
    }

    public final PropertyAccessor create(String str, Class<?> cls, Type type, Method method, Method method2) {
        return create(str, cls, type, method, method2, new C1311(3));
    }

    public PropertyAccessor create(String str, Class<?> cls, Type type, Method method, Method method2, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        String str2;
        Class<?> cls2;
        Type type2;
        if (method != null) {
            if (method.getParameterCount() == 0) {
                if (str == null) {
                    str = BeanUtils.getterName(method.getName(), (String) null);
                }
                Class<?> returnType = method.getReturnType();
                if (cls == null) {
                    cls = returnType;
                } else if (!cls.equals(returnType)) {
                    throw new JSONException("create PropertyAccessor error, propertyClass not match");
                }
                Type genericReturnType = method.getGenericReturnType();
                if (type == null) {
                    type = genericReturnType;
                } else if (!type.equals(type)) {
                    throw new JSONException("create PropertyAccessor error, propertyType not match");
                }
            } else {
                throw new JSONException("create PropertyAccessor error, method parameterCount is not 0");
            }
        }
        if (method2 == null) {
            str2 = str;
            cls2 = cls;
            type2 = type;
        } else if (method2.getParameterCount() == 1) {
            if (str == null) {
                str = BeanUtils.setterName(method2.getName(), (String) null);
            }
            Class<?>[] parameterTypes = method2.getParameterTypes();
            Type[] genericParameterTypes = method2.getGenericParameterTypes();
            Class<?> cls3 = parameterTypes[0];
            type2 = genericParameterTypes[0];
            if (cls == null) {
                cls = cls3;
            } else if (!cls.equals(cls3)) {
                throw new JSONException("create PropertyAccessor error, propertyClass not match");
            }
            if (type == null) {
                str2 = str;
                cls2 = cls;
            } else {
                if (!type.equals(type2)) {
                    throw new JSONException("create PropertyAccessor error, propertyType not match");
                }
                str2 = str;
                cls2 = cls;
                type2 = type;
            }
        } else {
            throw new JSONException("create PropertyAccessor error, method parameterCount is not 1");
        }
        if (cls2 != Void.TYPE && cls2 != Void.class) {
            if (cls2 == Byte.TYPE) {
                return new MethodAccessorByteValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Short.TYPE) {
                return new MethodAccessorShortValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Integer.TYPE) {
                return new MethodAccessorIntValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Long.TYPE) {
                return new MethodAccessorLongValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Float.TYPE) {
                return new MethodAccessorFloatValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Double.TYPE) {
                return new MethodAccessorDoubleValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Character.TYPE) {
                return new MethodAccessorCharValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == Boolean.TYPE) {
                return new MethodAccessorBooleanValue(str2, type2, cls2, method, method2);
            }
            if (cls2 == String.class) {
                return new MethodAccessorString(str2, type2, cls2, method, method2);
            }
            if (cls2 == BigInteger.class) {
                return new MethodAccessorBigInteger(str2, type2, cls2, method, method2);
            }
            if (cls2 == BigDecimal.class) {
                return new MethodAccessorBigDecimal(str2, type2, cls2, method, method2);
            }
            if (cls2 == Boolean.class) {
                return new MethodAccessorBoolean(str2, type2, cls2, method, method2);
            }
            if (cls2 == Byte.class) {
                return new MethodAccessorByte(str2, type2, cls2, method, method2);
            }
            if (cls2 == Character.class) {
                return new MethodAccessorCharacter(str2, type2, cls2, method, method2);
            }
            if (cls2 == Short.class) {
                return new MethodAccessorShort(str2, type2, cls2, method, method2);
            }
            if (cls2 == Integer.class) {
                return new MethodAccessorInteger(str2, type2, cls2, method, method2);
            }
            if (cls2 == Long.class) {
                return new MethodAccessorLong(str2, type2, cls2, method, method2);
            }
            if (cls2 == Float.class) {
                return new MethodAccessorFloat(str2, type2, cls2, method, method2);
            }
            if (cls2 == Double.class) {
                return new MethodAccessorDouble(str2, type2, cls2, method, method2);
            }
            if (cls2 == Number.class) {
                return new MethodAccessorNumber(str2, type2, cls2, method, method2);
            }
            return new MethodAccessorObject(str2, type2, cls2, method, method2);
        }
        throw new JSONException("create PropertyAccessor error, method returnType is void");
    }

    public <T> PropertyAccessor create(String str, ToByteFunction<T> toByteFunction, ObjByteConsumer<T> objByteConsumer) {
        return new FunctionAccessorByteValue(str, toByteFunction, objByteConsumer);
    }

    public <T> PropertyAccessor create(String str, ToShortFunction<T> toShortFunction, ObjShortConsumer<T> objShortConsumer) {
        return new FunctionAccessorShortValue(str, toShortFunction, objShortConsumer);
    }

    public <T> PropertyAccessor create(String str, ToIntFunction<T> toIntFunction, ObjIntConsumer<T> objIntConsumer) {
        return new FunctionAccessorIntValue(str, toIntFunction, objIntConsumer);
    }

    public <T> PropertyAccessor create(String str, ToLongFunction<T> toLongFunction, ObjLongConsumer<T> objLongConsumer) {
        return new FunctionAccessorLongValue(str, toLongFunction, objLongConsumer);
    }

    public <T> PropertyAccessor create(String str, ToFloatFunction<T> toFloatFunction, ObjFloatConsumer<T> objFloatConsumer) {
        return new FunctionAccessorFloatValue(str, toFloatFunction, objFloatConsumer);
    }

    public <T> PropertyAccessor create(String str, ToDoubleFunction<T> toDoubleFunction, ObjDoubleConsumer<T> objDoubleConsumer) {
        return new FunctionAccessorDoubleValue(str, toDoubleFunction, objDoubleConsumer);
    }

    public <T> PropertyAccessor create(String str, Predicate<T> predicate, ObjBoolConsumer<T> objBoolConsumer) {
        return new FunctionAccessorBooleanValue(str, predicate, objBoolConsumer);
    }

    public <T> PropertyAccessor create(String str, ToCharFunction<T> toCharFunction, ObjCharConsumer<T> objCharConsumer) {
        return new FunctionAccessorCharValue(str, toCharFunction, objCharConsumer);
    }

    public <T, V> PropertyAccessor create(String str, Class<?> cls, Type type, Function<T, V> function, BiConsumer<T, V> biConsumer) {
        return create(str, cls, type, function, biConsumer, new C1311(2));
    }

    public <T, V> PropertyAccessor create(String str, Class<?> cls, Type type, Function<T, V> function, BiConsumer<T, V> biConsumer, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        if (cls == String.class) {
            return new FunctionAccessorString(str, function, biConsumer);
        }
        if (cls == BigInteger.class) {
            return new FunctionAccessorBigInteger(str, function, biConsumer, biFunction);
        }
        if (cls == BigDecimal.class) {
            return new FunctionAccessorBigDecimal(str, function, biConsumer, biFunction);
        }
        if (cls == Boolean.class) {
            return new FunctionAccessorBoolean(str, function, biConsumer, biFunction);
        }
        if (cls == Byte.class) {
            return new FunctionAccessorByte(str, function, biConsumer);
        }
        if (cls == Character.class) {
            return new FunctionAccessorCharacter(str, function, biConsumer);
        }
        if (cls == Short.class) {
            return new FunctionAccessorShort(str, function, biConsumer);
        }
        if (cls == Integer.class) {
            return new FunctionAccessorInteger(str, function, biConsumer);
        }
        if (cls == Long.class) {
            return new FunctionAccessorLong(str, function, biConsumer);
        }
        if (cls == Float.class) {
            return new FunctionAccessorFloat(str, function, biConsumer);
        }
        if (cls == Double.class) {
            return new FunctionAccessorDouble(str, function, biConsumer);
        }
        if (cls == Number.class) {
            return new FunctionAccessorNumber(str, function, biConsumer);
        }
        return new FunctionAccessorObject(str, type, cls, function, biConsumer);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjBoolConsumer objBoolConsumer, ObjBoolConsumer objBoolConsumer2) {
        return new PropertyAccessorWrapperBooleanValue(propertyAccessor, objBoolConsumer, objBoolConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjByteConsumer objByteConsumer, ObjByteConsumer objByteConsumer2) {
        return new PropertyAccessorWrapperByteValue(propertyAccessor, objByteConsumer, objByteConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjCharConsumer objCharConsumer, ObjCharConsumer objCharConsumer2) {
        return new PropertyAccessorWrapperCharValue(propertyAccessor, objCharConsumer, objCharConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjShortConsumer objShortConsumer, ObjShortConsumer objShortConsumer2) {
        return new PropertyAccessorWrapperShortValue(propertyAccessor, objShortConsumer, objShortConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjIntConsumer objIntConsumer, ObjIntConsumer objIntConsumer2) {
        return new PropertyAccessorWrapperIntValue(propertyAccessor, objIntConsumer, objIntConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjLongConsumer objLongConsumer, ObjLongConsumer objLongConsumer2) {
        return new PropertyAccessorWrapperLongValue(propertyAccessor, objLongConsumer, objLongConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjFloatConsumer objFloatConsumer, ObjFloatConsumer objFloatConsumer2) {
        return new PropertyAccessorWrapperFloatValue(propertyAccessor, objFloatConsumer, objFloatConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, ObjDoubleConsumer objDoubleConsumer, ObjDoubleConsumer objDoubleConsumer2) {
        return new PropertyAccessorWrapperDoubleValue(propertyAccessor, objDoubleConsumer, objDoubleConsumer2);
    }

    public PropertyAccessor create(PropertyAccessor propertyAccessor, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Class<?> clsPropertyClass = propertyAccessor.propertyClass();
        if (clsPropertyClass == Boolean.class) {
            return new PropertyAccessorWrapperBoolean(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Byte.class) {
            return new PropertyAccessorWrapperByte(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Character.class) {
            return new PropertyAccessorWrapperCharacter(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Short.class) {
            return new PropertyAccessorWrapperShort(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Integer.class) {
            return new PropertyAccessorWrapperInteger(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Long.class) {
            return new PropertyAccessorWrapperLong(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Float.class) {
            return new PropertyAccessorWrapperFloat(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Double.class) {
            return new PropertyAccessorWrapperDouble(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == String.class) {
            return new PropertyAccessorWrapperString(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == BigInteger.class) {
            return new PropertyAccessorWrapperBigInteger(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == BigDecimal.class) {
            return new PropertyAccessorWrapperBigDecimal(propertyAccessor, biConsumer, biConsumer2);
        }
        if (clsPropertyClass == Number.class) {
            return new PropertyAccessorWrapperNumber(propertyAccessor, biConsumer, biConsumer2);
        }
        return new PropertyAccessorWrapperObject(propertyAccessor, biConsumer, biConsumer2);
    }
}
