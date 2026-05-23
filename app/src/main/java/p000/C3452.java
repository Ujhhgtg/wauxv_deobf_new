package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲈᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3452 extends AbstractC1604 {
    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        c1023.f3741.m3811(this.f5475.m2433());
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5715;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        return 4;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        C0917 c0917M2433 = this.f5475.m2433();
        int iM3805 = c1023.f3741.m3805(c0917M2433);
        if (c0519.m1833()) {
            c0519.m1831(0, m3346() + ' ' + c0917M2433.mo1214());
            c0519.m1831(4, "  descriptor_idx: ".concat(AbstractC1460.m3224(iM3805)));
        }
        c0519.m1839(iM3805);
    }
}
