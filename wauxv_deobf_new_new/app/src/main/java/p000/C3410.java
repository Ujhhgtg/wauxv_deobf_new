package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3410 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3410 f10733;

    static {
        C3410 c3410 = new C3410();
        f10733 = c3410;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.x12Proto", c3410, 9);
        AbstractC2647.m4626(c2405, "mediaType", false, 1);
        AbstractC2647.m4626(c2405, "url", false, 2);
        AbstractC2647.m4626(c2405, "thumbUrl", false, 3);
        AbstractC2647.m4626(c2405, "width", false, 4);
        AbstractC2647.m4626(c2405, "height", false, 5);
        AbstractC2647.m4626(c2405, "videoPlayDuration", false, 6);
        AbstractC2647.m4626(c2405, "fullCoverUrl", false, 7);
        AbstractC2647.m4626(c2405, "fullClipInset", false, 8);
        AbstractC2647.m4626(c2405, "coverUrl", false, 9);
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
        String str2 = null;
        Float f = null;
        Float f2 = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
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
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                    i |= 4;
                    break;
                case 3:
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1372.f4898, f);
                    i |= 8;
                    break;
                case 4:
                    f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1372.f4898, f2);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str4);
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
        return new C3412(i, num, str, str2, f, f2, num2, str3, str4, str5);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        C1372 c1372 = C1372.f4898;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3412 c3412 = (C3412) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3412.f10734);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3412.f10735);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3412.f10736);
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1372, c3412.f10737);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1372, c3412.f10738);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3412.f10739);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3412.f10740);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3412.f10741);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3412.f10742);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
