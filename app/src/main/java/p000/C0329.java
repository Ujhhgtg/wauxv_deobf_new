package p000;

import bsh.AbstractC0010;
import bsh.C0007;
import bsh.Primitive;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0329 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f1582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ArrayDeque f1583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static Class m1435(Class cls, InterfaceC2225 interfaceC2225, C0550 c0550, RunnableC1668 runnableC1668) {
        if (Object.class != cls && C3468.class != cls) {
            if (interfaceC2225 instanceof C0330) {
                return AbstractC0010.m418(cls, AbstractC0010.m412(AbstractC0010.m419(((C0330) interfaceC2225).mo306(c0550, runnableC1668), Primitive.isWrapperType(cls))));
            }
            if ((interfaceC2225 instanceof C0329) && ((C0329) interfaceC2225).f1582) {
                return AbstractC0010.m418(cls, Map.class);
            }
            for (InterfaceC2225 interfaceC2226 : ((AbstractC2707) interfaceC2225).m4710()) {
                cls = m1435(cls, interfaceC2226, c0550, runnableC1668);
            }
        }
        return cls;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static int m1436(int i, int i2, InterfaceC2225 interfaceC2225, C0550 c0550, RunnableC1668 runnableC1668) {
        while (true) {
            AbstractC2707 abstractC2707 = (AbstractC2707) interfaceC2225;
            if (abstractC2707.m4710().length <= i2) {
                break;
            }
            interfaceC2225 = abstractC2707.f8721[i2];
            if (!(interfaceC2225 instanceof C0329) || ((C0329) interfaceC2225).f1582 || ((AbstractC2707) interfaceC2225).m4710().length <= 0) {
                break;
            }
            i++;
            i2 = 0;
        }
        if (interfaceC2225 instanceof C0329) {
            AbstractC2707 abstractC2708 = (AbstractC2707) interfaceC2225;
            return abstractC2708.m4710().length == 0 ? m1436(i, i2 + 1, abstractC2708.f8720, c0550, runnableC1668) : i;
        }
        Object objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
        return objMo306 == Primitive.NULL ? m1436(i, i2 + 1, ((AbstractC2707) interfaceC2225).f8720, c0550, runnableC1668) : AbstractC0010.m411(AbstractC0010.m419(objMo306, false)) + i;
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1582;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1437(AbstractC2707 abstractC2707) {
        Integer num;
        ArrayDeque arrayDeque = this.f1583;
        this.f8720 = abstractC2707;
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        if (interfaceC2225Arr != null) {
            for (InterfaceC2225 interfaceC2225 : interfaceC2225Arr) {
                AbstractC2707 abstractC2708 = (AbstractC2707) interfaceC2225;
                if (abstractC2708.m4710().length > 0) {
                    InterfaceC2225 interfaceC2226 = abstractC2708.f8721[0];
                    if (interfaceC2226 instanceof C0348) {
                        arrayDeque.push((C0348) interfaceC2226);
                        C0348 c0348 = (C0348) arrayDeque.peek();
                        c0348.f1650 = true;
                        AbstractC2707 abstractC2709 = c0348.f8720;
                        if ((abstractC2709 instanceof C0330) && (num = ((C0330) abstractC2709).f1584) != null) {
                            boolean z = num.intValue() == 87;
                            c0348.f1651 = z;
                            if (z && (this.f8720 instanceof C0329)) {
                                this.f1582 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        throw new C1229("Array initializer has no base type.", this, c0550);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[PHI: r12
      0x00c3: PHI (r12v2 int) = (r12v1 int), (r12v14 int) binds: [B:15:0x0025, B:44:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m1438(Class cls, int i, C0550 c0550, RunnableC1668 runnableC1668) throws C1230 {
        Class clsM1435;
        Object objMo306;
        if (m4710().length == 0) {
            i = 0;
        }
        Class cls2 = Object.class;
        Class cls3 = Void.TYPE;
        if (i == 0) {
            if (cls != cls3 && !AbstractC0010.m425(cls)) {
                cls2 = cls;
            }
            return m1440(Array.newInstance((Class<?>) cls2, 0), cls, c0550);
        }
        if (-1 == i) {
            
            if (cls3 != cls && !AbstractC0010.m425(cls)) {
                InterfaceC2225 interfaceC2225 = this.f8721[0];
                if (interfaceC2225 instanceof C0330) {
                    InterfaceC2225 interfaceC2226 = ((AbstractC2707) interfaceC2225).f8721[0];
                    if ((interfaceC2226 instanceof C0348) && ((C0348) interfaceC2226).f1651 && (((AbstractC2707) interfaceC2226).f8721[0] instanceof C0326)) {
                        c0550.m1927(new C0007(c0550.m1929(), null, cls.getName()));
                        C0007 c0007M1929 = c0550.m1929();
                        c0007M1929.f511 = cls;
                        c0007M1929.m359(cls);
                        c0550.m1929().mo310(runnableC1668);
                        try {
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            c0550.m1929().m366(objNewInstance);
                            for (int i2 = 0; i2 < m4710().length; i2++) {
                                C0330 c0330 = (C0330) this.f8721[i2];
                                C0348 c0348 = (C0348) c0330.f8721[0];
                                c0348.f1651 = false;
                                c0348.f1650 = false;
                                c0330.mo306(c0550, runnableC1668);
                            }
                            c0550.m1926();
                            return objNewInstance;
                        } catch (Throwable th) {
                            try {
                                throw new C1230(th.getMessage(), this, c0550, th);
                            } catch (Throwable th2) {
                                c0550.m1926();
                                throw th2;
                            }
                        }
                    }
                }
            }
            i = m1436(1, 0, this, c0550, runnableC1668);
            if (AbstractC0010.m425(cls)) {
                clsM1435 = cls3;
            } else {
                clsM1435 = cls;
            }
        } else {
            clsM1435 = cls;
        }
        if (clsM1435 == cls3) {
            clsM1435 = m1435(null, this, c0550, runnableC1668);
        }
        if (i < 2 && ((C3468.class == clsM1435 && cls3 == cls) || C3468.class == cls)) {
            cls = Map.class;
        }
        if (clsM1435 == null) {
            i++;
        } else {
            cls2 = clsM1435;
        }
        int[] iArr = new int[i];
        iArr[0] = m4710().length;
        Object objNewInstance2 = Array.newInstance((Class<?>) cls2, iArr);
        Class<?> componentType = objNewInstance2.getClass().getComponentType();
        for (int i3 = 0; i3 < m4710().length; i3++) {
            InterfaceC2225 interfaceC2227 = this.f8721[i3];
            if (!(interfaceC2227 instanceof C0329)) {
                objMo306 = interfaceC2227.mo306(c0550, runnableC1668);
            } else if (i < 2) {
                C0329 c0329 = (C0329) interfaceC2227;
                if (!c0329.f1582) {
                    throw new C1230("Invalid Intializer for " + cls2 + ", at position: " + i3, this, c0550);
                }
                objMo306 = c0329.m1438(C3468.class, 1, c0550, runnableC1668);
            } else {
                objMo306 = ((C0329) interfaceC2227).m1438(cls2, i - 1, c0550, runnableC1668);
            }
            if (objMo306 == Primitive.VOID) {
                throw new C1230(AbstractC1194.m2779(i3, "Void in array initializer, position "), this, c0550);
            }
            try {
                Array.set(objNewInstance2, i3, m1439(objMo306, componentType, i, c0550));
            } catch (IllegalArgumentException e) {
                RunnableC1668.m3389("illegal arg", e);
                StringBuilder sbM4679 = AbstractC2668.m4679("Incompatible type: ", AbstractC2202.m4019(objMo306), " in initializer of array type: ");
                sbM4679.append(cls2.getSimpleName());
                sbM4679.append(" at position: ");
                sbM4679.append(i3);
                throw new C1230(sbM4679.toString(), this, c0550);
            }
        }
        Iterator it = this.f1583.iterator();
        while (it.hasNext()) {
            ((C0348) it.next()).f1649 = null;
        }
        return m1440(objNewInstance2, cls, c0550);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Object m1439(Object obj, Class cls, int i, C0550 c0550) throws C1230 {
        if (i != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC0010.m414(0, cls, obj));
        } catch (C3523 e) {
            if (((Boolean) RunnableC1668.f5629.get()).booleanValue()) {
                e.printStackTrace();
            }
            StringBuilder sbM4753 = AbstractC2784.m4753("Error in array initializer".concat(": "));
            sbM4753.append(e.getMessage());
            throw new C1230(sbM4753.toString(), this, c0550, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Object m1440(Object obj, Class cls, C0550 c0550) {
        Class<?> cls2 = obj.getClass();
        Class clsM412 = AbstractC0010.m412(cls2);
        if (AbstractC0010.m425(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM412) && !Collection.class.isAssignableFrom(clsM412)))) {
            try {
                return AbstractC0010.m414(0, cls, obj);
            } catch (C3523 e) {
                e.mo4643(this, c0550);
            }
        }
        return obj;
    }
}
