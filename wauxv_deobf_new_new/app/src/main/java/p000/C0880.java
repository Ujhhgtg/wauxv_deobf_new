package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲀᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0880 extends Thread {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3312 = AtomicIntegerFieldUpdater.newUpdater(C0880.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3730 f3313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2571 f3314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f3316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public long f3317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f3319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC0881 f3320;

    public C0880(ExecutorC0881 executorC0881, int i) {
        this.f3320 = executorC0881;
        setDaemon(true);
        setContextClassLoader(ExecutorC0881.class.getClassLoader());
        this.f3313 = new C3730();
        this.f3314 = new C2571();
        this.f3315 = 4;
        this.nextParkedWorker = ExecutorC0881.f3324;
        int iNanoTime = (int) System.nanoTime();
        this.f3318 = iNanoTime == 0 ? 42 : iNanoTime;
        m2517(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC0881.f3323.get(this.f3320) == 1 || this.f3315 == 5) {
                    break loop0;
                }
                AbstractRunnableC2957 abstractRunnableC2957M2512 = m2512(this.f3319);
                if (abstractRunnableC2957M2512 != null) {
                    this.f3317 = 0L;
                    ExecutorC0881 executorC0881 = this.f3320;
                    this.f3316 = 0L;
                    if (this.f3315 == 3) {
                        this.f3315 = 2;
                    }
                    if (!abstractRunnableC2957M2512.f9483) {
                        try {
                            abstractRunnableC2957M2512.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (m2519(2) && !executorC0881.m2525() && !executorC0881.m2524(ExecutorC0881.f3322.get(executorC0881))) {
                        executorC0881.m2525();
                    }
                    try {
                        abstractRunnableC2957M2512.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    ExecutorC0881.f3322.addAndGet(executorC0881, -2097152L);
                    if (this.f3315 == 5) {
                        break;
                    }
                    this.f3315 = 4;
                    break;
                }
                this.f3319 = false;
                if (this.f3317 == 0) {
                    Object obj = this.nextParkedWorker;
                    C1174 c1174 = ExecutorC0881.f3324;
                    if (obj != c1174) {
                        f3312.set(this, -1);
                        while (this.nextParkedWorker != ExecutorC0881.f3324) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3312;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            ExecutorC0881 executorC0882 = this.f3320;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0881.f3323;
                            if (atomicIntegerFieldUpdater2.get(executorC0882) == 1 || this.f3315 == 5) {
                                break;
                            }
                            m2519(3);
                            Thread.interrupted();
                            if (this.f3316 == 0) {
                                j = 2097151;
                                this.f3316 = System.nanoTime() + this.f3320.f3327;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.f3320.f3327);
                            if (System.nanoTime() - this.f3316 >= 0) {
                                this.f3316 = 0L;
                                ExecutorC0881 executorC0883 = this.f3320;
                                synchronized (executorC0883.f3331) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(executorC0883) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0881.f3322;
                                            if (((int) (atomicLongFieldUpdater.get(executorC0883) & j)) > executorC0883.f3325 && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m2517(0);
                                                executorC0883.m2523(this, i, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0883) & j);
                                                if (andDecrement != i) {
                                                    C0880 c0880 = (C0880) executorC0883.f3331.m4604(andDecrement);
                                                    executorC0883.f3331.m4605(i, c0880);
                                                    c0880.m2517(i);
                                                    executorC0883.m2523(c0880, andDecrement, i);
                                                }
                                                executorC0883.f3331.m4605(andDecrement, null);
                                                this.f3315 = 5;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        ExecutorC0881 executorC0884 = this.f3320;
                        if (this.nextParkedWorker == c1174) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0881.f3321;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(executorC0884);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = executorC0884.f3331.m4604((int) (j2 & 2097151));
                                ExecutorC0881 executorC0885 = executorC0884;
                                if (ExecutorC0881.f3321.compareAndSet(executorC0885, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                    break;
                                } else {
                                    executorC0884 = executorC0885;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        m2519(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3317);
                        this.f3317 = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        m2519(5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractRunnableC2957 m2512(boolean z) {
        AbstractRunnableC2957 abstractRunnableC2957M2516;
        AbstractRunnableC2957 abstractRunnableC2957M2517;
        long j;
        int i = this.f3315;
        ExecutorC0881 executorC0881 = this.f3320;
        AbstractRunnableC2957 abstractRunnableC2957 = null;
        C3730 c3730 = this.f3313;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0881.f3322;
            do {
                j = atomicLongFieldUpdater.get(executorC0881);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c3730.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3730.f11602;
                        AbstractRunnableC2957 abstractRunnableC2958 = (AbstractRunnableC2957) atomicReferenceFieldUpdater.get(c3730);
                        if (abstractRunnableC2958 == null || !abstractRunnableC2958.f9483) {
                            int i2 = C3730.f11604.get(c3730);
                            int i3 = C3730.f11603.get(c3730);
                            while (i2 != i3 && C3730.f11605.get(c3730) != 0) {
                                i3--;
                                AbstractRunnableC2957 abstractRunnableC2957M5310 = c3730.m5310(i3, true);
                                if (abstractRunnableC2957M5310 != null) {
                                    abstractRunnableC2957 = abstractRunnableC2957M5310;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c3730, abstractRunnableC2958, null)) {
                                abstractRunnableC2957 = abstractRunnableC2958;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c3730) == abstractRunnableC2958);
                    }
                    if (abstractRunnableC2957 != null) {
                        return abstractRunnableC2957;
                    }
                    AbstractRunnableC2957 abstractRunnableC2959 = (AbstractRunnableC2957) executorC0881.f3330.m3792();
                    return abstractRunnableC2959 == null ? m2520(1) : abstractRunnableC2959;
                }
            } while (!ExecutorC0881.f3322.compareAndSet(executorC0881, j, j - 4398046511104L));
            this.f3315 = 1;
        }
        if (z) {
            boolean z2 = m2515(executorC0881.f3325 * 2) == 0;
            if (z2 && (abstractRunnableC2957M2517 = m2516()) != null) {
                return abstractRunnableC2957M2517;
            }
            c3730.getClass();
            AbstractRunnableC2957 abstractRunnableC2957M5309 = (AbstractRunnableC2957) C3730.f11602.getAndSet(c3730, null);
            if (abstractRunnableC2957M5309 == null) {
                abstractRunnableC2957M5309 = c3730.m5309();
            }
            if (abstractRunnableC2957M5309 != null) {
                return abstractRunnableC2957M5309;
            }
            if (!z2 && (abstractRunnableC2957M2516 = m2516()) != null) {
                return abstractRunnableC2957M2516;
            }
        } else {
            AbstractRunnableC2957 abstractRunnableC2957M2518 = m2516();
            if (abstractRunnableC2957M2518 != null) {
                return abstractRunnableC2957M2518;
            }
        }
        return m2520(3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2513() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object m2514() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m2515(int i) {
        int i2 = this.f3318;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3318 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractRunnableC2957 m2516() {
        int iM2515 = m2515(2);
        ExecutorC0881 executorC0881 = this.f3320;
        if (iM2515 == 0) {
            AbstractRunnableC2957 abstractRunnableC2957 = (AbstractRunnableC2957) executorC0881.f3329.m3792();
            return abstractRunnableC2957 != null ? abstractRunnableC2957 : (AbstractRunnableC2957) executorC0881.f3330.m3792();
        }
        AbstractRunnableC2957 abstractRunnableC2958 = (AbstractRunnableC2957) executorC0881.f3330.m3792();
        return abstractRunnableC2958 != null ? abstractRunnableC2958 : (AbstractRunnableC2957) executorC0881.f3329.m3792();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2517(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3320.f3328);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2518(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m2519(int i) {
        int i2 = this.f3315;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0881.f3322.addAndGet(this.f3320, 4398046511104L);
        }
        if (i2 != i) {
            this.f3315 = i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractRunnableC2957 m2520(int i) {
        long j;
        AbstractRunnableC2957 abstractRunnableC2957M5309;
        long j2;
        long j3;
        AbstractRunnableC2957 abstractRunnableC2957;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0881.f3322;
        ExecutorC0881 executorC0881 = this.f3320;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0881) & 2097151);
        AbstractRunnableC2957 abstractRunnableC2958 = null;
        if (i2 < 2) {
            return null;
        }
        int iM2515 = m2515(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iM2515++;
            if (iM2515 > i2) {
                iM2515 = 1;
            }
            C0880 c0880 = (C0880) executorC0881.f3331.m4604(iM2515);
            if (c0880 != null && c0880 != this) {
                C3730 c3730 = c0880.f3313;
                c3730.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = C3730.f11604.get(c3730);
                    int i5 = C3730.f11603.get(c3730);
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || C3730.f11605.get(c3730) != 0) {
                                int i6 = i4 + 1;
                                AbstractRunnableC2957 abstractRunnableC2957M5310 = c3730.m5310(i4, z);
                                if (abstractRunnableC2957M5310 != null) {
                                    abstractRunnableC2957M5309 = abstractRunnableC2957M5310;
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        abstractRunnableC2957M5309 = abstractRunnableC2958;
                        break;
                    }
                } else {
                    abstractRunnableC2957M5309 = c3730.m5309();
                    j = 0;
                }
                C2571 c2571 = this.f3314;
                if (abstractRunnableC2957M5309 == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3730.f11602;
                        AbstractRunnableC2957 abstractRunnableC2959 = (AbstractRunnableC2957) atomicReferenceFieldUpdater.get(c3730);
                        if (abstractRunnableC2959 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((abstractRunnableC2959.f9483 ? 1 : 2) & i) != 0) {
                                AbstractC2959.f9490.getClass();
                                C3730 c3731 = c3730;
                                long jNanoTime = System.nanoTime() - abstractRunnableC2959.f9482;
                                long j4 = AbstractC2959.f9486;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    abstractRunnableC2957 = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC2957 = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c3731, abstractRunnableC2959, null)) {
                                        c2571.f8191 = abstractRunnableC2959;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c3731) == abstractRunnableC2959);
                                c3730 = c3731;
                                abstractRunnableC2958 = null;
                            }
                        }
                        j3 = -2;
                        abstractRunnableC2957 = abstractRunnableC2958;
                        break;
                    }
                } else {
                    c2571.f8191 = abstractRunnableC2957M5309;
                    abstractRunnableC2957 = abstractRunnableC2958;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    AbstractRunnableC2957 abstractRunnableC29510 = (AbstractRunnableC2957) c2571.f8191;
                    c2571.f8191 = abstractRunnableC2957;
                    return abstractRunnableC29510;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            abstractRunnableC2958 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f3317 = jMin;
        return null;
    }
}
