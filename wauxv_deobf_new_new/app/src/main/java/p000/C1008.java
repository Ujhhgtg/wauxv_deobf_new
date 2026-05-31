package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1008 extends AbstractC0064 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1008(InterfaceC0876 interfaceC0876, boolean z, int i) {
        super(interfaceC0876, z);
        this.f3680 = i;
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean mo2698(Throwable th) {
        switch (this.f3680) {
            case 1:
                AbstractC2236.m4233(this.f1055, th);
                return true;
            default:
                return super.mo2698(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public Object m2699(InterfaceC0841 interfaceC0841) throws Throwable {
        Object obj;
        do {
            obj = C1723.f5839.get(this);
            if (!(obj instanceof InterfaceC1637)) {
                if (obj instanceof C0757) {
                    throw ((C0757) obj).f2861;
                }
                return AbstractC1272.m3102(obj);
            }
        } while (m3633(obj) < 0);
        C1720 c1720 = new C1720(AbstractC1470.m3365(interfaceC0841), this);
        InterfaceC1085 interfaceC1085M2045 = c1720.m2045();
        if (interfaceC1085M2045 != null && !(C0535.f2241.get(c1720) instanceof InterfaceC2259)) {
            interfaceC1085M2045.mo2774();
            C0535.f2242.set(c1720, C2258.f7344);
        }
        AbstractC1586.m3478(c1720, new C0532(AbstractC1471.m3396(this, true, new C0677(c1720, 2)), 1));
        return c1720.m2044();
    }
}
