package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3485 extends AbstractC2396 {

    public static final C3485 f10983 = new C3485(C3486.f10984);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((C3483) obj).f10980.length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C3484 c3484 = (C3484) obj;
        long jMo2519 = interfaceC0766.mo2229(this.f7659, i).mo2519();
        c3484.mo1640(c3484.mo1641() + 1);
        long[] jArr = c3484.f10981;
        int i2 = c3484.f10982;
        c3484.f10982 = i2 + 1;
        jArr[i2] = jMo2519;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        long[] jArr = ((C3483) obj).f10980;
        C3484 c3484 = new C3484();
        c3484.f10981 = jArr;
        c3484.f10982 = jArr.length;
        c3484.mo1640(10);
        return c3484;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new C3483(new long[0]);
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        long[] jArr = ((C3483) obj).f10980;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2255(this.f7659, i2).mo2807(jArr[i2]);
        }
    }
}
