package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3315 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3315 f10509;

    static {
        C3315 c3315 = new C3315();
        f10509 = c3315;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.vq0Proto", c3315, 2);
        AbstractC2668.m4680(c2360, "music_info", false, 1);
        AbstractC2668.m4680(c2360, "contact", false, 2);
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
        
        C3094 c3094 = null;
        boolean z = true;
        int i = 0;
        C2956 c2956 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                c3094 = (C3094) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C3092.f9873, c3094);
                i |= 1;
            } else {
                if (iMo2230 != 1) {
                    throw new C3501(iMo2230);
                }
                c2956 = (C2956) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2954.f9456, c2956);
                i |= 2;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3317(i, c3094, c2956);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C3092.f9873), AbstractC2205.m4056(C2954.f9456)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3317 c3317 = (C3317) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C3092.f9873, c3317.f10510);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C2954.f9456, c3317.f10511);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
