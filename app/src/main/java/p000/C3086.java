package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3086 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3086 f9861;

    static {
        C3086 c3086 = new C3086();
        f9861 = c3086;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gl1Proto", c3086, 7);
        AbstractC2668.m4680(c2360, "enable_flag", false, 1);
        AbstractC2668.m4680(c2360, "total_target_count", false, 2);
        AbstractC2668.m4680(c2360, "total_cur_count", false, 3);
        AbstractC2668.m4680(c2360, "banner_words", false, 4);
        AbstractC2668.m4680(c2360, "banner_icon_url", false, 5);
        AbstractC2668.m4680(c2360, "wish_list", false, 6);
        AbstractC2668.m4680(c2360, "wish_list_id", false, 7);
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
        Boolean bool = null;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        C3013 c3013 = null;
        String str3 = null;
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
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1862.f6185, l2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str2);
                    i |= 16;
                    break;
                case 5:
                    c3013 = (C3013) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3011.f9689, c3013);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str3);
                    i |= 64;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3088(i, bool, l, l2, str, str2, c3013, str3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C0441.f2008);
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1862);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C3011.f9689), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3088 c3088 = (C3088) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C0441.f2008, c3088.f9862);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3088.f9863);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1862, c3088.f9864);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3088.f9865);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3088.f9866);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C3011.f9689, c3088.f9867);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3088.f9868);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
