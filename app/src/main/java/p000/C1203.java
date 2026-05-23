package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1203 extends AbstractC1204 implements Comparable {

    public final C0899 f4342;

    public C1203(C0899 c0899, int i) {
        super(i);
        this.f4342 = c0899;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4342.compareTo(((C1203) obj).f4342);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1203) && this.f4342.compareTo(((C1203) obj).f4342) == 0;
    }

    public final int hashCode() {
        return this.f4342.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1203.class.getName());
        sb.append('{');
        sb.append(AbstractC1460.m3223(this.f4343));
        sb.append(' ');
        sb.append(this.f4342);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f4342.mo1214();
    }

    @Override // p000.AbstractC1204
    public final int mo2795(C1023 c1023, C0519 c0519, int i, int i2) {
        C1301 c1301 = c1023.f3744;
        C0899 c0899 = this.f4342;
        int iM3017 = c1301.m3017(c0899);
        int i3 = iM3017 - i;
        boolean zM1833 = c0519.m1833();
        int i4 = this.f4343;
        if (zM1833) {
            c0519.m1831(0, String.format("  [%x] %s", Integer.valueOf(i2), c0899.mo1214()));
            c0519.m1831(AbstractC1459.m3199(i3), "    field_idx:    ".concat(AbstractC1460.m3224(iM3017)));
            c0519.m1831(AbstractC1459.m3199(i4), "    access_flags: " + AbstractC2201.m3975(i4, 20703, 2));
        }
        c0519.m1842(i3);
        c0519.m1842(i4);
        return iM3017;
    }
}
