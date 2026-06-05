package bsh;

import p000.C0920feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    String label;

    public BSHForStatement(int i) {
        super(i);
        this.blockId = C0019Ujhhgtgfeyxiexzf.f460feyxiexzfUjhhgtg.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        Node nodeJjtGetChild;
        int i;
        Node nodeJjtGetChild2;
        int i2;
        Node nodeJjtGetChild3;
        String str;
        int i3 = 0;
        if (this.hasForInit) {
            nodeJjtGetChild = jjtGetChild(0);
            i3 = 1;
        } else {
            nodeJjtGetChild = null;
        }
        if (this.hasExpression) {
            i = i3 + 1;
            nodeJjtGetChild2 = jjtGetChild(i3);
        } else {
            i = i3;
            nodeJjtGetChild2 = null;
        }
        if (this.hasForUpdate) {
            i2 = i + 1;
            nodeJjtGetChild3 = jjtGetChild(i);
        } else {
            i2 = i;
            nodeJjtGetChild3 = null;
        }
        Node nodeJjtGetChild4 = i2 < jjtGetNumChildren() ? jjtGetChild(i2) : null;
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(new C0019Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf, this.blockId));
        try {
            if (this.hasForInit) {
                nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            while (!Thread.interrupted() && (!this.hasExpression || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf))) {
                if (nodeJjtGetChild4 != null) {
                    Object objEval = nodeJjtGetChild4 instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild4).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, null) : nodeJjtGetChild4.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    if (objEval instanceof C0920feyxiexzfUjhhgtg) {
                        C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval;
                        String str2 = c0920feyxiexzfUjhhgtg.f3738Ujhhgtgfeyxiexzf;
                        if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                            return objEval;
                        }
                        int i4 = c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf;
                        if (i4 != 47) {
                            if (i4 == 13) {
                                break;
                            }
                        } else {
                            return objEval;
                        }
                    }
                }
                if (this.hasForUpdate) {
                    nodeJjtGetChild3.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                }
            }
            return Primitive.VOID;
        } finally {
            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.hasForInit + " ; " + this.hasExpression + " ; " + this.hasForUpdate;
    }
}
