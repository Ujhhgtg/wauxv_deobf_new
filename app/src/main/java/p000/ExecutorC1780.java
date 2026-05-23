package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1780 implements Executor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public RunnableC1324 f5902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public RunnableC1324 f5903;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f5902 == null) {
                this.f5902 = new RunnableC1324(this, 2, runnable);
                AbstractC1270.m2982().execute(this.f5902);
            } else if (this.f5903 == null) {
                this.f5903 = new RunnableC1324(this, 2, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized void m3514() {
        RunnableC1324 runnableC1324 = this.f5903;
        this.f5902 = runnableC1324;
        this.f5903 = null;
        if (runnableC1324 != null) {
            AbstractC1270.m2982().execute(this.f5902);
        }
    }
}
