package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2401Ujhhgtgfeyxiexzf extends C1744Ujhhgtgfeyxiexzf {
    public static final C2397Ujhhgtgfeyxiexzf Companion = new C2397Ujhhgtgfeyxiexzf();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C2401Ujhhgtgfeyxiexzf head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C2401Ujhhgtgfeyxiexzf next;
    private long timeoutAt;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        condition = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf, long j) {
        return c2401Ujhhgtgfeyxiexzf.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            C2397Ujhhgtgfeyxiexzf c2397Ujhhgtgfeyxiexzf = Companion;
            c2397Ujhhgtgfeyxiexzf.getClass();
            c2397Ujhhgtgfeyxiexzf.getClass();
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new C2401Ujhhgtgfeyxiexzf();
                    C2405Ujhhgtgfeyxiexzf c2405Ujhhgtgfeyxiexzf = new C2405Ujhhgtgfeyxiexzf("Okio Watchdog");
                    c2405Ujhhgtgfeyxiexzf.setDaemon(true);
                    c2405Ujhhgtgfeyxiexzf.start();
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
                C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = head;
                while (c2401Ujhhgtgfeyxiexzf.next != null && jAccess$remainingNanos >= access$remainingNanos(c2401Ujhhgtgfeyxiexzf.next, jNanoTime)) {
                    c2401Ujhhgtgfeyxiexzf = c2401Ujhhgtgfeyxiexzf.next;
                }
                this.next = c2401Ujhhgtgfeyxiexzf.next;
                c2401Ujhhgtgfeyxiexzf.next = this;
                if (c2401Ujhhgtgfeyxiexzf == head) {
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
        C2397Ujhhgtgfeyxiexzf c2397Ujhhgtgfeyxiexzf = Companion;
        c2397Ujhhgtgfeyxiexzf.getClass();
        c2397Ujhhgtgfeyxiexzf.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = head; c2401Ujhhgtgfeyxiexzf != null; c2401Ujhhgtgfeyxiexzf = c2401Ujhhgtgfeyxiexzf.next) {
                if (c2401Ujhhgtgfeyxiexzf.next == this) {
                    c2401Ujhhgtgfeyxiexzf.next = this.next;
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

    public final InterfaceC1026feyxiexzfUjhhgtg sink(InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg) {
        return new C2406Ujhhgtgfeyxiexzf(this, 0, interfaceC1026feyxiexzfUjhhgtg);
    }

    public final InterfaceC1227feyxiexzfUjhhgtg source(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        return new C2402Ujhhgtgfeyxiexzf(this, 0, interfaceC1227feyxiexzfUjhhgtg);
    }

    public final <T> T withTimeout(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) throws IOException {
        enter();
        try {
            try {
                T t = (T) interfaceC3545feyxiexzfUjhhgtg.invoke();
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
