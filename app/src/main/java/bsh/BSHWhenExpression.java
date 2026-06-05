package bsh;

import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;

    public BSHWhenExpression(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C3353Ujhhgtgfeyxiexzf {
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            return false;
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2) {
            obj = null;
        }
        if (obj2 == primitive2) {
            obj2 = null;
        }
        if (obj == null || obj2 == null) {
            return obj == obj2;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC0031Ujhhgtgfeyxiexzf.m391Ujhhgtgfeyxiexzf(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2570Ujhhgtgfeyxiexzf("When value: " + node.getText() + ": ", this, c2637feyxiexzfUjhhgtg);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (iJjtGetNumChildren < 2) {
            throw new C3354Ujhhgtgfeyxiexzf("Empty when expression.", this, c2637feyxiexzfUjhhgtg);
        }
        for (int i = 1; i < iJjtGetNumChildren; i++) {
            if (((BSHWhenEntry) jjtGetChild(i)).isElse && i != iJjtGetNumChildren - 1) {
                throw new C3354Ujhhgtgfeyxiexzf("Else branch must be the last one in when expression.", this, c2637feyxiexzfUjhhgtg);
            }
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        for (int i2 = 1; i2 < iJjtGetNumChildren; i2++) {
            BSHWhenEntry bSHWhenEntry = (BSHWhenEntry) jjtGetChild(i2);
            if (bSHWhenEntry.isElse) {
                return bSHWhenEntry.evalResult(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            for (int i3 = 0; i3 < bSHWhenEntry.numConditions; i3++) {
                if (primitiveEquals(objEval, bSHWhenEntry.jjtGetChild(i3).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), c2637feyxiexzfUjhhgtg, nodeJjtGetChild)) {
                    return bSHWhenEntry.evalResult(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                }
            }
        }
        throw new C3354Ujhhgtgfeyxiexzf("No matching when branch.", this, c2637feyxiexzfUjhhgtg);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ": when");
    }
}
