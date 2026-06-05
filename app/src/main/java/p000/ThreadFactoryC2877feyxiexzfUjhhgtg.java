package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2877feyxiexzfUjhhgtg implements ThreadFactory {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f9140Ujhhgtgfeyxiexzf;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f9140Ujhhgtgfeyxiexzf);
        thread.setPriority(10);
        return thread;
    }
}
