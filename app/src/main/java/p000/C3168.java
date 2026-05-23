package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲇᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3168 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3168 f10160;

    static {
        C3168 c3168 = new C3168();
        f10160 = c3168;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.mr5Proto", c3168, 4);
        AbstractC2668.m4680(c2360, "d", false, 1);
        AbstractC2668.m4680(c2360, "e", false, 2);
        AbstractC2668.m4680(c2360, "f", false, 3);
        AbstractC2668.m4680(c2360, "g", false, 4);
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
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                i |= 1;
            } else if (iMo2230 == 1) {
                num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                i |= 2;
            } else if (iMo2230 == 2) {
                num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num3);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num4);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3170(i, num, num2, num3, num4);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3170 c3170 = (C3170) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3170.f10161);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3170.f10162);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3170.f10163);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3170.f10164);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
