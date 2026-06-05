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
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1297feyxiexzfUjhhgtg;
import p000.C1862Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0031Ujhhgtgfeyxiexzf implements InterfaceC1407feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final List f555Ujhhgtgfeyxiexzf = Arrays.asList(104, 105, 106, Integer.valueOf(Opcodes.INEG));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final List f556Ujhhgtgfeyxiexzf = Arrays.asList(88, 89, 86, 87, 92, 93, 94, 95, 96, 97);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Object m388Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) throws C1863Ujhhgtgfeyxiexzf {
        String[] strArr = InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf;
        if (i == 92) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i == 97) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new C1863Ujhhgtgfeyxiexzf("illegal use of undefined variable, class, or 'void' literal");
        }
        int i2 = 0;
        Class cls = Integer.TYPE;
        if (i == 145) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new C1297feyxiexzfUjhhgtg(22))).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
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
                if (AbstractC0034Ujhhgtgfeyxiexzf.m555Ujhhgtgfeyxiexzf(cls2) == AbstractC0034Ujhhgtgfeyxiexzf.m555Ujhhgtgfeyxiexzf(cls3)) {
                    Class clsM561Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m561Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls2), AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls3));
                    int[] iArrM5056Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5056Ujhhgtgfeyxiexzf(obj);
                    iArrM5056Ujhhgtgfeyxiexzf[0] = Array.getLength(obj2) + Array.getLength(obj);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM561Ujhhgtgfeyxiexzf, iArrM5056Ujhhgtgfeyxiexzf);
                    AbstractC3516feyxiexzfUjhhgtg.m5054Ujhhgtgfeyxiexzf(clsM561Ujhhgtgfeyxiexzf, objNewInstance, obj, obj2);
                    return objNewInstance;
                }
                throw new C1863Ujhhgtgfeyxiexzf("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + AbstractC3594Ujhhgtgfeyxiexzf.m5197feyxiexzfUjhhgtg(obj) + " with array of type " + AbstractC3594Ujhhgtgfeyxiexzf.m5197feyxiexzfUjhhgtg(obj2) + ".");
            }
            boolean z = obj instanceof List;
            if (z && obj2.getClass().isArray()) {
                obj2 = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, List.class, obj2);
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
                return AbstractC3516feyxiexzfUjhhgtg.m5068Ujhhgtgfeyxiexzf(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), obj);
            }
            if (obj2.getClass().isArray()) {
                return AbstractC3516feyxiexzfUjhhgtg.m5068Ujhhgtgfeyxiexzf(((Integer) Primitive.castWrapper(cls, obj)).intValue(), obj2);
            }
            if (obj instanceof List) {
                return AbstractC3516feyxiexzfUjhhgtg.m5069Ujhhgtgfeyxiexzf(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), (List) obj);
            }
            if (obj2 instanceof List) {
                return AbstractC3516feyxiexzfUjhhgtg.m5069Ujhhgtgfeyxiexzf(((Integer) Primitive.castWrapper(cls, obj)).intValue(), (List) obj2);
            }
            try {
                if (obj instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj));
                }
                if (obj2 instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2));
                }
            } catch (NegativeArraySizeException e) {
                throw new C1863Ujhhgtgfeyxiexzf("Negative repeat operand: " + e.getMessage(), e);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new C1863Ujhhgtgfeyxiexzf("Use of non + operator with String");
        }
        if (obj.getClass().isArray() || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Use of invalid operator "), strArr[i], " with array or List type"));
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new C1863Ujhhgtgfeyxiexzf("illegal use of null value or 'null' literal");
        }
        throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Operator: "), strArr[i], " inappropriate for objects"));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static BigDecimal m389Ujhhgtgfeyxiexzf(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) throws C1863Ujhhgtgfeyxiexzf {
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
                        throw new C1863Ujhhgtgfeyxiexzf("Can't shift floatingpoint values");
                    default:
                        throw new C0712Ujhhgtgfeyxiexzf("Unimplemented binary float operator");
                }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static BigInteger m390Ujhhgtgfeyxiexzf(BigInteger bigInteger, BigInteger bigInteger2, int i) {
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
                throw new C0712Ujhhgtgfeyxiexzf("Unimplemented binary integer operator");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static Object m391Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) throws C1863Ujhhgtgfeyxiexzf {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (AbstractC0034Ujhhgtgfeyxiexzf.m574Ujhhgtgfeyxiexzf(objUnwrap) && AbstractC0034Ujhhgtgfeyxiexzf.m574Ujhhgtgfeyxiexzf(objUnwrap2)) {
            Number numberM393Ujhhgtgfeyxiexzf = m393Ujhhgtgfeyxiexzf(objUnwrap);
            Number numberM393Ujhhgtgfeyxiexzf2 = m393Ujhhgtgfeyxiexzf(objUnwrap2);
            if (objUnwrap instanceof BigDecimal) {
                if (!(objUnwrap2 instanceof BigDecimal)) {
                    objUnwrap2 = Primitive.castNumber(BigDecimal.class, numberM393Ujhhgtgfeyxiexzf2);
                }
            } else if (objUnwrap2 instanceof BigDecimal) {
                objUnwrap = Primitive.castNumber(BigDecimal.class, numberM393Ujhhgtgfeyxiexzf);
            } else if (AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(objUnwrap) || AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(objUnwrap2)) {
                boolean z = objUnwrap instanceof Double;
                if (z || (objUnwrap2 instanceof Double)) {
                    if (!z) {
                        objUnwrap = Double.valueOf(numberM393Ujhhgtgfeyxiexzf.doubleValue());
                    }
                    if (!(objUnwrap2 instanceof Double)) {
                        objUnwrap2 = Double.valueOf(numberM393Ujhhgtgfeyxiexzf2.doubleValue());
                    }
                } else {
                    if (!(objUnwrap instanceof Float)) {
                        objUnwrap = Float.valueOf(numberM393Ujhhgtgfeyxiexzf.floatValue());
                    }
                    if (!(objUnwrap2 instanceof Float)) {
                        objUnwrap2 = Float.valueOf(numberM393Ujhhgtgfeyxiexzf2.floatValue());
                    }
                }
            } else if (objUnwrap instanceof BigInteger) {
                if (!(objUnwrap2 instanceof BigInteger)) {
                    objUnwrap2 = Primitive.castNumber(BigInteger.class, numberM393Ujhhgtgfeyxiexzf2);
                }
            } else if (objUnwrap2 instanceof BigInteger) {
                objUnwrap = Primitive.castNumber(BigInteger.class, numberM393Ujhhgtgfeyxiexzf);
            } else {
                if (!(objUnwrap instanceof Long)) {
                    objUnwrap = Long.valueOf(numberM393Ujhhgtgfeyxiexzf.longValue());
                }
                if (!(objUnwrap2 instanceof Long)) {
                    objUnwrap2 = Long.valueOf(numberM393Ujhhgtgfeyxiexzf2.longValue());
                }
            }
            Object[] objArr = {objUnwrap, objUnwrap2};
            Object obj3 = objArr[0];
            objUnwrap2 = objArr[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() != objUnwrap2.getClass()) {
            throw new C1863Ujhhgtgfeyxiexzf("Type mismatch in operator.  " + objUnwrap.getClass() + " cannot be used with " + objUnwrap2.getClass());
        }
        try {
            Object objM392Ujhhgtgfeyxiexzf = m392Ujhhgtgfeyxiexzf(objUnwrap, i, objUnwrap2);
            if (objM392Ujhhgtgfeyxiexzf instanceof Boolean) {
                return ((Boolean) objM392Ujhhgtgfeyxiexzf).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
            }
            if ((obj instanceof Primitive) && (obj2 instanceof Primitive)) {
                return (AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(objM392Ujhhgtgfeyxiexzf) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objM392Ujhhgtgfeyxiexzf, objM392Ujhhgtgfeyxiexzf.getClass()) : Primitive.shrinkWrap(objM392Ujhhgtgfeyxiexzf);
            }
            return Primitive.shrinkWrap(objM392Ujhhgtgfeyxiexzf).getValue();
        } catch (ArithmeticException e) {
            throw new C1862Ujhhgtgfeyxiexzf("Arithemetic Exception in binary op", e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Object m392Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) throws C1863Ujhhgtgfeyxiexzf {
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
                            throw new C0712Ujhhgtgfeyxiexzf("unimplemented binary operator");
                    }
            }
        }
        if (f556Ujhhgtgfeyxiexzf.contains(Integer.valueOf(i))) {
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
            return m390Ujhhgtgfeyxiexzf((BigInteger) obj, (BigInteger) obj2, i);
        }
        if (obj instanceof BigDecimal) {
            return m389Ujhhgtgfeyxiexzf((BigDecimal) obj, (BigDecimal) obj2, i);
        }
        boolean zM569Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(obj);
        List list = f555Ujhhgtgfeyxiexzf;
        if (!zM569Ujhhgtgfeyxiexzf) {
            if (!(obj instanceof Number)) {
                throw new C1863Ujhhgtgfeyxiexzf("Invalid types in binary operator");
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
                return m390Ujhhgtgfeyxiexzf(BigInteger.valueOf(jLongValue), BigInteger.valueOf(jLongValue2), i);
            }
            throw new C0712Ujhhgtgfeyxiexzf("Unimplemented binary long operator");
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
                            throw new C1863Ujhhgtgfeyxiexzf("Can't shift floatingpoint values");
                    }
                    break;
            }
            if (list.contains(Integer.valueOf(i))) {
                return m389Ujhhgtgfeyxiexzf(BigDecimal.valueOf(fFloatValue), BigDecimal.valueOf(fFloatValue2), i);
            }
            throw new C0712Ujhhgtgfeyxiexzf("Unimplemented binary double operator");
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
                        throw new C1863Ujhhgtgfeyxiexzf("Can't shift floatingpoint values");
                }
                break;
        }
        if (list.contains(Integer.valueOf(i))) {
            return m389Ujhhgtgfeyxiexzf(BigDecimal.valueOf(dDoubleValue), BigDecimal.valueOf(dDoubleValue2), i);
        }
        throw new C0712Ujhhgtgfeyxiexzf("Unimplemented binary double operator");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static Number m393Ujhhgtgfeyxiexzf(Object obj) {
        if (obj instanceof Character) {
            return Integer.valueOf(((Character) obj).charValue());
        }
        return ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }
}
