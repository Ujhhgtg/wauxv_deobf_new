package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᲀᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3550 extends C2697 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ThreadLocal f11145;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3550(InterfaceC0876 interfaceC0876, AbstractC2922 abstractC2922) {
        C3551 c3551 = C3551.f11146;
        super(interfaceC0876.mo1086(c3551) == null ? interfaceC0876.mo1085(c3551) : interfaceC0876, abstractC2922);
        this.f11145 = new ThreadLocal();
        if (abstractC2922.f3256.mo1086(C1139.f4214) instanceof AbstractC0877) {
            return;
        }
        Object objM4910 = AbstractC2902.m4910(interfaceC0876, null);
        AbstractC2902.m4899(interfaceC0876, objM4910);
        m5106(interfaceC0876, objM4910);
    }

    @Override // p000.C2697, p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo2762(Object obj) {
        m5105();
        Object objM3284 = AbstractC1467.m3284(obj);
        AbstractC2922 abstractC2922 = this.f8695;
        InterfaceC0876 interfaceC0876 = abstractC2922.f3256;
        Object objM4910 = AbstractC2902.m4910(interfaceC0876, null);
        C3550 c3550M4189 = objM4910 != AbstractC2902.f9274 ? AbstractC2234.m4189(abstractC2922, interfaceC0876, objM4910) : null;
        try {
            abstractC2922.mo1077(objM3284);
        } finally {
            if (c3550M4189 == null || c3550M4189.m5104()) {
                AbstractC2902.m4899(interfaceC0876, objM4910);
            }
        }
    }

    @Override // p000.C2697
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ */
    public final void mo4668() {
        m5105();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final boolean m5104() {
        boolean z = this.threadLocalIsSet && this.f11145.get() == null;
        this.f11145.remove();
        return !z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void m5105() {
        if (this.threadLocalIsSet) {
            C2348 c2348 = (C2348) this.f11145.get();
            if (c2348 != null) {
                AbstractC2902.m4899((InterfaceC0876) c2348.f7567, c2348.f7568);
            }
            this.f11145.remove();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final void m5106(InterfaceC0876 interfaceC0876, Object obj) {
        this.threadLocalIsSet = true;
        this.f11145.set(new C2348(interfaceC0876, obj));
    }
}
