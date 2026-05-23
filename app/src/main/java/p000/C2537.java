package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲁᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2537 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f8089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f8090;

    public /* synthetic */ C2537(int i, String str, String str2) {
        this.f8088 = i;
        this.f8089 = str;
        this.f8090 = str2;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f8088) {
            case 0:
                C1020 c1020 = (C1020) obj;
                c1020.f3732 = new C2537(1, this.f8089, this.f8090);
                c1020.f3733 = new C2444(27);
                break;
            default:
                C1332 c1332 = (C1332) obj;
                c1332.m3051(this.f8089);
                C0705 c0705 = new C0705(4);
                C2536 c2536 = new C2536(this.f8090, 0);
                C0180 c0180 = new C0180(4);
                c2536.invoke(c0180);
                c0705.f2685 = c0180;
                c1332.f4791 = c0705;
                break;
        }
        return C3497.f10997;
    }
}
