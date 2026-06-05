package bsh;

import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    public int kind;
    public String label;

    public BSHReturnStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        String str = this.label;
        if (str != null) {
            int i = this.kind;
            C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = new C0920feyxiexzfUjhhgtg();
            c0920feyxiexzfUjhhgtg.f3738Ujhhgtgfeyxiexzf = null;
            c0920feyxiexzfUjhhgtg.f3739Ujhhgtgfeyxiexzf = Primitive.VOID;
            c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf = i;
            c0920feyxiexzfUjhhgtg.f3738Ujhhgtgfeyxiexzf = str;
            c0920feyxiexzfUjhhgtg.f3740Ujhhgtgfeyxiexzf = this;
            return c0920feyxiexzfUjhhgtg;
        }
        Object objEval = jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : Primitive.VOID;
        int i2 = this.kind;
        C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg2 = new C0920feyxiexzfUjhhgtg();
        c0920feyxiexzfUjhhgtg2.f3738Ujhhgtgfeyxiexzf = null;
        Primitive primitive = Primitive.TRUE;
        c0920feyxiexzfUjhhgtg2.f3737Ujhhgtgfeyxiexzf = i2;
        c0920feyxiexzfUjhhgtg2.f3739Ujhhgtgfeyxiexzf = objEval;
        c0920feyxiexzfUjhhgtg2.f3740Ujhhgtgfeyxiexzf = this;
        return c0920feyxiexzfUjhhgtg2;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[this.kind]);
        sb.append(" ");
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, this.label, ":");
    }
}
