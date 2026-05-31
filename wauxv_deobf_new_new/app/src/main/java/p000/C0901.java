package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0901 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC0775 f3352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f3354;

    public C0901(C1094 c1094, C2848 c2848, C2582 c2582, AbstractC0775 abstractC0775) {
        super(c1094, c2848, c2582);
        if (abstractC0775 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f3352 = abstractC0775;
        this.f3353 = -1;
        this.f3354 = -1;
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        return this.f3352.mo1360();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String mo2531() {
        if (this.f3353 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f3352.mo2371());
        sb.append('@');
        int i = this.f3353;
        if (i < 65536) {
            sb.append(AbstractC2902.m4906(i));
        } else {
            sb.append(AbstractC2902.m4907(i));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String mo2532() {
        AbstractC0775 abstractC0775 = this.f3352;
        return abstractC0775 instanceof C0916 ? ((C0916) abstractC0775).m2547() : abstractC0775.mo1360();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC0953 mo2533(C1094 c1094) {
        C0901 c0901 = new C0901(c1094, this.f3484, this.f3485, this.f3352);
        int i = this.f3353;
        if (i >= 0) {
            c0901.m2536(i);
        }
        int i2 = this.f3354;
        if (i2 >= 0) {
            c0901.m2535(i2);
        }
        return c0901;
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        C0901 c0901 = new C0901(this.f3483, this.f3484, c2582, this.f3352);
        int i = this.f3353;
        if (i >= 0) {
            c0901.m2536(i);
        }
        int i2 = this.f3354;
        if (i2 >= 0) {
            c0901.m2535(i2);
        }
        return c0901;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m2534() {
        int i = this.f3353;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f3352);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2535(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f3354 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f3354 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2536(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f3353 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f3353 = i;
    }
}
