package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᲈᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3379 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3379 f10636;

    static {
        C3379 c3379 = new C3379();
        f10636 = c3379;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.z52Proto", c3379, 24);
        AbstractC2668.m4680(c2360, "topic", false, 1);
        AbstractC2668.m4680(c2360, "topicId", false, 2);
        AbstractC2668.m4680(c2360, "feedCount", false, 3);
        AbstractC2668.m4680(c2360, "topicNonceId", false, 4);
        AbstractC2668.m4680(c2360, "topicType", false, 5);
        AbstractC2668.m4680(c2360, "followFlag", false, 6);
        AbstractC2668.m4680(c2360, "coverUrl", false, 7);
        AbstractC2668.m4680(c2360, "friendFollowCount", false, 8);
        AbstractC2668.m4680(c2360, "displayId", false, 9);
        AbstractC2668.m4680(c2360, "canFollow", false, 10);
        AbstractC2668.m4680(c2360, "music_info", false, 11);
        AbstractC2668.m4680(c2360, "onlineViewed", false, 12);
        AbstractC2668.m4680(c2360, "followFeedInfo", false, 13);
        AbstractC2668.m4680(c2360, "feed_follow_permission_flag", false, 14);
        AbstractC2668.m4680(c2360, "tmpl_info", false, 15);
        AbstractC2668.m4680(c2360, "disabledFlag", false, 16);
        AbstractC2668.m4680(c2360, "event", false, 17);
        AbstractC2668.m4680(c2360, "read_count", false, 18);
        AbstractC2668.m4680(c2360, "head_url", false, 19);
        AbstractC2668.m4680(c2360, "music_topic", false, 20);
        AbstractC2668.m4680(c2360, "hash_tag_info", false, 21);
        AbstractC2668.m4680(c2360, "music_mv_topic", false, 22);
        AbstractC2668.m4680(c2360, "words_topic_ext", false, 23);
        AbstractC2668.m4680(c2360, "video_template_info", false, 24);
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
        int i;
        String str;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        
        C3109 c3109 = null;
        Integer num = null;
        C3332 c3332 = null;
        Integer num2 = null;
        C3064 c3064 = null;
        Integer num3 = null;
        C3293 c3293 = null;
        Integer num4 = null;
        String str2 = null;
        C3146 c3146 = null;
        C3372 c3372 = null;
        C3100 c3100 = null;
        C3221 c3221 = null;
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
        C3094 c3094 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            num2 = num2;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    str = str3;
                    z = false;
                    c3109 = c3109;
                    str3 = str;
                    num = num;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str3);
                    i2 |= 1;
                    c3109 = c3109;
                    c3332 = c3332;
                    str3 = str;
                    num = num;
                    break;
                case 1:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                    i2 |= 2;
                    num5 = num5;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 2:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num5);
                    i2 |= 4;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 3:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str4);
                    i2 |= 8;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 4:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num6);
                    i2 |= 16;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 5:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num7);
                    i2 |= 32;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 6:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str5);
                    i2 |= 64;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 7:
                    num8 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num8);
                    i2 |= 128;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 8:
                    num9 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num9);
                    i2 |= 256;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 9:
                    num10 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num10);
                    i2 |= 512;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 10:
                    c3094 = (C3094) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C3092.f9873, c3094);
                    i2 |= 1024;
                    num2 = num2;
                    c3332 = c3332;
                    num = num;
                    break;
                case 11:
                    num = num;
                    c3332 = c3332;
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1665.f5622, num2);
                    i2 |= 2048;
                    c3332 = c3332;
                    num = num;
                    break;
                case 12 /* 12 */:
                    num = num;
                    c3332 = (C3332) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C3330.f10532, c3332);
                    i2 |= 4096;
                    num2 = num2;
                    num = num;
                    break;
                case 13:
                    c3332 = c3332;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C1665.f5622, num);
                    i2 |= 8192;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 14 /* 14 */:
                    c3332 = c3332;
                    c3064 = (C3064) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C3062.f9812, c3064);
                    i2 |= 16384;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 15:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C1665.f5622, num3);
                    i = 32768;
                    i2 |= 32768;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 16:
                    c3293 = (C3293) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C3291.f10431, c3293);
                    i = 65536;
                    i2 |= 65536;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 17 /* 17 */:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C1665.f5622, num4);
                    i = 131072;
                    i2 |= 131072;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 18 /* 18 */:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 18, C2839.f9108, str2);
                    i = 262144;
                    i2 |= 262144;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 19:
                    c3146 = (C3146) interfaceC0766Mo2512.mo2239(interfaceC2654, 19, C3144.f10004, c3146);
                    i = 524288;
                    i2 |= 524288;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 20:
                    c3372 = (C3372) interfaceC0766Mo2512.mo2239(interfaceC2654, 20, C3370.f10625, c3372);
                    i = 1048576;
                    i2 |= 1048576;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 21 /* 21 */:
                    c3100 = (C3100) interfaceC0766Mo2512.mo2239(interfaceC2654, 21, C3098.f9898, c3100);
                    i = 2097152;
                    i2 |= 2097152;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 22 /* 22 */:
                    c3221 = (C3221) interfaceC0766Mo2512.mo2239(interfaceC2654, 22, C3219.f10251, c3221);
                    i = 4194304;
                    i2 |= 4194304;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                case 23 /* 23 */:
                    c3109 = (C3109) interfaceC0766Mo2512.mo2239(interfaceC2654, 23, C3107.f9926, c3109);
                    i = 8388608;
                    i2 |= 8388608;
                    num2 = num2;
                    c3332 = c3332;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Integer num11 = num;
        Integer num12 = num2;
        String str6 = str3;
        Long l2 = l;
        Integer num13 = num5;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        C3221 c3222 = c3221;
        C3094 c3095 = c3094;
        C3100 c3101 = c3100;
        return new C3381(i2, str6, l2, num13, str4, num6, num7, str5, num8, num9, num10, c3095, num12, c3332, num11, c3064, num3, c3293, num4, str2, c3146, c3372, c3101, c3222, c3109);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1862.f6185);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3092.f9873), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3330.f10532), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3062.f9812), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3291.f10431), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C3144.f10004), AbstractC2205.m4056(C3370.f10625), AbstractC2205.m4056(C3098.f9898), AbstractC2205.m4056(C3219.f10251), AbstractC2205.m4056(C3107.f9926)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3381 c3381 = (C3381) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3381.f10637);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1862.f6185, c3381.f10638);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3381.f10639);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3381.f10640);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3381.f10641);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3381.f10642);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3381.f10643);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3381.f10644);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3381.f10645);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3381.f10646);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, C3092.f9873, c3381.f10647);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1665, c3381.f10648);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, C3330.f10532, c3381.f10649);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c1665, c3381.f10650);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, C3062.f9812, c3381.f10651);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c1665, c3381.f10652);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, C3291.f10431, c3381.f10653);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, c1665, c3381.f10654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 18, c2839, c3381.f10655);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 19, C3144.f10004, c3381.f10656);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 20, C3370.f10625, c3381.f10657);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 21, C3098.f9898, c3381.f10658);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 22, C3219.f10251, c3381.f10659);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 23, C3107.f9926, c3381.f10660);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
