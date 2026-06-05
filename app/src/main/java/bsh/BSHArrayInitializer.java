package bsh;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1933Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayInitializer extends SimpleNode {
    private static final long serialVersionUID = 1;
    Deque<BSHPrimaryExpression> expressionQueue;
    boolean isMapInArray;

    public BSHArrayInitializer(int i) {
        super(i);
        this.isMapInArray = false;
        this.expressionQueue = new ArrayDeque();
    }

    private Object buildArray(int i, Class<?> cls, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3354Ujhhgtgfeyxiexzf {
        Object objEval;
        int[] iArr = new int[i];
        iArr[0] = jjtGetNumChildren();
        Object objNewInstance = Array.newInstance(cls, iArr);
        Class<?> componentType = objNewInstance.getClass().getComponentType();
        for (int i2 = 0; i2 < jjtGetNumChildren(); i2++) {
            Node nodeJjtGetChild = jjtGetChild(i2);
            if (!(nodeJjtGetChild instanceof BSHArrayInitializer)) {
                objEval = nodeJjtGetChild.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            } else if (i < 2) {
                BSHArrayInitializer bSHArrayInitializer = (BSHArrayInitializer) nodeJjtGetChild;
                if (!isMapInArray(bSHArrayInitializer)) {
                    throw new C3354Ujhhgtgfeyxiexzf("Invalid Intializer for " + cls + ", at position: " + i2, this, c2637feyxiexzfUjhhgtg);
                }
                objEval = bSHArrayInitializer.eval(C1933Ujhhgtgfeyxiexzf.class, 1, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            } else {
                objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(cls, i - 1, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            if (objEval == Primitive.VOID) {
                throw new C3354Ujhhgtgfeyxiexzf(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i2, "Void in array initializer, position "), this, c2637feyxiexzfUjhhgtg);
            }
            try {
                Array.set(objNewInstance, i2, normalizeEntry(objEval, componentType, i, c2637feyxiexzfUjhhgtg));
            } catch (IllegalArgumentException e) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("illegal arg", e);
                throwTypeError(cls, objEval, i2, c2637feyxiexzfUjhhgtg);
            }
        }
        return objNewInstance;
    }

    private Object buildBean(Class<?> cls, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(new C0029Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf(), null, cls.getName()));
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf = cls;
        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m378Ujhhgtgfeyxiexzf(cls);
        c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf2 = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
            c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf2.f553Ujhhgtgfeyxiexzf = objNewInstance;
            c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf2.f541Ujhhgtgfeyxiexzf.remove(objNewInstance);
            c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf2.f541Ujhhgtgfeyxiexzf.add(0, objNewInstance);
            c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf2.m384feyxiexzfUjhhgtg();
            for (int i = 0; i < jjtGetNumChildren(); i++) {
                BSHAssignment bSHAssignment = (BSHAssignment) jjtGetChild(i);
                BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) bSHAssignment.jjtGetChild(0);
                bSHPrimaryExpression.isMapExpression = false;
                bSHPrimaryExpression.isArrayExpression = false;
                bSHAssignment.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
            return objNewInstance;
        } catch (Throwable th) {
            try {
                throw new C3354Ujhhgtgfeyxiexzf(th.getMessage(), this, c2637feyxiexzfUjhhgtg, th);
            } catch (Throwable th2) {
                c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
                throw th2;
            }
        }
    }

    private void clearEvalCache() {
        Iterator<BSHPrimaryExpression> it = this.expressionQueue.iterator();
        while (it.hasNext()) {
            it.next().clearCache();
        }
    }

    private Class<?> inferCommonType(Class<?> cls, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        if (Object.class != cls && C1933Ujhhgtgfeyxiexzf.class != cls) {
            if (node instanceof BSHAssignment) {
                return AbstractC0034Ujhhgtgfeyxiexzf.m561Ujhhgtgfeyxiexzf(cls, AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), Primitive.isWrapperType(cls))));
            }
            if ((node instanceof BSHArrayInitializer) && isMapInArray((BSHArrayInitializer) node)) {
                return AbstractC0034Ujhhgtgfeyxiexzf.m561Ujhhgtgfeyxiexzf(cls, Map.class);
            }
            for (Node node2 : node.jjtGetChildren()) {
                cls = inferCommonType(cls, node2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
        }
        return cls;
    }

    private int inferDimensions(int i, int i2, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        int i3 = i;
        while (node.jjtGetNumChildren() > i2) {
            node = node.jjtGetChild(i2);
            if (!(node instanceof BSHArrayInitializer) || isMapInArray((BSHArrayInitializer) node) || node.jjtGetNumChildren() <= 0) {
                break;
            }
            i3++;
            i2 = 0;
        }
        if (node instanceof BSHArrayInitializer) {
            return node.jjtGetNumChildren() == 0 ? inferDimensions(i3, i2 + 1, node.jjtGetParent(), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : i3;
        }
        Object objEval = node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        return objEval == Primitive.NULL ? inferDimensions(i3, i2 + 1, node.jjtGetParent(), c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : AbstractC0034Ujhhgtgfeyxiexzf.m555Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(objEval, false)) + i3;
    }

    private boolean isBeanType(Class<?> cls) {
        return Void.TYPE != cls && !AbstractC0034Ujhhgtgfeyxiexzf.m568Ujhhgtgfeyxiexzf(cls) && (jjtGetChild(0) instanceof BSHAssignment) && (jjtGetChild(0).jjtGetChild(0) instanceof BSHPrimaryExpression) && ((BSHPrimaryExpression) jjtGetChild(0).jjtGetChild(0)).isMapExpression && (jjtGetChild(0).jjtGetChild(0).jjtGetChild(0) instanceof BSHAmbiguousName);
    }

    private boolean isMapInArray(BSHArrayInitializer bSHArrayInitializer) {
        return bSHArrayInitializer.isMapInArray;
    }

    private Object normalizeEntry(Object obj, Class<?> cls, int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) throws C3354Ujhhgtgfeyxiexzf {
        if (i != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, cls, obj));
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            if (((Boolean) RunnableC0026Ujhhgtgfeyxiexzf.f514Ujhhgtgfeyxiexzf.get()).booleanValue()) {
                e.printStackTrace();
            }
            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf("Error in array initializer".concat(": "));
            sbM2707Ujhhgtgfeyxiexzf.append(e.getMessage());
            throw new C3354Ujhhgtgfeyxiexzf(sbM2707Ujhhgtgfeyxiexzf.toString(), this, c2637feyxiexzfUjhhgtg, e);
        }
    }

    private void throwTypeError(Class<?> cls, Object obj, int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) throws C3354Ujhhgtgfeyxiexzf {
        StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("Incompatible type: ", AbstractC3594Ujhhgtgfeyxiexzf.m5197feyxiexzfUjhhgtg(obj), " in initializer of array type: ");
        sbM2419Ujhhgtgfeyxiexzf.append(cls.getSimpleName());
        sbM2419Ujhhgtgfeyxiexzf.append(" at position: ");
        sbM2419Ujhhgtgfeyxiexzf.append(i);
        throw new C3354Ujhhgtgfeyxiexzf(sbM2419Ujhhgtgfeyxiexzf.toString(), this, c2637feyxiexzfUjhhgtg);
    }

    private Object toCollection(Object obj, Class<?> cls, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        Class<?> cls2 = obj.getClass();
        Class clsM556Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls2);
        if (AbstractC0034Ujhhgtgfeyxiexzf.m568Ujhhgtgfeyxiexzf(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM556Ujhhgtgfeyxiexzf) && !Collection.class.isAssignableFrom(clsM556Ujhhgtgfeyxiexzf)))) {
            try {
                return AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, cls, obj);
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        }
        return obj;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        throw new C3353Ujhhgtgfeyxiexzf("Array initializer has no base type.", this, c2637feyxiexzfUjhhgtg);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public void jjtSetParent(Node node) {
        this.parent = node;
        Node[] nodeArr = this.children;
        if (nodeArr != null) {
            for (Node node2 : nodeArr) {
                if (node2.jjtGetNumChildren() > 0 && (node2.jjtGetChild(0) instanceof BSHPrimaryExpression)) {
                    this.expressionQueue.push((BSHPrimaryExpression) node2.jjtGetChild(0));
                    this.expressionQueue.peek().setArrayExpression(this);
                }
            }
        }
    }

    public void setMapInArray(boolean z) {
        this.isMapInArray = z;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.isMapInArray;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    public Object eval(Class<?> cls, int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2;
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf2;
        Class<?> clsInferCommonType;
        if (jjtGetNumChildren() == 0) {
            i = 0;
        }
        Class<?> cls2 = Object.class;
        Class<?> cls3 = Void.TYPE;
        if (i == 0) {
            if (cls != cls3 && !AbstractC0034Ujhhgtgfeyxiexzf.m568Ujhhgtgfeyxiexzf(cls)) {
                cls2 = cls;
            }
            return toCollection(Array.newInstance(cls2, 0), cls, c2637feyxiexzfUjhhgtg);
        }
        if (-1 == i) {
            runnableC0026Ujhhgtgfeyxiexzf.getClass();
            if (isBeanType(cls)) {
                return buildBean(cls, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
            runnableC0026Ujhhgtgfeyxiexzf2 = runnableC0026Ujhhgtgfeyxiexzf;
            i = inferDimensions(1, 0, this, c2637feyxiexzfUjhhgtg2, runnableC0026Ujhhgtgfeyxiexzf2);
            if (AbstractC0034Ujhhgtgfeyxiexzf.m568Ujhhgtgfeyxiexzf(cls)) {
                clsInferCommonType = cls3;
            }
            if (clsInferCommonType == cls3) {
                clsInferCommonType = inferCommonType(null, this, c2637feyxiexzfUjhhgtg2, runnableC0026Ujhhgtgfeyxiexzf2);
            }
            if (i < 2 && ((C1933Ujhhgtgfeyxiexzf.class == clsInferCommonType && cls3 == cls) || C1933Ujhhgtgfeyxiexzf.class == cls)) {
                cls = Map.class;
            }
            if (clsInferCommonType == null) {
                i++;
            } else {
                cls2 = clsInferCommonType;
            }
            Object objBuildArray = buildArray(i, cls2, c2637feyxiexzfUjhhgtg2, runnableC0026Ujhhgtgfeyxiexzf2);
            clearEvalCache();
            return toCollection(objBuildArray, cls, c2637feyxiexzfUjhhgtg2);
        }
        c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
        runnableC0026Ujhhgtgfeyxiexzf2 = runnableC0026Ujhhgtgfeyxiexzf;
        clsInferCommonType = cls;
        if (clsInferCommonType == cls3) {
            clsInferCommonType = inferCommonType(null, this, c2637feyxiexzfUjhhgtg2, runnableC0026Ujhhgtgfeyxiexzf2);
        }
        if (i < 2) {
            cls = Map.class;
        }
        if (clsInferCommonType == null) {
            i++;
        } else {
            cls2 = clsInferCommonType;
        }
        Object objBuildArray2 = buildArray(i, cls2, c2637feyxiexzfUjhhgtg2, runnableC0026Ujhhgtgfeyxiexzf2);
        clearEvalCache();
        return toCollection(objBuildArray2, cls, c2637feyxiexzfUjhhgtg2);
    }
}
