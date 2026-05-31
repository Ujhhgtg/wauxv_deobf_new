package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲈᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3194 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3194 f10156;

    static {
        C3194 c3194 = new C3194();
        f10156 = c3194;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.lk0Proto", c3194, 6);
        AbstractC2647.m4626(c2405, "topicEventId", false, 1);
        AbstractC2647.m4626(c2405, "topicEventName", false, 2);
        AbstractC2647.m4626(c2405, "topicEventCreator", false, 3);
        AbstractC2647.m4626(c2405, "participateCount", false, 4);
        AbstractC2647.m4626(c2405, "displayMask", false, 5);
        AbstractC2647.m4626(c2405, "shareTitle", false, 6);
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
        Integer num = null;
        Long l = null;
        String str4 = null;
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
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1888.f6259, l);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str4);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3196(i, str, str2, str3, num, l, str4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3196 c3196 = (C3196) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3196.f10157);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3196.f10158);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3196.f10159);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1680.f5658, c3196.f10160);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C1888.f6259, c3196.f10161);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3196.f10162);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
