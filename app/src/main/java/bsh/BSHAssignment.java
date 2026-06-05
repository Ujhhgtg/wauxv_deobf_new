package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.statistics.UMErrorCode;
import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0940feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAssignment extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    public Integer operator;

    public BSHAssignment(int i) {
        super(i);
    }

    private Object operation(Object obj, Object obj2, int i) throws C1863Ujhhgtgfeyxiexzf {
        if ((obj instanceof String) || obj.getClass().isArray()) {
            return AbstractC0031Ujhhgtgfeyxiexzf.m388Ujhhgtgfeyxiexzf(obj, i, obj2);
        }
        if (obj2 == Primitive.NULL) {
            throw new C1863Ujhhgtgfeyxiexzf("Illegal use of null object or 'null' literal");
        }
        if (((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof Primitive)) && ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Number) || (obj2 instanceof Primitive))) {
            return AbstractC0031Ujhhgtgfeyxiexzf.m391Ujhhgtgfeyxiexzf(obj, i, obj2);
        }
        throw new C1863Ujhhgtgfeyxiexzf("Non primitive value in operator: " + obj.getClass() + " " + InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[i] + " " + obj2.getClass());
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Object objM1195Ujhhgtgfeyxiexzf;
        if (this.operator == null) {
            try {
                return jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            } catch (C0940feyxiexzfUjhhgtg unused) {
                return Primitive.NULL;
            }
        }
        BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) jjtGetChild(0);
        runnableC0026Ujhhgtgfeyxiexzf.getClass();
        C0151Ujhhgtgfeyxiexzf lhs = bSHPrimaryExpression.toLHS(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        Class clsM562Ujhhgtgfeyxiexzf = null;
        if (this.operator.intValue() != 85) {
            try {
                objM1195Ujhhgtgfeyxiexzf = lhs.m1195Ujhhgtgfeyxiexzf();
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        } else {
            objM1195Ujhhgtgfeyxiexzf = null;
        }
        if (this.operator.intValue() == 146 && Primitive.NULL != objM1195Ujhhgtgfeyxiexzf) {
            return objM1195Ujhhgtgfeyxiexzf;
        }
        Object objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (objEval == Primitive.VOID) {
            throw new C3354Ujhhgtgfeyxiexzf("illegal void assignment", this, c2637feyxiexzfUjhhgtg);
        }
        try {
            int iIntValue = this.operator.intValue();
            if (iIntValue == 85) {
                if (!(lhs.m1197Ujhhgtgfeyxiexzf() == null ? false : lhs.f1316Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("final"))) {
                    return lhs.m1194Ujhhgtgfeyxiexzf(objEval, false);
                }
                lhs.m1197Ujhhgtgfeyxiexzf().m3189Ujhhgtgfeyxiexzf(1, objEval);
                return objEval;
            }
            if (iIntValue == 146) {
                return lhs.m1194Ujhhgtgfeyxiexzf(objEval, false);
            }
            switch (iIntValue) {
                case Opcodes.IUSHR /* 124 */:
                    if (Primitive.NULL == objM1195Ujhhgtgfeyxiexzf) {
                        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = lhs.f1313Ujhhgtgfeyxiexzf;
                        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
                            clsM562Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.mo1641Ujhhgtgfeyxiexzf();
                        } else if (lhs.m1197Ujhhgtgfeyxiexzf() != null) {
                            clsM562Ujhhgtgfeyxiexzf = lhs.f1316Ujhhgtgfeyxiexzf.f6221Ujhhgtgfeyxiexzf;
                        } else {
                            try {
                                clsM562Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(lhs.m1196Ujhhgtgfeyxiexzf(), false);
                                break;
                            } catch (C1863Ujhhgtgfeyxiexzf unused2) {
                            }
                        }
                        if (clsM562Ujhhgtgfeyxiexzf == String.class) {
                            objM1195Ujhhgtgfeyxiexzf = "null";
                        }
                    }
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 104), false);
                case Opcodes.LUSHR /* 125 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 105), false);
                case 126:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 106), false);
                case 127:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 107), false);
                case 128:
                case Opcodes.LOR /* 129 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, Opcodes.IDIV), false);
                case Opcodes.IXOR /* 130 */:
                case Opcodes.LXOR /* 131 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, UMErrorCode.E_UM_BE_JSON_FAILED), false);
                case Opcodes.IINC /* 132 */:
                case Opcodes.I2L /* 133 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 112), false);
                case Opcodes.I2F /* 134 */:
                case Opcodes.I2D /* 135 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, UMErrorCode.E_UM_BE_FILE_OVERSIZE), false);
                case Opcodes.L2I /* 136 */:
                case 137:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, Opcodes.INEG), false);
                case 138:
                case Opcodes.F2I /* 139 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, Opcodes.FNEG), false);
                case Opcodes.F2L /* 140 */:
                case 141:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 120), false);
                case Opcodes.D2I /* 142 */:
                case Opcodes.D2L /* 143 */:
                    return lhs.m1194Ujhhgtgfeyxiexzf(operation(objM1195Ujhhgtgfeyxiexzf, objEval, 122), false);
                default:
                    throw new C0712Ujhhgtgfeyxiexzf("unimplemented operator in assignment BSH");
            }
        } catch (C1863Ujhhgtgfeyxiexzf e2) {
            throw e2.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
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
            str = ": " + InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[this.operator.intValue()];
        }
        sb.append(str);
        return sb.toString();
    }
}
