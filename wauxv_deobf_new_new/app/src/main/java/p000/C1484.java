package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲀᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1484 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1484 f5278;

    static {
        C1484 c1484 = new C1484();
        f5278 = c1484;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.other.GmailInfo", c1484, 3);
        c2405.m4350("gmailAcct", false);
        c2405.m4351(new C0355(1, 4));
        c2405.m4350("gmailSwitch", false);
        c2405.m4351(new C0355(2, 4));
        c2405.m4350("gmailErrCode", false);
        c2405.m4351(new C0355(3, 4));
        descriptor = c2405;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return descriptor;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                i |= 1;
            } else if (iMo2331 == 1) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, descriptor);
            throw null;
        }
        C1486 c1486 = new C1486();
        c1486.f5279 = str;
        c1486.f5280 = num;
        c1486.f5281 = num2;
        return c1486;
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C2899.f9270);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1486 c1486 = (C1486) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C2899.f9270, c1486.f5279);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c1486.f5280);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c1486.f5281);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
