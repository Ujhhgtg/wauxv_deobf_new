package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p000.AbstractC2201;
import p000.AbstractC2202;
import p000.AbstractC2784;
import p000.C1669;
import p000.C2257;
import p000.C3523;
import p000.C3524;
import p000.InterfaceC2335;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0008 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final List f514 = Arrays.asList(106, 107, Integer.valueOf(Opcodes.IDIV), Integer.valueOf(Opcodes.FNEG));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final List f515 = Arrays.asList(90, 91, 88, 89, 94, 95, 96, 97, 98, 99);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m370(Object obj, int i, Object obj2) throws C3523 {
        if (i == 94) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i == 99) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new C3523("illegal use of undefined variable, class, or 'void' literal");
        }
        int i2 = 0;
        Class cls = Integer.TYPE;
        if (i == 147) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new C2257(26))).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
            if (iCompare < 0) {
                i2 = -1;
            } else if (iCompare > 0) {
                i2 = 1;
            }
            return Primitive.wrap(Integer.valueOf(i2), (Class<?>) cls);
        }
        if (i == 106) {
            if ((obj instanceof String) || (obj2 instanceof String)) {
                return String.valueOf(obj).concat(String.valueOf(obj2)).intern();
            }
            if (obj.getClass().isArray() && (obj2 instanceof List)) {
                obj2 = ((List) obj2).toArray();
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                Class<?> cls2 = obj.getClass();
                Class<?> cls3 = obj2.getClass();
                if (AbstractC0010.m411(cls2) == AbstractC0010.m411(cls3)) {
                    Class clsM418 = AbstractC0010.m418(AbstractC0010.m412(cls2), AbstractC0010.m412(cls3));
                    int[] iArrM3967 = AbstractC2201.m3967(obj);
                    iArrM3967[0] = Array.getLength(obj2) + Array.getLength(obj);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM418, iArrM3967);
                    AbstractC2201.m3966(clsM418, objNewInstance, obj, obj2);
                    return objNewInstance;
                }
                throw new C3523("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + AbstractC2202.m4019(obj) + " with array of type " + AbstractC2202.m4019(obj2) + ".");
            }
            boolean z = obj instanceof List;
            if (z && obj2.getClass().isArray()) {
                obj2 = AbstractC0010.m414(0, List.class, obj2);
            }
            if (z && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
                linkedList.addAll(list2);
                return linkedList;
            }
        }
        if (i == 108) {
            if (obj.getClass().isArray()) {
                return AbstractC2201.m3984(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), obj);
            }
            if (obj2.getClass().isArray()) {
                return AbstractC2201.m3984(((Integer) Primitive.castWrapper(cls, obj)).intValue(), obj2);
            }
            if (obj instanceof List) {
                return AbstractC2201.m3985(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), (List) obj);
            }
            if (obj2 instanceof List) {
                return AbstractC2201.m3985(((Integer) Primitive.castWrapper(cls, obj)).intValue(), (List) obj2);
            }
            try {
                if (obj instanceof String) {
                    return new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern();
                }
                if (obj2 instanceof String) {
                    return new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern();
                }
            } catch (NegativeArraySizeException e) {
                throw new C3523("Negative repeat operand: " + e.getMessage(), e);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new C3523("Use of non + operator with String");
        }
        boolean zIsArray = obj.getClass().isArray();
        String[] strArr = InterfaceC2335.f7500;
        if (zIsArray || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new C3523(AbstractC2784.m4752(new StringBuilder("Use of invalid operator "), strArr[i], " with array or List type"));
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new C3523("illegal use of null value or 'null' literal");
        }
        throw new C3523(AbstractC2784.m4752(new StringBuilder("Operator: "), strArr[i], " inappropriate for objects"));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static BigDecimal m371(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) throws C3523 {
        switch (i) {
            case 106:
                return bigDecimal.add(bigDecimal2);
            case 107:
                return bigDecimal.subtract(bigDecimal2);
            case Opcodes.IDIV /* 108 */:
                return bigDecimal.multiply(bigDecimal2);
            case Opcodes.LDIV /* 109 */:
                return bigDecimal.divide(bigDecimal2);
            default:
                switch (i) {
                    case Opcodes.INEG /* 116 */:
                    case Opcodes.LNEG /* 117 */:
                        return bigDecimal.remainder(bigDecimal2);
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                        return bigDecimal.pow(bigDecimal2.intValue());
                    case 120:
                    case 121:
                    case 122:
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.IUSHR /* 124 */:
                    case Opcodes.LUSHR /* 125 */:
                        throw new C3523("Can't shift floatingpoint values");
                    default:
                        throw new C1669("Unimplemented binary float operator");
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static BigInteger m372(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        switch (i) {
            case 106:
                return bigInteger.add(bigInteger2);
            case 107:
                return bigInteger.subtract(bigInteger2);
            case Opcodes.IDIV /* 108 */:
                return bigInteger.multiply(bigInteger2);
            case Opcodes.LDIV /* 109 */:
                return bigInteger.divide(bigInteger2);
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return bigInteger.and(bigInteger2);
            case 112:
            case 113:
                return bigInteger.or(bigInteger2);
            case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
            case 115:
                return bigInteger.xor(bigInteger2);
            case Opcodes.INEG /* 116 */:
            case Opcodes.LNEG /* 117 */:
                return bigInteger.mod(bigInteger2);
            case Opcodes.FNEG /* 118 */:
            case Opcodes.DNEG /* 119 */:
                return bigInteger.pow(bigInteger2.intValue());
            case 120:
            case 121:
                return bigInteger.shiftLeft(bigInteger2.intValue());
            case 122:
            case Opcodes.LSHR /* 123 */:
                return bigInteger.shiftRight(bigInteger2.intValue());
            case Opcodes.IUSHR /* 124 */:
            case Opcodes.LUSHR /* 125 */:
                if (bigInteger.signum() >= 0) {
                    return bigInteger.shiftRight(bigInteger2.intValue());
                }
                BigInteger bigInteger3 = BigInteger.ONE;
                BigInteger bigIntegerShiftLeft = bigInteger3.shiftLeft(bigInteger.toString(2).length() + 1);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftLeft);
                return bigIntegerSubtract.shiftRight(bigInteger2.intValue()).and(bigIntegerShiftLeft.subtract(bigInteger3).shiftRight(bigInteger2.intValue() + 1));
            default:
                throw new C1669("Unimplemented binary integer operator");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Object m373(Object obj, int i, Object obj2) throws C3523 {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (AbstractC0010.m431(objUnwrap) && AbstractC0010.m431(objUnwrap2)) {
            Number numberM375 = m375(objUnwrap);
            Number numberM376 = m375(objUnwrap2);
            if (objUnwrap instanceof BigDecimal) {
                if (!(objUnwrap2 instanceof BigDecimal)) {
                    objUnwrap2 = Primitive.castNumber(BigDecimal.class, numberM376);
                }
            } else if (objUnwrap2 instanceof BigDecimal) {
                objUnwrap = Primitive.castNumber(BigDecimal.class, numberM375);
            } else if (AbstractC0010.m426(objUnwrap) || AbstractC0010.m426(objUnwrap2)) {
                if (!(objUnwrap instanceof Float) || !(objUnwrap2 instanceof Float)) {
                    if (!(objUnwrap instanceof Double)) {
                        objUnwrap = Double.valueOf(numberM375.doubleValue());
                    }
                    if (!(objUnwrap2 instanceof Double)) {
                        objUnwrap2 = Double.valueOf(numberM376.doubleValue());
                    }
                }
            } else if (objUnwrap instanceof BigInteger) {
                if (!(objUnwrap2 instanceof BigInteger)) {
                    objUnwrap2 = Primitive.castNumber(BigInteger.class, numberM376);
                }
            } else if (objUnwrap2 instanceof BigInteger) {
                objUnwrap = Primitive.castNumber(BigInteger.class, numberM375);
            } else {
                if (!(objUnwrap instanceof Long)) {
                    objUnwrap = Long.valueOf(numberM375.longValue());
                }
                if (!(objUnwrap2 instanceof Long)) {
                    objUnwrap2 = Long.valueOf(numberM376.longValue());
                }
            }
            Object[] objArr = {objUnwrap, objUnwrap2};
            Object obj3 = objArr[0];
            objUnwrap2 = objArr[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() != objUnwrap2.getClass()) {
            throw new C3523("Type mismatch in operator.  " + objUnwrap.getClass() + " cannot be used with " + objUnwrap2.getClass());
        }
        try {
            Object objM374 = m374(objUnwrap, i, objUnwrap2);
            if (objM374 instanceof Boolean) {
                return ((Boolean) objM374).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
            }
            if ((obj instanceof Primitive) && (obj2 instanceof Primitive)) {
                return (AbstractC0010.m426(objM374) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objM374, objM374.getClass()) : Primitive.shrinkWrap(objM374);
            }
            return Primitive.shrinkWrap(objM374).getValue();
        } catch (ArithmeticException e) {
            throw new C3524("Arithemetic Exception in binary op", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static Object m374(Object obj, int i, Object obj2) throws C3523 {
        if (i == 147) {
            return Integer.valueOf(((Comparable) obj).compareTo(obj2));
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = bool.booleanValue();
            if (i == 94) {
                return Boolean.valueOf(zBooleanValue == zBooleanValue2);
            }
            switch (i) {
                case 99:
                    return Boolean.valueOf(zBooleanValue != zBooleanValue2);
                case 100:
                case 101:
                case 102:
                case 103:
                    return bool;
                default:
                    switch (i) {
                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            return Boolean.valueOf(zBooleanValue & zBooleanValue2);
                        case 112:
                        case 113:
                            return Boolean.valueOf(zBooleanValue | zBooleanValue2);
                        case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                        case 115:
                            return Boolean.valueOf(zBooleanValue ^ zBooleanValue2);
                        default:
                            throw new C1669("unimplemented binary operator");
                    }
            }
        }
        if (f515.contains(Integer.valueOf(i))) {
            Comparable comparable = (Comparable) obj;
            switch (i) {
                case Opcodes.POP2 /* 88 */:
                case Opcodes.DUP /* 89 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) > 0);
                case 90:
                case 91:
                    return Boolean.valueOf(comparable.compareTo(obj2) < 0);
                case Opcodes.DUP2 /* 92 */:
                case 93:
                case 94:
                default:
                    return Boolean.valueOf(comparable.compareTo(obj2) == 0);
                case Opcodes.SWAP /* 95 */:
                case Opcodes.IADD /* 96 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) <= 0);
                case Opcodes.LADD /* 97 */:
                case 98:
                    return Boolean.valueOf(comparable.compareTo(obj2) >= 0);
                case 99:
                    return Boolean.valueOf(comparable.compareTo(obj2) != 0);
            }
        }
        if (obj instanceof BigInteger) {
            return m372((BigInteger) obj, (BigInteger) obj2, i);
        }
        if (obj instanceof BigDecimal) {
            return m371((BigDecimal) obj, (BigDecimal) obj2, i);
        }
        boolean zM426 = AbstractC0010.m426(obj);
        List list = f514;
        if (!zM426) {
            if (!(obj instanceof Number)) {
                throw new C3523("Invalid types in binary operator");
            }
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            switch (i) {
                case 106:
                    if (jLongValue <= 0 || Long.MAX_VALUE - jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue + jLongValue2);
                    }
                    break;
                case 107:
                    if (jLongValue >= 0 || Long.MIN_VALUE - jLongValue <= (-jLongValue2)) {
                        return Long.valueOf(jLongValue - jLongValue2);
                    }
                    break;
                case Opcodes.IDIV /* 108 */:
                    if (jLongValue == 0 || Long.MAX_VALUE / jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue * jLongValue2);
                    }
                    break;
                case Opcodes.LDIV /* 109 */:
                    return Long.valueOf(jLongValue / jLongValue2);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    return Long.valueOf(jLongValue & jLongValue2);
                case 112:
                case 113:
                    return Long.valueOf(jLongValue | jLongValue2);
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                case 115:
                    return Long.valueOf(jLongValue ^ jLongValue2);
                case Opcodes.INEG /* 116 */:
                case Opcodes.LNEG /* 117 */:
                    return Long.valueOf(jLongValue % jLongValue2);
                case Opcodes.FNEG /* 118 */:
                case Opcodes.DNEG /* 119 */:
                    double dPow = Math.pow(jLongValue, jLongValue2);
                    BigInteger bigInteger = BigDecimal.valueOf(dPow).toBigInteger();
                    if (bigInteger.compareTo(Primitive.LONG_MIN) >= 0 && bigInteger.compareTo(Primitive.LONG_MAX) <= 0) {
                        return Long.valueOf((long) dPow);
                    }
                    break;
                case 120:
                case 121:
                    return Long.valueOf(jLongValue << ((int) jLongValue2));
                case 122:
                case Opcodes.LSHR /* 123 */:
                    return Long.valueOf(jLongValue >> ((int) jLongValue2));
                case Opcodes.IUSHR /* 124 */:
                case Opcodes.LUSHR /* 125 */:
                    return Long.valueOf(jLongValue >>> ((int) jLongValue2));
            }
            if (list.contains(Integer.valueOf(i))) {
                return m372(BigInteger.valueOf(jLongValue), BigInteger.valueOf(jLongValue2), i);
            }
            throw new C1669("Unimplemented binary long operator");
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            float fFloatValue2 = ((Float) obj2).floatValue();
            switch (i) {
                case 106:
                    if (fFloatValue <= 0.0d || Float.MAX_VALUE - fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue + fFloatValue2);
                    }
                    break;
                case 107:
                    if (fFloatValue >= 0.0d || (-3.4028235E38f) - fFloatValue <= (-fFloatValue2)) {
                        return Float.valueOf(fFloatValue - fFloatValue2);
                    }
                    break;
                case Opcodes.IDIV /* 108 */:
                    if (fFloatValue == 0.0f || Float.MAX_VALUE / fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue * fFloatValue2);
                    }
                    break;
                case Opcodes.LDIV /* 109 */:
                    return Float.valueOf(fFloatValue / fFloatValue2);
                default:
                    switch (i) {
                        case Opcodes.INEG /* 116 */:
                        case Opcodes.LNEG /* 117 */:
                            return Float.valueOf(fFloatValue % fFloatValue2);
                        case Opcodes.FNEG /* 118 */:
                        case Opcodes.DNEG /* 119 */:
                            double dPow2 = Math.pow(fFloatValue, fFloatValue2);
                            if (!Double.isInfinite(dPow2)) {
                                return Double.valueOf(dPow2);
                            }
                            break;
                        case 120:
                        case 121:
                        case 122:
                        case Opcodes.LSHR /* 123 */:
                        case Opcodes.IUSHR /* 124 */:
                        case Opcodes.LUSHR /* 125 */:
                            throw new C3523("Can't shift floatingpoint values");
                    }
                    break;
            }
            if (list.contains(Integer.valueOf(i))) {
                return m371(BigDecimal.valueOf(fFloatValue), BigDecimal.valueOf(fFloatValue2), i);
            }
            throw new C1669("Unimplemented binary double operator");
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        double dDoubleValue2 = ((Double) obj2).doubleValue();
        switch (i) {
            case 106:
                if (dDoubleValue <= 0.0d || Double.MAX_VALUE - dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue + dDoubleValue2);
                }
                break;
            case 107:
                if (dDoubleValue >= 0.0d || (-1.7976931348623157E308d) - dDoubleValue <= (-dDoubleValue2)) {
                    return Double.valueOf(dDoubleValue - dDoubleValue2);
                }
                break;
            case Opcodes.IDIV /* 108 */:
                if (dDoubleValue == 0.0d || Double.MAX_VALUE / dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue * dDoubleValue2);
                }
                break;
            case Opcodes.LDIV /* 109 */:
                return Double.valueOf(dDoubleValue / dDoubleValue2);
            default:
                switch (i) {
                    case Opcodes.INEG /* 116 */:
                    case Opcodes.LNEG /* 117 */:
                        return Double.valueOf(dDoubleValue % dDoubleValue2);
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                        double dPow3 = Math.pow(dDoubleValue, dDoubleValue2);
                        if (!Double.isInfinite(dPow3)) {
                            return Double.valueOf(dPow3);
                        }
                        break;
                    case 120:
                    case 121:
                    case 122:
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.IUSHR /* 124 */:
                    case Opcodes.LUSHR /* 125 */:
                        throw new C3523("Can't shift floatingpoint values");
                }
                break;
        }
        if (list.contains(Integer.valueOf(i))) {
            return m371(BigDecimal.valueOf(dDoubleValue), BigDecimal.valueOf(dDoubleValue2), i);
        }
        throw new C1669("Unimplemented binary double operator");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Number m375(Object obj) {
        if (obj instanceof Character) {
            return Integer.valueOf(((Character) obj).charValue());
        }
        return ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }
}
