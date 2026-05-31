package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲈᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3341 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3341 f10579;

    static {
        C3341 c3341 = new C3341();
        f10579 = c3341;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.u40Proto", c3341, 7);
        AbstractC2647.m4626(c2405, "key", false, 1);
        AbstractC2647.m4626(c2405, "thumbnail", false, 2);
        AbstractC2647.m4626(c2405, "preview", false, 3);
        AbstractC2647.m4626(c2405, "animation", false, 4);
        AbstractC2647.m4626(c2405, "landscape_animation", false, 5);
        AbstractC2647.m4626(c2405, "sign_preview", false, 6);
        AbstractC2647.m4626(c2405, "sign_thumbnail", false, 7);
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
        C3102 c3102 = null;
        C3102 c3103 = null;
        C3102 c3104 = null;
        C3102 c3105 = null;
        C3102 c3106 = null;
        C3102 c3107 = null;
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
                    c3102 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3100.f9919, c3102);
                    i |= 2;
                    break;
                case 2:
                    c3103 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3100.f9919, c3103);
                    i |= 4;
                    break;
                case 3:
                    c3104 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3100.f9919, c3104);
                    i |= 8;
                    break;
                case 4:
                    c3105 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3100.f9919, c3105);
                    i |= 16;
                    break;
                case 5:
                    c3106 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3100.f9919, c3106);
                    i |= 32;
                    break;
                case 6:
                    c3107 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3100.f9919, c3107);
                    i |= 64;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3343(i, str, c3102, c3103, c3104, c3105, c3106, c3107);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C2899.f9270);
        C3100 c3100 = C3100.f9919;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3343 c3343 = (C3343) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C2899.f9270, c3343.f10580);
        C3100 c3100 = C3100.f9919;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c3100, c3343.f10581);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c3100, c3343.f10582);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c3100, c3343.f10583);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c3100, c3343.f10584);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c3100, c3343.f10585);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c3100, c3343.f10586);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
