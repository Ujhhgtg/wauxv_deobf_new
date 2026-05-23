package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1976 extends AbstractC1628 {

    public final C0912 f6548;

    public C1976(C0912 c0912) {
        this.f6548 = c0912;
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        c1023.f3749.m3810(this.f6548);
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5721;
    }

    @Override // p000.AbstractC1675
    public final int mo1921() {
        return 8;
    }

    @Override // p000.AbstractC1675
    public final void mo1922(C1023 c1023, C0519 c0519) {
        int iM3803 = m3803(c1023);
        C0912 c0912 = this.f6548;
        int i = c0912.f3371;
        if (c0519.m1833()) {
            c0519.m1831(0, m3346() + ' ' + c0912.toString());
            c0519.m1831(2, "type:     " + AbstractC1460.m3223(i) + (" // " + C0912.f3370[i]));
            c0519.m1831(2, "reserved: ".concat(AbstractC1460.m3223(0)));
            String str = " // " + c0912.f3372.toString();
            if (C0912.m2426(c0912.f3371)) {
                c0519.m1831(2, "fieldId:  " + AbstractC1460.m3223(iM3803) + str);
            } else {
                c0519.m1831(2, "methodId: " + AbstractC1460.m3223(iM3803) + str);
            }
            c0519.m1831(2, "reserved: ".concat(AbstractC1460.m3223(0)));
        }
        c0519.m1840(i);
        c0519.m1840(0);
        c0519.m1840(m3803(c1023));
        c0519.m1840(0);
    }

    public final int m3803(C1023 c1023) {
        C0912 c0912 = this.f6548;
        InterfaceC3407 interfaceC3407M2422 = c0912.f3372;
        if (C0912.m2426(c0912.f3371)) {
            return c1023.f3744.m3017((C0899) interfaceC3407M2422);
        }
        switch (c0912.f3371) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (interfaceC3407M2422 instanceof C0904) {
                    interfaceC3407M2422 = ((C0904) interfaceC3407M2422).m2422();
                }
                return c1023.f3745.m3814((AbstractC0891) interfaceC3407M2422);
            default:
                throw new IllegalStateException("Unhandled invocation type");
        }
    }
}
