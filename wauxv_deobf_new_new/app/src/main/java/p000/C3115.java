package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᤞᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3115 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3115 f9957;

    static {
        C3115 c3115 = new C3115();
        f9957 = c3115;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ec5Proto", c3115, 18);
        AbstractC2647.m4626(c2405, "reward_product_id", false, 1);
        AbstractC2647.m4626(c2405, "business_type", false, 2);
        AbstractC2647.m4626(c2405, "thumbnail_file_url", false, 3);
        AbstractC2647.m4626(c2405, "preview_pag_url", false, 4);
        AbstractC2647.m4626(c2405, "animation_pag_url", false, 5);
        AbstractC2647.m4626(c2405, "thumbnail_file_md5", false, 6);
        AbstractC2647.m4626(c2405, "preview_pag_md5", false, 7);
        AbstractC2647.m4626(c2405, "animation_pag_md5", false, 8);
        AbstractC2647.m4626(c2405, "name", false, 9);
        AbstractC2647.m4626(c2405, "price", false, 10);
        AbstractC2647.m4626(c2405, "gift_type", false, 11);
        AbstractC2647.m4626(c2405, "unlock_intimacy_level", false, 12);
        AbstractC2647.m4626(c2405, "flag", false, 13);
        AbstractC2647.m4626(c2405, "landscape_animation_pag_url", false, 14);
        AbstractC2647.m4626(c2405, "landscape_animation_pag_md5", false, 15);
        AbstractC2647.m4626(c2405, "custom_info", false, 16);
        AbstractC2647.m4626(c2405, "unlock_global_reward_level", false, 17);
        AbstractC2647.m4626(c2405, "tag_color", false, 18);
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
        C3102 c3102 = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        C3102 c3103 = null;
        C3102 c3104 = null;
        C3102 c3105 = null;
        C3102 c3106 = null;
        Float f = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str5 = null;
        C3102 c3107 = null;
        C3102 c3108 = null;
        C3102 c3109 = null;
        C3102 c31010 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Float f2 = f;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    num = num;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    c3108 = c3108;
                    break;
                case 0:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str5);
                    i2 |= 1;
                    num = num;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    c3108 = c3108;
                    break;
                case 1:
                    c3107 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3100.f9919, c3107);
                    i2 |= 2;
                    c3108 = c3108;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    break;
                case 2:
                    c3108 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3100.f9919, c3108);
                    i2 |= 4;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    break;
                case 3:
                    c3109 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3100.f9919, c3109);
                    i2 |= 8;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    break;
                case 4:
                    c31010 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3100.f9919, c31010);
                    i2 |= 16;
                    f = f2;
                    str4 = str4;
                    c3102 = c3102;
                    break;
                case 5:
                    c3102 = c3102;
                    str4 = str4;
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1372.f4898, f2);
                    i2 |= 32;
                    str4 = str4;
                    c3102 = c3102;
                    break;
                case 6:
                    c3102 = c3102;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str4);
                    i2 |= 64;
                    f = f2;
                    c3102 = c3102;
                    break;
                case 7:
                    str4 = str4;
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C0416.f1980, bool);
                    i2 |= 128;
                    f = f2;
                    str4 = str4;
                    break;
                case 8:
                    str4 = str4;
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C0416.f1980, bool2);
                    i2 |= bc.e;
                    f = f2;
                    str4 = str4;
                    break;
                case 9:
                    str4 = str4;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i2 |= 512;
                    f = f2;
                    str4 = str4;
                    break;
                case 10:
                    str4 = str4;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str2);
                    i2 |= 1024;
                    f = f2;
                    str4 = str4;
                    break;
                case 11:
                    str4 = str4;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str3);
                    i2 |= 2048;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str4 = str4;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1680.f5658, num);
                    i2 |= 4096;
                    f = f2;
                    str4 = str4;
                    break;
                case 13:
                    str4 = str4;
                    c3102 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C3100.f9919, c3102);
                    i2 |= 8192;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str4 = str4;
                    c3103 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C3100.f9919, c3103);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    f = f2;
                    str4 = str4;
                    break;
                case 15:
                    c3104 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C3100.f9919, c3104);
                    i = 32768;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                case 16:
                    c3105 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C3100.f9919, c3105);
                    i = 65536;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3106 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C3100.f9919, c3106);
                    i = 131072;
                    i2 |= i;
                    f = f2;
                    str4 = str4;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        C3102 c31011 = c3102;
        String str6 = str4;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3117(i2, str5, c3107, c3108, c3109, c31010, f, str6, bool, bool2, str, str2, str3, num, c31011, c3103, c3104, c3105, c3106);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C3100 c3100 = C3100.f9919;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(C1372.f4898);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c2899);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c3100)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3117 c3117 = (C3117) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3117.f9958);
        C3100 c3100 = C3100.f9919;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c3100, c3117.f9959);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c3100, c3117.f9960);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c3100, c3117.f9961);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c3100, c3117.f9962);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1372.f4898, c3117.f9963);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3117.f9964);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c0416, c3117.f9965);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c0416, c3117.f9966);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3117.f9967);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3117.f9968);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3117.f9969);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, C1680.f5658, c3117.f9970);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c3100, c3117.f9971);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c3100, c3117.f9972);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c3100, c3117.f9973);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c3100, c3117.f9974);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, c3100, c3117.f9975);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
