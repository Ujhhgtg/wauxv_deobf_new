package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2350 extends AbstractC0901 {
    public C2350(C2590 c2590, C2788 c2788, C2525 c2525, C2526 c2526, AbstractC0777 abstractC0777) {
        super(c2590, c2788, c2525, c2526, abstractC0777);
        int i = c2590.f8208;
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
    }

    @Override // p000.AbstractC1649
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        interfaceC1648.mo1583(this);
    }

    @Override // p000.AbstractC1649
    public final InterfaceC3454 mo3047() {
        return C2819.f9030;
    }

    @Override // p000.AbstractC1649
    public final AbstractC1649 mo3048(C3448 c3448) {
        throw new UnsupportedOperationException("unsupported");
    }
}
