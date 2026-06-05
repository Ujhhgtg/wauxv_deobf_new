package bsh;

import java.util.ArrayList;
import p000.C0271Ujhhgtgfeyxiexzf;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C2518feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHBlock extends SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    private boolean hasClassDeclaration;
    private boolean isFirst;
    public boolean isStatic;
    public boolean isSynchronized;

    /* JADX INFO: compiled from: obf */
    public interface NodeFilter {
        boolean isVisible(Node node);
    }

    public BSHBlock(int i) {
        super(i);
        this.isSynchronized = false;
        this.isStatic = false;
        this.hasClassDeclaration = false;
        this.isFirst = true;
        this.blockId = C0019Ujhhgtgfeyxiexzf.f460feyxiexzfUjhhgtg.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [bsh.BSHBlock, bsh.SimpleNode] */
    public Object evalBlock(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, Boolean bool, NodeFilter nodeFilter) {
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3972Ujhhgtgfeyxiexzf;
        Object objEval = Primitive.VOID;
        ArrayList arrayList = null;
        if (bool == null) {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
            int i = this.blockId;
            C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = C0019Ujhhgtgfeyxiexzf.f461feyxiexzfUjhhgtg;
            C2518feyxiexzfUjhhgtg c2518feyxiexzfUjhhgtg = new C2518feyxiexzfUjhhgtg();
            c2518feyxiexzfUjhhgtg.f8210Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf;
            c2518feyxiexzfUjhhgtg.f8211Ujhhgtgfeyxiexzf = i;
            C0019Ujhhgtgfeyxiexzf c0019Ujhhgtgfeyxiexzf = (C0019Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(c2518feyxiexzfUjhhgtg);
            c0019Ujhhgtgfeyxiexzf.clear();
            c0029UjhhgtgfeyxiexzfM3972Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0019Ujhhgtgfeyxiexzf);
        } else {
            c0029UjhhgtgfeyxiexzfM3972Ujhhgtgfeyxiexzf = !bool.booleanValue() ? c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(new C0019Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), this.blockId)) : null;
        }
        ?? r2 = this.isSynchronized;
        int iJjtGetNumChildren = jjtGetNumChildren();
        try {
            if (this.isFirst || this.hasClassDeclaration) {
                for (?? r5 = r2; r5 < iJjtGetNumChildren; r5++) {
                    Node nodeJjtGetChild = jjtGetChild(r5);
                    if ((nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild)) && (nodeJjtGetChild instanceof BSHClassDeclaration)) {
                        this.hasClassDeclaration = true;
                        nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    }
                }
            }
            while (r2 < iJjtGetNumChildren) {
                Node nodeJjtGetChild2 = jjtGetChild(r2);
                if (!(nodeJjtGetChild2 instanceof BSHClassDeclaration) && (nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild2))) {
                    if (!(nodeJjtGetChild2 instanceof BSHEnumConstant)) {
                        objEval = nodeJjtGetChild2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        if (objEval instanceof C0920feyxiexzfUjhhgtg) {
                            break;
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(nodeJjtGetChild2);
                    }
                }
                r2++;
            }
            if (arrayList != null) {
                while (!arrayList.isEmpty()) {
                    ((Node) arrayList.remove(0)).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                }
            }
            return objEval;
        } finally {
            this.isFirst = false;
            if (c0029UjhhgtgfeyxiexzfM3972Ujhhgtgfeyxiexzf != null) {
                c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3972Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.isStatic + ", synchronized=" + this.isSynchronized;
    }

    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, Boolean bool) {
        Object objEvalBlock;
        if (!this.isSynchronized) {
            return evalBlock(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, bool, null);
        }
        synchronized (jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf)) {
            objEvalBlock = evalBlock(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, bool, null);
        }
        return objEvalBlock;
    }
}
