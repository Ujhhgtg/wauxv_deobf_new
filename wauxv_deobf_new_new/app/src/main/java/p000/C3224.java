package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᛸᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3224 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3224 f10312;

    static {
        C3224 c3224 = new C3224();
        f10312 = c3224;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.mk1Proto", c3224, 14);
        AbstractC2647.m4626(c2405, "support_screen_rotate", false, 1);
        AbstractC2647.m4626(c2405, "watch_uv", false, 2);
        AbstractC2647.m4626(c2405, "orig_duration", false, 3);
        AbstractC2647.m4626(c2405, "replay_switch_status", false, 4);
        AbstractC2647.m4626(c2405, "replay_transition_url", false, 5);
        AbstractC2647.m4626(c2405, "replay_transition_video_info", false, 6);
        AbstractC2647.m4626(c2405, "replay_transition_preload_info", false, 7);
        AbstractC2647.m4626(c2405, "anchor_specified", false, 8);
        AbstractC2647.m4626(c2405, "automatic_detection", false, 9);
        AbstractC2647.m4626(c2405, "replay_guide_page_url", false, 10);
        AbstractC2647.m4626(c2405, "hls_enc_url", false, 11);
        AbstractC2647.m4626(c2405, "hls_enc_token", false, 12);
        AbstractC2647.m4626(c2405, "ref_replay_object_id", false, 15);
        AbstractC2647.m4626(c2405, "replay_control_flag", false, 17);
        descriptor = c2405;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return descriptor;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        C3244 c3244 = null;
        C3265 c3265 = null;
        C3397 c3397 = null;
        C3397 c3398 = null;
        Integer num3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Long l4 = l3;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    l3 = l4;
                    l2 = l2;
                    num = num;
                    l = l;
                    break;
                case 0:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num3);
                    i |= 1;
                    l3 = l4;
                    l2 = l2;
                    num = num;
                    l = l;
                    break;
                case 1:
                    l = l;
                    num = num;
                    l3 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l4);
                    i |= 2;
                    num = num;
                    l = l;
                    break;
                case 2:
                    l = l;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                    i |= 4;
                    l3 = l4;
                    l = l;
                    break;
                case 3:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num2);
                    i |= 8;
                    l3 = l4;
                    num = num;
                    break;
                case 4:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str4);
                    i |= 16;
                    l3 = l4;
                    num = num;
                    break;
                case 5:
                    c3244 = (C3244) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3242.f10351, c3244);
                    i |= 32;
                    l3 = l4;
                    num = num;
                    break;
                case 6:
                    c3265 = (C3265) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3263.f10395, c3265);
                    i |= 64;
                    l3 = l4;
                    num = num;
                    break;
                case 7:
                    c3397 = (C3397) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C3395.f10707, c3397);
                    i |= 128;
                    l3 = l4;
                    num = num;
                    break;
                case 8:
                    c3398 = (C3397) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C3395.f10707, c3398);
                    i |= bc.e;
                    l3 = l4;
                    num = num;
                    break;
                case 9:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    l3 = l4;
                    num = num;
                    break;
                case 10:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str2);
                    i |= 1024;
                    l3 = l4;
                    num = num;
                    break;
                case 11:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str3);
                    i |= 2048;
                    l3 = l4;
                    num = num;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1888.f6259, l2);
                    i |= 4096;
                    l3 = l4;
                    num = num;
                    break;
                case 13:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C1888.f6259, l);
                    i |= 8192;
                    l3 = l4;
                    num = num;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Long l5 = l;
        Integer num4 = num;
        Integer num5 = num3;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3226(i, num5, l3, num4, num2, str4, c3244, c3265, c3397, c3398, str, str2, str3, l2, l5);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(C3242.f10351);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(C3263.f10395);
        C3395 c3395 = C3395.f10707;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, AbstractC1471.m3392(c3395), AbstractC1471.m3392(c3395), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3226 c3226 = (C3226) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3226.f10313);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3226.f10314);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3226.f10315);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3226.f10316);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3226.f10317);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C3242.f10351, c3226.f10318);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, C3263.f10395, c3226.f10319);
        C3395 c3395 = C3395.f10707;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c3395, c3226.f10320);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c3395, c3226.f10321);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3226.f10322);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3226.f10323);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3226.f10324);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1888, c3226.f10325);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c1888, c3226.f10326);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
