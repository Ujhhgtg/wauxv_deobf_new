package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2007 extends AbstractC1641 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0911 f6653;

    public C2007(C0911 c0911) {
        this.f6653 = c0911;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        c1026.f3756.m4004(this.f6653);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5764;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 8;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        int iM3997 = m3997(c1026);
        C0911 c0911 = this.f6653;
        int i = c0911.f3378;
        if (c0496.m1927()) {
            c0496.m1925(0, m3510() + ' ' + c0911.toString());
            c0496.m1925(2, "type:     " + AbstractC2902.m4906(i) + (" // " + C0911.f3377[i]));
            c0496.m1925(2, "reserved: ".concat(AbstractC2902.m4906(0)));
            String str = " // " + c0911.f3379.toString();
            if (C0911.m2543(c0911.f3378)) {
                c0496.m1925(2, "fieldId:  " + AbstractC2902.m4906(iM3997) + str);
            } else {
                c0496.m1925(2, "methodId: " + AbstractC2902.m4906(iM3997) + str);
            }
            c0496.m1925(2, "reserved: ".concat(AbstractC2902.m4906(0)));
        }
        c0496.m1934(i);
        c0496.m1934(0);
        c0496.m1934(m3997(c1026));
        c0496.m1934(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m3997(C1026 c1026) {
        C0911 c0911 = this.f6653;
        InterfaceC3466 interfaceC3466M2539 = c0911.f3379;
        if (C0911.m2543(c0911.f3378)) {
            return c1026.f3751.m3120((C0898) interfaceC3466M2539);
        }
        switch (c0911.f3378) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (interfaceC3466M2539 instanceof C0903) {
                    interfaceC3466M2539 = ((C0903) interfaceC3466M2539).m2539();
                }
                return c1026.f3752.m4008((AbstractC0890) interfaceC3466M2539);
            default:
                throw new IllegalStateException("Unhandled invocation type");
        }
    }
}
