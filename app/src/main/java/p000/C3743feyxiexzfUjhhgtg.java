package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3743feyxiexzfUjhhgtg extends Thread {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11802Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C3743feyxiexzfUjhhgtg.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2259feyxiexzfUjhhgtg f11803Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0976feyxiexzfUjhhgtg f11804Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f11805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public long f11806Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public long f11807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f11808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f11809Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC3744feyxiexzfUjhhgtg f11810Ujhhgtgfeyxiexzf;

    public C3743feyxiexzfUjhhgtg(ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg, int i) {
        this.f11810Ujhhgtgfeyxiexzf = executorC3744feyxiexzfUjhhgtg;
        setDaemon(true);
        setContextClassLoader(ExecutorC3744feyxiexzfUjhhgtg.class.getClassLoader());
        this.f11803Ujhhgtgfeyxiexzf = new C2259feyxiexzfUjhhgtg();
        this.f11804Ujhhgtgfeyxiexzf = new C0976feyxiexzfUjhhgtg();
        this.f11805Ujhhgtgfeyxiexzf = 4;
        this.nextParkedWorker = ExecutorC3744feyxiexzfUjhhgtg.f11814Ujhhgtgfeyxiexzf;
        int iNanoTime = (int) System.nanoTime();
        this.f11808Ujhhgtgfeyxiexzf = iNanoTime == 0 ? 42 : iNanoTime;
        m5398Ujhhgtgfeyxiexzf(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC3744feyxiexzfUjhhgtg.f11813Ujhhgtgfeyxiexzf.get(this.f11810Ujhhgtgfeyxiexzf) == 1 || this.f11805Ujhhgtgfeyxiexzf == 5) {
                    break loop0;
                }
                AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf = m5393Ujhhgtgfeyxiexzf(this.f11809Ujhhgtgfeyxiexzf);
                if (abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf != null) {
                    this.f11807Ujhhgtgfeyxiexzf = 0L;
                    ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg = this.f11810Ujhhgtgfeyxiexzf;
                    this.f11806Ujhhgtgfeyxiexzf = 0L;
                    if (this.f11805Ujhhgtgfeyxiexzf == 3) {
                        this.f11805Ujhhgtgfeyxiexzf = 2;
                    }
                    if (!abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf) {
                        try {
                            abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (m5400Ujhhgtgfeyxiexzf(2) && !executorC3744feyxiexzfUjhhgtg.m5406Ujhhgtgfeyxiexzf() && !executorC3744feyxiexzfUjhhgtg.m5405Ujhhgtgfeyxiexzf(ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf.get(executorC3744feyxiexzfUjhhgtg))) {
                        executorC3744feyxiexzfUjhhgtg.m5406Ujhhgtgfeyxiexzf();
                    }
                    try {
                        abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf.addAndGet(executorC3744feyxiexzfUjhhgtg, -2097152L);
                    if (this.f11805Ujhhgtgfeyxiexzf == 5) {
                        break;
                    }
                    this.f11805Ujhhgtgfeyxiexzf = 4;
                    break;
                }
                this.f11809Ujhhgtgfeyxiexzf = false;
                if (this.f11807Ujhhgtgfeyxiexzf == 0) {
                    Object obj = this.nextParkedWorker;
                    C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf = ExecutorC3744feyxiexzfUjhhgtg.f11814Ujhhgtgfeyxiexzf;
                    if (obj != c3290Ujhhgtgfeyxiexzf) {
                        f11802Ujhhgtgfeyxiexzf.set(this, -1);
                        while (this.nextParkedWorker != ExecutorC3744feyxiexzfUjhhgtg.f11814Ujhhgtgfeyxiexzf) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11802Ujhhgtgfeyxiexzf;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg2 = this.f11810Ujhhgtgfeyxiexzf;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC3744feyxiexzfUjhhgtg.f11813Ujhhgtgfeyxiexzf;
                            if (atomicIntegerFieldUpdater2.get(executorC3744feyxiexzfUjhhgtg2) == 1 || this.f11805Ujhhgtgfeyxiexzf == 5) {
                                break;
                            }
                            m5400Ujhhgtgfeyxiexzf(3);
                            Thread.interrupted();
                            if (this.f11806Ujhhgtgfeyxiexzf == 0) {
                                j = 2097151;
                                this.f11806Ujhhgtgfeyxiexzf = System.nanoTime() + this.f11810Ujhhgtgfeyxiexzf.f11817Ujhhgtgfeyxiexzf;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.f11810Ujhhgtgfeyxiexzf.f11817Ujhhgtgfeyxiexzf);
                            if (System.nanoTime() - this.f11806Ujhhgtgfeyxiexzf >= 0) {
                                this.f11806Ujhhgtgfeyxiexzf = 0L;
                                ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg3 = this.f11810Ujhhgtgfeyxiexzf;
                                synchronized (executorC3744feyxiexzfUjhhgtg3.f11821Ujhhgtgfeyxiexzf) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(executorC3744feyxiexzfUjhhgtg3) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf;
                                            if (((int) (atomicLongFieldUpdater.get(executorC3744feyxiexzfUjhhgtg3) & j)) > executorC3744feyxiexzfUjhhgtg3.f11815Ujhhgtgfeyxiexzf && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m5398Ujhhgtgfeyxiexzf(0);
                                                executorC3744feyxiexzfUjhhgtg3.m5404Ujhhgtgfeyxiexzf(this, i, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC3744feyxiexzfUjhhgtg3) & j);
                                                if (andDecrement != i) {
                                                    C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = (C3743feyxiexzfUjhhgtg) executorC3744feyxiexzfUjhhgtg3.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf(andDecrement);
                                                    executorC3744feyxiexzfUjhhgtg3.f11821Ujhhgtgfeyxiexzf.m2380Ujhhgtgfeyxiexzf(i, c3743feyxiexzfUjhhgtg);
                                                    c3743feyxiexzfUjhhgtg.m5398Ujhhgtgfeyxiexzf(i);
                                                    executorC3744feyxiexzfUjhhgtg3.m5404Ujhhgtgfeyxiexzf(c3743feyxiexzfUjhhgtg, andDecrement, i);
                                                }
                                                executorC3744feyxiexzfUjhhgtg3.f11821Ujhhgtgfeyxiexzf.m2380Ujhhgtgfeyxiexzf(andDecrement, null);
                                                this.f11805Ujhhgtgfeyxiexzf = 5;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg4 = this.f11810Ujhhgtgfeyxiexzf;
                        if (this.nextParkedWorker == c3290Ujhhgtgfeyxiexzf) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC3744feyxiexzfUjhhgtg.f11811Ujhhgtgfeyxiexzf;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(executorC3744feyxiexzfUjhhgtg4);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = executorC3744feyxiexzfUjhhgtg4.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf((int) (j2 & 2097151));
                                ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg5 = executorC3744feyxiexzfUjhhgtg4;
                                if (ExecutorC3744feyxiexzfUjhhgtg.f11811Ujhhgtgfeyxiexzf.compareAndSet(executorC3744feyxiexzfUjhhgtg5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                    break;
                                } else {
                                    executorC3744feyxiexzfUjhhgtg4 = executorC3744feyxiexzfUjhhgtg5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        m5400Ujhhgtgfeyxiexzf(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f11807Ujhhgtgfeyxiexzf);
                        this.f11807Ujhhgtgfeyxiexzf = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        m5400Ujhhgtgfeyxiexzf(5);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractRunnableC1963Ujhhgtgfeyxiexzf m5393Ujhhgtgfeyxiexzf(boolean z) {
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf2;
        long j;
        int i = this.f11805Ujhhgtgfeyxiexzf;
        ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg = this.f11810Ujhhgtgfeyxiexzf;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf = null;
        C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg = this.f11803Ujhhgtgfeyxiexzf;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf;
            do {
                j = atomicLongFieldUpdater.get(executorC3744feyxiexzfUjhhgtg);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c2259feyxiexzfUjhhgtg.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf;
                        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf2 = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(c2259feyxiexzfUjhhgtg);
                        if (abstractRunnableC1963Ujhhgtgfeyxiexzf2 == null || !abstractRunnableC1963Ujhhgtgfeyxiexzf2.f6439Ujhhgtgfeyxiexzf) {
                            int i2 = C2259feyxiexzfUjhhgtg.f7340Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg);
                            int i3 = C2259feyxiexzfUjhhgtg.f7339Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg);
                            while (i2 != i3 && C2259feyxiexzfUjhhgtg.f7341Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) != 0) {
                                i3--;
                                AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf = c2259feyxiexzfUjhhgtg.m3456Ujhhgtgfeyxiexzf(i3, true);
                                if (abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf != null) {
                                    abstractRunnableC1963Ujhhgtgfeyxiexzf = abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c2259feyxiexzfUjhhgtg, abstractRunnableC1963Ujhhgtgfeyxiexzf2, null)) {
                                abstractRunnableC1963Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c2259feyxiexzfUjhhgtg) == abstractRunnableC1963Ujhhgtgfeyxiexzf2);
                    }
                    if (abstractRunnableC1963Ujhhgtgfeyxiexzf != null) {
                        return abstractRunnableC1963Ujhhgtgfeyxiexzf;
                    }
                    AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf3 = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) executorC3744feyxiexzfUjhhgtg.f11820Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
                    return abstractRunnableC1963Ujhhgtgfeyxiexzf3 == null ? m5401Ujhhgtgfeyxiexzf(1) : abstractRunnableC1963Ujhhgtgfeyxiexzf3;
                }
            } while (!ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf.compareAndSet(executorC3744feyxiexzfUjhhgtg, j, j - 4398046511104L));
            this.f11805Ujhhgtgfeyxiexzf = 1;
        }
        if (z) {
            boolean z2 = m5396Ujhhgtgfeyxiexzf(executorC3744feyxiexzfUjhhgtg.f11815Ujhhgtgfeyxiexzf * 2) == 0;
            if (z2 && (abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf2 = m5397Ujhhgtgfeyxiexzf()) != null) {
                return abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf2;
            }
            c2259feyxiexzfUjhhgtg.getClass();
            AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf.getAndSet(c2259feyxiexzfUjhhgtg, null);
            if (abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf == null) {
                abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = c2259feyxiexzfUjhhgtg.m3455Ujhhgtgfeyxiexzf();
            }
            if (abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf != null) {
                return abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf;
            }
            if (!z2 && (abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf = m5397Ujhhgtgfeyxiexzf()) != null) {
                return abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf;
            }
        } else {
            AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf3 = m5397Ujhhgtgfeyxiexzf();
            if (abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf3 != null) {
                return abstractRunnableC1963UjhhgtgfeyxiexzfM5397Ujhhgtgfeyxiexzf3;
            }
        }
        return m5401Ujhhgtgfeyxiexzf(3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m5394Ujhhgtgfeyxiexzf() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object m5395Ujhhgtgfeyxiexzf() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m5396Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f11808Ujhhgtgfeyxiexzf;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f11808Ujhhgtgfeyxiexzf = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractRunnableC1963Ujhhgtgfeyxiexzf m5397Ujhhgtgfeyxiexzf() {
        int iM5396Ujhhgtgfeyxiexzf = m5396Ujhhgtgfeyxiexzf(2);
        ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg = this.f11810Ujhhgtgfeyxiexzf;
        if (iM5396Ujhhgtgfeyxiexzf == 0) {
            AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) executorC3744feyxiexzfUjhhgtg.f11819Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
            return abstractRunnableC1963Ujhhgtgfeyxiexzf != null ? abstractRunnableC1963Ujhhgtgfeyxiexzf : (AbstractRunnableC1963Ujhhgtgfeyxiexzf) executorC3744feyxiexzfUjhhgtg.f11820Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
        }
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf2 = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) executorC3744feyxiexzfUjhhgtg.f11820Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
        return abstractRunnableC1963Ujhhgtgfeyxiexzf2 != null ? abstractRunnableC1963Ujhhgtgfeyxiexzf2 : (AbstractRunnableC1963Ujhhgtgfeyxiexzf) executorC3744feyxiexzfUjhhgtg.f11819Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m5398Ujhhgtgfeyxiexzf(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11810Ujhhgtgfeyxiexzf.f11818Ujhhgtgfeyxiexzf);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m5399Ujhhgtgfeyxiexzf(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m5400Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f11805Ujhhgtgfeyxiexzf;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf.addAndGet(this.f11810Ujhhgtgfeyxiexzf, 4398046511104L);
        }
        if (i2 != i) {
            this.f11805Ujhhgtgfeyxiexzf = i;
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final AbstractRunnableC1963Ujhhgtgfeyxiexzf m5401Ujhhgtgfeyxiexzf(int i) {
        long j;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf;
        long j2;
        long j3;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3744feyxiexzfUjhhgtg.f11812Ujhhgtgfeyxiexzf;
        ExecutorC3744feyxiexzfUjhhgtg executorC3744feyxiexzfUjhhgtg = this.f11810Ujhhgtgfeyxiexzf;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC3744feyxiexzfUjhhgtg) & 2097151);
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf2 = null;
        if (i2 < 2) {
            return null;
        }
        int iM5396Ujhhgtgfeyxiexzf = m5396Ujhhgtgfeyxiexzf(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iM5396Ujhhgtgfeyxiexzf++;
            if (iM5396Ujhhgtgfeyxiexzf > i2) {
                iM5396Ujhhgtgfeyxiexzf = 1;
            }
            C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = (C3743feyxiexzfUjhhgtg) executorC3744feyxiexzfUjhhgtg.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf(iM5396Ujhhgtgfeyxiexzf);
            if (c3743feyxiexzfUjhhgtg != null && c3743feyxiexzfUjhhgtg != this) {
                C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg = c3743feyxiexzfUjhhgtg.f11803Ujhhgtgfeyxiexzf;
                c2259feyxiexzfUjhhgtg.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = C2259feyxiexzfUjhhgtg.f7340Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg);
                    int i5 = C2259feyxiexzfUjhhgtg.f7339Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg);
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || C2259feyxiexzfUjhhgtg.f7341Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) != 0) {
                                int i6 = i4 + 1;
                                AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf = c2259feyxiexzfUjhhgtg.m3456Ujhhgtgfeyxiexzf(i4, z);
                                if (abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf != null) {
                                    abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = abstractRunnableC1963UjhhgtgfeyxiexzfM3456Ujhhgtgfeyxiexzf;
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf2;
                        break;
                    }
                } else {
                    abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = c2259feyxiexzfUjhhgtg.m3455Ujhhgtgfeyxiexzf();
                    j = 0;
                }
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg = this.f11804Ujhhgtgfeyxiexzf;
                if (abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf;
                        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf3 = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) atomicReferenceFieldUpdater.get(c2259feyxiexzfUjhhgtg);
                        if (abstractRunnableC1963Ujhhgtgfeyxiexzf3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((abstractRunnableC1963Ujhhgtgfeyxiexzf3.f6439Ujhhgtgfeyxiexzf ? 1 : 2) & i) != 0) {
                                AbstractC1965Ujhhgtgfeyxiexzf.f6446Ujhhgtgfeyxiexzf.getClass();
                                C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg2 = c2259feyxiexzfUjhhgtg;
                                long jNanoTime = System.nanoTime() - abstractRunnableC1963Ujhhgtgfeyxiexzf3.f6438Ujhhgtgfeyxiexzf;
                                long j4 = AbstractC1965Ujhhgtgfeyxiexzf.f6442Ujhhgtgfeyxiexzf;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    abstractRunnableC1963Ujhhgtgfeyxiexzf = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC1963Ujhhgtgfeyxiexzf = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c2259feyxiexzfUjhhgtg2, abstractRunnableC1963Ujhhgtgfeyxiexzf3, null)) {
                                        c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf3;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c2259feyxiexzfUjhhgtg2) == abstractRunnableC1963Ujhhgtgfeyxiexzf3);
                                c2259feyxiexzfUjhhgtg = c2259feyxiexzfUjhhgtg2;
                                abstractRunnableC1963Ujhhgtgfeyxiexzf2 = null;
                            }
                        }
                        j3 = -2;
                        abstractRunnableC1963Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf2;
                        break;
                    }
                } else {
                    c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf = abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf;
                    abstractRunnableC1963Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf4 = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                    c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf = abstractRunnableC1963Ujhhgtgfeyxiexzf;
                    return abstractRunnableC1963Ujhhgtgfeyxiexzf4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            abstractRunnableC1963Ujhhgtgfeyxiexzf2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f11807Ujhhgtgfeyxiexzf = jMin;
        return null;
    }
}
