package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3216 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3216 f10241;

    static {
        C3216 c3216 = new C3216();
        f10241 = c3216;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.p61Proto", c3216, 9);
        AbstractC2668.m4680(c2360, "video_quality_level", false, 1);
        AbstractC2668.m4680(c2360, "preload_file_size_percent", false, 2);
        AbstractC2668.m4680(c2360, "preload_file_bytes", false, 3);
        AbstractC2668.m4680(c2360, "file_total_bytes", false, 4);
        AbstractC2668.m4680(c2360, "preload_file_duration_percent", false, 5);
        AbstractC2668.m4680(c2360, "preload_file_duration", false, 6);
        AbstractC2668.m4680(c2360, "preload_file_total_duration", false, 7);
        AbstractC2668.m4680(c2360, "preload_start_time", false, 11);
        AbstractC2668.m4680(c2360, "tag_name", false, 21);
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
        Float f = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l = null;
        String str = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1365.f4873, f);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num3);
                    i |= 8;
                    break;
                case 4:
                    f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1365.f4873, f2);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num4);
                    i |= 32;
                    break;
                case 6:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num5);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1862.f6185, l);
                    i |= 128;
                    break;
                case 8:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str);
                    i |= 256;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3218(i, num, f, num2, num3, f2, num4, num5, l, str);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C1365 c1365 = C1365.f4873;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C1862.f6185), AbstractC2205.m4056(C2839.f9108)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3218 c3218 = (C3218) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3218.f10242);
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1365, c3218.f10243);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3218.f10244);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3218.f10245);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1365, c3218.f10246);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3218.f10247);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3218.f10248);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, C1862.f6185, c3218.f10249);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C2839.f9108, c3218.f10250);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
