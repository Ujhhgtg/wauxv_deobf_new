package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸能不能ᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0280Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1702Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0280Ujhhgtgfeyxiexzf.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C0282Ujhhgtgfeyxiexzf(8, false);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m1489Ujhhgtgfeyxiexzf(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1702Ujhhgtgfeyxiexzf;
            C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf = (C0282Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(this);
            int iM1493Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.m1493Ujhhgtgfeyxiexzf(runnable);
            if (iM1493Ujhhgtgfeyxiexzf == 0) {
                return true;
            }
            if (iM1493Ujhhgtgfeyxiexzf == 1) {
                C0282Ujhhgtgfeyxiexzf c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.m1495Ujhhgtgfeyxiexzf();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0282Ujhhgtgfeyxiexzf, c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf) && atomicReferenceFieldUpdater.get(this) == c0282Ujhhgtgfeyxiexzf) {
                }
            } else if (iM1493Ujhhgtgfeyxiexzf == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1490Ujhhgtgfeyxiexzf() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1702Ujhhgtgfeyxiexzf;
            C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf = (C0282Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(this);
            if (c0282Ujhhgtgfeyxiexzf.m1494Ujhhgtgfeyxiexzf()) {
                return;
            }
            C0282Ujhhgtgfeyxiexzf c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.m1495Ujhhgtgfeyxiexzf();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0282Ujhhgtgfeyxiexzf, c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf) && atomicReferenceFieldUpdater.get(this) == c0282Ujhhgtgfeyxiexzf) {
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m1491Ujhhgtgfeyxiexzf() {
        C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf = (C0282Ujhhgtgfeyxiexzf) f1702Ujhhgtgfeyxiexzf.get(this);
        c0282Ujhhgtgfeyxiexzf.getClass();
        long j = C0282Ujhhgtgfeyxiexzf.f1705Ujhhgtgfeyxiexzf.get(c0282Ujhhgtgfeyxiexzf);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object m1492Ujhhgtgfeyxiexzf() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1702Ujhhgtgfeyxiexzf;
            C0282Ujhhgtgfeyxiexzf c0282Ujhhgtgfeyxiexzf = (C0282Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(this);
            Object objM1496Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.m1496Ujhhgtgfeyxiexzf();
            if (objM1496Ujhhgtgfeyxiexzf != C0282Ujhhgtgfeyxiexzf.f1706Ujhhgtgfeyxiexzf) {
                return objM1496Ujhhgtgfeyxiexzf;
            }
            C0282Ujhhgtgfeyxiexzf c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf = c0282Ujhhgtgfeyxiexzf.m1495Ujhhgtgfeyxiexzf();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0282Ujhhgtgfeyxiexzf, c0282UjhhgtgfeyxiexzfM1495Ujhhgtgfeyxiexzf) && atomicReferenceFieldUpdater.get(this) == c0282Ujhhgtgfeyxiexzf) {
            }
        }
    }
}
