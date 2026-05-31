package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1875 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6227 = AtomicReferenceFieldUpdater.newUpdater(C1875.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C1877(8, false);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m3789(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6227;
            C1877 c1877 = (C1877) atomicReferenceFieldUpdater.get(this);
            int iM3793 = c1877.m3793(runnable);
            if (iM3793 == 0) {
                return true;
            }
            if (iM3793 == 1) {
                C1877 c1877M3795 = c1877.m3795();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1877, c1877M3795) && atomicReferenceFieldUpdater.get(this) == c1877) {
                }
            } else if (iM3793 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3790() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6227;
            C1877 c1877 = (C1877) atomicReferenceFieldUpdater.get(this);
            if (c1877.m3794()) {
                return;
            }
            C1877 c1877M3795 = c1877.m3795();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1877, c1877M3795) && atomicReferenceFieldUpdater.get(this) == c1877) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3791() {
        C1877 c1877 = (C1877) f6227.get(this);
        c1877.getClass();
        long j = C1877.f6230.get(c1877);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3792() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6227;
            C1877 c1877 = (C1877) atomicReferenceFieldUpdater.get(this);
            Object objM3796 = c1877.m3796();
            if (objM3796 != C1877.f6231) {
                return objM3796;
            }
            C1877 c1877M3795 = c1877.m3795();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1877, c1877M3795) && atomicReferenceFieldUpdater.get(this) == c1877) {
            }
        }
    }
}
