package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤞᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2928 extends AbstractC1663 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9359 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object f9360;

    public C2928(C2648 c2648, C2848 c2848, C2581 c2581, C2582 c2582, C1676 c1676) {
        super(c2648, c2848, c2581, c2582);
        if (c2648.f8360 != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c1676 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f9360 = c1676;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m4927(InterfaceC3510 interfaceC3510) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int size = interfaceC3510.size();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(interfaceC3510.getType(i).mo1360());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        switch (this.f9359) {
            case 0:
                interfaceC1662.mo1694(this);
                break;
            default:
                interfaceC1662.mo1695(this);
                break;
        }
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3510 mo3150() {
        switch (this.f9359) {
            case 0:
                return C2879.f9192;
            default:
                return (InterfaceC3510) this.f9360;
        }
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final String mo2530() {
        switch (this.f9359) {
            case 0:
                return ((C1676) this.f9360).toString();
            default:
                return m4927((InterfaceC3510) this.f9360);
        }
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1663 mo3151(C3505 c3505) {
        switch (this.f9359) {
            case 0:
                throw new UnsupportedOperationException("unsupported");
            default:
                return new C2928(this.f5623, this.f5624, this.f5626, ((InterfaceC3510) this.f9360).mo1408(c3505));
        }
    }

    public C2928(C2648 c2648, C2848 c2848, C2582 c2582, InterfaceC3510 interfaceC3510) {
        super(c2648, c2848, null, c2582);
        int i = c2648.f8360;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3510 != null) {
            this.f9360 = interfaceC3510;
            return;
        }
        throw new NullPointerException("catches == null");
    }
}
