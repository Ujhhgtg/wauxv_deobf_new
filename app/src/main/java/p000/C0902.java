package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲇᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0902 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC0777 f3345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3347;

    public C0902(C1089 c1089, C2788 c2788, C2526 c2526, AbstractC0777 abstractC0777) {
        super(c1089, c2788, c2526);
        if (abstractC0777 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f3345 = abstractC0777;
        this.f3346 = -1;
        this.f3347 = -1;
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1343() {
        return this.f3345.mo1214();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String mo2414() {
        if (this.f3346 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f3345.mo2269());
        sb.append('@');
        int i = this.f3346;
        if (i < 65536) {
            sb.append(AbstractC1460.m3223(i));
        } else {
            sb.append(AbstractC1460.m3224(i));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String mo2415() {
        AbstractC0777 abstractC0777 = this.f3345;
        return abstractC0777 instanceof C0917 ? ((C0917) abstractC0777).m2430() : abstractC0777.mo1214();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC0950 mo2416(C1089 c1089) {
        C0902 c0902 = new C0902(c1089, this.f3469, this.f3470, this.f3345);
        int i = this.f3346;
        if (i >= 0) {
            c0902.m2419(i);
        }
        int i2 = this.f3347;
        if (i2 >= 0) {
            c0902.m2418(i2);
        }
        return c0902;
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0950 mo1346(C2526 c2526) {
        C0902 c0902 = new C0902(this.f3468, this.f3469, c2526, this.f3345);
        int i = this.f3346;
        if (i >= 0) {
            c0902.m2419(i);
        }
        int i2 = this.f3347;
        if (i2 >= 0) {
            c0902.m2418(i2);
        }
        return c0902;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m2417() {
        int i = this.f3346;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f3345);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2418(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f3347 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f3347 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2419(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f3346 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f3346 = i;
    }
}
