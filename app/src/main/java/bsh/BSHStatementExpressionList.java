package bsh;

import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHStatementExpressionList extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHStatementExpressionList(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            jjtGetChild(i).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        return Primitive.VOID;
    }
}
