package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤝᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2988 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2988 f9561;

    static {
        C2988 c2988 = new C2988();
        f9561 = c2988;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ActionInfoProto", c2988, 12);
        AbstractC2647.m4626(c2405, "type", false, 1);
        AbstractC2647.m4626(c2405, "url", false, 2);
        AbstractC2647.m4626(c2405, "scene", false, 3);
        AbstractC2647.m4626(c2405, "appid", false, 4);
        AbstractC2647.m4626(c2405, "mediaTagName", false, 5);
        AbstractC2647.m4626(c2405, "wordingKey", false, 6);
        AbstractC2647.m4626(c2405, "appMsg", false, 7);
        AbstractC2647.m4626(c2405, "newWordingKey", false, 8);
        AbstractC2647.m4626(c2405, "appActionScene", false, 9);
        AbstractC2647.m4626(c2405, "appJumpWordingKey", false, 10);
        AbstractC2647.m4626(c2405, "installedWording", false, 11);
        AbstractC2647.m4626(c2405, "uninstalledWording", false, 12);
        descriptor = c2405;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return descriptor;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        C2999 c2999 = null;
        C3002 c3002 = null;
        C3002 c3003 = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C3005 c3005 = null;
        String str5 = null;
        C2993 c2993 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    continue;
                case 1:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str4);
                    i |= 32;
                    break;
                case 6:
                    c3005 = (C3005) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3003.f9592, c3005);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str5);
                    i |= 128;
                    break;
                case 8:
                    c2993 = (C2993) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2991.f9574, c2993);
                    i |= bc.e;
                    break;
                case 9:
                    c2999 = (C2999) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2997.f9585, c2999);
                    i |= 512;
                    break;
                case 10:
                    c3002 = (C3002) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C3000.f9588, c3002);
                    i |= 1024;
                    break;
                case 11:
                    c3003 = (C3002) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C3000.f9588, c3003);
                    i |= 2048;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            num = num;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C2990(i, num, str, num2, str2, str3, str4, c3005, str5, c2993, c2999, c3002, c3003);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(C3003.f9592);
        InterfaceC1767 interfaceC1767M3399 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(C2991.f9574);
        InterfaceC1767 interfaceC1767M33911 = AbstractC1471.m3392(C2997.f9585);
        C3000 c3000 = C3000.f9588;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, interfaceC1767M33911, AbstractC1471.m3392(c3000), AbstractC1471.m3392(c3000)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C2990 c2990 = (C2990) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c2990.f9562);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c2990.f9563);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c2990.f9564);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c2990.f9565);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c2990.f9566);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c2990.f9567);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, C3003.f9592, c2990.f9568);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c2990.f9569);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C2991.f9574, c2990.f9570);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, C2997.f9585, c2990.f9571);
        C3000 c3000 = C3000.f9588;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c3000, c2990.f9572);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c3000, c2990.f9573);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
