package bsh;

import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHTernaryExpression extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHTernaryExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        return BSHIfStatement.evaluateCondition(jjtGetChild(0), c0527, runnableC0008) ? jjtGetChild(1).eval(c0527, runnableC0008) : jjtGetChild(2).eval(c0527, runnableC0008);
    }
}
