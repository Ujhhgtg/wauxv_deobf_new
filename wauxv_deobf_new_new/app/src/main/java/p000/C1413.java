package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1413 extends C3459 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3459 f5093;

    public C1413(C3459 c3459) {
        this.f5093 = c3459;
    }

    @Override // p000.C3459
    public final C3459 clearDeadline() {
        return this.f5093.clearDeadline();
    }

    @Override // p000.C3459
    public final C3459 clearTimeout() {
        return this.f5093.clearTimeout();
    }

    @Override // p000.C3459
    public final long deadlineNanoTime() {
        return this.f5093.deadlineNanoTime();
    }

    @Override // p000.C3459
    public final boolean hasDeadline() {
        return this.f5093.hasDeadline();
    }

    @Override // p000.C3459
    public final void throwIfReached() throws InterruptedIOException {
        this.f5093.throwIfReached();
    }

    @Override // p000.C3459
    public final C3459 timeout(long j, TimeUnit timeUnit) {
        return this.f5093.timeout(j, timeUnit);
    }

    @Override // p000.C3459
    public final long timeoutNanos() {
        return this.f5093.timeoutNanos();
    }

    @Override // p000.C3459
    public final C3459 deadlineNanoTime(long j) {
        return this.f5093.deadlineNanoTime(j);
    }
}
