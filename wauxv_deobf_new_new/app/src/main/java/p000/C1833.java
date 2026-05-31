package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1833 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC1831 f6105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f6106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f6107;

    public C1833(AbstractC1831 abstractC1831) {
        this.f6105 = abstractC1831;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo1062(AbstractC0403 abstractC0403) {
        if (!(abstractC0403 instanceof C1838)) {
            return false;
        }
        if (this.f6106 && this.f6107 == 1) {
            this.f6105.f6102 = false;
            this.f6106 = false;
        }
        return true;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        return this.f6105;
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
            this.f6106 = true;
            this.f6107 = 0;
        } else if (this.f6106) {
            this.f6107++;
        }
        return C0404.m1740(c1093.f3923);
    }
}
