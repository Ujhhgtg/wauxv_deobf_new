package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲀᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1720 extends C0535 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C1008 f5830;

    public C1720(InterfaceC0841 interfaceC0841, C1008 c1008) {
        super(interfaceC0841);
        this.f5830 = c1008;
    }

    @Override // p000.C0535
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final Throwable mo2043(C1723 c1723) {
        Throwable thM3611;
        C1008 c1008 = this.f5830;
        c1008.getClass();
        Object obj = C1723.f5839.get(c1008);
        if (!(obj instanceof C1722) || (thM3611 = ((C1722) obj).m3611()) == null) {
            return obj instanceof C0757 ? ((C0757) obj).f2861 : c1723.mo3608();
        }
        return thM3611;
    }

    @Override // p000.C0535
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final String mo2047() {
        return "AwaitContinuation";
    }
}
