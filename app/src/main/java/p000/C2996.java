package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2996 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2996 f9638;

    static {
        C2996 c2996 = new C2996();
        f9638 = c2996;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.VideoTemplateProto", c2996, 5);
        AbstractC2668.m4680(c2360, "type", false, 1);
        AbstractC2668.m4680(c2360, "templateId", false, 2);
        AbstractC2668.m4680(c2360, "musicId", false, 3);
        AbstractC2668.m4680(c2360, "androidSdkVersionMin", false, 4);
        AbstractC2668.m4680(c2360, "iosSdkVersionMin", false, 5);
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
        String str2 = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                i |= 1;
            } else if (iMo2230 == 1) {
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                i |= 2;
            } else if (iMo2230 == 2) {
                str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str3);
                i |= 4;
            } else if (iMo2230 == 3) {
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1862.f6185, l);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1862.f6185, l2);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2998(i, str, str2, str3, l, l2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2998 c2998 = (C2998) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c2998.f9639);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c2998.f9640);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2998.f9641);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1862, c2998.f9642);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1862, c2998.f9643);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
