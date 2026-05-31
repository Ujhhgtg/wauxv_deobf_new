package bsh;

import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHImportDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean importPackage;
    public boolean staticImport;
    public boolean superImport;

    public BSHImportDeclaration(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Class clsM363;
        C0012 c0012M2024 = c0527.m2024();
        if (this.superImport) {
            try {
                c0012M2024.m365().mo306();
            } catch (C3581 e) {
                throw e.mo4677(this, c0527);
            }
        } else {
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(0);
            if (!this.staticImport) {
                String str = bSHAmbiguousName.text;
                if (this.importPackage) {
                    c0012M2024.mo315(str);
                } else {
                    c0012M2024.mo314(str);
                }
            } else {
                if (!this.importPackage) {
                    String strM352 = C0010.m352(1, bSHAmbiguousName.text);
                    Object object = null;
                    try {
                        String str2 = bSHAmbiguousName.text;
                        clsM363 = c0012M2024.m363(C0010.m351(C0010.m348(str2) - 1, str2));
                        try {
                            object = AbstractC0016.m553(clsM363, strM352);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        clsM363 = null;
                    }
                    if (clsM363 != null && object == null) {
                        try {
                            object = AbstractC0016.m533(clsM363, strM352);
                        } catch (Exception unused3) {
                        }
                    }
                    if (object == null) {
                        try {
                            object = bSHAmbiguousName.toObject(c0527, runnableC0008);
                        } catch (Exception unused4) {
                        }
                    }
                    if (object instanceof BshMethod) {
                        c0012M2024.mo316((BshMethod) object);
                        return Primitive.VOID;
                    }
                    if (!(object instanceof LHS)) {
                        object = bSHAmbiguousName.toLHS(c0527, runnableC0008);
                    }
                    if (object instanceof LHS) {
                        LHS lhs = (LHS) object;
                        if (lhs.isStatic()) {
                            c0012M2024.m387(lhs.getVariable());
                            return Primitive.VOID;
                        }
                    }
                    throw new C1232(AbstractC2844.m4786(new StringBuilder(), bSHAmbiguousName.text, " is not a static member of a class"), this, c0527);
                }
                c0012M2024.m379(bSHAmbiguousName.toClass(c0527, runnableC0008));
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.staticImport + ", *=" + this.importPackage + ", super import=" + this.superImport;
    }
}
