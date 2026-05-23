package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0404 extends AbstractC1755 {

    public int f1902;

    public final int m1596() {
        if (this.f1902 == -1) {
            C0403 c0403 = new C0403();
            c0403.f1901 = 0;
            int length = this.f4836.length;
            for (int i = 0; i < length; i++) {
                C0442 c0442 = ((C0402) m3062(i)).f1898;
                int length2 = c0442.f4836.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    ((AbstractC1649) c0442.m3062(i2)).mo3046(c0403);
                }
            }
            this.f1902 = c0403.f1901;
        }
        return this.f1902;
    }

    public final C0402 m1597(int i) {
        int iM3507 = m3507(i);
        if (iM3507 >= 0) {
            return (C0402) m3062(iM3507);
        }
        throw new IllegalArgumentException("no such label: ".concat(AbstractC1460.m3223(i)));
    }
}
