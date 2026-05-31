package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᤝᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1839 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1838 f6123 = new C1838();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f6124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f6125;

    public C1839(int i) {
        this.f6124 = i;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo1062(AbstractC0403 abstractC0403) {
        if (!this.f6125) {
            return true;
        }
        AbstractC0403 abstractC0404 = (AbstractC0403) this.f6123.f7333;
        if (!(abstractC0404 instanceof AbstractC1831)) {
            return true;
        }
        ((AbstractC1831) abstractC0404).f6102 = false;
        return true;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        return this.f6123;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo1065() {
        return true;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0404 mo1067(C1093 c1093) {
        if (c1093.f3929) {
            if (this.f6123.f7334 == null) {
                return null;
            }
            AbstractC0403 abstractC0403Mo1064 = c1093.m2783().mo1064();
            this.f6125 = (abstractC0403Mo1064 instanceof C2362) || (abstractC0403Mo1064 instanceof C1838);
            return C0404.m1740(c1093.f3926);
        }
        int i = c1093.f3928;
        int i2 = this.f6124;
        if (i >= i2) {
            return new C0404(-1, c1093.f3924 + i2, false);
        }
        return null;
    }
}
