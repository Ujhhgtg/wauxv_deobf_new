package bsh;

import java.util.ArrayList;
import java.util.Stack;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHTryStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    BSHTryWithResources tryWithResources;

    public BSHTryStatement(int i) {
        super(i);
        this.tryWithResources = null;
        this.blockId = C0019Ujhhgtgfeyxiexzf.f460feyxiexzfUjhhgtg.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c1 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d3 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01dc A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e6 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[Catch: all -> 0x01c7, LOOP:4: B:112:0x01e4->B:116:0x01f8, LOOP_END, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x020d A[Catch: all -> 0x01c7, LOOP:3: B:100:0x01ad->B:119:0x020d, LOOP_END, TryCatch #2 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0230 A[Catch: all -> 0x01c7, 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x024e, TryCatch #9 {上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x024e, blocks: (B:122:0x022c, B:124:0x0230, B:125:0x0236), top: B:172:0x022c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0236 A[Catch: all -> 0x01c7, 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x024e, TRY_LEAVE, TryCatch #9 {上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x024e, blocks: (B:122:0x022c, B:124:0x0230, B:125:0x0236), top: B:172:0x022c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0256 A[PHI: r0
      0x0256: PHI (r0v55 java.lang.Object) = (r0v36 java.lang.Object), (r0v38 java.lang.Object) binds: [B:98:0x0199, B:192:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x026a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0272 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x0275  */
    /* JADX WARN: Code duplicated, block: B:149:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x027d  */
    /* JADX WARN: Code duplicated, block: B:168:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸] */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws Throwable {
        int i;
        Node nodeJjtGetChild;
        ?? M3339Ujhhgtgfeyxiexzf;
        Stack stack;
        int i2;
        Throwable thM3339Ujhhgtgfeyxiexzf;
        Object objEval;
        Class<?> cls;
        int size;
        int i3;
        BSHMultiCatch bSHMultiCatch;
        Modifiers modifiers;
        Class<?> cls2;
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf;
        C0019Ujhhgtgfeyxiexzf c0019Ujhhgtgfeyxiexzf;
        Object objEval2;
        Throwable th;
        Class<?>[] types;
        int length;
        int i4;
        boolean z;
        Object obj;
        Class<?> cls3;
        int i5;
        boolean zM567Ujhhgtgfeyxiexzf;
        Object objEval3;
        if (jjtGetChild(0) instanceof BSHTryWithResources) {
            BSHTryWithResources bSHTryWithResources = (BSHTryWithResources) jjtGetChild(0);
            this.tryWithResources = bSHTryWithResources;
            bSHTryWithResources.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            i = 1;
        } else {
            i = 0;
        }
        int i6 = i + 1;
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJjtGetNumChildren = jjtGetNumChildren();
        while (true) {
            if (i6 >= iJjtGetNumChildren) {
                nodeJjtGetChild = null;
                break;
            }
            int i7 = i6 + 1;
            nodeJjtGetChild = jjtGetChild(i6);
            if (!(nodeJjtGetChild instanceof BSHMultiCatch)) {
                break;
            }
            arrayList.add((BSHMultiCatch) nodeJjtGetChild);
            i6 += 2;
            arrayList2.add((BSHBlock) jjtGetChild(i7));
        }
        BSHBlock bSHBlock2 = nodeJjtGetChild != null ? (BSHBlock) nodeJjtGetChild : null;
        Stack stack2 = c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf;
        int size2 = stack2.size();
        try {
            try {
                try {
                    RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Evaluate try block");
                    try {
                        objEval = bSHBlock.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        thM3339Ujhhgtgfeyxiexzf = null;
                        while (thM3339Ujhhgtgfeyxiexzf != null && (thM3339Ujhhgtgfeyxiexzf.getCause() instanceof C1985Ujhhgtgfeyxiexzf)) {
                            thM3339Ujhhgtgfeyxiexzf = ((C1985Ujhhgtgfeyxiexzf) thM3339Ujhhgtgfeyxiexzf.getCause()).m3339Ujhhgtgfeyxiexzf();
                        }
                        if (this.tryWithResources != null) {
                            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try with resources: autoClose");
                            for (Throwable th2 : this.tryWithResources.autoClose()) {
                                if (thM3339Ujhhgtgfeyxiexzf != null && thM3339Ujhhgtgfeyxiexzf != th2) {
                                    thM3339Ujhhgtgfeyxiexzf.addSuppressed(th2);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        try {
                            try {
                                stack = stack2;
                                i2 = size2;
                                try {
                                    throw new C1985Ujhhgtgfeyxiexzf(e.toString(), e, bSHBlock, c2637feyxiexzfUjhhgtg, false);
                                } catch (C1985Ujhhgtgfeyxiexzf e2) {
                                    e = e2;
                                    RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("TargetError from try block: ", e);
                                    thM3339Ujhhgtgfeyxiexzf = e.m3339Ujhhgtgfeyxiexzf();
                                    while (stack.size() > i2) {
                                        c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
                                    }
                                    while (thM3339Ujhhgtgfeyxiexzf != null && (thM3339Ujhhgtgfeyxiexzf.getCause() instanceof C1985Ujhhgtgfeyxiexzf)) {
                                        thM3339Ujhhgtgfeyxiexzf = ((C1985Ujhhgtgfeyxiexzf) thM3339Ujhhgtgfeyxiexzf.getCause()).m3339Ujhhgtgfeyxiexzf();
                                    }
                                    if (this.tryWithResources != null) {
                                        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try with resources: autoClose");
                                        for (Throwable th3 : this.tryWithResources.autoClose()) {
                                            if (thM3339Ujhhgtgfeyxiexzf != null && thM3339Ujhhgtgfeyxiexzf != th3) {
                                                thM3339Ujhhgtgfeyxiexzf.addSuppressed(th3);
                                            }
                                        }
                                    }
                                    objEval = null;
                                    if (thM3339Ujhhgtgfeyxiexzf != null) {
                                        try {
                                            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try catch thrown: ", thM3339Ujhhgtgfeyxiexzf);
                                            cls = thM3339Ujhhgtgfeyxiexzf.getClass();
                                            size = arrayList.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size) {
                                                    bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                                                    modifiers = new Modifiers(4);
                                                    if (bSHMultiCatch.isFinal()) {
                                                        modifiers.addModifier("final");
                                                    }
                                                    bSHMultiCatch.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                                    if (bSHMultiCatch.isUntyped()) {
                                                        runnableC0026Ujhhgtgfeyxiexzf.getClass();
                                                    }
                                                    if (bSHMultiCatch.isUntyped()) {
                                                        cls2 = null;
                                                    } else {
                                                        types = bSHMultiCatch.getTypes();
                                                        length = types.length;
                                                        i4 = 0;
                                                        z = false;
                                                        while (true) {
                                                            if (i4 >= length) {
                                                                obj = objEval;
                                                                cls3 = cls;
                                                                i5 = size;
                                                                cls2 = null;
                                                                break;
                                                            }
                                                            obj = objEval;
                                                            cls2 = types[i4];
                                                            i5 = size;
                                                            zM567Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m567Ujhhgtgfeyxiexzf(cls2, cls);
                                                            cls3 = cls;
                                                            if (true == zM567Ujhhgtgfeyxiexzf) {
                                                                z = zM567Ujhhgtgfeyxiexzf;
                                                                break;
                                                            }
                                                            i4++;
                                                            z = zM567Ujhhgtgfeyxiexzf;
                                                            objEval = obj;
                                                            size = i5;
                                                            cls = cls3;
                                                        }
                                                        if (!z) {
                                                            i3++;
                                                            objEval = obj;
                                                            size = i5;
                                                            cls = cls3;
                                                        }
                                                    }
                                                    BSHBlock bSHBlock3 = (BSHBlock) arrayList2.get(i3);
                                                    c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
                                                    c0019Ujhhgtgfeyxiexzf = new C0019Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), this.blockId);
                                                    try {
                                                        if (cls2 == BSHMultiCatch.UNTYPED) {
                                                            c0019Ujhhgtgfeyxiexzf.m305feyxiexzfUjhhgtg(bSHMultiCatch.name, thM3339Ujhhgtgfeyxiexzf);
                                                        } else {
                                                            c0019Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(bSHMultiCatch.name, cls2, thM3339Ujhhgtgfeyxiexzf, modifiers);
                                                        }
                                                        c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0019Ujhhgtgfeyxiexzf);
                                                        try {
                                                            objEval2 = bSHBlock3.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, Boolean.TRUE);
                                                            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                                                            th = null;
                                                        } catch (Throwable th4) {
                                                            c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                                                            throw th4;
                                                        }
                                                    } catch (C1863Ujhhgtgfeyxiexzf unused) {
                                                        throw new C0712Ujhhgtgfeyxiexzf("Unable to set var in catch block namespace.");
                                                    }
                                                } else {
                                                    th = thM3339Ujhhgtgfeyxiexzf;
                                                    objEval2 = objEval;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            if (bSHBlock2 != null) {
                                                Object objEval4 = bSHBlock2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                                if (objEval4 instanceof C0920feyxiexzfUjhhgtg) {
                                                    return objEval4;
                                                }
                                            }
                                            throw th5;
                                        }
                                    } else {
                                        th = thM3339Ujhhgtgfeyxiexzf;
                                        objEval2 = objEval;
                                    }
                                    if (bSHBlock2 != null) {
                                        objEval3 = bSHBlock2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                        if (objEval3 instanceof C0920feyxiexzfUjhhgtg) {
                                            return objEval3;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C1985Ujhhgtgfeyxiexzf(th, this, c2637feyxiexzfUjhhgtg);
                                    }
                                    if (objEval2 instanceof C0920feyxiexzfUjhhgtg) {
                                        return objEval2;
                                    }
                                    return Primitive.VOID;
                                } catch (C3354Ujhhgtgfeyxiexzf e3) {
                                    e = e3;
                                    thM3339Ujhhgtgfeyxiexzf = e;
                                    RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("EvalException from try block: ", thM3339Ujhhgtgfeyxiexzf);
                                    while (stack.size() > i2) {
                                        c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
                                    }
                                    while (thM3339Ujhhgtgfeyxiexzf != null && (thM3339Ujhhgtgfeyxiexzf.getCause() instanceof C1985Ujhhgtgfeyxiexzf)) {
                                        thM3339Ujhhgtgfeyxiexzf = ((C1985Ujhhgtgfeyxiexzf) thM3339Ujhhgtgfeyxiexzf.getCause()).m3339Ujhhgtgfeyxiexzf();
                                    }
                                    if (this.tryWithResources != null) {
                                        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try with resources: autoClose");
                                        for (Throwable th6 : this.tryWithResources.autoClose()) {
                                            if (thM3339Ujhhgtgfeyxiexzf != null && thM3339Ujhhgtgfeyxiexzf != th6) {
                                                thM3339Ujhhgtgfeyxiexzf.addSuppressed(th6);
                                            }
                                        }
                                    }
                                    objEval = null;
                                    if (thM3339Ujhhgtgfeyxiexzf != null) {
                                        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try catch thrown: ", thM3339Ujhhgtgfeyxiexzf);
                                        cls = thM3339Ujhhgtgfeyxiexzf.getClass();
                                        size = arrayList.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < size) {
                                                bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                                                modifiers = new Modifiers(4);
                                                if (bSHMultiCatch.isFinal()) {
                                                    modifiers.addModifier("final");
                                                }
                                                bSHMultiCatch.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                                if (bSHMultiCatch.isUntyped()) {
                                                    runnableC0026Ujhhgtgfeyxiexzf.getClass();
                                                }
                                                if (bSHMultiCatch.isUntyped()) {
                                                    types = bSHMultiCatch.getTypes();
                                                    length = types.length;
                                                    i4 = 0;
                                                    z = false;
                                                    while (true) {
                                                        if (i4 >= length) {
                                                            obj = objEval;
                                                            cls3 = cls;
                                                            i5 = size;
                                                            cls2 = null;
                                                            break;
                                                        }
                                                        obj = objEval;
                                                        cls2 = types[i4];
                                                        i5 = size;
                                                        zM567Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m567Ujhhgtgfeyxiexzf(cls2, cls);
                                                        cls3 = cls;
                                                        if (true == zM567Ujhhgtgfeyxiexzf) {
                                                            z = zM567Ujhhgtgfeyxiexzf;
                                                            break;
                                                        }
                                                        i4++;
                                                        z = zM567Ujhhgtgfeyxiexzf;
                                                        objEval = obj;
                                                        size = i5;
                                                        cls = cls3;
                                                    }
                                                    if (!z) {
                                                        i3++;
                                                        objEval = obj;
                                                        size = i5;
                                                        cls = cls3;
                                                    }
                                                } else {
                                                    cls2 = null;
                                                }
                                                BSHBlock bSHBlock4 = (BSHBlock) arrayList2.get(i3);
                                                c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
                                                c0019Ujhhgtgfeyxiexzf = new C0019Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), this.blockId);
                                                if (cls2 == BSHMultiCatch.UNTYPED) {
                                                    c0019Ujhhgtgfeyxiexzf.m305feyxiexzfUjhhgtg(bSHMultiCatch.name, thM3339Ujhhgtgfeyxiexzf);
                                                } else {
                                                    c0019Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(bSHMultiCatch.name, cls2, thM3339Ujhhgtgfeyxiexzf, modifiers);
                                                }
                                                c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0019Ujhhgtgfeyxiexzf);
                                                objEval2 = bSHBlock4.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, Boolean.TRUE);
                                                c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                                                th = null;
                                            } else {
                                                th = thM3339Ujhhgtgfeyxiexzf;
                                                objEval2 = objEval;
                                            }
                                        }
                                    } else {
                                        th = thM3339Ujhhgtgfeyxiexzf;
                                        objEval2 = objEval;
                                    }
                                    if (bSHBlock2 != null) {
                                        objEval3 = bSHBlock2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                                        if (objEval3 instanceof C0920feyxiexzfUjhhgtg) {
                                            return objEval3;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C1985Ujhhgtgfeyxiexzf(th, this, c2637feyxiexzfUjhhgtg);
                                    }
                                    if (objEval2 instanceof C0920feyxiexzfUjhhgtg) {
                                        return objEval2;
                                    }
                                    return Primitive.VOID;
                                }
                            } catch (C1985Ujhhgtgfeyxiexzf e4) {
                                e = e4;
                                stack = stack2;
                                i2 = size2;
                            } catch (C3354Ujhhgtgfeyxiexzf e5) {
                                e = e5;
                                stack = stack2;
                                i2 = size2;
                            }
                        } catch (C1985Ujhhgtgfeyxiexzf e6) {
                            e = e6;
                            i2 = size2;
                            stack = stack2;
                        } catch (C3354Ujhhgtgfeyxiexzf e7) {
                            e = e7;
                            i2 = size2;
                            stack = stack2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    M3339Ujhhgtgfeyxiexzf = stack2;
                    while (M3339Ujhhgtgfeyxiexzf != 0 && (M3339Ujhhgtgfeyxiexzf.getCause() instanceof C1985Ujhhgtgfeyxiexzf)) {
                        M3339Ujhhgtgfeyxiexzf = ((C1985Ujhhgtgfeyxiexzf) M3339Ujhhgtgfeyxiexzf.getCause()).m3339Ujhhgtgfeyxiexzf();
                    }
                    if (this.tryWithResources != null) {
                        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try with resources: autoClose");
                        for (Throwable th8 : this.tryWithResources.autoClose()) {
                            if (M3339Ujhhgtgfeyxiexzf != 0 && M3339Ujhhgtgfeyxiexzf != th8) {
                                M3339Ujhhgtgfeyxiexzf.addSuppressed(th8);
                            }
                        }
                    }
                    throw th;
                }
            } catch (C1985Ujhhgtgfeyxiexzf e8) {
                e = e8;
                stack = stack2;
                i2 = size2;
            } catch (C3354Ujhhgtgfeyxiexzf e9) {
                e = e9;
                stack = stack2;
                i2 = size2;
            }
            if (thM3339Ujhhgtgfeyxiexzf != null) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Try catch thrown: ", thM3339Ujhhgtgfeyxiexzf);
                cls = thM3339Ujhhgtgfeyxiexzf.getClass();
                size = arrayList.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                        modifiers = new Modifiers(4);
                        if (bSHMultiCatch.isFinal()) {
                            modifiers.addModifier("final");
                        }
                        bSHMultiCatch.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        if (bSHMultiCatch.isUntyped()) {
                            runnableC0026Ujhhgtgfeyxiexzf.getClass();
                        }
                        if (bSHMultiCatch.isUntyped()) {
                            types = bSHMultiCatch.getTypes();
                            length = types.length;
                            i4 = 0;
                            z = false;
                            while (true) {
                                if (i4 >= length) {
                                    obj = objEval;
                                    cls3 = cls;
                                    i5 = size;
                                    cls2 = null;
                                    break;
                                }
                                obj = objEval;
                                cls2 = types[i4];
                                i5 = size;
                                zM567Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m567Ujhhgtgfeyxiexzf(cls2, cls);
                                cls3 = cls;
                                if (true == zM567Ujhhgtgfeyxiexzf) {
                                    z = zM567Ujhhgtgfeyxiexzf;
                                    break;
                                }
                                i4++;
                                z = zM567Ujhhgtgfeyxiexzf;
                                objEval = obj;
                                size = i5;
                                cls = cls3;
                            }
                            if (!z) {
                                i3++;
                                objEval = obj;
                                size = i5;
                                cls = cls3;
                            }
                        } else {
                            cls2 = null;
                        }
                        BSHBlock bSHBlock5 = (BSHBlock) arrayList2.get(i3);
                        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
                        c0019Ujhhgtgfeyxiexzf = new C0019Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), this.blockId);
                        if (cls2 == BSHMultiCatch.UNTYPED) {
                            c0019Ujhhgtgfeyxiexzf.m305feyxiexzfUjhhgtg(bSHMultiCatch.name, thM3339Ujhhgtgfeyxiexzf);
                        } else {
                            c0019Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(bSHMultiCatch.name, cls2, thM3339Ujhhgtgfeyxiexzf, modifiers);
                        }
                        c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0019Ujhhgtgfeyxiexzf);
                        objEval2 = bSHBlock5.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, Boolean.TRUE);
                        c2637feyxiexzfUjhhgtg.m3972Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
                        th = null;
                    } else {
                        th = thM3339Ujhhgtgfeyxiexzf;
                        objEval2 = objEval;
                    }
                }
            } else {
                th = thM3339Ujhhgtgfeyxiexzf;
                objEval2 = objEval;
            }
            if (bSHBlock2 != null) {
                objEval3 = bSHBlock2.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                if (objEval3 instanceof C0920feyxiexzfUjhhgtg) {
                    return objEval3;
                }
            }
            if (th != null) {
                throw new C1985Ujhhgtgfeyxiexzf(th, this, c2637feyxiexzfUjhhgtg);
            }
            if (objEval2 instanceof C0920feyxiexzfUjhhgtg) {
                return objEval2;
            }
            return Primitive.VOID;
        } catch (Throwable th9) {
            th = th9;
            M3339Ujhhgtgfeyxiexzf = 0;
        }
    }
}
