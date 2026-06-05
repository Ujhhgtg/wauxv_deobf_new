package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1091feyxiexzfUjhhgtg;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C2810Ujhhgtgfeyxiexzf;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.EnumC2814Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAllocationExpression extends SimpleNode {
    private static int innerClassCount = 0;
    private static final long serialVersionUID = 1;

    public BSHAllocationExpression(int i) {
        super(i);
    }

    private Object arrayAllocation(BSHArrayDimensions bSHArrayDimensions, Class<?> cls, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        Object objEval = bSHArrayDimensions.eval(cls, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        return objEval != Primitive.VOID ? objEval : arrayNewInstance(cls, bSHArrayDimensions, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    private Object arrayNewInstance(Class<?> cls, BSHArrayDimensions bSHArrayDimensions, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf, C1985Ujhhgtgfeyxiexzf {
        int i = bSHArrayDimensions.numUndefinedDims;
        if (i > 0) {
            cls = Array.newInstance(cls, new int[i]).getClass();
        }
        try {
            return Array.newInstance(cls, bSHArrayDimensions.definedDimensions);
        } catch (NegativeArraySizeException e) {
            throw new C1985Ujhhgtgfeyxiexzf(e, this, c2637feyxiexzfUjhhgtg);
        } catch (Exception e2) {
            throw new C3354Ujhhgtgfeyxiexzf("Can't construct primitive array: " + e2.getMessage(), this, c2637feyxiexzfUjhhgtg, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:? A[SYNTHETIC] */
    private Object constructObject(Class<?> cls, Object[] objArr, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws Throwable {
        Throwable th;
        boolean zM545feyxiexzfUjhhgtg = AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(cls);
        if (zM545feyxiexzfUjhhgtg) {
            This.registerConstructorContext(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        try {
            try {
                Object objM521Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m521Ujhhgtgfeyxiexzf(cls, null, objArr);
                if (zM545feyxiexzfUjhhgtg) {
                    This.registerConstructorContext(null, null);
                }
                if (cls.getName().indexOf("$") != -1) {
                    C0029Ujhhgtgfeyxiexzf nameSpace = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().mo299Ujhhgtgfeyxiexzf(null).getNameSpace();
                    if (C0028Ujhhgtgfeyxiexzf.m347Ujhhgtgfeyxiexzf(nameSpace) != null && !AbstractC0033Ujhhgtgfeyxiexzf.m526Ujhhgtgfeyxiexzf(objM521Ujhhgtgfeyxiexzf.getClass()).hasModifier("static")) {
                        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(objM521Ujhhgtgfeyxiexzf);
                        c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf = nameSpace;
                        if (nameSpace == null) {
                            c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m382feyxiexzfUjhhgtg();
                        }
                        return objM521Ujhhgtgfeyxiexzf;
                    }
                    if (AbstractC0033Ujhhgtgfeyxiexzf.m526Ujhhgtgfeyxiexzf(objM521Ujhhgtgfeyxiexzf.getClass()).hasModifier("static")) {
                        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf2 = AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(objM521Ujhhgtgfeyxiexzf);
                        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m538Ujhhgtgfeyxiexzf(objM521Ujhhgtgfeyxiexzf.getClass()).f535Ujhhgtgfeyxiexzf;
                        c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf2.f535Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
                        if (c0029Ujhhgtgfeyxiexzf == null) {
                            c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf2.m382feyxiexzfUjhhgtg();
                        }
                    }
                }
                return objM521Ujhhgtgfeyxiexzf;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                if (!zM545feyxiexzfUjhhgtg) {
                    throw th;
                }
                This.registerConstructorContext(null, null);
                throw th;
            }
        } catch (InvocationTargetException e) {
            e = e;
            Throwable th3 = e;
            try {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("The constructor threw an exception:\n\t" + th3.getCause());
                throw new C1985Ujhhgtgfeyxiexzf("Object constructor", th3.getCause(), this, c2637feyxiexzfUjhhgtg, true);
            } catch (Throwable th4) {
                th = th4;
                th = th;
                if (!zM545feyxiexzfUjhhgtg) {
                    throw th;
                }
                This.registerConstructorContext(null, null);
                throw th;
            }
        } catch (CompletionException e2) {
            e = e2;
            Throwable th5 = e;
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("The constructor threw an exception:\n\t" + th5.getCause());
            throw new C1985Ujhhgtgfeyxiexzf("Object constructor", th5.getCause(), this, c2637feyxiexzfUjhhgtg, true);
        } catch (C0958feyxiexzfUjhhgtg e3) {
            throw new C3354Ujhhgtgfeyxiexzf("Constructor error: " + e3.getMessage(), this, c2637feyxiexzfUjhhgtg, e3);
        } catch (Throwable th6) {
            th = th6;
            if (!zM545feyxiexzfUjhhgtg) {
                throw th;
            }
            This.registerConstructorContext(null, null);
            throw th;
        }
    }

    private Object constructWithClassBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        StringBuilder sb = new StringBuilder("anon");
        int i = innerClassCount + 1;
        innerClassCount = i;
        sb.append(i);
        String string = sb.toString();
        String str = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().f534Ujhhgtgfeyxiexzf.replace('/', '_') + "$" + string;
        This.CONTEXT_ARGS.get().put(string, objArr);
        Modifiers modifiers = new Modifiers(0);
        if (C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf == null) {
            C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf = new C0023Ujhhgtgfeyxiexzf();
        }
        C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf.getClass();
        try {
            return AbstractC0033Ujhhgtgfeyxiexzf.m521Ujhhgtgfeyxiexzf(C0023Ujhhgtgfeyxiexzf.m320Ujhhgtgfeyxiexzf(str, modifiers, null, cls, bSHBlock, EnumC2814Ujhhgtgfeyxiexzf.f8960Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), null, objArr);
        } catch (Exception e) {
            throw new C3354Ujhhgtgfeyxiexzf("Error constructing inner class instance: " + e, this, c2637feyxiexzfUjhhgtg, e instanceof InvocationTargetException ? e.getCause() : e);
        }
    }

    private Object constructWithInterfaceBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), null, "AnonymousBlock");
        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
        try {
            bSHBlock.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, Boolean.TRUE);
            c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
            c0029Ujhhgtgfeyxiexzf.m378Ujhhgtgfeyxiexzf(cls);
            return c0029Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf).getInterface(cls);
        } catch (Throwable th) {
            c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
            throw th;
        }
    }

    private Object objectAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArguments bSHArguments, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Object[] arguments = bSHArguments.getArguments(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (arguments == null) {
            throw new C3353Ujhhgtgfeyxiexzf("Null args in new.", this, c2637feyxiexzfUjhhgtg);
        }
        Object object = bSHAmbiguousName.toObject(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, true);
        if (!(object instanceof C2810Ujhhgtgfeyxiexzf)) {
            throw new C3354Ujhhgtgfeyxiexzf("Unknown class: " + bSHAmbiguousName.text, this, c2637feyxiexzfUjhhgtg);
        }
        Class<?> cls = ((C2810Ujhhgtgfeyxiexzf) object).f8945Ujhhgtgfeyxiexzf;
        boolean z = jjtGetNumChildren() > 2;
        try {
            RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1215Ujhhgtgfeyxiexzf(cls, arguments);
            if (!z) {
                return constructObject(cls, arguments, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            BSHBlock bSHBlock = (BSHBlock) jjtGetChild(2);
            return cls.isInterface() ? constructWithInterfaceBody(cls, arguments, bSHBlock, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : constructWithClassBody(cls, arguments, bSHBlock, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        } catch (C1091feyxiexzfUjhhgtg e) {
            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }

    private Object objectArrayAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArrayDimensions bSHArrayDimensions, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return arrayAllocation(bSHArrayDimensions, bSHAmbiguousName.toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    private Object primitiveArrayAllocation(BSHPrimitiveType bSHPrimitiveType, BSHArrayDimensions bSHArrayDimensions, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return arrayAllocation(bSHArrayDimensions, bSHPrimitiveType.getType(), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    public Object constructFromEnclosingInstance(Object obj, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C1985Ujhhgtgfeyxiexzf {
        String str = jjtGetChild(0) instanceof BSHAmbiguousName ? ((BSHAmbiguousName) jjtGetChild(0)).text : "";
        Class<?> cls = null;
        Object[] arguments = jjtGetChild(1) instanceof BSHArguments ? ((BSHArguments) jjtGetChild(1)).getArguments(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : null;
        for (Class<?> cls2 : obj.getClass().getDeclaredClasses()) {
            if (AbstractC0034Ujhhgtgfeyxiexzf.m560Ujhhgtgfeyxiexzf(cls2.getName()).equals(str)) {
                cls = cls2;
                break;
            }
        }
        try {
            return AbstractC0033Ujhhgtgfeyxiexzf.m521Ujhhgtgfeyxiexzf(cls, obj, arguments);
        } catch (InvocationTargetException e) {
            throw new C1985Ujhhgtgfeyxiexzf("Object constructor", e.getCause(), this, c2637feyxiexzfUjhhgtg, true);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        if (jjtGetNumChildren() == 1 && (jjtGetChild(0) instanceof BSHArrayDimensions)) {
            return arrayAllocation((BSHArrayDimensions) jjtGetChild(0), Void.TYPE, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Node nodeJjtGetChild2 = jjtGetChild(1);
        if (!(nodeJjtGetChild instanceof BSHAmbiguousName)) {
            return primitiveArrayAllocation((BSHPrimitiveType) nodeJjtGetChild, (BSHArrayDimensions) nodeJjtGetChild2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) nodeJjtGetChild;
        return nodeJjtGetChild2 instanceof BSHArguments ? objectAllocation(bSHAmbiguousName, (BSHArguments) nodeJjtGetChild2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : objectArrayAllocation(bSHAmbiguousName, (BSHArrayDimensions) nodeJjtGetChild2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }
}
