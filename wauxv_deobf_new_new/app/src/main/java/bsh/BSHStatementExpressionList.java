package bsh;

import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHStatementExpressionList extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHStatementExpressionList(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            jjtGetChild(i).eval(c0527, runnableC0008);
        }
        return Primitive.VOID;
    }
}
