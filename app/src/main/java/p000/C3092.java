package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲈᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3092 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3092 f9873;

    static {
        C3092 c3092 = new C3092();
        f9873 = c3092;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gt1Proto", c3092, 18);
        AbstractC2668.m4680(c2360, "docId", false, 1);
        AbstractC2668.m4680(c2360, "albumThumbUrl", false, 2);
        AbstractC2668.m4680(c2360, "name", false, 3);
        AbstractC2668.m4680(c2360, "artist", false, 4);
        AbstractC2668.m4680(c2360, "albumName", false, 5);
        AbstractC2668.m4680(c2360, "mediaStreamingUrl", false, 6);
        AbstractC2668.m4680(c2360, "miniappInfo", false, 7);
        AbstractC2668.m4680(c2360, "webUrl", false, 8);
        AbstractC2668.m4680(c2360, "floatThumbUrl", false, 9);
        AbstractC2668.m4680(c2360, "musicPlayLen", false, 10);
        AbstractC2668.m4680(c2360, "high_url", false, 15);
        AbstractC2668.m4680(c2360, "doc_type", false, 16);
        AbstractC2668.m4680(c2360, "song_id", false, 17);
        AbstractC2668.m4680(c2360, "is_try_song", false, 18);
        AbstractC2668.m4680(c2360, "lrc_content", false, 19);
        AbstractC2668.m4680(c2360, "identification", false, 20);
        AbstractC2668.m4680(c2360, "message_ext", false, 21);
        AbstractC2668.m4680(c2360, "video_template_info", false, 22);
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
        interfaceC0766Mo2512.getClass();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C3109 c3109 = null;
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
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    str = str;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    str12 = str12;
                    break;
                case 0:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str10);
                    i2 |= 1;
                    str = str;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    str12 = str12;
                    break;
                case 1:
                    str11 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str11);
                    i2 |= 2;
                    str12 = str12;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 2:
                    str12 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str12);
                    i2 |= 4;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 3:
                    str13 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str13);
                    i2 |= 8;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 4:
                    str14 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str14);
                    i2 |= 16;
                    str6 = str15;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 5:
                    num2 = num2;
                    str7 = str7;
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str15);
                    i2 |= 32;
                    str7 = str7;
                    num2 = num2;
                    break;
                case 6:
                    num2 = num2;
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str7);
                    i2 |= 64;
                    str6 = str15;
                    num2 = num2;
                    break;
                case 7:
                    str7 = str7;
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i2 |= 128;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 8:
                    str7 = str7;
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str9);
                    i2 |= bc.e;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 9:
                    str7 = str7;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num);
                    i2 |= 512;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 10:
                    str7 = str7;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str2);
                    i2 |= 1024;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 11:
                    str7 = str7;
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1665.f5622, num3);
                    i2 |= 2048;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str7 = str7;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str);
                    i2 |= 4096;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 13:
                    str7 = str7;
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C1665.f5622, num2);
                    i2 |= 8192;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str7 = str7;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C2839.f9108, str3);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 15:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C2839.f9108, str4);
                    i = 32768;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                case 16:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C2839.f9108, str5);
                    i = 65536;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3109 = (C3109) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C3107.f9926, c3109);
                    i = 131072;
                    i2 |= i;
                    str6 = str15;
                    str7 = str7;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Integer num4 = num2;
        String str16 = str7;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3094(i2, str10, str11, str12, str13, str14, str6, str16, str8, str9, num, str2, num3, str, num4, str3, str4, str5, c3109);
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
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C3107.f9926)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3094 c3094 = (C3094) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3094.f9874);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3094.f9875);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3094.f9876);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3094.f9877);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3094.f9878);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3094.f9879);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3094.f9880);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3094.f9881);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3094.f9882);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3094.f9883);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3094.f9884);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1665, c3094.f9885);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3094.f9886);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c1665, c3094.f9887);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c2839, c3094.f9888);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c2839, c3094.f9889);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c2839, c3094.f9890);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, C3107.f9926, c3094.f9891);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
