package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲇᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2396 extends AbstractC1663 {
    public C2396(C2648 c2648, C2848 c2848, C2581 c2581, C2582 c2582) {
        super(c2648, c2848, c2581, c2582);
        int i = c2648.f8360;
        if (i == 5 || i == 6) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
        if (c2581 != null && i != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        interfaceC1662.mo1687(this);
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

    public C2396(C2648 c2648, C2848 c2848, C2581 c2581, C2581 c2582) {
        this(c2648, c2848, c2581, C2582.m4568(c2582));
    }
}
