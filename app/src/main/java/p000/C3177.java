package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲀᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3177 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3177 f10178;

    static {
        C3177 c3177 = new C3177();
        f10178 = c3177;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ne5Proto", c3177, 3);
        AbstractC2668.m4680(c2360, "d", false, 1);
        AbstractC2668.m4680(c2360, "e", false, 2);
        AbstractC2668.m4680(c2360, "f", false, 3);
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
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        C2989 c2989 = null;
        Integer num = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C0441.f2008, bool);
                i |= 1;
            } else if (iMo2230 == 1) {
                c2989 = (C2989) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2987.f9582, c2989);
                i |= 2;
            } else {
                if (iMo2230 != 2) {
                    throw new C3501(iMo2230);
                }
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3179(i, bool, c2989, num);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C0441.f2008), AbstractC2205.m4056(C2987.f9582), AbstractC2205.m4056(C1665.f5622)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3179 c3179 = (C3179) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C0441.f2008, c3179.f10179);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C2987.f9582, c3179.f10180);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3179.f10181);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
