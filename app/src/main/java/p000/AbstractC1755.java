package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1755 extends AbstractC1352 {

    public final C1660 f5871;

    public AbstractC1755(int i) {
        super(i);
        this.f5871 = new C1660(i);
    }

    public final int m3506() {
        C1660 c1660 = this.f5871;
        int i = c1660.f5610 - 1;
        while (i >= 0 && c1660.m3384(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        c1660.m3387(i2);
        return i2;
    }

    public final int m3507(int i) {
        C1660 c1660 = this.f5871;
        if (i >= c1660.f5610) {
            return -1;
        }
        return c1660.m3384(i);
    }

    public final void m3508(int i, InterfaceC1754 interfaceC1754) {
        InterfaceC1754 interfaceC1755 = (InterfaceC1754) this.f4836[i];
        m3063(i, interfaceC1754);
        C1660 c1660 = this.f5871;
        if (interfaceC1755 != null) {
            c1660.m3386(interfaceC1755.mo1576(), -1);
        }
        if (interfaceC1754 != null) {
            int iMo1576 = interfaceC1754.mo1576();
            int i2 = c1660.f5610;
            for (int i3 = 0; i3 <= iMo1576 - i2; i3++) {
                c1660.m3382(-1);
            }
            c1660.m3386(iMo1576, i);
        }
    }
}
