package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱ要点脸能不能ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1744Ujhhgtgfeyxiexzf {
    public static final C1736Ujhhgtgfeyxiexzf Companion = new C1736Ujhhgtgfeyxiexzf();
    public static final C1744Ujhhgtgfeyxiexzf NONE = new C1737Ujhhgtgfeyxiexzf();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                condition.await(jTimeoutNanos, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C1744Ujhhgtgfeyxiexzf clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C1744Ujhhgtgfeyxiexzf clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C1744Ujhhgtgfeyxiexzf deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "duration <= 0: ").toString());
        }
        return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(C1744Ujhhgtgfeyxiexzf c1744Ujhhgtgfeyxiexzf, InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        long jTimeoutNanos = timeoutNanos();
        C1736Ujhhgtgfeyxiexzf c1736Ujhhgtgfeyxiexzf = Companion;
        long jTimeoutNanos2 = c1744Ujhhgtgfeyxiexzf.timeoutNanos();
        long jTimeoutNanos3 = timeoutNanos();
        c1736Ujhhgtgfeyxiexzf.getClass();
        if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
            jTimeoutNanos2 = jTimeoutNanos3;
        }
        timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
        if (!hasDeadline()) {
            if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                deadlineNanoTime(c1744Ujhhgtgfeyxiexzf.deadlineNanoTime());
            }
            try {
                return (T) interfaceC3545feyxiexzfUjhhgtg.invoke();
            } finally {
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), c1744Ujhhgtgfeyxiexzf.deadlineNanoTime()));
        }
        try {
            return (T) interfaceC3545feyxiexzfUjhhgtg.invoke();
        } finally {
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C1744Ujhhgtgfeyxiexzf timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "timeout < 0: ").toString());
        }
        this.timeoutNanos = timeUnit.toNanos(j);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j = jTimeoutNanos / 1000000;
                obj.wait(j, (int) (jTimeoutNanos - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C1744Ujhhgtgfeyxiexzf deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
