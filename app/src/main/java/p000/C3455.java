package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲈᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3455 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3454 f10928;

    public C3455(InterfaceC3454 interfaceC3454) {
        super(4, (interfaceC3454.size() * 2) + 4);
        this.f10928 = interfaceC3454;
    }

    public final int hashCode() {
        C2819 c2819 = C2819.f9030;
        InterfaceC3454 interfaceC3454 = this.f10928;
        int size = interfaceC3454.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC3454.getType(i).f10904.hashCode();
        }
        return iHashCode;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C1977 c1977 = c1023.f3742;
        InterfaceC3454 interfaceC3454 = this.f10928;
        int size = interfaceC3454.size();
        for (int i = 0; i < size; i++) {
            c1977.m3813(interfaceC3454.getType(i));
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5723;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1223(AbstractC2270 abstractC2270) {
        InterfaceC3454 interfaceC3454 = ((C3455) abstractC2270).f10928;
        C2819 c2819 = C2819.f9030;
        InterfaceC3454 interfaceC3455 = this.f10928;
        int size = interfaceC3455.size();
        int size2 = interfaceC3454.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC3455.getType(i).f10904.compareTo(interfaceC3454.getType(i).f10904);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        C1977 c1977 = c1023.f3742;
        InterfaceC3454 interfaceC3454 = this.f10928;
        int size = interfaceC3454.size();
        if (c0519.m1833()) {
            c0519.m1831(0, m4151() + " type_list");
            c0519.m1831(4, "  size: ".concat(AbstractC1460.m3224(size)));
            for (int i = 0; i < size; i++) {
                C3448 type = interfaceC3454.getType(i);
                c0519.m1831(2, "  " + AbstractC1460.m3223(c1977.m3808(type)) + " // " + type.mo1214());
            }
        }
        c0519.m1839(size);
        for (int i2 = 0; i2 < size; i2++) {
            c0519.m1840(c1977.m3808(interfaceC3454.getType(i2)));
        }
    }
}
