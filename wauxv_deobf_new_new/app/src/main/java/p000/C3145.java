package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲀᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3145 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3145 f10028;

    static {
        C3145 c3145 = new C3145();
        f10028 = c3145;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gl1Proto", c3145, 7);
        AbstractC2647.m4626(c2405, "enable_flag", false, 1);
        AbstractC2647.m4626(c2405, "total_target_count", false, 2);
        AbstractC2647.m4626(c2405, "total_cur_count", false, 3);
        AbstractC2647.m4626(c2405, "banner_words", false, 4);
        AbstractC2647.m4626(c2405, "banner_icon_url", false, 5);
        AbstractC2647.m4626(c2405, "wish_list", false, 6);
        AbstractC2647.m4626(c2405, "wish_list_id", false, 7);
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
        Boolean bool = null;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        C3072 c3072 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C0416.f1980, bool);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1888.f6259, l2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str2);
                    i |= 16;
                    break;
                case 5:
                    c3072 = (C3072) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3070.f9856, c3072);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str3);
                    i |= 64;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3147(i, bool, l, l2, str, str2, c3072, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C0416.f1980);
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1888);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C3070.f9856), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3147 c3147 = (C3147) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C0416.f1980, c3147.f10029);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3147.f10030);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1888, c3147.f10031);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3147.f10032);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3147.f10033);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C3070.f9856, c3147.f10034);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3147.f10035);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
