package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1405 extends C3400 {

    public C3400 f5064;

    public C1405(C3400 c3400) {
        this.f5064 = c3400;
    }

    @Override // p000.C3400
    public final C3400 clearDeadline() {
        return this.f5064.clearDeadline();
    }

    @Override // p000.C3400
    public final C3400 clearTimeout() {
        return this.f5064.clearTimeout();
    }

    @Override // p000.C3400
    public final long deadlineNanoTime() {
        return this.f5064.deadlineNanoTime();
    }

    @Override // p000.C3400
    public final boolean hasDeadline() {
        return this.f5064.hasDeadline();
    }

    @Override // p000.C3400
    public final void throwIfReached() throws InterruptedIOException {
        this.f5064.throwIfReached();
    }

    @Override // p000.C3400
    public final C3400 timeout(long j, TimeUnit timeUnit) {
        return this.f5064.timeout(j, timeUnit);
    }

    @Override // p000.C3400
    public final long timeoutNanos() {
        return this.f5064.timeoutNanos();
    }

    @Override // p000.C3400
    public final C3400 deadlineNanoTime(long j) {
        return this.f5064.deadlineNanoTime(j);
    }
}
