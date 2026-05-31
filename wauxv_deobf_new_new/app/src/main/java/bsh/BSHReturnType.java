package bsh;

import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnType extends SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean isVoid;

    public BSHReturnType(int i) {
        super(i);
    }

    public Class<?> evalReturnType(C0527 c0527, RunnableC0008 runnableC0008) {
        return this.isVoid ? Void.TYPE : getTypeNode().getType(c0527, runnableC0008);
    }

    public String getTypeDescriptor(C0527 c0527, RunnableC0008 runnableC0008, String str) {
        return this.isVoid ? "V" : getTypeNode().getTypeDescriptor(c0527, runnableC0008, str);
    }

    public BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": void=" + this.isVoid;
    }
}
