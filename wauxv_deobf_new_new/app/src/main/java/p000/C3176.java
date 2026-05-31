package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᤝᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3176 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3176 f10106;

    static {
        C3176 c3176 = new C3176();
        f10106 = c3176;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.kb3Proto", c3176, 9);
        AbstractC2647.m4626(c2405, "d", false, 1);
        AbstractC2647.m4626(c2405, "e", false, 2);
        AbstractC2647.m4626(c2405, "f", false, 3);
        AbstractC2647.m4626(c2405, "g", false, 4);
        AbstractC2647.m4626(c2405, "n", false, 8);
        AbstractC2647.m4626(c2405, "o", false, 9);
        AbstractC2647.m4626(c2405, "p", false, 10);
        AbstractC2647.m4626(c2405, "q", false, 11);
        AbstractC2647.m4626(c2405, "r", false, 12);
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
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1888.f6259, l);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1888.f6259, l2);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1888.f6259, l3);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str3);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3178(i, num, str, num2, num3, str2, l, l2, l3, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3178 c3178 = (C3178) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3178.f10107);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3178.f10108);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3178.f10109);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3178.f10110);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3178.f10111);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1888, c3178.f10112);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1888, c3178.f10113);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1888, c3178.f10114);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3178.f10115);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
