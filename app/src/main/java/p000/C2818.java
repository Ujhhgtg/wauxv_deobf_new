package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2818 extends AbstractC2817 implements InterfaceC1971 {

    public final C2440 f9029;

    public C2818(C0918 c0918, int i, C0914 c0914, C0442 c0442) {
        super(c0918, i, c0914, c0442);
        String str = c0914.f3375.f3378;
        C3448 c3448 = c0918.f3401;
        boolean z = (i & 8) != 0;
        boolean zEquals = c0914.f3374.f3378.equals("<init>");
        C2440 c2440M4420 = C2440.m4420(str);
        if (!z) {
            c2440M4420 = c2440M4420.m4423(zEquals ? c3448.m4964(2147483647) : c3448);
        }
        this.f9029 = c2440M4420;
    }

    @Override // p000.InterfaceC1971
    public final C2440 mo2257() {
        return this.f9029;
    }
}
