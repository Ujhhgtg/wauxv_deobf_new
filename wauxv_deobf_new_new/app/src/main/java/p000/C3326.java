package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᤞᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3326 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3326 f10545;

    static {
        C3326 c3326 = new C3326();
        f10545 = c3326;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.t10Proto", c3326, 11);
        AbstractC2647.m4626(c2405, "d", false, 1);
        AbstractC2647.m4626(c2405, "e", false, 2);
        AbstractC2647.m4626(c2405, "f", false, 3);
        AbstractC2647.m4626(c2405, "g", false, 4);
        AbstractC2647.m4626(c2405, "h", false, 5);
        AbstractC2647.m4626(c2405, "i", false, 6);
        AbstractC2647.m4626(c2405, "j", false, 7);
        AbstractC2647.m4626(c2405, "n", false, 8);
        AbstractC2647.m4626(c2405, "o", false, 9);
        AbstractC2647.m4626(c2405, "p", false, 10);
        AbstractC2647.m4626(c2405, "q", false, 11);
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
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num4 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    break;
                case 1:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num3);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str5);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num4);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str6);
                    i |= 128;
                    break;
                case 8:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str7);
                    i |= bc.e;
                    break;
                case 9:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i |= 512;
                    break;
                case 10:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num2);
                    i |= 1024;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            z = z;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3328(i, str, num3, str2, str3, str4, str5, num4, str6, str7, num, num2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3328 c3328 = (C3328) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3328.f10546);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3328.f10547);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3328.f10548);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3328.f10549);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3328.f10550);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3328.f10551);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3328.f10552);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3328.f10553);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3328.f10554);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3328.f10555);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3328.f10556);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
