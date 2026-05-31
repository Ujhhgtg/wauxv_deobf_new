package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3058 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3058 f9811;

    static {
        C3058 c3058 = new C3058();
        f9811 = c3058;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.WeappInfoProto", c3058, 9);
        AbstractC2647.m4626(c2405, "appUserName", false, 1);
        AbstractC2647.m4626(c2405, "pagePath", false, 2);
        AbstractC2647.m4626(c2405, "version", false, 3);
        AbstractC2647.m4626(c2405, "debugMode", false, 4);
        AbstractC2647.m4626(c2405, "shareActionId", false, 5);
        AbstractC2647.m4626(c2405, "isGame", false, 6);
        AbstractC2647.m4626(c2405, "messageExtraData", false, 7);
        AbstractC2647.m4626(c2405, "subType", false, 8);
        AbstractC2647.m4626(c2405, "preloadResources", false, 9);
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
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        String str5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str3);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str4);
                    i |= 64;
                    break;
                case 7:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num4);
                    i |= 128;
                    break;
                case 8:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str5);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3060(i, str, str2, num, num2, str3, num3, str4, num4, str5);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3060 c3060 = (C3060) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3060.f9812);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3060.f9813);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3060.f9814);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3060.f9815);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3060.f9816);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3060.f9817);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3060.f9818);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3060.f9819);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3060.f9820);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
