package bsh;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC1095;
import p000.AbstractC2240;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C3524;
import p000.C3581;

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

    private Object buildArray(int i, Class<?> cls, C0527 c0527, RunnableC0008 runnableC0008) throws C1232 {
        Object objEval;
        int[] iArr = new int[i];
        iArr[0] = jjtGetNumChildren();
        Object objNewInstance = Array.newInstance(cls, iArr);
        Class<?> componentType = objNewInstance.getClass().getComponentType();
        for (int i2 = 0; i2 < jjtGetNumChildren(); i2++) {
            Node nodeJjtGetChild = jjtGetChild(i2);
            if (!(nodeJjtGetChild instanceof BSHArrayInitializer)) {
                objEval = nodeJjtGetChild.eval(c0527, runnableC0008);
            } else if (i < 2) {
                BSHArrayInitializer bSHArrayInitializer = (BSHArrayInitializer) nodeJjtGetChild;
                if (!isMapInArray(bSHArrayInitializer)) {
                    throw new C1232("Invalid Intializer for " + cls + ", at position: " + i2, this, c0527);
                }
                objEval = bSHArrayInitializer.eval(C3524.class, 1, c0527, runnableC0008);
            } else {
                objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(cls, i - 1, c0527, runnableC0008);
            }
            if (objEval == Primitive.VOID) {
                throw new C1232(AbstractC1095.m2794(i2, "Void in array initializer, position "), this, c0527);
            }
            try {
                Array.set(objNewInstance, i2, normalizeEntry(objEval, componentType, i, c0527));
            } catch (IllegalArgumentException e) {
                RunnableC0008.m333("illegal arg", e);
                throwTypeError(cls, objEval, i2, c0527);
            }
        }
        return objNewInstance;
    }

    private Object buildBean(Class<?> cls, C0527 c0527, RunnableC0008 runnableC0008) {
        c0527.m2022(new C0012(c0527.m2024(), null, cls.getName()));
        C0012 c0012M2024 = c0527.m2024();
        c0012M2024.f538 = cls;
        c0012M2024.m379(cls);
        c0527.m2024().mo313(runnableC0008);
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C0012 c0012M2025 = c0527.m2024();
            c0012M2025.f539 = objNewInstance;
            c0012M2025.f527.remove(objNewInstance);
            c0012M2025.f527.add(0, objNewInstance);
            c0012M2025.m385();
            for (int i = 0; i < jjtGetNumChildren(); i++) {
                BSHAssignment bSHAssignment = (BSHAssignment) jjtGetChild(i);
                BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) bSHAssignment.jjtGetChild(0);
                bSHPrimaryExpression.isMapExpression = false;
                bSHPrimaryExpression.isArrayExpression = false;
                bSHAssignment.eval(c0527, runnableC0008);
            }
            c0527.m2021();
            return objNewInstance;
        } catch (Throwable th) {
            try {
                throw new C1232(th.getMessage(), this, c0527, th);
            } catch (Throwable th2) {
                c0527.m2021();
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

    private Class<?> inferCommonType(Class<?> cls, Node node, C0527 c0527, RunnableC0008 runnableC0008) {
        if (Object.class != cls && C3524.class != cls) {
            if (node instanceof BSHAssignment) {
                return AbstractC0017.m562(cls, AbstractC0017.m557(AbstractC0017.m563(node.eval(c0527, runnableC0008), Primitive.isWrapperType(cls))));
            }
            if ((node instanceof BSHArrayInitializer) && isMapInArray((BSHArrayInitializer) node)) {
                return AbstractC0017.m562(cls, Map.class);
            }
            for (Node node2 : node.jjtGetChildren()) {
                cls = inferCommonType(cls, node2, c0527, runnableC0008);
            }
        }
        return cls;
    }

    private int inferDimensions(int i, int i2, Node node, C0527 c0527, RunnableC0008 runnableC0008) {
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
            return node.jjtGetNumChildren() == 0 ? inferDimensions(i3, i2 + 1, node.jjtGetParent(), c0527, runnableC0008) : i3;
        }
        Object objEval = node.eval(c0527, runnableC0008);
        return objEval == Primitive.NULL ? inferDimensions(i3, i2 + 1, node.jjtGetParent(), c0527, runnableC0008) : AbstractC0017.m556(AbstractC0017.m563(objEval, false)) + i3;
    }

    private boolean isBeanType(Class<?> cls) {
        return Void.TYPE != cls && !AbstractC0017.m569(cls) && (jjtGetChild(0) instanceof BSHAssignment) && (jjtGetChild(0).jjtGetChild(0) instanceof BSHPrimaryExpression) && ((BSHPrimaryExpression) jjtGetChild(0).jjtGetChild(0)).isMapExpression && (jjtGetChild(0).jjtGetChild(0).jjtGetChild(0) instanceof BSHAmbiguousName);
    }

    private boolean isMapInArray(BSHArrayInitializer bSHArrayInitializer) {
        return bSHArrayInitializer.isMapInArray;
    }

    private Object normalizeEntry(Object obj, Class<?> cls, int i, C0527 c0527) throws C1232 {
        if (i != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC0017.m559(0, cls, obj));
        } catch (C3581 e) {
            if (((Boolean) RunnableC0008.f500.get()).booleanValue()) {
                e.printStackTrace();
            }
            StringBuilder sbM4787 = AbstractC2844.m4787("Error in array initializer".concat(": "));
            sbM4787.append(e.getMessage());
            throw new C1232(sbM4787.toString(), this, c0527, e);
        }
    }

    private void throwTypeError(Class<?> cls, Object obj, int i, C0527 c0527) throws C1232 {
        StringBuilder sbM4625 = AbstractC2647.m4625("Incompatible type: ", AbstractC2240.m4268(obj), " in initializer of array type: ");
        sbM4625.append(cls.getSimpleName());
        sbM4625.append(" at position: ");
        sbM4625.append(i);
        throw new C1232(sbM4625.toString(), this, c0527);
    }

    private Object toCollection(Object obj, Class<?> cls, C0527 c0527) {
        Class<?> cls2 = obj.getClass();
        Class clsM557 = AbstractC0017.m557(cls2);
        if (AbstractC0017.m569(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM557) && !Collection.class.isAssignableFrom(clsM557)))) {
            try {
                return AbstractC0017.m559(0, cls, obj);
            } catch (C3581 e) {
                e.mo4677(this, c0527);
            }
        }
        return obj;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        throw new C1231("Array initializer has no base type.", this, c0527);
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
    public Object eval(Class<?> cls, int i, C0527 c0527, RunnableC0008 runnableC0008) {
        C0527 c0528;
        RunnableC0008 runnableC0009;
        Class<?> clsInferCommonType;
        if (jjtGetNumChildren() == 0) {
            i = 0;
        }
        Class<?> cls2 = Object.class;
        Class<?> cls3 = Void.TYPE;
        if (i == 0) {
            if (cls != cls3 && !AbstractC0017.m569(cls)) {
                cls2 = cls;
            }
            return toCollection(Array.newInstance(cls2, 0), cls, c0527);
        }
        if (-1 == i) {
            runnableC0008.getClass();
            if (isBeanType(cls)) {
                return buildBean(cls, c0527, runnableC0008);
            }
            c0528 = c0527;
            runnableC0009 = runnableC0008;
            i = inferDimensions(1, 0, this, c0528, runnableC0009);
            if (AbstractC0017.m569(cls)) {
                clsInferCommonType = cls3;
            }
            if (clsInferCommonType == cls3) {
                clsInferCommonType = inferCommonType(null, this, c0528, runnableC0009);
            }
            if (i < 2 && ((C3524.class == clsInferCommonType && cls3 == cls) || C3524.class == cls)) {
                cls = Map.class;
            }
            if (clsInferCommonType == null) {
                i++;
            } else {
                cls2 = clsInferCommonType;
            }
            Object objBuildArray = buildArray(i, cls2, c0528, runnableC0009);
            clearEvalCache();
            return toCollection(objBuildArray, cls, c0528);
        }
        c0528 = c0527;
        runnableC0009 = runnableC0008;
        clsInferCommonType = cls;
        if (clsInferCommonType == cls3) {
            clsInferCommonType = inferCommonType(null, this, c0528, runnableC0009);
        }
        if (i < 2) {
            cls = Map.class;
        }
        if (clsInferCommonType == null) {
            i++;
        } else {
            cls2 = clsInferCommonType;
        }
        Object objBuildArray2 = buildArray(i, cls2, c0528, runnableC0009);
        clearEvalCache();
        return toCollection(objBuildArray2, cls, c0528);
    }
}
