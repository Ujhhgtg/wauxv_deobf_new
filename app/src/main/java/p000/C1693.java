package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲁᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1693 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1693 f5751;

    static {
        C1693 c1693 = new C1693();
        f5751 = c1693;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.JSLoginResp.ScopeInfo", c1693, 5);
        c2360.m4338("scope", false);
        c2360.m4339(new C0380(1, 6));
        c2360.m4338("desc", false);
        c2360.m4339(new C0380(2, 6));
        c2360.m4338("authState", false);
        c2360.m4339(new C0380(3, 6));
        c2360.m4338("extDesc", false);
        c2360.m4339(new C0380(4, 6));
        c2360.m4338("authDesc", false);
        c2360.m4339(new C0380(5, 6));
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        interfaceC0766Mo2512.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                i |= 1;
            } else if (iMo2230 == 1) {
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                i |= 2;
            } else if (iMo2230 == 2) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            } else if (iMo2230 == 3) {
                str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str4);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C1695(i, str, str2, num, str3, str4);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1695 c1695 = (C1695) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c1695.f5752);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c1695.f5753);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c1695.f5754);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c1695.f5755);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c1695.f5756);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
