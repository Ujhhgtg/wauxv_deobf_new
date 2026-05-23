package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2932 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2932 f9407;

    static {
        C2932 c2932 = new C2932();
        f9407 = c2932;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.AppActionSceneProto", c2932, 2);
        AbstractC2668.m4680(c2360, "installedActionScene", false, 1);
        AbstractC2668.m4680(c2360, "uninstalledActionScene", false, 2);
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
        
        Integer num = null;
        boolean z = true;
        int i = 0;
        Integer num2 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                i |= 1;
            } else {
                if (iMo2230 != 1) {
                    throw new C3501(iMo2230);
                }
                num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                i |= 2;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2934(i, num, num2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2934 c2934 = (C2934) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c2934.f9408);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c2934.f9409);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
