package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲈᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1803 implements Executor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public RunnableC1326 f5958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public RunnableC1326 f5959;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f5958 == null) {
                this.f5958 = new RunnableC1326(this, 2, runnable);
                AbstractC1272.m3099().execute(this.f5958);
            } else if (this.f5959 == null) {
                this.f5959 = new RunnableC1326(this, 2, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized void m3686() {
        RunnableC1326 runnableC1326 = this.f5959;
        this.f5958 = runnableC1326;
        this.f5959 = null;
        if (runnableC1326 != null) {
            AbstractC1272.m3099().execute(this.f5958);
        }
    }
}
