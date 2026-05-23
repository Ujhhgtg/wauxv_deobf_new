package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234 extends AbstractC1235 implements InterfaceC1006 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4460 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1234.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4461 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1234.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4462 = AtomicIntegerFieldUpdater.newUpdater(AbstractC1234.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p000.AbstractC1235
    public void shutdown() {
        AbstractRunnableC1232 abstractRunnableC1232M4923;
        AbstractC2920.f9375.set(null);
        f4462.set(this, 1);
        C1172 c1172 = AbstractC2209.f7184;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4460;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c1172)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C1851) {
                ((C1851) obj).m3616();
                break;
            } else {
                if (obj == c1172) {
                    break;
                }
                C1851 c1851 = new C1851(8, true);
                c1851.m3615((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1851)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (m2871() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C1233 c1233 = (C1233) f4461.get(this);
            if (c1233 == null) {
                return;
            }
            synchronized (c1233) {
                abstractRunnableC1232M4923 = C2921.f9376.get(c1233) > 0 ? c1233.m4923(0) : null;
            }
            if (abstractRunnableC1232M4923 == null) {
                return;
            } else {
                mo2549(jNanoTime, abstractRunnableC1232M4923);
            }
        }
    }

    @Override // p000.InterfaceC1006
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo2577(long j, C0558 c0558) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? 9223372036854775807L : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C1231 c1231 = new C1231(this, j2 + jNanoTime, c0558);
            m2872(jNanoTime, c1231);
            AbstractC2207.m4100(c0558, new C0555(1, c1231));
        }
    }

    @Override // p000.AbstractC0878
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable) {
        mo2550(runnable);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public void mo2550(Runnable runnable) {
        m2868();
        if (!m2869(runnable)) {
            RunnableC0984.f3601.mo2550(runnable);
            return;
        }
        Thread threadMo1638 = mo1638();
        if (Thread.currentThread() != threadMo1638) {
            LockSupport.unpark(threadMo1638);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m2868() {
        AbstractRunnableC1232 abstractRunnableC1232M4923;
        C1233 c1233 = (C1233) f4461.get(this);
        if (c1233 == null || C2921.f9376.get(c1233) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c1233) {
                try {
                    AbstractRunnableC1232[] abstractRunnableC1232Arr = c1233.f9377;
                    abstractRunnableC1232M4923 = null;
                    AbstractRunnableC1232 abstractRunnableC1232 = abstractRunnableC1232Arr != null ? abstractRunnableC1232Arr[0] : null;
                    if (abstractRunnableC1232 != null) {
                        abstractRunnableC1232M4923 = ((jNanoTime - abstractRunnableC1232.f4457) > 0L ? 1 : ((jNanoTime - abstractRunnableC1232.f4457) == 0L ? 0 : -1)) >= 0 ? m2869(abstractRunnableC1232) : false ? c1233.m4923(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1232M4923 != null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final boolean m2869(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4460;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4462.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C1851)) {
                if (obj == AbstractC2209.f7184) {
                    return false;
                }
                C1851 c1851 = new C1851(8, true);
                c1851.m3615((Runnable) obj);
                c1851.m3615(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1851)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C1851 c1852 = (C1851) obj;
            int iM3615 = c1852.m3615(runnable);
            if (iM3615 == 0) {
                return true;
            }
            if (iM3615 == 1) {
                C1851 c1851M3617 = c1852.m3617();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1851M3617) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM3615 == 2) {
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
    public final boolean m2870() {
        Object obj;
        long j;
        C0256 c0256 = this.f4465;
        if (c0256 != null ? c0256.isEmpty() : true) {
            C1233 c1233 = (C1233) f4461.get(this);
            if (c1233 == null) {
                obj = f4460.get(this);
                if (obj != null) {
                    if (obj instanceof C1851) {
                        j = C1851.f6156.get((C1851) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC2209.f7184) {
                    }
                }
                return true;
            }
            if (C2921.f9376.get(c1233) == 0) {
                obj = f4460.get(this);
                if (obj != null) {
                    if (obj instanceof C1851) {
                        j = C1851.f6156.get((C1851) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC2209.f7184) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final long m2871() {
        Runnable runnable;
        AbstractRunnableC1232 abstractRunnableC1232;
        C1172 c1172 = AbstractC2209.f7184;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4460;
        if (!m2875()) {
            m2868();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof C1851) {
                        C1851 c1851 = (C1851) obj;
                        Object objM3618 = c1851.m3618();
                        if (objM3618 != C1851.f6157) {
                            runnable = (Runnable) objM3618;
                            break;
                        }
                        C1851 c1851M3617 = c1851.m3617();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1851M3617) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != c1172) {
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
            C0256 c0256 = this.f4465;
            if (((c0256 == null || c0256.isEmpty()) ? 9223372036854775807L : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C1851) {
                        long j = C1851.f6156.get((C1851) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c1172) {
                        return 9223372036854775807L;
                    }
                }
                C1233 c1233 = (C1233) f4461.get(this);
                if (c1233 != null) {
                    synchronized (c1233) {
                        AbstractRunnableC1232[] abstractRunnableC1232Arr = c1233.f9377;
                        abstractRunnableC1232 = abstractRunnableC1232Arr != null ? abstractRunnableC1232Arr[0] : null;
                    }
                    if (abstractRunnableC1232 != null) {
                        long jNanoTime = abstractRunnableC1232.f4457 - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return 9223372036854775807L;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void m2872(long j, AbstractRunnableC1232 abstractRunnableC1232) {
        int iM2866;
        Thread threadMo1638;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4461;
        AbstractRunnableC1232 abstractRunnableC1233 = null;
        if (f4462.get(this) == 1) {
            iM2866 = 1;
        } else {
            C1233 c1233 = (C1233) atomicReferenceFieldUpdater.get(this);
            if (c1233 == null) {
                C1233 c1234 = new C1233();
                c1234.f4459 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1234) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c1233 = (C1233) atomicReferenceFieldUpdater.get(this);
            }
            iM2866 = abstractRunnableC1232.m2866(j, c1233, this);
        }
        if (iM2866 != 0) {
            if (iM2866 == 1) {
                mo2549(j, abstractRunnableC1232);
                return;
            } else {
                if (iM2866 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C1233 c1235 = (C1233) atomicReferenceFieldUpdater.get(this);
        if (c1235 != null) {
            synchronized (c1235) {
                AbstractRunnableC1232[] abstractRunnableC1232Arr = c1235.f9377;
                abstractRunnableC1233 = abstractRunnableC1232Arr != null ? abstractRunnableC1232Arr[0] : null;
            }
        }
        if (abstractRunnableC1233 != abstractRunnableC1232 || Thread.currentThread() == (threadMo1638 = mo1638())) {
            return;
        }
        LockSupport.unpark(threadMo1638);
    }
}
