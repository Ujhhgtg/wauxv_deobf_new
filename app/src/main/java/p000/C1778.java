package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1778 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public EnumC1770 f5898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC1774 f5899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3511(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        EnumC1770 enumC1770M3510 = enumC1769.m3510();
        EnumC1770 enumC1770 = this.f5898;
        if (enumC1770M3510.compareTo(enumC1770) < 0) {
            enumC1770 = enumC1770M3510;
        }
        this.f5898 = enumC1770;
        this.f5899.mo0(interfaceC1777, enumC1769);
        this.f5898 = enumC1770M3510;
    }
}
