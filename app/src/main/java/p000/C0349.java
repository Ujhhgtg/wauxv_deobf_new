package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.C0001;
import bsh.Primitive;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0349 extends AbstractC2707 {

    public int f1652;

    public String f1653;

    public boolean f1654;

    public boolean f1655;

    public boolean f1656;

    public boolean f1657;

    public boolean f1658;

    public static int m1460(int i, C0550 c0550, RunnableC1668 runnableC1668, C0349 c0349) throws C1229 {
        try {
            Object objMo306 = c0349.f8721[i].mo306(c0550, runnableC1668);
            boolean z = objMo306 instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z) {
                objMo306 = AbstractC0010.m414(1, cls, objMo306);
            }
            return ((Integer) Primitive.castWrapper(cls, objMo306)).intValue();
        } catch (Exception e) {
            RunnableC1668.m3389("doIndex: " + e);
            throw new C1229("Array index does not evaluate to an integer.", c0349, c0550, e);
        }
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        int i = this.f1652;
        if (i != 1) {
            if (i == 2) {
                return super.toString() + ":NAME " + this.f1653;
            }
            if (i == 3) {
                return AbstractC2784.m4752(new StringBuilder(), super.toString(), ":PROPERTY {}");
            }
            if (i == 4) {
                return AbstractC2784.m4752(new StringBuilder(), super.toString(), ":NEW new");
            }
            return i == 6 ? AbstractC2784.m4752(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC2784.m4752(new StringBuilder(), super.toString(), ":NO OPERATION");
        }
        return super.toString() + ":INDEX [" + this.f1656 + ":" + this.f1654 + " " + this.f1657 + ":" + this.f1655 + "]";
    }

    /* JADX WARN: Code duplicated, block: B:86:0x013a A[PHI: r3
      0x013a: PHI (r3v4 int) = (r3v3 int), (r3v17 int) binds: [B:59:0x00df, B:80:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object m1461(C0550 c0550, RunnableC1668 runnableC1668, Object obj, boolean z) {
        int iIntValue;
        int i;
        Integer numValueOf;
        runnableC1668.getClass();
        Map map = AbstractC0010.f522;
        int i2 = 0;
        if (obj instanceof Map) {
            Object objMo306 = this.f8721[0].mo306(c0550, runnableC1668);
            return z ? new C1751(obj, objMo306) : AbstractC0009.m392(obj, objMo306);
        }
        if (obj instanceof Map.Entry) {
            Object objMo307 = this.f8721[0].mo306(c0550, runnableC1668);
            if (!z) {
                return AbstractC0009.m392(obj, objMo307);
            }
            if (objMo307.equals(((Map.Entry) obj).getKey())) {
                return new C1751(obj);
            }
            throw new C1229("No such property: " + objMo307, this, c0550);
        }
        Class<?> cls = obj.getClass();
        if (!(obj instanceof List) && !cls.isArray()) {
            throw new C1229("Not an array or List type", this, c0550);
        }
        int size = obj instanceof List ? ((List) obj).size() : Array.getLength(obj);
        int iM1460 = size + 1;
        if (AbstractC0010.m432(cls)) {
            Object objMo308 = this.f8721[0].mo306(c0550, runnableC1668);
            if (((!(objMo308 instanceof Primitive) || !((Primitive) objMo308).isNumber()) && !Primitive.isWrapperType(objMo308.getClass())) || size <= (iM1460 = ((Integer) Primitive.castWrapper(Integer.TYPE, objMo308)).intValue()) || (-size) >= iM1460) {
                return z ? new C1751(AbstractC0009.m385(objMo308, (Map.Entry[]) obj)) : AbstractC0009.m392(obj, objMo308);
            }
        } else if (iM1460 > size) {
            iM1460 = m1460(0, c0550, runnableC1668, this);
        }
        if (iM1460 < 0) {
            iM1460 += size;
        }
        if (!this.f1654) {
            if (!z) {
                try {
                    return AbstractC2201.m3969(iM1460, obj);
                } catch (C3523 e) {
                    throw e.mo4644("Error array get index", this, c0550);
                }
            }
            C1751 c1751 = new C1751();
            c1751.f5852 = 3;
            c1751.f5856 = obj;
            c1751.f5857 = iM1460;
            return c1751;
        }
        if (z) {
            throw new C1229("cannot assign to array slice", this, c0550);
        }
        if (this.f1655) {
            if (this.f1656 && this.f1657 && m4710().length == 3) {
                numValueOf = Integer.valueOf(m1460(2, c0550, runnableC1668, this));
            } else if (!(this.f1656 && this.f1657) && m4710().length == 2) {
                numValueOf = Integer.valueOf(m1460(1, c0550, runnableC1668, this));
            } else if (this.f1656 || this.f1657) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(m1460(0, c0550, runnableC1668, this));
                iM1460 = 0;
            }
            if (numValueOf == null) {
                iIntValue = 0;
            } else {
                if (numValueOf.intValue() == 0) {
                    throw new C1229("array slice step cannot be zero", this, c0550);
                }
                iIntValue = numValueOf.intValue();
            }
        } else {
            iIntValue = 0;
        }
        if (this.f1656 && this.f1657) {
            int i3 = iM1460;
            iM1460 = m1460(1, c0550, runnableC1668, this);
            i = i3;
        } else if (this.f1657) {
            i = 0;
        } else {
            i = iM1460;
            iM1460 = size;
        }
        if (iM1460 < 0) {
            iM1460 += size;
        }
        if (!obj.getClass().isArray()) {
            List list = (List) obj;
            int size2 = list.size();
            if (iM1460 > size2) {
                iM1460 = size2;
            }
            if (i < 0) {
                i = 0;
            }
            int i4 = iM1460 - i;
            if (i4 <= 0) {
                return list.subList(0, 0);
            }
            if (iIntValue == 0 || iIntValue == 1) {
                return list.subList(i, iM1460);
            }
            ArrayList arrayList = new ArrayList();
            while (i2 < i4) {
                if (i2 % iIntValue == 0) {
                    arrayList.add(Integer.valueOf(iIntValue < 0 ? (i4 - 1) - i2 : i2 + i));
                }
                i2++;
            }
            return new C0478(list, arrayList);
        }
        Class clsM412 = AbstractC0010.m412(obj.getClass());
        int length = Array.getLength(obj);
        if (iM1460 > length) {
            iM1460 = length;
        }
        if (i < 0) {
            i = 0;
        }
        int i5 = iM1460 - i;
        if (i5 <= 0) {
            return Array.newInstance((Class<?>) clsM412, 0);
        }
        if (iIntValue == 0 || iIntValue == 1) {
            Object objNewInstance = Array.newInstance((Class<?>) clsM412, i5);
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
        Object objNewInstance2 = Array.newInstance((Class<?>) clsM412, iCeil);
        AbstractC2201.m3966(clsM412, objNewInstance2, objArr);
        return objNewInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᲀᤞ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᲀᤞ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᲀᤞ] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᛸᲁᲇᲈ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final Object m1462(C0550 c0550, RunnableC1668 runnableC1668, Object obj, boolean z) {
        ?? r4;
        ?? r8;
        ?? r5;
        try {
            if (this.f1658) {
                try {
                    if (Primitive.NULL == obj) {
                        throw C2622.f8509;
                    }
                } catch (C3523 e) {
                    r8 = e;
                    r5 = c0550;
                }
            }
            if (this.f1653.equals("length") && obj.getClass().isArray()) {
                RunnableC1668.f5631.m3664();
                if (z) {
                    throw new C1229("Can't assign array length", this, c0550);
                }
                return new Primitive(Array.getLength(obj));
            }
            try {
                if (m4710().length == 0) {
                    RunnableC1668.f5631.m3664();
                    if (z) {
                        try {
                            c0550 = AbstractC0009.m387(obj, this.f1653);
                            return c0550;
                        } catch (Throwable unused) {
                            return new C1751(obj, this.f1653);
                        }
                    }
                    try {
                        try {
                            return AbstractC0009.m391(obj, this.f1653);
                        } catch (Throwable unused2) {
                            c0550 = AbstractC0009.m393(obj, this.f1653);
                            return c0550;
                        }
                    } catch (Throwable unused3) {
                        return Primitive.VOID;
                    }
                    r8 = e;
                    r5 = c0550;
                    throw r8.mo4643(this, r5);
                }
                Object[] objArrM1434 = ((C0327) this.f8721[0]).m1434(c0550, runnableC1668);
                RunnableC1668.f5631.m3666(obj, this.f1653, objArrM1434);
                r4 = c0550;
                try {
                    return AbstractC0009.m399(obj, this.f1653, objArrM1434, runnableC1668, r4, this);
                } catch (C3523 e2) {
                    e = e2;
                }
            } catch (C3523 e3) {
                r5 = c0550;
                r8 = e3;
            }
        } catch (C3523 e4) {
            e = e4;
            r4 = c0550;
        }
        r8 = e;
        r5 = r4;
        throw r8.mo4643(this, r5);
    }

    public final Object m1463(Object obj, C0550 c0550, RunnableC1668 runnableC1668) {
        C0001 c0001 = (C0001) this.f8721[0];
        if (AbstractC0009.m401(obj.getClass())) {
            c0550.m1926();
            c0550.m1927(AbstractC0009.m395(obj));
            return c0001.mo306(c0550, runnableC1668);
        }
        InterfaceC2225[] interfaceC2225Arr = c0001.f8721;
        InterfaceC2225 interfaceC2225 = interfaceC2225Arr[0];
        String str = interfaceC2225 instanceof C0326 ? ((C0326) interfaceC2225).f1577 : "";
        InterfaceC2225 interfaceC2226 = interfaceC2225Arr[1];
        Class<?> cls = null;
        Object[] objArrM1434 = interfaceC2226 instanceof C0327 ? ((C0327) interfaceC2226).m1434(c0550, runnableC1668) : null;
        for (Class<?> cls2 : obj.getClass().getDeclaredClasses()) {
            if (AbstractC0010.m417(cls2.getName()).equals(str)) {
                cls = cls2;
                break;
            }
        }
        try {
            return AbstractC0009.m377(cls, obj, objArrM1434);
        } catch (InvocationTargetException e) {
            throw new C2895("Object constructor", e.getCause(), c0001, c0550, true);
        }
    }

    public final Object m1464(C0550 c0550, RunnableC1668 runnableC1668, Object obj, boolean z) {
        if (obj == Primitive.VOID) {
            throw new C1229("Attempt to access property on undefined variable or class name", this, c0550);
        }
        if (obj instanceof Primitive) {
            throw new C1229("Attempt to access property on a primitive", this, c0550);
        }
        Object objMo306 = this.f8721[0].mo306(c0550, runnableC1668);
        if (!(objMo306 instanceof String)) {
            throw new C1229("Property expression must be a String or identifier.", this, c0550);
        }
        if (z) {
            return new C1751(obj, (String) objMo306);
        }
        try {
            Object objM393 = AbstractC0009.m393(obj, (String) objMo306);
            return objM393 == null ? Primitive.NULL : Primitive.unwrap(objM393);
        } catch (C2518 e) {
            throw new C1229("No such property: " + objMo306, this, c0550, e);
        }
    }
}
