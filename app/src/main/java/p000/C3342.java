package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3342 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3342 f10547;

    static {
        C3342 c3342 = new C3342();
        f10547 = c3342;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.wq0Proto", c3342, 4);
        AbstractC2668.m4680(c2360, "highest_reward", false, 1);
        AbstractC2668.m4680(c2360, "share_percentage", false, 2);
        AbstractC2668.m4680(c2360, "share_wording", false, 3);
        AbstractC2668.m4680(c2360, "highest_reward_suffix_wording", false, 4);
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
        Long l = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1862.f6185, l);
                i |= 1;
            } else if (iMo2230 == 1) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                i |= 2;
            } else if (iMo2230 == 2) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str2);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3344(i, l, num, str, str2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C1862.f6185);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1665.f5622);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3344 c3344 = (C3344) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C1862.f6185, c3344.f10548);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3344.f10549);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3344.f10550);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3344.f10551);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
