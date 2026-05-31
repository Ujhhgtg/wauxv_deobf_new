package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᲀᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3049 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3049 f9793;

    static {
        C3049 c3049 = new C3049();
        f9793 = c3049;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.StreamvideoProto", c3049, 8);
        AbstractC2647.m4626(c2405, "streamvideourl", false, 1);
        AbstractC2647.m4626(c2405, "streamvideototaltime", false, 2);
        AbstractC2647.m4626(c2405, "streamvideowording", false, 3);
        AbstractC2647.m4626(c2405, "streamvideoweburl", false, 4);
        AbstractC2647.m4626(c2405, "streamvideotitle", false, 5);
        AbstractC2647.m4626(c2405, "streamvideothumburl", false, 6);
        AbstractC2647.m4626(c2405, "streamvideoaduxinfo", false, 7);
        AbstractC2647.m4626(c2405, "streamvideopublishid", false, 8);
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
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
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
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str7);
                    i |= 128;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3051(i, str, num, str2, str3, str4, str5, str6, str7);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3051 c3051 = (C3051) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3051.f9794);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1680.f5658, c3051.f9795);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3051.f9796);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3051.f9797);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3051.f9798);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3051.f9799);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3051.f9800);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3051.f9801);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
