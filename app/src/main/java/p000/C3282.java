package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲀᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3282 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3282 f10412;

    static {
        C3282 c3282 = new C3282();
        f10412 = c3282;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.u40Proto", c3282, 7);
        AbstractC2668.m4680(c2360, "key", false, 1);
        AbstractC2668.m4680(c2360, "thumbnail", false, 2);
        AbstractC2668.m4680(c2360, "preview", false, 3);
        AbstractC2668.m4680(c2360, "animation", false, 4);
        AbstractC2668.m4680(c2360, "landscape_animation", false, 5);
        AbstractC2668.m4680(c2360, "sign_preview", false, 6);
        AbstractC2668.m4680(c2360, "sign_thumbnail", false, 7);
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
        
        int i = 0;
        String str = null;
        C3043 c3043 = null;
        C3043 c3044 = null;
        C3043 c3045 = null;
        C3043 c3046 = null;
        C3043 c3047 = null;
        C3043 c3048 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    c3043 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3041.f9752, c3043);
                    i |= 2;
                    break;
                case 2:
                    c3044 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3041.f9752, c3044);
                    i |= 4;
                    break;
                case 3:
                    c3045 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3041.f9752, c3045);
                    i |= 8;
                    break;
                case 4:
                    c3046 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3041.f9752, c3046);
                    i |= 16;
                    break;
                case 5:
                    c3047 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3041.f9752, c3047);
                    i |= 32;
                    break;
                case 6:
                    c3048 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3041.f9752, c3048);
                    i |= 64;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3284(i, str, c3043, c3044, c3045, c3046, c3047, c3048);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C2839.f9108);
        C3041 c3041 = C3041.f9752;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3284 c3284 = (C3284) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, c3284.f10413);
        C3041 c3041 = C3041.f9752;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c3041, c3284.f10414);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c3041, c3284.f10415);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c3041, c3284.f10416);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c3041, c3284.f10417);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c3041, c3284.f10418);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c3041, c3284.f10419);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
