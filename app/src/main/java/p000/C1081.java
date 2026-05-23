package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᛸᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1081 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1081 f3899;

    static {
        C1081 c1081 = new C1081();
        f3899 = c1081;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.other.DisturbSetting", c1081, 4);
        c2360.m4338("nightSetting", false);
        c2360.m4339(new C0380(1, 1));
        c2360.m4338("nightTime", false);
        c2360.m4339(new C0380(2, 1));
        c2360.m4338("allDaySetting", false);
        c2360.m4339(new C0380(3, 1));
        c2360.m4338("allDayTime", false);
        c2360.m4339(new C0380(4, 1));
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
        boolean z = true;
        int i = 0;
        Integer num = null;
        C1086 c1086 = null;
        String str = null;
        C1086 c1087 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                i |= 1;
            } else if (iMo2230 == 1) {
                c1086 = (C1086) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1084.f3904, c1086);
                i |= 2;
            } else if (iMo2230 == 2) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                c1087 = (C1086) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1084.f3904, c1087);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, descriptor);
            throw null;
        }
        C1083 c1083 = new C1083();
        c1083.f3900 = num;
        c1083.f3901 = c1086;
        c1083.f3902 = str;
        c1083.f3903 = c1087;
        return c1083;
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C1665.f5622);
        C1084 c1084 = C1084.f3904;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c1084), AbstractC2205.m4056(C2839.f9108), AbstractC2205.m4056(c1084)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1083 c1083 = (C1083) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C1665.f5622, c1083.f3900);
        C1084 c1084 = C1084.f3904;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1084, c1083.f3901);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C2839.f9108, c1083.f3902);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1084, c1083.f3903);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
