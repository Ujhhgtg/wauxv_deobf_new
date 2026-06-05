package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3361Ujhhgtgfeyxiexzf implements Executor {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10512Ujhhgtgfeyxiexzf;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10512Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC1860Ujhhgtgfeyxiexzf.m3197Ujhhgtgfeyxiexzf().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
