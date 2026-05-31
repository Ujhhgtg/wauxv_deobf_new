package bsh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.AbstractC0472;
import p000.AbstractC1468;
import p000.AbstractC2844;
import p000.C0453;
import p000.C0470;
import p000.C0471;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1684;
import p000.C2573;
import p000.C2683;
import p000.C3581;

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
      0x0138: PHI (r3v4 int) = (r3v3 int), (r3v17 int) binds: [B:59:0x00de, B:80:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    private Object doIndex(Object obj, boolean z, C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        int iIntValue;
        int i;
        Integer numValueOf;
        runnableC0008.getClass();
        Map map = AbstractC0017.f574;
        int i2 = 0;
        if (obj instanceof Map) {
            Object objEval = jjtGetChild(0).eval(c0527, runnableC0008);
            return z ? new LHS(obj, objEval) : AbstractC0016.m537(obj, objEval);
        }
        if (obj instanceof Map.Entry) {
            Object objEval2 = jjtGetChild(0).eval(c0527, runnableC0008);
            if (!z) {
                return AbstractC0016.m537(obj, objEval2);
            }
            if (objEval2.equals(((Map.Entry) obj).getKey())) {
                return new LHS(obj);
            }
            throw new C1231("No such property: " + objEval2, this, c0527);
        }
        Class<?> cls = obj.getClass();
        if (!(obj instanceof List) && !cls.isArray()) {
            throw new C1231("Not an array or List type", this, c0527);
        }
        int size = obj instanceof List ? ((List) obj).size() : Array.getLength(obj);
        int indexAux = size + 1;
        if (AbstractC0017.m576(cls)) {
            Object objEval3 = jjtGetChild(0).eval(c0527, runnableC0008);
            if (((!(objEval3 instanceof Primitive) || !((Primitive) objEval3).isNumber()) && !Primitive.isWrapperType(objEval3.getClass())) || size <= (indexAux = ((Integer) Primitive.castWrapper(Integer.TYPE, objEval3)).intValue()) || (-size) >= indexAux) {
                return z ? new LHS(AbstractC0016.m530(objEval3, (Map.Entry[]) obj)) : AbstractC0016.m537(obj, objEval3);
            }
        } else if (indexAux > size) {
            indexAux = getIndexAux(obj, 0, c0527, runnableC0008, this);
        }
        if (indexAux < 0) {
            indexAux += size;
        }
        if (!this.slice) {
            if (z) {
                return new LHS(obj, indexAux);
            }
            try {
                return AbstractC1468.m3309(indexAux, obj);
            } catch (C3581 e) {
                throw e.mo4678("Error array get index", this, c0527);
            }
        }
        if (z) {
            throw new C1231("cannot assign to array slice", this, c0527);
        }
        if (this.step) {
            if (this.hasLeftIndex && this.hasRightIndex && jjtGetNumChildren() == 3) {
                numValueOf = Integer.valueOf(getIndexAux(obj, 2, c0527, runnableC0008, this));
            } else if (!(this.hasLeftIndex && this.hasRightIndex) && jjtGetNumChildren() == 2) {
                numValueOf = Integer.valueOf(getIndexAux(obj, 1, c0527, runnableC0008, this));
            } else if (this.hasLeftIndex || this.hasRightIndex) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(getIndexAux(obj, 0, c0527, runnableC0008, this));
                indexAux = 0;
            }
            if (numValueOf == null) {
                iIntValue = 0;
            } else {
                if (numValueOf.intValue() == 0) {
                    throw new C1231("array slice step cannot be zero", this, c0527);
                }
                iIntValue = numValueOf.intValue();
            }
        } else {
            iIntValue = 0;
        }
        if (this.hasLeftIndex && this.hasRightIndex) {
            int i3 = indexAux;
            indexAux = getIndexAux(obj, 1, c0527, runnableC0008, this);
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
            return new C0453(list, arrayList);
        }
        Class clsM557 = AbstractC0017.m557(obj.getClass());
        int length = Array.getLength(obj);
        if (indexAux > length) {
            indexAux = length;
        }
        if (i < 0) {
            i = 0;
        }
        int i5 = indexAux - i;
        if (i5 <= 0) {
            return Array.newInstance((Class<?>) clsM557, 0);
        }
        if (iIntValue == 0 || iIntValue == 1) {
            Object objNewInstance = Array.newInstance((Class<?>) clsM557, i5);
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
        Object objNewInstance2 = Array.newInstance((Class<?>) clsM557, iCeil);
        AbstractC1468.m3303(clsM557, objNewInstance2, objArr);
        return objNewInstance2;
    }

    private AbstractC0472 doMethodRef(Object obj) {
        String str = this.field;
        C0471 c0471 = AbstractC0472.f2103;
        return new C0470(this, obj, str);
    }

    private Object doName(Object obj, boolean z, C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        C0527 c0528;
        C3581 c3581;
        try {
            if (this.safeNavigate) {
                try {
                    if (Primitive.NULL == obj) {
                        throw C2683.f8674;
                    }
                } catch (C3581 e) {
                    c3581 = e;
                    c0528 = c0527;
                }
            }
            if (this.field.equals("length") && obj.getClass().isArray()) {
                RunnableC0008.f502.m3842();
                if (z) {
                    throw new C1231("Can't assign array length", this, c0527);
                }
                return new Primitive(Array.getLength(obj));
            }
            if (jjtGetNumChildren() == 0) {
                RunnableC0008.f502.m3842();
                if (z) {
                    try {
                        return AbstractC0016.m532(obj, this.field);
                    } catch (Throwable unused) {
                        return new LHS(obj, this.field);
                    }
                }
                try {
                    try {
                        return AbstractC0016.m536(obj, this.field);
                    } catch (Throwable unused2) {
                        return AbstractC0016.m538(obj, this.field);
                    }
                } catch (Throwable unused3) {
                    return Primitive.VOID;
                }
                c3581 = e;
                c0528 = c0527;
                throw c3581.mo4677(this, c0528);
            }
            Object[] arguments = ((BSHArguments) jjtGetChild(0)).getArguments(c0527, runnableC0008);
            RunnableC0008.f502.m3844(obj, this.field, arguments);
            c0528 = c0527;
            try {
                return AbstractC0016.m544(obj, this.field, arguments, runnableC0008, c0528, this);
            } catch (C3581 e2) {
                e = e2;
            }
        } catch (C3581 e3) {
            e = e3;
            c0528 = c0527;
        }
        c3581 = e;
        throw c3581.mo4677(this, c0528);
    }

    private Object doNewInner(Object obj, boolean z, C0527 c0527, RunnableC0008 runnableC0008) {
        BSHAllocationExpression bSHAllocationExpression = (BSHAllocationExpression) jjtGetChild(0);
        if (!AbstractC0016.m546(obj.getClass())) {
            return bSHAllocationExpression.constructFromEnclosingInstance(obj, c0527, runnableC0008);
        }
        c0527.m2021();
        c0527.m2022(AbstractC0016.m540(obj));
        return bSHAllocationExpression.eval(c0527, runnableC0008);
    }

    private Object doProperty(boolean z, Object obj, C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        if (obj == Primitive.VOID) {
            throw new C1231("Attempt to access property on undefined variable or class name", this, c0527);
        }
        if (obj instanceof Primitive) {
            throw new C1231("Attempt to access property on a primitive", this, c0527);
        }
        Object objEval = jjtGetChild(0).eval(c0527, runnableC0008);
        if (!(objEval instanceof String)) {
            throw new C1231("Property expression must be a String or identifier.", this, c0527);
        }
        if (z) {
            return new LHS(obj, (String) objEval);
        }
        try {
            Object objM538 = AbstractC0016.m538(obj, (String) objEval);
            return objM538 == null ? Primitive.NULL : Primitive.unwrap(objM538);
        } catch (C2573 e) {
            throw new C1231("No such property: " + objEval, this, c0527, e);
        }
    }

    public static int getIndexAux(Object obj, int i, C0527 c0527, RunnableC0008 runnableC0008, Node node) throws C1231 {
        try {
            Object objEval = node.jjtGetChild(i).eval(c0527, runnableC0008);
            boolean z = objEval instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z) {
                objEval = AbstractC0017.m559(1, cls, objEval);
            }
            return ((Integer) Primitive.castWrapper(cls, objEval)).intValue();
        } catch (Exception e) {
            RunnableC0008.m333("doIndex: " + e);
            throw new C1231("Array index does not evaluate to an integer.", node, c0527, e);
        }
    }

    public Object doSuffix(Object obj, boolean z, C0527 c0527, RunnableC0008 runnableC0008) {
        if (this.operation == 6) {
            if (!(obj instanceof BSHType)) {
                throw new C1232("Attempt to use .class suffix on non class.", this, c0527);
            }
            if (z) {
                throw new C1232("Can't assign .class", this, c0527);
            }
            return ((BSHType) obj).getType(c0527, runnableC0008);
        }
        if (obj instanceof Node) {
            obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(c0527, runnableC0008) : ((Node) obj).eval(c0527, runnableC0008);
        } else if (obj instanceof LHS) {
            try {
                obj = ((LHS) obj).getValue();
            } catch (C3581 e) {
                throw e.mo4677(this, c0527);
            }
        }
        try {
            int i = this.operation;
            if (i == 1) {
                return doIndex(obj, z, c0527, runnableC0008);
            }
            if (i == 2) {
                return doName(obj, z, c0527, runnableC0008);
            }
            if (i == 3) {
                return doProperty(z, obj, c0527, runnableC0008);
            }
            if (i == 4) {
                return doNewInner(obj, z, c0527, runnableC0008);
            }
            if (i == 5) {
                return doMethodRef(obj);
            }
            throw new C1684("Unknown suffix type");
        } catch (C2573 e2) {
            throw new C1231("reflection error: " + e2, this, c0527, e2);
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
                return AbstractC2844.m4786(new StringBuilder(), super.toString(), ":PROPERTY {}");
            }
            if (i == 4) {
                return AbstractC2844.m4786(new StringBuilder(), super.toString(), ":NEW new");
            }
            return i == 6 ? AbstractC2844.m4786(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC2844.m4786(new StringBuilder(), super.toString(), ":NO OPERATION");
        }
        return super.toString() + ":INDEX [" + this.hasLeftIndex + ":" + this.slice + " " + this.hasRightIndex + ":" + this.step + "]";
    }
}
