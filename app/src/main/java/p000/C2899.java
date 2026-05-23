package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2899 extends AbstractRunnableC2898 {

    public final Runnable f9317;

    public C2899(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.f9317 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9317.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f9317;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0968.m2473(runnable));
        sb.append(", ");
        sb.append(this.f9315);
        sb.append(", ");
        return AbstractC1194.m2786(sb, this.f9316 ? "Blocking" : "Non-blocking", ']');
    }
}
