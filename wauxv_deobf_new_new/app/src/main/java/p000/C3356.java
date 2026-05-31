package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3356 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3356 f10636;

    static {
        C3356 c3356 = new C3356();
        f10636 = c3356;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.v40Proto", c3356, 8);
        AbstractC2647.m4626(c2405, "support_custom_text", false, 1);
        AbstractC2647.m4626(c2405, "text_len_limit", false, 2);
        AbstractC2647.m4626(c2405, "price", false, 3);
        AbstractC2647.m4626(c2405, "custom_text", false, 4);
        AbstractC2647.m4626(c2405, "specific_custom_text", false, 5);
        AbstractC2647.m4626(c2405, "antispam_custom_text", false, 6);
        AbstractC2647.m4626(c2405, "name", false, 7);
        AbstractC2647.m4626(c2405, "component_key", false, 8);
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
        Integer num = null;
        Float f = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1372.f4898, f);
                    i |= 4;
                    break;
                case 3:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C0416.f1980, bool2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str2);
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
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3358(i, bool, num, f, str, bool2, str2, str3, str4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C0416 c0416 = C0416.f1980;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c0416);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C1680.f5658);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(C1372.f4898);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3358 c3358 = (C3358) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c0416, c3358.f10637);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1680.f5658, c3358.f10638);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1372.f4898, c3358.f10639);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3358.f10640);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c0416, c3358.f10641);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3358.f10642);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3358.f10643);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3358.f10644);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
