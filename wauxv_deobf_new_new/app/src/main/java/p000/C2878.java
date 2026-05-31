package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2878 extends AbstractC2877 implements InterfaceC2002 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2492 f9191;

    public C2878(C0917 c0917, int i, C0913 c0913, C0417 c0417) {
        super(c0917, i, c0913, c0417);
        String str = c0913.f3382.f3385;
        C3505 c3505 = c0917.f3408;
        boolean z = (i & 8) != 0;
        boolean zEquals = c0913.f3381.f3385.equals("<init>");
        C2492 c2492M4441 = C2492.m4441(str);
        if (!z) {
            c2492M4441 = c2492M4441.m4444(zEquals ? c3505.m5026(Integer.MAX_VALUE) : c3505);
        }
        this.f9191 = c2492M4441;
    }

    @Override // p000.InterfaceC2002
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2492 mo2358() {
        return this.f9191;
    }
}
