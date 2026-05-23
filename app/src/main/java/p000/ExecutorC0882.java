package p000;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0882 implements Executor, Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f3314 = AtomicLongFieldUpdater.newUpdater(ExecutorC0882.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f3315 = AtomicLongFieldUpdater.newUpdater(ExecutorC0882.class, "controlState$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3316 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0882.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1172 f3317 = new C1172("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final long f3320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f3321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1470 f3322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1470 f3323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2566 f3324;

    public ExecutorC0882(int i, int i2, long j, String str) {
        this.f3318 = i;
        this.f3319 = i2;
        this.f3320 = j;
        this.f3321 = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2784.m4745(i2, "Max pool size ", " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC1194.m2780(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f3322 = new C1470();
        this.f3323 = new C1470();
        this.f3324 = new C2566((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC2898 abstractRunnableC2898M2395;
        if (f3316.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0881 c0881 = threadCurrentThread instanceof C0881 ? (C0881) threadCurrentThread : null;
            if (c0881 == null || !AbstractC2207.m4087(c0881.f3313, this)) {
                c0881 = null;
            }
            synchronized (this.f3324) {
                i = (int) (f3315.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C0881 c0882 = (C0881) this.f3324.m4582(i2);
                    if (c0882 != c0881) {
                        while (c0882.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0882);
                            c0882.join(10000L);
                        }
                        C3670 c3670 = c0882.f3306;
                        C1470 c1470 = this.f3323;
                        c3670.getClass();
                        AbstractRunnableC2898 abstractRunnableC2898 = (AbstractRunnableC2898) C3670.f11453.getAndSet(c3670, null);
                        if (abstractRunnableC2898 != null) {
                            c1470.m3611(abstractRunnableC2898);
                        }
                        while (true) {
                            AbstractRunnableC2898 abstractRunnableC2898M5303 = c3670.m5303();
                            if (abstractRunnableC2898M5303 == null) {
                                break;
                            } else {
                                c1470.m3611(abstractRunnableC2898M5303);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f3323.m3612();
            this.f3322.m3612();
            while (true) {
                if (c0881 != null) {
                    abstractRunnableC2898M2395 = c0881.m2395(true);
                    if (abstractRunnableC2898M2395 == null) {
                        abstractRunnableC2898M2395 = (AbstractRunnableC2898) this.f3322.m3614();
                        if (abstractRunnableC2898M2395 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC2898M2395 = (AbstractRunnableC2898) this.f3322.m3614();
                    if (abstractRunnableC2898M2395 == null && (abstractRunnableC2898M2395 = (AbstractRunnableC2898) this.f3323.m3614()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC2898M2395.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0881 != null) {
                c0881.m2402(5);
            }
            f3314.set(this, 0L);
            f3315.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2405(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2566 c2566 = this.f3324;
        int iM4581 = c2566.m4581();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM4581; i6++) {
            C0881 c0881 = (C0881) c2566.m4582(i6);
            if (c0881 != null) {
                C3670 c3670 = c0881.f3306;
                c3670.getClass();
                int i7 = C3670.f11453.get(c3670) != null ? (C3670.f11454.get(c3670) - C3670.f11455.get(c3670)) + 1 : C3670.f11454.get(c3670) - C3670.f11455.get(c3670);
                int iM4759 = AbstractC2784.m4759(c0881.f3308);
                if (iM4759 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM4759 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM4759 == 2) {
                    i3++;
                } else if (iM4759 == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM4759 != 4) {
                        throw new C0761();
                    }
                    i5++;
                }
            }
        }
        long j = f3315.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3321);
        sb4.append('@');
        sb4.append(AbstractC0968.m2473(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f3318;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f3319);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3322.m3613());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3323.m3613());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2404() {
        synchronized (this.f3324) {
            try {
                if (f3316.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3315;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f3318) {
                    return 0;
                }
                if (i >= this.f3319) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f3324.m4582(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0881 c0881 = new C0881(this, i3);
                this.f3324.m4583(i3, c0881);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0881.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2405(Runnable runnable, boolean z) {
        AbstractRunnableC2898 c2899;
        int i;
        AbstractC2900.f9323.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2898) {
            c2899 = (AbstractRunnableC2898) runnable;
            c2899.f9315 = jNanoTime;
            c2899.f9316 = z;
        } else {
            c2899 = new C2899(runnable, jNanoTime, z);
        }
        boolean z2 = c2899.f9316;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3315;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0881 c0881 = threadCurrentThread instanceof C0881 ? (C0881) threadCurrentThread : null;
        if (c0881 == null || !AbstractC2207.m4087(c0881.f3313, this)) {
            c0881 = null;
        }
        if (c0881 != null && (i = c0881.f3308) != 5 && (c2899.f9316 || i != 2)) {
            c0881.f3312 = true;
            C3670 c3670 = c0881.f3306;
            c3670.getClass();
            c2899 = (AbstractRunnableC2898) C3670.f11453.getAndSet(c3670, c2899);
            if (c2899 == null) {
                c2899 = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c3670.f11457;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3670.f11454;
                if (atomicIntegerFieldUpdater.get(c3670) - C3670.f11455.get(c3670) != 127) {
                    if (c2899.f9316) {
                        C3670.f11456.incrementAndGet(c3670);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(c3670) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, c2899);
                    atomicIntegerFieldUpdater.incrementAndGet(c3670);
                    c2899 = null;
                }
            }
        }
        if (c2899 != null) {
            if (!(c2899.f9316 ? this.f3323.m3611(c2899) : this.f3322.m3611(c2899))) {
                throw new RejectedExecutionException(AbstractC2784.m4752(new StringBuilder(), this.f3321, " was terminated"));
            }
        }
        if (z2) {
            if (m2408() || m2407(jAddAndGet)) {
                return;
            }
            m2408();
            return;
        }
        if (m2408() || m2407(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m2408();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2406(C0881 c0881, int i, int i2) {
        while (true) {
            long j = f3314.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM2397 = c0881.m2397();
                    while (true) {
                        if (objM2397 == f3317) {
                            i3 = -1;
                            break;
                        }
                        if (objM2397 == null) {
                            i3 = 0;
                            break;
                        }
                        C0881 c0882 = (C0881) objM2397;
                        int iM2396 = c0882.m2396();
                        if (iM2396 != 0) {
                            i3 = iM2396;
                            break;
                        }
                        objM2397 = c0882.m2397();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f3314.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m2407(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f3318;
        if (i < i2) {
            int iM2404 = m2404();
            if (iM2404 == 1 && i2 > 1) {
                m2404();
            }
            if (iM2404 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean m2408() {
        C1172 c1172;
        int iM2396;
        while (true) {
            long j = f3314.get(this);
            C0881 c0881 = (C0881) this.f3324.m4582((int) (2097151 & j));
            if (c0881 == null) {
                c0881 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM2397 = c0881.m2397();
                while (true) {
                    c1172 = f3317;
                    if (objM2397 == c1172) {
                        iM2396 = -1;
                        break;
                    }
                    if (objM2397 == null) {
                        iM2396 = 0;
                        break;
                    }
                    C0881 c0882 = (C0881) objM2397;
                    iM2396 = c0882.m2396();
                    if (iM2396 != 0) {
                        break;
                    }
                    objM2397 = c0882.m2397();
                }
                if (iM2396 >= 0) {
                    if (f3314.compareAndSet(this, j, ((long) iM2396) | j2)) {
                        c0881.m2401(c1172);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0881 == null) {
                return false;
            }
            if (C0881.f3305.compareAndSet(c0881, -1, 0)) {
                LockSupport.unpark(c0881);
                return true;
            }
        }
    }
}
