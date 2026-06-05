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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3744feyxiexzfUjhhgtg implements Executor, Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f11811Ujhhgtgfeyxiexzf = AtomicLongFieldUpdater.newUpdater(ExecutorC3744feyxiexzfUjhhgtg.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f11812Ujhhgtgfeyxiexzf = AtomicLongFieldUpdater.newUpdater(ExecutorC3744feyxiexzfUjhhgtg.class, "controlState$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11813Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3744feyxiexzfUjhhgtg.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f11814Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f11815Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f11816Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final long f11817Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f11818Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C3605Ujhhgtgfeyxiexzf f11819Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C3605Ujhhgtgfeyxiexzf f11820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0904feyxiexzfUjhhgtg f11821Ujhhgtgfeyxiexzf;

    public ExecutorC3744feyxiexzfUjhhgtg(int i, int i2, long j, String str) {
        this.f11815Ujhhgtgfeyxiexzf = i;
        this.f11816Ujhhgtgfeyxiexzf = i2;
        this.f11817Ujhhgtgfeyxiexzf = j;
        this.f11818Ujhhgtgfeyxiexzf = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i2, "Max pool size ", " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f11819Ujhhgtgfeyxiexzf = new C3605Ujhhgtgfeyxiexzf();
        this.f11820Ujhhgtgfeyxiexzf = new C3605Ujhhgtgfeyxiexzf();
        this.f11821Ujhhgtgfeyxiexzf = new C0904feyxiexzfUjhhgtg((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf;
        if (f11813Ujhhgtgfeyxiexzf.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = threadCurrentThread instanceof C3743feyxiexzfUjhhgtg ? (C3743feyxiexzfUjhhgtg) threadCurrentThread : null;
            if (c3743feyxiexzfUjhhgtg == null || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c3743feyxiexzfUjhhgtg.f11810Ujhhgtgfeyxiexzf, this)) {
                c3743feyxiexzfUjhhgtg = null;
            }
            synchronized (this.f11821Ujhhgtgfeyxiexzf) {
                i = (int) (f11812Ujhhgtgfeyxiexzf.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg2 = (C3743feyxiexzfUjhhgtg) this.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf(i2);
                    if (c3743feyxiexzfUjhhgtg2 != c3743feyxiexzfUjhhgtg) {
                        while (c3743feyxiexzfUjhhgtg2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c3743feyxiexzfUjhhgtg2);
                            c3743feyxiexzfUjhhgtg2.join(10000L);
                        }
                        C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg = c3743feyxiexzfUjhhgtg2.f11803Ujhhgtgfeyxiexzf;
                        C3605Ujhhgtgfeyxiexzf c3605Ujhhgtgfeyxiexzf = this.f11820Ujhhgtgfeyxiexzf;
                        c2259feyxiexzfUjhhgtg.getClass();
                        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf.getAndSet(c2259feyxiexzfUjhhgtg, null);
                        if (abstractRunnableC1963Ujhhgtgfeyxiexzf != null) {
                            c3605Ujhhgtgfeyxiexzf.m1489Ujhhgtgfeyxiexzf(abstractRunnableC1963Ujhhgtgfeyxiexzf);
                        }
                        while (true) {
                            AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf = c2259feyxiexzfUjhhgtg.m3455Ujhhgtgfeyxiexzf();
                            if (abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf == null) {
                                break;
                            } else {
                                c3605Ujhhgtgfeyxiexzf.m1489Ujhhgtgfeyxiexzf(abstractRunnableC1963UjhhgtgfeyxiexzfM3455Ujhhgtgfeyxiexzf);
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
            this.f11820Ujhhgtgfeyxiexzf.m1490Ujhhgtgfeyxiexzf();
            this.f11819Ujhhgtgfeyxiexzf.m1490Ujhhgtgfeyxiexzf();
            while (true) {
                if (c3743feyxiexzfUjhhgtg != null) {
                    abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg.m5393Ujhhgtgfeyxiexzf(true);
                    if (abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf == null) {
                        abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) this.f11819Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
                        if (abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) this.f11819Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
                    if (abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf == null && (abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) this.f11820Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC1963UjhhgtgfeyxiexzfM5393Ujhhgtgfeyxiexzf.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c3743feyxiexzfUjhhgtg != null) {
                c3743feyxiexzfUjhhgtg.m5400Ujhhgtgfeyxiexzf(5);
            }
            f11811Ujhhgtgfeyxiexzf.set(this, 0L);
            f11812Ujhhgtgfeyxiexzf.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m5403Ujhhgtgfeyxiexzf(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C0904feyxiexzfUjhhgtg c0904feyxiexzfUjhhgtg = this.f11821Ujhhgtgfeyxiexzf;
        int iM2378Ujhhgtgfeyxiexzf = c0904feyxiexzfUjhhgtg.m2378Ujhhgtgfeyxiexzf();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM2378Ujhhgtgfeyxiexzf; i6++) {
            C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = (C3743feyxiexzfUjhhgtg) c0904feyxiexzfUjhhgtg.m2379Ujhhgtgfeyxiexzf(i6);
            if (c3743feyxiexzfUjhhgtg != null) {
                C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg = c3743feyxiexzfUjhhgtg.f11803Ujhhgtgfeyxiexzf;
                c2259feyxiexzfUjhhgtg.getClass();
                int i7 = C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) != null ? (C2259feyxiexzfUjhhgtg.f7339Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) - C2259feyxiexzfUjhhgtg.f7340Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg)) + 1 : C2259feyxiexzfUjhhgtg.f7339Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) - C2259feyxiexzfUjhhgtg.f7340Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg);
                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(c3743feyxiexzfUjhhgtg.f11805Ujhhgtgfeyxiexzf);
                if (iM2713feyxiexzfUjhhgtg == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM2713feyxiexzfUjhhgtg == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM2713feyxiexzfUjhhgtg == 2) {
                    i3++;
                } else if (iM2713feyxiexzfUjhhgtg == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM2713feyxiexzfUjhhgtg != 4) {
                        throw new C2870Ujhhgtgfeyxiexzf();
                    }
                    i5++;
                }
            }
        }
        long j = f11812Ujhhgtgfeyxiexzf.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f11818Ujhhgtgfeyxiexzf);
        sb4.append('@');
        sb4.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f11815Ujhhgtgfeyxiexzf;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f11816Ujhhgtgfeyxiexzf);
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
        sb4.append(this.f11819Ujhhgtgfeyxiexzf.m1491Ujhhgtgfeyxiexzf());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f11820Ujhhgtgfeyxiexzf.m1491Ujhhgtgfeyxiexzf());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m5402Ujhhgtgfeyxiexzf() {
        synchronized (this.f11821Ujhhgtgfeyxiexzf) {
            try {
                if (f11813Ujhhgtgfeyxiexzf.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f11812Ujhhgtgfeyxiexzf;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f11815Ujhhgtgfeyxiexzf) {
                    return 0;
                }
                if (i >= this.f11816Ujhhgtgfeyxiexzf) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = new C3743feyxiexzfUjhhgtg(this, i3);
                this.f11821Ujhhgtgfeyxiexzf.m2380Ujhhgtgfeyxiexzf(i3, c3743feyxiexzfUjhhgtg);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c3743feyxiexzfUjhhgtg.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m5403Ujhhgtgfeyxiexzf(Runnable runnable, boolean z) {
        AbstractRunnableC1963Ujhhgtgfeyxiexzf c1962Ujhhgtgfeyxiexzf;
        int i;
        AbstractC1965Ujhhgtgfeyxiexzf.f6446Ujhhgtgfeyxiexzf.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC1963Ujhhgtgfeyxiexzf) {
            c1962Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) runnable;
            c1962Ujhhgtgfeyxiexzf.f6438Ujhhgtgfeyxiexzf = jNanoTime;
            c1962Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf = z;
        } else {
            c1962Ujhhgtgfeyxiexzf = new C1962Ujhhgtgfeyxiexzf(runnable, jNanoTime, z);
        }
        boolean z2 = c1962Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11812Ujhhgtgfeyxiexzf;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = threadCurrentThread instanceof C3743feyxiexzfUjhhgtg ? (C3743feyxiexzfUjhhgtg) threadCurrentThread : null;
        if (c3743feyxiexzfUjhhgtg == null || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c3743feyxiexzfUjhhgtg.f11810Ujhhgtgfeyxiexzf, this)) {
            c3743feyxiexzfUjhhgtg = null;
        }
        if (c3743feyxiexzfUjhhgtg != null && (i = c3743feyxiexzfUjhhgtg.f11805Ujhhgtgfeyxiexzf) != 5 && (c1962Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf || i != 2)) {
            c3743feyxiexzfUjhhgtg.f11809Ujhhgtgfeyxiexzf = true;
            C2259feyxiexzfUjhhgtg c2259feyxiexzfUjhhgtg = c3743feyxiexzfUjhhgtg.f11803Ujhhgtgfeyxiexzf;
            c2259feyxiexzfUjhhgtg.getClass();
            c1962Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) C2259feyxiexzfUjhhgtg.f7338Ujhhgtgfeyxiexzf.getAndSet(c2259feyxiexzfUjhhgtg, c1962Ujhhgtgfeyxiexzf);
            if (c1962Ujhhgtgfeyxiexzf == null) {
                c1962Ujhhgtgfeyxiexzf = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c2259feyxiexzfUjhhgtg.f7342Ujhhgtgfeyxiexzf;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2259feyxiexzfUjhhgtg.f7339Ujhhgtgfeyxiexzf;
                if (atomicIntegerFieldUpdater.get(c2259feyxiexzfUjhhgtg) - C2259feyxiexzfUjhhgtg.f7340Ujhhgtgfeyxiexzf.get(c2259feyxiexzfUjhhgtg) != 127) {
                    if (c1962Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf) {
                        C2259feyxiexzfUjhhgtg.f7341Ujhhgtgfeyxiexzf.incrementAndGet(c2259feyxiexzfUjhhgtg);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(c2259feyxiexzfUjhhgtg) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, c1962Ujhhgtgfeyxiexzf);
                    atomicIntegerFieldUpdater.incrementAndGet(c2259feyxiexzfUjhhgtg);
                    c1962Ujhhgtgfeyxiexzf = null;
                }
            }
        }
        if (c1962Ujhhgtgfeyxiexzf != null) {
            if (!(c1962Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf ? this.f11820Ujhhgtgfeyxiexzf.m1489Ujhhgtgfeyxiexzf(c1962Ujhhgtgfeyxiexzf) : this.f11819Ujhhgtgfeyxiexzf.m1489Ujhhgtgfeyxiexzf(c1962Ujhhgtgfeyxiexzf))) {
                throw new RejectedExecutionException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.f11818Ujhhgtgfeyxiexzf, " was terminated"));
            }
        }
        if (z2) {
            if (m5406Ujhhgtgfeyxiexzf() || m5405Ujhhgtgfeyxiexzf(jAddAndGet)) {
                return;
            }
            m5406Ujhhgtgfeyxiexzf();
            return;
        }
        if (m5406Ujhhgtgfeyxiexzf() || m5405Ujhhgtgfeyxiexzf(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m5406Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m5404Ujhhgtgfeyxiexzf(C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg, int i, int i2) {
        while (true) {
            long j = f11811Ujhhgtgfeyxiexzf.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM5395Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg.m5395Ujhhgtgfeyxiexzf();
                    while (true) {
                        if (objM5395Ujhhgtgfeyxiexzf == f11814Ujhhgtgfeyxiexzf) {
                            i3 = -1;
                            break;
                        }
                        if (objM5395Ujhhgtgfeyxiexzf == null) {
                            i3 = 0;
                            break;
                        }
                        C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg2 = (C3743feyxiexzfUjhhgtg) objM5395Ujhhgtgfeyxiexzf;
                        int iM5394Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg2.m5394Ujhhgtgfeyxiexzf();
                        if (iM5394Ujhhgtgfeyxiexzf != 0) {
                            i3 = iM5394Ujhhgtgfeyxiexzf;
                            break;
                        }
                        objM5395Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg2.m5395Ujhhgtgfeyxiexzf();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f11811Ujhhgtgfeyxiexzf.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean m5405Ujhhgtgfeyxiexzf(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f11815Ujhhgtgfeyxiexzf;
        if (i < i2) {
            int iM5402Ujhhgtgfeyxiexzf = m5402Ujhhgtgfeyxiexzf();
            if (iM5402Ujhhgtgfeyxiexzf == 1 && i2 > 1) {
                m5402Ujhhgtgfeyxiexzf();
            }
            if (iM5402Ujhhgtgfeyxiexzf > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m5406Ujhhgtgfeyxiexzf() {
        C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf;
        int iM5394Ujhhgtgfeyxiexzf;
        while (true) {
            long j = f11811Ujhhgtgfeyxiexzf.get(this);
            C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg = (C3743feyxiexzfUjhhgtg) this.f11821Ujhhgtgfeyxiexzf.m2379Ujhhgtgfeyxiexzf((int) (2097151 & j));
            if (c3743feyxiexzfUjhhgtg == null) {
                c3743feyxiexzfUjhhgtg = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM5395Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg.m5395Ujhhgtgfeyxiexzf();
                while (true) {
                    c3290Ujhhgtgfeyxiexzf = f11814Ujhhgtgfeyxiexzf;
                    if (objM5395Ujhhgtgfeyxiexzf == c3290Ujhhgtgfeyxiexzf) {
                        iM5394Ujhhgtgfeyxiexzf = -1;
                        break;
                    }
                    if (objM5395Ujhhgtgfeyxiexzf == null) {
                        iM5394Ujhhgtgfeyxiexzf = 0;
                        break;
                    }
                    C3743feyxiexzfUjhhgtg c3743feyxiexzfUjhhgtg2 = (C3743feyxiexzfUjhhgtg) objM5395Ujhhgtgfeyxiexzf;
                    iM5394Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg2.m5394Ujhhgtgfeyxiexzf();
                    if (iM5394Ujhhgtgfeyxiexzf != 0) {
                        break;
                    }
                    objM5395Ujhhgtgfeyxiexzf = c3743feyxiexzfUjhhgtg2.m5395Ujhhgtgfeyxiexzf();
                }
                if (iM5394Ujhhgtgfeyxiexzf >= 0) {
                    if (f11811Ujhhgtgfeyxiexzf.compareAndSet(this, j, ((long) iM5394Ujhhgtgfeyxiexzf) | j2)) {
                        c3743feyxiexzfUjhhgtg.m5399Ujhhgtgfeyxiexzf(c3290Ujhhgtgfeyxiexzf);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c3743feyxiexzfUjhhgtg == null) {
                return false;
            }
            if (C3743feyxiexzfUjhhgtg.f11802Ujhhgtgfeyxiexzf.compareAndSet(c3743feyxiexzfUjhhgtg, -1, 0)) {
                LockSupport.unpark(c3743feyxiexzfUjhhgtg);
                return true;
            }
        }
    }
}
