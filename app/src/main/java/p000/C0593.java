package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0593 extends AbstractC2396 {

    public static final C0593 f2401 = new C0593(C0598.f2411);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C0590 c0590 = (C0590) obj;
        char cMo2232 = interfaceC0766.mo2232(this.f7659, i);
        c0590.mo1640(c0590.mo1641() + 1);
        char[] cArr = c0590.f2396;
        int i2 = c0590.f2397;
        c0590.f2397 = i2 + 1;
        cArr[i2] = cMo2232;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        char[] cArr = (char[]) obj;
        C0590 c0590 = new C0590();
        c0590.f2396 = cArr;
        c0590.f2397 = cArr.length;
        c0590.mo1640(10);
        return c0590;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new char[0];
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2251(this.f7659, i2, cArr[i2]);
        }
    }
}
