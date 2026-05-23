package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲇᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3165 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3165 f10145;

    static {
        C3165 c3165 = new C3165();
        f10145 = c3165;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.mk1Proto", c3165, 14);
        AbstractC2668.m4680(c2360, "support_screen_rotate", false, 1);
        AbstractC2668.m4680(c2360, "watch_uv", false, 2);
        AbstractC2668.m4680(c2360, "orig_duration", false, 3);
        AbstractC2668.m4680(c2360, "replay_switch_status", false, 4);
        AbstractC2668.m4680(c2360, "replay_transition_url", false, 5);
        AbstractC2668.m4680(c2360, "replay_transition_video_info", false, 6);
        AbstractC2668.m4680(c2360, "replay_transition_preload_info", false, 7);
        AbstractC2668.m4680(c2360, "anchor_specified", false, 8);
        AbstractC2668.m4680(c2360, "automatic_detection", false, 9);
        AbstractC2668.m4680(c2360, "replay_guide_page_url", false, 10);
        AbstractC2668.m4680(c2360, "hls_enc_url", false, 11);
        AbstractC2668.m4680(c2360, "hls_enc_token", false, 12);
        AbstractC2668.m4680(c2360, "ref_replay_object_id", false, 15);
        AbstractC2668.m4680(c2360, "replay_control_flag", false, 17);
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
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        C3185 c3185 = null;
        C3206 c3206 = null;
        C3338 c3338 = null;
        C3338 c3339 = null;
        Integer num3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Long l4 = l3;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    l3 = l4;
                    l2 = l2;
                    num = num;
                    l = l;
                    break;
                case 0:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num3);
                    i |= 1;
                    l3 = l4;
                    l2 = l2;
                    num = num;
                    l = l;
                    break;
                case 1:
                    l = l;
                    num = num;
                    l3 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l4);
                    i |= 2;
                    num = num;
                    l = l;
                    break;
                case 2:
                    l = l;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                    i |= 4;
                    l3 = l4;
                    l = l;
                    break;
                case 3:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num2);
                    i |= 8;
                    l3 = l4;
                    num = num;
                    break;
                case 4:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str4);
                    i |= 16;
                    l3 = l4;
                    num = num;
                    break;
                case 5:
                    c3185 = (C3185) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3183.f10184, c3185);
                    i |= 32;
                    l3 = l4;
                    num = num;
                    break;
                case 6:
                    c3206 = (C3206) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3204.f10228, c3206);
                    i |= 64;
                    l3 = l4;
                    num = num;
                    break;
                case 7:
                    c3338 = (C3338) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C3336.f10540, c3338);
                    i |= 128;
                    l3 = l4;
                    num = num;
                    break;
                case 8:
                    c3339 = (C3338) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C3336.f10540, c3339);
                    i |= bc.e;
                    l3 = l4;
                    num = num;
                    break;
                case 9:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    l3 = l4;
                    num = num;
                    break;
                case 10:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str2);
                    i |= 1024;
                    l3 = l4;
                    num = num;
                    break;
                case 11:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str3);
                    i |= 2048;
                    l3 = l4;
                    num = num;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1862.f6185, l2);
                    i |= 4096;
                    l3 = l4;
                    num = num;
                    break;
                case 13:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C1862.f6185, l);
                    i |= 8192;
                    l3 = l4;
                    num = num;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Long l5 = l;
        Integer num4 = num;
        Integer num5 = num3;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3167(i, num5, l3, num4, num2, str4, c3185, c3206, c3338, c3339, str, str2, str3, l2, l5);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1862);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(C3183.f10184);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(C3204.f10228);
        C3336 c3336 = C3336.f10540;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, AbstractC2205.m4056(c3336), AbstractC2205.m4056(c3336), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1862)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3167 c3167 = (C3167) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3167.f10146);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3167.f10147);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3167.f10148);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3167.f10149);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3167.f10150);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C3183.f10184, c3167.f10151);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C3204.f10228, c3167.f10152);
        C3336 c3336 = C3336.f10540;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c3336, c3167.f10153);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c3336, c3167.f10154);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3167.f10155);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3167.f10156);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3167.f10157);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1862, c3167.f10158);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c1862, c3167.f10159);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
