package bsh;

import p000.AbstractC1687;
import p000.C0527;
import p000.C1231;
import p000.C2573;
import p000.C3581;

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

    /* JADX WARN: Code duplicated, block: B:43:0x00b4 A[Catch: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᤞᲇᲀ -> 0x002a, ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x0058, TRY_LEAVE, TryCatch #1 {ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x0058, blocks: (B:14:0x003d, B:16:0x0041, B:19:0x0047, B:20:0x0053, B:25:0x005b, B:34:0x007b, B:36:0x007f, B:41:0x00b0, B:43:0x00b4, B:38:0x0092, B:40:0x00a0, B:26:0x0060, B:27:0x006c, B:30:0x0072), top: B:54:0x003d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        LHS lhs;
        AbstractC1687 abstractC1687M549;
        AbstractC1687 abstractC1687M5410;
        Object objM376 = Primitive.VOID;
        try {
            C0012 c0012M2024 = c0527.m2024();
            BSHType typeNode = getTypeNode();
            Class<?> type = typeNode.getType(c0527, runnableC0008);
            if (isValType(typeNode) && !this.modifiers.hasModifier("final")) {
                this.modifiers.addModifier("final");
            }
            for (BSHVariableDeclarator bSHVariableDeclarator : getDeclarators()) {
                Object objEval = bSHVariableDeclarator.eval(typeNode, this.modifiers, c0527, runnableC0008);
                try {
                    if (c0012M2024.f535) {
                        Object obj = c0012M2024.f539;
                        if (obj != null) {
                            try {
                                abstractC1687M5410 = AbstractC0016.m549(c0012M2024.f538, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (C2573 unused) {
                                abstractC1687M5410 = null;
                            }
                            lhs = new LHS(obj, abstractC1687M5410);
                        } else {
                            Class cls = c0012M2024.f538;
                            try {
                                abstractC1687M549 = AbstractC0016.m549(cls, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (C2573 unused2) {
                                abstractC1687M549 = null;
                            }
                            lhs = new LHS((Object) cls, abstractC1687M549);
                        }
                    } else {
                        lhs = null;
                    }
                    if (lhs == null || lhs.field == null) {
                        runnableC0008.getClass();
                        c0012M2024.m386(bSHVariableDeclarator.name, type, objEval, this.modifiers);
                        if (!c0012M2024.f534) {
                            runnableC0008.f505.m365().mo302(c0012M2024.m377(bSHVariableDeclarator.name, false));
                        }
                        if (c0012M2024.f535) {
                            objM376 = objEval;
                        } else {
                            objM376 = c0012M2024.m376(bSHVariableDeclarator.name, true);
                        }
                    } else {
                        Variable variable = new Variable(bSHVariableDeclarator.name, type, lhs);
                        variable.modifiers = this.modifiers;
                        variable.setValue(objEval, 1);
                        c0012M2024.m387(variable);
                    }
                    if (c0012M2024.f535) {
                        objM376 = c0012M2024.m376(bSHVariableDeclarator.name, true);
                    } else {
                        objM376 = objEval;
                    }
                } catch (C3581 e) {
                    throw e.mo4677(this, c0527);
                }
            }
            return objM376;
        } catch (C1231 e2) {
            throw e2.mo2987("Typed variable declaration");
        }
    }

    public Class<?> evalType(C0527 c0527, RunnableC0008 runnableC0008) {
        return getTypeNode().getType(c0527, runnableC0008);
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
