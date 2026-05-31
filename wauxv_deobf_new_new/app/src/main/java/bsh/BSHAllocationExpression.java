package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;
import p000.C0527;
import p000.C0699;
import p000.C1231;
import p000.C1232;
import p000.C2573;
import p000.C2705;
import p000.C2954;
import p000.EnumC0698;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHAllocationExpression extends SimpleNode {
    private static int innerClassCount = 0;
    private static final long serialVersionUID = 1;

    public BSHAllocationExpression(int i) {
        super(i);
    }

    private Object arrayAllocation(BSHArrayDimensions bSHArrayDimensions, Class<?> cls, C0527 c0527, RunnableC0008 runnableC0008) {
        Object objEval = bSHArrayDimensions.eval(cls, c0527, runnableC0008);
        return objEval != Primitive.VOID ? objEval : arrayNewInstance(cls, bSHArrayDimensions, c0527, runnableC0008);
    }

    private Object arrayNewInstance(Class<?> cls, BSHArrayDimensions bSHArrayDimensions, C0527 c0527, RunnableC0008 runnableC0008) throws C2954, C1232 {
        int i = bSHArrayDimensions.numUndefinedDims;
        if (i > 0) {
            cls = Array.newInstance(cls, new int[i]).getClass();
        }
        try {
            return Array.newInstance(cls, bSHArrayDimensions.definedDimensions);
        } catch (NegativeArraySizeException e) {
            throw new C2954(e, this, c0527);
        } catch (Exception e2) {
            throw new C1232("Can't construct primitive array: " + e2.getMessage(), this, c0527, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:? A[SYNTHETIC] */
    private Object constructObject(Class<?> cls, Object[] objArr, C0527 c0527, RunnableC0008 runnableC0008) throws Throwable {
        Throwable th;
        boolean zM546 = AbstractC0016.m546(cls);
        if (zM546) {
            This.registerConstructorContext(c0527, runnableC0008);
        }
        try {
            try {
                Object objM522 = AbstractC0016.m522(cls, null, objArr);
                if (zM546) {
                    This.registerConstructorContext(null, null);
                }
                if (cls.getName().indexOf("$") != -1) {
                    C0012 nameSpace = c0527.m2024().mo313(null).getNameSpace();
                    if (C0010.m349(nameSpace) != null && !AbstractC0016.m527(objM522.getClass()).hasModifier("static")) {
                        C0012 c0012M540 = AbstractC0016.m540(objM522);
                        c0012M540.f521 = nameSpace;
                        if (nameSpace == null) {
                            c0012M540.m383();
                        }
                        return objM522;
                    }
                    if (AbstractC0016.m527(objM522.getClass()).hasModifier("static")) {
                        C0012 c0012M541 = AbstractC0016.m540(objM522);
                        C0012 c0012 = AbstractC0016.m539(objM522.getClass()).f521;
                        c0012M541.f521 = c0012;
                        if (c0012 == null) {
                            c0012M541.m383();
                        }
                    }
                }
                return objM522;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                if (!zM546) {
                    throw th;
                }
                This.registerConstructorContext(null, null);
                throw th;
            }
        } catch (InvocationTargetException e) {
            e = e;
            Throwable th3 = e;
            try {
                RunnableC0008.m333("The constructor threw an exception:\n\t" + th3.getCause());
                throw new C2954("Object constructor", th3.getCause(), this, c0527, true);
            } catch (Throwable th4) {
                th = th4;
                th = th;
                if (!zM546) {
                    throw th;
                }
                This.registerConstructorContext(null, null);
                throw th;
            }
        } catch (CompletionException e2) {
            e = e2;
            Throwable th5 = e;
            RunnableC0008.m333("The constructor threw an exception:\n\t" + th5.getCause());
            throw new C2954("Object constructor", th5.getCause(), this, c0527, true);
        } catch (C2573 e3) {
            throw new C1232("Constructor error: " + e3.getMessage(), this, c0527, e3);
        } catch (Throwable th6) {
            th = th6;
            if (!zM546) {
                throw th;
            }
            This.registerConstructorContext(null, null);
            throw th;
        }
    }

    private Object constructWithClassBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        StringBuilder sb = new StringBuilder("anon");
        int i = innerClassCount + 1;
        innerClassCount = i;
        sb.append(i);
        String string = sb.toString();
        String str = c0527.m2024().f520.replace('/', '_') + "$" + string;
        This.CONTEXT_ARGS.get().put(string, objArr);
        Modifiers modifiers = new Modifiers(0);
        if (C0005.f480 == null) {
            C0005.f480 = new C0005();
        }
        C0005.f480.getClass();
        try {
            return AbstractC0016.m522(C0005.m323(str, modifiers, null, cls, bSHBlock, EnumC0698.f2672, c0527, runnableC0008), null, objArr);
        } catch (Exception e) {
            throw new C1232("Error constructing inner class instance: " + e, this, c0527, e instanceof InvocationTargetException ? e.getCause() : e);
        }
    }

    private Object constructWithInterfaceBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, C0527 c0527, RunnableC0008 runnableC0008) {
        C0012 c0012 = new C0012(c0527.m2024(), null, "AnonymousBlock");
        c0527.m2022(c0012);
        try {
            bSHBlock.eval(c0527, runnableC0008, Boolean.TRUE);
            c0527.m2021();
            c0012.m379(cls);
            return c0012.mo313(runnableC0008).getInterface(cls);
        } catch (Throwable th) {
            c0527.m2021();
            throw th;
        }
    }

    private Object objectAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArguments bSHArguments, C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        Object[] arguments = bSHArguments.getArguments(c0527, runnableC0008);
        if (arguments == null) {
            throw new C1231("Null args in new.", this, c0527);
        }
        Object object = bSHAmbiguousName.toObject(c0527, runnableC0008, true);
        if (!(object instanceof C0699)) {
            throw new C1232("Unknown class: " + bSHAmbiguousName.text, this, c0527);
        }
        Class<?> cls = ((C0699) object).f2676;
        boolean z = jjtGetNumChildren() > 2;
        try {
            RunnableC0008.f502.m3841(cls, arguments);
            if (!z) {
                return constructObject(cls, arguments, c0527, runnableC0008);
            }
            BSHBlock bSHBlock = (BSHBlock) jjtGetChild(2);
            return cls.isInterface() ? constructWithInterfaceBody(cls, arguments, bSHBlock, c0527, runnableC0008) : constructWithClassBody(cls, arguments, bSHBlock, c0527, runnableC0008);
        } catch (C2705 e) {
            throw e.mo4677(this, c0527);
        }
    }

    private Object objectArrayAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArrayDimensions bSHArrayDimensions, C0527 c0527, RunnableC0008 runnableC0008) {
        return arrayAllocation(bSHArrayDimensions, bSHAmbiguousName.toClass(c0527, runnableC0008), c0527, runnableC0008);
    }

    private Object primitiveArrayAllocation(BSHPrimitiveType bSHPrimitiveType, BSHArrayDimensions bSHArrayDimensions, C0527 c0527, RunnableC0008 runnableC0008) {
        return arrayAllocation(bSHArrayDimensions, bSHPrimitiveType.getType(), c0527, runnableC0008);
    }

    public Object constructFromEnclosingInstance(Object obj, C0527 c0527, RunnableC0008 runnableC0008) throws C2954 {
        String str = jjtGetChild(0) instanceof BSHAmbiguousName ? ((BSHAmbiguousName) jjtGetChild(0)).text : "";
        Class<?> cls = null;
        Object[] arguments = jjtGetChild(1) instanceof BSHArguments ? ((BSHArguments) jjtGetChild(1)).getArguments(c0527, runnableC0008) : null;
        for (Class<?> cls2 : obj.getClass().getDeclaredClasses()) {
            if (AbstractC0017.m561(cls2.getName()).equals(str)) {
                cls = cls2;
                break;
            }
        }
        try {
            return AbstractC0016.m522(cls, obj, arguments);
        } catch (InvocationTargetException e) {
            throw new C2954("Object constructor", e.getCause(), this, c0527, true);
        }
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        if (jjtGetNumChildren() == 1 && (jjtGetChild(0) instanceof BSHArrayDimensions)) {
            return arrayAllocation((BSHArrayDimensions) jjtGetChild(0), Void.TYPE, c0527, runnableC0008);
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Node nodeJjtGetChild2 = jjtGetChild(1);
        if (!(nodeJjtGetChild instanceof BSHAmbiguousName)) {
            return primitiveArrayAllocation((BSHPrimitiveType) nodeJjtGetChild, (BSHArrayDimensions) nodeJjtGetChild2, c0527, runnableC0008);
        }
        BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) nodeJjtGetChild;
        return nodeJjtGetChild2 instanceof BSHArguments ? objectAllocation(bSHAmbiguousName, (BSHArguments) nodeJjtGetChild2, c0527, runnableC0008) : objectArrayAllocation(bSHAmbiguousName, (BSHArrayDimensions) nodeJjtGetChild2, c0527, runnableC0008);
    }
}
