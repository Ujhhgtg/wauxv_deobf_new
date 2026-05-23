package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0936 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0943 f3434;

    public /* synthetic */ RunnableC0936(C0943 c0943, int i) {
        this.f3433 = i;
        this.f3434 = c0943;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3433) {
            case 0:
                C0662 c0662 = this.f3434.f3448;
                if (c0662 != null) {
                    c0662.m2059();
                }
                break;
            default:
                C0662 c0663 = this.f3434.f3448;
                if (c0663 != null) {
                    c0663.m2052(null);
                    break;
                }
                break;
        }
    }
}
