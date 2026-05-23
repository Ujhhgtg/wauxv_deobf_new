package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1004 extends AbstractC0057 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3664;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1004(InterfaceC0877 interfaceC0877, boolean z, int i) {
        super(interfaceC0877, z);
        this.f3664 = i;
    }

    @Override // p000.C1705
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean mo2574(Throwable th) {
        switch (this.f3664) {
            case 1:
                AbstractC3681.m5328(this.f990, th);
                return true;
            default:
                return super.mo2574(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public Object m2575(InterfaceC0842 interfaceC0842) throws Throwable {
        Object obj;
        do {
            obj = C1705.f5796.get(this);
            if (!(obj instanceof InterfaceC1624)) {
                if (obj instanceof C0760) {
                    throw ((C0760) obj).f2861;
                }
                return AbstractC1458.m3171(obj);
            }
        } while (m3465(obj) < 0);
        C1702 c1702 = new C1702(AbstractC2209.m4135(interfaceC0842), this);
        InterfaceC1080 interfaceC1080M1950 = c1702.m1950();
        if (interfaceC1080M1950 != null && !(C0558.f2285.get(c1702) instanceof InterfaceC2229)) {
            interfaceC1080M1950.mo2648();
            C0558.f2286.set(c1702, C2228.f7225);
        }
        AbstractC2207.m4100(c1702, new C0555(1, AbstractC3453.m4999(this, true, new C0686(2, c1702))));
        return c1702.m1949();
    }
}
