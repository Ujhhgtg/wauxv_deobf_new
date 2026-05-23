package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲈᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3237 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3237 f10278;

    static {
        C3237 c3237 = new C3237();
        f10278 = c3237;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.qj3Proto", c3237, 6);
        AbstractC2668.m4680(c2360, "url", false, 1);
        AbstractC2668.m4680(c2360, "thumbUrl", false, 2);
        AbstractC2668.m4680(c2360, "width", false, 3);
        AbstractC2668.m4680(c2360, "height", false, 4);
        AbstractC2668.m4680(c2360, "coverUrl", false, 5);
        AbstractC2668.m4680(c2360, "videoPlayDuration", false, 6);
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
        String str2 = null;
        Float f = null;
        Float f2 = null;
        String str3 = null;
        Integer num = null;
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
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1365.f4873, f);
                    i |= 4;
                    break;
                case 3:
                    f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1365.f4873, f2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str3);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3239(i, str, str2, f, f2, str3, num);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        C1365 c1365 = C1365.f4873;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1365), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3239 c3239 = (C3239) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3239.f10279);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3239.f10280);
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1365, c3239.f10281);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1365, c3239.f10282);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3239.f10283);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C1665.f5622, c3239.f10284);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
