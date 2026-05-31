package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3203 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3203 f10171;

    static {
        C3203 c3203 = new C3203();
        f10171 = c3203;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.lt1Proto", c3203, 16);
        AbstractC2647.m4626(c2405, "music_topic_id", false, 1);
        AbstractC2647.m4626(c2405, "music_topic_name", false, 2);
        AbstractC2647.m4626(c2405, "singers", false, 3);
        AbstractC2647.m4626(c2405, "music_info", false, 4);
        AbstractC2647.m4626(c2405, "feed_count", false, 5);
        AbstractC2647.m4626(c2405, "read_count", false, 6);
        AbstractC2647.m4626(c2405, "tab_info", false, 7);
        AbstractC2647.m4626(c2405, "cover_img_url", false, 8);
        AbstractC2647.m4626(c2405, "fav_available_flag", false, 9);
        AbstractC2647.m4626(c2405, "fav_flag", false, 10);
        AbstractC2647.m4626(c2405, "miaojian_sdk_prefix", false, 13);
        AbstractC2647.m4626(c2405, "listen_song_id", false, 14);
        AbstractC2647.m4626(c2405, "listen_song_like_flag", false, 15);
        AbstractC2647.m4626(c2405, "copyright_mark", false, 16);
        AbstractC2647.m4626(c2405, "music_source_type", false, 17);
        AbstractC2647.m4626(c2405, "music_audio_id", false, 18);
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
        Long l;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3205.f10172;
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l2 = null;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
        String str2 = null;
        C3153 c3153 = null;
        Integer num6 = null;
        Integer num7 = null;
        C3232 c3232 = null;
        String str3 = null;
        Long l3 = null;
        String str4 = null;
        List list = null;
        int i = 0;
        boolean z = true;
        while (z) {
            C3153 c3154 = c3153;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    l = l3;
                    z = false;
                    num3 = num3;
                    c3153 = c3154;
                    num6 = num6;
                    l3 = l;
                    num2 = num2;
                    break;
                case 0:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1888.f6259, l3);
                    i |= 1;
                    num3 = num3;
                    c3153 = c3154;
                    num6 = num6;
                    l3 = l;
                    num2 = num2;
                    break;
                case 1:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str4);
                    i |= 2;
                    list = list;
                    c3153 = c3154;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 2:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), list);
                    i |= 4;
                    c3153 = c3154;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 3:
                    num2 = num2;
                    num6 = num6;
                    c3153 = (C3153) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3151.f10040, c3154);
                    i |= 8;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 4:
                    num2 = num2;
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num6);
                    i |= 16;
                    c3153 = c3154;
                    num2 = num2;
                    break;
                case 5:
                    num7 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num7);
                    i |= 32;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 6:
                    c3232 = (C3232) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3230.f10332, c3232);
                    i |= 64;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 7:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str3);
                    i |= 128;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 8:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num);
                    i |= bc.e;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 9:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num4);
                    i |= 512;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 10:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str);
                    i |= 1024;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 11:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1888.f6259, l2);
                    i |= 2048;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1680.f5658, num3);
                    i |= 4096;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 13:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C1680.f5658, num2);
                    i |= 8192;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C1680.f5658, num5);
                    i |= Http2.INITIAL_MAX_FRAME_SIZE;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                case 15:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C2899.f9270, str2);
                    i |= 32768;
                    c3153 = c3154;
                    num6 = num6;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Integer num8 = num2;
        Integer num9 = num6;
        Long l4 = l3;
        String str5 = str4;
        List list2 = list;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3205(i, l4, str5, list2, c3153, num9, num7, c3232, str3, num, num4, str, l2, num3, num8, num5, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3205.f10172;
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1888);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[2].getValue());
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(C3151.f10040);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3230.f10332), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3205 c3205 = (C3205) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3205.f10172;
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1888, c3205.f10173);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3205.f10174);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), c3205.f10175);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3151.f10040, c3205.f10176);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3205.f10177);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3205.f10178);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, C3230.f10332, c3205.f10179);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3205.f10180);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3205.f10181);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3205.f10182);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3205.f10183);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1888, c3205.f10184);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1680, c3205.f10185);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c1680, c3205.f10186);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c1680, c3205.f10187);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c2899, c3205.f10188);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
