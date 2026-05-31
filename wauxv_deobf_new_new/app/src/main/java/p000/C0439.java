package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᤝᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0439 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2023;

    public /* synthetic */ C0439(Object obj, int i) {
        this.f2022 = i;
        this.f2023 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲈᤝᲁᤞ] */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        int i = this.f2022;
        ?? r1 = this.f2023;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                int i2 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(r1).m3560();
                c2004M3560.f6475 = "onTabClick";
                ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(num);
                return C3554.UNIT;
            default:
                int iIntValue = num.intValue();
                return r1.mo3642(iIntValue) + ": " + r1.mo3644(iIntValue).mo1488();
        }
    }
}
