package bsh;

import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHArguments extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHArguments(int i) {
        super(i);
    }

    public Object[] getArguments(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        Object[] objArr = new Object[iJjtGetNumChildren];
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            Object objEval = jjtGetChild(i).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            objArr[i] = objEval;
            if (objEval == Primitive.VOID) {
                throw new C3354Ujhhgtgfeyxiexzf("Undefined argument: " + jjtGetChild(i).getText(), this, c2637feyxiexzfUjhhgtg);
            }
        }
        return objArr;
    }
}
