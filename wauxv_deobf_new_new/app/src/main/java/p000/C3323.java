package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᛸᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3323 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3323 f10538;

    static {
        C3323 c3323 = new C3323();
        f10538 = c3323;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sz0Proto", c3323, 6);
        AbstractC2647.m4626(c2405, "appid", false, 1);
        AbstractC2647.m4626(c2405, "path", false, 2);
        AbstractC2647.m4626(c2405, "query", false, 3);
        AbstractC2647.m4626(c2405, "default_url", false, 4);
        AbstractC2647.m4626(c2405, "min_version", false, 5);
        AbstractC2647.m4626(c2405, "is_transparent", false, 6);
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
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
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
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str5);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3325(i, str, str2, str3, str4, str5, num);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3325 c3325 = (C3325) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3325.f10539);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3325.f10540);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3325.f10541);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3325.f10542);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3325.f10543);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1680.f5658, c3325.f10544);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
