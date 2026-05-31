package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0988 extends AbstractC1236 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final RunnableC0988 f3617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final long f3618;

    static {
        Long l;
        RunnableC0988 runnableC0988 = new RunnableC0988();
        f3617 = runnableC0988;
        runnableC0988.m2996(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f3618 = timeUnit.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2979.f9542.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m2675();
                    if (m2992()) {
                        return;
                    }
                    mo1744();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM2993 = m2993();
                    if (jM2993 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3618 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2675();
                            if (m2992()) {
                                return;
                            }
                            mo1744();
                            return;
                        }
                        if (jM2993 > j2) {
                            jM2993 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM2993 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2675();
                            if (m2992()) {
                                return;
                            }
                            mo1744();
                            return;
                        }
                        LockSupport.parkNanos(this, jM2993);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m2675();
            if (!m2992()) {
                mo1744();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC1236, p000.AbstractC1237
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC0877
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final Thread mo1744() {
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
                thread.setContextClassLoader(RunnableC0988.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void mo2673(long j, AbstractRunnableC1234 abstractRunnableC1234) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC1236
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void mo2674(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2674(runnable);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public final synchronized void m2675() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1236.f4458.set(this, null);
            AbstractC1236.f4459.set(this, null);
            notifyAll();
        }
    }
}
