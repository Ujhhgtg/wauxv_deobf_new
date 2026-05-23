package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2289 extends C2436 {

    public boolean f7380;

    @Override // p000.C2436, p000.InterfaceC0974
    public final InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
        if (!AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9111) && !AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9114) && !(abstractC1460Mo3472 instanceof AbstractC2375)) {
            throw new C1653("Type " + interfaceC2654.mo3472() + " cannot be directly child of oneof element");
        }
        long jM2018 = m2018();
        if (jM2018 == 19500 && AbstractC2207.m4087(this.f7738, interfaceC2654)) {
            return this;
        }
        if (AbstractC1459.m3192(jM2018)) {
            throw new C1653("An oneof element cannot be directly child of another oneof element");
        }
        return new C2436(this.f7736, AbstractC2202.m3991(this.f7737, jM2018), interfaceC2654);
    }

    @Override // p000.C2436, p000.InterfaceC0766
    public final int mo2230(InterfaceC2654 interfaceC2654) {
        if (this.f7380) {
            return -1;
        }
        this.f7380 = true;
        return 0;
    }
}
