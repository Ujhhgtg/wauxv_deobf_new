package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲈᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3020 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3020 f9709;

    static {
        C3020 c3020 = new C3020();
        f9709 = c3020;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.b22Proto", c3020, 8);
        AbstractC2668.m4680(c2360, "topic", false, 1);
        AbstractC2668.m4680(c2360, "topicType", false, 2);
        AbstractC2668.m4680(c2360, "iconUrl", false, 3);
        AbstractC2668.m4680(c2360, "desc", false, 4);
        AbstractC2668.m4680(c2360, "location", false, 5);
        AbstractC2668.m4680(c2360, "patMusicId", false, 6);
        AbstractC2668.m4680(c2360, "event", false, 7);
        AbstractC2668.m4680(c2360, "feedId", false, 8);
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
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        C3326 c3326 = null;
        String str4 = null;
        C3137 c3137 = null;
        String str5 = null;
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
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                    i |= 8;
                    break;
                case 4:
                    c3326 = (C3326) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3324.f10524, c3326);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str4);
                    i |= 32;
                    break;
                case 6:
                    c3137 = (C3137) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3135.f9989, c3137);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str5);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3022(i, str, num, str2, str3, c3326, str4, c3137, str5);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C3324.f10524), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C3135.f9989), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3022 c3022 = (C3022) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3022.f9710);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3022.f9711);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3022.f9712);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3022.f9713);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C3324.f10524, c3022.f9714);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3022.f9715);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C3135.f9989, c3022.f9716);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3022.f9717);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
