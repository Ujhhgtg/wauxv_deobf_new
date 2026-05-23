package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3270 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3270 f10390;

    static {
        C3270 c3270 = new C3270();
        f10390 = c3270;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.t40Proto", c3270, 11);
        AbstractC2668.m4680(c2360, "reward_product_id", false, 1);
        AbstractC2668.m4680(c2360, "business_type", false, 2);
        AbstractC2668.m4680(c2360, "thumbnail_file_url", false, 3);
        AbstractC2668.m4680(c2360, "preview_pag_url", false, 4);
        AbstractC2668.m4680(c2360, "animation_pag_url", false, 5);
        AbstractC2668.m4680(c2360, "thumbnail_file_md5", false, 6);
        AbstractC2668.m4680(c2360, "preview_pag_md5", false, 7);
        AbstractC2668.m4680(c2360, "animation_pag_md5", false, 8);
        AbstractC2668.m4680(c2360, "name", false, 9);
        AbstractC2668.m4680(c2360, "price", false, 10);
        AbstractC2668.m4680(c2360, "gift_type", false, 11);
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
        InterfaceC1758[] interfaceC1758Arr2 = C3272.f10391;
        
        C3043 c3043 = null;
        String str = null;
        Boolean bool = null;
        List list = null;
        C3299 c3299 = null;
        List list2 = null;
        C3043 c3044 = null;
        C3043 c3045 = null;
        C3043 c3046 = null;
        C3043 c3047 = null;
        String str2 = null;
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
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3299 = (C3299) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3297.f10469, c3299);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3044 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3041.f9752, c3044);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3045 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3041.f9752, c3045);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3046 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3041.f9752, c3046);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3047 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3041.f9752, c3047);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str2);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    c3043 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C3041.f9752, c3043);
                    i |= 256;
                    break;
                case 9:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    break;
                case 10:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C0441.f2008, bool);
                    i |= 1024;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            interfaceC1758Arr2 = interfaceC1758Arr;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3272(i, list, c3299, list2, c3044, c3045, c3046, c3047, str2, c3043, str, bool);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3272.f10391;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[0].getValue());
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C3297.f10469);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[2].getValue());
        C3041 c3041 = C3041.f9752;
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c3041);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C0441.f2008)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3272 c3272 = (C3272) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3272.f10391;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), c3272.f10392);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C3297.f10469, c3272.f10393);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), c3272.f10394);
        C3041 c3041 = C3041.f9752;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c3041, c3272.f10395);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c3041, c3272.f10396);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c3041, c3272.f10397);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c3041, c3272.f10398);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3272.f10399);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c3041, c3272.f10400);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3272.f10401);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, C0441.f2008, c3272.f10402);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
