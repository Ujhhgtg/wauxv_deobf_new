package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᛸᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1202 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0890 f4340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public byte[] f4341;

    public C1202(C0890 c0890) {
        super(1, -1);
        this.f4340 = c0890;
        this.f4341 = null;
    }

    public final int hashCode() {
        return this.f4340.hashCode();
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C2825.m4800(c1023, this.f4340);
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5731;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1223(AbstractC2270 abstractC2270) {
        return this.f4340.compareTo(((C1202) abstractC2270).f4340);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1224(C1986 c1986, int i) {
        C0519 c0519 = new C0519();
        new C2825(c1986.f8534, c0519).m4810(this.f4340, false);
        byte[] bArrM1836 = c0519.m1836();
        this.f4341 = bArrM1836;
        m4153(bArrM1836.length);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        if (!c0519.m1833()) {
            c0519.m1837(this.f4341);
            return;
        }
        c0519.m1831(0, m4151() + " encoded array");
        new C2825(c1023, c0519).m4810(this.f4340, true);
    }
}
