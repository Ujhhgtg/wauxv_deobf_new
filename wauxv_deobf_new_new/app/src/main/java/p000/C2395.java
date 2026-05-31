package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲇᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2395 extends AbstractC0900 {
    public C2395(C2648 c2648, C2848 c2848, C2581 c2581, C2582 c2582, AbstractC0775 abstractC0775) {
        super(c2648, c2848, c2581, c2582, abstractC0775);
        int i = c2648.f8360;
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        interfaceC1662.mo1689(this);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3510 mo3150() {
        return C2879.f9192;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1663 mo3151(C3505 c3505) {
        throw new UnsupportedOperationException("unsupported");
    }
}
