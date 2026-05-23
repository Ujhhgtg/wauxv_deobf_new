package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3391 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3391 f10675;

    static {
        C3391 c3391 = new C3391();
        f10675 = c3391;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.zq0Proto", c3391, 12);
        AbstractC2668.m4680(c2360, "feedPrefix", false, 1);
        AbstractC2668.m4680(c2360, "describePrefix", false, 2);
        AbstractC2668.m4680(c2360, "joininTimes", false, 3);
        AbstractC2668.m4680(c2360, "joininButton", false, 4);
        AbstractC2668.m4680(c2360, "pageDescribe", false, 5);
        AbstractC2668.m4680(c2360, "showPageDescribe", false, 6);
        AbstractC2668.m4680(c2360, "showPageNotice", false, 7);
        AbstractC2668.m4680(c2360, "endButton", false, 8);
        AbstractC2668.m4680(c2360, "shareFrom", false, 9);
        AbstractC2668.m4680(c2360, "exitButton", false, 10);
        AbstractC2668.m4680(c2360, "exitHint", false, 11);
        AbstractC2668.m4680(c2360, "custom_joinin_times_wording", false, 12);
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
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str9 = null;
        String str10 = null;
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
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str4);
                    i |= 1;
                    continue;
                case 1:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str5);
                    i |= 2;
                    break;
                case 2:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str6);
                    i |= 4;
                    break;
                case 3:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str7);
                    i |= 8;
                    break;
                case 4:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str8);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C0441.f2008, bool);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C0441.f2008, bool2);
                    i |= 64;
                    break;
                case 7:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str9);
                    i |= 128;
                    break;
                case 8:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str10);
                    i |= bc.e;
                    break;
                case 9:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    break;
                case 10:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str2);
                    i |= 1024;
                    break;
                case 11:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str3);
                    i |= 2048;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            str4 = str4;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3393(i, str4, str5, str6, str7, str8, bool, bool2, str9, str10, str, str2, str3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3393 c3393 = (C3393) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3393.f10676);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3393.f10677);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3393.f10678);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3393.f10679);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3393.f10680);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c0441, c3393.f10681);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c0441, c3393.f10682);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3393.f10683);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3393.f10684);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3393.f10685);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3393.f10686);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3393.f10687);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
