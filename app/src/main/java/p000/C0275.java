package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0275 implements InterfaceC1011 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final char f1481;

    public C0275(char c) {
        this.f1481 = c;
    }

    @Override // p000.InterfaceC1011
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1396(C2901 c2901, C2901 c2902, int i) {
        String.valueOf(this.f1481);
        AbstractC2224 c1183 = i == 1 ? new C1183() : new C2850();
        AbstractC2224 abstractC2224 = c2901.f7222;
        while (abstractC2224 != null && abstractC2224 != c2902) {
            AbstractC2224 abstractC2225 = abstractC2224.f7222;
            c1183.m4143(abstractC2224);
            abstractC2224 = abstractC2225;
        }
        c1183.m4144();
        AbstractC2224 abstractC2226 = c2901.f7222;
        c1183.f7222 = abstractC2226;
        if (abstractC2226 != null) {
            abstractC2226.f7221 = c1183;
        }
        c1183.f7221 = c2901;
        c2901.f7222 = c1183;
        AbstractC2224 abstractC2227 = c2901.f7218;
        c1183.f7218 = abstractC2227;
        if (c1183.f7222 == null) {
            abstractC2227.f7220 = c1183;
        }
    }

    @Override // p000.InterfaceC1011
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final char mo1397() {
        return this.f1481;
    }

    @Override // p000.InterfaceC1011
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo1398() {
        return 1;
    }

    @Override // p000.InterfaceC1011
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo1399(C1010 c1010, C1010 c1011) {
        if (c1010.f3688 || c1011.f3687) {
            int i = c1011.f3692;
            if (i % 3 != 0 && (c1010.f3692 + i) % 3 == 0) {
                return 0;
            }
        }
        return (c1010.f3691 < 2 || c1011.f3691 < 2) ? 1 : 2;
    }

    @Override // p000.InterfaceC1011
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final char mo1400() {
        return this.f1481;
    }
}
