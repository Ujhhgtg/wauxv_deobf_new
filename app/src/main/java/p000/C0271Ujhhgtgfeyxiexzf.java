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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛴᛱfeyxiexzfᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0271Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f1665Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final HashMap f1666Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f1667Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1668Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f1669Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object f1670Ujhhgtgfeyxiexzf;

    public C0271Ujhhgtgfeyxiexzf(int i) {
        this.f1669Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(15);
        this.f1670Ujhhgtgfeyxiexzf = new C0272Ujhhgtgfeyxiexzf(0);
        this.f1666Ujhhgtgfeyxiexzf = new HashMap();
        this.f1667Ujhhgtgfeyxiexzf = new HashMap();
        this.f1665Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m1460Ujhhgtgfeyxiexzf(int i, Class cls) {
        NavigableMap navigableMapM1466Ujhhgtgfeyxiexzf = m1466Ujhhgtgfeyxiexzf(cls);
        Integer num = (Integer) navigableMapM1466Ujhhgtgfeyxiexzf.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM1466Ujhhgtgfeyxiexzf.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM1466Ujhhgtgfeyxiexzf.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m1461Ujhhgtgfeyxiexzf(int i) {
        while (this.f1668Ujhhgtgfeyxiexzf > i) {
            Object objM3964feyxiexzfUjhhgtg = ((C2629Ujhhgtgfeyxiexzf) this.f1669Ujhhgtgfeyxiexzf).m3964feyxiexzfUjhhgtg();
            AbstractC3593Ujhhgtgfeyxiexzf.m5150Ujhhgtgfeyxiexzf(objM3964feyxiexzfUjhhgtg);
            C2606Ujhhgtgfeyxiexzf c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf = m1464Ujhhgtgfeyxiexzf(objM3964feyxiexzfUjhhgtg.getClass());
            this.f1668Ujhhgtgfeyxiexzf -= c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3882Ujhhgtgfeyxiexzf() * c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(objM3964feyxiexzfUjhhgtg);
            m1460Ujhhgtgfeyxiexzf(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(objM3964feyxiexzfUjhhgtg), objM3964feyxiexzfUjhhgtg.getClass());
            if (Log.isLoggable(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3883Ujhhgtgfeyxiexzf(), 2)) {
                Log.v(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3883Ujhhgtgfeyxiexzf(), "evicted: " + c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(objM3964feyxiexzfUjhhgtg));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public synchronized Object m1462Ujhhgtgfeyxiexzf(int i, Class cls) {
        C0276Ujhhgtgfeyxiexzf c0276Ujhhgtgfeyxiexzf;
        int i2;
        try {
            Integer num = (Integer) m1466Ujhhgtgfeyxiexzf(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f1668Ujhhgtgfeyxiexzf) != 0 && this.f1665Ujhhgtgfeyxiexzf / i2 < 2 && num.intValue() > i * 8)) {
                C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf = (C0272Ujhhgtgfeyxiexzf) this.f1670Ujhhgtgfeyxiexzf;
                InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
                if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf == null) {
                    interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
                }
                c0276Ujhhgtgfeyxiexzf = (C0276Ujhhgtgfeyxiexzf) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf;
                c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf = i;
                c0276Ujhhgtgfeyxiexzf.f1688Ujhhgtgfeyxiexzf = cls;
            } else {
                C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf2 = (C0272Ujhhgtgfeyxiexzf) this.f1670Ujhhgtgfeyxiexzf;
                int iIntValue = num.intValue();
                InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf2.f7994Ujhhgtgfeyxiexzf).poll();
                if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 == null) {
                    interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2 = c0272Ujhhgtgfeyxiexzf2.m1468Ujhhgtgfeyxiexzf();
                }
                c0276Ujhhgtgfeyxiexzf = (C0276Ujhhgtgfeyxiexzf) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf2;
                c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf = iIntValue;
                c0276Ujhhgtgfeyxiexzf.f1688Ujhhgtgfeyxiexzf = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m1465Ujhhgtgfeyxiexzf(c0276Ujhhgtgfeyxiexzf, cls);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public synchronized Object m1463Ujhhgtgfeyxiexzf(Object obj) {
        Object obj2;
        try {
            int i = this.f1668Ujhhgtgfeyxiexzf + 1;
            this.f1668Ujhhgtgfeyxiexzf = i;
            if (i == 1000) {
                HashMap map = this.f1667Ujhhgtgfeyxiexzf;
                while (true) {
                    Reference referencePoll = ((ReferenceQueue) this.f1670Ujhhgtgfeyxiexzf).poll();
                    if (referencePoll == null) {
                        break;
                    }
                    Object obj3 = map.get(referencePoll);
                    if (obj3 != null) {
                        this.f1666Ujhhgtgfeyxiexzf.remove(obj3);
                    }
                    map.remove(referencePoll);
                }
                this.f1668Ujhhgtgfeyxiexzf = 0;
            }
            Reference reference = (Reference) this.f1666Ujhhgtgfeyxiexzf.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                return obj2;
            }
            Object objApply = ((Function) this.f1669Ujhhgtgfeyxiexzf).apply(obj);
            Reference weakReference = this.f1665Ujhhgtgfeyxiexzf == 1 ? new WeakReference(objApply, (ReferenceQueue) this.f1670Ujhhgtgfeyxiexzf) : new SoftReference(objApply, (ReferenceQueue) this.f1670Ujhhgtgfeyxiexzf);
            this.f1666Ujhhgtgfeyxiexzf.put(obj, weakReference);
            this.f1667Ujhhgtgfeyxiexzf.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2606Ujhhgtgfeyxiexzf m1464Ujhhgtgfeyxiexzf(Class cls) {
        C2606Ujhhgtgfeyxiexzf c2606Ujhhgtgfeyxiexzf;
        HashMap map = this.f1667Ujhhgtgfeyxiexzf;
        C2606Ujhhgtgfeyxiexzf c2606Ujhhgtgfeyxiexzf2 = (C2606Ujhhgtgfeyxiexzf) map.get(cls);
        if (c2606Ujhhgtgfeyxiexzf2 != null) {
            return c2606Ujhhgtgfeyxiexzf2;
        }
        if (cls.equals(int[].class)) {
            c2606Ujhhgtgfeyxiexzf = new C2606Ujhhgtgfeyxiexzf(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c2606Ujhhgtgfeyxiexzf = new C2606Ujhhgtgfeyxiexzf(0);
        }
        map.put(cls, c2606Ujhhgtgfeyxiexzf);
        return c2606Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object m1465Ujhhgtgfeyxiexzf(C0276Ujhhgtgfeyxiexzf c0276Ujhhgtgfeyxiexzf, Class cls) {
        C2606Ujhhgtgfeyxiexzf c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf = m1464Ujhhgtgfeyxiexzf(cls);
        Object objM3937Ujhhgtgfeyxiexzf = ((C2629Ujhhgtgfeyxiexzf) this.f1669Ujhhgtgfeyxiexzf).m3937Ujhhgtgfeyxiexzf(c0276Ujhhgtgfeyxiexzf);
        if (objM3937Ujhhgtgfeyxiexzf != null) {
            this.f1668Ujhhgtgfeyxiexzf -= c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3882Ujhhgtgfeyxiexzf() * c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(objM3937Ujhhgtgfeyxiexzf);
            m1460Ujhhgtgfeyxiexzf(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(objM3937Ujhhgtgfeyxiexzf), cls);
        }
        if (objM3937Ujhhgtgfeyxiexzf != null) {
            return objM3937Ujhhgtgfeyxiexzf;
        }
        if (Log.isLoggable(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3883Ujhhgtgfeyxiexzf(), 2)) {
            Log.v(c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3883Ujhhgtgfeyxiexzf(), "Allocated " + c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf + " bytes");
        }
        int i = c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf;
        switch (c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.f8408Ujhhgtgfeyxiexzf) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public NavigableMap m1466Ujhhgtgfeyxiexzf(Class cls) {
        HashMap map = this.f1666Ujhhgtgfeyxiexzf;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public synchronized void m1467Ujhhgtgfeyxiexzf(Object obj) {
        Class<?> cls = obj.getClass();
        C2606Ujhhgtgfeyxiexzf c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf = m1464Ujhhgtgfeyxiexzf(cls);
        int iM3881Ujhhgtgfeyxiexzf = c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3881Ujhhgtgfeyxiexzf(obj);
        int iM3882Ujhhgtgfeyxiexzf = c2606UjhhgtgfeyxiexzfM1464Ujhhgtgfeyxiexzf.m3882Ujhhgtgfeyxiexzf() * iM3881Ujhhgtgfeyxiexzf;
        if (iM3882Ujhhgtgfeyxiexzf <= this.f1665Ujhhgtgfeyxiexzf / 2) {
            C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf = (C0272Ujhhgtgfeyxiexzf) this.f1670Ujhhgtgfeyxiexzf;
            InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
            if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf == null) {
                interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
            }
            C0276Ujhhgtgfeyxiexzf c0276Ujhhgtgfeyxiexzf = (C0276Ujhhgtgfeyxiexzf) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf;
            c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf = iM3881Ujhhgtgfeyxiexzf;
            c0276Ujhhgtgfeyxiexzf.f1688Ujhhgtgfeyxiexzf = cls;
            ((C2629Ujhhgtgfeyxiexzf) this.f1669Ujhhgtgfeyxiexzf).m3962feyxiexzfUjhhgtg(c0276Ujhhgtgfeyxiexzf, obj);
            NavigableMap navigableMapM1466Ujhhgtgfeyxiexzf = m1466Ujhhgtgfeyxiexzf(cls);
            Integer num = (Integer) navigableMapM1466Ujhhgtgfeyxiexzf.get(Integer.valueOf(c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf));
            Integer numValueOf = Integer.valueOf(c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM1466Ujhhgtgfeyxiexzf.put(numValueOf, Integer.valueOf(iIntValue));
            this.f1668Ujhhgtgfeyxiexzf += iM3882Ujhhgtgfeyxiexzf;
            m1461Ujhhgtgfeyxiexzf(this.f1665Ujhhgtgfeyxiexzf);
        }
    }

    public C0271Ujhhgtgfeyxiexzf(int i, Function function) {
        this.f1666Ujhhgtgfeyxiexzf = new HashMap();
        this.f1667Ujhhgtgfeyxiexzf = new HashMap();
        this.f1670Ujhhgtgfeyxiexzf = new ReferenceQueue();
        this.f1669Ujhhgtgfeyxiexzf = function;
        this.f1665Ujhhgtgfeyxiexzf = i;
    }
}
