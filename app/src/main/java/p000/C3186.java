package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3186 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3186 f10191;

    static {
        C3186 c3186 = new C3186();
        f10191 = c3186;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.nl1Proto", c3186, 1);
        AbstractC2668.m4680(c2360, "screen_orientation", false, 1);
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
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else {
                if (iMo2230 != 0) {
                    throw new C3501(iMo2230);
                }
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                i = 1;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3188(i, num);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C1665.f5622, ((C3188) obj).f10192);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
