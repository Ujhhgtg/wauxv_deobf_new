package bsh;

import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHCastExpression extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHCastExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        try {
            return AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, ((BSHType) jjtGetChild(0)).getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf));
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }
}
