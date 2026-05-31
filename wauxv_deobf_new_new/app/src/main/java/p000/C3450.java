package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3450 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3450 f10842;

    static {
        C3450 c3450 = new C3450();
        f10842 = c3450;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.zq0Proto", c3450, 12);
        AbstractC2647.m4626(c2405, "feedPrefix", false, 1);
        AbstractC2647.m4626(c2405, "describePrefix", false, 2);
        AbstractC2647.m4626(c2405, "joininTimes", false, 3);
        AbstractC2647.m4626(c2405, "joininButton", false, 4);
        AbstractC2647.m4626(c2405, "pageDescribe", false, 5);
        AbstractC2647.m4626(c2405, "showPageDescribe", false, 6);
        AbstractC2647.m4626(c2405, "showPageNotice", false, 7);
        AbstractC2647.m4626(c2405, "endButton", false, 8);
        AbstractC2647.m4626(c2405, "shareFrom", false, 9);
        AbstractC2647.m4626(c2405, "exitButton", false, 10);
        AbstractC2647.m4626(c2405, "exitHint", false, 11);
        AbstractC2647.m4626(c2405, "custom_joinin_times_wording", false, 12);
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
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str4);
                    i |= 1;
                    continue;
                case 1:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str5);
                    i |= 2;
                    break;
                case 2:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str6);
                    i |= 4;
                    break;
                case 3:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str7);
                    i |= 8;
                    break;
                case 4:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str8);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C0416.f1980, bool);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C0416.f1980, bool2);
                    i |= 64;
                    break;
                case 7:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str9);
                    i |= 128;
                    break;
                case 8:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str10);
                    i |= bc.e;
                    break;
                case 9:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    break;
                case 10:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str2);
                    i |= 1024;
                    break;
                case 11:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str3);
                    i |= 2048;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            str4 = str4;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3452(i, str4, str5, str6, str7, str8, bool, bool2, str9, str10, str, str2, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3452 c3452 = (C3452) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3452.f10843);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3452.f10844);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3452.f10845);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3452.f10846);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3452.f10847);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c0416, c3452.f10848);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c0416, c3452.f10849);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3452.f10850);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3452.f10851);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3452.f10852);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3452.f10853);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3452.f10854);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
