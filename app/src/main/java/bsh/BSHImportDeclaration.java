package bsh;

import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

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
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Class clsM362Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        if (this.superImport) {
            try {
                c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m361Ujhhgtgfeyxiexzf();
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        } else {
            boolean zM3188Ujhhgtgfeyxiexzf = false;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(0);
            if (!this.staticImport) {
                String str = bSHAmbiguousName.text;
                if (this.importPackage) {
                    c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.mo301Ujhhgtgfeyxiexzf(str);
                } else {
                    c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.mo300Ujhhgtgfeyxiexzf(str);
                }
            } else {
                if (!this.importPackage) {
                    String strM350Ujhhgtgfeyxiexzf = C0028Ujhhgtgfeyxiexzf.m350Ujhhgtgfeyxiexzf(1, bSHAmbiguousName.text);
                    Object object = null;
                    try {
                        String str2 = bSHAmbiguousName.text;
                        clsM362Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf(C0028Ujhhgtgfeyxiexzf.m349Ujhhgtgfeyxiexzf(C0028Ujhhgtgfeyxiexzf.m346Ujhhgtgfeyxiexzf(str2) - 1, str2));
                        try {
                            object = AbstractC0033Ujhhgtgfeyxiexzf.m552feyxiexzfUjhhgtg(clsM362Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        clsM362Ujhhgtgfeyxiexzf = null;
                    }
                    if (clsM362Ujhhgtgfeyxiexzf != null && object == null) {
                        try {
                            object = AbstractC0033Ujhhgtgfeyxiexzf.m532Ujhhgtgfeyxiexzf(clsM362Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf);
                        } catch (Exception unused3) {
                        }
                    }
                    if (object == null) {
                        try {
                            object = bSHAmbiguousName.toObject(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        } catch (Exception unused4) {
                        }
                    }
                    if (object instanceof C0021Ujhhgtgfeyxiexzf) {
                        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.mo302feyxiexzfUjhhgtg((C0021Ujhhgtgfeyxiexzf) object);
                        return Primitive.VOID;
                    }
                    if (!(object instanceof C0151Ujhhgtgfeyxiexzf)) {
                        object = bSHAmbiguousName.toLHS(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    }
                    if (object instanceof C0151Ujhhgtgfeyxiexzf) {
                        C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf = (C0151Ujhhgtgfeyxiexzf) object;
                        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = c0151Ujhhgtgfeyxiexzf.f1313Ujhhgtgfeyxiexzf;
                        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
                            zM3188Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.mo1972Ujhhgtgfeyxiexzf();
                        } else {
                            C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf = c0151Ujhhgtgfeyxiexzf.f1316Ujhhgtgfeyxiexzf;
                            if (c1853Ujhhgtgfeyxiexzf != null) {
                                zM3188Ujhhgtgfeyxiexzf = c1853Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("static");
                            }
                        }
                        if (zM3188Ujhhgtgfeyxiexzf) {
                            c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m386feyxiexzfUjhhgtg(c0151Ujhhgtgfeyxiexzf.m1197Ujhhgtgfeyxiexzf());
                            return Primitive.VOID;
                        }
                    }
                    throw new C3354Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), bSHAmbiguousName.text, " is not a static member of a class"), this, c2637feyxiexzfUjhhgtg);
                }
                c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m378Ujhhgtgfeyxiexzf(bSHAmbiguousName.toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf));
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.staticImport + ", *=" + this.importPackage + ", super import=" + this.superImport;
    }
}
