package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛳ能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3192feyxiexzfUjhhgtg implements Callable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3189feyxiexzfUjhhgtg f9870Ujhhgtgfeyxiexzf;

    public CallableC3192feyxiexzfUjhhgtg(C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg) {
        this.f9870Ujhhgtgfeyxiexzf = c3189feyxiexzfUjhhgtg;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f9870Ujhhgtgfeyxiexzf) {
            try {
                C3189feyxiexzfUjhhgtg c3189feyxiexzfUjhhgtg = this.f9870Ujhhgtgfeyxiexzf;
                if (c3189feyxiexzfUjhhgtg.f9855Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                c3189feyxiexzfUjhhgtg.m4695feyxiexzfUjhhgtg();
                if (this.f9870Ujhhgtgfeyxiexzf.m4690Ujhhgtgfeyxiexzf()) {
                    this.f9870Ujhhgtgfeyxiexzf.m4694feyxiexzfUjhhgtg();
                    this.f9870Ujhhgtgfeyxiexzf.f9857Ujhhgtgfeyxiexzf = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
