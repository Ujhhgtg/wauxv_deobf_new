package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲀᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3056 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3056 f9790;

    static {
        C3056 c3056 = new C3056();
        f9790 = c3056;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ec5Proto", c3056, 18);
        AbstractC2668.m4680(c2360, "reward_product_id", false, 1);
        AbstractC2668.m4680(c2360, "business_type", false, 2);
        AbstractC2668.m4680(c2360, "thumbnail_file_url", false, 3);
        AbstractC2668.m4680(c2360, "preview_pag_url", false, 4);
        AbstractC2668.m4680(c2360, "animation_pag_url", false, 5);
        AbstractC2668.m4680(c2360, "thumbnail_file_md5", false, 6);
        AbstractC2668.m4680(c2360, "preview_pag_md5", false, 7);
        AbstractC2668.m4680(c2360, "animation_pag_md5", false, 8);
        AbstractC2668.m4680(c2360, "name", false, 9);
        AbstractC2668.m4680(c2360, "price", false, 10);
        AbstractC2668.m4680(c2360, "gift_type", false, 11);
        AbstractC2668.m4680(c2360, "unlock_intimacy_level", false, 12);
        AbstractC2668.m4680(c2360, "flag", false, 13);
        AbstractC2668.m4680(c2360, "landscape_animation_pag_url", false, 14);
        AbstractC2668.m4680(c2360, "landscape_animation_pag_md5", false, 15);
        AbstractC2668.m4680(c2360, "custom_info", false, 16);
        AbstractC2668.m4680(c2360, "unlock_global_reward_level", false, 17);
        AbstractC2668.m4680(c2360, "tag_color", false, 18);
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
        String str = null;
        C3043 c3043 = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        C3043 c3044 = null;
        C3043 c3045 = null;
        C3043 c3046 = null;
        C3043 c3047 = null;
        Float f = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str5 = null;
        C3043 c3048 = null;
        C3043 c3049 = null;
        C3043 c30410 = null;
        C3043 c30411 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Float f2 = f;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    num = num;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    c3049 = c3049;
                    break;
                case 0:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str5);
                    i2 |= 1;
                    num = num;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    c3049 = c3049;
                    break;
                case 1:
                    c3048 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3041.f9752, c3048);
                    i2 |= 2;
                    c3049 = c3049;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    break;
                case 2:
                    c3049 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3041.f9752, c3049);
                    i2 |= 4;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    break;
                case 3:
                    c30410 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3041.f9752, c30410);
                    i2 |= 8;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    break;
                case 4:
                    c30411 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C3041.f9752, c30411);
                    i2 |= 16;
                    f = f2;
                    str4 = str4;
                    c3043 = c3043;
                    break;
                case 5:
                    c3043 = c3043;
                    str4 = str4;
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1365.f4873, f2);
                    i2 |= 32;
                    str4 = str4;
                    c3043 = c3043;
                    break;
                case 6:
                    c3043 = c3043;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str4);
                    i2 |= 64;
                    f = f2;
                    c3043 = c3043;
                    break;
                case 7:
                    str4 = str4;
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C0441.f2008, bool);
                    i2 |= 128;
                    f = f2;
                    str4 = str4;
                    break;
                case 8:
                    str4 = str4;
                    bool2 = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C0441.f2008, bool2);
                    i2 |= bc.e;
                    f = f2;
                    str4 = str4;
                    break;
                case 9:
                    str4 = str4;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i2 |= 512;
                    f = f2;
                    str4 = str4;
                    break;
                case 10:
                    str4 = str4;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str2);
                    i2 |= 1024;
                    f = f2;
                    str4 = str4;
                    break;
                case 11:
                    str4 = str4;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str3);
                    i2 |= 2048;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str4 = str4;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1665.f5622, num);
                    i2 |= 4096;
                    f = f2;
                    str4 = str4;
                    break;
                case 13:
                    str4 = str4;
                    c3043 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C3041.f9752, c3043);
                    i2 |= 8192;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str4 = str4;
                    c3044 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C3041.f9752, c3044);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    f = f2;
                    str4 = str4;
                    break;
                case 15:
                    c3045 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C3041.f9752, c3045);
                    i = 32768;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                case 16:
                    c3046 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C3041.f9752, c3046);
                    i = 65536;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3047 = (C3043) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C3041.f9752, c3047);
                    i = 131072;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        C3043 c30412 = c3043;
        String str6 = str4;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3058(i2, str5, c3048, c3049, c30410, c30411, f, str6, bool, bool2, str, str2, str3, num, c30412, c3044, c3045, c3046, c3047);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        C3041 c3041 = C3041.f9752;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c3041);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(C1365.f4873);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c2839);
        C0441 c0441 = C0441.f2008;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, AbstractC2205.m4056(c0441), AbstractC2205.m4056(c0441), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041), AbstractC2205.m4056(c3041)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3058 c3058 = (C3058) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3058.f9791);
        C3041 c3041 = C3041.f9752;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c3041, c3058.f9792);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c3041, c3058.f9793);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c3041, c3058.f9794);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c3041, c3058.f9795);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C1365.f4873, c3058.f9796);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3058.f9797);
        C0441 c0441 = C0441.f2008;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c0441, c3058.f9798);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c0441, c3058.f9799);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3058.f9800);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3058.f9801);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3058.f9802);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, C1665.f5622, c3058.f9803);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c3041, c3058.f9804);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c3041, c3058.f9805);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c3041, c3058.f9806);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c3041, c3058.f9807);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, c3041, c3058.f9808);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
