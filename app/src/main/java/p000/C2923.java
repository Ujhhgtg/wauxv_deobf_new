package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2923 extends AbstractC0901 {

    public final InterfaceC3454 f9380;

    public C2923(C2590 c2590, C2788 c2788, C2526 c2526, InterfaceC3454 interfaceC3454, AbstractC0777 abstractC0777) {
        super(c2590, c2788, null, c2526, abstractC0777);
        int i = c2590.f8208;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3454 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f9380 = interfaceC3454;
    }

    @Override // p000.AbstractC1649
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        interfaceC1648.mo1579(this);
    }

    @Override // p000.AbstractC1649
    public final InterfaceC3454 mo3047() {
        return this.f9380;
    }

    @Override // p000.AbstractC0901, p000.AbstractC1649
    public final String mo2413() {
        AbstractC0777 abstractC0777 = this.f3344;
        String strMo1214 = abstractC0777.mo1214();
        if (abstractC0777 instanceof C0917) {
            strMo1214 = ((C0917) abstractC0777).m2430();
        }
        StringBuilder sbM2788 = AbstractC1194.m2788(strMo1214, " ");
        sbM2788.append(C2868.m4866(this.f9380));
        return sbM2788.toString();
    }

    @Override // p000.AbstractC1649
    public final AbstractC1649 mo3048(C3448 c3448) {
        return new C2923(this.f5588, this.f5589, this.f5591, this.f9380.mo1262(c3448), this.f3344);
    }
}
