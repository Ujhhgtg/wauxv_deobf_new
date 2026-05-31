package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1989 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1993 f6580;

    public /* synthetic */ RunnableC1989(C1993 c1993, int i) {
        this.f6579 = i;
        this.f6580 = c1993;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6579) {
            case 0:
                C1992 c1992 = this.f6580.f6616;
                if (c1992 != null) {
                    c1992.m3982();
                }
                break;
            default:
                C1992 c1993 = this.f6580.f6616;
                if (c1993 != null) {
                    c1993.m3980(c1993.f6587);
                    break;
                }
                break;
        }
    }
}
