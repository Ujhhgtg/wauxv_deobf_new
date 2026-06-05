package bsh;

import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchLabel extends SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isDefault;

    public BSHSwitchLabel(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(this.isDefault ? "default" : "case");
        return sb.toString();
    }
}
