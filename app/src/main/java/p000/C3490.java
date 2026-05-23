package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3490 extends AbstractC2396 {

    public static final C3490 f10990 = new C3490(C3491.f10991);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((C3488) obj).f10987.length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C3489 c3489 = (C3489) obj;
        short sMo2522 = interfaceC0766.mo2229(this.f7659, i).mo2522();
        c3489.mo1640(c3489.mo1641() + 1);
        short[] sArr = c3489.f10988;
        int i2 = c3489.f10989;
        c3489.f10989 = i2 + 1;
        sArr[i2] = sMo2522;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        short[] sArr = ((C3488) obj).f10987;
        C3489 c3489 = new C3489();
        c3489.f10988 = sArr;
        c3489.f10989 = sArr.length;
        c3489.mo1640(10);
        return c3489;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new C3488(new short[0]);
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        short[] sArr = ((C3488) obj).f10987;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2255(this.f7659, i2).mo2800(sArr[i2]);
        }
    }
}
