package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᛸᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1303 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1046 f4727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0917 f4728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1139 f4730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AbstractC1352 f4733;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1303(C1046 c1046, C0917 c0917, int i, C1139 c1139, int i2) {
        this(c1046, c0917, i, c1139, (byte) 0);
        this.f4732 = i2;
        switch (i2) {
            case 1:
                this(c1046, c0917, i, c1139, (byte) 0);
                this.f4733 = new C0417(c1046.f3803.m1911(i));
                break;
            default:
                this.f4733 = new C0417(c1046.f3803.m1911(i));
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String m3122() {
        switch (this.f4732) {
            case 0:
                return "field";
            default:
                return "method";
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3123() {
        int i;
        if (this.f4731 < 0) {
            switch (this.f4732) {
                case 0:
                    i = 1;
                    break;
                default:
                    i = 2;
                    break;
            }
            C1046 c1046 = this.f4727;
            C0493 c0493 = c1046.f3803;
            int i2 = this.f4729;
            int iM1911 = c0493.m1911(i2);
            int i3 = i2 + 2;
            C0493 c0494 = c1046.f3803;
            c1046.m2737();
            C2875 c2875 = c1046.f3805;
            for (int i4 = 0; i4 < iM1911; i4++) {
                try {
                    int iM1912 = c0494.m1911(i3);
                    int iM1913 = c0494.m1911(i3 + 2);
                    int iM1914 = c0494.m1911(i3 + 4);
                    C0916 c0916 = (C0916) c2875.m4826(iM1913);
                    C0916 c0917 = (C0916) c2875.m4826(iM1914);
                    C0308 c0308 = new C0308(c1046, i, i3 + 6, this.f4730);
                    c0308.m1549();
                    i3 = c0308.f1585;
                    c0308.m1549();
                    C0417 c0417 = (C0417) c0308.f1588;
                    c0417.f7068 = false;
                    m3124(i4, iM1912, new C0913(c0916, c0917), c0417);
                } catch (C2371 e) {
                    e.m3004("...while parsing " + m3122() + "s[" + i4 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C2371 c2371 = new C2371(null, e2);
                    c2371.m3004("...while parsing " + m3122() + "s[" + i4 + "]");
                    throw c2371;
                }
            }
            this.f4731 = i3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1957 m3124(int i, int i2, C0913 c0913, C0417 c0417) {
        switch (this.f4732) {
            case 0:
                C2876 c2876 = new C2876(this.f4728, i2, c0913, c0417);
                ((C0417) this.f4733).m3166(i, c2876);
                return c2876;
            default:
                C2878 c2878 = new C2878(this.f4728, i2, c0913, c0417);
                ((C0417) this.f4733).m3166(i, c2878);
                return c2878;
        }
    }

    public C1303(C1046 c1046, C0917 c0917, int i, C1139 c1139, byte b) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c1139 != null) {
            this.f4727 = c1046;
            this.f4728 = c0917;
            this.f4729 = i;
            this.f4730 = c1139;
            this.f4731 = -1;
            return;
        }
        throw new NullPointerException("attributeFactory == null");
    }
}
