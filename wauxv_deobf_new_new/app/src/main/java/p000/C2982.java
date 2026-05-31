package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2982 extends AbstractC0900 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3510 f9547;

    public C2982(C2648 c2648, C2848 c2848, C2582 c2582, InterfaceC3510 interfaceC3510, AbstractC0775 abstractC0775) {
        super(c2648, c2848, null, c2582, abstractC0775);
        int i = c2648.f8360;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3510 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f9547 = interfaceC3510;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        interfaceC1662.mo1685(this);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3510 mo3150() {
        return this.f9547;
    }

    @Override // p000.AbstractC0900, p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final String mo2530() {
        AbstractC0775 abstractC0775 = this.f3351;
        String strMo1360 = abstractC0775.mo1360();
        if (abstractC0775 instanceof C0916) {
            strMo1360 = ((C0916) abstractC0775).m2547();
        }
        StringBuilder sbM2803 = AbstractC1095.m2803(strMo1360, " ");
        sbM2803.append(C2928.m4927(this.f9547));
        return sbM2803.toString();
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1663 mo3151(C3505 c3505) {
        return new C2982(this.f5623, this.f5624, this.f5626, this.f9547.mo1408(c3505), this.f3351);
    }
}
