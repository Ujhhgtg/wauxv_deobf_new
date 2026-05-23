package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2990 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2990 f9626;

    static {
        C2990 c2990 = new C2990();
        f9626 = c2990;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.StreamvideoProto", c2990, 8);
        AbstractC2668.m4680(c2360, "streamvideourl", false, 1);
        AbstractC2668.m4680(c2360, "streamvideototaltime", false, 2);
        AbstractC2668.m4680(c2360, "streamvideowording", false, 3);
        AbstractC2668.m4680(c2360, "streamvideoweburl", false, 4);
        AbstractC2668.m4680(c2360, "streamvideotitle", false, 5);
        AbstractC2668.m4680(c2360, "streamvideothumburl", false, 6);
        AbstractC2668.m4680(c2360, "streamvideoaduxinfo", false, 7);
        AbstractC2668.m4680(c2360, "streamvideopublishid", false, 8);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        
        int i = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str7);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2992(i, str, num, str2, str3, str4, str5, str6, str7);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2992 c2992 = (C2992) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c2992.f9627);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c2992.f9628);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2992.f9629);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c2992.f9630);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c2992.f9631);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c2992.f9632);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c2992.f9633);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c2992.f9634);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
