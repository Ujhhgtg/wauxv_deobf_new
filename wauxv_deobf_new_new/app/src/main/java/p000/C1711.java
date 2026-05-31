package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1711 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1711 f5794;

    static {
        C1711 c1711 = new C1711();
        f5794 = c1711;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.JSLoginResp.ScopeInfo", c1711, 5);
        c2405.m4350("scope", false);
        c2405.m4351(new C0355(1, 6));
        c2405.m4350("desc", false);
        c2405.m4351(new C0355(2, 6));
        c2405.m4350("authState", false);
        c2405.m4351(new C0355(3, 6));
        c2405.m4350("extDesc", false);
        c2405.m4351(new C0355(4, 6));
        c2405.m4350("authDesc", false);
        c2405.m4351(new C0355(5, 6));
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
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                i |= 1;
            } else if (iMo2331 == 1) {
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str2);
                i |= 2;
            } else if (iMo2331 == 2) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                i |= 4;
            } else if (iMo2331 == 3) {
                str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str3);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str4);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C1713(i, str, str2, num, str3, str4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1713 c1713 = (C1713) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c1713.f5795);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c1713.f5796);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1680.f5658, c1713.f5797);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c1713.f5798);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c1713.f5799);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
