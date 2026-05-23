package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0464 implements InterfaceC1425 {

    public final /* synthetic */ int f2050;

    public final /* synthetic */ Object f2051;

    public /* synthetic */ C0464(int i, Object obj) {
        this.f2050 = i;
        this.f2051 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤞᛸᲈᤝ] */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        int i = this.f2050;
        ?? r1 = this.f2051;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                int i2 = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(r1).m3492();
                c1973M3492.name = "onTabClick";
                ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).m3831(num);
                return Unit.INSTANCE;
            default:
                int iIntValue = num.intValue();
                return r1.mo3474(iIntValue) + ": " + r1.mo3476(iIntValue).mo1342();
        }
    }
}
