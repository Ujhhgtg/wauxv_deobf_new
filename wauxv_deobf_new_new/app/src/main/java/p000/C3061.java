package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3061 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3061 f9821;

    static {
        C3061 c3061 = new C3061();
        f9821 = c3061;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.WebSearchInfoProto", c3061, 20);
        AbstractC2647.m4626(c2405, "relevant_vid", false, 1);
        AbstractC2647.m4626(c2405, "relevant_expand", false, 2);
        AbstractC2647.m4626(c2405, "relevant_pre_searchid", false, 3);
        AbstractC2647.m4626(c2405, "relevant_shared_openid", false, 4);
        AbstractC2647.m4626(c2405, "rec_category", false, 5);
        AbstractC2647.m4626(c2405, "strPlayCount", false, 6);
        AbstractC2647.m4626(c2405, "shareUrl", false, 7);
        AbstractC2647.m4626(c2405, "shareTitle", false, 8);
        AbstractC2647.m4626(c2405, "shareDesc", false, 9);
        AbstractC2647.m4626(c2405, "shareImgUrl", false, 10);
        AbstractC2647.m4626(c2405, "shareString", false, 11);
        AbstractC2647.m4626(c2405, "shareStringUrl", false, 12);
        AbstractC2647.m4626(c2405, "source", false, 13);
        AbstractC2647.m4626(c2405, "sourceUrl", false, 14);
        AbstractC2647.m4626(c2405, "titleUrl", false, 15);
        AbstractC2647.m4626(c2405, "extReqParams", false, 16);
        AbstractC2647.m4626(c2405, "tagList", false, 17);
        AbstractC2647.m4626(c2405, "channelId", false, 18);
        AbstractC2647.m4626(c2405, "thumbUrl", false, 19);
        AbstractC2647.m4626(c2405, "shareTag", false, 20);
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Long l = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        Long l2 = null;
        String str17 = null;
        String str18 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            String str19 = str11;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    str3 = str3;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    str15 = str15;
                    break;
                case 0:
                    str13 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str13);
                    i2 |= 1;
                    str3 = str3;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    str15 = str15;
                    break;
                case 1:
                    str14 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str14);
                    i2 |= 2;
                    str15 = str15;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 2:
                    str15 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str15);
                    i2 |= 4;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 3:
                    str16 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str16);
                    i2 |= 8;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 4:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1888.f6259, l2);
                    i2 |= 16;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 5:
                    str17 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str17);
                    i2 |= 32;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 6:
                    str18 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str18);
                    i2 |= 64;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 7:
                    str2 = str2;
                    str12 = str12;
                    str11 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str19);
                    i2 |= 128;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    str12 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str12);
                    i2 |= bc.e;
                    str11 = str19;
                    str2 = str2;
                    break;
                case 9:
                    str12 = str12;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i2 |= 512;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 10:
                    str12 = str12;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str4);
                    i2 |= 1024;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 11:
                    str12 = str12;
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str5);
                    i2 |= 2048;
                    str11 = str19;
                    str12 = str12;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str12 = str12;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str3);
                    i2 |= 4096;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 13:
                    str12 = str12;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C2899.f9270, str2);
                    i2 |= 8192;
                    str11 = str19;
                    str12 = str12;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str12 = str12;
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C2899.f9270, str6);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 15:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C2899.f9270, str7);
                    i = 32768;
                    i2 |= i;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 16:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C2899.f9270, str8);
                    i = 65536;
                    i2 |= i;
                    str11 = str19;
                    str12 = str12;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C1888.f6259, l);
                    i = 131072;
                    i2 |= i;
                    str11 = str19;
                    str12 = str12;
                    break;
                case Opcodes.LDC /* 18 */:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 18, C2899.f9270, str9);
                    i = 262144;
                    i2 |= i;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 19:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 19, C2899.f9270, str10);
                    i = 524288;
                    i2 |= i;
                    str11 = str19;
                    str12 = str12;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        String str20 = str2;
        String str21 = str12;
        String str22 = str13;
        String str23 = str14;
        String str24 = str15;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        String str25 = str5;
        return new C3063(i2, str22, str23, str24, str16, l2, str17, str18, str11, str21, str, str4, str25, str3, str20, str6, str7, str8, l, str9, str10);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, AbstractC1471.m3392(c1888), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3063 c3063 = (C3063) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3063.f9822);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3063.f9823);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3063.f9824);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3063.f9825);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1888, c3063.f9826);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3063.f9827);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3063.f9828);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3063.f9829);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3063.f9830);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3063.f9831);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3063.f9832);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3063.f9833);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3063.f9834);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c2899, c3063.f9835);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c2899, c3063.f9836);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c2899, c3063.f9837);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c2899, c3063.f9838);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, c1888, c3063.f9839);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 18, c2899, c3063.f9840);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 19, c2899, c3063.f9841);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
