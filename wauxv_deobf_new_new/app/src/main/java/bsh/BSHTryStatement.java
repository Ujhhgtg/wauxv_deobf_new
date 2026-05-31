package bsh;

import java.util.ArrayList;
import java.util.Stack;
import p000.C0527;
import p000.C1232;
import p000.C1684;
import p000.C2954;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHTryStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    BSHTryWithResources tryWithResources;

    public BSHTryStatement(int i) {
        super(i);
        this.tryWithResources = null;
        this.blockId = C0002.f466.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c1 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d3 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01dc A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e6 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[Catch: all -> 0x01c7, LOOP:4: B:112:0x01e4->B:116:0x01f8, LOOP_END, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x020d A[Catch: all -> 0x01c7, LOOP:3: B:100:0x01ad->B:119:0x020d, LOOP_END, TryCatch #4 {all -> 0x01c7, blocks: (B:99:0x019b, B:101:0x01af, B:103:0x01c1, B:106:0x01ca, B:108:0x01d3, B:109:0x01d6, B:111:0x01dc, B:113:0x01e6, B:119:0x020d, B:121:0x0217, B:122:0x022c, B:124:0x0230, B:126:0x023b, B:128:0x0244, B:130:0x024a, B:131:0x024d, B:125:0x0236, B:132:0x024e, B:133:0x0255, B:116:0x01f8, B:127:0x023e), top: B:168:0x019b, inners: #5, #13 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0230 A[Catch: all -> 0x01c7, ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x024e, TryCatch #13 {ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x024e, blocks: (B:122:0x022c, B:124:0x0230, B:125:0x0236), top: B:174:0x022c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0236 A[Catch: all -> 0x01c7, ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x024e, TRY_LEAVE, TryCatch #13 {ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x024e, blocks: (B:122:0x022c, B:124:0x0230, B:125:0x0236), top: B:174:0x022c, outer: #4 }] */
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
    /* JADX WARN: Type inference failed for: r23v0, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᲇᤞᤝ] */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws Throwable {
        int i;
        Node nodeJjtGetChild;
        ?? M4962;
        Stack stack;
        int i2;
        Throwable thM4962;
        Object objEval;
        Class<?> cls;
        int size;
        int i3;
        BSHMultiCatch bSHMultiCatch;
        Modifiers modifiers;
        Class<?> cls2;
        C0012 c0012M2024;
        C0002 c0002;
        Object objEval2;
        Throwable th;
        Class<?>[] types;
        int length;
        int i4;
        boolean z;
        Object obj;
        Class<?> cls3;
        int i5;
        boolean zM568;
        Object objEval3;
        if (jjtGetChild(0) instanceof BSHTryWithResources) {
            BSHTryWithResources bSHTryWithResources = (BSHTryWithResources) jjtGetChild(0);
            this.tryWithResources = bSHTryWithResources;
            bSHTryWithResources.eval(c0527, runnableC0008);
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
        Stack stack2 = c0527.f2221;
        int size2 = stack2.size();
        try {
            try {
                try {
                    RunnableC0008.m333("Evaluate try block");
                    try {
                        objEval = bSHBlock.eval(c0527, runnableC0008);
                        thM4962 = null;
                        while (thM4962 != null && (thM4962.getCause() instanceof C2954)) {
                            thM4962 = ((C2954) thM4962.getCause()).m4962();
                        }
                        if (this.tryWithResources != null) {
                            RunnableC0008.m333("Try with resources: autoClose");
                            for (Throwable th2 : this.tryWithResources.autoClose()) {
                                if (thM4962 != null && thM4962 != th2) {
                                    thM4962.addSuppressed(th2);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        try {
                            try {
                                stack = stack2;
                                i2 = size2;
                                try {
                                    throw new C2954(e.toString(), e, bSHBlock, c0527, false);
                                } catch (C1232 e2) {
                                    e = e2;
                                    thM4962 = e;
                                    RunnableC0008.m333("EvalException from try block: ", thM4962);
                                    while (stack.size() > i2) {
                                        c0527.m2021();
                                    }
                                    while (thM4962 != null && (thM4962.getCause() instanceof C2954)) {
                                        thM4962 = ((C2954) thM4962.getCause()).m4962();
                                    }
                                    if (this.tryWithResources != null) {
                                        RunnableC0008.m333("Try with resources: autoClose");
                                        for (Throwable th3 : this.tryWithResources.autoClose()) {
                                            if (thM4962 != null && thM4962 != th3) {
                                                thM4962.addSuppressed(th3);
                                            }
                                        }
                                    }
                                    objEval = null;
                                    if (thM4962 != null) {
                                        try {
                                            RunnableC0008.m333("Try catch thrown: ", thM4962);
                                            cls = thM4962.getClass();
                                            size = arrayList.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size) {
                                                    bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                                                    modifiers = new Modifiers(4);
                                                    if (bSHMultiCatch.isFinal()) {
                                                        modifiers.addModifier("final");
                                                    }
                                                    bSHMultiCatch.eval(c0527, runnableC0008);
                                                    if (bSHMultiCatch.isUntyped()) {
                                                        runnableC0008.getClass();
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
                                                            zM568 = AbstractC0017.m568(cls2, cls);
                                                            cls3 = cls;
                                                            if (true == zM568) {
                                                                z = zM568;
                                                                break;
                                                            }
                                                            i4++;
                                                            z = zM568;
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
                                                    c0012M2024 = c0527.m2024();
                                                    c0002 = new C0002(c0527.m2024(), this.blockId);
                                                    try {
                                                        if (cls2 == BSHMultiCatch.UNTYPED) {
                                                            c0002.m319(bSHMultiCatch.name, thM4962);
                                                        } else {
                                                            c0002.m386(bSHMultiCatch.name, cls2, thM4962, modifiers);
                                                        }
                                                        c0527.m2023(c0002);
                                                        try {
                                                            objEval2 = bSHBlock3.eval(c0527, runnableC0008, Boolean.TRUE);
                                                            c0527.m2023(c0012M2024);
                                                            th = null;
                                                        } catch (Throwable th4) {
                                                            c0527.m2023(c0012M2024);
                                                            throw th4;
                                                        }
                                                    } catch (C3581 unused) {
                                                        throw new C1684("Unable to set var in catch block namespace.");
                                                    }
                                                } else {
                                                    th = thM4962;
                                                    objEval2 = objEval;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            if (bSHBlock2 != null) {
                                                Object objEval4 = bSHBlock2.eval(c0527, runnableC0008);
                                                if (objEval4 instanceof ReturnControl) {
                                                    return objEval4;
                                                }
                                            }
                                            throw th5;
                                        }
                                    } else {
                                        th = thM4962;
                                        objEval2 = objEval;
                                    }
                                    if (bSHBlock2 != null) {
                                        objEval3 = bSHBlock2.eval(c0527, runnableC0008);
                                        if (objEval3 instanceof ReturnControl) {
                                            return objEval3;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C2954(th, this, c0527);
                                    }
                                    if (objEval2 instanceof ReturnControl) {
                                        return objEval2;
                                    }
                                    return Primitive.VOID;
                                } catch (C2954 e3) {
                                    e = e3;
                                    RunnableC0008.m333("TargetError from try block: ", e);
                                    thM4962 = e.m4962();
                                    while (stack.size() > i2) {
                                        c0527.m2021();
                                    }
                                    while (thM4962 != null && (thM4962.getCause() instanceof C2954)) {
                                        thM4962 = ((C2954) thM4962.getCause()).m4962();
                                    }
                                    if (this.tryWithResources != null) {
                                        RunnableC0008.m333("Try with resources: autoClose");
                                        for (Throwable th6 : this.tryWithResources.autoClose()) {
                                            if (thM4962 != null && thM4962 != th6) {
                                                thM4962.addSuppressed(th6);
                                            }
                                        }
                                    }
                                    objEval = null;
                                    if (thM4962 != null) {
                                        RunnableC0008.m333("Try catch thrown: ", thM4962);
                                        cls = thM4962.getClass();
                                        size = arrayList.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < size) {
                                                bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                                                modifiers = new Modifiers(4);
                                                if (bSHMultiCatch.isFinal()) {
                                                    modifiers.addModifier("final");
                                                }
                                                bSHMultiCatch.eval(c0527, runnableC0008);
                                                if (bSHMultiCatch.isUntyped()) {
                                                    runnableC0008.getClass();
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
                                                        zM568 = AbstractC0017.m568(cls2, cls);
                                                        cls3 = cls;
                                                        if (true == zM568) {
                                                            z = zM568;
                                                            break;
                                                        }
                                                        i4++;
                                                        z = zM568;
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
                                                c0012M2024 = c0527.m2024();
                                                c0002 = new C0002(c0527.m2024(), this.blockId);
                                                if (cls2 == BSHMultiCatch.UNTYPED) {
                                                    c0002.m319(bSHMultiCatch.name, thM4962);
                                                } else {
                                                    c0002.m386(bSHMultiCatch.name, cls2, thM4962, modifiers);
                                                }
                                                c0527.m2023(c0002);
                                                objEval2 = bSHBlock4.eval(c0527, runnableC0008, Boolean.TRUE);
                                                c0527.m2023(c0012M2024);
                                                th = null;
                                            } else {
                                                th = thM4962;
                                                objEval2 = objEval;
                                            }
                                        }
                                    } else {
                                        th = thM4962;
                                        objEval2 = objEval;
                                    }
                                    if (bSHBlock2 != null) {
                                        objEval3 = bSHBlock2.eval(c0527, runnableC0008);
                                        if (objEval3 instanceof ReturnControl) {
                                            return objEval3;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C2954(th, this, c0527);
                                    }
                                    if (objEval2 instanceof ReturnControl) {
                                        return objEval2;
                                    }
                                    return Primitive.VOID;
                                }
                            } catch (C1232 e4) {
                                e = e4;
                                stack = stack2;
                                i2 = size2;
                            } catch (C2954 e5) {
                                e = e5;
                                stack = stack2;
                                i2 = size2;
                            }
                        } catch (C1232 e6) {
                            e = e6;
                            i2 = size2;
                            stack = stack2;
                        } catch (C2954 e7) {
                            e = e7;
                            i2 = size2;
                            stack = stack2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    M4962 = stack2;
                    while (M4962 != 0 && (M4962.getCause() instanceof C2954)) {
                        M4962 = ((C2954) M4962.getCause()).m4962();
                    }
                    if (this.tryWithResources != null) {
                        RunnableC0008.m333("Try with resources: autoClose");
                        for (Throwable th8 : this.tryWithResources.autoClose()) {
                            if (M4962 != 0 && M4962 != th8) {
                                M4962.addSuppressed(th8);
                            }
                        }
                    }
                    throw th;
                }
            } catch (C1232 e8) {
                e = e8;
                stack = stack2;
                i2 = size2;
            } catch (C2954 e9) {
                e = e9;
                stack = stack2;
                i2 = size2;
            }
            if (thM4962 != null) {
                RunnableC0008.m333("Try catch thrown: ", thM4962);
                cls = thM4962.getClass();
                size = arrayList.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        bSHMultiCatch = (BSHMultiCatch) arrayList.get(i3);
                        modifiers = new Modifiers(4);
                        if (bSHMultiCatch.isFinal()) {
                            modifiers.addModifier("final");
                        }
                        bSHMultiCatch.eval(c0527, runnableC0008);
                        if (bSHMultiCatch.isUntyped()) {
                            runnableC0008.getClass();
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
                                zM568 = AbstractC0017.m568(cls2, cls);
                                cls3 = cls;
                                if (true == zM568) {
                                    z = zM568;
                                    break;
                                }
                                i4++;
                                z = zM568;
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
                        c0012M2024 = c0527.m2024();
                        c0002 = new C0002(c0527.m2024(), this.blockId);
                        if (cls2 == BSHMultiCatch.UNTYPED) {
                            c0002.m319(bSHMultiCatch.name, thM4962);
                        } else {
                            c0002.m386(bSHMultiCatch.name, cls2, thM4962, modifiers);
                        }
                        c0527.m2023(c0002);
                        objEval2 = bSHBlock5.eval(c0527, runnableC0008, Boolean.TRUE);
                        c0527.m2023(c0012M2024);
                        th = null;
                    } else {
                        th = thM4962;
                        objEval2 = objEval;
                    }
                }
            } else {
                th = thM4962;
                objEval2 = objEval;
            }
            if (bSHBlock2 != null) {
                objEval3 = bSHBlock2.eval(c0527, runnableC0008);
                if (objEval3 instanceof ReturnControl) {
                    return objEval3;
                }
            }
            if (th != null) {
                throw new C2954(th, this, c0527);
            }
            if (objEval2 instanceof ReturnControl) {
                return objEval2;
            }
            return Primitive.VOID;
        } catch (Throwable th9) {
            th = th9;
            M4962 = 0;
        }
    }
}
