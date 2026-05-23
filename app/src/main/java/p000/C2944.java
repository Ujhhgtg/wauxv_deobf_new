package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2944 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2944 f9425;

    static {
        C2944 c2944 = new C2944();
        f9425 = c2944;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.AppMsgProto", c2944, 4);
        AbstractC2668.m4680(c2360, "appid", false, 1);
        AbstractC2668.m4680(c2360, "mediaTagName", false, 2);
        AbstractC2668.m4680(c2360, "messageExt", false, 3);
        AbstractC2668.m4680(c2360, "messageAction", false, 4);
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
                str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str3);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str4);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2946(i, str, str2, str3, str4);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2946 c2946 = (C2946) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c2946.f9426);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c2946.f9427);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2946.f9428);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c2946.f9429);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
