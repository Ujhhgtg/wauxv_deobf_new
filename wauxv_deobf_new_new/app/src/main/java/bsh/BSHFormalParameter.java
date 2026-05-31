package bsh;

import java.lang.reflect.Array;
import p000.C0527;
import p000.C1231;

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
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        if (jjtGetNumChildren() > 0) {
            Class<?> type = ((BSHType) jjtGetChild(0)).getType(c0527, runnableC0008);
            this.type = type;
            if (this.dimensions > 0) {
                if (type.isArray()) {
                    throw new C1231("Array dimensions not allowed on both type and name: " + this.name, this, null);
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

    public String getTypeDescriptor(C0527 c0527, RunnableC0008 runnableC0008, String str) {
        if (jjtGetNumChildren() <= 0) {
            return (this.isVarArgs ? "[" : "").concat("Ljava/lang/Object;");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.isVarArgs ? "[" : "");
        sb.append(((BSHType) jjtGetChild(0)).getTypeDescriptor(c0527, runnableC0008, str));
        return sb.toString();
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name + ", final=" + this.isFinal + ", varargs=" + this.isVarArgs;
    }
}
