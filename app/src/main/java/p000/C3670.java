package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3670 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11453 = AtomicReferenceFieldUpdater.newUpdater(C3670.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11454 = AtomicIntegerFieldUpdater.newUpdater(C3670.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11455 = AtomicIntegerFieldUpdater.newUpdater(C3670.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11456 = AtomicIntegerFieldUpdater.newUpdater(C3670.class, "blockingTasksInBuffer$volatile");
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AtomicReferenceArray f11457 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractRunnableC2898 m5303() {
        AbstractRunnableC2898 abstractRunnableC2898;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11455;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f11454.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC2898 = (AbstractRunnableC2898) this.f11457.getAndSet(i2, null)) != null) {
                if (abstractRunnableC2898.f9316) {
                    f11456.decrementAndGet(this);
                }
                return abstractRunnableC2898;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractRunnableC2898 m5304(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f11457;
        AbstractRunnableC2898 abstractRunnableC2898 = (AbstractRunnableC2898) atomicReferenceArray.get(i2);
        if (abstractRunnableC2898 != null && abstractRunnableC2898.f9316 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC2898, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC2898) {
                }
            }
            if (z) {
                f11456.decrementAndGet(this);
            }
            return abstractRunnableC2898;
        }
        return null;
    }
}
