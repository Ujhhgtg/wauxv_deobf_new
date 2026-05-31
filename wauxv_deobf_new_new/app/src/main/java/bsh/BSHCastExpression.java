package bsh;

import p000.C0527;
import p000.C1231;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHCastExpression extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHCastExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        try {
            return AbstractC0017.m559(0, ((BSHType) jjtGetChild(0)).getType(c0527, runnableC0008), jjtGetChild(1).eval(c0527, runnableC0008));
        } catch (C3581 e) {
            throw e.mo4677(this, c0527);
        }
    }
}
