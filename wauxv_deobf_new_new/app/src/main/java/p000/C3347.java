package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᛸᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3347 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3347 f10591;

    static {
        C3347 c3347 = new C3347();
        f10591 = c3347;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.u93Proto", c3347, 6);
        AbstractC2647.m4626(c2405, "is_concert_live", false, 1);
        AbstractC2647.m4626(c2405, "activity_id", false, 2);
        AbstractC2647.m4626(c2405, "topic_id", false, 3);
        AbstractC2647.m4626(c2405, "topic_type", false, 4);
        AbstractC2647.m4626(c2405, "enable_topic", false, 5);
        AbstractC2647.m4626(c2405, "has_ticket", false, 6);
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
        String str = null;
        Long l = null;
        Long l2 = null;
        Boolean bool2 = null;
        Integer num = null;
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
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1888.f6259, l);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1888.f6259, l2);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C0416.f1980, bool2);
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
        return new C3349(i, bool, str, l, l2, bool2, num);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C0416 c0416 = C0416.f1980;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c0416);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C2899.f9270);
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c0416), AbstractC1471.m3392(C1680.f5658)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3349 c3349 = (C3349) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c0416, c3349.f10592);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C2899.f9270, c3349.f10593);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1888, c3349.f10594);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1888, c3349.f10595);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c0416, c3349.f10596);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1680.f5658, c3349.f10597);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
