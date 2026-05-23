package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3144 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3144 f10004;

    static {
        C3144 c3144 = new C3144();
        f10004 = c3144;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.lt1Proto", c3144, 16);
        AbstractC2668.m4680(c2360, "music_topic_id", false, 1);
        AbstractC2668.m4680(c2360, "music_topic_name", false, 2);
        AbstractC2668.m4680(c2360, "singers", false, 3);
        AbstractC2668.m4680(c2360, "music_info", false, 4);
        AbstractC2668.m4680(c2360, "feed_count", false, 5);
        AbstractC2668.m4680(c2360, "read_count", false, 6);
        AbstractC2668.m4680(c2360, "tab_info", false, 7);
        AbstractC2668.m4680(c2360, "cover_img_url", false, 8);
        AbstractC2668.m4680(c2360, "fav_available_flag", false, 9);
        AbstractC2668.m4680(c2360, "fav_flag", false, 10);
        AbstractC2668.m4680(c2360, "miaojian_sdk_prefix", false, 13);
        AbstractC2668.m4680(c2360, "listen_song_id", false, 14);
        AbstractC2668.m4680(c2360, "listen_song_like_flag", false, 15);
        AbstractC2668.m4680(c2360, "copyright_mark", false, 16);
        AbstractC2668.m4680(c2360, "music_source_type", false, 17);
        AbstractC2668.m4680(c2360, "music_audio_id", false, 18);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        Long l;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3146.f10005;
        
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l2 = null;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
        String str2 = null;
        C3094 c3094 = null;
        Integer num6 = null;
        Integer num7 = null;
        C3173 c3173 = null;
        String str3 = null;
        Long l3 = null;
        String str4 = null;
        List list = null;
        int i = 0;
        boolean z = true;
        while (z) {
            C3094 c3095 = c3094;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    l = l3;
                    z = false;
                    num3 = num3;
                    c3094 = c3095;
                    num6 = num6;
                    l3 = l;
                    num2 = num2;
                    break;
                case 0:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1862.f6185, l3);
                    i |= 1;
                    num3 = num3;
                    c3094 = c3095;
                    num6 = num6;
                    l3 = l;
                    num2 = num2;
                    break;
                case 1:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str4);
                    i |= 2;
                    list = list;
                    c3094 = c3095;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 2:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), list);
                    i |= 4;
                    c3094 = c3095;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 3:
                    num2 = num2;
                    num6 = num6;
                    c3094 = (C3094) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3092.f9873, c3095);
                    i |= 8;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 4:
                    num2 = num2;
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num6);
                    i |= 16;
                    c3094 = c3095;
                    num2 = num2;
                    break;
                case 5:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num7);
                    i |= 32;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 6:
                    c3173 = (C3173) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C3171.f10165, c3173);
                    i |= 64;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 7:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str3);
                    i |= 128;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 8:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num);
                    i |= 256;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 9:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num4);
                    i |= 512;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 10:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str);
                    i |= 1024;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 11:
                    l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1862.f6185, l2);
                    i |= 2048;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 12 /* 12 */:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1665.f5622, num3);
                    i |= 4096;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 13:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C1665.f5622, num2);
                    i |= 8192;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 14 /* 14 */:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C1665.f5622, num5);
                    i |= 16384;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                case 15:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C2839.f9108, str2);
                    i |= 32768;
                    c3094 = c3095;
                    num6 = num6;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Integer num8 = num2;
        Integer num9 = num6;
        Long l4 = l3;
        String str5 = str4;
        List list2 = list;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3146(i, l4, str5, list2, c3094, num9, num7, c3173, str3, num, num4, str, l2, num3, num8, num5, str2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3146.f10005;
        C1862 c1862 = C1862.f6185;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1862);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[2].getValue());
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(C3092.f9873);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3171.f10165), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1862), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3146 c3146 = (C3146) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3146.f10005;
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1862, c3146.f10006);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3146.f10007);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), c3146.f10008);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3092.f9873, c3146.f10009);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3146.f10010);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3146.f10011);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C3171.f10165, c3146.f10012);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3146.f10013);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3146.f10014);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3146.f10015);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3146.f10016);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1862, c3146.f10017);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1665, c3146.f10018);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c1665, c3146.f10019);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c1665, c3146.f10020);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c2839, c3146.f10021);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
