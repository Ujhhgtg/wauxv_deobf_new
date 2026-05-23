package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲇᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3288 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3288 f10424;

    static {
        C3288 c3288 = new C3288();
        f10424 = c3288;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.u93Proto", c3288, 6);
        AbstractC2668.m4680(c2360, "is_concert_live", false, 1);
        AbstractC2668.m4680(c2360, "activity_id", false, 2);
        AbstractC2668.m4680(c2360, "topic_id", false, 3);
        AbstractC2668.m4680(c2360, "topic_type", false, 4);
        AbstractC2668.m4680(c2360, "enable_topic", false, 5);
        AbstractC2668.m4680(c2360, "has_ticket", false, 6);
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
        Boolean bool = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        Boolean bool2 = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C0441.f2008, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1862.f6185, l);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1862.f6185, l2);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C0441.f2008, bool2);
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
        return new C3290(i, bool, str, l, l2, bool2, num);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C0441 c0441 = C0441.f2008;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c0441);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C2839.f9108);
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c0441), AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3290 c3290 = (C3290) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c0441, c3290.f10425);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C2839.f9108, c3290.f10426);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1862, c3290.f10427);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1862, c3290.f10428);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c0441, c3290.f10429);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C1665.f5622, c3290.f10430);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
