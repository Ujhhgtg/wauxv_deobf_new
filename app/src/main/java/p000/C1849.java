package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᤝᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1849 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6153 = AtomicReferenceFieldUpdater.newUpdater(C1849.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C1851(8, false);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m3611(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6153;
            C1851 c1851 = (C1851) atomicReferenceFieldUpdater.get(this);
            int iM3615 = c1851.m3615(runnable);
            if (iM3615 == 0) {
                return true;
            }
            if (iM3615 == 1) {
                C1851 c1851M3617 = c1851.m3617();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1851, c1851M3617) && atomicReferenceFieldUpdater.get(this) == c1851) {
                }
            } else if (iM3615 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3612() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6153;
            C1851 c1851 = (C1851) atomicReferenceFieldUpdater.get(this);
            if (c1851.m3616()) {
                return;
            }
            C1851 c1851M3617 = c1851.m3617();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1851, c1851M3617) && atomicReferenceFieldUpdater.get(this) == c1851) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3613() {
        C1851 c1851 = (C1851) f6153.get(this);
        c1851.getClass();
        long j = C1851.f6156.get(c1851);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3614() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6153;
            C1851 c1851 = (C1851) atomicReferenceFieldUpdater.get(this);
            Object objM3618 = c1851.m3618();
            if (objM3618 != C1851.f6157) {
                return objM3618;
            }
            C1851 c1851M3617 = c1851.m3617();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1851, c1851M3617) && atomicReferenceFieldUpdater.get(this) == c1851) {
            }
        }
    }
}
