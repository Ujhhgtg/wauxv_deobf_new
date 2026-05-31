package bsh;

import p000.C0527;
import p000.C1232;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHVariableDeclarator extends SimpleNode {
    private static final long serialVersionUID = 1;
    public int dimensions;
    public String name;

    public BSHVariableDeclarator(int i) {
        super(i);
        this.dimensions = 0;
    }

    private int getArrayDims(BSHType bSHType) {
        int i = this.dimensions;
        if (i > 0) {
            return i;
        }
        if (bSHType.getArrayDims() > 0) {
            return bSHType.getArrayDims();
        }
        return -1;
    }

    public Object eval(BSHType bSHType, Modifiers modifiers, C0527 c0527, RunnableC0008 runnableC0008) {
        Object objEval = null;
        if (!modifiers.hasModifier("final") && !Primitive.isWrapperType(bSHType.getBaseType())) {
            objEval = Primitive.getDefaultValue(bSHType.getBaseType());
        }
        if (jjtGetNumChildren() > 0) {
            Node nodeJjtGetChild = jjtGetChild(0);
            objEval = nodeJjtGetChild instanceof BSHArrayInitializer ? ((BSHArrayInitializer) nodeJjtGetChild).eval(bSHType.getBaseType(), getArrayDims(bSHType), c0527, runnableC0008) : nodeJjtGetChild.eval(c0527, runnableC0008);
        }
        if (objEval != Primitive.VOID) {
            return objEval;
        }
        throw new C1232("Void initializer.", this, c0527);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
