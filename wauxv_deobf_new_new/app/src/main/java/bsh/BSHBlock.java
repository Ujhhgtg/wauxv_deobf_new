package bsh;

import java.util.ArrayList;
import p000.C0405;
import p000.C0527;
import p000.C1893;

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
        this.blockId = C0002.f466.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        return eval(c0527, runnableC0008, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [bsh.BSHBlock, bsh.SimpleNode] */
    public Object evalBlock(C0527 c0527, RunnableC0008 runnableC0008, Boolean bool, NodeFilter nodeFilter) {
        C0012 c0012M2023;
        Object objEval = Primitive.VOID;
        ArrayList arrayList = null;
        if (bool == null) {
            C0012 c0012M2024 = c0527.m2024();
            int i = this.blockId;
            C1893 c1893 = C0002.f467;
            C0405 c0405 = new C0405();
            c0405.f1958 = c0012M2024;
            c0405.f1959 = i;
            C0002 c0002 = (C0002) c1893.m3819(c0405);
            c0002.clear();
            c0012M2023 = c0527.m2023(c0002);
        } else {
            c0012M2023 = !bool.booleanValue() ? c0527.m2023(new C0002(c0527.m2024(), this.blockId)) : null;
        }
        ?? r2 = this.isSynchronized;
        int iJjtGetNumChildren = jjtGetNumChildren();
        try {
            if (this.isFirst || this.hasClassDeclaration) {
                for (?? r5 = r2; r5 < iJjtGetNumChildren; r5++) {
                    Node nodeJjtGetChild = jjtGetChild(r5);
                    if ((nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild)) && (nodeJjtGetChild instanceof BSHClassDeclaration)) {
                        this.hasClassDeclaration = true;
                        nodeJjtGetChild.eval(c0527, runnableC0008);
                    }
                }
            }
            while (r2 < iJjtGetNumChildren) {
                Node nodeJjtGetChild2 = jjtGetChild(r2);
                if (!(nodeJjtGetChild2 instanceof BSHClassDeclaration) && (nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild2))) {
                    if (!(nodeJjtGetChild2 instanceof BSHEnumConstant)) {
                        objEval = nodeJjtGetChild2.eval(c0527, runnableC0008);
                        if (objEval instanceof ReturnControl) {
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
                    ((Node) arrayList.remove(0)).eval(c0527, runnableC0008);
                }
            }
            return objEval;
        } finally {
            this.isFirst = false;
            if (c0012M2023 != null) {
                c0527.m2023(c0012M2023);
            }
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.isStatic + ", synchronized=" + this.isSynchronized;
    }

    public Object eval(C0527 c0527, RunnableC0008 runnableC0008, Boolean bool) {
        Object objEvalBlock;
        if (!this.isSynchronized) {
            return evalBlock(c0527, runnableC0008, bool, null);
        }
        synchronized (jjtGetChild(0).eval(c0527, runnableC0008)) {
            objEvalBlock = evalBlock(c0527, runnableC0008, bool, null);
        }
        return objEvalBlock;
    }
}
