package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᤝᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3254 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3254 f10380;

    static {
        C3254 c3254 = new C3254();
        f10380 = c3254;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.o51Proto", c3254, 6);
        AbstractC2647.m4626(c2405, "badge_type", false, 1);
        AbstractC2647.m4626(c2405, "badge_img_url", false, 2);
        AbstractC2647.m4626(c2405, "badge_level", false, 3);
        AbstractC2647.m4626(c2405, "background_color", false, 4);
        AbstractC2647.m4626(c2405, "badge_name", false, 5);
        AbstractC2647.m4626(c2405, "transparency", false, 6);
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
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
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
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3256(i, num, num2, num3, str, str2, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3256 c3256 = (C3256) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3256.f10381);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3256.f10382);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3256.f10383);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3256.f10384);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3256.f10385);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3256.f10386);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
