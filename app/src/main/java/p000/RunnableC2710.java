package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲈᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2710 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2711 f8755;

    public RunnableC2710(C2711 c2711, boolean z) {
        this.f8755 = c2711;
        this.f8754 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3522.m5104();
        C1067 c1067 = this.f8755.f8756;
        boolean z = c1067.f3855;
        boolean z2 = this.f8754;
        c1067.f3855 = z2;
        if (z != z2) {
            ((C2709) c1067.f3856).mo2265(z2);
        }
    }
}
