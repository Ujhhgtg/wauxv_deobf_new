package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᛸᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3098 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3098 f9898;

    static {
        C3098 c3098 = new C3098();
        f9898 = c3098;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ht1Proto", c3098, 5);
        AbstractC2668.m4680(c2360, "music_mv_topic_id", false, 1);
        AbstractC2668.m4680(c2360, "contact", false, 3);
        AbstractC2668.m4680(c2360, "object_id", false, 4);
        AbstractC2668.m4680(c2360, "object_nonce_id", false, 5);
        AbstractC2668.m4680(c2360, "recommend_reason", false, 6);
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
        Integer num = null;
        C2956 c2956 = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                i |= 1;
            } else if (iMo2230 == 1) {
                c2956 = (C2956) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2954.f9456, c2956);
                i |= 2;
            } else if (iMo2230 == 2) {
                num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
                i |= 4;
            } else if (iMo2230 == 3) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str2);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3100(i, num, c2956, num2, str, str2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C2954.f9456);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3100 c3100 = (C3100) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3100.f9899);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C2954.f9456, c3100.f9900);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3100.f9901);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3100.f9902);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3100.f9903);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
