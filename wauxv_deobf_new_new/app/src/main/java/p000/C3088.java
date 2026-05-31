package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲀᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3088 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3088 f9895;

    static {
        C3088 c3088 = new C3088();
        f9895 = c3088;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.bf1Proto", c3088, 5);
        AbstractC2647.m4626(c2405, "mic_contact", false, 1);
        AbstractC2647.m4626(c2405, "mic_type", false, 2);
        AbstractC2647.m4626(c2405, "mic_sdk_user_id", false, 3);
        AbstractC2647.m4626(c2405, "live_mic_id", false, 4);
        AbstractC2647.m4626(c2405, "mic_seq", false, 5);
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
        C3166 c3166 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                c3166 = (C3166) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C3164.f10076, c3166);
                i |= 1;
            } else if (iMo2331 == 1) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                i |= 2;
            } else if (iMo2331 == 2) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str);
                i |= 4;
            } else if (iMo2331 == 3) {
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1888.f6259, l);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3090(i, c3166, num, str, str2, l);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C3164.f10076);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C1680.f5658);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1888.f6259)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3090 c3090 = (C3090) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C3164.f10076, c3090.f9896);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1680.f5658, c3090.f9897);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3090.f9898);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3090.f9899);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C1888.f6259, c3090.f9900);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
