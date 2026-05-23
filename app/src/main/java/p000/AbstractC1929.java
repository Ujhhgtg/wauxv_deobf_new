package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1929 extends AbstractC1604 {

    public final AbstractC0911 f6376;

    public AbstractC1929(AbstractC0911 abstractC0911) {
        super(abstractC0911.f3368);
        this.f6376 = abstractC0911;
    }

    @Override // p000.AbstractC1675
    public final int mo1921() {
        return 8;
    }

    @Override // p000.AbstractC1675
    public final void mo1922(C1023 c1023, C0519 c0519) {
        C1977 c1977 = c1023.f3742;
        C1977 c1978 = c1023.f3741;
        AbstractC0911 abstractC0911 = this.f6376;
        C0914 c0914 = abstractC0911.f3369;
        int iM3806 = c1977.m3806(this.f5475);
        int iM3805 = c1978.m3805(c0914.f3374);
        int iMo3015 = mo3015(c1023);
        if (c0519.m1833()) {
            c0519.m1831(0, m3346() + ' ' + abstractC0911.mo1214());
            c0519.m1831(2, "  class_idx: ".concat(AbstractC1460.m3223(iM3806)));
            c0519.m1831(2, String.format("  %-10s %s", mo3016().concat(":"), AbstractC1460.m3223(iMo3015)));
            c0519.m1831(4, "  name_idx:  ".concat(AbstractC1460.m3224(iM3805)));
        }
        c0519.m1840(iM3806);
        c0519.m1840(iMo3015);
        c0519.m1839(iM3805);
    }

    public abstract int mo3015(C1023 c1023);

    public abstract String mo3016();
}
