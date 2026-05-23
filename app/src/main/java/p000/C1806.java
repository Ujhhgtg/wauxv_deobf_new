package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᤝᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1806 extends AbstractC0054 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC1804 f6030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f6031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f6032;

    public C1806(AbstractC1804 abstractC1804) {
        this.f6030 = abstractC1804;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo918(AbstractC0428 abstractC0428) {
        if (!(abstractC0428 instanceof C1811)) {
            return false;
        }
        if (this.f6031 && this.f6032 == 1) {
            this.f6030.f6027 = false;
            this.f6031 = false;
        }
        return true;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0428 mo920() {
        return this.f6030;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo921() {
        return true;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0429 mo923(C1088 c1088) {
        if (c1088.f3918) {
            this.f6031 = true;
            this.f6032 = 0;
        } else if (this.f6031) {
            this.f6032++;
        }
        return C0429.m1634(c1088.f3912);
    }
}
