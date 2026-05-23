package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0549 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0894 f2263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte[] f2264;

    public C0549(C0894 c0894) {
        super(1, -1);
        this.f2263 = c0894;
    }

    public final String toString() {
        return this.f2263.toString();
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C2825.m4800(c1023, this.f2263);
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5731;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1224(C1986 c1986, int i) {
        C0519 c0519 = new C0519();
        new C2825(c1986.f8534, c0519).m4810(this.f2263, true);
        byte[] bArrM1836 = c0519.m1836();
        this.f2264 = bArrM1836;
        m4153(bArrM1836.length);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        if (!c0519.m1833()) {
            c0519.m1837(this.f2264);
            return;
        }
        c0519.m1831(0, m4151() + " call site");
        new C2825(c1023, c0519).m4810(this.f2263, true);
    }
}
