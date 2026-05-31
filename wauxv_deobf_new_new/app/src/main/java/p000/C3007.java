package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲈᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3007 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3007 f9597;

    static {
        C3007 c3007 = new C3007();
        f9597 = c3007;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ContentObjProto", c3007, 21);
        AbstractC2647.m4626(c2405, "description", false, 1);
        AbstractC2647.m4626(c2405, "contentStyle", false, 2);
        AbstractC2647.m4626(c2405, "title", false, 3);
        AbstractC2647.m4626(c2405, "contentUrl", false, 4);
        AbstractC2647.m4626(c2405, "mediaList", false, 5);
        AbstractC2647.m4626(c2405, "contentSubStyle", false, 6);
        AbstractC2647.m4626(c2405, "noteLinkXml", false, 7);
        AbstractC2647.m4626(c2405, "readershare", false, 8);
        AbstractC2647.m4626(c2405, "finderFeed", false, 9);
        AbstractC2647.m4626(c2405, "shareFinderTopic", false, 10);
        AbstractC2647.m4626(c2405, "brandmpvideo", false, 11);
        AbstractC2647.m4626(c2405, "finderColumn", false, 12);
        AbstractC2647.m4626(c2405, "springFinderLive", false, 13);
        AbstractC2647.m4626(c2405, "finderMegaVideo", false, 14);
        AbstractC2647.m4626(c2405, "finderType", false, 15);
        AbstractC2647.m4626(c2405, "finderTopic", false, 16);
        AbstractC2647.m4626(c2405, "shareMusic", false, 17);
        AbstractC2647.m4626(c2405, "sharePoi", false, 18);
        AbstractC2647.m4626(c2405, "linkEnabled", false, 19);
        AbstractC2647.m4626(c2405, "shareMusicTopic", false, 20);
        AbstractC2647.m4626(c2405, "rabbit2023", false, 21);
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
        InterfaceC1780[] interfaceC1780Arr = C3009.f9598;
        interfaceC0764Mo2636.getClass();
        C3018 c3018 = null;
        C3301 c3301 = null;
        C3048 c3048 = null;
        C3355 c3355 = null;
        C3081 c3081 = null;
        C3181 c3181 = null;
        Integer num = null;
        C3081 c3082 = null;
        C3422 c3422 = null;
        C3066 c3066 = null;
        C3238 c3238 = null;
        C3081 c3083 = null;
        C3223 c3223 = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Integer num3 = null;
        String str4 = null;
        C3039 c3039 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            C3018 c3019 = c3018;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    c3048 = c3048;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i2 |= 1;
                    c3048 = c3048;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    str2 = str2;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                    i2 |= 2;
                    str2 = str2;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 2:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                    i2 |= 4;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 3:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str3);
                    i2 |= 8;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 4:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), list);
                    i2 |= 16;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num3);
                    i2 |= 32;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 6:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str4);
                    i2 |= 64;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 7:
                    c3039 = (C3039) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C3037.f9730, c3039);
                    i2 |= 128;
                    c3018 = c3019;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 8:
                    c3301 = c3301;
                    c3081 = c3081;
                    c3018 = (C3018) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C3016.f9625, c3019);
                    i2 |= bc.e;
                    c3081 = c3081;
                    c3301 = c3301;
                    break;
                case 9:
                    c3301 = c3301;
                    c3081 = (C3081) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C3079.f9876, c3081);
                    i2 |= 512;
                    c3018 = c3019;
                    c3301 = c3301;
                    break;
                case 10:
                    c3081 = c3081;
                    c3181 = (C3181) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C3179.f10116, c3181);
                    i2 |= 1024;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 11:
                    c3081 = c3081;
                    c3355 = (C3355) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C3353.f10630, c3355);
                    i2 |= 2048;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c3081 = c3081;
                    c3048 = (C3048) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C3046.f9749, c3048);
                    i2 |= 4096;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 13:
                    c3081 = c3081;
                    c3301 = (C3301) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C3299.f10452, c3301);
                    i2 |= 8192;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c3081 = c3081;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C1680.f5658, num);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 15:
                    c3082 = (C3081) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C3079.f9876, c3082);
                    i = 32768;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 16:
                    c3422 = (C3422) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C3420.f10763, c3422);
                    i = 65536;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3066 = (C3066) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C3064.f9842, c3066);
                    i = 131072;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case Opcodes.LDC /* 18 */:
                    c3238 = (C3238) interfaceC0764Mo2636.mo2340(interfaceC2715, 18, C3236.f10345, c3238);
                    i = 262144;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 19:
                    c3083 = (C3081) interfaceC0764Mo2636.mo2340(interfaceC2715, 19, C3079.f9876, c3083);
                    i = 524288;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                case 20:
                    c3223 = (C3223) interfaceC0764Mo2636.mo2340(interfaceC2715, 20, C3221.f10310, c3223);
                    i = 1048576;
                    i2 |= i;
                    c3018 = c3019;
                    c3081 = c3081;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        C3301 c3302 = c3301;
        C3081 c3084 = c3081;
        String str5 = str;
        Integer num4 = num2;
        String str6 = str2;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        C3181 c3182 = c3181;
        return new C3009(i2, str5, num4, str6, str3, list, num3, str4, c3039, c3018, c3084, c3182, c3355, c3048, c3302, num, c3082, c3422, c3066, c3238, c3083, c3223);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3009.f9598;
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[4].getValue());
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3399 = AbstractC1471.m3392(C3037.f9730);
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(C3016.f9625);
        C3079 c3079 = C3079.f9876;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, AbstractC1471.m3392(c3079), AbstractC1471.m3392(C3179.f10116), AbstractC1471.m3392(C3353.f10630), AbstractC1471.m3392(C3046.f9749), AbstractC1471.m3392(C3299.f10452), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c3079), AbstractC1471.m3392(C3420.f10763), AbstractC1471.m3392(C3064.f9842), AbstractC1471.m3392(C3236.f10345), AbstractC1471.m3392(c3079), AbstractC1471.m3392(C3221.f10310)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3009 c3009 = (C3009) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3009.f9598;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3009.f9599);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3009.f9600);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3009.f9601);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3009.f9602);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), c3009.f9603);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3009.f9604);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3009.f9605);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, C3037.f9730, c3009.f9606);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C3016.f9625, c3009.f9607);
        C3079 c3079 = C3079.f9876;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c3079, c3009.f9608);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, C3179.f10116, c3009.f9609);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, C3353.f10630, c3009.f9610);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, C3046.f9749, c3009.f9611);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, C3299.f10452, c3009.f9612);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c1680, c3009.f9613);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c3079, c3009.f9614);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, C3420.f10763, c3009.f9615);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, C3064.f9842, c3009.f9616);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 18, C3236.f10345, c3009.f9617);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 19, c3079, c3009.f9618);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 20, C3221.f10310, c3009.f9619);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
