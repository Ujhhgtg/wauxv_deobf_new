package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1684;
import p000.C2683;
import p000.C3581;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAssignment extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    public Integer operator;

    public BSHAssignment(int i) {
        super(i);
    }

    private Object operation(Object obj, Object obj2, int i) throws C3581 {
        if ((obj instanceof String) || obj.getClass().isArray()) {
            return AbstractC0014.m389(obj, i, obj2);
        }
        if (obj2 == Primitive.NULL) {
            throw new C3581("Illegal use of null object or 'null' literal");
        }
        if (((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof Primitive)) && ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Number) || (obj2 instanceof Primitive))) {
            return AbstractC0014.m392(obj, i, obj2);
        }
        throw new C3581("Non primitive value in operator: " + obj.getClass() + " " + InterfaceC2374.f7613[i] + " " + obj2.getClass());
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Object value;
        if (this.operator == null) {
            try {
                return jjtGetChild(0).eval(c0527, runnableC0008);
            } catch (C2683 unused) {
                return Primitive.NULL;
            }
        }
        BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) jjtGetChild(0);
        runnableC0008.getClass();
        LHS lhs = bSHPrimaryExpression.toLHS(c0527, runnableC0008);
        if (this.operator.intValue() != 85) {
            try {
                value = lhs.getValue();
            } catch (C3581 e) {
                throw e.mo4677(this, c0527);
            }
        } else {
            value = null;
        }
        if (this.operator.intValue() == 146 && Primitive.NULL != value) {
            return value;
        }
        Object objEval = jjtGetChild(1).eval(c0527, runnableC0008);
        if (objEval == Primitive.VOID) {
            throw new C1232("illegal void assignment", this, c0527);
        }
        try {
            int iIntValue = this.operator.intValue();
            if (iIntValue == 85) {
                if (!lhs.isFinal()) {
                    return lhs.assign(objEval, false);
                }
                lhs.getVariable().setValue(objEval, 1);
                return objEval;
            }
            if (iIntValue == 146) {
                return lhs.assign(objEval, false);
            }
            switch (iIntValue) {
                case Opcodes.IUSHR /* 124 */:
                    if (Primitive.NULL == value && lhs.getType() == String.class) {
                        value = "null";
                    }
                    return lhs.assign(operation(value, objEval, 104), false);
                case Opcodes.LUSHR /* 125 */:
                    return lhs.assign(operation(value, objEval, 105), false);
                case 126:
                    return lhs.assign(operation(value, objEval, 106), false);
                case 127:
                    return lhs.assign(operation(value, objEval, 107), false);
                case 128:
                case Opcodes.LOR /* 129 */:
                    return lhs.assign(operation(value, objEval, Opcodes.IDIV), false);
                case Opcodes.IXOR /* 130 */:
                case Opcodes.LXOR /* 131 */:
                    return lhs.assign(operation(value, objEval, UMErrorCode.E_UM_BE_JSON_FAILED), false);
                case Opcodes.IINC /* 132 */:
                case Opcodes.I2L /* 133 */:
                    return lhs.assign(operation(value, objEval, 112), false);
                case Opcodes.I2F /* 134 */:
                case Opcodes.I2D /* 135 */:
                    return lhs.assign(operation(value, objEval, UMErrorCode.E_UM_BE_FILE_OVERSIZE), false);
                case Opcodes.L2I /* 136 */:
                case 137:
                    return lhs.assign(operation(value, objEval, Opcodes.INEG), false);
                case 138:
                case Opcodes.F2I /* 139 */:
                    return lhs.assign(operation(value, objEval, Opcodes.FNEG), false);
                case Opcodes.F2L /* 140 */:
                case 141:
                    return lhs.assign(operation(value, objEval, 120), false);
                case Opcodes.D2I /* 142 */:
                case Opcodes.D2L /* 143 */:
                    return lhs.assign(operation(value, objEval, 122), false);
                default:
                    throw new C1684("unimplemented operator in assignment BSH");
            }
        } catch (C3581 e2) {
            throw e2.mo4677(this, c0527);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.operator == null) {
            str = "";
        } else {
            str = ": " + InterfaceC2374.f7613[this.operator.intValue()];
        }
        sb.append(str);
        return sb.toString();
    }
}
