package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3475 extends AbstractC2396 {

    public static final C3475 f10969 = new C3475(C3476.f10970);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((C3473) obj).f10966.length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C3474 c3474 = (C3474) obj;
        byte bMo2521 = interfaceC0766.mo2229(this.f7659, i).mo2521();
        c3474.mo1640(c3474.mo1641() + 1);
        byte[] bArr = c3474.f10967;
        int i2 = c3474.f10968;
        c3474.f10968 = i2 + 1;
        bArr[i2] = bMo2521;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        byte[] bArr = ((C3473) obj).f10966;
        C3474 c3474 = new C3474();
        c3474.f10967 = bArr;
        c3474.f10968 = bArr.length;
        c3474.mo1640(10);
        return c3474;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new C3473(new byte[0]);
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        byte[] bArr = ((C3473) obj).f10966;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2255(this.f7659, i2).mo2801(bArr[i2]);
        }
    }
}
