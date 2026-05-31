package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲈᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1801 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public EnumC1793 f5954;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC1797 f5955;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3683(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        EnumC1793 enumC1793M3682 = enumC1792.m3682();
        EnumC1793 enumC1793 = this.f5954;
        if (enumC1793M3682.compareTo(enumC1793) < 0) {
            enumC1793 = enumC1793M3682;
        }
        this.f5954 = enumC1793;
        this.f5955.mo0(interfaceC1800, enumC1792);
        this.f5954 = enumC1793M3682;
    }
}
