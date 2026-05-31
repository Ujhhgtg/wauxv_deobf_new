package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᲈᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3389 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3389 f10699;

    static {
        C3389 c3389 = new C3389();
        f10699 = c3389;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.w52Proto", c3389, 4);
        AbstractC2647.m4626(c2405, "contact", false, 1);
        AbstractC2647.m4626(c2405, "musicInfo", false, 2);
        AbstractC2647.m4626(c2405, "audioTrackUrl", false, 3);
        AbstractC2647.m4626(c2405, "groupId", false, 4);
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
        C3015 c3015 = null;
        C3153 c3153 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                c3015 = (C3015) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C3013.f9623, c3015);
                i |= 1;
            } else if (iMo2331 == 1) {
                c3153 = (C3153) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3151.f10040, c3153);
                i |= 2;
            } else if (iMo2331 == 2) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3391(i, c3015, c3153, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C3013.f9623);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C3151.f10040);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3391 c3391 = (C3391) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C3013.f9623, c3391.f10700);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3151.f10040, c3391.f10701);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3391.f10702);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3391.f10703);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
