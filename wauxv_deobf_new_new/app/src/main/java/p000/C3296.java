package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤝᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3296 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3296 f10445;

    static {
        C3296 c3296 = new C3296();
        f10445 = c3296;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.qj3Proto", c3296, 6);
        AbstractC2647.m4626(c2405, "url", false, 1);
        AbstractC2647.m4626(c2405, "thumbUrl", false, 2);
        AbstractC2647.m4626(c2405, "width", false, 3);
        AbstractC2647.m4626(c2405, "height", false, 4);
        AbstractC2647.m4626(c2405, "coverUrl", false, 5);
        AbstractC2647.m4626(c2405, "videoPlayDuration", false, 6);
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
        Float f2 = null;
        String str3 = null;
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
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1372.f4898, f);
                    i |= 4;
                    break;
                case 3:
                    f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1372.f4898, f2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str3);
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
        return new C3298(i, str, str2, f, f2, str3, num);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        C1372 c1372 = C1372.f4898;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1372), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3298 c3298 = (C3298) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3298.f10446);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3298.f10447);
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1372, c3298.f10448);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1372, c3298.f10449);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3298.f10450);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1680.f5658, c3298.f10451);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
