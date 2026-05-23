package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲈᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3360 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3360 f10595;

    static {
        C3360 c3360 = new C3360();
        f10595 = c3360;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.xq3Proto", c3360, 21);
        AbstractC2668.m4680(c2360, "mvObjectId", false, 1);
        AbstractC2668.m4680(c2360, "mvNonceId", false, 2);
        AbstractC2668.m4680(c2360, "mvCoverUrl", false, 3);
        AbstractC2668.m4680(c2360, "mvMakerFinderNickname", false, 4);
        AbstractC2668.m4680(c2360, "singerName", false, 5);
        AbstractC2668.m4680(c2360, "albumName", false, 6);
        AbstractC2668.m4680(c2360, "extraInfo", false, 7);
        AbstractC2668.m4680(c2360, "musicGenre", false, 8);
        AbstractC2668.m4680(c2360, "issueDate", false, 9);
        AbstractC2668.m4680(c2360, "identification", false, 10);
        AbstractC2668.m4680(c2360, "musicDuration", false, 11);
        AbstractC2668.m4680(c2360, "mid", false, 12);
        AbstractC2668.m4680(c2360, "musicOperationUrl", false, 13);
        AbstractC2668.m4680(c2360, "musicCoverPath", false, 21);
        AbstractC2668.m4680(c2360, "songName", false, 22);
        AbstractC2668.m4680(c2360, "songLyric", false, 23);
        AbstractC2668.m4680(c2360, "albumCoverUrl", false, 25);
        AbstractC2668.m4680(c2360, "appIdForSourceDisplay", false, 26);
        AbstractC2668.m4680(c2360, "listenType", false, 27);
        AbstractC2668.m4680(c2360, "listenItem", false, 28);
        AbstractC2668.m4680(c2360, "listenId", false, 29);
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
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        
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
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    str3 = str3;
                    str2 = str2;
                    str13 = str13;
                    break;
                case 0:
                    str11 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str11);
                    i2 |= 1;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                    str13 = str13;
                    break;
                case 1:
                    str12 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str12);
                    i2 |= 2;
                    str13 = str13;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 2:
                    str13 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str13);
                    i2 |= 4;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 3:
                    str14 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str14);
                    i2 |= 8;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 4:
                    str15 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str15);
                    i2 |= 16;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 5:
                    str16 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str16);
                    i2 |= 32;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 6:
                    str17 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str17);
                    i2 |= 64;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 7:
                    str18 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str18);
                    i2 |= 128;
                    l = l;
                    str = str;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    str = str;
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1862.f6185, l);
                    i2 |= 256;
                    str = str;
                    str2 = str2;
                    break;
                case 9:
                    str2 = str2;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i2 |= 512;
                    l = l;
                    str2 = str2;
                    break;
                case 10:
                    str = str;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num);
                    i2 |= 1024;
                    l = l;
                    str = str;
                    break;
                case 11:
                    str = str;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str4);
                    i2 |= 2048;
                    l = l;
                    str = str;
                    break;
                case 12 /* 12 */:
                    str = str;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str3);
                    i2 |= 4096;
                    l = l;
                    str = str;
                    break;
                case 13:
                    str = str;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C2839.f9108, str2);
                    i2 |= 8192;
                    l = l;
                    str = str;
                    break;
                case 14 /* 14 */:
                    str = str;
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C2839.f9108, str5);
                    i2 |= 16384;
                    l = l;
                    str = str;
                    break;
                case 15:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C2839.f9108, str6);
                    i = 32768;
                    i2 |= 32768;
                    l = l;
                    str = str;
                    break;
                case 16:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C2839.f9108, str7);
                    i = 65536;
                    i2 |= 65536;
                    l = l;
                    str = str;
                    break;
                case 17 /* 17 */:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C2839.f9108, str8);
                    i = 131072;
                    i2 |= 131072;
                    l = l;
                    str = str;
                    break;
                case 18 /* 18 */:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 18, C1665.f5622, num2);
                    i = 262144;
                    i2 |= 262144;
                    l = l;
                    str = str;
                    break;
                case 19:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 19, C2839.f9108, str9);
                    i = 524288;
                    i2 |= 524288;
                    l = l;
                    str = str;
                    break;
                case 20:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 20, C2839.f9108, str10);
                    i = 1048576;
                    i2 |= 1048576;
                    l = l;
                    str = str;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        String str19 = str2;
        Long l2 = l;
        String str20 = str11;
        String str21 = str12;
        String str22 = str13;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        String str23 = str4;
        return new C3362(i2, str20, str21, str22, str14, str15, str16, str17, str18, l2, str, num, str23, str3, str19, str5, str6, str7, str8, num2, str9, str10);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40513 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(C1862.f6185);
        InterfaceC1743 interfaceC1743M40515 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, interfaceC1743M40515, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3362 c3362 = (C3362) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3362.f10596);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3362.f10597);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3362.f10598);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3362.f10599);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3362.f10600);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3362.f10601);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3362.f10602);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3362.f10603);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C1862.f6185, c3362.f10604);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3362.f10605);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3362.f10606);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3362.f10607);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3362.f10608);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c2839, c3362.f10609);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c2839, c3362.f10610);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c2839, c3362.f10611);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c2839, c3362.f10612);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, c2839, c3362.f10613);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 18, c1665, c3362.f10614);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 19, c2839, c3362.f10615);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 20, c2839, c3362.f10616);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
