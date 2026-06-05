package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3114Ujhhgtgfeyxiexzf extends AbstractC3362Ujhhgtgfeyxiexzf implements Executor {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final ExecutorC3114Ujhhgtgfeyxiexzf f9679Ujhhgtgfeyxiexzf = new ExecutorC3114Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final AbstractC3740feyxiexzfUjhhgtg f9680Ujhhgtgfeyxiexzf;

    static {
        C1948feyxiexzfUjhhgtg c1948feyxiexzfUjhhgtg = C1948feyxiexzfUjhhgtg.f6425Ujhhgtgfeyxiexzf;
        int i = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        if (64 >= i) {
            i = 64;
        }
        f9680Ujhhgtgfeyxiexzf = c1948feyxiexzfUjhhgtg.mo3289feyxiexzfUjhhgtg(AbstractC0615Ujhhgtgfeyxiexzf.m1897Ujhhgtgfeyxiexzf(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1129feyxiexzfUjhhgtg(C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf, runnable);
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final void mo1129feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Runnable runnable) {
        f9680Ujhhgtgfeyxiexzf.mo1129feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, runnable);
    }
}
