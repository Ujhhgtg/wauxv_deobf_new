package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲈᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3151 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3151 f10040;

    static {
        C3151 c3151 = new C3151();
        f10040 = c3151;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gt1Proto", c3151, 18);
        AbstractC2647.m4626(c2405, "docId", false, 1);
        AbstractC2647.m4626(c2405, "albumThumbUrl", false, 2);
        AbstractC2647.m4626(c2405, "name", false, 3);
        AbstractC2647.m4626(c2405, "artist", false, 4);
        AbstractC2647.m4626(c2405, "albumName", false, 5);
        AbstractC2647.m4626(c2405, "mediaStreamingUrl", false, 6);
        AbstractC2647.m4626(c2405, "miniappInfo", false, 7);
        AbstractC2647.m4626(c2405, "webUrl", false, 8);
        AbstractC2647.m4626(c2405, "floatThumbUrl", false, 9);
        AbstractC2647.m4626(c2405, "musicPlayLen", false, 10);
        AbstractC2647.m4626(c2405, "high_url", false, 15);
        AbstractC2647.m4626(c2405, "doc_type", false, 16);
        AbstractC2647.m4626(c2405, "song_id", false, 17);
        AbstractC2647.m4626(c2405, "is_try_song", false, 18);
        AbstractC2647.m4626(c2405, "lrc_content", false, 19);
        AbstractC2647.m4626(c2405, "identification", false, 20);
        AbstractC2647.m4626(c2405, "message_ext", false, 21);
        AbstractC2647.m4626(c2405, "video_template_info", false, 22);
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
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C3169 c3169 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            String str15 = str6;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    str = str;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    str12 = str12;
                    break;
                case 0:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str10);
                    i2 |= 1;
                    str = str;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    str12 = str12;
                    break;
                case 1:
                    str11 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str11);
                    i2 |= 2;
                    str12 = str12;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 2:
                    str12 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str12);
                    i2 |= 4;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 3:
                    str13 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str13);
                    i2 |= 8;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 4:
                    str14 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str14);
                    i2 |= 16;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 5:
                    num2 = num2;
                    str7 = str7;
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str15);
                    i2 |= 32;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 6:
                    num2 = num2;
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str7);
                    i2 |= 64;
                    str6 = str15;
                    num2 = num2;
                    break;
                case 7:
                    str7 = str7;
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str8);
                    i2 |= 128;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 8:
                    str7 = str7;
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str9);
                    i2 |= bc.e;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 9:
                    str7 = str7;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i2 |= 512;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 10:
                    str7 = str7;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str2);
                    i2 |= 1024;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 11:
                    str7 = str7;
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1680.f5658, num3);
                    i2 |= 2048;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str7 = str7;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str);
                    i2 |= 4096;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 13:
                    str7 = str7;
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C1680.f5658, num2);
                    i2 |= 8192;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str7 = str7;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C2899.f9270, str3);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 15:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C2899.f9270, str4);
                    i = 32768;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 16:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C2899.f9270, str5);
                    i = 65536;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3169 = (C3169) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C3167.f10094, c3169);
                    i = 131072;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Integer num4 = num2;
        String str16 = str7;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3153(i2, str10, str11, str12, str13, str14, str6, str16, str8, str9, num, str2, num3, str, num4, str3, str4, str5, c3169);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3399 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C3167.f10094)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3153 c3153 = (C3153) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3153.f10041);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3153.f10042);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3153.f10043);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3153.f10044);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3153.f10045);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3153.f10046);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3153.f10047);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3153.f10048);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3153.f10049);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3153.f10050);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3153.f10051);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1680, c3153.f10052);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3153.f10053);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c1680, c3153.f10054);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c2899, c3153.f10055);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c2899, c3153.f10056);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c2899, c3153.f10057);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, C3167.f10094, c3153.f10058);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
