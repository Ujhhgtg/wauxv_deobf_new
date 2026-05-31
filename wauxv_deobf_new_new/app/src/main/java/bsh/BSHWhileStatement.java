package bsh;

import p000.C0527;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    boolean isDoStatement;
    String label;

    public BSHWhileStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        Node nodeJjtGetChild;
        Node nodeJjtGetChild2;
        int i;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            nodeJjtGetChild2 = jjtGetChild(1);
            nodeJjtGetChild = jjtGetChild(0);
        } else {
            Node nodeJjtGetChild3 = jjtGetChild(0);
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            nodeJjtGetChild2 = nodeJjtGetChild3;
        }
        for (boolean z = this.isDoStatement; !Thread.interrupted() && (z || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, c0527, runnableC0008)); z = false) {
            if (nodeJjtGetChild != null) {
                Object objEval = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(c0527, runnableC0008, null) : nodeJjtGetChild.eval(c0527, runnableC0008);
                if (objEval instanceof ReturnControl) {
                    ReturnControl returnControl = (ReturnControl) objEval;
                    String str2 = returnControl.label;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i = returnControl.kind) == 47) {
                        return objEval;
                    }
                    if (i == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": do=" + this.isDoStatement;
    }
}
