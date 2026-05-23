package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᛸᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3077 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3077 f9842;

    static {
        C3077 c3077 = new C3077();
        f9842 = c3077;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.fw3Proto", c3077, 6);
        AbstractC2668.m4680(c2360, "createTime", false, 1);
        AbstractC2668.m4680(c2360, "newlifeInfo", false, 2);
        AbstractC2668.m4680(c2360, "desc", false, 3);
        AbstractC2668.m4680(c2360, "location", false, 4);
        AbstractC2668.m4680(c2360, "commentEggCount", false, 5);
        AbstractC2668.m4680(c2360, "activityType", false, 6);
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
        Integer num = null;
        C3019 c3019 = null;
        C3396 c3396 = null;
        C3260 c3260 = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    c3019 = (C3019) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3017.f9698, c3019);
                    i |= 2;
                    break;
                case 2:
                    c3396 = (C3396) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3394.f10688, c3396);
                    i |= 4;
                    break;
                case 3:
                    c3260 = (C3260) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3258.f10348, c3260);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num3);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3079(i, num, c3019, c3396, c3260, num2, num3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3017.f9698), AbstractC2205.m4056(C3394.f10688), AbstractC2205.m4056(C3258.f10348), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3079 c3079 = (C3079) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3079.f9843);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C3017.f9698, c3079.f9844);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C3394.f10688, c3079.f9845);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3258.f10348, c3079.f9846);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3079.f9847);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3079.f9848);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
