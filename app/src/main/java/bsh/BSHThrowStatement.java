package bsh;

import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHThrowStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf, C1985Ujhhgtgfeyxiexzf {
        Object objEval = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (objEval instanceof Throwable) {
            throw new C1985Ujhhgtgfeyxiexzf((Throwable) objEval, this, c2637feyxiexzfUjhhgtg);
        }
        throw new C3354Ujhhgtgfeyxiexzf("Expression in 'throw' must be Throwable type", this, c2637feyxiexzfUjhhgtg);
    }
}
