package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤝᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3420 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3420 f10763;

    static {
        C3420 c3420 = new C3420();
        f10763 = c3420;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.xq3Proto", c3420, 21);
        AbstractC2647.m4626(c2405, "mvObjectId", false, 1);
        AbstractC2647.m4626(c2405, "mvNonceId", false, 2);
        AbstractC2647.m4626(c2405, "mvCoverUrl", false, 3);
        AbstractC2647.m4626(c2405, "mvMakerFinderNickname", false, 4);
        AbstractC2647.m4626(c2405, "singerName", false, 5);
        AbstractC2647.m4626(c2405, "albumName", false, 6);
        AbstractC2647.m4626(c2405, "extraInfo", false, 7);
        AbstractC2647.m4626(c2405, "musicGenre", false, 8);
        AbstractC2647.m4626(c2405, "issueDate", false, 9);
        AbstractC2647.m4626(c2405, "identification", false, 10);
        AbstractC2647.m4626(c2405, "musicDuration", false, 11);
        AbstractC2647.m4626(c2405, "mid", false, 12);
        AbstractC2647.m4626(c2405, "musicOperationUrl", false, 13);
        AbstractC2647.m4626(c2405, "musicCoverPath", false, 21);
        AbstractC2647.m4626(c2405, "songName", false, 22);
        AbstractC2647.m4626(c2405, "songLyric", false, 23);
        AbstractC2647.m4626(c2405, "albumCoverUrl", false, 25);
        AbstractC2647.m4626(c2405, "appIdForSourceDisplay", false, 26);
        AbstractC2647.m4626(c2405, "listenType", false, 27);
        AbstractC2647.m4626(c2405, "listenItem", false, 28);
        AbstractC2647.m4626(c2405, "listenId", false, 29);
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
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num2 = null;
        String str9 = null;
        String str10 = null;
        Long l = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            l = l;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    str3 = str3;
                    str2 = str2;
                    str13 = str13;
                    break;
                case 0:
                    str11 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str11);
                    i2 |= 1;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                    str13 = str13;
                    break;
                case 1:
                    str12 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str12);
                    i2 |= 2;
                    str13 = str13;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 2:
                    str13 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str13);
                    i2 |= 4;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 3:
                    str14 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str14);
                    i2 |= 8;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 4:
                    str15 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str15);
                    i2 |= 16;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 5:
                    str16 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str16);
                    i2 |= 32;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 6:
                    str17 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str17);
                    i2 |= 64;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 7:
                    str18 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str18);
                    i2 |= 128;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    str = str;
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1888.f6259, l);
                    i2 |= bc.e;
                    str = str;
                    str2 = str2;
                    break;
                case 9:
                    str2 = str2;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i2 |= 512;
                    l = l;
                    str2 = str2;
                    break;
                case 10:
                    str = str;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num);
                    i2 |= 1024;
                    l = l;
                    str = str;
                    break;
                case 11:
                    str = str;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str4);
                    i2 |= 2048;
                    l = l;
                    str = str;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str = str;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str3);
                    i2 |= 4096;
                    l = l;
                    str = str;
                    break;
                case 13:
                    str = str;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C2899.f9270, str2);
                    i2 |= 8192;
                    l = l;
                    str = str;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str = str;
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C2899.f9270, str5);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    l = l;
                    str = str;
                    break;
                case 15:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C2899.f9270, str6);
                    i = 32768;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                case 16:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C2899.f9270, str7);
                    i = 65536;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C2899.f9270, str8);
                    i = 131072;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                case Opcodes.LDC /* 18 */:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 18, C1680.f5658, num2);
                    i = 262144;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                case 19:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 19, C2899.f9270, str9);
                    i = 524288;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                case 20:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 20, C2899.f9270, str10);
                    i = 1048576;
                    i2 |= i;
                    l = l;
                    str = str;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        String str19 = str2;
        Long l2 = l;
        String str20 = str11;
        String str21 = str12;
        String str22 = str13;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        String str23 = str4;
        return new C3422(i2, str20, str21, str22, str14, str15, str16, str17, str18, l2, str, num, str23, str3, str19, str5, str6, str7, str8, num2, str9, str10);
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
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(C1888.f6259);
        InterfaceC1767 interfaceC1767M33911 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, interfaceC1767M33911, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3422 c3422 = (C3422) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3422.f10764);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3422.f10765);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3422.f10766);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3422.f10767);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3422.f10768);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3422.f10769);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3422.f10770);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3422.f10771);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C1888.f6259, c3422.f10772);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3422.f10773);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3422.f10774);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3422.f10775);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3422.f10776);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c2899, c3422.f10777);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c2899, c3422.f10778);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c2899, c3422.f10779);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c2899, c3422.f10780);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, c2899, c3422.f10781);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 18, c1680, c3422.f10782);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 19, c2899, c3422.f10783);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 20, c2899, c3422.f10784);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
