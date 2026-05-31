package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0285 implements InterfaceC1014 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final char f1555;

    public C0285(char c) {
        this.f1555 = c;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1542(C2960 c2960, C2960 c2961, int i) {
        String.valueOf(this.f1555);
        AbstractC2254 c1185 = i == 1 ? new C1185() : new C2910();
        AbstractC2254 abstractC2254 = c2960.f7337;
        while (abstractC2254 != null && abstractC2254 != c2961) {
            AbstractC2254 abstractC2255 = abstractC2254.f7337;
            c1185.m4272(abstractC2254);
            abstractC2254 = abstractC2255;
        }
        c1185.m4273();
        AbstractC2254 abstractC2256 = c2960.f7337;
        c1185.f7337 = abstractC2256;
        if (abstractC2256 != null) {
            abstractC2256.f7336 = c1185;
        }
        c1185.f7336 = c2960;
        c2960.f7337 = c1185;
        AbstractC2254 abstractC2257 = c2960.f7333;
        c1185.f7333 = abstractC2257;
        if (c1185.f7337 == null) {
            abstractC2257.f7335 = c1185;
        }
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final char mo1543() {
        return this.f1555;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo1544() {
        return 1;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo1545(C1013 c1013, C1013 c1014) {
        if (c1013.f3695 || c1014.f3694) {
            int i = c1014.f3699;
            if (i % 3 != 0 && (c1013.f3699 + i) % 3 == 0) {
                return 0;
            }
        }
        return (c1013.f3698 < 2 || c1014.f3698 < 2) ? 1 : 2;
    }

    @Override // p000.InterfaceC1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final char mo1546() {
        return this.f1555;
    }
}
