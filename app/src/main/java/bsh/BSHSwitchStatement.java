package bsh;

import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;

    public BSHSwitchStatement(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C3353Ujhhgtgfeyxiexzf {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC0031Ujhhgtgfeyxiexzf.m391Ujhhgtgfeyxiexzf(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2570Ujhhgtgfeyxiexzf("Switch value: " + node.getText() + ": ", this, c2637feyxiexzfUjhhgtg);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        int i;
        int iJjtGetNumChildren = jjtGetNumChildren();
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().m378Ujhhgtgfeyxiexzf(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new C3354Ujhhgtgfeyxiexzf("Empty switch statement.", this, c2637feyxiexzfUjhhgtg);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = null;
        int i2 = 2;
        while (i2 < iJjtGetNumChildren && c0920feyxiexzfUjhhgtg == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), c2637feyxiexzfUjhhgtg, nodeJjtGetChild)) {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    Node nodeJjtGetChild2 = jjtGetChild(i2);
                    if (!(nodeJjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = nodeJjtGetChild2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        if (objEval2 instanceof C0920feyxiexzfUjhhgtg) {
                            c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval2;
                            i2 = i;
                            break;
                        }
                    }
                    i2 = i;
                }
            } else {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    Node nodeJjtGetChild3 = jjtGetChild(i2);
                    if (nodeJjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) nodeJjtGetChild3;
                        i2 = i;
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
        }
        return (c0920feyxiexzfUjhhgtg == null || c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf != 47) ? Primitive.VOID : c0920feyxiexzfUjhhgtg;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ": switch");
    }
}
