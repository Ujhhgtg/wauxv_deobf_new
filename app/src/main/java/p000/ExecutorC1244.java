package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1244 implements Executor {

    public final /* synthetic */ int f4510;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4510) {
            case 0:
                AbstractC3522.m5109().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
