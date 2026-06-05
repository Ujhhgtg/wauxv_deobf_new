package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸能不能ᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0279Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1699Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0279Ujhhgtgfeyxiexzf.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1700Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0279Ujhhgtgfeyxiexzf.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1701Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0279Ujhhgtgfeyxiexzf.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public String toString() {
        return new C0278Ujhhgtgfeyxiexzf(this, AbstractC3085Ujhhgtgfeyxiexzf.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m1484Ujhhgtgfeyxiexzf(C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf, int i) {
        while (true) {
            C0279Ujhhgtgfeyxiexzf c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf = m1485Ujhhgtgfeyxiexzf();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1700Ujhhgtgfeyxiexzf;
            if (c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) obj;
                    if (!c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf.mo1488Ujhhgtgfeyxiexzf()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf);
                }
            }
            if (c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf instanceof C0093Ujhhgtgfeyxiexzf) {
                return (((C0093Ujhhgtgfeyxiexzf) c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf).f1199Ujhhgtgfeyxiexzf & i) == 0 && c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(c0279Ujhhgtgfeyxiexzf, i);
            }
            atomicReferenceFieldUpdater.set(c0279Ujhhgtgfeyxiexzf, c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1699Ujhhgtgfeyxiexzf;
            atomicReferenceFieldUpdater2.set(c0279Ujhhgtgfeyxiexzf, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf, this, c0279Ujhhgtgfeyxiexzf)) {
                    c0279Ujhhgtgfeyxiexzf.m1486Ujhhgtgfeyxiexzf(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf) == this);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0279Ujhhgtgfeyxiexzf m1485Ujhhgtgfeyxiexzf() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1700Ujhhgtgfeyxiexzf;
            C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater2.get(this);
            C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf2 = c0279Ujhhgtgfeyxiexzf;
            while (true) {
                C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f1699Ujhhgtgfeyxiexzf;
                    obj = atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf2);
                    if (obj == this) {
                        if (c0279Ujhhgtgfeyxiexzf == c0279Ujhhgtgfeyxiexzf2) {
                            return c0279Ujhhgtgfeyxiexzf2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c0279Ujhhgtgfeyxiexzf, c0279Ujhhgtgfeyxiexzf2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c0279Ujhhgtgfeyxiexzf) {
                                break;
                            }
                        }
                        return c0279Ujhhgtgfeyxiexzf2;
                    }
                    if (mo1488Ujhhgtgfeyxiexzf()) {
                        return null;
                    }
                    if (!(obj instanceof C0978feyxiexzfUjhhgtg)) {
                        c0279Ujhhgtgfeyxiexzf3 = c0279Ujhhgtgfeyxiexzf2;
                        c0279Ujhhgtgfeyxiexzf2 = (C0279Ujhhgtgfeyxiexzf) obj;
                    } else {
                        if (c0279Ujhhgtgfeyxiexzf3 != null) {
                            break;
                        }
                        c0279Ujhhgtgfeyxiexzf2 = (C0279Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater2.get(c0279Ujhhgtgfeyxiexzf2);
                    }
                }
                C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf4 = ((C0978feyxiexzfUjhhgtg) obj).f3873Ujhhgtgfeyxiexzf;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0279Ujhhgtgfeyxiexzf3, c0279Ujhhgtgfeyxiexzf2, c0279Ujhhgtgfeyxiexzf4)) {
                    if (atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf3) != c0279Ujhhgtgfeyxiexzf2) {
                        break;
                    }
                }
                c0279Ujhhgtgfeyxiexzf2 = c0279Ujhhgtgfeyxiexzf3;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1486Ujhhgtgfeyxiexzf(C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1700Ujhhgtgfeyxiexzf;
            C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf2 = (C0279Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf);
            if (f1699Ujhhgtgfeyxiexzf.get(this) != c0279Ujhhgtgfeyxiexzf) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0279Ujhhgtgfeyxiexzf, c0279Ujhhgtgfeyxiexzf2, this)) {
                    if (mo1488Ujhhgtgfeyxiexzf()) {
                        c0279Ujhhgtgfeyxiexzf.m1485Ujhhgtgfeyxiexzf();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf) == c0279Ujhhgtgfeyxiexzf2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C0279Ujhhgtgfeyxiexzf m1487Ujhhgtgfeyxiexzf() {
        C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf;
        Object obj = f1699Ujhhgtgfeyxiexzf.get(this);
        C0978feyxiexzfUjhhgtg c0978feyxiexzfUjhhgtg = obj instanceof C0978feyxiexzfUjhhgtg ? (C0978feyxiexzfUjhhgtg) obj : null;
        return (c0978feyxiexzfUjhhgtg == null || (c0279Ujhhgtgfeyxiexzf = c0978feyxiexzfUjhhgtg.f3873Ujhhgtgfeyxiexzf) == null) ? (C0279Ujhhgtgfeyxiexzf) obj : c0279Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean mo1488Ujhhgtgfeyxiexzf() {
        return f1699Ujhhgtgfeyxiexzf.get(this) instanceof C0978feyxiexzfUjhhgtg;
    }
}
