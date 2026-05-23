package p000;

import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1867 {

    public final int f6197;

    public final HashMap f6198;

    public final HashMap f6199;

    public int f6200;

    public final Object f6201;

    public final Object f6202;

    public C1867(int i) {
        this.f6201 = new C0542(14);
        this.f6202 = new C1866(0);
        this.f6198 = new HashMap();
        this.f6199 = new HashMap();
        this.f6197 = i;
    }

    public void m3638(int i, Class cls) {
        NavigableMap navigableMapM3644 = m3644(cls);
        Integer num = (Integer) navigableMapM3644.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM3644.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM3644.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void m3639(int i) {
        while (this.f6200 > i) {
            Object objM1914 = ((C0542) this.f6201).m1914();
            AbstractC1460.m3209(objM1914);
            C0517 c0517M3642 = m3642(objM1914.getClass());
            this.f6200 -= c0517M3642.m1827() * c0517M3642.m1826(objM1914);
            m3638(c0517M3642.m1826(objM1914), objM1914.getClass());
            if (Log.isLoggable(c0517M3642.m1828(), 2)) {
                Log.v(c0517M3642.m1828(), "evicted: " + c0517M3642.m1826(objM1914));
            }
        }
    }

    public synchronized Object m3640(int i, Class cls) {
        C1865 c1865;
        int i2;
        try {
            Integer num = (Integer) m3644(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f6200) != 0 && this.f6197 / i2 < 2 && num.intValue() > i * 8)) {
                C1866 c1866 = (C1866) this.f6202;
                InterfaceC2376 interfaceC2376M3637 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
                if (interfaceC2376M3637 == null) {
                    interfaceC2376M3637 = c1866.m3637();
                }
                c1865 = (C1865) interfaceC2376M3637;
                c1865.f6194 = i;
                c1865.f6195 = cls;
            } else {
                C1866 c1867 = (C1866) this.f6202;
                int iIntValue = num.intValue();
                InterfaceC2376 interfaceC2376M3638 = (InterfaceC2376) ((ArrayDeque) c1867.f1760).poll();
                if (interfaceC2376M3638 == null) {
                    interfaceC2376M3638 = c1867.m3637();
                }
                c1865 = (C1865) interfaceC2376M3638;
                c1865.f6194 = iIntValue;
                c1865.f6195 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m3643(c1865, cls);
    }

    public synchronized Object m3641(Object obj) {
        Object obj2;
        try {
            int i = this.f6200 + 1;
            this.f6200 = i;
            if (i == 1000) {
                HashMap map = this.f6199;
                while (true) {
                    Reference referencePoll = ((ReferenceQueue) this.f6202).poll();
                    if (referencePoll == null) {
                        break;
                    }
                    Object obj3 = map.get(referencePoll);
                    if (obj3 != null) {
                        this.f6198.remove(obj3);
                    }
                    map.remove(referencePoll);
                }
                this.f6200 = 0;
            }
            Reference reference = (Reference) this.f6198.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                return obj2;
            }
            Object objApply = ((Function) this.f6201).apply(obj);
            Reference weakReference = this.f6197 == 1 ? new WeakReference(objApply, (ReferenceQueue) this.f6202) : new SoftReference(objApply, (ReferenceQueue) this.f6202);
            this.f6198.put(obj, weakReference);
            this.f6199.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0517 m3642(Class cls) {
        C0517 c0517;
        HashMap map = this.f6199;
        C0517 c0518 = (C0517) map.get(cls);
        if (c0518 != null) {
            return c0518;
        }
        if (cls.equals(int[].class)) {
            c0517 = new C0517(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c0517 = new C0517(0);
        }
        map.put(cls, c0517);
        return c0517;
    }

    public Object m3643(C1865 c1865, Class cls) {
        C0517 c0517M3642 = m3642(cls);
        Object objM1887 = ((C0542) this.f6201).m1887(c1865);
        if (objM1887 != null) {
            this.f6200 -= c0517M3642.m1827() * c0517M3642.m1826(objM1887);
            m3638(c0517M3642.m1826(objM1887), cls);
        }
        if (objM1887 != null) {
            return objM1887;
        }
        if (Log.isLoggable(c0517M3642.m1828(), 2)) {
            Log.v(c0517M3642.m1828(), "Allocated " + c1865.f6194 + " bytes");
        }
        int i = c1865.f6194;
        switch (c0517M3642.f2192) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap m3644(Class cls) {
        HashMap map = this.f6198;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void m3645(Object obj) {
        Class<?> cls = obj.getClass();
        C0517 c0517M3642 = m3642(cls);
        int iM1826 = c0517M3642.m1826(obj);
        int iM1827 = c0517M3642.m1827() * iM1826;
        if (iM1827 <= this.f6197 / 2) {
            C1866 c1866 = (C1866) this.f6202;
            InterfaceC2376 interfaceC2376M3637 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
            if (interfaceC2376M3637 == null) {
                interfaceC2376M3637 = c1866.m3637();
            }
            C1865 c1865 = (C1865) interfaceC2376M3637;
            c1865.f6194 = iM1826;
            c1865.f6195 = cls;
            ((C0542) this.f6201).m1912(c1865, obj);
            NavigableMap navigableMapM3644 = m3644(cls);
            Integer num = (Integer) navigableMapM3644.get(Integer.valueOf(c1865.f6194));
            Integer numValueOf = Integer.valueOf(c1865.f6194);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM3644.put(numValueOf, Integer.valueOf(iIntValue));
            this.f6200 += iM1827;
            m3639(this.f6197);
        }
    }

    public C1867(int i, Function function) {
        this.f6198 = new HashMap();
        this.f6199 = new HashMap();
        this.f6202 = new ReferenceQueue();
        this.f6201 = function;
        this.f6197 = i;
    }
}
