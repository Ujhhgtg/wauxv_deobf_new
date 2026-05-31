package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0763 extends C0427 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC1725 f2865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2866;

    public C0763(C0383 c0383, AbstractC1725 abstractC1725) {
        super(c0383);
        this.f2865 = abstractC1725;
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1777() {
        this.f1993 = true;
        this.f2866++;
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo1779() {
        this.f1993 = false;
        m1785("\n");
        int i = this.f2866;
        for (int i2 = 0; i2 < i; i2++) {
            m1785(this.f2865.f5842.f5863);
        }
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1780() {
        if (this.f1993) {
            this.f1993 = false;
        } else {
            mo1779();
        }
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1789() {
        m1782(' ');
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1790() {
        this.f2866--;
    }
}
