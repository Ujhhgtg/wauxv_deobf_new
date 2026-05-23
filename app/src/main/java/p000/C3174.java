package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3174 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3174 f10168;

    static {
        C3174 c3174 = new C3174();
        f10168 = c3174;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.n84Proto", c3174, 9);
        AbstractC2668.m4680(c2360, "finder_username", false, 1);
        AbstractC2668.m4680(c2360, "reward_wecoin", false, 2);
        AbstractC2668.m4680(c2360, "winning_streak_count", false, 3);
        AbstractC2668.m4680(c2360, "is_accepted", false, 4);
        AbstractC2668.m4680(c2360, "crit_quest_info", false, 5);
        AbstractC2668.m4680(c2360, "extra_reward_wecoin", false, 6);
        AbstractC2668.m4680(c2360, "is_applicant", false, 7);
        AbstractC2668.m4680(c2360, "count", false, 8);
        AbstractC2668.m4680(c2360, "sdk_user_id", false, 11);
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
        Long l = null;
        Integer num = null;
        Boolean bool = null;
        C3149 c3149 = null;
        Long l2 = null;
        Boolean bool2 = null;
        Long l3 = null;
        Long l4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C0441.f2008, bool);
                    i |= 8;
                    break;
                case 4:
                    c3149 = (C3149) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3147.f10022, c3149);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1862.f6185, l2);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C0441.f2008, bool2);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1862.f6185, l3);
                    i |= 128;
                    break;
                case 8:
                    l4 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1862.f6185, l4);
                    i |= 256;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3176(i, str, l, num, bool, c3149, l2, bool2, l3, l4);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C2839.f9108);
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(C1665.f5622);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c0441), AbstractC2205.m4056(C3147.f10022), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3176 c3176 = (C3176) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, c3176.f10169);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3176.f10170);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3176.f10171);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c0441, c3176.f10172);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C3147.f10022, c3176.f10173);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1862, c3176.f10174);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c0441, c3176.f10175);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1862, c3176.f10176);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1862, c3176.f10177);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
