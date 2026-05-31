package bsh;

import p000.C0527;
import p000.C1232;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHArguments extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHArguments(int i) {
        super(i);
    }

    public Object[] getArguments(C0527 c0527, RunnableC0008 runnableC0008) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        Object[] objArr = new Object[iJjtGetNumChildren];
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            Object objEval = jjtGetChild(i).eval(c0527, runnableC0008);
            objArr[i] = objEval;
            if (objEval == Primitive.VOID) {
                throw new C1232("Undefined argument: " + jjtGetChild(i).getText(), this, c0527);
            }
        }
        return objArr;
    }
}
