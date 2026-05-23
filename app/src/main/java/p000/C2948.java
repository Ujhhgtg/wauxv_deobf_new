package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲈᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2948 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2948 f9430;

    static {
        C2948 c2948 = new C2948();
        f9430 = c2948;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ContentObjProto", c2948, 21);
        AbstractC2668.m4680(c2360, "description", false, 1);
        AbstractC2668.m4680(c2360, "contentStyle", false, 2);
        AbstractC2668.m4680(c2360, "title", false, 3);
        AbstractC2668.m4680(c2360, "contentUrl", false, 4);
        AbstractC2668.m4680(c2360, "mediaList", false, 5);
        AbstractC2668.m4680(c2360, "contentSubStyle", false, 6);
        AbstractC2668.m4680(c2360, "noteLinkXml", false, 7);
        AbstractC2668.m4680(c2360, "readershare", false, 8);
        AbstractC2668.m4680(c2360, "finderFeed", false, 9);
        AbstractC2668.m4680(c2360, "shareFinderTopic", false, 10);
        AbstractC2668.m4680(c2360, "brandmpvideo", false, 11);
        AbstractC2668.m4680(c2360, "finderColumn", false, 12);
        AbstractC2668.m4680(c2360, "springFinderLive", false, 13);
        AbstractC2668.m4680(c2360, "finderMegaVideo", false, 14);
        AbstractC2668.m4680(c2360, "finderType", false, 15);
        AbstractC2668.m4680(c2360, "finderTopic", false, 16);
        AbstractC2668.m4680(c2360, "shareMusic", false, 17);
        AbstractC2668.m4680(c2360, "sharePoi", false, 18);
        AbstractC2668.m4680(c2360, "linkEnabled", false, 19);
        AbstractC2668.m4680(c2360, "shareMusicTopic", false, 20);
        AbstractC2668.m4680(c2360, "rabbit2023", false, 21);
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
        InterfaceC1758[] interfaceC1758Arr = C2950.f9431;
        
        C2959 c2959 = null;
        C3242 c3242 = null;
        C2989 c2989 = null;
        C3296 c3296 = null;
        C3022 c3022 = null;
        C3121 c3121 = null;
        Integer num = null;
        C3022 c3023 = null;
        C3362 c3362 = null;
        C3007 c3007 = null;
        C3179 c3179 = null;
        C3022 c3024 = null;
        C3164 c3164 = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Integer num3 = null;
        String str4 = null;
        C2980 c2980 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            C2959 c29510 = c2959;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    c2989 = c2989;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i2 |= 1;
                    c2989 = c2989;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    str2 = str2;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                    i2 |= 2;
                    str2 = str2;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i2 |= 4;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 3:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                    i2 |= 8;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 4:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), list);
                    i2 |= 16;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num3);
                    i2 |= 32;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 6:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str4);
                    i2 |= 64;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 7:
                    c2980 = (C2980) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2978.f9563, c2980);
                    i2 |= 128;
                    c2959 = c29510;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 8:
                    c3242 = c3242;
                    c3022 = c3022;
                    c2959 = (C2959) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2957.f9458, c29510);
                    i2 |= 256;
                    c3022 = c3022;
                    c3242 = c3242;
                    break;
                case 9:
                    c3242 = c3242;
                    c3022 = (C3022) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C3020.f9709, c3022);
                    i2 |= 512;
                    c2959 = c29510;
                    c3242 = c3242;
                    break;
                case 10:
                    c3022 = c3022;
                    c3121 = (C3121) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C3119.f9948, c3121);
                    i2 |= 1024;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 11:
                    c3022 = c3022;
                    c3296 = (C3296) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C3294.f10463, c3296);
                    i2 |= 2048;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 12 /* 12 */:
                    c3022 = c3022;
                    c2989 = (C2989) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2987.f9582, c2989);
                    i2 |= 4096;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 13:
                    c3022 = c3022;
                    c3242 = (C3242) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C3240.f10285, c3242);
                    i2 |= 8192;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 14 /* 14 */:
                    c3022 = c3022;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C1665.f5622, num);
                    i2 |= 16384;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 15:
                    c3023 = (C3022) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C3020.f9709, c3023);
                    i = 32768;
                    i2 |= 32768;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 16:
                    c3362 = (C3362) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C3360.f10595, c3362);
                    i = 65536;
                    i2 |= 65536;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 17 /* 17 */:
                    c3007 = (C3007) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C3005.f9675, c3007);
                    i = 131072;
                    i2 |= 131072;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 18 /* 18 */:
                    c3179 = (C3179) interfaceC0766Mo2512.mo2239(interfaceC2654, 18, C3177.f10178, c3179);
                    i = 262144;
                    i2 |= 262144;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 19:
                    c3024 = (C3022) interfaceC0766Mo2512.mo2239(interfaceC2654, 19, C3020.f9709, c3024);
                    i = 524288;
                    i2 |= 524288;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                case 20:
                    c3164 = (C3164) interfaceC0766Mo2512.mo2239(interfaceC2654, 20, C3162.f10143, c3164);
                    i = 1048576;
                    i2 |= 1048576;
                    c2959 = c29510;
                    c3022 = c3022;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        C3242 c3243 = c3242;
        C3022 c3025 = c3022;
        String str5 = str;
        Integer num4 = num2;
        String str6 = str2;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        C3121 c3122 = c3121;
        return new C2950(i2, str5, num4, str6, str3, list, num3, str4, c2980, c2959, c3025, c3122, c3296, c2989, c3243, num, c3023, c3362, c3007, c3179, c3024, c3164);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C2950.f9431;
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[4].getValue());
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40513 = AbstractC2205.m4056(C2978.f9563);
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(C2957.f9458);
        C3020 c3020 = C3020.f9709;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, AbstractC2205.m4056(c3020), AbstractC2205.m4056(C3119.f9948), AbstractC2205.m4056(C3294.f10463), AbstractC2205.m4056(C2987.f9582), AbstractC2205.m4056(C3240.f10285), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c3020), AbstractC2205.m4056(C3360.f10595), AbstractC2205.m4056(C3005.f9675), AbstractC2205.m4056(C3177.f10178), AbstractC2205.m4056(c3020), AbstractC2205.m4056(C3162.f10143)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2950 c2950 = (C2950) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C2950.f9431;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c2950.f9432);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c2950.f9433);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2950.f9434);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c2950.f9435);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), c2950.f9436);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c2950.f9437);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c2950.f9438);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, C2978.f9563, c2950.f9439);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C2957.f9458, c2950.f9440);
        C3020 c3020 = C3020.f9709;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c3020, c2950.f9441);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, C3119.f9948, c2950.f9442);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, C3294.f10463, c2950.f9443);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, C2987.f9582, c2950.f9444);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, C3240.f10285, c2950.f9445);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c1665, c2950.f9446);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c3020, c2950.f9447);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, C3360.f10595, c2950.f9448);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, C3005.f9675, c2950.f9449);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 18, C3177.f10178, c2950.f9450);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 19, c3020, c2950.f9451);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 20, C3162.f10143, c2950.f9452);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
