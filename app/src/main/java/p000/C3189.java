package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3189 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3189 f10193;

    static {
        C3189 c3189 = new C3189();
        f10193 = c3189;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.nr5Proto", c3189, 13);
        AbstractC2668.m4680(c2360, "d", false, 1);
        AbstractC2668.m4680(c2360, "e", false, 2);
        AbstractC2668.m4680(c2360, "f", false, 3);
        AbstractC2668.m4680(c2360, "g", false, 4);
        AbstractC2668.m4680(c2360, "h", false, 5);
        AbstractC2668.m4680(c2360, "i", false, 6);
        AbstractC2668.m4680(c2360, "j", false, 7);
        AbstractC2668.m4680(c2360, "n", false, 8);
        AbstractC2668.m4680(c2360, "o", false, 9);
        AbstractC2668.m4680(c2360, "p", false, 10);
        AbstractC2668.m4680(c2360, "q", false, 11);
        AbstractC2668.m4680(c2360, "r", false, 12);
        AbstractC2668.m4680(c2360, "s", false, 13);
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
        String str = null;
        C3320 c3320 = null;
        C3384 c3384 = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        C3269 c3269 = null;
        C3227 c3227 = null;
        C3368 c3368 = null;
        C3275 c3275 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str3 = str2;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    str2 = str3;
                    z = false;
                    i = i;
                    str = str;
                    break;
                case 0:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str3);
                    i |= 1;
                    str = str;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                    i |= 2;
                    str2 = str3;
                    break;
                case 2:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num3);
                    i |= 4;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 3:
                    c3269 = (C3269) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3267.f10378, c3269);
                    i |= 8;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 4:
                    c3227 = (C3227) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3225.f10265, c3227);
                    i |= 16;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 5:
                    c3368 = (C3368) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3366.f10620, c3368);
                    i |= 32;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 6:
                    c3275 = (C3275) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3273.f10403, c3275);
                    i |= 64;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 7:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num4);
                    i |= 128;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 8:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num5);
                    i |= 256;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 9:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num);
                    i |= 512;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 10:
                    c3320 = (C3320) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C3318.f10512, c3320);
                    i |= 1024;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 11:
                    c3384 = (C3384) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C3382.f10661, c3384);
                    i |= 2048;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 12 /* 12 */:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str);
                    i |= 4096;
                    str2 = str3;
                    num2 = num2;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3191(i, str2, num2, num3, c3269, c3227, c3368, c3275, num4, num5, num, c3320, c3384, str);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3267.f10378), AbstractC2205.m4056(C3225.f10265), AbstractC2205.m4056(C3366.f10620), AbstractC2205.m4056(C3273.f10403), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3318.f10512), AbstractC2205.m4056(C3382.f10661), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3191 c3191 = (C3191) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3191.f10194);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3191.f10195);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3191.f10196);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3267.f10378, c3191.f10197);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C3225.f10265, c3191.f10198);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C3366.f10620, c3191.f10199);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C3273.f10403, c3191.f10200);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3191.f10201);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3191.f10202);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3191.f10203);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, C3318.f10512, c3191.f10204);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, C3382.f10661, c3191.f10205);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3191.f10206);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
