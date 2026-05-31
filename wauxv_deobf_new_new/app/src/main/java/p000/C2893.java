package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᛸᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0916 f9260;

    public C2893(C0916 c0916) {
        super(1, AbstractC2902.m4909(c0916.f3385.length()) + c0916.f3386.f2147 + 1);
        this.f9260 = c0916;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5771;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1369(AbstractC2302 abstractC2302) {
        return this.f9260.compareTo(((C2893) abstractC2302).f9260);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        C0916 c0916 = this.f9260;
        C0493 c0493 = c0916.f3386;
        int length = c0916.f3385.length();
        if (c0496.m1927()) {
            c0496.m1925(AbstractC2902.m4909(length), "utf16_size: ".concat(AbstractC2902.m4907(length)));
            c0496.m1925(c0493.f2147 + 1, c0916.m2547());
        }
        c0496.m1936(length);
        int i = c0493.f2147;
        int i2 = c0496.f2152;
        int i3 = i + i2;
        if (c0496.f2150) {
            c0496.m1929(i3);
        } else if (i3 > c0496.f2151.length) {
            C0496.m1923();
            throw null;
        }
        byte[] bArr = c0496.f2151;
        int length2 = bArr.length - i2;
        int i4 = c0493.f2147;
        if (length2 < i4) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(c0493.f2146, 0, bArr, i2, i4);
        c0496.f2152 = i3;
        c0496.m1932(0);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
    }
}
