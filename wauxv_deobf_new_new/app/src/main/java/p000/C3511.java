package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᲈᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3511 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3510 f11084;

    public C3511(InterfaceC3510 interfaceC3510) {
        super(4, (interfaceC3510.size() * 2) + 4);
        this.f11084 = interfaceC3510;
    }

    public final int hashCode() {
        C2879 c2879 = C2879.f9192;
        InterfaceC3510 interfaceC3510 = this.f11084;
        int size = interfaceC3510.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC3510.getType(i).f11064.hashCode();
        }
        return iHashCode;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2008 c2008 = c1026.f3749;
        InterfaceC3510 interfaceC3510 = this.f11084;
        int size = interfaceC3510.size();
        for (int i = 0; i < size; i++) {
            c2008.m4007(interfaceC3510.getType(i));
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5766;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1369(AbstractC2302 abstractC2302) {
        InterfaceC3510 interfaceC3510 = ((C3511) abstractC2302).f11084;
        C2879 c2879 = C2879.f9192;
        InterfaceC3510 interfaceC3511 = this.f11084;
        int size = interfaceC3511.size();
        int size2 = interfaceC3510.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC3511.getType(i).f11064.compareTo(interfaceC3510.getType(i).f11064);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        C2008 c2008 = c1026.f3749;
        InterfaceC3510 interfaceC3510 = this.f11084;
        int size = interfaceC3510.size();
        if (c0496.m1927()) {
            c0496.m1925(0, m4280() + " type_list");
            c0496.m1925(4, "  size: ".concat(AbstractC2902.m4907(size)));
            for (int i = 0; i < size; i++) {
                C3505 type = interfaceC3510.getType(i);
                c0496.m1925(2, "  " + AbstractC2902.m4906(c2008.m4002(type)) + " // " + type.mo1360());
            }
        }
        c0496.m1933(size);
        for (int i2 = 0; i2 < size; i2++) {
            c0496.m1934(c2008.m4002(interfaceC3510.getType(i2)));
        }
    }
}
