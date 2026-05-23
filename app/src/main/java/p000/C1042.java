package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1042 extends C1014 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f3794;

    public C1042(AbstractC3640 abstractC3640) {
        super(abstractC3640);
        if (abstractC3640 instanceof C1564) {
            this.f3705 = 2;
        } else {
            this.f3705 = 3;
        }
    }

    @Override // p000.C1014
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2588(int i) {
        if (this.f3710) {
            return;
        }
        this.f3710 = true;
        this.f3707 = i;
        for (InterfaceC1012 interfaceC1012 : this.f3711) {
            interfaceC1012.mo2003(interfaceC1012);
        }
    }
}
