package bsh;

import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayDimensions extends SimpleNode {
    private static final long serialVersionUID = 1;
    public Class<?> baseType;
    public int[] definedDimensions;
    public int numDefinedDims;
    public int numUndefinedDims;

    public BSHArrayDimensions(int i) {
        super(i);
    }

    public void addDefinedDimension() {
        this.numDefinedDims++;
    }

    public void addUndefinedDimension() {
        this.numUndefinedDims++;
    }

    public Object eval(Class<?> cls, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("array base type = ", cls);
        this.baseType = cls;
        return eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.numDefinedDims + ", " + this.numUndefinedDims;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        Node nodeJjtGetChild = jjtGetChild(0);
        if (nodeJjtGetChild instanceof BSHArrayInitializer) {
            Object objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(this.baseType, this.numUndefinedDims, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            if (objEval.getClass().isArray()) {
                int[] iArrM5056Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5056Ujhhgtgfeyxiexzf(objEval);
                this.definedDimensions = iArrM5056Ujhhgtgfeyxiexzf;
                if (-1 == this.numUndefinedDims) {
                    this.numUndefinedDims = iArrM5056Ujhhgtgfeyxiexzf.length;
                }
                if (iArrM5056Ujhhgtgfeyxiexzf.length != this.numUndefinedDims) {
                    StringBuilder sb = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                    sb.append(this.numUndefinedDims);
                    sb.append(" dimensional array, but initializer is a ");
                    throw new C3354Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.definedDimensions.length, " dimensional array"), this, c2637feyxiexzfUjhhgtg);
                }
            }
            return objEval;
        }
        this.definedDimensions = new int[this.numDefinedDims];
        for (int i = 0; i < this.numDefinedDims; i++) {
            try {
                this.definedDimensions[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf))).intValue();
            } catch (Exception e) {
                throw new C3354Ujhhgtgfeyxiexzf(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Array index: ", " length does not evaluate to an integer"), this, c2637feyxiexzfUjhhgtg, e);
            }
        }
        return Primitive.VOID;
    }
}
