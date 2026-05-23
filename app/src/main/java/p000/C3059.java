package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3059 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3059 f9809;

    static {
        C3059 c3059 = new C3059();
        f9809 = c3059;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ef1Proto", c3059, 2);
        AbstractC2668.m4680(c2360, "live_meet_id", false, 1);
        AbstractC2668.m4680(c2360, "anchor_meet_heat", false, 2);
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
        
        String str = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                i |= 1;
            } else {
                if (iMo2230 != 1) {
                    throw new C3501(iMo2230);
                }
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                i |= 2;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3061(i, str, l);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C2839.f9108), AbstractC2205.m4056(C1862.f6185)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3061 c3061 = (C3061) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, c3061.f9810);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1862.f6185, c3061.f9811);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
