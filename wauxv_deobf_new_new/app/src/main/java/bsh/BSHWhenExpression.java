package bsh;

import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C3581;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;

    public BSHWhenExpression(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, C0527 c0527, Node node) throws C1231 {
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
            return Primitive.unwrap(AbstractC0014.m392(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (C3581 e) {
            throw e.mo4678("When value: " + node.getText() + ": ", this, c0527);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (iJjtGetNumChildren < 2) {
            throw new C1232("Empty when expression.", this, c0527);
        }
        for (int i = 1; i < iJjtGetNumChildren; i++) {
            if (((BSHWhenEntry) jjtGetChild(i)).isElse && i != iJjtGetNumChildren - 1) {
                throw new C1232("Else branch must be the last one in when expression.", this, c0527);
            }
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(c0527, runnableC0008);
        for (int i2 = 1; i2 < iJjtGetNumChildren; i2++) {
            BSHWhenEntry bSHWhenEntry = (BSHWhenEntry) jjtGetChild(i2);
            if (bSHWhenEntry.isElse) {
                return bSHWhenEntry.evalResult(c0527, runnableC0008);
            }
            for (int i3 = 0; i3 < bSHWhenEntry.numConditions; i3++) {
                if (primitiveEquals(objEval, bSHWhenEntry.jjtGetChild(i3).eval(c0527, runnableC0008), c0527, nodeJjtGetChild)) {
                    return bSHWhenEntry.evalResult(c0527, runnableC0008);
                }
            }
        }
        throw new C1232("No matching when branch.", this, c0527);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC2844.m4786(new StringBuilder(), super.toString(), ": when");
    }
}
