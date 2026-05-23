package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᲈᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1556 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1425 f5424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1557 f5425;

    public /* synthetic */ C1556(InterfaceC1425 interfaceC1425, AbstractC1557 abstractC1557, int i) {
        this.f5423 = i;
        this.f5424 = interfaceC1425;
        this.f5425 = abstractC1557;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        C1563 c1563 = (C1563) obj;
        switch (this.f5423) {
            case 0:
                if (!this.f5425.mo3264()) {
                    c1563 = null;
                }
                if (c1563 != null) {
                    this.f5424.invoke(c1563);
                }
                break;
            default:
                if (!this.f5425.mo3264()) {
                    c1563 = null;
                }
                if (c1563 != null) {
                    this.f5424.invoke(c1563);
                }
                break;
        }
        return C3497.f10997;
    }
}
