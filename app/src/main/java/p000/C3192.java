package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3192 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3192 f10207;

    static {
        C3192 c3192 = new C3192();
        f10207 = c3192;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.o22Proto", c3192, 5);
        AbstractC2668.m4680(c2360, "contact", false, 1);
        AbstractC2668.m4680(c2360, "enable_click_author", false, 2);
        AbstractC2668.m4680(c2360, "h5_url", false, 3);
        AbstractC2668.m4680(c2360, "friend_data", false, 4);
        AbstractC2668.m4680(c2360, "lite_app_param", false, 5);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        interfaceC0766Mo2512.getClass();
        int i = 0;
        C2956 c2956 = null;
        Integer num = null;
        String str = null;
        C3076 c3076 = null;
        C3266 c3266 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                c2956 = (C2956) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2954.f9456, c2956);
                i |= 1;
            } else if (iMo2230 == 1) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                i |= 2;
            } else if (iMo2230 == 2) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str);
                i |= 4;
            } else if (iMo2230 == 3) {
                c3076 = (C3076) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3074.f9839, c3076);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                c3266 = (C3266) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3264.f10371, c3266);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3194(i, c2956, num, str, c3076, c3266);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C2954.f9456), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(C2839.f9108), AbstractC2205.m4056(C3074.f9839), AbstractC2205.m4056(C3264.f10371)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3194 c3194 = (C3194) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2954.f9456, c3194.f10208);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3194.f10209);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C2839.f9108, c3194.f10210);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3074.f9839, c3194.f10211);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C3264.f10371, c3194.f10212);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
