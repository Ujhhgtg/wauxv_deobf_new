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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲇᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1893 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f6271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap f6272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f6273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6274;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f6275;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f6276;

    public C1893(int i) {
        this.f6275 = new C0519(15);
        this.f6276 = new C1892(0);
        this.f6272 = new HashMap();
        this.f6273 = new HashMap();
        this.f6271 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m3816(int i, Class cls) {
        NavigableMap navigableMapM3822 = m3822(cls);
        Integer num = (Integer) navigableMapM3822.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM3822.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM3822.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3817(int i) {
        while (this.f6274 > i) {
            Object objM2008 = ((C0519) this.f6275).m2008();
            AbstractC2727.m4692(objM2008);
            C0494 c0494M3820 = m3820(objM2008.getClass());
            this.f6274 -= c0494M3820.m1921() * c0494M3820.m1920(objM2008);
            m3816(c0494M3820.m1920(objM2008), objM2008.getClass());
            if (Log.isLoggable(c0494M3820.m1922(), 2)) {
                Log.v(c0494M3820.m1922(), "evicted: " + c0494M3820.m1920(objM2008));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public synchronized Object m3818(int i, Class cls) {
        C1891 c1891;
        int i2;
        try {
            Integer num = (Integer) m3822(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f6274) != 0 && this.f6271 / i2 < 2 && num.intValue() > i * 8)) {
                C1892 c1892 = (C1892) this.f6276;
                InterfaceC2429 interfaceC2429M3815 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
                if (interfaceC2429M3815 == null) {
                    interfaceC2429M3815 = c1892.m3815();
                }
                c1891 = (C1891) interfaceC2429M3815;
                c1891.f6268 = i;
                c1891.f6269 = cls;
            } else {
                C1892 c1893 = (C1892) this.f6276;
                int iIntValue = num.intValue();
                InterfaceC2429 interfaceC2429M3816 = (InterfaceC2429) ((ArrayDeque) c1893.f1731).poll();
                if (interfaceC2429M3816 == null) {
                    interfaceC2429M3816 = c1893.m3815();
                }
                c1891 = (C1891) interfaceC2429M3816;
                c1891.f6268 = iIntValue;
                c1891.f6269 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m3821(c1891, cls);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public synchronized Object m3819(Object obj) {
        Object obj2;
        try {
            int i = this.f6274 + 1;
            this.f6274 = i;
            if (i == 1000) {
                HashMap map = this.f6273;
                while (true) {
                    Reference referencePoll = ((ReferenceQueue) this.f6276).poll();
                    if (referencePoll == null) {
                        break;
                    }
                    Object obj3 = map.get(referencePoll);
                    if (obj3 != null) {
                        this.f6272.remove(obj3);
                    }
                    map.remove(referencePoll);
                }
                this.f6274 = 0;
            }
            Reference reference = (Reference) this.f6272.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                return obj2;
            }
            Object objApply = ((Function) this.f6275).apply(obj);
            Reference weakReference = this.f6271 == 1 ? new WeakReference(objApply, (ReferenceQueue) this.f6276) : new SoftReference(objApply, (ReferenceQueue) this.f6276);
            this.f6272.put(obj, weakReference);
            this.f6273.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0494 m3820(Class cls) {
        C0494 c0494;
        HashMap map = this.f6273;
        C0494 c0495 = (C0494) map.get(cls);
        if (c0495 != null) {
            return c0495;
        }
        if (cls.equals(int[].class)) {
            c0494 = new C0494(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c0494 = new C0494(0);
        }
        map.put(cls, c0494);
        return c0494;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object m3821(C1891 c1891, Class cls) {
        C0494 c0494M3820 = m3820(cls);
        Object objM1981 = ((C0519) this.f6275).m1981(c1891);
        if (objM1981 != null) {
            this.f6274 -= c0494M3820.m1921() * c0494M3820.m1920(objM1981);
            m3816(c0494M3820.m1920(objM1981), cls);
        }
        if (objM1981 != null) {
            return objM1981;
        }
        if (Log.isLoggable(c0494M3820.m1922(), 2)) {
            Log.v(c0494M3820.m1922(), "Allocated " + c1891.f6268 + " bytes");
        }
        int i = c1891.f6268;
        switch (c0494M3820.f2148) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public NavigableMap m3822(Class cls) {
        HashMap map = this.f6272;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public synchronized void m3823(Object obj) {
        Class<?> cls = obj.getClass();
        C0494 c0494M3820 = m3820(cls);
        int iM1920 = c0494M3820.m1920(obj);
        int iM1921 = c0494M3820.m1921() * iM1920;
        if (iM1921 <= this.f6271 / 2) {
            C1892 c1892 = (C1892) this.f6276;
            InterfaceC2429 interfaceC2429M3815 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
            if (interfaceC2429M3815 == null) {
                interfaceC2429M3815 = c1892.m3815();
            }
            C1891 c1891 = (C1891) interfaceC2429M3815;
            c1891.f6268 = iM1920;
            c1891.f6269 = cls;
            ((C0519) this.f6275).m2006(c1891, obj);
            NavigableMap navigableMapM3822 = m3822(cls);
            Integer num = (Integer) navigableMapM3822.get(Integer.valueOf(c1891.f6268));
            Integer numValueOf = Integer.valueOf(c1891.f6268);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM3822.put(numValueOf, Integer.valueOf(iIntValue));
            this.f6274 += iM1921;
            m3817(this.f6271);
        }
    }

    public C1893(int i, Function function) {
        this.f6272 = new HashMap();
        this.f6273 = new HashMap();
        this.f6276 = new ReferenceQueue();
        this.f6275 = function;
        this.f6271 = i;
    }
}
