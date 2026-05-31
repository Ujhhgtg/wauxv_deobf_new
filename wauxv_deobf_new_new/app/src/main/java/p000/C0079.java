package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0079 extends AbstractC1469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f1069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f1070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f1071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f1072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f1073;

    public C0079(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1069 = atomicReferenceFieldUpdater;
        this.f1070 = atomicReferenceFieldUpdater2;
        this.f1071 = atomicReferenceFieldUpdater3;
        this.f1072 = atomicReferenceFieldUpdater4;
        this.f1073 = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo1096(AbstractFutureC0082 abstractFutureC0082, C0078 c0078) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1072;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0082, c0078, C0078.f1067)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0082) == c0078);
        return false;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean mo1097(AbstractFutureC0082 abstractFutureC0082, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1073;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0082, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0082) == obj);
        return false;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo1098(AbstractFutureC0082 abstractFutureC0082, C0081 c0081, C0081 c0082) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1071;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0082, c0081, c0082)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0082) == c0081);
        return false;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void mo1099(C0081 c0081, C0081 c0082) {
        this.f1070.lazySet(c0081, c0082);
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void mo1100(C0081 c0081, Thread thread) {
        this.f1069.lazySet(c0081, thread);
    }
}
