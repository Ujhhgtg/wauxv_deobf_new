package bsh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1684;
import p000.C3581;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    public int kind;
    public boolean postfix;

    public BSHUnaryExpression(int i) {
        super(i);
        this.postfix = false;
    }

    private Object lhsUnaryOperation(LHS lhs, boolean z) throws C3581 {
        RunnableC0008.m333("lhsUnaryOperation");
        Object value = lhs.getValue();
        Object objUnaryOperation = unaryOperation(value, this.kind);
        if (!this.postfix) {
            value = objUnaryOperation;
        }
        lhs.assign(objUnaryOperation, z);
        return value;
    }

    private Object unaryOperation(Object obj, int i) throws C3581 {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (!(obj instanceof Primitive)) {
            throw new C3581(AbstractC2844.m4786(new StringBuilder("Unary operation "), InterfaceC2374.f7613[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC0014.f541;
        if (primitive == Primitive.NULL) {
            throw new C3581("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new C3581("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            boolean zBooleanValue = ((Boolean) primitive.getValue()).booleanValue();
            if (i == 90) {
                return !zBooleanValue ? Primitive.TRUE : Primitive.FALSE;
            }
            throw new C3581("Operator inappropriate for boolean");
        }
        Number numberM394 = AbstractC0014.m394(primitive.getValue());
        if (numberM394 instanceof Integer) {
            int iIntValue = ((Integer) numberM394).intValue();
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
                        throw new C1684("bad integer unaryOperation");
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
        if (numberM394 instanceof Long) {
            long jLongValue = numberM394.longValue();
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
                        throw new C1684("bad long unaryOperation");
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM394 instanceof Float) {
            float fFloatValue = numberM394.floatValue();
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
                    throw new C1684("bad float unaryOperation");
            }
            return new Primitive(fFloatValue);
        }
        if (numberM394 instanceof Double) {
            double dDoubleValue = numberM394.doubleValue();
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
                    throw new C1684("bad double unaryOperation");
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM394 instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM394;
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
                        throw new C1684("bad big integer unaryOperation");
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM394 instanceof BigDecimal)) {
            throw new C1684("An error occurred.  Please call technical support.");
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM394;
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
                    throw new C1684("bad big decimal unaryOperation");
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Node nodeJjtGetChild = jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 102 && i != 103) {
                return unaryOperation(nodeJjtGetChild.eval(c0527, runnableC0008), this.kind);
            }
            LHS lhs = ((BSHPrimaryExpression) nodeJjtGetChild).toLHS(c0527, runnableC0008);
            runnableC0008.getClass();
            return lhsUnaryOperation(lhs, false);
        } catch (C3581 e) {
            throw e.mo4677(this, c0527);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC2374.f7613[this.kind];
    }
}
