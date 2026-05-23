package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2351 extends AbstractC1649 {
    public C2351(C2590 c2590, C2788 c2788, C2525 c2525, C2526 c2526) {
        super(c2590, c2788, c2525, c2526);
        int i = c2590.f8208;
        if (i == 5 || i == 6) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
        if (c2525 != null && i != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        interfaceC1648.mo1581(this);
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3454 mo3047() {
        return C2819.f9030;
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1649 mo3048(C3448 c3448) {
        throw new UnsupportedOperationException("unsupported");
    }

    public C2351(C2590 c2590, C2788 c2788, C2525 c2525, C2525 c2526) {
        this(c2590, c2788, c2525, C2526.m4546(c2526));
    }
}
