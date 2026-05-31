package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1777 extends AbstractC1352 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1676 f5924;

    public AbstractC1777(int i) {
        super(i);
        this.f5924 = new C1676(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m3658() {
        C1676 c1676 = this.f5924;
        int i = c1676.f5648 - 1;
        while (i >= 0 && c1676.m3548(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        c1676.m3551(i2);
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m3659(int i) {
        C1676 c1676 = this.f5924;
        if (i >= c1676.f5648) {
            return -1;
        }
        return c1676.m3548(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3660(int i, InterfaceC1776 interfaceC1776) {
        InterfaceC1776 interfaceC1777 = (InterfaceC1776) this.f4833[i];
        m3166(i, interfaceC1776);
        C1676 c1676 = this.f5924;
        if (interfaceC1777 != null) {
            c1676.m3550(interfaceC1777.mo1682(), -1);
        }
        if (interfaceC1776 != null) {
            int iMo1682 = interfaceC1776.mo1682();
            int i2 = c1676.f5648;
            for (int i3 = 0; i3 <= iMo1682 - i2; i3++) {
                c1676.m3546(-1);
            }
            c1676.m3550(iMo1682, i);
        }
    }
}
