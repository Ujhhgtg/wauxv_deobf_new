package bsh;

import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C3581;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;

    public BSHSwitchStatement(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, C0527 c0527, Node node) throws C1231 {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC0014.m392(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (C3581 e) {
            throw e.mo4678("Switch value: " + node.getText() + ": ", this, c0527);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        int i;
        int iJjtGetNumChildren = jjtGetNumChildren();
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(c0527, runnableC0008);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            c0527.m2024().m379(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new C1232("Empty switch statement.", this, c0527);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        ReturnControl returnControl = null;
        int i2 = 2;
        while (i2 < iJjtGetNumChildren && returnControl == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(c0527, runnableC0008), c0527, nodeJjtGetChild)) {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    Node nodeJjtGetChild2 = jjtGetChild(i2);
                    if (!(nodeJjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = nodeJjtGetChild2.eval(c0527, runnableC0008);
                        if (objEval2 instanceof ReturnControl) {
                            returnControl = (ReturnControl) objEval2;
                            i2 = i;
                            break;
                        }
                    }
                    i2 = i;
                }
            } else {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    Node nodeJjtGetChild3 = jjtGetChild(i2);
                    if (nodeJjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) nodeJjtGetChild3;
                        i2 = i;
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
        }
        return (returnControl == null || returnControl.kind != 47) ? Primitive.VOID : returnControl;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC2844.m4786(new StringBuilder(), super.toString(), ": switch");
    }
}
