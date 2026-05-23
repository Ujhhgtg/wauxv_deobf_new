package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲇᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1043 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0516 f3796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f3797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2815 f3798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0918 f3800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0918 f3801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC3454 f3802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0442 f3803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0442 f3804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0442 f3805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1133 f3806;

    public C1043(String str, byte[] bArr) {
        C0516 c0516 = new C0516(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f3795 = str;
        this.f3796 = c0516;
        this.f3797 = true;
        this.f3799 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2610() {
        String str = this.f3795;
        try {
            m2611();
        } catch (C2331 e) {
            e.m2885("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C2331 c2331 = new C2331(null, e2);
            c2331.m2885("...while parsing " + str);
            throw c2331;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2611() {
        AbstractC0777 abstractC0777M4793;
        InterfaceC3454 c0221;
        C0516 c0516 = this.f3796;
        if (c0516.f2191 < 10) {
            throw new C2331("severely truncated class file", null);
        }
        boolean z = this.f3797;
        if (z) {
            if (c0516.m1812(0) != -889275714) {
                throw new C2331("bad class file magic (" + AbstractC1460.m3224(c0516.m1812(0)) + ")", null);
            }
            int iM1817 = c0516.m1817(4);
            int iM1818 = c0516.m1817(6);
            if (iM1817 < 0 || (iM1818 != 53 ? iM1818 >= 53 || iM1818 < 45 : iM1817 > 0)) {
                throw new C2331("unsupported class file version " + c0516.m1817(6) + "." + c0516.m1817(4), null);
            }
        }
        C0662 c0662 = new C0662(c0516);
        c0662.m2057();
        C2815 c2815 = (C2815) c0662.f2531;
        this.f3798 = c2815;
        c2815.f6944 = false;
        c0662.m2057();
        int i = c0662.f2529;
        int iM1819 = c0516.m1817(i);
        this.f3800 = (C0918) this.f3798.m4793(c0516.m1817(i + 2));
        int iM18110 = c0516.m1817(i + 4);
        C2815 c2816 = this.f3798;
        if (iM18110 == 0) {
            
            abstractC0777M4793 = null;
        } else {
            abstractC0777M4793 = c2816.m4793(iM18110);
        }
        this.f3801 = (C0918) abstractC0777M4793;
        int iM18111 = c0516.m1817(i + 6);
        int i2 = i + 8;
        if (iM18111 == 0) {
            c0221 = C2819.f9030;
        } else {
            C2815 c2817 = this.f3798;
            if (c2817 == null) {
                throw new IllegalStateException("pool not yet initialized");
            }
            c0221 = new C0221(c0516, i2, iM18111, c2817);
        }
        this.f3802 = c0221;
        int i3 = (iM18111 * 2) + i2;
        if (z) {
            String strM4967 = this.f3800.f3401.m4967();
            String str = this.f3795;
            if (!str.endsWith(".class") || !str.startsWith(strM4967) || str.length() != strM4967.length() + 6) {
                throw new C2331("class name (" + strM4967 + ") does not match path (" + str + ")", null);
            }
        }
        this.f3799 = iM1819;
        C1302 c1302 = new C1302(this, this.f3800, i3, this.f3806, 0);
        c1302.m3020();
        this.f3803 = (C0442) c1302.f4734;
        c1302.m3020();
        C1302 c1303 = new C1302(this, this.f3800, c1302.f4732, this.f3806, 1);
        c1303.m3020();
        this.f3804 = (C0442) c1303.f4734;
        c1303.m3020();
        C0298 c0298 = new C0298(this, 0, c1303.f4732, this.f3806);
        c0298.m1403();
        C0442 c0442 = (C0442) c0298.f1514;
        this.f3805 = c0442;
        c0442.f6944 = false;
        c0298.m1403();
        int i4 = c0298.f1511;
        if (i4 != c0516.f2191) {
            throw new C2331("extra bytes at end of class file, at offset ".concat(AbstractC1460.m3224(i4)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2612() {
        if (this.f3805 == null) {
            m2610();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2613() {
        if (this.f3799 == -1) {
            m2610();
        }
    }
}
