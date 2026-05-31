package bsh;

import p000.AbstractC1095;
import p000.AbstractC1468;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1232;

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

    public Object eval(Class<?> cls, C0527 c0527, RunnableC0008 runnableC0008) {
        RunnableC0008.m333("array base type = ", cls);
        this.baseType = cls;
        return eval(c0527, runnableC0008);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.numDefinedDims + ", " + this.numUndefinedDims;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        Node nodeJjtGetChild = jjtGetChild(0);
        if (nodeJjtGetChild instanceof BSHArrayInitializer) {
            Object objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(this.baseType, this.numUndefinedDims, c0527, runnableC0008);
            if (objEval.getClass().isArray()) {
                int[] iArrM3304 = AbstractC1468.m3304(objEval);
                this.definedDimensions = iArrM3304;
                if (-1 == this.numUndefinedDims) {
                    this.numUndefinedDims = iArrM3304.length;
                }
                if (iArrM3304.length != this.numUndefinedDims) {
                    StringBuilder sb = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                    sb.append(this.numUndefinedDims);
                    sb.append(" dimensional array, but initializer is a ");
                    throw new C1232(AbstractC2844.m4785(sb, this.definedDimensions.length, " dimensional array"), this, c0527);
                }
            }
            return objEval;
        }
        this.definedDimensions = new int[this.numDefinedDims];
        for (int i = 0; i < this.numDefinedDims; i++) {
            try {
                this.definedDimensions[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i).eval(c0527, runnableC0008))).intValue();
            } catch (Exception e) {
                throw new C1232(AbstractC1095.m2795(i, "Array index: ", " length does not evaluate to an integer"), this, c0527, e);
            }
        }
        return Primitive.VOID;
    }
}
