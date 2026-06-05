package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能ᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0079Ujhhgtgfeyxiexzf implements Executor {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public RunnableC3468feyxiexzfUjhhgtg f1146Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public RunnableC3468feyxiexzfUjhhgtg f1147Ujhhgtgfeyxiexzf;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f1146Ujhhgtgfeyxiexzf == null) {
                this.f1146Ujhhgtgfeyxiexzf = new RunnableC3468feyxiexzfUjhhgtg(this, 2, runnable);
                AbstractC3516feyxiexzfUjhhgtg.m5058Ujhhgtgfeyxiexzf().execute(this.f1146Ujhhgtgfeyxiexzf);
            } else if (this.f1147Ujhhgtgfeyxiexzf == null) {
                this.f1147Ujhhgtgfeyxiexzf = new RunnableC3468feyxiexzfUjhhgtg(this, 2, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final synchronized void m1125Ujhhgtgfeyxiexzf() {
        RunnableC3468feyxiexzfUjhhgtg runnableC3468feyxiexzfUjhhgtg = this.f1147Ujhhgtgfeyxiexzf;
        this.f1146Ujhhgtgfeyxiexzf = runnableC3468feyxiexzfUjhhgtg;
        this.f1147Ujhhgtgfeyxiexzf = null;
        if (runnableC3468feyxiexzfUjhhgtg != null) {
            AbstractC3516feyxiexzfUjhhgtg.m5058Ujhhgtgfeyxiexzf().execute(this.f1146Ujhhgtgfeyxiexzf);
        }
    }
}
