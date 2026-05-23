package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3255 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3255 f10344;

    static {
        C3255 c3255 = new C3255();
        f10344 = c3255;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sm0Proto", c3255, 3);
        AbstractC2668.m4680(c2360, "biz_nickname", false, 1);
        AbstractC2668.m4680(c2360, "biz_username", false, 2);
        AbstractC2668.m4680(c2360, "biz_friend_follow_count", false, 3);
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
        String str2 = null;
        Integer num = null;
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
            } else {
                if (iMo2230 != 2) {
                    throw new C3501(iMo2230);
                }
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3257(i, num, str, str2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3257 c3257 = (C3257) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3257.f10345);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3257.f10346);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3257.f10347);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
