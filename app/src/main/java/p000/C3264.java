package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3264 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3264 f10371;

    static {
        C3264 c3264 = new C3264();
        f10371 = c3264;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sz0Proto", c3264, 6);
        AbstractC2668.m4680(c2360, "appid", false, 1);
        AbstractC2668.m4680(c2360, "path", false, 2);
        AbstractC2668.m4680(c2360, "query", false, 3);
        AbstractC2668.m4680(c2360, "default_url", false, 4);
        AbstractC2668.m4680(c2360, "min_version", false, 5);
        AbstractC2668.m4680(c2360, "is_transparent", false, 6);
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
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
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
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str5);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3266(i, str, str2, str3, str4, str5, num);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3266 c3266 = (C3266) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3266.f10372);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3266.f10373);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3266.f10374);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3266.f10375);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3266.f10376);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C1665.f5622, c3266.f10377);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
