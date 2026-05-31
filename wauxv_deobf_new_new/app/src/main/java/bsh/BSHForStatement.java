package bsh;

import p000.C0527;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    String label;

    public BSHForStatement(int i) {
        super(i);
        this.blockId = C0002.f466.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        Node nodeJjtGetChild;
        int i;
        Node nodeJjtGetChild2;
        int i2;
        Node nodeJjtGetChild3;
        String str;
        int i3 = 0;
        if (this.hasForInit) {
            nodeJjtGetChild = jjtGetChild(0);
            i3 = 1;
        } else {
            nodeJjtGetChild = null;
        }
        if (this.hasExpression) {
            i = i3 + 1;
            nodeJjtGetChild2 = jjtGetChild(i3);
        } else {
            i = i3;
            nodeJjtGetChild2 = null;
        }
        if (this.hasForUpdate) {
            i2 = i + 1;
            nodeJjtGetChild3 = jjtGetChild(i);
        } else {
            i2 = i;
            nodeJjtGetChild3 = null;
        }
        Node nodeJjtGetChild4 = i2 < jjtGetNumChildren() ? jjtGetChild(i2) : null;
        C0012 c0012M2024 = c0527.m2024();
        c0527.m2023(new C0002(c0012M2024, this.blockId));
        try {
            if (this.hasForInit) {
                nodeJjtGetChild.eval(c0527, runnableC0008);
            }
            while (!Thread.interrupted() && (!this.hasExpression || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, c0527, runnableC0008))) {
                if (nodeJjtGetChild4 != null) {
                    Object objEval = nodeJjtGetChild4 instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild4).eval(c0527, runnableC0008, null) : nodeJjtGetChild4.eval(c0527, runnableC0008);
                    if (objEval instanceof ReturnControl) {
                        ReturnControl returnControl = (ReturnControl) objEval;
                        String str2 = returnControl.label;
                        if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                            return objEval;
                        }
                        int i4 = returnControl.kind;
                        if (i4 != 47) {
                            if (i4 == 13) {
                                break;
                            }
                        } else {
                            return objEval;
                        }
                    }
                }
                if (this.hasForUpdate) {
                    nodeJjtGetChild3.eval(c0527, runnableC0008);
                }
            }
            return Primitive.VOID;
        } finally {
            c0527.m2023(c0012M2024);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.hasForInit + " ; " + this.hasExpression + " ; " + this.hasForUpdate;
    }
}
