package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴᛲᛱfeyxiexzfᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722Ujhhgtgfeyxiexzf extends C0279Ujhhgtgfeyxiexzf implements InterfaceC3227feyxiexzfUjhhgtg, InterfaceC0665Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0731Ujhhgtgfeyxiexzf f2986Ujhhgtgfeyxiexzf;

    @Override // p000.C0279Ujhhgtgfeyxiexzf
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(this));
        sb.append("[job@");
        C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf = this.f2986Ujhhgtgfeyxiexzf;
        if (c0731Ujhhgtgfeyxiexzf == null) {
            c0731Ujhhgtgfeyxiexzf = null;
        }
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(c0731Ujhhgtgfeyxiexzf));
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.InterfaceC0665Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo1932Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.InterfaceC0665Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final C1288feyxiexzfUjhhgtg mo1933Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.InterfaceC3227feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo2039Ujhhgtgfeyxiexzf() {
        C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf = this.f2986Ujhhgtgfeyxiexzf;
        if (c0731Ujhhgtgfeyxiexzf == null) {
            c0731Ujhhgtgfeyxiexzf = null;
        }
        c0731Ujhhgtgfeyxiexzf.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0731Ujhhgtgfeyxiexzf.f3004Ujhhgtgfeyxiexzf;
            Object obj = atomicReferenceFieldUpdater.get(c0731Ujhhgtgfeyxiexzf);
            if (obj instanceof AbstractC0722Ujhhgtgfeyxiexzf) {
                if (obj != this) {
                    return;
                }
                C3301feyxiexzfUjhhgtg c3301feyxiexzfUjhhgtg = AbstractC3085Ujhhgtgfeyxiexzf.f9545Ujhhgtgfeyxiexzf;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0731Ujhhgtgfeyxiexzf, obj, c3301feyxiexzfUjhhgtg)) {
                    if (atomicReferenceFieldUpdater.get(c0731Ujhhgtgfeyxiexzf) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf) || ((InterfaceC0665Ujhhgtgfeyxiexzf) obj).mo1933Ujhhgtgfeyxiexzf() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0279Ujhhgtgfeyxiexzf.f1699Ujhhgtgfeyxiexzf;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C0978feyxiexzfUjhhgtg) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) obj2;
                c0279Ujhhgtgfeyxiexzf.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0279Ujhhgtgfeyxiexzf.f1701Ujhhgtgfeyxiexzf;
                C0978feyxiexzfUjhhgtg c0978feyxiexzfUjhhgtg = (C0978feyxiexzfUjhhgtg) atomicReferenceFieldUpdater3.get(c0279Ujhhgtgfeyxiexzf);
                if (c0978feyxiexzfUjhhgtg == null) {
                    c0978feyxiexzfUjhhgtg = new C0978feyxiexzfUjhhgtg(c0279Ujhhgtgfeyxiexzf);
                    atomicReferenceFieldUpdater3.set(c0279Ujhhgtgfeyxiexzf, c0978feyxiexzfUjhhgtg);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0978feyxiexzfUjhhgtg)) {
                        c0279Ujhhgtgfeyxiexzf.m1485Ujhhgtgfeyxiexzf();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public abstract boolean mo1974Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public abstract void mo1975Ujhhgtgfeyxiexzf(Throwable th);
}
