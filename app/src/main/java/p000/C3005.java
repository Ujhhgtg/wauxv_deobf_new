package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3005 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3005 f9675;

    static {
        C3005 c3005 = new C3005();
        f9675 = c3005;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.a22Proto", c3005, 8);
        AbstractC2668.m4680(c2360, "latitudeString", false, 1);
        AbstractC2668.m4680(c2360, "longitudeString", false, 2);
        AbstractC2668.m4680(c2360, "poiName", false, 3);
        AbstractC2668.m4680(c2360, "poiScaleString", false, 4);
        AbstractC2668.m4680(c2360, "address", false, 5);
        AbstractC2668.m4680(c2360, "infoUrl", false, 6);
        AbstractC2668.m4680(c2360, "poiClassifyId", false, 7);
        AbstractC2668.m4680(c2360, "poiCategories", false, 8);
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3007(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3007 c3007 = (C3007) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3007.f9676);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3007.f9677);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3007.f9678);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3007.f9679);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3007.f9680);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3007.f9681);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3007.f9682);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3007.f9683);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
