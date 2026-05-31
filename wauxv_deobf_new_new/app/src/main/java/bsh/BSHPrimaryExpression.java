package bsh;

import p000.C0527;
import p000.C1231;
import p000.C1232;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimaryExpression extends SimpleNode {
    private static final long serialVersionUID = 1;
    private Object cached;
    boolean isArrayExpression;
    boolean isMapExpression;

    public BSHPrimaryExpression(int i) {
        super(i);
        this.cached = null;
        this.isArrayExpression = false;
        this.isMapExpression = false;
    }

    public void clearCache() {
        this.cached = null;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        return eval(false, c0527, runnableC0008);
    }

    public void setArrayExpression(BSHArrayInitializer bSHArrayInitializer) {
        this.isArrayExpression = true;
        Node node = this.parent;
        if (!(node instanceof BSHAssignment) || ((BSHAssignment) node).operator == null) {
            return;
        }
        boolean z = ((BSHAssignment) node).operator.intValue() == 85;
        this.isMapExpression = z;
        if (z && (bSHArrayInitializer.jjtGetParent() instanceof BSHArrayInitializer)) {
            bSHArrayInitializer.setMapInArray(true);
        }
    }

    public LHS toLHS(C0527 c0527, RunnableC0008 runnableC0008) {
        runnableC0008.getClass();
        return (LHS) eval(!this.isMapExpression, c0527, runnableC0008);
    }

    private Object eval(boolean z, C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Object obj;
        if (this.isArrayExpression && (obj = this.cached) != null) {
            return obj;
        }
        Object[] objArrJjtGetChildren = jjtGetChildren();
        Object lhs = objArrJjtGetChildren[0];
        for (int i = 1; i < objArrJjtGetChildren.length; i++) {
            BSHPrimarySuffix bSHPrimarySuffix = (BSHPrimarySuffix) jjtGetChild(i);
            if (bSHPrimarySuffix.operation == 5 && i != objArrJjtGetChildren.length - 1) {
                throw new C1231("Method Reference must be the last suffix!", bSHPrimarySuffix, c0527);
            }
            lhs = bSHPrimarySuffix.doSuffix(lhs, z, c0527, runnableC0008);
        }
        if (lhs instanceof Node) {
            if (lhs instanceof BSHAmbiguousName) {
                lhs = z ? ((BSHAmbiguousName) lhs).toLHS(c0527, runnableC0008) : ((BSHAmbiguousName) lhs).toObject(c0527, runnableC0008);
            } else {
                if (z) {
                    throw new C1232("Can't assign to prefix.", this, c0527);
                }
                lhs = ((Node) lhs).eval(c0527, runnableC0008);
            }
        }
        if (this.isMapExpression) {
            if (lhs == Primitive.VOID) {
                throw new C1232("illegal use of undefined variable or 'void' literal", this, c0527);
            }
            lhs = new LHS(lhs);
        }
        if (this.isArrayExpression) {
            this.cached = lhs;
        }
        return lhs;
    }
}
