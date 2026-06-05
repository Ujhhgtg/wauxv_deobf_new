package bsh;

import p000.C0920feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    boolean isDoStatement;
    String label;

    public BSHWhileStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        Node nodeJjtGetChild;
        Node nodeJjtGetChild2;
        int i;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            nodeJjtGetChild2 = jjtGetChild(1);
            nodeJjtGetChild = jjtGetChild(0);
        } else {
            Node nodeJjtGetChild3 = jjtGetChild(0);
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            nodeJjtGetChild2 = nodeJjtGetChild3;
        }
        for (boolean z = this.isDoStatement; !Thread.interrupted() && (z || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf)); z = false) {
            if (nodeJjtGetChild != null) {
                Object objEval = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, null) : nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                if (objEval instanceof C0920feyxiexzfUjhhgtg) {
                    C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval;
                    String str2 = c0920feyxiexzfUjhhgtg.f3738Ujhhgtgfeyxiexzf;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i = c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf) == 47) {
                        return objEval;
                    }
                    if (i == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": do=" + this.isDoStatement;
    }
}
