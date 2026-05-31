package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1045 extends C1017 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f3801;

    public C1045(AbstractC3700 abstractC3700) {
        super(abstractC3700);
        if (abstractC3700 instanceof C1575) {
            this.f3712 = 2;
        } else {
            this.f3712 = 3;
        }
    }

    @Override // p000.C1017
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2712(int i) {
        if (this.f3717) {
            return;
        }
        this.f3717 = true;
        this.f3714 = i;
        for (InterfaceC1015 interfaceC1015 : this.f3718) {
            interfaceC1015.mo2100(interfaceC1015);
        }
    }
}
