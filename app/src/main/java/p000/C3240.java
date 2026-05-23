package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲈᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3240 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3240 f10285;

    static {
        C3240 c3240 = new C3240();
        f10285 = c3240;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.rj3Proto", c3240, 10);
        AbstractC2668.m4680(c2360, "objectId", false, 1);
        AbstractC2668.m4680(c2360, "username", false, 2);
        AbstractC2668.m4680(c2360, "nickname", false, 3);
        AbstractC2668.m4680(c2360, "avatar", false, 4);
        AbstractC2668.m4680(c2360, "desc", false, 5);
        AbstractC2668.m4680(c2360, "mediaCount", false, 6);
        AbstractC2668.m4680(c2360, "mediaList", false, 7);
        AbstractC2668.m4680(c2360, "objectNonceId", false, 8);
        AbstractC2668.m4680(c2360, "finderId", false, 9);
        AbstractC2668.m4680(c2360, "finderObjectNonceId", false, 10);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC1758[] interfaceC1758Arr;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr2 = C3242.f10286;
        
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num = null;
        List list = null;
        String str8 = null;
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
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str3);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str4);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str5);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str6);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str7);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str);
                    i |= 256;
                    break;
                case 9:
                    interfaceC1758Arr = interfaceC1758Arr2;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str2);
                    i |= 512;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            interfaceC1758Arr2 = interfaceC1758Arr;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3242(i, str3, str4, str5, str6, str7, num, list, str8, str, str2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3242.f10286;
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[6].getValue()), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3242 c3242 = (C3242) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3242.f10286;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3242.f10287);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3242.f10288);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3242.f10289);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3242.f10290);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3242.f10291);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C1665.f5622, c3242.f10292);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), c3242.f10293);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3242.f10294);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3242.f10295);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3242.f10296);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
