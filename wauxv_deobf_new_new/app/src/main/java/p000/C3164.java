package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲀᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3164 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3164 f10076;

    static {
        C3164 c3164 = new C3164();
        f10076 = c3164;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.j71Proto", c3164, 16);
        AbstractC2647.m4626(c2405, "contact", false, 1);
        AbstractC2647.m4626(c2405, "enableComment", false, 2);
        AbstractC2647.m4626(c2405, "disableComment", false, 3);
        AbstractC2647.m4626(c2405, "reward_amount_in_heat", false, 4);
        AbstractC2647.m4626(c2405, "live_contact_flag", false, 5);
        AbstractC2647.m4626(c2405, "badge_info", false, 6);
        AbstractC2647.m4626(c2405, "display_nickname", false, 9);
        AbstractC2647.m4626(c2405, "live_identity", false, 10);
        AbstractC2647.m4626(c2405, "live_bg_img_url", false, 11);
        AbstractC2647.m4626(c2405, "disable_personal_msg", false, 13);
        AbstractC2647.m4626(c2405, "badge_infos", false, 14);
        AbstractC2647.m4626(c2405, "consume_coin_amount", false, 15);
        AbstractC2647.m4626(c2405, "intimacy", false, 16);
        AbstractC2647.m4626(c2405, "is_self_for_web", false, 17);
        AbstractC2647.m4626(c2405, "live_heat_value", false, 18);
        AbstractC2647.m4626(c2405, "voice_live_img", false, 19);
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
        C3015 c3015;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3166.f10077;
        interfaceC0764Mo2636.getClass();
        String str = null;
        Boolean bool = null;
        Long l = null;
        Integer num = null;
        Boolean bool2 = null;
        List list = null;
        Long l2 = null;
        C3084 c3084 = null;
        Integer num2 = null;
        Integer num3 = null;
        C3256 c3256 = null;
        String str2 = null;
        Integer num4 = null;
        C3015 c3016 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Integer num7 = num2;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    c3015 = c3016;
                    z = false;
                    l = l;
                    num2 = num7;
                    num3 = num3;
                    c3016 = c3015;
                    bool = bool;
                    break;
                case 0:
                    c3015 = (C3015) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C3013.f9623, c3016);
                    i |= 1;
                    l = l;
                    num2 = num7;
                    num3 = num3;
                    c3016 = c3015;
                    bool = bool;
                    break;
                case 1:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num5);
                    i |= 2;
                    num6 = num6;
                    num2 = num7;
                    num3 = num3;
                    bool = bool;
                    break;
                case 2:
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num6);
                    i |= 4;
                    num2 = num7;
                    num3 = num3;
                    bool = bool;
                    break;
                case 3:
                    bool = bool;
                    num3 = num3;
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num7);
                    i |= 8;
                    num3 = num3;
                    bool = bool;
                    break;
                case 4:
                    bool = bool;
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num3);
                    i |= 16;
                    num2 = num7;
                    bool = bool;
                    break;
                case 5:
                    c3256 = (C3256) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3254.f10380, c3256);
                    i |= 32;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 6:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str2);
                    i |= 64;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 7:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num4);
                    i |= 128;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 8:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str);
                    i |= bc.e;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 9:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C0416.f1980, bool2);
                    i |= 512;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 10:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, (InterfaceC1767) interfaceC1780Arr[10].getValue(), list);
                    i |= 1024;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 11:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1680.f5658, num);
                    i |= 2048;
                    num2 = num7;
                    num3 = num3;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1888.f6259, l);
                    i |= 4096;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 13:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C0416.f1980, bool);
                    i |= 8192;
                    num2 = num7;
                    num3 = num3;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C1888.f6259, l2);
                    i |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num2 = num7;
                    num3 = num3;
                    break;
                case 15:
                    c3084 = (C3084) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C3082.f9885, c3084);
                    i |= 32768;
                    num2 = num7;
                    num3 = num3;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Boolean bool3 = bool;
        Integer num8 = num3;
        C3015 c3017 = c3016;
        Integer num9 = num5;
        Integer num10 = num6;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3166(i, c3017, num9, num10, num2, num8, c3256, str2, num4, str, bool2, list, num, l, bool3, l2, c3084);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3166.f10077;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C3013.f9623);
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(C3254.f10380);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3399 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(c2899);
        C0416 c0416 = C0416.f1980;
        InterfaceC1767 interfaceC1767M33911 = AbstractC1471.m3392(c0416);
        InterfaceC1767 interfaceC1767M33912 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[10].getValue());
        InterfaceC1767 interfaceC1767M33913 = AbstractC1471.m3392(c1680);
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, interfaceC1767M33911, interfaceC1767M33912, interfaceC1767M33913, AbstractC1471.m3392(c1888), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c1888), AbstractC1471.m3392(C3082.f9885)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3166 c3166 = (C3166) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3166.f10077;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C3013.f9623, c3166.f10078);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3166.f10079);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3166.f10080);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3166.f10081);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3166.f10082);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C3254.f10380, c3166.f10083);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3166.f10084);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3166.f10085);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3166.f10086);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c0416, c3166.f10087);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, (InterfaceC1767) interfaceC1780Arr[10].getValue(), c3166.f10088);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1680, c3166.f10089);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1888, c3166.f10090);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c0416, c3166.f10091);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c1888, c3166.f10092);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, C3082.f9885, c3166.f10093);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
