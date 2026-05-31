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
import p000.AbstractC1468;
import p000.AbstractC2240;
import p000.AbstractC2844;
import p000.C1684;
import p000.C2289;
import p000.C3581;
import p000.C3582;
import p000.InterfaceC2374;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0014 implements InterfaceC2374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final List f541 = Arrays.asList(104, 105, 106, Integer.valueOf(Opcodes.INEG));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final List f542 = Arrays.asList(88, 89, 86, 87, 92, 93, 94, 95, 96, 97);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m389(Object obj, int i, Object obj2) throws C3581 {
        String[] strArr = InterfaceC2374.f7613;
        if (i == 92) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i == 97) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new C3581("illegal use of undefined variable, class, or 'void' literal");
        }
        int i2 = 0;
        Class cls = Integer.TYPE;
        if (i == 145) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new C2289(22))).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
            if (iCompare < 0) {
                i2 = -1;
            } else if (iCompare > 0) {
                i2 = 1;
            }
            return Primitive.wrap(Integer.valueOf(i2), (Class<?>) cls);
        }
        if (i == 104) {
            if ((obj instanceof String) || (obj2 instanceof String)) {
                return BSHLiteral.internStrings ? String.valueOf(obj).concat(String.valueOf(obj2)).intern() : String.valueOf(obj).concat(String.valueOf(obj2));
            }
            if (obj.getClass().isArray() && (obj2 instanceof List)) {
                obj2 = ((List) obj2).toArray();
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                Class<?> cls2 = obj.getClass();
                Class<?> cls3 = obj2.getClass();
                if (AbstractC0017.m556(cls2) == AbstractC0017.m556(cls3)) {
                    Class clsM562 = AbstractC0017.m562(AbstractC0017.m557(cls2), AbstractC0017.m557(cls3));
                    int[] iArrM3304 = AbstractC1468.m3304(obj);
                    iArrM3304[0] = Array.getLength(obj2) + Array.getLength(obj);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM562, iArrM3304);
                    AbstractC1468.m3303(clsM562, objNewInstance, obj, obj2);
                    return objNewInstance;
                }
                throw new C3581("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + AbstractC2240.m4268(obj) + " with array of type " + AbstractC2240.m4268(obj2) + ".");
            }
            boolean z = obj instanceof List;
            if (z && obj2.getClass().isArray()) {
                obj2 = AbstractC0017.m559(0, List.class, obj2);
            }
            if (z && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
                linkedList.addAll(list2);
                return linkedList;
            }
        }
        if (i == 106) {
            if (obj.getClass().isArray()) {
                return AbstractC1468.m3312(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), obj);
            }
            if (obj2.getClass().isArray()) {
                return AbstractC1468.m3312(((Integer) Primitive.castWrapper(cls, obj)).intValue(), obj2);
            }
            if (obj instanceof List) {
                return AbstractC1468.m3313(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), (List) obj);
            }
            if (obj2 instanceof List) {
                return AbstractC1468.m3313(((Integer) Primitive.castWrapper(cls, obj)).intValue(), (List) obj2);
            }
            try {
                if (obj instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj));
                }
                if (obj2 instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2));
                }
            } catch (NegativeArraySizeException e) {
                throw new C3581("Negative repeat operand: " + e.getMessage(), e);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new C3581("Use of non + operator with String");
        }
        if (obj.getClass().isArray() || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new C3581(AbstractC2844.m4786(new StringBuilder("Use of invalid operator "), strArr[i], " with array or List type"));
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new C3581("illegal use of null value or 'null' literal");
        }
        throw new C3581(AbstractC2844.m4786(new StringBuilder("Operator: "), strArr[i], " inappropriate for objects"));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static BigDecimal m390(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) throws C3581 {
        switch (i) {
            case 104:
                return bigDecimal.add(bigDecimal2);
            case 105:
                return bigDecimal.subtract(bigDecimal2);
            case 106:
                return bigDecimal.multiply(bigDecimal2);
            case 107:
                return bigDecimal.divide(bigDecimal2);
            default:
                switch (i) {
                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    case 115:
                        return bigDecimal.remainder(bigDecimal2);
                    case Opcodes.INEG /* 116 */:
                    case Opcodes.LNEG /* 117 */:
                        return bigDecimal.pow(bigDecimal2.intValue());
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                    case 120:
                    case 121:
                    case 122:
                    case Opcodes.LSHR /* 123 */:
                        throw new C3581("Can't shift floatingpoint values");
                    default:
                        throw new C1684("Unimplemented binary float operator");
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static BigInteger m391(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        switch (i) {
            case 104:
                return bigInteger.add(bigInteger2);
            case 105:
                return bigInteger.subtract(bigInteger2);
            case 106:
                return bigInteger.multiply(bigInteger2);
            case 107:
                return bigInteger.divide(bigInteger2);
            case Opcodes.IDIV /* 108 */:
            case Opcodes.LDIV /* 109 */:
                return bigInteger.and(bigInteger2);
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return bigInteger.or(bigInteger2);
            case 112:
            case 113:
                return bigInteger.xor(bigInteger2);
            case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
            case 115:
                return bigInteger.mod(bigInteger2);
            case Opcodes.INEG /* 116 */:
            case Opcodes.LNEG /* 117 */:
                return bigInteger.pow(bigInteger2.intValue());
            case Opcodes.FNEG /* 118 */:
            case Opcodes.DNEG /* 119 */:
                return bigInteger.shiftLeft(bigInteger2.intValue());
            case 120:
            case 121:
                return bigInteger.shiftRight(bigInteger2.intValue());
            case 122:
            case Opcodes.LSHR /* 123 */:
                if (bigInteger.signum() >= 0) {
                    return bigInteger.shiftRight(bigInteger2.intValue());
                }
                BigInteger bigInteger3 = BigInteger.ONE;
                BigInteger bigIntegerShiftLeft = bigInteger3.shiftLeft(bigInteger.toString(2).length() + 1);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftLeft);
                return bigIntegerSubtract.shiftRight(bigInteger2.intValue()).and(bigIntegerShiftLeft.subtract(bigInteger3).shiftRight(bigInteger2.intValue() + 1));
            default:
                throw new C1684("Unimplemented binary integer operator");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Object m392(Object obj, int i, Object obj2) throws C3581 {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (AbstractC0017.m575(objUnwrap) && AbstractC0017.m575(objUnwrap2)) {
            Number numberM394 = m394(objUnwrap);
            Number numberM395 = m394(objUnwrap2);
            if (objUnwrap instanceof BigDecimal) {
                if (!(objUnwrap2 instanceof BigDecimal)) {
                    objUnwrap2 = Primitive.castNumber(BigDecimal.class, numberM395);
                }
            } else if (objUnwrap2 instanceof BigDecimal) {
                objUnwrap = Primitive.castNumber(BigDecimal.class, numberM394);
            } else if (AbstractC0017.m570(objUnwrap) || AbstractC0017.m570(objUnwrap2)) {
                if (!(objUnwrap instanceof Float) || !(objUnwrap2 instanceof Float)) {
                    if (!(objUnwrap instanceof Double)) {
                        objUnwrap = Double.valueOf(numberM394.doubleValue());
                    }
                    if (!(objUnwrap2 instanceof Double)) {
                        objUnwrap2 = Double.valueOf(numberM395.doubleValue());
                    }
                }
            } else if (objUnwrap instanceof BigInteger) {
                if (!(objUnwrap2 instanceof BigInteger)) {
                    objUnwrap2 = Primitive.castNumber(BigInteger.class, numberM395);
                }
            } else if (objUnwrap2 instanceof BigInteger) {
                objUnwrap = Primitive.castNumber(BigInteger.class, numberM394);
            } else {
                if (!(objUnwrap instanceof Long)) {
                    objUnwrap = Long.valueOf(numberM394.longValue());
                }
                if (!(objUnwrap2 instanceof Long)) {
                    objUnwrap2 = Long.valueOf(numberM395.longValue());
                }
            }
            Object[] objArr = {objUnwrap, objUnwrap2};
            Object obj3 = objArr[0];
            objUnwrap2 = objArr[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() != objUnwrap2.getClass()) {
            throw new C3581("Type mismatch in operator.  " + objUnwrap.getClass() + " cannot be used with " + objUnwrap2.getClass());
        }
        try {
            Object objM393 = m393(objUnwrap, i, objUnwrap2);
            if (objM393 instanceof Boolean) {
                return ((Boolean) objM393).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
            }
            if ((obj instanceof Primitive) && (obj2 instanceof Primitive)) {
                return (AbstractC0017.m570(objM393) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objM393, objM393.getClass()) : Primitive.shrinkWrap(objM393);
            }
            return Primitive.shrinkWrap(objM393).getValue();
        } catch (ArithmeticException e) {
            throw new C3582("Arithemetic Exception in binary op", e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static Object m393(Object obj, int i, Object obj2) throws C3581 {
        if (i == 145) {
            return Integer.valueOf(((Comparable) obj).compareTo(obj2));
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = bool.booleanValue();
            if (i == 92) {
                return Boolean.valueOf(zBooleanValue == zBooleanValue2);
            }
            switch (i) {
                case Opcodes.LADD /* 97 */:
                    return Boolean.valueOf(zBooleanValue != zBooleanValue2);
                case 98:
                case 99:
                case 100:
                case 101:
                    return bool;
                default:
                    switch (i) {
                        case Opcodes.IDIV /* 108 */:
                        case Opcodes.LDIV /* 109 */:
                            return Boolean.valueOf(zBooleanValue & zBooleanValue2);
                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            return Boolean.valueOf(zBooleanValue | zBooleanValue2);
                        case 112:
                        case 113:
                            return Boolean.valueOf(zBooleanValue ^ zBooleanValue2);
                        default:
                            throw new C1684("unimplemented binary operator");
                    }
            }
        }
        if (f542.contains(Integer.valueOf(i))) {
            Comparable comparable = (Comparable) obj;
            switch (i) {
                case 86:
                case Opcodes.POP /* 87 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) > 0);
                case Opcodes.POP2 /* 88 */:
                case Opcodes.DUP /* 89 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) < 0);
                case 90:
                case 91:
                case Opcodes.DUP2 /* 92 */:
                default:
                    return Boolean.valueOf(comparable.compareTo(obj2) == 0);
                case 93:
                case 94:
                    return Boolean.valueOf(comparable.compareTo(obj2) <= 0);
                case Opcodes.SWAP /* 95 */:
                case Opcodes.IADD /* 96 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) >= 0);
                case Opcodes.LADD /* 97 */:
                    return Boolean.valueOf(comparable.compareTo(obj2) != 0);
            }
        }
        if (obj instanceof BigInteger) {
            return m391((BigInteger) obj, (BigInteger) obj2, i);
        }
        if (obj instanceof BigDecimal) {
            return m390((BigDecimal) obj, (BigDecimal) obj2, i);
        }
        boolean zM570 = AbstractC0017.m570(obj);
        List list = f541;
        if (!zM570) {
            if (!(obj instanceof Number)) {
                throw new C3581("Invalid types in binary operator");
            }
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            switch (i) {
                case 104:
                    if (jLongValue <= 0 || Long.MAX_VALUE - jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue + jLongValue2);
                    }
                    break;
                case 105:
                    if (jLongValue >= 0 || Long.MIN_VALUE - jLongValue <= (-jLongValue2)) {
                        return Long.valueOf(jLongValue - jLongValue2);
                    }
                    break;
                case 106:
                    if (jLongValue == 0 || Long.MAX_VALUE / jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue * jLongValue2);
                    }
                    break;
                case 107:
                    return Long.valueOf(jLongValue / jLongValue2);
                case Opcodes.IDIV /* 108 */:
                case Opcodes.LDIV /* 109 */:
                    return Long.valueOf(jLongValue & jLongValue2);
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    return Long.valueOf(jLongValue | jLongValue2);
                case 112:
                case 113:
                    return Long.valueOf(jLongValue ^ jLongValue2);
                case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                case 115:
                    return Long.valueOf(jLongValue % jLongValue2);
                case Opcodes.INEG /* 116 */:
                case Opcodes.LNEG /* 117 */:
                    double dPow = Math.pow(jLongValue, jLongValue2);
                    BigInteger bigInteger = BigDecimal.valueOf(dPow).toBigInteger();
                    if (bigInteger.compareTo(Primitive.LONG_MIN) >= 0 && bigInteger.compareTo(Primitive.LONG_MAX) <= 0) {
                        return Long.valueOf((long) dPow);
                    }
                    break;
                case Opcodes.FNEG /* 118 */:
                case Opcodes.DNEG /* 119 */:
                    return Long.valueOf(jLongValue << ((int) jLongValue2));
                case 120:
                case 121:
                    return Long.valueOf(jLongValue >> ((int) jLongValue2));
                case 122:
                case Opcodes.LSHR /* 123 */:
                    return Long.valueOf(jLongValue >>> ((int) jLongValue2));
            }
            if (list.contains(Integer.valueOf(i))) {
                return m391(BigInteger.valueOf(jLongValue), BigInteger.valueOf(jLongValue2), i);
            }
            throw new C1684("Unimplemented binary long operator");
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            float fFloatValue2 = ((Float) obj2).floatValue();
            switch (i) {
                case 104:
                    if (fFloatValue <= 0.0d || Float.MAX_VALUE - fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue + fFloatValue2);
                    }
                    break;
                case 105:
                    if (fFloatValue >= 0.0d || (-3.4028235E38f) - fFloatValue <= (-fFloatValue2)) {
                        return Float.valueOf(fFloatValue - fFloatValue2);
                    }
                    break;
                case 106:
                    if (fFloatValue == 0.0f || Float.MAX_VALUE / fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue * fFloatValue2);
                    }
                    break;
                case 107:
                    return Float.valueOf(fFloatValue / fFloatValue2);
                default:
                    switch (i) {
                        case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                        case 115:
                            return Float.valueOf(fFloatValue % fFloatValue2);
                        case Opcodes.INEG /* 116 */:
                        case Opcodes.LNEG /* 117 */:
                            double dPow2 = Math.pow(fFloatValue, fFloatValue2);
                            if (!Double.isInfinite(dPow2)) {
                                return Double.valueOf(dPow2);
                            }
                            break;
                        case Opcodes.FNEG /* 118 */:
                        case Opcodes.DNEG /* 119 */:
                        case 120:
                        case 121:
                        case 122:
                        case Opcodes.LSHR /* 123 */:
                            throw new C3581("Can't shift floatingpoint values");
                    }
                    break;
            }
            if (list.contains(Integer.valueOf(i))) {
                return m390(BigDecimal.valueOf(fFloatValue), BigDecimal.valueOf(fFloatValue2), i);
            }
            throw new C1684("Unimplemented binary double operator");
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        double dDoubleValue2 = ((Double) obj2).doubleValue();
        switch (i) {
            case 104:
                if (dDoubleValue <= 0.0d || Double.MAX_VALUE - dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue + dDoubleValue2);
                }
                break;
            case 105:
                if (dDoubleValue >= 0.0d || (-1.7976931348623157E308d) - dDoubleValue <= (-dDoubleValue2)) {
                    return Double.valueOf(dDoubleValue - dDoubleValue2);
                }
                break;
            case 106:
                if (dDoubleValue == 0.0d || Double.MAX_VALUE / dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue * dDoubleValue2);
                }
                break;
            case 107:
                return Double.valueOf(dDoubleValue / dDoubleValue2);
            default:
                switch (i) {
                    case UMErrorCode.E_UM_BE_FILE_OVERSIZE /* 114 */:
                    case 115:
                        return Double.valueOf(dDoubleValue % dDoubleValue2);
                    case Opcodes.INEG /* 116 */:
                    case Opcodes.LNEG /* 117 */:
                        double dPow3 = Math.pow(dDoubleValue, dDoubleValue2);
                        if (!Double.isInfinite(dPow3)) {
                            return Double.valueOf(dPow3);
                        }
                        break;
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                    case 120:
                    case 121:
                    case 122:
                    case Opcodes.LSHR /* 123 */:
                        throw new C3581("Can't shift floatingpoint values");
                }
                break;
        }
        if (list.contains(Integer.valueOf(i))) {
            return m390(BigDecimal.valueOf(dDoubleValue), BigDecimal.valueOf(dDoubleValue2), i);
        }
        throw new C1684("Unimplemented binary double operator");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Number m394(Object obj) {
        if (obj instanceof Character) {
            return Integer.valueOf(((Character) obj).charValue());
        }
        return ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }
}
