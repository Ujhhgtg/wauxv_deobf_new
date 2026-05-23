package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3493 extends C2636 {
    private volatile boolean threadLocalIsSet;

    public final ThreadLocal f10993;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3493(InterfaceC0877 interfaceC0877, AbstractC2862 abstractC2862) {
        C3494 c3494 = C3494.f10994;
        super(interfaceC0877.mo942(c3494) == null ? interfaceC0877.mo941(c3494) : interfaceC0877, abstractC2862);
        this.f10993 = new ThreadLocal();
        if (abstractC2862.f3249.mo942(C1133.f4202) instanceof AbstractC0878) {
            return;
        }
        Object objM5341 = AbstractC3681.m5341(interfaceC0877, null);
        AbstractC3681.m5337(interfaceC0877, objM5341);
        m5094(interfaceC0877, objM5341);
    }

    @Override // p000.C2636, p000.C1705
    public final void mo2636(Object obj) {
        m5093();
        Object objM3983 = AbstractC2201.m3983(obj);
        AbstractC2862 abstractC2862 = this.f8530;
        InterfaceC0877 interfaceC0877 = abstractC2862.f3249;
        Object objM5341 = AbstractC3681.m5341(interfaceC0877, null);
        C3493 c3493M5012 = objM5341 != AbstractC3681.f11562 ? AbstractC3453.m5012(abstractC2862, interfaceC0877, objM5341) : null;
        try {
            abstractC2862.mo933(objM3983);
        } finally {
            if (c3493M5012 == null || c3493M5012.m5092()) {
                AbstractC3681.m5337(interfaceC0877, objM5341);
            }
        }
    }

    @Override // p000.C2636
    public final void mo4634() {
        m5093();
    }

    public final boolean m5092() {
        boolean z = this.threadLocalIsSet && this.f10993.get() == null;
        this.f10993.remove();
        return !z;
    }

    public final void m5093() {
        if (this.threadLocalIsSet) {
            C2315 c2315 = (C2315) this.f10993.get();
            if (c2315 != null) {
                AbstractC3681.m5337((InterfaceC0877) c2315.f7445, c2315.f7446);
            }
            this.f10993.remove();
        }
    }

    public final void m5094(InterfaceC0877 interfaceC0877, Object obj) {
        this.threadLocalIsSet = true;
        this.f10993.set(new C2315(interfaceC0877, obj));
    }
}
