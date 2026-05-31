package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0290 extends C3459 {
    public static final C0286 Companion = new C0286();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C0290 head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C0290 next;
    private long timeoutAt;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        condition = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(C0290 c0290, long j) {
        return c0290.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            C0286 c0286 = Companion;
            c0286.getClass();
            c0286.getClass();
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new C0290();
                    C0287 c0287 = new C0287("Okio Watchdog");
                    c0287.setDaemon(true);
                    c0287.start();
                }
                long jNanoTime = System.nanoTime();
                if (jTimeoutNanos != 0 && zHasDeadline) {
                    this.timeoutAt = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (jTimeoutNanos != 0) {
                    this.timeoutAt = jTimeoutNanos + jNanoTime;
                } else {
                    if (!zHasDeadline) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long jAccess$remainingNanos = access$remainingNanos(this, jNanoTime);
                C0290 c0290 = head;
                while (c0290.next != null && jAccess$remainingNanos >= access$remainingNanos(c0290.next, jNanoTime)) {
                    c0290 = c0290.next;
                }
                this.next = c0290.next;
                c0290.next = this;
                if (c0290 == head) {
                    Companion.getClass();
                    condition.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        C0286 c0286 = Companion;
        c0286.getClass();
        c0286.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (C0290 c0290 = head; c0290 != null; c0290 = c0290.next) {
                if (c0290.next == this) {
                    c0290.next = this.next;
                    this.next = null;
                    return false;
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC2774 sink(InterfaceC2774 interfaceC2774) {
        return new C0288(this, 0, interfaceC2774);
    }

    public final InterfaceC2846 source(InterfaceC2846 interfaceC2846) {
        return new C0289(this, 0, interfaceC2846);
    }

    public final <T> T withTimeout(InterfaceC1422 interfaceC1422) throws IOException {
        enter();
        try {
            try {
                T t = (T) interfaceC1422.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return t;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }

    public void timedOut() {
    }
}
