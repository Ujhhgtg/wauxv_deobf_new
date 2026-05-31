package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0898 extends AbstractC0910 {
    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return this.f3376.m2545();
    }

    @Override // p000.AbstractC0910, p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        int iMo2369 = super.mo2369(abstractC0775);
        return iMo2369 != 0 ? iMo2369 : this.f3376.f3382.compareTo(((C0898) abstractC0775).f3376.f3382);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "field";
    }
}
