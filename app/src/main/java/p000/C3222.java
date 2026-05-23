package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3222 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3222 f10255;

    static {
        C3222 c3222 = new C3222();
        f10255 = c3222;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.pk3Proto", c3222, 9);
        AbstractC2668.m4680(c2360, "adaptive_pattern_wording", false, 1);
        AbstractC2668.m4680(c2360, "seat_pattern_wording", false, 2);
        AbstractC2668.m4680(c2360, "leader_pattern_wording", false, 3);
        AbstractC2668.m4680(c2360, "solo_battle_mode_wording", false, 4);
        AbstractC2668.m4680(c2360, "teamup_battle_mode_wording", false, 5);
        AbstractC2668.m4680(c2360, "battle_indicator_reward_heat_wording", false, 6);
        AbstractC2668.m4680(c2360, "battle_indicator_specific_gift_num_wording", false, 7);
        AbstractC2668.m4680(c2360, "audience_solo_battle_pattern_wording", false, 8);
        AbstractC2668.m4680(c2360, "audience_teamup_battle_pattern_wording", false, 9);
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
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
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
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i |= 128;
                    break;
                case 8:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str9);
                    i |= 256;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3224(i, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3224 c3224 = (C3224) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3224.f10256);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3224.f10257);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3224.f10258);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3224.f10259);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3224.f10260);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3224.f10261);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3224.f10262);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3224.f10263);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3224.f10264);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
