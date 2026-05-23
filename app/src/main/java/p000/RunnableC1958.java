package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1958 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6474;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1962 f6475;

    public /* synthetic */ RunnableC1958(C1962 c1962, int i) {
        this.f6474 = i;
        this.f6475 = c1962;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6474) {
            case 0:
                C1961 c1961 = this.f6475.f6511;
                if (c1961 != null) {
                    c1961.m3788();
                }
                break;
            default:
                C1961 c1962 = this.f6475.f6511;
                if (c1962 != null) {
                    c1962.m3786(c1962.f6482);
                    break;
                }
                break;
        }
    }
}
