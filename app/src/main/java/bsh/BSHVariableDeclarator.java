package bsh;

import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

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

    public Object eval(BSHType bSHType, Modifiers modifiers, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        Object objEval = null;
        if (!modifiers.hasModifier("final") && !Primitive.isWrapperType(bSHType.getBaseType())) {
            objEval = Primitive.getDefaultValue(bSHType.getBaseType());
        }
        if (jjtGetNumChildren() > 0) {
            Node nodeJjtGetChild = jjtGetChild(0);
            objEval = nodeJjtGetChild instanceof BSHArrayInitializer ? ((BSHArrayInitializer) nodeJjtGetChild).eval(bSHType.getBaseType(), getArrayDims(bSHType), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        if (objEval != Primitive.VOID) {
            return objEval;
        }
        throw new C3354Ujhhgtgfeyxiexzf("Void initializer.", this, c2637feyxiexzfUjhhgtg);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
