package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3376 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3376 f10633;

    static {
        C3376 c3376 = new C3376();
        f10633 = c3376;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.yq5Proto", c3376, 2);
        AbstractC2668.m4680(c2360, "start_time_ms", false, 1);
        AbstractC2668.m4680(c2360, "end_time_ms", false, 2);
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
        
        Long l = null;
        boolean z = true;
        int i = 0;
        Long l2 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1862.f6185, l);
                i |= 1;
            } else {
                if (iMo2230 != 1) {
                    throw new C3501(iMo2230);
                }
                l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l2);
                i |= 2;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3378(i, l, l2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3378 c3378 = (C3378) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1862, c3378.f10634);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3378.f10635);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
