package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1203 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0889 f4337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f4338;

    public C1203(C0889 c0889) {
        super(1, -1);
        this.f4337 = c0889;
        this.f4338 = null;
    }

    public final int hashCode() {
        return this.f4337.hashCode();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2885.m4833(c1026, this.f4337);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5774;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1369(AbstractC2302 abstractC2302) {
        return this.f4337.compareTo(((C1203) abstractC2302).f4337);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        C0496 c0496 = new C0496();
        new C2885(c2017.f8699, c0496).m4843(this.f4337, false);
        byte[] bArrM1930 = c0496.m1930();
        this.f4338 = bArrM1930;
        m4282(bArrM1930.length);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        if (!c0496.m1927()) {
            c0496.m1931(this.f4338);
            return;
        }
        c0496.m1925(0, m4280() + " encoded array");
        new C2885(c1026, c0496).m4843(this.f4337, true);
    }
}
