package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0769 implements ThreadFactory {

    public final /* synthetic */ String f2870;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2870);
        thread.setPriority(10);
        return thread;
    }
}
