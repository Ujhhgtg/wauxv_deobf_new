package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3002 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3002 f9654;

    static {
        C3002 c3002 = new C3002();
        f9654 = c3002;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.WebSearchInfoProto", c3002, 20);
        AbstractC2668.m4680(c2360, "relevant_vid", false, 1);
        AbstractC2668.m4680(c2360, "relevant_expand", false, 2);
        AbstractC2668.m4680(c2360, "relevant_pre_searchid", false, 3);
        AbstractC2668.m4680(c2360, "relevant_shared_openid", false, 4);
        AbstractC2668.m4680(c2360, "rec_category", false, 5);
        AbstractC2668.m4680(c2360, "strPlayCount", false, 6);
        AbstractC2668.m4680(c2360, "shareUrl", false, 7);
        AbstractC2668.m4680(c2360, "shareTitle", false, 8);
        AbstractC2668.m4680(c2360, "shareDesc", false, 9);
        AbstractC2668.m4680(c2360, "shareImgUrl", false, 10);
        AbstractC2668.m4680(c2360, "shareString", false, 11);
        AbstractC2668.m4680(c2360, "shareStringUrl", false, 12);
        AbstractC2668.m4680(c2360, "source", false, 13);
        AbstractC2668.m4680(c2360, "sourceUrl", false, 14);
        AbstractC2668.m4680(c2360, "titleUrl", false, 15);
        AbstractC2668.m4680(c2360, "extReqParams", false, 16);
        AbstractC2668.m4680(c2360, "tagList", false, 17);
        AbstractC2668.m4680(c2360, "channelId", false, 18);
        AbstractC2668.m4680(c2360, "thumbUrl", false, 19);
        AbstractC2668.m4680(c2360, "shareTag", false, 20);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        int i;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        
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
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    str3 = str3;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    str15 = str15;
                    break;
                case 0:
                    str13 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str13);
                    i2 |= 1;
                    str3 = str3;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    str15 = str15;
                    break;
                case 1:
                    str14 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str14);
                    i2 |= 2;
                    str15 = str15;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 2:
                    str15 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str15);
                    i2 |= 4;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 3:
                    str16 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str16);
                    i2 |= 8;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 4:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1862.f6185, l2);
                    i2 |= 16;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 5:
                    str17 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str17);
                    i2 |= 32;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 6:
                    str18 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str18);
                    i2 |= 64;
                    str11 = str19;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 7:
                    str2 = str2;
                    str12 = str12;
                    str11 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str19);
                    i2 |= 128;
                    str12 = str12;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    str12 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str12);
                    i2 |= 256;
                    str11 = str19;
                    str2 = str2;
                    break;
                case 9:
                    str12 = str12;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i2 |= 512;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 10:
                    str12 = str12;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str4);
                    i2 |= 1024;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 11:
                    str12 = str12;
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str5);
                    i2 |= 2048;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 12 /* 12 */:
                    str12 = str12;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str3);
                    i2 |= 4096;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 13:
                    str12 = str12;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C2839.f9108, str2);
                    i2 |= 8192;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 14 /* 14 */:
                    str12 = str12;
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C2839.f9108, str6);
                    i2 |= 16384;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 15:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C2839.f9108, str7);
                    i = 32768;
                    i2 |= 32768;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 16:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C2839.f9108, str8);
                    i = 65536;
                    i2 |= 65536;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 17 /* 17 */:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C1862.f6185, l);
                    i = 131072;
                    i2 |= 131072;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 18 /* 18 */:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 18, C2839.f9108, str9);
                    i = 262144;
                    i2 |= 262144;
                    str11 = str19;
                    str12 = str12;
                    break;
                case 19:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 19, C2839.f9108, str10);
                    i = 524288;
                    i2 |= 524288;
                    str11 = str19;
                    str12 = str12;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        String str20 = str2;
        String str21 = str12;
        String str22 = str13;
        String str23 = str14;
        String str24 = str15;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        String str25 = str5;
        return new C3004(i2, str22, str23, str24, str16, l2, str17, str18, str11, str21, str, str4, str25, str3, str20, str6, str7, str8, l, str9, str10);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, AbstractC2205.m4056(c1862), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3004 c3004 = (C3004) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3004.f9655);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3004.f9656);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3004.f9657);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3004.f9658);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1862, c3004.f9659);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3004.f9660);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3004.f9661);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3004.f9662);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3004.f9663);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3004.f9664);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3004.f9665);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3004.f9666);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3004.f9667);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c2839, c3004.f9668);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c2839, c3004.f9669);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c2839, c3004.f9670);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c2839, c3004.f9671);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, c1862, c3004.f9672);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 18, c2839, c3004.f9673);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 19, c2839, c3004.f9674);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
