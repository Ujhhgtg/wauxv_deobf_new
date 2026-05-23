package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3029 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3029 f9728;

    static {
        C3029 c3029 = new C3029();
        f9728 = c3029;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.bf1Proto", c3029, 5);
        AbstractC2668.m4680(c2360, "mic_contact", false, 1);
        AbstractC2668.m4680(c2360, "mic_type", false, 2);
        AbstractC2668.m4680(c2360, "mic_sdk_user_id", false, 3);
        AbstractC2668.m4680(c2360, "live_mic_id", false, 4);
        AbstractC2668.m4680(c2360, "mic_seq", false, 5);
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
        C3106 c3106 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                c3106 = (C3106) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C3104.f9908, c3106);
                i |= 1;
            } else if (iMo2230 == 1) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                i |= 2;
            } else if (iMo2230 == 2) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str);
                i |= 4;
            } else if (iMo2230 == 3) {
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str2);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1862.f6185, l);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3031(i, c3106, num, str, str2, l);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C3104.f9908);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1665.f5622);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1862.f6185)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3031 c3031 = (C3031) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C3104.f9908, c3031.f9729);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3031.f9730);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3031.f9731);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3031.f9732);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C1862.f6185, c3031.f9733);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
