package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1302 {

    public final C1043 f4728;

    public final C0918 f4729;

    public final int f4730;

    public final C1133 f4731;

    public int f4732;

    public final /* synthetic */ int f4733;

    public final AbstractC1352 f4734;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1302(C1043 c1043, C0918 c0918, int i, C1133 c1133, int i2) {
        this(c1043, c0918, i, c1133, (byte) 0);
        this.f4733 = i2;
        switch (i2) {
            case 1:
                this(c1043, c0918, i, c1133, (byte) 0);
                this.f4734 = new C0442(c1043.f3796.m1817(i));
                break;
            default:
                this.f4734 = new C0442(c1043.f3796.m1817(i));
                break;
        }
    }

    public final String m3019() {
        switch (this.f4733) {
            case 0:
                return "field";
            default:
                return "method";
        }
    }

    public final void m3020() {
        int i;
        if (this.f4732 < 0) {
            switch (this.f4733) {
                case 0:
                    i = 1;
                    break;
                default:
                    i = 2;
                    break;
            }
            C1043 c1043 = this.f4728;
            C0516 c0516 = c1043.f3796;
            int i2 = this.f4730;
            int iM1817 = c0516.m1817(i2);
            int i3 = i2 + 2;
            C0516 c0517 = c1043.f3796;
            c1043.m2613();
            C2815 c2815 = c1043.f3798;
            for (int i4 = 0; i4 < iM1817; i4++) {
                try {
                    int iM1818 = c0517.m1817(i3);
                    int iM1819 = c0517.m1817(i3 + 2);
                    int iM18110 = c0517.m1817(i3 + 4);
                    C0917 c0917 = (C0917) c2815.m4793(iM1819);
                    C0917 c0918 = (C0917) c2815.m4793(iM18110);
                    C0298 c0298 = new C0298(c1043, i, i3 + 6, this.f4731);
                    c0298.m1403();
                    i3 = c0298.f1511;
                    c0298.m1403();
                    C0442 c0442 = (C0442) c0298.f1514;
                    c0442.f6944 = false;
                    m3021(i4, iM1818, new C0914(c0917, c0918), c0442);
                } catch (C2331 e) {
                    e.m2885("...while parsing " + m3019() + "s[" + i4 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C2331 c2331 = new C2331(null, e2);
                    c2331.m2885("...while parsing " + m3019() + "s[" + i4 + "]");
                    throw c2331;
                }
            }
            this.f4732 = i3;
        }
    }

    public final InterfaceC1926 m3021(int i, int i2, C0914 c0914, C0442 c0442) {
        switch (this.f4733) {
            case 0:
                C2816 c2816 = new C2816(this.f4729, i2, c0914, c0442);
                ((C0442) this.f4734).m3063(i, c2816);
                return c2816;
            default:
                C2818 c2818 = new C2818(this.f4729, i2, c0914, c0442);
                ((C0442) this.f4734).m3063(i, c2818);
                return c2818;
        }
    }

    public C1302(C1043 c1043, C0918 c0918, int i, C1133 c1133, byte b) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c1133 != null) {
            this.f4728 = c1043;
            this.f4729 = c0918;
            this.f4730 = i;
            this.f4731 = c1133;
            this.f4732 = -1;
            return;
        }
        throw new NullPointerException("attributeFactory == null");
    }
}
