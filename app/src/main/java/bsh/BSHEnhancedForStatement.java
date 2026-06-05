package bsh;

import java.util.Iterator;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.C0271Ujhhgtgfeyxiexzf;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2518feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    public BSHEnhancedForStatement(int i) {
        super(i);
        this.isFinal = false;
        this.blockId = C0019Ujhhgtgfeyxiexzf.f460feyxiexzfUjhhgtg.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Node nodeJjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        Node nodeJjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (nodeJjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) nodeJjtGetChild2).getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            Node nodeJjtGetChild3 = jjtGetChild(1);
            Node nodeJjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            nodeJjtGetChild2 = nodeJjtGetChild3;
            nodeJjtGetChild = nodeJjtGetChild4;
        } else {
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Object objEval = nodeJjtGetChild2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        synchronized (AbstractC2855feyxiexzfUjhhgtg.class) {
        }
        Iterator itM4208feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4208feyxiexzfUjhhgtg(objEval);
        try {
            int i = this.blockId;
            C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = C0019Ujhhgtgfeyxiexzf.f461feyxiexzfUjhhgtg;
            C2518feyxiexzfUjhhgtg c2518feyxiexzfUjhhgtg = new C2518feyxiexzfUjhhgtg();
            c2518feyxiexzfUjhhgtg.f8210Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf;
            c2518feyxiexzfUjhhgtg.f8211Ujhhgtgfeyxiexzf = i;
            C0019Ujhhgtgfeyxiexzf c0019Ujhhgtgfeyxiexzf = (C0019Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(c2518feyxiexzfUjhhgtg);
            c0019Ujhhgtgfeyxiexzf.clear();
            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0019Ujhhgtgfeyxiexzf);
            while (!Thread.interrupted() && itM4208feyxiexzfUjhhgtg.hasNext()) {
                try {
                    Object next = itM4208feyxiexzfUjhhgtg.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    c0019Ujhhgtgfeyxiexzf.clear();
                    c0019Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(this.varName, cls, next, modifiers);
                    if (nodeJjtGetChild != null) {
                        Object objEval2 = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, null) : nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        if (objEval2 instanceof C0920feyxiexzfUjhhgtg) {
                            C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval2;
                            String str2 = c0920feyxiexzfUjhhgtg.f3738Ujhhgtgfeyxiexzf;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                                return objEval2;
                            }
                            int i2 = c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf;
                            if (i2 == 47) {
                                c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                                return objEval2;
                            }
                            if (i2 == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    throw e.mo2570Ujhhgtgfeyxiexzf("for loop iterator variable:" + this.varName, this, c2637feyxiexzfUjhhgtg);
                }
            }
            Primitive primitive = Primitive.VOID;
            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
            return primitive;
        } catch (Throwable th) {
            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.varName + ", final=" + this.isFinal;
    }
}
