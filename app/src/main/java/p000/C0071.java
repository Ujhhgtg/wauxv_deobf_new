package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0071 extends AbstractC1574 {

    public final AtomicReferenceFieldUpdater f1004;

    public final AtomicReferenceFieldUpdater f1005;

    public final AtomicReferenceFieldUpdater f1006;

    public final AtomicReferenceFieldUpdater f1007;

    public final AtomicReferenceFieldUpdater f1008;

    public C0071(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1004 = atomicReferenceFieldUpdater;
        this.f1005 = atomicReferenceFieldUpdater2;
        this.f1006 = atomicReferenceFieldUpdater3;
        this.f1007 = atomicReferenceFieldUpdater4;
        this.f1008 = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC1574
    public final boolean mo951(AbstractFutureC0074 abstractFutureC0074, C0070 c0070) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1007;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0074, c0070, C0070.f1002)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0074) == c0070);
        return false;
    }

    @Override // p000.AbstractC1574
    public final boolean mo952(AbstractFutureC0074 abstractFutureC0074, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1008;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0074, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0074) == obj);
        return false;
    }

    @Override // p000.AbstractC1574
    public final boolean mo953(AbstractFutureC0074 abstractFutureC0074, C0073 c0073, C0073 c0074) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1006;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0074, c0073, c0074)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0074) == c0073);
        return false;
    }

    @Override // p000.AbstractC1574
    public final void mo954(C0073 c0073, C0073 c0074) {
        this.f1005.lazySet(c0073, c0074);
    }

    @Override // p000.AbstractC1574
    public final void mo955(C0073 c0073, Thread thread) {
        this.f1004.lazySet(c0073, thread);
    }
}
