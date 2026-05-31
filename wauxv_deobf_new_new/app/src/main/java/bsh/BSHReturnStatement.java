package bsh;

import p000.AbstractC2844;
import p000.C0527;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    public int kind;
    public String label;

    public BSHReturnStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        String str = this.label;
        if (str != null) {
            return new ReturnControl(this.kind, str, (Node) this);
        }
        return new ReturnControl(this.kind, jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(c0527, runnableC0008) : Primitive.VOID, this);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC2374.f7613[this.kind]);
        sb.append(" ");
        return AbstractC2844.m4786(sb, this.label, ":");
    }
}
