package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3104 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3104 f9908;

    static {
        C3104 c3104 = new C3104();
        f9908 = c3104;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.j71Proto", c3104, 16);
        AbstractC2668.m4680(c2360, "contact", false, 1);
        AbstractC2668.m4680(c2360, "enableComment", false, 2);
        AbstractC2668.m4680(c2360, "disableComment", false, 3);
        AbstractC2668.m4680(c2360, "reward_amount_in_heat", false, 4);
        AbstractC2668.m4680(c2360, "live_contact_flag", false, 5);
        AbstractC2668.m4680(c2360, "badge_info", false, 6);
        AbstractC2668.m4680(c2360, "display_nickname", false, 9);
        AbstractC2668.m4680(c2360, "live_identity", false, 10);
        AbstractC2668.m4680(c2360, "live_bg_img_url", false, 11);
        AbstractC2668.m4680(c2360, "disable_personal_msg", false, 13);
        AbstractC2668.m4680(c2360, "badge_infos", false, 14);
        AbstractC2668.m4680(c2360, "consume_coin_amount", false, 15);
        AbstractC2668.m4680(c2360, "intimacy", false, 16);
        AbstractC2668.m4680(c2360, "is_self_for_web", false, 17);
        AbstractC2668.m4680(c2360, "live_heat_value", false, 18);
        AbstractC2668.m4680(c2360, "voice_live_img", false, 19);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        C2956 c2956;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3106.f9909;
        
        String str = null;
        Boolean bool = null;
        Long l = null;
        Integer num = null;
        Boolean bool2 = null;
        List list = null;
        Long l2 = null;
        C3025 c3025 = null;
        Integer num2 = null;
        Integer num3 = null;
        C3197 c3197 = null;
        String str2 = null;
        Integer num4 = null;
        C2956 c2957 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Integer num7 = num2;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    c2956 = c2957;
                    z = false;
                    l = l;
                    num2 = num7;
                    num3 = num3;
                    c2957 = c2956;
                    bool = bool;
                    break;
                case 0:
                    c2956 = (C2956) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2954.f9456, c2957);
                    i |= 1;
                    l = l;
                    num2 = num7;
                    num3 = num3;
                    c2957 = c2956;
                    bool = bool;
                    break;
                case 1:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num5);
                    i |= 2;
                    num6 = num6;
                    num2 = num7;
                    num3 = num3;
                    bool = bool;
                    break;
                case 2:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num6);
                    i |= 4;
                    num2 = num7;
                    num3 = num3;
                    bool = bool;
                    break;
                case 3:
                    bool = bool;
                    num3 = num3;
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num7);
                    i |= 8;
                    num3 = num3;
                    bool = bool;
                    break;
                case 4:
                    bool = bool;
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num3);
                    i |= 16;
                    num2 = num7;
                    bool = bool;
                    break;
                case 5:
                    c3197 = (C3197) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3195.f10213, c3197);
                    i |= 32;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 6:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str2);
                    i |= 64;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 7:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num4);
                    i |= 128;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 8:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str);
                    i |= 256;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 9:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C0441.f2008, bool2);
                    i |= 512;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 10:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, (InterfaceC1743) interfaceC1758Arr[10].getValue(), list);
                    i |= 1024;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 11:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1665.f5622, num);
                    i |= 2048;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 12 /* 12 */:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1862.f6185, l);
                    i |= 4096;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 13:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C0441.f2008, bool);
                    i |= 8192;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 14 /* 14 */:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C1862.f6185, l2);
                    i |= 16384;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 15:
                    c3025 = (C3025) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C3023.f9718, c3025);
                    i |= 32768;
                    num2 = num7;
                    num3 = num3;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Boolean bool3 = bool;
        Integer num8 = num3;
        C2956 c2958 = c2957;
        Integer num9 = num5;
        Integer num10 = num6;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3106(i, c2958, num9, num10, num2, num8, c3197, str2, num4, str, bool2, list, num, l, bool3, l2, c3025);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3106.f9909;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C2954.f9456);
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(C3195.f10213);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40513 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(c2839);
        C0441 c0441 = C0441.f2008;
        InterfaceC1743 interfaceC1743M40515 = AbstractC2205.m4056(c0441);
        InterfaceC1743 interfaceC1743M40516 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[10].getValue());
        InterfaceC1743 interfaceC1743M40517 = AbstractC2205.m4056(c1665);
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, interfaceC1743M40515, interfaceC1743M40516, interfaceC1743M40517, AbstractC2205.m4056(c1862), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c1862), AbstractC2205.m4056(C3023.f9718)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3106 c3106 = (C3106) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3106.f9909;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2954.f9456, c3106.f9910);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3106.f9911);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3106.f9912);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3106.f9913);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3106.f9914);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C3195.f10213, c3106.f9915);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3106.f9916);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3106.f9917);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3106.f9918);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c0441, c3106.f9919);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, (InterfaceC1743) interfaceC1758Arr[10].getValue(), c3106.f9920);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1665, c3106.f9921);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1862, c3106.f9922);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c0441, c3106.f9923);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c1862, c3106.f9924);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, C3023.f9718, c3106.f9925);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
