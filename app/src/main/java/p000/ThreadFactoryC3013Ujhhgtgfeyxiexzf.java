package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3013Ujhhgtgfeyxiexzf implements ThreadFactory {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9364Ujhhgtgfeyxiexzf;

    public /* synthetic */ ThreadFactoryC3013Ujhhgtgfeyxiexzf(int i) {
        this.f9364Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9364Ujhhgtgfeyxiexzf) {
            case 0:
                return new Thread(new RunnableC3012feyxiexzfUjhhgtg(0, runnable), "glide-active-resources");
            case 1:
                return new C2405Ujhhgtgfeyxiexzf(runnable);
            default:
                return new C0992feyxiexzfUjhhgtg(runnable);
        }
    }
}
