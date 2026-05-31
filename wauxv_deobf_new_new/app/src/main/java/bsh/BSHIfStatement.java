package bsh;

import p000.C0527;
import p000.C1232;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isClosed;

    public BSHIfStatement(int i) {
        super(i);
    }

    public static boolean evaluateCondition(Node node, C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        Object objEval = node.eval(c0527, runnableC0008);
        if (objEval != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objEval)).booleanValue();
        }
        throw new C1232("Condition evaluates to void type", node, c0527);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        Object objEval;
        if (evaluateCondition(jjtGetChild(0), c0527, runnableC0008)) {
            if (this.isClosed) {
                objEval = null;
            } else {
                objEval = jjtGetChild(1).eval(c0527, runnableC0008);
            }
        } else if (jjtGetNumChildren() > 2) {
            objEval = jjtGetChild(2).eval(c0527, runnableC0008);
        } else if (this.isClosed) {
            objEval = jjtGetChild(1).eval(c0527, runnableC0008);
        } else {
            objEval = null;
        }
        return objEval instanceof ReturnControl ? objEval : Primitive.VOID;
    }
}
