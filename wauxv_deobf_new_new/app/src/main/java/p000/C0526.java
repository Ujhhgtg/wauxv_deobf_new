package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0893 f2219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f2220;

    public C0526(C0893 c0893) {
        super(1, -1);
        this.f2219 = c0893;
    }

    public final String toString() {
        return this.f2219.toString();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2885.m4833(c1026, this.f2219);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5774;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        C0496 c0496 = new C0496();
        new C2885(c2017.f8699, c0496).m4843(this.f2219, true);
        byte[] bArrM1930 = c0496.m1930();
        this.f2220 = bArrM1930;
        m4282(bArrM1930.length);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        if (!c0496.m1927()) {
            c0496.m1931(this.f2220);
            return;
        }
        c0496.m1925(0, m4280() + " call site");
        new C2885(c1026, c0496).m4843(this.f2219, true);
    }
}
