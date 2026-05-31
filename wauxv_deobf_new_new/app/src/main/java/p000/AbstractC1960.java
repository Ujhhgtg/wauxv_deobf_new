package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᤝᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1960 extends AbstractC1617 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0910 f6481;

    public AbstractC1960(AbstractC0910 abstractC0910) {
        super(abstractC0910.f3375);
        this.f6481 = abstractC0910;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 8;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        C2008 c2008 = c1026.f3749;
        C2008 c2009 = c1026.f3748;
        AbstractC0910 abstractC0910 = this.f6481;
        C0913 c0913 = abstractC0910.f3376;
        int iM4000 = c2008.m4000(this.f5509);
        int iM3999 = c2009.m3999(c0913.f3381);
        int iMo3118 = mo3118(c1026);
        if (c0496.m1927()) {
            c0496.m1925(0, m3510() + ' ' + abstractC0910.mo1360());
            c0496.m1925(2, "  class_idx: ".concat(AbstractC2902.m4906(iM4000)));
            c0496.m1925(2, String.format("  %-10s %s", mo3119().concat(":"), AbstractC2902.m4906(iMo3118)));
            c0496.m1925(4, "  name_idx:  ".concat(AbstractC2902.m4907(iM3999)));
        }
        c0496.m1934(iM4000);
        c0496.m1934(iMo3118);
        c0496.m1933(iM3999);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public abstract int mo3118(C1026 c1026);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract String mo3119();
}
