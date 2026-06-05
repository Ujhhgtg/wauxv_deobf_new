package bsh;

import java.lang.reflect.Array;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameter extends SimpleNode {
    public static final Class UNTYPED = null;
    private static final long serialVersionUID = 1;
    int dimensions;
    boolean isFinal;
    boolean isVarArgs;
    public String name;
    public Class type;

    public BSHFormalParameter(int i) {
        super(i);
        this.isFinal = false;
        this.isVarArgs = false;
        this.dimensions = 0;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        if (jjtGetNumChildren() > 0) {
            Class<?> type = ((BSHType) jjtGetChild(0)).getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            this.type = type;
            if (this.dimensions > 0) {
                if (type.isArray()) {
                    throw new C3353Ujhhgtgfeyxiexzf("Array dimensions not allowed on both type and name: " + this.name, this, null);
                }
                this.type = Array.newInstance((Class<?>) this.type, new int[this.dimensions]).getClass();
            }
        } else {
            this.type = UNTYPED;
        }
        if (this.isVarArgs) {
            this.type = Array.newInstance((Class<?>) this.type, 0).getClass();
        }
        return this.type;
    }

    public String getTypeDescriptor(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        if (jjtGetNumChildren() <= 0) {
            return (this.isVarArgs ? "[" : "").concat("Ljava/lang/Object;");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.isVarArgs ? "[" : "");
        sb.append(((BSHType) jjtGetChild(0)).getTypeDescriptor(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, str));
        return sb.toString();
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name + ", final=" + this.isFinal + ", varargs=" + this.isVarArgs;
    }
}
