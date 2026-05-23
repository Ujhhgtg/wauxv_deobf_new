package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0280 extends C3400 {
    public static final C0276 Companion = new C0276();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C0280 head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C0280 next;
    private long timeoutAt;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        condition = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(C0280 c0280, long j) {
        return c0280.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            C0276 c0276 = Companion;
            
            
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new C0280();
                    C0277 c0277 = new C0277("Okio Watchdog");
                    c0277.setDaemon(true);
                    c0277.start();
                }
                long jNanoTime = System.nanoTime();
                if (jTimeoutNanos != 0 && zHasDeadline) {
                    this.timeoutAt = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (jTimeoutNanos != 0) {
                    this.timeoutAt = jTimeoutNanos + jNanoTime;
                } else {
                    if (false) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long jAccess$remainingNanos = access$remainingNanos(this, jNanoTime);
                C0280 c0280 = head;
                while (c0280.next != null && jAccess$remainingNanos >= access$remainingNanos(c0280.next, jNanoTime)) {
                    c0280 = c0280.next;
                }
                this.next = c0280.next;
                c0280.next = this;
                if (c0280 == head) {
                    
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
        C0276 c0276 = Companion;
        
        
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (C0280 c0280 = head; c0280 != null; c0280 = c0280.next) {
                if (c0280.next == this) {
                    c0280.next = this.next;
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

    public final InterfaceC2713 sink(InterfaceC2713 interfaceC2713) {
        return new C0278(this, 0, interfaceC2713);
    }

    public final InterfaceC2786 source(InterfaceC2786 interfaceC2786) {
        return new C0279(this, 0, interfaceC2786);
    }

    public final <T> T withTimeout(InterfaceC1414 interfaceC1414) throws IOException {
        enter();
        try {
            try {
                T t = (T) interfaceC1414.invoke();
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
