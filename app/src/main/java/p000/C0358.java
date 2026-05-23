package p000;

import bsh.AbstractC0008;
import bsh.Primitive;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0358 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f1673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1674;

    public C0358() {
        super(18);
        this.f1674 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static Primitive m1470(int i, Object obj) throws C3523 {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (!(obj instanceof Primitive)) {
            throw new C3523(AbstractC2784.m4752(new StringBuilder("Unary operation "), InterfaceC2335.f7500[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC0008.f514;
        if (primitive == Primitive.NULL) {
            throw new C3523("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new C3523("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            boolean zBooleanValue = ((Boolean) primitive.getValue()).booleanValue();
            if (i == 92) {
                return !zBooleanValue ? Primitive.TRUE : Primitive.FALSE;
            }
            throw new C3523("Operator inappropriate for boolean");
        }
        Number numberM375 = AbstractC0008.m375(primitive.getValue());
        if (numberM375 instanceof Integer) {
            int iIntValue = ((Integer) numberM375).intValue();
            if (i != 93) {
                switch (i) {
                    case 104:
                        iIntValue++;
                        break;
                    case 105:
                        iIntValue--;
                        break;
                    case 106:
                        break;
                    case 107:
                        iIntValue = -iIntValue;
                        break;
                    default:
                        throw new C1669("bad integer unaryOperation");
                }
            } else {
                iIntValue = ~iIntValue;
            }
            if (i == 104 || i == 105) {
                if (type == Byte.TYPE) {
                    return new Primitive((byte) iIntValue);
                }
                if (type == Short.TYPE) {
                    return new Primitive((short) iIntValue);
                }
                if (type == Character.TYPE) {
                    return new Primitive((char) iIntValue);
                }
            }
            return new Primitive(iIntValue);
        }
        if (numberM375 instanceof Long) {
            long jLongValue = numberM375.longValue();
            if (i != 93) {
                switch (i) {
                    case 104:
                        jLongValue++;
                        break;
                    case 105:
                        jLongValue--;
                        break;
                    case 106:
                        break;
                    case 107:
                        jLongValue = -jLongValue;
                        break;
                    default:
                        throw new C1669("bad long unaryOperation");
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM375 instanceof Float) {
            float fFloatValue = numberM375.floatValue();
            switch (i) {
                case 104:
                    fFloatValue += 1.0f;
                    break;
                case 105:
                    fFloatValue -= 1.0f;
                    break;
                case 106:
                    break;
                case 107:
                    fFloatValue = -fFloatValue;
                    break;
                default:
                    throw new C1669("bad float unaryOperation");
            }
            return new Primitive(fFloatValue);
        }
        if (numberM375 instanceof Double) {
            double dDoubleValue = numberM375.doubleValue();
            switch (i) {
                case 104:
                    dDoubleValue += 1.0d;
                    break;
                case 105:
                    dDoubleValue -= 1.0d;
                    break;
                case 106:
                    break;
                case 107:
                    dDoubleValue = -dDoubleValue;
                    break;
                default:
                    throw new C1669("bad double unaryOperation");
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM375 instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM375;
            if (i != 93) {
                switch (i) {
                    case 104:
                        bigIntegerNot = bigIntegerNot.add(BigInteger.ONE);
                        break;
                    case 105:
                        bigIntegerNot = bigIntegerNot.subtract(BigInteger.ONE);
                        break;
                    case 106:
                        break;
                    case 107:
                        bigIntegerNot = bigIntegerNot.negate();
                        break;
                    default:
                        throw new C1669("bad big integer unaryOperation");
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM375 instanceof BigDecimal)) {
            throw new C1669("An error occurred.  Please call technical support.");
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM375;
        if (i != 93) {
            switch (i) {
                case 104:
                    bigDecimalNegate = bigDecimalNegate.add(BigDecimal.ONE);
                    break;
                case 105:
                    bigDecimalNegate = bigDecimalNegate.subtract(BigDecimal.ONE);
                    break;
                case 106:
                    break;
                case 107:
                    bigDecimalNegate = bigDecimalNegate.negate();
                    break;
                default:
                    throw new C1669("bad big decimal unaryOperation");
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + InterfaceC2335.f7500[this.f1673];
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        InterfaceC2225 interfaceC2225 = this.f8721[0];
        try {
            int i = this.f1673;
            if (i != 104 && i != 105) {
                return m1470(this.f1673, interfaceC2225.mo306(c0550, runnableC1668));
            }
            C0348 c0348 = (C0348) interfaceC2225;
            
            
            C1751 c1751 = (C1751) c0348.m1459(c0550, runnableC1668, !c0348.f1651);
            RunnableC1668.m3389("lhsUnaryOperation");
            Object objM3498 = c1751.m3498();
            Primitive primitiveM1470 = m1470(this.f1673, objM3498);
            if (!this.f1674) {
                objM3498 = primitiveM1470;
            }
            c1751.m3497(primitiveM1470, false);
            return objM3498;
        } catch (C3523 e) {
            throw e.mo4643(this, c0550);
        }
    }
}
