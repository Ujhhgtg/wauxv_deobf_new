package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᤞᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3136 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3136 f10009;

    static {
        C3136 c3136 = new C3136();
        f10009 = c3136;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.fw3Proto", c3136, 6);
        AbstractC2647.m4626(c2405, "createTime", false, 1);
        AbstractC2647.m4626(c2405, "newlifeInfo", false, 2);
        AbstractC2647.m4626(c2405, "desc", false, 3);
        AbstractC2647.m4626(c2405, "location", false, 4);
        AbstractC2647.m4626(c2405, "commentEggCount", false, 5);
        AbstractC2647.m4626(c2405, "activityType", false, 6);
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
        C3078 c3078 = null;
        C3455 c3455 = null;
        C3319 c3319 = null;
        Integer num2 = null;
        Integer num3 = null;
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
                    c3078 = (C3078) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3076.f9865, c3078);
                    i |= 2;
                    break;
                case 2:
                    c3455 = (C3455) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3453.f10855, c3455);
                    i |= 4;
                    break;
                case 3:
                    c3319 = (C3319) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3317.f10515, c3319);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num2);
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
        return new C3138(i, num, c3078, c3455, c3319, num2, num3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3076.f9865), AbstractC1471.m3392(C3453.f10855), AbstractC1471.m3392(C3317.f10515), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3138 c3138 = (C3138) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3138.f10010);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3076.f9865, c3138.f10011);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C3453.f10855, c3138.f10012);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3317.f10515, c3138.f10013);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3138.f10014);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3138.f10015);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
