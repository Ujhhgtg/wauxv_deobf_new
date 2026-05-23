package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1231 extends AbstractRunnableC1232 {

    public final C0558 f4455;

    public final /* synthetic */ AbstractC1234 f4456;

    public C1231(AbstractC1234 abstractC1234, long j, C0558 c0558) {
        this.f4456 = abstractC1234;
        this.f4457 = j;
        this.f4458 = -1;
        this.f4455 = c0558;
    }

    @Override // java.lang.Runnable
    public final void run() throws C1071 {
        this.f4455.m1954(this.f4456);
    }

    @Override // p000.AbstractRunnableC1232
    public final String toString() {
        return super.toString() + this.f4455;
    }
}
