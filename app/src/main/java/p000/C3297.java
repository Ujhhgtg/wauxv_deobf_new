package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3297 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3297 f10469;

    static {
        C3297 c3297 = new C3297();
        f10469 = c3297;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.v40Proto", c3297, 8);
        AbstractC2668.m4680(c2360, "support_custom_text", false, 1);
        AbstractC2668.m4680(c2360, "text_len_limit", false, 2);
        AbstractC2668.m4680(c2360, "price", false, 3);
        AbstractC2668.m4680(c2360, "custom_text", false, 4);
        AbstractC2668.m4680(c2360, "specific_custom_text", false, 5);
        AbstractC2668.m4680(c2360, "antispam_custom_text", false, 6);
        AbstractC2668.m4680(c2360, "name", false, 7);
        AbstractC2668.m4680(c2360, "component_key", false, 8);
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
        Boolean bool = null;
        Integer num = null;
        Float f = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C0441.f2008, bool);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1365.f4873, f);
                    i |= 4;
                    break;
                case 3:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C0441.f2008, bool2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str4);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3299(i, bool, num, f, str, bool2, str2, str3, str4);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C0441 c0441 = C0441.f2008;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c0441);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1665.f5622);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(C1365.f4873);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3299 c3299 = (C3299) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c0441, c3299.f10470);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3299.f10471);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1365.f4873, c3299.f10472);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3299.f10473);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c0441, c3299.f10474);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3299.f10475);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3299.f10476);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3299.f10477);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
