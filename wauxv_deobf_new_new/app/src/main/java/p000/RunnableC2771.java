package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2771 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2772 f8918;

    public RunnableC2771(C2772 c2772, boolean z) {
        this.f8918 = c2772;
        this.f8917 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3580.m5116();
        C1072 c1072 = this.f8918.f8919;
        boolean z = c1072.f3866;
        boolean z2 = this.f8917;
        c1072.f3866 = z2;
        if (z != z2) {
            ((C2770) c1072.f3867).mo2367(z2);
        }
    }
}
