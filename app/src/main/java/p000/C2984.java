package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2984 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2984 f9578;

    static {
        C2984 c2984 = new C2984();
        f9578 = c2984;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.SizeProto", c2984, 3);
        AbstractC2668.m4680(c2360, "width", false, 1);
        AbstractC2668.m4680(c2360, "height", false, 2);
        AbstractC2668.m4680(c2360, "totalSize", false, 3);
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
        
        Float f = null;
        boolean z = true;
        int i = 0;
        Float f2 = null;
        Float f3 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1365.f4873, f);
                i |= 1;
            } else if (iMo2230 == 1) {
                f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1365.f4873, f2);
                i |= 2;
            } else {
                if (iMo2230 != 2) {
                    throw new C3501(iMo2230);
                }
                f3 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1365.f4873, f3);
                i |= 4;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2986(i, f, f2, f3);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1365 c1365 = C1365.f4873;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1365)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2986 c2986 = (C2986) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1365, c2986.f9579);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1365, c2986.f9580);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1365, c2986.f9581);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
