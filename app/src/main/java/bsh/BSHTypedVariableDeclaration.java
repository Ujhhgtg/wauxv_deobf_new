package bsh;

import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHTypedVariableDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    private BSHVariableDeclarator[] bvda;
    public Modifiers modifiers;

    public BSHTypedVariableDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(3);
    }

    private BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    private boolean isValType(BSHType bSHType) {
        Node typeNode = bSHType.getTypeNode();
        return (typeNode instanceof BSHAmbiguousName) && "val".equals(((BSHAmbiguousName) typeNode).text);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b4 A[Catch: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ -> 0x002a, 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x0058, TRY_LEAVE, TryCatch #1 {上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x0058, blocks: (B:14:0x003d, B:16:0x0041, B:19:0x0047, B:20:0x0053, B:25:0x005b, B:34:0x007b, B:36:0x007f, B:41:0x00b0, B:43:0x00b4, B:38:0x0092, B:40:0x00a0, B:26:0x0060, B:27:0x006c, B:30:0x0072), top: B:54:0x003d, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf;
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg;
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg2;
        Object objM375Ujhhgtgfeyxiexzf = Primitive.VOID;
        try {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
            BSHType typeNode = getTypeNode();
            Class<?> type = typeNode.getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            if (isValType(typeNode) && !this.modifiers.hasModifier("final")) {
                this.modifiers.addModifier("final");
            }
            for (BSHVariableDeclarator bSHVariableDeclarator : getDeclarators()) {
                Object objEval = bSHVariableDeclarator.eval(typeNode, this.modifiers, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                try {
                    if (c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
                        Object obj = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf;
                        if (obj != null) {
                            try {
                                abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg2 = AbstractC0033Ujhhgtgfeyxiexzf.m548feyxiexzfUjhhgtg(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (C0958feyxiexzfUjhhgtg unused) {
                                abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg2 = null;
                            }
                            c0151Ujhhgtgfeyxiexzf = new C0151Ujhhgtgfeyxiexzf(abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg2, obj);
                        } else {
                            Class cls = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf;
                            try {
                                abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg = AbstractC0033Ujhhgtgfeyxiexzf.m548feyxiexzfUjhhgtg(cls, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (C0958feyxiexzfUjhhgtg unused2) {
                                abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg = null;
                            }
                            c0151Ujhhgtgfeyxiexzf = new C0151Ujhhgtgfeyxiexzf(abstractC0695UjhhgtgfeyxiexzfM548feyxiexzfUjhhgtg, (Object) cls);
                        }
                    } else {
                        c0151Ujhhgtgfeyxiexzf = null;
                    }
                    if (c0151Ujhhgtgfeyxiexzf == null || c0151Ujhhgtgfeyxiexzf.f1313Ujhhgtgfeyxiexzf == null) {
                        runnableC0026Ujhhgtgfeyxiexzf.getClass();
                        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(bSHVariableDeclarator.name, type, objEval, this.modifiers);
                        if (!c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf) {
                            runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf().m4131Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(bSHVariableDeclarator.name, false));
                        }
                        if (c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
                            objM375Ujhhgtgfeyxiexzf = objEval;
                        } else {
                            objM375Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf(bSHVariableDeclarator.name, true);
                        }
                    } else {
                        C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf = new C1853Ujhhgtgfeyxiexzf(bSHVariableDeclarator.name, type, c0151Ujhhgtgfeyxiexzf);
                        c1853Ujhhgtgfeyxiexzf.f6224Ujhhgtgfeyxiexzf = this.modifiers;
                        c1853Ujhhgtgfeyxiexzf.m3189Ujhhgtgfeyxiexzf(1, objEval);
                        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m386feyxiexzfUjhhgtg(c1853Ujhhgtgfeyxiexzf);
                    }
                    if (c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
                        objM375Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf(bSHVariableDeclarator.name, true);
                    } else {
                        objM375Ujhhgtgfeyxiexzf = objEval;
                    }
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
                }
            }
            return objM375Ujhhgtgfeyxiexzf;
        } catch (C3353Ujhhgtgfeyxiexzf e2) {
            throw e2.mo4859Ujhhgtgfeyxiexzf("Typed variable declaration");
        }
    }

    public Class<?> evalType(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return getTypeNode().getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    public BSHVariableDeclarator[] getDeclarators() {
        BSHVariableDeclarator[] bSHVariableDeclaratorArr = this.bvda;
        if (bSHVariableDeclaratorArr != null) {
            return bSHVariableDeclaratorArr;
        }
        int iJjtGetNumChildren = jjtGetNumChildren();
        this.bvda = new BSHVariableDeclarator[iJjtGetNumChildren - 1];
        for (int i = 1; i < iJjtGetNumChildren; i++) {
            this.bvda[i - 1] = (BSHVariableDeclarator) jjtGetChild(i);
        }
        return this.bvda;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.modifiers;
    }
}
