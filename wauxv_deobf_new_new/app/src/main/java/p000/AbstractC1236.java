package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1236 extends AbstractC1237 implements InterfaceC1010 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4458 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1236.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4459 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1236.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4460 = AtomicIntegerFieldUpdater.newUpdater(AbstractC1236.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p000.AbstractC1237
    public void shutdown() {
        AbstractRunnableC1234 abstractRunnableC1234M4985;
        AbstractC2979.f9542.set(null);
        f4460.set(this, 1);
        C1174 c1174 = C1787.f5942;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4458;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c1174)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C1877) {
                ((C1877) obj).m3794();
                break;
            } else {
                if (obj == c1174) {
                    break;
                }
                C1877 c1877 = new C1877(8, true);
                c1877.m3793((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1877)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (m2993() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C1235 c1235 = (C1235) f4459.get(this);
            if (c1235 == null) {
                return;
            }
            synchronized (c1235) {
                abstractRunnableC1234M4985 = C2980.f9543.get(c1235) > 0 ? c1235.m4985(0) : null;
            }
            if (abstractRunnableC1234M4985 == null) {
                return;
            } else {
                mo2673(jNanoTime, abstractRunnableC1234M4985);
            }
        }
    }

    @Override // p000.InterfaceC1010
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo2701(long j, C0535 c0535) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C1233 c1233 = new C1233(this, j2 + jNanoTime, c0535);
            m2994(jNanoTime, c1233);
            AbstractC1586.m3478(c0535, new C0532(c1233, 1));
        }
    }

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable) {
        mo2674(runnable);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public void mo2674(Runnable runnable) {
        m2990();
        if (!m2991(runnable)) {
            RunnableC0988.f3617.mo2674(runnable);
            return;
        }
        Thread threadMo1744 = mo1744();
        if (Thread.currentThread() != threadMo1744) {
            LockSupport.unpark(threadMo1744);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m2990() {
        AbstractRunnableC1234 abstractRunnableC1234M4985;
        C1235 c1235 = (C1235) f4459.get(this);
        if (c1235 == null || C2980.f9543.get(c1235) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c1235) {
                try {
                    AbstractRunnableC1234[] abstractRunnableC1234Arr = c1235.f9544;
                    abstractRunnableC1234M4985 = null;
                    AbstractRunnableC1234 abstractRunnableC1234 = abstractRunnableC1234Arr != null ? abstractRunnableC1234Arr[0] : null;
                    if (abstractRunnableC1234 != null) {
                        if (jNanoTime - abstractRunnableC1234.f4455 >= 0 ? m2991(abstractRunnableC1234) : false) {
                            abstractRunnableC1234M4985 = c1235.m4985(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1234M4985 != null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final boolean m2991(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4458;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4460.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C1877)) {
                if (obj == C1787.f5942) {
                    return false;
                }
                C1877 c1877 = new C1877(8, true);
                c1877.m3793((Runnable) obj);
                c1877.m3793(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1877)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C1877 c1878 = (C1877) obj;
            int iM3793 = c1878.m3793(runnable);
            if (iM3793 == 0) {
                return true;
            }
            if (iM3793 == 1) {
                C1877 c1877M3795 = c1878.m3795();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1877M3795) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM3793 == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final boolean m2992() {
        Object obj;
        long j;
        C0266 c0266 = this.f4463;
        if (c0266 != null ? c0266.isEmpty() : true) {
            C1235 c1235 = (C1235) f4459.get(this);
            if (c1235 == null) {
                obj = f4458.get(this);
                if (obj != null) {
                    if (obj instanceof C1877) {
                        j = C1877.f6230.get((C1877) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == C1787.f5942) {
                    }
                }
                return true;
            }
            if (C2980.f9543.get(c1235) == 0) {
                obj = f4458.get(this);
                if (obj != null) {
                    if (obj instanceof C1877) {
                        j = C1877.f6230.get((C1877) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == C1787.f5942) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final long m2993() {
        Runnable runnable;
        AbstractRunnableC1234 abstractRunnableC1234;
        C1174 c1174 = C1787.f5942;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4458;
        if (!m2997()) {
            m2990();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof C1877) {
                        C1877 c1877 = (C1877) obj;
                        Object objM3796 = c1877.m3796();
                        if (objM3796 != C1877.f6231) {
                            runnable = (Runnable) objM3796;
                            break;
                        }
                        C1877 c1877M3795 = c1877.m3795();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1877M3795) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != c1174) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0266 c0266 = this.f4463;
            if (((c0266 == null || c0266.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C1877) {
                        long j = C1877.f6230.get((C1877) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c1174) {
                        return Long.MAX_VALUE;
                    }
                }
                C1235 c1235 = (C1235) f4459.get(this);
                if (c1235 != null) {
                    synchronized (c1235) {
                        AbstractRunnableC1234[] abstractRunnableC1234Arr = c1235.f9544;
                        abstractRunnableC1234 = abstractRunnableC1234Arr != null ? abstractRunnableC1234Arr[0] : null;
                    }
                    if (abstractRunnableC1234 != null) {
                        long jNanoTime = abstractRunnableC1234.f4455 - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void m2994(long j, AbstractRunnableC1234 abstractRunnableC1234) {
        int iM2988;
        Thread threadMo1744;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4459;
        AbstractRunnableC1234 abstractRunnableC1235 = null;
        if (f4460.get(this) == 1) {
            iM2988 = 1;
        } else {
            C1235 c1235 = (C1235) atomicReferenceFieldUpdater.get(this);
            if (c1235 == null) {
                C1235 c1236 = new C1235();
                c1236.f4457 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1236) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c1235 = (C1235) atomicReferenceFieldUpdater.get(this);
            }
            iM2988 = abstractRunnableC1234.m2988(j, c1235, this);
        }
        if (iM2988 != 0) {
            if (iM2988 == 1) {
                mo2673(j, abstractRunnableC1234);
                return;
            } else {
                if (iM2988 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C1235 c1237 = (C1235) atomicReferenceFieldUpdater.get(this);
        if (c1237 != null) {
            synchronized (c1237) {
                AbstractRunnableC1234[] abstractRunnableC1234Arr = c1237.f9544;
                abstractRunnableC1235 = abstractRunnableC1234Arr != null ? abstractRunnableC1234Arr[0] : null;
            }
        }
        if (abstractRunnableC1235 != abstractRunnableC1234 || Thread.currentThread() == (threadMo1744 = mo1744())) {
            return;
        }
        LockSupport.unpark(threadMo1744);
    }
}
