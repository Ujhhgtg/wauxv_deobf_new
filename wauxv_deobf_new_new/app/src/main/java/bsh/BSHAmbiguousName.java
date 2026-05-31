package bsh;

import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1684;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAmbiguousName extends SimpleNode {
    private static final long serialVersionUID = 1;
    public String text;

    public BSHAmbiguousName(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        throw new C1684("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
    }

    public C0010 getName(C0012 c0012) {
        return c0012.m372(this.text);
    }

    public Class<?> toClass(C0527 c0527, RunnableC0008 runnableC0008) {
        try {
            return getName(c0527.m2024()).m358();
        } catch (ClassNotFoundException e) {
            throw new C1232(e.getMessage(), this, c0527, e);
        } catch (C3581 e2) {
            throw e2.mo4677(this, c0527);
        }
    }

    public LHS toLHS(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        try {
            return getName(c0527.m2024()).m359(c0527, runnableC0008);
        } catch (C3581 e) {
            throw e.mo4677(this, c0527);
        }
    }

    public Object toObject(C0527 c0527, RunnableC0008 runnableC0008) {
        return toObject(c0527, runnableC0008, false);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.text;
    }

    public Object toObject(C0527 c0527, RunnableC0008 runnableC0008, boolean z) throws C1231 {
        try {
            return getName(c0527.m2024()).m360(c0527, runnableC0008, z);
        } catch (C3581 e) {
            throw e.mo4677(this, c0527);
        }
    }
}
