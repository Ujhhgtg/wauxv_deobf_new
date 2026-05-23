package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0881 extends Thread {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f3305 = AtomicIntegerFieldUpdater.newUpdater(C0881.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public final C3670 f3306;

    public final C2516 f3307;

    public int f3308;

    public long f3309;

    public long f3310;

    public int f3311;

    public boolean f3312;

    public final /* synthetic */ ExecutorC0882 f3313;

    public C0881(ExecutorC0882 executorC0882, int i) {
        this.f3313 = executorC0882;
        setDaemon(true);
        setContextClassLoader(ExecutorC0882.class.getClassLoader());
        this.f3306 = new C3670();
        this.f3307 = new C2516();
        this.f3308 = 4;
        this.nextParkedWorker = ExecutorC0882.f3317;
        int iNanoTime = (int) System.nanoTime();
        this.f3311 = iNanoTime == 0 ? 42 : iNanoTime;
        m2400(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC0882.f3316.get(this.f3313) == 1 || this.f3308 == 5) {
                    break loop0;
                }
                AbstractRunnableC2898 abstractRunnableC2898M2395 = m2395(this.f3312);
                if (abstractRunnableC2898M2395 != null) {
                    this.f3310 = 0L;
                    ExecutorC0882 executorC0882 = this.f3313;
                    this.f3309 = 0L;
                    if (this.f3308 == 3) {
                        this.f3308 = 2;
                    }
                    if (!abstractRunnableC2898M2395.f9316) {
                        try {
                            abstractRunnableC2898M2395.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (m2402(2) && !executorC0882.m2408() && !executorC0882.m2407(ExecutorC0882.f3315.get(executorC0882))) {
                        executorC0882.m2408();
                    }
                    try {
                        abstractRunnableC2898M2395.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    ExecutorC0882.f3315.addAndGet(executorC0882, -2097152L);
                    if (this.f3308 == 5) {
                        break;
                    }
                    this.f3308 = 4;
                    break;
                }
                this.f3312 = false;
                if (this.f3310 == 0) {
                    Object obj = this.nextParkedWorker;
                    C1172 c1172 = ExecutorC0882.f3317;
                    if (obj != c1172) {
                        f3305.set(this, -1);
                        while (this.nextParkedWorker != ExecutorC0882.f3317) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3305;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            ExecutorC0882 executorC0883 = this.f3313;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0882.f3316;
                            if (atomicIntegerFieldUpdater2.get(executorC0883) == 1 || this.f3308 == 5) {
                                break;
                            }
                            m2402(3);
                            Thread.interrupted();
                            if (this.f3309 == 0) {
                                j = 2097151;
                                this.f3309 = System.nanoTime() + this.f3313.f3320;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.f3313.f3320);
                            if (System.nanoTime() - this.f3309 >= 0) {
                                this.f3309 = 0L;
                                ExecutorC0882 executorC0884 = this.f3313;
                                synchronized (executorC0884.f3324) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(executorC0884) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0882.f3315;
                                            if (((int) (atomicLongFieldUpdater.get(executorC0884) & 2097151L)) > executorC0884.f3318) {
                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    m2400(0);
                                                    executorC0884.m2406(this, i, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0884) & 2097151L);
                                                    if (andDecrement != i) {
                                                        C0881 c0881 = (C0881) executorC0884.f3324.m4582(andDecrement);
                                                        executorC0884.f3324.m4583(i, c0881);
                                                        c0881.m2400(i);
                                                        executorC0884.m2406(c0881, andDecrement, i);
                                                    }
                                                    executorC0884.f3324.m4583(andDecrement, null);
                                                    this.f3308 = 5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        ExecutorC0882 executorC0885 = this.f3313;
                        if (this.nextParkedWorker == c1172) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0882.f3314;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(executorC0885);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = executorC0885.f3324.m4582((int) (j2 & 2097151));
                                ExecutorC0882 executorC0886 = executorC0885;
                                if (ExecutorC0882.f3314.compareAndSet(executorC0886, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                    break;
                                } else {
                                    executorC0885 = executorC0886;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        m2402(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3310);
                        this.f3310 = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        m2402(5);
    }

    public final AbstractRunnableC2898 m2395(boolean z) {
        AbstractRunnableC2898 abstractRunnableC2898M2399;
        AbstractRunnableC2898 abstractRunnableC2898M23910;
        long j;
        int i = this.f3308;
        ExecutorC0882 executorC0882 = this.f3313;
        AbstractRunnableC2898 abstractRunnableC2898 = null;
        C3670 c3670 = this.f3306;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0882.f3315;
            do {
                j = atomicLongFieldUpdater.get(executorC0882);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3670.f11453;
                        AbstractRunnableC2898 abstractRunnableC2899 = (AbstractRunnableC2898) atomicReferenceFieldUpdater.get(c3670);
                        if (abstractRunnableC2899 == null || !abstractRunnableC2899.f9316) {
                            int i2 = C3670.f11455.get(c3670);
                            int i3 = C3670.f11454.get(c3670);
                            while (i2 != i3 && C3670.f11456.get(c3670) != 0) {
                                i3--;
                                AbstractRunnableC2898 abstractRunnableC2898M5304 = c3670.m5304(i3, true);
                                if (abstractRunnableC2898M5304 != null) {
                                    abstractRunnableC2898 = abstractRunnableC2898M5304;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c3670, abstractRunnableC2899, null)) {
                                abstractRunnableC2898 = abstractRunnableC2899;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c3670) == abstractRunnableC2899);
                    }
                    if (abstractRunnableC2898 != null) {
                        return abstractRunnableC2898;
                    }
                    AbstractRunnableC2898 abstractRunnableC28910 = (AbstractRunnableC2898) executorC0882.f3323.m3614();
                    return abstractRunnableC28910 == null ? m2403(1) : abstractRunnableC28910;
                }
            } while (!ExecutorC0882.f3315.compareAndSet(executorC0882, j, j - 4398046511104L));
            this.f3308 = 1;
        }
        if (z) {
            boolean z2 = m2398(executorC0882.f3318 * 2) == 0;
            if (z2 && (abstractRunnableC2898M23910 = m2399()) != null) {
                return abstractRunnableC2898M23910;
            }
            
            AbstractRunnableC2898 abstractRunnableC2898M5303 = (AbstractRunnableC2898) C3670.f11453.getAndSet(c3670, null);
            if (abstractRunnableC2898M5303 == null) {
                abstractRunnableC2898M5303 = c3670.m5303();
            }
            if (abstractRunnableC2898M5303 != null) {
                return abstractRunnableC2898M5303;
            }
            if (!z2 && (abstractRunnableC2898M2399 = m2399()) != null) {
                return abstractRunnableC2898M2399;
            }
        } else {
            AbstractRunnableC2898 abstractRunnableC2898M23911 = m2399();
            if (abstractRunnableC2898M23911 != null) {
                return abstractRunnableC2898M23911;
            }
        }
        return m2403(3);
    }

    public final int m2396() {
        return this.indexInArray;
    }

    public final Object m2397() {
        return this.nextParkedWorker;
    }

    public final int m2398(int i) {
        int i2 = this.f3311;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3311 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & 2147483647) % i;
    }

    public final AbstractRunnableC2898 m2399() {
        int iM2398 = m2398(2);
        ExecutorC0882 executorC0882 = this.f3313;
        if (iM2398 == 0) {
            AbstractRunnableC2898 abstractRunnableC2898 = (AbstractRunnableC2898) executorC0882.f3322.m3614();
            return abstractRunnableC2898 != null ? abstractRunnableC2898 : (AbstractRunnableC2898) executorC0882.f3323.m3614();
        }
        AbstractRunnableC2898 abstractRunnableC2899 = (AbstractRunnableC2898) executorC0882.f3323.m3614();
        return abstractRunnableC2899 != null ? abstractRunnableC2899 : (AbstractRunnableC2898) executorC0882.f3322.m3614();
    }

    public final void m2400(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3313.f3321);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void m2401(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean m2402(int i) {
        int i2 = this.f3308;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0882.f3315.addAndGet(this.f3313, 4398046511104L);
        }
        if (i2 != i) {
            this.f3308 = i;
        }
        return z;
    }

    public final AbstractRunnableC2898 m2403(int i) {
        long j;
        AbstractRunnableC2898 abstractRunnableC2898M5304;
        long j2;
        long j3;
        AbstractRunnableC2898 abstractRunnableC2898;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0882.f3315;
        ExecutorC0882 executorC0882 = this.f3313;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0882) & 2097151);
        AbstractRunnableC2898 abstractRunnableC2899 = null;
        if (i2 < 2) {
            return null;
        }
        int iM2398 = m2398(i2);
        int i3 = 0;
        long jMin = 9223372036854775807L;
        while (i3 < i2) {
            iM2398++;
            if (iM2398 > i2) {
                iM2398 = 1;
            }
            C0881 c0881 = (C0881) executorC0882.f3324.m4582(iM2398);
            if (c0881 != null && c0881 != this) {
                C3670 c3670 = c0881.f3306;
                if (i != 3) {
                    
                    int i4 = C3670.f11455.get(c3670);
                    int i5 = C3670.f11454.get(c3670);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || C3670.f11456.get(c3670) != 0) {
                                int i6 = i4 + 1;
                                abstractRunnableC2898M5304 = c3670.m5304(i4, z);
                                if (abstractRunnableC2898M5304 != null) {
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        abstractRunnableC2898M5304 = abstractRunnableC2899;
                        break;
                    }
                } else {
                    abstractRunnableC2898M5304 = c3670.m5303();
                    j = 0;
                }
                C2516 c2516 = this.f3307;
                if (abstractRunnableC2898M5304 == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3670.f11453;
                        AbstractRunnableC2898 abstractRunnableC28910 = (AbstractRunnableC2898) atomicReferenceFieldUpdater.get(c3670);
                        if (abstractRunnableC28910 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((abstractRunnableC28910.f9316 ? 1 : 2) & i) != 0) {
                                
                                C3670 c3671 = c3670;
                                long jNanoTime = System.nanoTime() - abstractRunnableC28910.f9315;
                                long j4 = AbstractC2900.f9319;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    abstractRunnableC2898 = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC2898 = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c3671, abstractRunnableC28910, null)) {
                                        c2516.f8043 = abstractRunnableC28910;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c3671) == abstractRunnableC28910);
                                c3670 = c3671;
                                abstractRunnableC2899 = null;
                            }
                        }
                        j3 = -2;
                        abstractRunnableC2898 = abstractRunnableC2899;
                        break;
                    }
                } else {
                    c2516.f8043 = abstractRunnableC2898M5304;
                    abstractRunnableC2898 = abstractRunnableC2899;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == -1L) {
                    AbstractRunnableC2898 abstractRunnableC28911 = (AbstractRunnableC2898) c2516.f8043;
                    c2516.f8043 = abstractRunnableC2898;
                    return abstractRunnableC28911;
                }
                if (j3 > 0L) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            abstractRunnableC2899 = null;
        }
        if (jMin == 9223372036854775807L) {
            jMin = 0;
        }
        this.f3310 = jMin;
        return null;
    }
}
