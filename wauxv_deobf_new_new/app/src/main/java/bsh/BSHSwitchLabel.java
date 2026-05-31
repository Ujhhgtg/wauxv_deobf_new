package bsh;

import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchLabel extends SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isDefault;

    public BSHSwitchLabel(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        return jjtGetChild(0).eval(c0527, runnableC0008);
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
