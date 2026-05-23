package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3300 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3300 f10478;

    static {
        C3300 c3300 = new C3300();
        f10478 = c3300;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.v51Proto", c3300, 14);
        AbstractC2668.m4680(c2360, "battle_id", false, 1);
        AbstractC2668.m4680(c2360, "battle_seq", false, 2);
        AbstractC2668.m4680(c2360, "status", false, 3);
        AbstractC2668.m4680(c2360, "time_left", false, 4);
        AbstractC2668.m4680(c2360, "player_info", false, 6);
        AbstractC2668.m4680(c2360, "result", false, 7);
        AbstractC2668.m4680(c2360, "delay_ms", false, 8);
        AbstractC2668.m4680(c2360, "battle_type", false, 9);
        AbstractC2668.m4680(c2360, "battle_mode", false, 10);
        AbstractC2668.m4680(c2360, "battle_teams", false, 11);
        AbstractC2668.m4680(c2360, "indicator_type", false, 12);
        AbstractC2668.m4680(c2360, "extra_info", false, 14);
        AbstractC2668.m4680(c2360, "battle_scope", false, 15);
        AbstractC2668.m4680(c2360, "is_disable_next_battle", false, 16);
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
        InterfaceC1758[] interfaceC1758Arr = C3302.f10479;
        
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        C3287 c3287 = null;
        List list = null;
        Integer num3 = null;
        Long l = null;
        Integer num4 = null;
        Integer num5 = null;
        List list2 = null;
        Integer num6 = null;
        Long l2 = null;
        Integer num7 = null;
        String str = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Long l3 = l;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    l = l3;
                    num2 = num2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    l = l3;
                    num2 = num2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    num4 = num4;
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l3);
                    i |= 2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num4);
                    i |= 4;
                    l = l3;
                    bool = bool;
                    break;
                case 3:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num5);
                    i |= 8;
                    l = l3;
                    num4 = num4;
                    break;
                case 4:
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), list2);
                    i |= 16;
                    l = l3;
                    num4 = num4;
                    break;
                case 5:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num6);
                    i |= 32;
                    l = l3;
                    num4 = num4;
                    break;
                case 6:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1862.f6185, l2);
                    i |= 64;
                    l = l3;
                    num4 = num4;
                    break;
                case 7:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num7);
                    i |= 128;
                    l = l3;
                    num4 = num4;
                    break;
                case 8:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num);
                    i |= 256;
                    l = l3;
                    num4 = num4;
                    break;
                case 9:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), list);
                    i |= 512;
                    l = l3;
                    num4 = num4;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num3);
                    i |= 1024;
                    l = l3;
                    num4 = num4;
                    break;
                case 11:
                    c3287 = (C3287) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C3285.f10420, c3287);
                    i |= 2048;
                    l = l3;
                    num4 = num4;
                    break;
                case 12 /* 12 */:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1665.f5622, num2);
                    i |= 4096;
                    l = l3;
                    num4 = num4;
                    break;
                case 13:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C0441.f2008, bool);
                    i |= 8192;
                    l = l3;
                    num4 = num4;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Boolean bool2 = bool;
        Integer num8 = num4;
        String str2 = str;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3302(i, str2, l, num8, num5, list2, num6, l2, num7, num, list, num3, c3287, num2, bool2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3302.f10479;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C2839.f9108);
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[4].getValue()), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[9].getValue()), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3285.f10420), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C0441.f2008)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3302 c3302 = (C3302) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3302.f10479;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, c3302.f10480);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3302.f10481);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3302.f10482);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3302.f10483);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), c3302.f10484);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3302.f10485);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1862, c3302.f10486);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3302.f10487);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3302.f10488);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), c3302.f10489);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3302.f10490);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, C3285.f10420, c3302.f10491);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1665, c3302.f10492);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, C0441.f2008, c3302.f10493);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
