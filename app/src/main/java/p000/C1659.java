package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1659 extends AbstractC2396 {

    public static final C1659 f5607 = new C1659(C1665.f5622);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C1658 c1658 = (C1658) obj;
        int iMo2238 = interfaceC0766.mo2238(this.f7659, i);
        c1658.mo1640(c1658.mo1641() + 1);
        int[] iArr = c1658.f5605;
        int i2 = c1658.f5606;
        c1658.f5606 = i2 + 1;
        iArr[i2] = iMo2238;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        int[] iArr = (int[]) obj;
        C1658 c1658 = new C1658();
        c1658.f5605 = iArr;
        c1658.f5606 = iArr.length;
        c1658.mo1640(10);
        return c1658;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new int[0];
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2249(i2, iArr[i2], this.f7659);
        }
    }
}
