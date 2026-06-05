package bsh;

import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAmbiguousName extends SimpleNode {
    private static final long serialVersionUID = 1;
    public String text;

    public BSHAmbiguousName(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        throw new C0712Ujhhgtgfeyxiexzf("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
    }

    public C0028Ujhhgtgfeyxiexzf getName(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        return c0029Ujhhgtgfeyxiexzf.m371Ujhhgtgfeyxiexzf(this.text);
    }

    public Class<?> toClass(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        try {
            return getName(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf()).m356Ujhhgtgfeyxiexzf();
        } catch (ClassNotFoundException e) {
            throw new C3354Ujhhgtgfeyxiexzf(e.getMessage(), this, c2637feyxiexzfUjhhgtg, e);
        } catch (C1863Ujhhgtgfeyxiexzf e2) {
            throw e2.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }

    public C0151Ujhhgtgfeyxiexzf toLHS(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        try {
            return getName(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf()).m357Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }

    public Object toObject(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return toObject(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, false);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.text;
    }

    public Object toObject(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, boolean z) throws C3353Ujhhgtgfeyxiexzf {
        try {
            return getName(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf()).m358Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, z);
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }
}
