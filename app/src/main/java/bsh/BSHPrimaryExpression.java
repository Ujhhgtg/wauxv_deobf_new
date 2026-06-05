package bsh;

import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

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
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return eval(false, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
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

    public C0151Ujhhgtgfeyxiexzf toLHS(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        runnableC0026Ujhhgtgfeyxiexzf.getClass();
        return (C0151Ujhhgtgfeyxiexzf) eval(!this.isMapExpression, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    private Object eval(boolean z, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Object obj;
        if (this.isArrayExpression && (obj = this.cached) != null) {
            return obj;
        }
        Object[] objArrJjtGetChildren = jjtGetChildren();
        Object c0151Ujhhgtgfeyxiexzf = objArrJjtGetChildren[0];
        for (int i = 1; i < objArrJjtGetChildren.length; i++) {
            BSHPrimarySuffix bSHPrimarySuffix = (BSHPrimarySuffix) jjtGetChild(i);
            if (bSHPrimarySuffix.operation == 5 && i != objArrJjtGetChildren.length - 1) {
                throw new C3353Ujhhgtgfeyxiexzf("Method Reference must be the last suffix!", bSHPrimarySuffix, c2637feyxiexzfUjhhgtg);
            }
            c0151Ujhhgtgfeyxiexzf = bSHPrimarySuffix.doSuffix(c0151Ujhhgtgfeyxiexzf, z, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        if (c0151Ujhhgtgfeyxiexzf instanceof Node) {
            if (c0151Ujhhgtgfeyxiexzf instanceof BSHAmbiguousName) {
                c0151Ujhhgtgfeyxiexzf = z ? ((BSHAmbiguousName) c0151Ujhhgtgfeyxiexzf).toLHS(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : ((BSHAmbiguousName) c0151Ujhhgtgfeyxiexzf).toObject(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            } else {
                if (z) {
                    throw new C3354Ujhhgtgfeyxiexzf("Can't assign to prefix.", this, c2637feyxiexzfUjhhgtg);
                }
                c0151Ujhhgtgfeyxiexzf = ((Node) c0151Ujhhgtgfeyxiexzf).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
        }
        if (this.isMapExpression) {
            if (c0151Ujhhgtgfeyxiexzf == Primitive.VOID) {
                throw new C3354Ujhhgtgfeyxiexzf("illegal use of undefined variable or 'void' literal", this, c2637feyxiexzfUjhhgtg);
            }
            c0151Ujhhgtgfeyxiexzf = new C0151Ujhhgtgfeyxiexzf(c0151Ujhhgtgfeyxiexzf);
        }
        if (this.isArrayExpression) {
            this.cached = c0151Ujhhgtgfeyxiexzf;
        }
        return c0151Ujhhgtgfeyxiexzf;
    }
}
