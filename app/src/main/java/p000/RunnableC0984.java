package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0984 extends AbstractC1234 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    public static final RunnableC0984 f3601;

    public static final long f3602;

    static {
        Long l;
        RunnableC0984 runnableC0984 = new RunnableC0984();
        f3601 = runnableC0984;
        runnableC0984.m2874(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f3602 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2920.f9375.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m2551();
                    if (m2870()) {
                        return;
                    }
                    mo1638();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = 9223372036854775807L;
                while (true) {
                    Thread.interrupted();
                    long jM2871 = m2871();
                    if (jM2871 == 9223372036854775807L) {
                        long jNanoTime = System.nanoTime();
                        if (j == 9223372036854775807L) {
                            j = f3602 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2551();
                            if (m2870()) {
                                return;
                            }
                            mo1638();
                            return;
                        }
                        if (9223372036854775807L > j2) {
                            jM2871 = j2;
                        }
                    } else {
                        j = 9223372036854775807L;
                    }
                    if (jM2871 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2551();
                            if (m2870()) {
                                return;
                            }
                            mo1638();
                            return;
                        }
                        LockSupport.parkNanos(this, jM2871);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m2551();
            if (!m2870()) {
                mo1638();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC1234, p000.AbstractC1235
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC0878
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC1235
    public final Thread mo1638() {
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
                thread.setContextClassLoader(RunnableC0984.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.AbstractC1235
    public final void mo2549(long j, AbstractRunnableC1232 abstractRunnableC1232) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC1234
    public final void mo2550(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2550(runnable);
    }

    public final synchronized void m2551() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1234.f4460.set(this, null);
            AbstractC1234.f4461.set(this, null);
            notifyAll();
        }
    }
}
