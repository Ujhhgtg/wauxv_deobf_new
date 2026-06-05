package bsh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC2584feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0940feyxiexzfUjhhgtg;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2566Ujhhgtgfeyxiexzf;
import p000.C2581feyxiexzfUjhhgtg;
import p000.C2582feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimarySuffix extends SimpleNode {
    public static final int CLASS = 6;
    public static final int INDEX = 1;
    public static final int METHODREF = 5;
    public static final int NAME = 2;
    public static final int NEW = 4;
    public static final int PROPERTY = 3;
    private static final long serialVersionUID = 1;
    public String field;
    public boolean hasLeftIndex;
    public boolean hasRightIndex;
    Object index;
    public int operation;
    public boolean safeNavigate;
    public boolean slice;
    public boolean step;

    public BSHPrimarySuffix(int i) {
        super(i);
        this.slice = false;
        this.step = false;
        this.hasLeftIndex = false;
        this.hasRightIndex = false;
        this.safeNavigate = false;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0138 A[PHI: r3
      0x0138: PHI (r3v4 int) = (r3v3 int), (r3v17 int) binds: [B:59:0x00df, B:80:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    private Object doIndex(Object obj, boolean z, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        int iIntValue;
        int i;
        Integer numValueOf;
        runnableC0026Ujhhgtgfeyxiexzf.getClass();
        Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
        int i2 = 0;
        if (obj instanceof Map) {
            Object objEval = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            return z ? new C0151Ujhhgtgfeyxiexzf(obj, objEval) : AbstractC0033Ujhhgtgfeyxiexzf.m536Ujhhgtgfeyxiexzf(obj, objEval);
        }
        if (obj instanceof Map.Entry) {
            Object objEval2 = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            if (!z) {
                return AbstractC0033Ujhhgtgfeyxiexzf.m536Ujhhgtgfeyxiexzf(obj, objEval2);
            }
            if (objEval2.equals(((Map.Entry) obj).getKey())) {
                return new C0151Ujhhgtgfeyxiexzf(obj);
            }
            throw new C3353Ujhhgtgfeyxiexzf("No such property: " + objEval2, this, c2637feyxiexzfUjhhgtg);
        }
        Class<?> cls = obj.getClass();
        if (!(obj instanceof List) && !cls.isArray()) {
            throw new C3353Ujhhgtgfeyxiexzf("Not an array or List type", this, c2637feyxiexzfUjhhgtg);
        }
        int size = obj instanceof List ? ((List) obj).size() : Array.getLength(obj);
        int indexAux = size + 1;
        if (AbstractC0034Ujhhgtgfeyxiexzf.m575Ujhhgtgfeyxiexzf(cls)) {
            Object objEval3 = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            if (((!(objEval3 instanceof Primitive) || !((Primitive) objEval3).isNumber()) && !Primitive.isWrapperType(objEval3.getClass())) || size <= (indexAux = ((Integer) Primitive.castWrapper(Integer.TYPE, objEval3)).intValue()) || (-size) >= indexAux) {
                return z ? new C0151Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m529Ujhhgtgfeyxiexzf(objEval3, (Map.Entry[]) obj)) : AbstractC0033Ujhhgtgfeyxiexzf.m536Ujhhgtgfeyxiexzf(obj, objEval3);
            }
        } else if (indexAux > size) {
            indexAux = getIndexAux(obj, 0, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, this);
        }
        if (indexAux < 0) {
            indexAux += size;
        }
        if (!this.slice) {
            if (!z) {
                try {
                    return AbstractC3516feyxiexzfUjhhgtg.m5060Ujhhgtgfeyxiexzf(indexAux, obj);
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    throw e.mo2570Ujhhgtgfeyxiexzf("Error array get index", this, c2637feyxiexzfUjhhgtg);
                }
            }
            C0151Ujhhgtgfeyxiexzf c0151Ujhhgtgfeyxiexzf = new C0151Ujhhgtgfeyxiexzf();
            c0151Ujhhgtgfeyxiexzf.f1310Ujhhgtgfeyxiexzf = 3;
            c0151Ujhhgtgfeyxiexzf.f1314Ujhhgtgfeyxiexzf = obj;
            c0151Ujhhgtgfeyxiexzf.f1315Ujhhgtgfeyxiexzf = indexAux;
            return c0151Ujhhgtgfeyxiexzf;
        }
        if (z) {
            throw new C3353Ujhhgtgfeyxiexzf("cannot assign to array slice", this, c2637feyxiexzfUjhhgtg);
        }
        if (this.step) {
            if (this.hasLeftIndex && this.hasRightIndex && jjtGetNumChildren() == 3) {
                numValueOf = Integer.valueOf(getIndexAux(obj, 2, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, this));
            } else if (!(this.hasLeftIndex && this.hasRightIndex) && jjtGetNumChildren() == 2) {
                numValueOf = Integer.valueOf(getIndexAux(obj, 1, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, this));
            } else if (this.hasLeftIndex || this.hasRightIndex) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(getIndexAux(obj, 0, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, this));
                indexAux = 0;
            }
            if (numValueOf == null) {
                iIntValue = 0;
            } else {
                if (numValueOf.intValue() == 0) {
                    throw new C3353Ujhhgtgfeyxiexzf("array slice step cannot be zero", this, c2637feyxiexzfUjhhgtg);
                }
                iIntValue = numValueOf.intValue();
            }
        } else {
            iIntValue = 0;
        }
        if (this.hasLeftIndex && this.hasRightIndex) {
            int i3 = indexAux;
            indexAux = getIndexAux(obj, 1, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, this);
            i = i3;
        } else if (this.hasRightIndex) {
            i = 0;
        } else {
            i = indexAux;
            indexAux = size;
        }
        if (indexAux < 0) {
            indexAux += size;
        }
        if (!obj.getClass().isArray()) {
            List list = (List) obj;
            int size2 = list.size();
            if (indexAux > size2) {
                indexAux = size2;
            }
            if (i < 0) {
                i = 0;
            }
            int i4 = indexAux - i;
            if (i4 <= 0) {
                return list.subList(0, 0);
            }
            if (iIntValue == 0 || iIntValue == 1) {
                return list.subList(i, indexAux);
            }
            ArrayList arrayList = new ArrayList();
            while (i2 < i4) {
                if (i2 % iIntValue == 0) {
                    arrayList.add(Integer.valueOf(iIntValue < 0 ? (i4 - 1) - i2 : i2 + i));
                }
                i2++;
            }
            return new C2566Ujhhgtgfeyxiexzf(list, arrayList);
        }
        Class clsM556Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(obj.getClass());
        int length = Array.getLength(obj);
        if (indexAux > length) {
            indexAux = length;
        }
        if (i < 0) {
            i = 0;
        }
        int i5 = indexAux - i;
        if (i5 <= 0) {
            return Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf, 0);
        }
        if (iIntValue == 0 || iIntValue == 1) {
            Object objNewInstance = Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf, i5);
            System.arraycopy(obj, i, objNewInstance, 0, i5);
            return objNewInstance;
        }
        int iCeil = (int) Math.ceil((((double) i5) + 0.0d) / ((double) Math.abs(iIntValue)));
        Object[] objArr = new Object[iCeil];
        int i6 = 0;
        while (i2 < i5) {
            if (i2 % iIntValue == 0) {
                int i7 = i6 + 1;
                objArr[i6] = Array.get(obj, iIntValue < 0 ? (i5 - 1) - i2 : i2 + i);
                i6 = i7;
            }
            i2++;
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf, iCeil);
        AbstractC3516feyxiexzfUjhhgtg.m5054Ujhhgtgfeyxiexzf(clsM556Ujhhgtgfeyxiexzf, objNewInstance2, objArr);
        return objNewInstance2;
    }

    private AbstractC2584feyxiexzfUjhhgtg doMethodRef(Object obj) {
        String str = this.field;
        C2581feyxiexzfUjhhgtg c2581feyxiexzfUjhhgtg = AbstractC2584feyxiexzfUjhhgtg.f8356Ujhhgtgfeyxiexzf;
        return new C2582feyxiexzfUjhhgtg(this, obj, str);
    }

    private Object doName(Object obj, boolean z, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2;
        C1863Ujhhgtgfeyxiexzf c1863Ujhhgtgfeyxiexzf;
        try {
            if (this.safeNavigate) {
                try {
                    if (Primitive.NULL == obj) {
                        throw C0940feyxiexzfUjhhgtg.f3783Ujhhgtgfeyxiexzf;
                    }
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    c1863Ujhhgtgfeyxiexzf = e;
                    c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
                }
            }
            if (this.field.equals("length") && obj.getClass().isArray()) {
                RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1216Ujhhgtgfeyxiexzf();
                if (z) {
                    throw new C3353Ujhhgtgfeyxiexzf("Can't assign array length", this, c2637feyxiexzfUjhhgtg);
                }
                return new Primitive(Array.getLength(obj));
            }
            if (jjtGetNumChildren() == 0) {
                RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1216Ujhhgtgfeyxiexzf();
                if (z) {
                    try {
                        return AbstractC0033Ujhhgtgfeyxiexzf.m531Ujhhgtgfeyxiexzf(obj, this.field);
                    } catch (Throwable unused) {
                        return new C0151Ujhhgtgfeyxiexzf(obj, this.field);
                    }
                }
                try {
                    try {
                        return AbstractC0033Ujhhgtgfeyxiexzf.m535Ujhhgtgfeyxiexzf(obj, this.field);
                    } catch (Throwable unused2) {
                        return AbstractC0033Ujhhgtgfeyxiexzf.m537Ujhhgtgfeyxiexzf(obj, this.field);
                    }
                } catch (Throwable unused3) {
                    return Primitive.VOID;
                }
                c1863Ujhhgtgfeyxiexzf = e;
                c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
                throw c1863Ujhhgtgfeyxiexzf.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg2);
            }
            Object[] arguments = ((BSHArguments) jjtGetChild(0)).getArguments(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1218Ujhhgtgfeyxiexzf(obj, this.field, arguments);
            c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
            try {
                return AbstractC0033Ujhhgtgfeyxiexzf.m543Ujhhgtgfeyxiexzf(obj, this.field, arguments, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg2, this);
            } catch (C1863Ujhhgtgfeyxiexzf e2) {
                e = e2;
            }
        } catch (C1863Ujhhgtgfeyxiexzf e3) {
            e = e3;
            c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
        }
        c1863Ujhhgtgfeyxiexzf = e;
        throw c1863Ujhhgtgfeyxiexzf.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg2);
    }

    private Object doNewInner(Object obj, boolean z, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        BSHAllocationExpression bSHAllocationExpression = (BSHAllocationExpression) jjtGetChild(0);
        if (!AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(obj.getClass())) {
            return bSHAllocationExpression.constructFromEnclosingInstance(obj, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        c2637feyxiexzfUjhhgtg.m3970Ujhhgtgfeyxiexzf();
        c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(obj));
        return bSHAllocationExpression.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
    }

    private Object doProperty(boolean z, Object obj, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        if (obj == Primitive.VOID) {
            throw new C3353Ujhhgtgfeyxiexzf("Attempt to access property on undefined variable or class name", this, c2637feyxiexzfUjhhgtg);
        }
        if (obj instanceof Primitive) {
            throw new C3353Ujhhgtgfeyxiexzf("Attempt to access property on a primitive", this, c2637feyxiexzfUjhhgtg);
        }
        Object objEval = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (!(objEval instanceof String)) {
            throw new C3353Ujhhgtgfeyxiexzf("Property expression must be a String or identifier.", this, c2637feyxiexzfUjhhgtg);
        }
        if (z) {
            return new C0151Ujhhgtgfeyxiexzf(obj, (String) objEval);
        }
        try {
            Object objM537Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m537Ujhhgtgfeyxiexzf(obj, (String) objEval);
            return objM537Ujhhgtgfeyxiexzf == null ? Primitive.NULL : Primitive.unwrap(objM537Ujhhgtgfeyxiexzf);
        } catch (C0958feyxiexzfUjhhgtg e) {
            throw new C3353Ujhhgtgfeyxiexzf("No such property: " + objEval, this, c2637feyxiexzfUjhhgtg, e);
        }
    }

    public static int getIndexAux(Object obj, int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, Node node) throws C3353Ujhhgtgfeyxiexzf {
        try {
            Object objEval = node.jjtGetChild(i).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            boolean z = objEval instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z) {
                objEval = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(1, cls, objEval);
            }
            return ((Integer) Primitive.castWrapper(cls, objEval)).intValue();
        } catch (Exception e) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("doIndex: " + e);
            throw new C3353Ujhhgtgfeyxiexzf("Array index does not evaluate to an integer.", node, c2637feyxiexzfUjhhgtg, e);
        }
    }

    public Object doSuffix(Object obj, boolean z, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        if (this.operation == 6) {
            if (!(obj instanceof BSHType)) {
                throw new C3354Ujhhgtgfeyxiexzf("Attempt to use .class suffix on non class.", this, c2637feyxiexzfUjhhgtg);
            }
            if (z) {
                throw new C3354Ujhhgtgfeyxiexzf("Can't assign .class", this, c2637feyxiexzfUjhhgtg);
            }
            return ((BSHType) obj).getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        if (obj instanceof Node) {
            obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf) : ((Node) obj).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        } else if (obj instanceof C0151Ujhhgtgfeyxiexzf) {
            try {
                obj = ((C0151Ujhhgtgfeyxiexzf) obj).m1195Ujhhgtgfeyxiexzf();
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        }
        try {
            int i = this.operation;
            if (i == 1) {
                return doIndex(obj, z, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            if (i == 2) {
                return doName(obj, z, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            if (i == 3) {
                return doProperty(z, obj, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            if (i == 4) {
                return doNewInner(obj, z, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
            if (i == 5) {
                return doMethodRef(obj);
            }
            throw new C0712Ujhhgtgfeyxiexzf("Unknown suffix type");
        } catch (C0958feyxiexzfUjhhgtg e2) {
            throw new C3353Ujhhgtgfeyxiexzf("reflection error: " + e2, this, c2637feyxiexzfUjhhgtg, e2);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        int i = this.operation;
        if (i != 1) {
            if (i == 2) {
                return super.toString() + ":NAME " + this.field;
            }
            if (i == 3) {
                return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ":PROPERTY {}");
            }
            if (i == 4) {
                return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ":NEW new");
            }
            return i == 6 ? AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), super.toString(), ":NO OPERATION");
        }
        return super.toString() + ":INDEX [" + this.hasLeftIndex + ":" + this.slice + " " + this.hasRightIndex + ":" + this.step + "]";
    }
}
