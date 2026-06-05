package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3599feyxiexzfUjhhgtg implements ThreadFactory {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ThreadFactoryC3013Ujhhgtgfeyxiexzf f11204Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f11205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3382feyxiexzfUjhhgtg f11206Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f11207Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AtomicInteger f11208Ujhhgtgfeyxiexzf;

    public ThreadFactoryC3599feyxiexzfUjhhgtg(ThreadFactoryC3013Ujhhgtgfeyxiexzf threadFactoryC3013Ujhhgtgfeyxiexzf, String str, boolean z) {
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = C3382feyxiexzfUjhhgtg.f10560Ujhhgtgfeyxiexzf;
        this.f11208Ujhhgtgfeyxiexzf = new AtomicInteger();
        this.f11204Ujhhgtgfeyxiexzf = threadFactoryC3013Ujhhgtgfeyxiexzf;
        this.f11205Ujhhgtgfeyxiexzf = str;
        this.f11206Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        this.f11207Ujhhgtgfeyxiexzf = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3003feyxiexzfUjhhgtg runnableC3003feyxiexzfUjhhgtg = new RunnableC3003feyxiexzfUjhhgtg(this, 2, runnable);
        this.f11204Ujhhgtgfeyxiexzf.getClass();
        C2405Ujhhgtgfeyxiexzf c2405Ujhhgtgfeyxiexzf = new C2405Ujhhgtgfeyxiexzf(runnableC3003feyxiexzfUjhhgtg);
        c2405Ujhhgtgfeyxiexzf.setName("glide-" + this.f11205Ujhhgtgfeyxiexzf + "-thread-" + this.f11208Ujhhgtgfeyxiexzf.getAndIncrement());
        return c2405Ujhhgtgfeyxiexzf;
    }
}
