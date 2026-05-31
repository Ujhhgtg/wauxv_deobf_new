package bsh;

import java.util.Iterator;
import p000.AbstractC0738;
import p000.C0405;
import p000.C0527;
import p000.C1231;
import p000.C1893;
import p000.C3581;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements InterfaceC2374 {
    private static final long serialVersionUID = 1;
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    public BSHEnhancedForStatement(int i) {
        super(i);
        this.isFinal = false;
        this.blockId = C0002.f466.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Node nodeJjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        C0012 c0012M2024 = c0527.m2024();
        Node nodeJjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (nodeJjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) nodeJjtGetChild2).getType(c0527, runnableC0008);
            Node nodeJjtGetChild3 = jjtGetChild(1);
            Node nodeJjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            nodeJjtGetChild2 = nodeJjtGetChild3;
            nodeJjtGetChild = nodeJjtGetChild4;
        } else {
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Object objEval = nodeJjtGetChild2.eval(c0527, runnableC0008);
        synchronized (AbstractC0738.class) {
        }
        Iterator itM2269 = AbstractC0738.m2269(objEval);
        try {
            int i = this.blockId;
            C1893 c1893 = C0002.f467;
            C0405 c0405 = new C0405();
            c0405.f1958 = c0012M2024;
            c0405.f1959 = i;
            C0002 c0002 = (C0002) c1893.m3819(c0405);
            c0002.clear();
            c0527.m2023(c0002);
            while (!Thread.interrupted() && itM2269.hasNext()) {
                try {
                    Object next = itM2269.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    c0002.clear();
                    c0002.m386(this.varName, cls, next, modifiers);
                    if (nodeJjtGetChild != null) {
                        Object objEval2 = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(c0527, runnableC0008, null) : nodeJjtGetChild.eval(c0527, runnableC0008);
                        if (objEval2 instanceof ReturnControl) {
                            ReturnControl returnControl = (ReturnControl) objEval2;
                            String str2 = returnControl.label;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                c0527.m2023(c0012M2024);
                                return objEval2;
                            }
                            int i2 = returnControl.kind;
                            if (i2 == 47) {
                                c0527.m2023(c0012M2024);
                                return objEval2;
                            }
                            if (i2 == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (C3581 e) {
                    throw e.mo4678("for loop iterator variable:" + this.varName, this, c0527);
                }
            }
            Primitive primitive = Primitive.VOID;
            c0527.m2023(c0012M2024);
            return primitive;
        } catch (Throwable th) {
            c0527.m2023(c0012M2024);
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.varName + ", final=" + this.isFinal;
    }
}
