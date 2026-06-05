package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3529Ujhhgtgfeyxiexzf extends C1744Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C1744Ujhhgtgfeyxiexzf f11020Ujhhgtgfeyxiexzf;

    public C3529Ujhhgtgfeyxiexzf(C1744Ujhhgtgfeyxiexzf c1744Ujhhgtgfeyxiexzf) {
        this.f11020Ujhhgtgfeyxiexzf = c1744Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final C1744Ujhhgtgfeyxiexzf clearDeadline() {
        return this.f11020Ujhhgtgfeyxiexzf.clearDeadline();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final C1744Ujhhgtgfeyxiexzf clearTimeout() {
        return this.f11020Ujhhgtgfeyxiexzf.clearTimeout();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final long deadlineNanoTime() {
        return this.f11020Ujhhgtgfeyxiexzf.deadlineNanoTime();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final boolean hasDeadline() {
        return this.f11020Ujhhgtgfeyxiexzf.hasDeadline();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final void throwIfReached() throws InterruptedIOException {
        this.f11020Ujhhgtgfeyxiexzf.throwIfReached();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final C1744Ujhhgtgfeyxiexzf timeout(long j, TimeUnit timeUnit) {
        return this.f11020Ujhhgtgfeyxiexzf.timeout(j, timeUnit);
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final long timeoutNanos() {
        return this.f11020Ujhhgtgfeyxiexzf.timeoutNanos();
    }

    @Override // p000.C1744Ujhhgtgfeyxiexzf
    public final C1744Ujhhgtgfeyxiexzf deadlineNanoTime(long j) {
        return this.f11020Ujhhgtgfeyxiexzf.deadlineNanoTime(j);
    }
}
