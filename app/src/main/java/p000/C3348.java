package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3348 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3348 f10554;

    static {
        C3348 c3348 = new C3348();
        f10554 = c3348;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.wqProto", c3348, 11);
        AbstractC2668.m4680(c2360, "d", false, 1);
        AbstractC2668.m4680(c2360, "e", false, 2);
        AbstractC2668.m4680(c2360, "f", false, 3);
        AbstractC2668.m4680(c2360, "g", false, 4);
        AbstractC2668.m4680(c2360, "h", false, 5);
        AbstractC2668.m4680(c2360, "i", false, 6);
        AbstractC2668.m4680(c2360, "j", false, 7);
        AbstractC2668.m4680(c2360, "n", false, 8);
        AbstractC2668.m4680(c2360, "p", false, 10);
        AbstractC2668.m4680(c2360, "q", false, 11);
        AbstractC2668.m4680(c2360, "r", false, 12);
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
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str4 = null;
        Integer num7 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num2);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num3);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str4);
                    i |= 128;
                    break;
                case 8:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num7);
                    i |= 256;
                    break;
                case 9:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num);
                    i |= 1024;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            z = true;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3350(i, num2, str2, num3, str3, num4, num5, num6, str4, num7, str, num);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3350 c3350 = (C3350) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3350.f10555);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3350.f10556);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3350.f10557);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3350.f10558);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3350.f10559);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3350.f10560);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3350.f10561);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3350.f10562);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3350.f10563);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3350.f10564);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3350.f10565);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
