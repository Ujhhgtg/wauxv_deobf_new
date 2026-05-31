package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3438 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3438 f10803;

    static {
        C3438 c3438 = new C3438();
        f10803 = c3438;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.z52Proto", c3438, 24);
        AbstractC2647.m4626(c2405, "topic", false, 1);
        AbstractC2647.m4626(c2405, "topicId", false, 2);
        AbstractC2647.m4626(c2405, "feedCount", false, 3);
        AbstractC2647.m4626(c2405, "topicNonceId", false, 4);
        AbstractC2647.m4626(c2405, "topicType", false, 5);
        AbstractC2647.m4626(c2405, "followFlag", false, 6);
        AbstractC2647.m4626(c2405, "coverUrl", false, 7);
        AbstractC2647.m4626(c2405, "friendFollowCount", false, 8);
        AbstractC2647.m4626(c2405, "displayId", false, 9);
        AbstractC2647.m4626(c2405, "canFollow", false, 10);
        AbstractC2647.m4626(c2405, "music_info", false, 11);
        AbstractC2647.m4626(c2405, "onlineViewed", false, 12);
        AbstractC2647.m4626(c2405, "followFeedInfo", false, 13);
        AbstractC2647.m4626(c2405, "feed_follow_permission_flag", false, 14);
        AbstractC2647.m4626(c2405, "tmpl_info", false, 15);
        AbstractC2647.m4626(c2405, "disabledFlag", false, 16);
        AbstractC2647.m4626(c2405, "event", false, 17);
        AbstractC2647.m4626(c2405, "read_count", false, 18);
        AbstractC2647.m4626(c2405, "head_url", false, 19);
        AbstractC2647.m4626(c2405, "music_topic", false, 20);
        AbstractC2647.m4626(c2405, "hash_tag_info", false, 21);
        AbstractC2647.m4626(c2405, "music_mv_topic", false, 22);
        AbstractC2647.m4626(c2405, "words_topic_ext", false, 23);
        AbstractC2647.m4626(c2405, "video_template_info", false, 24);
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
        int i;
        String str;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        C3169 c3169 = null;
        Integer num = null;
        C3391 c3391 = null;
        Integer num2 = null;
        C3123 c3123 = null;
        Integer num3 = null;
        C3352 c3352 = null;
        Integer num4 = null;
        String str2 = null;
        C3205 c3205 = null;
        C3431 c3431 = null;
        C3159 c3159 = null;
        C3280 c3280 = null;
        String str3 = null;
        Long l = null;
        Integer num5 = null;
        String str4 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str5 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        C3153 c3153 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            num2 = num2;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    str = str3;
                    z = false;
                    c3169 = c3169;
                    str3 = str;
                    num = num;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str3);
                    i2 |= 1;
                    c3169 = c3169;
                    c3391 = c3391;
                    str3 = str;
                    num = num;
                    break;
                case 1:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                    i2 |= 2;
                    num5 = num5;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 2:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num5);
                    i2 |= 4;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 3:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str4);
                    i2 |= 8;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 4:
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num6);
                    i2 |= 16;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 5:
                    num7 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num7);
                    i2 |= 32;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 6:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str5);
                    i2 |= 64;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 7:
                    num8 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num8);
                    i2 |= 128;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 8:
                    num9 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num9);
                    i2 |= bc.e;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 9:
                    num10 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num10);
                    i2 |= 512;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 10:
                    c3153 = (C3153) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C3151.f10040, c3153);
                    i2 |= 1024;
                    num2 = num2;
                    c3391 = c3391;
                    num = num;
                    break;
                case 11:
                    num = num;
                    c3391 = c3391;
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1680.f5658, num2);
                    i2 |= 2048;
                    c3391 = c3391;
                    num = num;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num = num;
                    c3391 = (C3391) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C3389.f10699, c3391);
                    i2 |= 4096;
                    num2 = num2;
                    num = num;
                    break;
                case 13:
                    c3391 = c3391;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C1680.f5658, num);
                    i2 |= 8192;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c3391 = c3391;
                    c3123 = (C3123) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C3121.f9979, c3123);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case 15:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C1680.f5658, num3);
                    i = 32768;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case 16:
                    c3352 = (C3352) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C3350.f10598, c3352);
                    i = 65536;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C1680.f5658, num4);
                    i = 131072;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.LDC /* 18 */:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 18, C2899.f9270, str2);
                    i = 262144;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case 19:
                    c3205 = (C3205) interfaceC0764Mo2636.mo2340(interfaceC2715, 19, C3203.f10171, c3205);
                    i = 524288;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case 20:
                    c3431 = (C3431) interfaceC0764Mo2636.mo2340(interfaceC2715, 20, C3429.f10792, c3431);
                    i = 1048576;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c3159 = (C3159) interfaceC0764Mo2636.mo2340(interfaceC2715, 21, C3157.f10065, c3159);
                    i = 2097152;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.LLOAD /* 22 */:
                    c3280 = (C3280) interfaceC0764Mo2636.mo2340(interfaceC2715, 22, C3278.f10418, c3280);
                    i = 4194304;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c3169 = (C3169) interfaceC0764Mo2636.mo2340(interfaceC2715, 23, C3167.f10094, c3169);
                    i = 8388608;
                    i2 |= i;
                    num2 = num2;
                    c3391 = c3391;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Integer num11 = num;
        Integer num12 = num2;
        String str6 = str3;
        Long l2 = l;
        Integer num13 = num5;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        C3280 c3281 = c3280;
        C3153 c3154 = c3153;
        C3159 c31510 = c3159;
        return new C3440(i2, str6, l2, num13, str4, num6, num7, str5, num8, num9, num10, c3154, num12, c3391, num11, c3123, num3, c3352, num4, str2, c3205, c3431, c31510, c3281, c3169);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C1888.f6259);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3151.f10040), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3389.f10699), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3121.f9979), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3350.f10598), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C3203.f10171), AbstractC1471.m3392(C3429.f10792), AbstractC1471.m3392(C3157.f10065), AbstractC1471.m3392(C3278.f10418), AbstractC1471.m3392(C3167.f10094)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3440 c3440 = (C3440) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3440.f10804);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1888.f6259, c3440.f10805);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3440.f10806);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3440.f10807);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3440.f10808);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3440.f10809);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3440.f10810);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3440.f10811);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3440.f10812);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3440.f10813);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, C3151.f10040, c3440.f10814);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1680, c3440.f10815);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, C3389.f10699, c3440.f10816);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c1680, c3440.f10817);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, C3121.f9979, c3440.f10818);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c1680, c3440.f10819);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, C3350.f10598, c3440.f10820);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, c1680, c3440.f10821);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 18, c2899, c3440.f10822);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 19, C3203.f10171, c3440.f10823);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 20, C3429.f10792, c3440.f10824);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 21, C3157.f10065, c3440.f10825);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 22, C3278.f10418, c3440.f10826);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 23, C3167.f10094, c3440.f10827);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
