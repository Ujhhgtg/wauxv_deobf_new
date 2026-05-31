package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1568 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1433 f5455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1569 f5456;

    public /* synthetic */ C1568(InterfaceC1433 interfaceC1433, AbstractC1569 abstractC1569, int i) {
        this.f5454 = i;
        this.f5455 = interfaceC1433;
        this.f5456 = abstractC1569;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        C1574 c1574 = (C1574) obj;
        switch (this.f5454) {
            case 0:
                if (!this.f5456.mo3445()) {
                    c1574 = null;
                }
                if (c1574 != null) {
                    this.f5455.invoke(c1574);
                }
                break;
            default:
                if (!this.f5456.mo3445()) {
                    c1574 = null;
                }
                if (c1574 != null) {
                    this.f5455.invoke(c1574);
                }
                break;
        }
        return C3554.UNIT;
    }
}
