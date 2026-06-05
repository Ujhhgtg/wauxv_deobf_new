package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴ能不能ᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3128Ujhhgtgfeyxiexzf extends AbstractC3351Ujhhgtgfeyxiexzf implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final RunnableC3128Ujhhgtgfeyxiexzf f9719Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final long f9720Ujhhgtgfeyxiexzf;

    static {
        Long l;
        RunnableC3128Ujhhgtgfeyxiexzf runnableC3128Ujhhgtgfeyxiexzf = new RunnableC3128Ujhhgtgfeyxiexzf();
        f9719Ujhhgtgfeyxiexzf = runnableC3128Ujhhgtgfeyxiexzf;
        runnableC3128Ujhhgtgfeyxiexzf.m4865feyxiexzfUjhhgtg(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f9720Ujhhgtgfeyxiexzf = timeUnit.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1990feyxiexzfUjhhgtg.f6559Ujhhgtgfeyxiexzf.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m4654Ujhhgtgfeyxiexzf();
                    if (m4855feyxiexzfUjhhgtg()) {
                        return;
                    }
                    mo3793feyxiexzfUjhhgtg();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM4856feyxiexzfUjhhgtg = m4856feyxiexzfUjhhgtg();
                    if (jM4856feyxiexzfUjhhgtg == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f9720Ujhhgtgfeyxiexzf + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m4654Ujhhgtgfeyxiexzf();
                            if (m4855feyxiexzfUjhhgtg()) {
                                return;
                            }
                            mo3793feyxiexzfUjhhgtg();
                            return;
                        }
                        if (jM4856feyxiexzfUjhhgtg > j2) {
                            jM4856feyxiexzfUjhhgtg = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM4856feyxiexzfUjhhgtg > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m4654Ujhhgtgfeyxiexzf();
                            if (m4855feyxiexzfUjhhgtg()) {
                                return;
                            }
                            mo3793feyxiexzfUjhhgtg();
                            return;
                        }
                        LockSupport.parkNanos(this, jM4856feyxiexzfUjhhgtg);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m4654Ujhhgtgfeyxiexzf();
            if (!m4855feyxiexzfUjhhgtg()) {
                mo3793feyxiexzfUjhhgtg();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC3351Ujhhgtgfeyxiexzf, p000.AbstractC3359feyxiexzfUjhhgtg
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC3359feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final Thread mo3793feyxiexzfUjhhgtg() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC3128Ujhhgtgfeyxiexzf.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.AbstractC3359feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo4652feyxiexzfUjhhgtg(long j, AbstractRunnableC3349Ujhhgtgfeyxiexzf abstractRunnableC3349Ujhhgtgfeyxiexzf) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC3351Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void mo4653feyxiexzfUjhhgtg(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo4653feyxiexzfUjhhgtg(runnable);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final synchronized void m4654Ujhhgtgfeyxiexzf() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC3351Ujhhgtgfeyxiexzf.f10465Ujhhgtgfeyxiexzf.set(this, null);
            AbstractC3351Ujhhgtgfeyxiexzf.f10466Ujhhgtgfeyxiexzf.set(this, null);
            notifyAll();
        }
    }
}
