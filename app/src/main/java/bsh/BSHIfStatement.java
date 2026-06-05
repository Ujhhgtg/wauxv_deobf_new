package bsh;

import p000.C0920feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isClosed;

    public BSHIfStatement(int i) {
        super(i);
    }

    public static boolean evaluateCondition(Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        Object objEval = node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (objEval != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objEval)).booleanValue();
        }
        throw new C3354Ujhhgtgfeyxiexzf("Condition evaluates to void type", node, c2637feyxiexzfUjhhgtg);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        Object objEval;
        if (evaluateCondition(jjtGetChild(0), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf)) {
            if (this.isClosed) {
                objEval = null;
            } else {
                objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
        } else if (jjtGetNumChildren() > 2) {
            objEval = jjtGetChild(2).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        } else if (this.isClosed) {
            objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        } else {
            objEval = null;
        }
        return objEval instanceof C0920feyxiexzfUjhhgtg ? objEval : Primitive.VOID;
    }
}
