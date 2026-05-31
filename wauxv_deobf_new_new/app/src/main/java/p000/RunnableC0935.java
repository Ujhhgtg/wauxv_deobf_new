package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲇᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0935 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0942 f3441;

    public /* synthetic */ RunnableC0935(C0942 c0942, int i) {
        this.f3440 = i;
        this.f3441 = c0942;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3440) {
            case 0:
                C0776 c0776 = this.f3441.f3455;
                if (c0776 != null) {
                    c0776.m2383();
                }
                break;
            default:
                C0776 c0777 = this.f3441.f3455;
                if (c0777 != null) {
                    c0777.m2377(null);
                    break;
                }
                break;
        }
    }
}
