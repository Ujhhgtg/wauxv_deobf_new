package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤞᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3380 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3380 f10684;

    static {
        C3380 c3380 = new C3380();
        f10684 = c3380;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.w10Proto", c3380, 6);
        AbstractC2647.m4626(c2405, "key", false, 1);
        AbstractC2647.m4626(c2405, "name", false, 2);
        AbstractC2647.m4626(c2405, "price", false, 3);
        AbstractC2647.m4626(c2405, "custom_text_disabled", false, 4);
        AbstractC2647.m4626(c2405, "thumbnail", false, 5);
        AbstractC2647.m4626(c2405, "use_pag", false, 6);
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
        String str = null;
        String str2 = null;
        Float f = null;
        Boolean bool = null;
        C3102 c3102 = null;
        Boolean bool2 = null;
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
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1372.f4898, f);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C0416.f1980, bool);
                    i |= 8;
                    break;
                case 4:
                    c3102 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3100.f9919, c3102);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C0416.f1980, bool2);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3382(i, str, str2, f, bool, c3102, bool2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(C1372.f4898);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c0416), AbstractC1471.m3392(C3100.f9919), AbstractC1471.m3392(c0416)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3382 c3382 = (C3382) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3382.f10685);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3382.f10686);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1372.f4898, c3382.f10687);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c0416, c3382.f10688);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C3100.f9919, c3382.f10689);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c0416, c3382.f10690);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
