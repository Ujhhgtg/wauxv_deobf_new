package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0493 f3803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f3804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2875 f3805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0917 f3807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0917 f3808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC3510 f3809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0417 f3810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0417 f3811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0417 f3812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C1139 f3813;

    public C1046(String str, byte[] bArr) {
        C0493 c0493 = new C0493(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f3802 = str;
        this.f3803 = c0493;
        this.f3804 = true;
        this.f3806 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2734() {
        String str = this.f3802;
        try {
            m2735();
        } catch (C2371 e) {
            e.m3004("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C2371 c2371 = new C2371(null, e2);
            c2371.m3004("...while parsing " + str);
            throw c2371;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2735() {
        AbstractC0775 abstractC0775M4826;
        InterfaceC3510 c0231;
        C0493 c0493 = this.f3803;
        if (c0493.f2147 < 10) {
            throw new C2371("severely truncated class file", null);
        }
        boolean z = this.f3804;
        if (z) {
            if (c0493.m1906(0) != -889275714) {
                throw new C2371("bad class file magic (" + AbstractC2902.m4907(c0493.m1906(0)) + ")", null);
            }
            int iM1911 = c0493.m1911(4);
            int iM1912 = c0493.m1911(6);
            if (iM1911 < 0 || (iM1912 != 53 ? iM1912 >= 53 || iM1912 < 45 : iM1911 > 0)) {
                throw new C2371("unsupported class file version " + c0493.m1911(6) + "." + c0493.m1911(4), null);
            }
        }
        C0776 c0776 = new C0776(c0493);
        c0776.m2381();
        C2875 c2875 = (C2875) c0776.f2880;
        this.f3805 = c2875;
        c2875.f7068 = false;
        c0776.m2381();
        int i = c0776.f2878;
        int iM1913 = c0493.m1911(i);
        this.f3807 = (C0917) this.f3805.m4826(c0493.m1911(i + 2));
        int iM1914 = c0493.m1911(i + 4);
        C2875 c2876 = this.f3805;
        if (iM1914 == 0) {
            c2876.getClass();
            abstractC0775M4826 = null;
        } else {
            abstractC0775M4826 = c2876.m4826(iM1914);
        }
        this.f3808 = (C0917) abstractC0775M4826;
        int iM1915 = c0493.m1911(i + 6);
        int i2 = i + 8;
        if (iM1915 == 0) {
            c0231 = C2879.f9192;
        } else {
            C2875 c2877 = this.f3805;
            if (c2877 == null) {
                throw new IllegalStateException("pool not yet initialized");
            }
            c0231 = new C0231(c0493, i2, iM1915, c2877);
        }
        this.f3809 = c0231;
        int i3 = (iM1915 * 2) + i2;
        if (z) {
            String strM5029 = this.f3807.f3408.m5029();
            String str = this.f3802;
            if (!str.endsWith(".class") || !str.startsWith(strM5029) || str.length() != strM5029.length() + 6) {
                throw new C2371("class name (" + strM5029 + ") does not match path (" + str + ")", null);
            }
        }
        this.f3806 = iM1913;
        C1303 c1303 = new C1303(this, this.f3807, i3, this.f3813, 0);
        c1303.m3123();
        this.f3810 = (C0417) c1303.f4733;
        c1303.m3123();
        C1303 c1304 = new C1303(this, this.f3807, c1303.f4731, this.f3813, 1);
        c1304.m3123();
        this.f3811 = (C0417) c1304.f4733;
        c1304.m3123();
        C0308 c0308 = new C0308(this, 0, c1304.f4731, this.f3813);
        c0308.m1549();
        C0417 c0417 = (C0417) c0308.f1588;
        this.f3812 = c0417;
        c0417.f7068 = false;
        c0308.m1549();
        int i4 = c0308.f1585;
        if (i4 != c0493.f2147) {
            throw new C2371("extra bytes at end of class file, at offset ".concat(AbstractC2902.m4907(i4)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2736() {
        if (this.f3812 == null) {
            m2734();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2737() {
        if (this.f3806 == -1) {
            m2734();
        }
    }
}
