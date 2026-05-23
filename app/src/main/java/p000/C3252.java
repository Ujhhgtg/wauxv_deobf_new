package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3252 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3252 f10339;

    static {
        C3252 c3252 = new C3252();
        f10339 = c3252;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sf0Proto", c3252, 4);
        AbstractC2668.m4680(c2360, "diff_extra_count", false, 1);
        AbstractC2668.m4680(c2360, "total_extra_count", false, 2);
        AbstractC2668.m4680(c2360, "type", false, 3);
        AbstractC2668.m4680(c2360, "need_display_diff", false, 4);
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
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1862.f6185, l);
                i |= 1;
            } else if (iMo2230 == 1) {
                l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l2);
                i |= 2;
            } else if (iMo2230 == 2) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C0441.f2008, bool);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3254(i, l, l2, num, bool);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(C0441.f2008)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3254 c3254 = (C3254) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1862, c3254.f10340);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3254.f10341);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3254.f10342);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C0441.f2008, c3254.f10343);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
