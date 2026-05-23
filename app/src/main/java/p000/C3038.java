package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3038 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3038 f9740;

    static {
        C3038 c3038 = new C3038();
        f9740 = c3038;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.cp1Proto", c3038, 10);
        AbstractC2668.m4680(c2360, "live_ad_id", false, 1);
        AbstractC2668.m4680(c2360, "start_time_ms", false, 2);
        AbstractC2668.m4680(c2360, "video_duration_ms", false, 3);
        AbstractC2668.m4680(c2360, "video_url", false, 4);
        AbstractC2668.m4680(c2360, "bg_img_url", false, 5);
        AbstractC2668.m4680(c2360, "end_time_ms", false, 6);
        AbstractC2668.m4680(c2360, "need_watch_multi_entrance_ad", false, 7);
        AbstractC2668.m4680(c2360, "need_preload", false, 8);
        AbstractC2668.m4680(c2360, "preload_percent", false, 9);
        AbstractC2668.m4680(c2360, "show_time_intervals", false, 10);
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
        InterfaceC1758[] interfaceC1758Arr = C3040.f9741;
        
        Integer num = null;
        List list = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1862.f6185, l2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str3);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1862.f6185, l3);
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
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            interfaceC1758Arr = interfaceC1758Arr;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3040(i, str, l, l2, str2, str3, l3, bool, bool2, num, list);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3040.f9741;
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c1862);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[9].getValue())};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3040 c3040 = (C3040) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3040.f9741;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3040.f9742);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3040.f9743);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1862, c3040.f9744);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3040.f9745);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3040.f9746);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1862, c3040.f9747);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c0441, c3040.f9748);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c0441, c3040.f9749);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C1665.f5622, c3040.f9750);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), c3040.f9751);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
