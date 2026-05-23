package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᤞᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3321 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3321 f10517;

    static {
        C3321 c3321 = new C3321();
        f10517 = c3321;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.w10Proto", c3321, 6);
        AbstractC2668.m4680(c2360, "key", false, 1);
        AbstractC2668.m4680(c2360, "name", false, 2);
        AbstractC2668.m4680(c2360, "price", false, 3);
        AbstractC2668.m4680(c2360, "custom_text_disabled", false, 4);
        AbstractC2668.m4680(c2360, "thumbnail", false, 5);
        AbstractC2668.m4680(c2360, "use_pag", false, 6);
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
        
        int i = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Boolean bool = null;
        C3043 c3043 = null;
        Boolean bool2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1365.f4873, f);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C0441.f2008, bool);
                    i |= 8;
                    break;
                case 4:
                    c3043 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3041.f9752, c3043);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C0441.f2008, bool2);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3323(i, str, str2, f, bool, c3043, bool2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(C1365.f4873);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c0441), AbstractC2205.m4056(C3041.f9752), AbstractC2205.m4056(c0441)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3323 c3323 = (C3323) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3323.f10518);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3323.f10519);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1365.f4873, c3323.f10520);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c0441, c3323.f10521);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C3041.f9752, c3323.f10522);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c0441, c3323.f10523);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
