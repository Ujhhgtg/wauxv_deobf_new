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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲀᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0881 implements Executor, Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f3321 = AtomicLongFieldUpdater.newUpdater(ExecutorC0881.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f3322 = AtomicLongFieldUpdater.newUpdater(ExecutorC0881.class, "controlState$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3323 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0881.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C1174 f3324 = new C1174("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f3326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final long f3327;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f3328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1481 f3329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1481 f3330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2622 f3331;

    public ExecutorC0881(int i, int i2, long j, String str) {
        this.f3325 = i;
        this.f3326 = i2;
        this.f3327 = j;
        this.f3328 = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1095.m2795(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC2844.m4779(i2, "Max pool size ", " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC1095.m2795(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f3329 = new C1481();
        this.f3330 = new C1481();
        this.f3331 = new C2622((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC2957 abstractRunnableC2957M2512;
        if (f3323.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0880 c0880 = threadCurrentThread instanceof C0880 ? (C0880) threadCurrentThread : null;
            if (c0880 == null || !AbstractC1469.m3322(c0880.f3320, this)) {
                c0880 = null;
            }
            synchronized (this.f3331) {
                i = (int) (f3322.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C0880 c0881 = (C0880) this.f3331.m4604(i2);
                    if (c0881 != c0880) {
                        while (c0881.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0881);
                            c0881.join(10000L);
                        }
                        C3730 c3730 = c0881.f3313;
                        C1481 c1481 = this.f3330;
                        c3730.getClass();
                        AbstractRunnableC2957 abstractRunnableC2957 = (AbstractRunnableC2957) C3730.f11602.getAndSet(c3730, null);
                        if (abstractRunnableC2957 != null) {
                            c1481.m3789(abstractRunnableC2957);
                        }
                        while (true) {
                            AbstractRunnableC2957 abstractRunnableC2957M5309 = c3730.m5309();
                            if (abstractRunnableC2957M5309 == null) {
                                break;
                            } else {
                                c1481.m3789(abstractRunnableC2957M5309);
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
            this.f3330.m3790();
            this.f3329.m3790();
            while (true) {
                if (c0880 != null) {
                    abstractRunnableC2957M2512 = c0880.m2512(true);
                    if (abstractRunnableC2957M2512 == null) {
                        abstractRunnableC2957M2512 = (AbstractRunnableC2957) this.f3329.m3792();
                        if (abstractRunnableC2957M2512 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC2957M2512 = (AbstractRunnableC2957) this.f3329.m3792();
                    if (abstractRunnableC2957M2512 == null && (abstractRunnableC2957M2512 = (AbstractRunnableC2957) this.f3330.m3792()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC2957M2512.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0880 != null) {
                c0880.m2519(5);
            }
            f3321.set(this, 0L);
            f3322.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2522(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2622 c2622 = this.f3331;
        int iM4603 = c2622.m4603();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM4603; i6++) {
            C0880 c0880 = (C0880) c2622.m4604(i6);
            if (c0880 != null) {
                C3730 c3730 = c0880.f3313;
                c3730.getClass();
                int i7 = C3730.f11602.get(c3730) != null ? (C3730.f11603.get(c3730) - C3730.f11604.get(c3730)) + 1 : C3730.f11603.get(c3730) - C3730.f11604.get(c3730);
                int iM4792 = AbstractC2844.m4792(c0880.f3315);
                if (iM4792 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM4792 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM4792 == 2) {
                    i3++;
                } else if (iM4792 == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM4792 != 4) {
                        throw new C0758();
                    }
                    i5++;
                }
            }
        }
        long j = f3322.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3328);
        sb4.append('@');
        sb4.append(AbstractC0972.m2594(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f3325;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f3326);
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
        sb4.append(this.f3329.m3791());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3330.m3791());
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
    public final int m2521() {
        synchronized (this.f3331) {
            try {
                if (f3323.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3322;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f3325) {
                    return 0;
                }
                if (i >= this.f3326) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f3331.m4604(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0880 c0880 = new C0880(this, i3);
                this.f3331.m4605(i3, c0880);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0880.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2522(Runnable runnable, boolean z) {
        AbstractRunnableC2957 c2958;
        int i;
        AbstractC2959.f9490.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2957) {
            c2958 = (AbstractRunnableC2957) runnable;
            c2958.f9482 = jNanoTime;
            c2958.f9483 = z;
        } else {
            c2958 = new C2958(runnable, jNanoTime, z);
        }
        boolean z2 = c2958.f9483;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3322;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0880 c0880 = threadCurrentThread instanceof C0880 ? (C0880) threadCurrentThread : null;
        if (c0880 == null || !AbstractC1469.m3322(c0880.f3320, this)) {
            c0880 = null;
        }
        if (c0880 != null && (i = c0880.f3315) != 5 && (c2958.f9483 || i != 2)) {
            c0880.f3319 = true;
            C3730 c3730 = c0880.f3313;
            c3730.getClass();
            c2958 = (AbstractRunnableC2957) C3730.f11602.getAndSet(c3730, c2958);
            if (c2958 == null) {
                c2958 = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c3730.f11606;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3730.f11603;
                if (atomicIntegerFieldUpdater.get(c3730) - C3730.f11604.get(c3730) != 127) {
                    if (c2958.f9483) {
                        C3730.f11605.incrementAndGet(c3730);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(c3730) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, c2958);
                    atomicIntegerFieldUpdater.incrementAndGet(c3730);
                    c2958 = null;
                }
            }
        }
        if (c2958 != null) {
            if (!(c2958.f9483 ? this.f3330.m3789(c2958) : this.f3329.m3789(c2958))) {
                throw new RejectedExecutionException(AbstractC2844.m4786(new StringBuilder(), this.f3328, " was terminated"));
            }
        }
        if (z2) {
            if (m2525() || m2524(jAddAndGet)) {
                return;
            }
            m2525();
            return;
        }
        if (m2525() || m2524(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m2525();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2523(C0880 c0880, int i, int i2) {
        while (true) {
            long j = f3321.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM2514 = c0880.m2514();
                    while (true) {
                        if (objM2514 == f3324) {
                            i3 = -1;
                            break;
                        }
                        if (objM2514 == null) {
                            i3 = 0;
                            break;
                        }
                        C0880 c0881 = (C0880) objM2514;
                        int iM2513 = c0881.m2513();
                        if (iM2513 != 0) {
                            i3 = iM2513;
                            break;
                        }
                        objM2514 = c0881.m2514();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f3321.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m2524(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f3325;
        if (i < i2) {
            int iM2521 = m2521();
            if (iM2521 == 1 && i2 > 1) {
                m2521();
            }
            if (iM2521 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean m2525() {
        C1174 c1174;
        int iM2513;
        while (true) {
            long j = f3321.get(this);
            C0880 c0880 = (C0880) this.f3331.m4604((int) (2097151 & j));
            if (c0880 == null) {
                c0880 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM2514 = c0880.m2514();
                while (true) {
                    c1174 = f3324;
                    if (objM2514 == c1174) {
                        iM2513 = -1;
                        break;
                    }
                    if (objM2514 == null) {
                        iM2513 = 0;
                        break;
                    }
                    C0880 c0881 = (C0880) objM2514;
                    iM2513 = c0881.m2513();
                    if (iM2513 != 0) {
                        break;
                    }
                    objM2514 = c0881.m2514();
                }
                if (iM2513 >= 0) {
                    if (f3321.compareAndSet(this, j, ((long) iM2513) | j2)) {
                        c0880.m2518(c1174);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0880 == null) {
                return false;
            }
            if (C0880.f3312.compareAndSet(c0880, -1, 0)) {
                LockSupport.unpark(c0880);
                return true;
            }
        }
    }
}
