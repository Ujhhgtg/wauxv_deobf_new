package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class PropertyAccessorFactoryUnsafe extends PropertyAccessorFactoryLambda {

    /* JADX INFO: compiled from: obf */
    public static abstract class FieldAccessorUnsafe extends FieldAccessor {
        final long fieldOffset;

        public FieldAccessorUnsafe(Field field) {
            super(field);
            this.fieldOffset = JDKUtils.UNSAFE.objectFieldOffset(field);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeBigDecimal extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorBigDecimal {
        public FieldAccessorUnsafeBigDecimal(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public BigDecimal getBigDecimal(Object obj) {
            return (BigDecimal) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigDecimal
        public void setBigDecimal(Object obj, BigDecimal bigDecimal) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, bigDecimal);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeBigInteger extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorBigInteger {
        public FieldAccessorUnsafeBigInteger(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public BigInteger getBigInteger(Object obj) {
            return (BigInteger) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBigInteger
        public void setBigInteger(Object obj, BigInteger bigInteger) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, bigInteger);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeBoolean extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorBoolean {
        public FieldAccessorUnsafeBoolean(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public Boolean getBoolean(Object obj) {
            return (Boolean) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorBoolean
        public void setBoolean(Object obj, Boolean bool) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, bool);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeBooleanValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorBooleanValue {
        public FieldAccessorUnsafeBooleanValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public boolean getBooleanValue(Object obj) {
            return JDKUtils.UNSAFE.getBoolean(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setBooleanValue(Object obj, boolean z) {
            JDKUtils.UNSAFE.putBoolean(obj, this.fieldOffset, z);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeByte extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorByte {
        public FieldAccessorUnsafeByte(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public Byte getByte(Object obj) {
            return (Byte) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorByte
        public void setByte(Object obj, Byte b) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, b);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeByteValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorByteValue {
        public FieldAccessorUnsafeByteValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public byte getByteValue(Object obj) {
            return JDKUtils.UNSAFE.getByte(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setByteValue(Object obj, byte b) {
            JDKUtils.UNSAFE.putByte(obj, this.fieldOffset, b);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeCharValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorCharValue {
        public FieldAccessorUnsafeCharValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public char getCharValue(Object obj) {
            return JDKUtils.UNSAFE.getChar(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setCharValue(Object obj, char c) {
            JDKUtils.UNSAFE.putChar(obj, this.fieldOffset, c);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeCharacter extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorCharacter {
        public FieldAccessorUnsafeCharacter(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public Character getCharacter(Object obj) {
            return (Character) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorCharacter
        public void setCharacter(Object obj, Character ch) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, ch);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeDouble extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorDouble {
        public FieldAccessorUnsafeDouble(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public Double getDouble(Object obj) {
            return (Double) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorDouble
        public void setDouble(Object obj, Double d) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, d);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeDoubleValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorDoubleValue {
        public FieldAccessorUnsafeDoubleValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public double getDoubleValue(Object obj) {
            return JDKUtils.UNSAFE.getDouble(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setDoubleValue(Object obj, double d) {
            JDKUtils.UNSAFE.putDouble(obj, this.fieldOffset, d);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeFloat extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorFloat {
        public FieldAccessorUnsafeFloat(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public Float getFloat(Object obj) {
            return (Float) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorFloat
        public void setFloat(Object obj, Float f) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, f);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeFloatValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorFloatValue {
        public FieldAccessorUnsafeFloatValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public float getFloatValue(Object obj) {
            return JDKUtils.UNSAFE.getFloat(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setFloatValue(Object obj, float f) {
            JDKUtils.UNSAFE.putFloat(obj, this.fieldOffset, f);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeIntValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorIntValue {
        public FieldAccessorUnsafeIntValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public int getIntValue(Object obj) {
            return JDKUtils.UNSAFE.getInt(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setIntValue(Object obj, int i) {
            JDKUtils.UNSAFE.putInt(obj, this.fieldOffset, i);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeInteger extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorInteger {
        public FieldAccessorUnsafeInteger(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public Integer getInteger(Object obj) {
            return (Integer) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorInteger
        public void setInteger(Object obj, Integer num) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, num);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeLong extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorLong {
        public FieldAccessorUnsafeLong(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public Long getLong(Object obj) {
            return (Long) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorLong
        public void setLong(Object obj, Long l) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, l);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeLongValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorLongValue {
        public FieldAccessorUnsafeLongValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public long getLongValue(Object obj) {
            return JDKUtils.UNSAFE.getLong(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setLongValue(Object obj, long j) {
            JDKUtils.UNSAFE.putLong(obj, this.fieldOffset, j);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeNumber extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorNumber {
        public FieldAccessorUnsafeNumber(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public Number getNumber(Object obj) {
            return (Number) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorNumber
        public void setNumber(Object obj, Number number) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, number);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeObject extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorObject {
        public FieldAccessorUnsafeObject(Field field) {
            super(field);
        }

        private Object typeCheck(Object obj) {
            if (obj == null || this.propertyClass.isAssignableFrom(obj.getClass())) {
                return obj;
            }
            throw typeCheckError(obj);
        }

        private JSONException typeCheckError(Object obj) {
            return new JSONException("set " + name() + " error, type not support " + obj.getClass());
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public Object getObject(Object obj) {
            return JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setObject(Object obj, Object obj2) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, typeCheck(obj2));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeShort extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorShort {
        public FieldAccessorUnsafeShort(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public Short getShort(Object obj) {
            return (Short) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorShort
        public void setShort(Object obj, Short sh) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, sh);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeShortValue extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorShortValue {
        public FieldAccessorUnsafeShortValue(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public short getShortValue(Object obj) {
            return JDKUtils.UNSAFE.getShort(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
        public void setShortValue(Object obj, short s) {
            JDKUtils.UNSAFE.putShort(obj, this.fieldOffset, s);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FieldAccessorUnsafeString extends FieldAccessorUnsafe implements PropertyAccessorFactory.PropertyAccessorString {
        public FieldAccessorUnsafeString(Field field) {
            super(field);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public String getString(Object obj) {
            return (String) JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        }

        @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory.PropertyAccessorString
        public void setString(Object obj, String str) {
            JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, str);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public PropertyAccessor createInternal(Field field) {
        Class<?> type = field.getType();
        if (type == Byte.TYPE) {
            return new FieldAccessorUnsafeByteValue(field);
        }
        if (type == Short.TYPE) {
            return new FieldAccessorUnsafeShortValue(field);
        }
        if (type == Integer.TYPE) {
            return new FieldAccessorUnsafeIntValue(field);
        }
        if (type == Long.TYPE) {
            return new FieldAccessorUnsafeLongValue(field);
        }
        if (type == Float.TYPE) {
            return new FieldAccessorUnsafeFloatValue(field);
        }
        if (type == Double.TYPE) {
            return new FieldAccessorUnsafeDoubleValue(field);
        }
        if (type == Boolean.TYPE) {
            return new FieldAccessorUnsafeBooleanValue(field);
        }
        if (type == Character.TYPE) {
            return new FieldAccessorUnsafeCharValue(field);
        }
        if (type == String.class) {
            return new FieldAccessorUnsafeString(field);
        }
        if (type == BigInteger.class) {
            return new FieldAccessorUnsafeBigInteger(field);
        }
        if (type == BigDecimal.class) {
            return new FieldAccessorUnsafeBigDecimal(field);
        }
        if (type == Boolean.class) {
            return new FieldAccessorUnsafeBoolean(field);
        }
        if (type == Byte.class) {
            return new FieldAccessorUnsafeByte(field);
        }
        if (type == Character.class) {
            return new FieldAccessorUnsafeCharacter(field);
        }
        if (type == Short.class) {
            return new FieldAccessorUnsafeShort(field);
        }
        if (type == Integer.class) {
            return new FieldAccessorUnsafeInteger(field);
        }
        if (type == Long.class) {
            return new FieldAccessorUnsafeLong(field);
        }
        if (type == Float.class) {
            return new FieldAccessorUnsafeFloat(field);
        }
        if (type == Double.class) {
            return new FieldAccessorUnsafeDouble(field);
        }
        return type == Number.class ? new FieldAccessorUnsafeNumber(field) : new FieldAccessorUnsafeObject(field);
    }
}
