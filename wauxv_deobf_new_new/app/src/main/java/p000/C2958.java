package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲈᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2958 extends AbstractRunnableC2957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Runnable f9484;

    public C2958(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.f9484 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9484.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f9484;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0972.m2594(runnable));
        sb.append(", ");
        sb.append(this.f9482);
        sb.append(", ");
        return AbstractC1095.m2801(sb, this.f9483 ? "Blocking" : "Non-blocking", ']');
    }
}
