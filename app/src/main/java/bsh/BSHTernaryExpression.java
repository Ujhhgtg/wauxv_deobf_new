package bsh;

import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHTernaryExpression extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHTernaryExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return BSHIfStatement.evaluateCondition(jjtGetChild(0), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) ? jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : jjtGetChild(2).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }
}
