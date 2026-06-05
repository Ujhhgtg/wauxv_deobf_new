package bsh;

import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnType extends SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean isVoid;

    public BSHReturnType(int i) {
        super(i);
    }

    public Class<?> evalReturnType(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return this.isVoid ? Void.TYPE : getTypeNode().getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    public String getTypeDescriptor(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        return this.isVoid ? "V" : getTypeNode().getTypeDescriptor(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, str);
    }

    public BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": void=" + this.isVoid;
    }
}
