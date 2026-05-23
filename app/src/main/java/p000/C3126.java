package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3126 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3126 f9967;

    static {
        C3126 c3126 = new C3126();
        f9967 = c3126;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ko1Proto", c3126, 11);
        AbstractC2668.m4680(c2360, "tab_id", false, 1);
        AbstractC2668.m4680(c2360, "tab_name", false, 2);
        AbstractC2668.m4680(c2360, "prefech_this_tab", false, 3);
        AbstractC2668.m4680(c2360, "prefech_next_tab", false, 4);
        AbstractC2668.m4680(c2360, "prefech_pre_tab", false, 5);
        AbstractC2668.m4680(c2360, "play_voice", false, 6);
        AbstractC2668.m4680(c2360, "sub_tab_list", false, 7);
        AbstractC2668.m4680(c2360, "tab_scene", false, 8);
        AbstractC2668.m4680(c2360, "object_id", false, 9);
        AbstractC2668.m4680(c2360, "icon_url", false, 10);
        AbstractC2668.m4680(c2360, "icon_wording", false, 11);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC1758[] interfaceC1758Arr;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr2 = C3128.f9968;
        
        Long l = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        Integer num2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str3);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C0441.f2008, bool);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C0441.f2008, bool2);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    bool3 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C0441.f2008, bool3);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    bool4 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C0441.f2008, bool4);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num2);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1862.f6185, l);
                    i |= 256;
                    break;
                case 9:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    break;
                case 10:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str2);
                    i |= 1024;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            interfaceC1758Arr2 = interfaceC1758Arr;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3128(i, num, str3, bool, bool2, bool3, bool4, list, num2, l, str, str2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3128.f9968;
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[6].getValue()), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C1862.f6185), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3128 c3128 = (C3128) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3128.f9968;
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3128.f9969);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3128.f9970);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c0441, c3128.f9971);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c0441, c3128.f9972);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c0441, c3128.f9973);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c0441, c3128.f9974);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), c3128.f9975);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3128.f9976);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C1862.f6185, c3128.f9977);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3128.f9978);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3128.f9979);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
