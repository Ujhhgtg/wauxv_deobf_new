package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲇᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3183 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3183 f10184;

    static {
        C3183 c3183 = new C3183();
        f10184 = c3183;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.nk1Proto", c3183, 6);
        AbstractC2668.m4680(c2360, "cdn_trans_info", false, 1);
        AbstractC2668.m4680(c2360, "recommend_video_quality_level", false, 2);
        AbstractC2668.m4680(c2360, "force_recommend", false, 3);
        AbstractC2668.m4680(c2360, "replay_transition_video_id", false, 4);
        AbstractC2668.m4680(c2360, "replay_transition_url", false, 5);
        AbstractC2668.m4680(c2360, "disable_replay_transition", false, 6);
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
        C3350 c3350 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        String str = null;
        Integer num3 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c3350 = (C3350) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C3348.f10554, c3350);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1862.f6185, l);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str);
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
        return new C3185(i, c3350, num, num2, l, str, num3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C3348.f10554);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C1862.f6185), AbstractC2205.m4056(C2839.f9108), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3185 c3185 = (C3185) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C3348.f10554, c3185.f10185);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3185.f10186);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3185.f10187);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C1862.f6185, c3185.f10188);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C2839.f9108, c3185.f10189);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3185.f10190);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
