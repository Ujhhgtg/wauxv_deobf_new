package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3730 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11602 = AtomicReferenceFieldUpdater.newUpdater(C3730.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11603 = AtomicIntegerFieldUpdater.newUpdater(C3730.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11604 = AtomicIntegerFieldUpdater.newUpdater(C3730.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11605 = AtomicIntegerFieldUpdater.newUpdater(C3730.class, "blockingTasksInBuffer$volatile");
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AtomicReferenceArray f11606 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractRunnableC2957 m5309() {
        AbstractRunnableC2957 abstractRunnableC2957;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11604;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f11603.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC2957 = (AbstractRunnableC2957) this.f11606.getAndSet(i2, null)) != null) {
                if (abstractRunnableC2957.f9483) {
                    f11605.decrementAndGet(this);
                }
                return abstractRunnableC2957;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractRunnableC2957 m5310(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f11606;
        AbstractRunnableC2957 abstractRunnableC2957 = (AbstractRunnableC2957) atomicReferenceArray.get(i2);
        if (abstractRunnableC2957 != null && abstractRunnableC2957.f9483 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC2957, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC2957) {
                }
            }
            if (z) {
                f11605.decrementAndGet(this);
            }
            return abstractRunnableC2957;
        }
        return null;
    }
}
