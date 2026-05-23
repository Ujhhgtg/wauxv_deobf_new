package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2868 extends AbstractC1649 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9189 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f9190;

    public C2868(C2590 c2590, C2788 c2788, C2525 c2525, C2526 c2526, C1660 c1660) {
        super(c2590, c2788, c2525, c2526);
        if (c2590.f8208 != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c1660 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f9190 = c1660;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m4866(InterfaceC3454 interfaceC3454) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int size = interfaceC3454.size();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(interfaceC3454.getType(i).mo1214());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        switch (0) {
            case 0:
                interfaceC1648.mo1588(this);
                break;
            default:
                interfaceC1648.mo1589(this);
                break;
        }
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3454 mo3047() {
        switch (0) {
            case 0:
                return C2819.f9030;
            default:
                return (InterfaceC3454) this.f9190;
        }
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final String mo2413() {
        switch (0) {
            case 0:
                return ((C1660) this.f9190).toString();
            default:
                return m4866((InterfaceC3454) this.f9190);
        }
    }

    @Override // p000.AbstractC1649
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1649 mo3048(C3448 c3448) {
        switch (0) {
            case 0:
                throw new UnsupportedOperationException("unsupported");
            default:
                return new C2868(this.f5588, this.f5589, this.f5591, ((InterfaceC3454) this.f9190).mo1262(c3448));
        }
    }

    public C2868(C2590 c2590, C2788 c2788, C2526 c2526, InterfaceC3454 interfaceC3454) {
        super(c2590, c2788, null, c2526);
        int i = c2590.f8208;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3454 != null) {
            this.f9190 = interfaceC3454;
            return;
        }
        throw new NullPointerException("catches == null");
    }
}
