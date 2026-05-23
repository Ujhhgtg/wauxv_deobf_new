package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0142 implements ThreadFactory {

    public final /* synthetic */ int f1137;

    public /* synthetic */ ThreadFactoryC0142(int i) {
        this.f1137 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1137) {
            case 0:
                return new Thread(new RunnableC0141(0, runnable), "glide-active-resources");
            case 1:
                return new C0277(runnable);
            default:
                return new C2559(runnable);
        }
    }
}
