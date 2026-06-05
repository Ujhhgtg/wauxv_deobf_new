package p000;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴ要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0851feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3343Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f3344Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC0851feyxiexzfUjhhgtg(Context context, int i) {
        this.f3343Ujhhgtgfeyxiexzf = i;
        this.f3344Ujhhgtgfeyxiexzf = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3343Ujhhgtgfeyxiexzf) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0851feyxiexzfUjhhgtg(this.f3344Ujhhgtgfeyxiexzf, 1));
                break;
            default:
                AbstractC0615Ujhhgtgfeyxiexzf.m1898Ujhhgtgfeyxiexzf(this.f3344Ujhhgtgfeyxiexzf, new ExecutorC0842feyxiexzfUjhhgtg(), AbstractC0615Ujhhgtgfeyxiexzf.f2647Ujhhgtgfeyxiexzf, false);
                break;
        }
    }
}
