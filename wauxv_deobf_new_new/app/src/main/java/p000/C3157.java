package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᛸᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3157 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3157 f10065;

    static {
        C3157 c3157 = new C3157();
        f10065 = c3157;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ht1Proto", c3157, 5);
        AbstractC2647.m4626(c2405, "music_mv_topic_id", false, 1);
        AbstractC2647.m4626(c2405, "contact", false, 3);
        AbstractC2647.m4626(c2405, "object_id", false, 4);
        AbstractC2647.m4626(c2405, "object_nonce_id", false, 5);
        AbstractC2647.m4626(c2405, "recommend_reason", false, 6);
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
        C3015 c3015 = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                c3015 = (C3015) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3013.f9623, c3015);
                i |= 2;
            } else if (iMo2331 == 2) {
                num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                i |= 4;
            } else if (iMo2331 == 3) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str2);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3159(i, num, c3015, num2, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C3013.f9623);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3159 c3159 = (C3159) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3159.f10066);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3013.f9623, c3159.f10067);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3159.f10068);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3159.f10069);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3159.f10070);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
