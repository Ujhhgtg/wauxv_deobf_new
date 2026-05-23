package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3147 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3147 f10022;

    static {
        C3147 c3147 = new C3147();
        f10022 = c3147;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.m40Proto", c3147, 12);
        AbstractC2668.m4680(c2360, "start_time", false, 1);
        AbstractC2668.m4680(c2360, "end_time", false, 2);
        AbstractC2668.m4680(c2360, "quest_duration", false, 3);
        AbstractC2668.m4680(c2360, "time_interval_before_quest", false, 4);
        AbstractC2668.m4680(c2360, "progress", false, 5);
        AbstractC2668.m4680(c2360, "reward", false, 6);
        AbstractC2668.m4680(c2360, "delivery_crit_quest", false, 7);
        AbstractC2668.m4680(c2360, "is_crit_quest_accomplished", false, 8);
        AbstractC2668.m4680(c2360, "current_stage", false, 9);
        AbstractC2668.m4680(c2360, "stage_time_left", false, 10);
        AbstractC2668.m4680(c2360, "current_stage_duration", false, 11);
        AbstractC2668.m4680(c2360, "crit_quest_id", false, 12);
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
        InterfaceC1758[] interfaceC1758Arr = C3149.f10023;
        
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        Long l2 = null;
        Integer num4 = null;
        Integer num5 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            interfaceC1758Arr = interfaceC1758Arr;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1862.f6185, l);
                    i |= 1;
                    continue;
                case 1:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l2);
                    i |= 2;
                    break;
                case 2:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num4);
                    i |= 4;
                    break;
                case 3:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num5);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C0441.f2008, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C0441.f2008, bool2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num);
                    i |= 256;
                    break;
                case 9:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num2);
                    i |= 512;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num3);
                    i |= 1024;
                    break;
                case 11:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str);
                    i |= 2048;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            l = l;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3149(i, l, l2, num4, num5, list, list2, bool, bool2, num, num2, num3, str);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3149.f10023;
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[4].getValue());
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[5].getValue());
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C2839.f9108)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3149 c3149 = (C3149) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3149.f10023;
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1862, c3149.f10024);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3149.f10025);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3149.f10026);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3149.f10027);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), c3149.f10028);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), c3149.f10029);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c0441, c3149.f10030);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c0441, c3149.f10031);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3149.f10032);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3149.f10033);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3149.f10034);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, C2839.f9108, c3149.f10035);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
