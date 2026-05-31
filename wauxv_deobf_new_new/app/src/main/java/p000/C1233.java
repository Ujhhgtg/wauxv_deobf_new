package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1233 extends AbstractRunnableC1234 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0535 f4453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1236 f4454;

    public C1233(AbstractC1236 abstractC1236, long j, C0535 c0535) {
        this.f4454 = abstractC1236;
        this.f4455 = j;
        this.f4456 = -1;
        this.f4453 = c0535;
    }

    @Override // java.lang.Runnable
    public final void run() throws C1076 {
        this.f4453.m2049(this.f4454);
    }

    @Override // p000.AbstractRunnableC1234
    public final String toString() {
        return super.toString() + this.f4453;
    }
}
