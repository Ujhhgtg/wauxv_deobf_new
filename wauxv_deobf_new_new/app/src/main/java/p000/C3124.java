package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3124 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3124 f9982;

    static {
        C3124 c3124 = new C3124();
        f9982 = c3124;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.f93Proto", c3124, 11);
        AbstractC2647.m4626(c2405, "app_id", false, 1);
        AbstractC2647.m4626(c2405, "path", false, 2);
        AbstractC2647.m4626(c2405, "query", false, 3);
        AbstractC2647.m4626(c2405, "default_url", false, 4);
        AbstractC2647.m4626(c2405, "height_percent", false, 5);
        AbstractC2647.m4626(c2405, "half_height", false, 6);
        AbstractC2647.m4626(c2405, "open_type", false, 7);
        AbstractC2647.m4626(c2405, "is_transparent", false, 8);
        AbstractC2647.m4626(c2405, "is_forbid_rightgesture", false, 9);
        AbstractC2647.m4626(c2405, "mini_version", false, 11);
        AbstractC2647.m4626(c2405, "position", false, 12);
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
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        Float f = null;
        Integer num3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str5);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num2);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1372.f4898, f);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num3);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C0416.f1980, bool);
                    i |= 128;
                    break;
                case 8:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C0416.f1980, bool2);
                    i |= bc.e;
                    break;
                case 9:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num);
                    i |= 1024;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            z = z;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3126(i, str2, str3, str4, str5, num2, f, num3, bool, bool2, str, num);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(C1372.f4898);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c1680);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3126 c3126 = (C3126) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3126.f9983);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3126.f9984);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3126.f9985);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3126.f9986);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3126.f9987);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1372.f4898, c3126.f9988);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3126.f9989);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c0416, c3126.f9990);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c0416, c3126.f9991);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3126.f9992);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3126.f9993);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
