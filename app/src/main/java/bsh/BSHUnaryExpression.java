package bsh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    public int kind;
    public boolean postfix;

    public BSHUnaryExpression(int i) {
        super(i);
        this.postfix = false;
    }

    private Object lhsUnaryOperation(C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf, boolean z) throws C1863Ujhhgtgfeyxiexzf {
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("lhsUnaryOperation");
        Object objM1195Ujhhgtgfeyxiexzf = c0151Ujhhgtgfeyxiexzf.m1195Ujhhgtgfeyxiexzf();
        Object objUnaryOperation = unaryOperation(objM1195Ujhhgtgfeyxiexzf, this.kind);
        if (!this.postfix) {
            objM1195Ujhhgtgfeyxiexzf = objUnaryOperation;
        }
        c0151Ujhhgtgfeyxiexzf.m1194Ujhhgtgfeyxiexzf(objUnaryOperation, z);
        return objM1195Ujhhgtgfeyxiexzf;
    }

    private Object unaryOperation(Object obj, int i) throws C1863Ujhhgtgfeyxiexzf {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (!(obj instanceof Primitive)) {
            throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Unary operation "), InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC0031Ujhhgtgfeyxiexzf.f555Ujhhgtgfeyxiexzf;
        if (primitive == Primitive.NULL) {
            throw new C1863Ujhhgtgfeyxiexzf("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new C1863Ujhhgtgfeyxiexzf("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            boolean zBooleanValue = ((Boolean) primitive.getValue()).booleanValue();
            if (i == 90) {
                return !zBooleanValue ? Primitive.TRUE : Primitive.FALSE;
            }
            throw new C1863Ujhhgtgfeyxiexzf("Operator inappropriate for boolean");
        }
        Number numberM393Ujhhgtgfeyxiexzf = AbstractC0031Ujhhgtgfeyxiexzf.m393Ujhhgtgfeyxiexzf(primitive.getValue());
        if (numberM393Ujhhgtgfeyxiexzf instanceof Integer) {
            int iIntValue = ((Integer) numberM393Ujhhgtgfeyxiexzf).intValue();
            if (i != 91) {
                switch (i) {
                    case 102:
                        iIntValue++;
                        break;
                    case 103:
                        iIntValue--;
                        break;
                    case 104:
                        break;
                    case 105:
                        iIntValue = -iIntValue;
                        break;
                    default:
                        throw new C0712Ujhhgtgfeyxiexzf("bad integer unaryOperation");
                }
            } else {
                iIntValue = ~iIntValue;
            }
            if (i == 102 || i == 103) {
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
        if (numberM393Ujhhgtgfeyxiexzf instanceof Long) {
            long jLongValue = numberM393Ujhhgtgfeyxiexzf.longValue();
            if (i != 91) {
                switch (i) {
                    case 102:
                        jLongValue++;
                        break;
                    case 103:
                        jLongValue--;
                        break;
                    case 104:
                        break;
                    case 105:
                        jLongValue = -jLongValue;
                        break;
                    default:
                        throw new C0712Ujhhgtgfeyxiexzf("bad long unaryOperation");
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM393Ujhhgtgfeyxiexzf instanceof Float) {
            float fFloatValue = numberM393Ujhhgtgfeyxiexzf.floatValue();
            switch (i) {
                case 102:
                    fFloatValue += 1.0f;
                    break;
                case 103:
                    fFloatValue -= 1.0f;
                    break;
                case 104:
                    break;
                case 105:
                    fFloatValue = -fFloatValue;
                    break;
                default:
                    throw new C0712Ujhhgtgfeyxiexzf("bad float unaryOperation");
            }
            return new Primitive(fFloatValue);
        }
        if (numberM393Ujhhgtgfeyxiexzf instanceof Double) {
            double dDoubleValue = numberM393Ujhhgtgfeyxiexzf.doubleValue();
            switch (i) {
                case 102:
                    dDoubleValue += 1.0d;
                    break;
                case 103:
                    dDoubleValue -= 1.0d;
                    break;
                case 104:
                    break;
                case 105:
                    dDoubleValue = -dDoubleValue;
                    break;
                default:
                    throw new C0712Ujhhgtgfeyxiexzf("bad double unaryOperation");
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM393Ujhhgtgfeyxiexzf instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM393Ujhhgtgfeyxiexzf;
            if (i != 91) {
                switch (i) {
                    case 102:
                        bigIntegerNot = bigIntegerNot.add(BigInteger.ONE);
                        break;
                    case 103:
                        bigIntegerNot = bigIntegerNot.subtract(BigInteger.ONE);
                        break;
                    case 104:
                        break;
                    case 105:
                        bigIntegerNot = bigIntegerNot.negate();
                        break;
                    default:
                        throw new C0712Ujhhgtgfeyxiexzf("bad big integer unaryOperation");
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM393Ujhhgtgfeyxiexzf instanceof BigDecimal)) {
            throw new C0712Ujhhgtgfeyxiexzf("An error occurred.  Please call technical support.");
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM393Ujhhgtgfeyxiexzf;
        if (i != 91) {
            switch (i) {
                case 102:
                    bigDecimalNegate = bigDecimalNegate.add(BigDecimal.ONE);
                    break;
                case 103:
                    bigDecimalNegate = bigDecimalNegate.subtract(BigDecimal.ONE);
                    break;
                case 104:
                    break;
                case 105:
                    bigDecimalNegate = bigDecimalNegate.negate();
                    break;
                default:
                    throw new C0712Ujhhgtgfeyxiexzf("bad big decimal unaryOperation");
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Node nodeJjtGetChild = jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 102 && i != 103) {
                return unaryOperation(nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), this.kind);
            }
            C0151Ujhhgtgfeyxiexzf lhs = ((BSHPrimaryExpression) nodeJjtGetChild).toLHS(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            runnableC0026Ujhhgtgfeyxiexzf.getClass();
            return lhsUnaryOperation(lhs, false);
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[this.kind];
    }
}
