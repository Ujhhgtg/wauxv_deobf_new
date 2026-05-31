package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲀᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1246 implements Executor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4509;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4509) {
            case 0:
                AbstractC3580.m5121().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
