package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᤞᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2929 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2929 f9394;

    static {
        C2929 c2929 = new C2929();
        f9394 = c2929;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ActionInfoProto", c2929, 12);
        AbstractC2668.m4680(c2360, "type", false, 1);
        AbstractC2668.m4680(c2360, "url", false, 2);
        AbstractC2668.m4680(c2360, "scene", false, 3);
        AbstractC2668.m4680(c2360, "appid", false, 4);
        AbstractC2668.m4680(c2360, "mediaTagName", false, 5);
        AbstractC2668.m4680(c2360, "wordingKey", false, 6);
        AbstractC2668.m4680(c2360, "appMsg", false, 7);
        AbstractC2668.m4680(c2360, "newWordingKey", false, 8);
        AbstractC2668.m4680(c2360, "appActionScene", false, 9);
        AbstractC2668.m4680(c2360, "appJumpWordingKey", false, 10);
        AbstractC2668.m4680(c2360, "installedWording", false, 11);
        AbstractC2668.m4680(c2360, "uninstalledWording", false, 12);
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
        
        C2940 c2940 = null;
        C2943 c2943 = null;
        C2943 c2944 = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C2946 c2946 = null;
        String str5 = null;
        C2934 c2934 = null;
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
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    continue;
                case 1:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
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
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str4);
                    i |= 32;
                    break;
                case 6:
                    c2946 = (C2946) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2944.f9425, c2946);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str5);
                    i |= 128;
                    break;
                case 8:
                    c2934 = (C2934) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2932.f9407, c2934);
                    i |= 256;
                    break;
                case 9:
                    c2940 = (C2940) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2938.f9418, c2940);
                    i |= 512;
                    break;
                case 10:
                    c2943 = (C2943) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2941.f9421, c2943);
                    i |= 1024;
                    break;
                case 11:
                    c2944 = (C2943) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2941.f9421, c2944);
                    i |= 2048;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            num = num;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2931(i, num, str, num2, str2, str3, str4, c2946, str5, c2934, c2940, c2943, c2944);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(C2944.f9425);
        InterfaceC1743 interfaceC1743M40513 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(C2932.f9407);
        InterfaceC1743 interfaceC1743M40515 = AbstractC2205.m4056(C2938.f9418);
        C2941 c2941 = C2941.f9421;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, interfaceC1743M40515, AbstractC2205.m4056(c2941), AbstractC2205.m4056(c2941)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2931 c2931 = (C2931) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c2931.f9395);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c2931.f9396);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c2931.f9397);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c2931.f9398);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c2931.f9399);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c2931.f9400);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C2944.f9425, c2931.f9401);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c2931.f9402);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C2932.f9407, c2931.f9403);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, C2938.f9418, c2931.f9404);
        C2941 c2941 = C2941.f9421;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2941, c2931.f9405);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2941, c2931.f9406);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
