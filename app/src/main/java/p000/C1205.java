package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1205 extends AbstractC1204 implements Comparable {

    public final C0913 f4344;

    public final C0736 f4345;

    public C1205(C0913 c0913, int i, C0215 c0215, InterfaceC3454 interfaceC3454) {
        super(i);
        this.f4344 = c0913;
        if (c0215 == null) {
            this.f4345 = null;
        } else {
            this.f4345 = new C0736(c0913, c0215, (i & 8) != 0, interfaceC3454);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4344.compareTo(((C1205) obj).f4344);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1205) && this.f4344.compareTo(((C1205) obj).f4344) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1205.class.getName());
        sb.append('{');
        sb.append(AbstractC1460.m3223(this.f4343));
        sb.append(' ');
        sb.append(this.f4344);
        C0736 c0736 = this.f4345;
        if (c0736 != null) {
            sb.append(' ');
            sb.append(c0736);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f4344.mo1214();
    }

    @Override // p000.AbstractC1204
    public final int mo2795(C1023 c1023, C0519 c0519, int i, int i2) {
        C1979 c1979 = c1023.f3745;
        C0913 c0913 = this.f4344;
        int iM3814 = c1979.m3814(c0913);
        int i3 = iM3814 - i;
        C0736 c0736 = this.f4345;
        int iM4150 = c0736 == null ? 0 : c0736.m4150();
        boolean z = iM4150 != 0;
        int i4 = this.f4343;
        if (z != ((i4 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c0519.m1833()) {
            c0519.m1831(0, String.format("  [%x] %s", Integer.valueOf(i2), c0913.mo1214()));
            c0519.m1831(AbstractC1459.m3199(i3), "    method_idx:   ".concat(AbstractC1460.m3224(iM3814)));
            c0519.m1831(AbstractC1459.m3199(i4), "    access_flags: " + AbstractC2201.m3975(i4, 204287, 3));
            c0519.m1831(AbstractC1459.m3199(iM4150), "    code_off:     ".concat(AbstractC1460.m3224(iM4150)));
        }
        c0519.m1842(i3);
        c0519.m1842(i4);
        c0519.m1842(iM4150);
        return iM3814;
    }
}
