package bsh;

import p000.C0527;
import p000.C1232;
import p000.C2954;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHThrowStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1232, C2954 {
        Object objEval = jjtGetChild(0).eval(c0527, runnableC0008);
        if (objEval instanceof Throwable) {
            throw new C2954((Throwable) objEval, this, c0527);
        }
        throw new C1232("Expression in 'throw' must be Throwable type", this, c0527);
    }
}
