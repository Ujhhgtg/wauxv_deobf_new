package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0180 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0179 f1271 = new C0179(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0173 f1272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C3509 f1273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte[] f1274;

    public C0180(C0173 c0173, C1026 c1026) {
        super(1, -1);
        if (c0173 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f1272 = c0173;
        this.f1273 = null;
        this.f1274 = null;
        mo1367(c1026);
    }

    public final int hashCode() {
        return this.f1272.hashCode();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1367(C1026 c1026) {
        C2008 c2008 = c1026.f3749;
        C0173 c0173 = this.f1272;
        this.f1273 = c2008.m4003(c0173.f1258);
        C2885.m4832(c0173, c1026);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5773;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo1369(AbstractC2302 abstractC2302) {
        return this.f1272.compareTo(((C0180) abstractC2302).f1272);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo1370(C2017 c2017, int i) {
        C0496 c0496 = new C0496();
        new C2885(c2017.f8699, c0496).m4842(this.f1272, false);
        byte[] bArrM1930 = c0496.m1930();
        this.f1274 = bArrM1930;
        m4282(bArrM1930.length + 1);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        String str;
        boolean zM1927 = c0496.m1927();
        C0173 c0173 = this.f1272;
        int i = c0173.f1259;
        if (zM1927) {
            c0496.m1925(0, m4280() + " annotation");
            if (i == 1) {
                str = "RUNTIME";
            } else if (i == 2) {
                str = "BUILD";
            } else if (i != 3) {
                str = i != 4 ? "null" : "EMBEDDED";
            } else {
                str = "SYSTEM";
            }
            c0496.m1925(1, "  visibility: VISBILITY_".concat(str));
        }
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 == 0) {
            c0496.m1932(1);
        } else if (iM4792 == 1) {
            c0496.m1932(0);
        } else {
            if (iM4792 != 2) {
                throw new RuntimeException("shouldn't happen");
            }
            c0496.m1932(2);
        }
        if (zM1927) {
            new C2885(c1026, c0496).m4842(c0173, true);
        } else {
            c0496.m1931(this.f1274);
        }
    }
}
