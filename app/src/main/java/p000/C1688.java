package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1688 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1688 f5747;

    static {
        C1688 c1688 = new C1688();
        f5747 = c1688;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.JSLoginResp", c1688, 12);
        c2360.m4338("baseResponse", false);
        c2360.m4339(new C0380(1, 6));
        c2360.m4338("jsapiBaseResp", false);
        c2360.m4339(new C0380(2, 6));
        c2360.m4338("code", false);
        c2360.m4339(new C0380(3, 6));
        c2360.m4338("scopeList", false);
        c2360.m4339(new C0380(4, 6));
        c2360.m4338("appName", false);
        c2360.m4339(new C0380(5, 6));
        c2360.m4338("appIconUrl", false);
        c2360.m4339(new C0380(6, 6));
        c2360.m4338("openid", false);
        c2360.m4339(new C0380(7, 6));
        c2360.m4338("sessionKey", false);
        c2360.m4339(new C0380(8, 6));
        c2360.m4338("sessionTicket", false);
        c2360.m4339(new C0380(9, 6));
        c2360.m4338("lifespan", false);
        c2360.m4339(new C0380(10, 6));
        c2360.m4338("state", false);
        c2360.m4339(new C0380(11, 6));
        c2360.m4338("signature", false);
        c2360.m4339(new C0380(12, 6));
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
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        interfaceC0766Mo2512.getClass();
        Integer num = null;
        String str = null;
        String str2 = null;
        C0383 c0383 = null;
        C1692 c1692 = null;
        String str3 = null;
        C1695 c1695 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    c0383 = (C0383) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C0381.f1783, c0383);
                    i |= 1;
                    continue;
                case 1:
                    c1692 = (C1692) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1690.f5748, c1692);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str3);
                    i |= 4;
                    break;
                case 3:
                    c1695 = (C1695) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1693.f5751, c1695);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str7);
                    i |= 128;
                    break;
                case 8:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str8);
                    i |= bc.e;
                    break;
                case 9:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num);
                    i |= 512;
                    break;
                case 10:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str);
                    i |= 1024;
                    break;
                case 11:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str2);
                    i |= 2048;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            c0383 = c0383;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C1696(i, c0383, c1692, str3, c1695, str4, str5, str6, str7, str8, num, str, str2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C0381.f1783);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1690.f5748);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1693.f5751), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1696 c1696 = (C1696) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C0381.f1783, c1696.f5757);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1690.f5748, c1696.f5758);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c1696.f5759);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C1693.f5751, c1696.f5760);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c1696.f5761);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c1696.f5762);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c1696.f5763);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c1696.f5764);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c1696.f5765);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, C1665.f5622, c1696.f5766);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c1696.f5767);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c1696.f5768);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
