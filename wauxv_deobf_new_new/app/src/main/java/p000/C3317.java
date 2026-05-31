package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲈᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3317 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3317 f10515;

    static {
        C3317 c3317 = new C3317();
        f10515 = c3317;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sp1Proto", c3317, 17);
        AbstractC2647.m4626(c2405, "longitude", false, 1);
        AbstractC2647.m4626(c2405, "latitude", false, 2);
        AbstractC2647.m4626(c2405, "city", false, 3);
        AbstractC2647.m4626(c2405, "poiName", false, 4);
        AbstractC2647.m4626(c2405, "poiAddress", false, 5);
        AbstractC2647.m4626(c2405, "poiClassifyId", false, 6);
        AbstractC2647.m4626(c2405, "poiClassifyType", false, 7);
        AbstractC2647.m4626(c2405, "province", false, 8);
        AbstractC2647.m4626(c2405, "region", false, 9);
        AbstractC2647.m4626(c2405, "country", false, 10);
        AbstractC2647.m4626(c2405, "source", false, 11);
        AbstractC2647.m4626(c2405, "buildingId", false, 12);
        AbstractC2647.m4626(c2405, "floorName", false, 13);
        AbstractC2647.m4626(c2405, "poiFullName", false, 14);
        AbstractC2647.m4626(c2405, "flag", false, 15);
        AbstractC2647.m4626(c2405, "product_id", false, 16);
        AbstractC2647.m4626(c2405, "commercialization_flag", false, 17);
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
        InterfaceC1780[] interfaceC1780Arr = C3319.f10516;
        interfaceC0764Mo2636.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Long l = null;
        List list = null;
        Integer num2 = null;
        String str6 = null;
        String str7 = null;
        Integer num3 = null;
        String str8 = null;
        Float f = null;
        Float f2 = null;
        String str9 = null;
        String str10 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            String str11 = str6;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    str3 = str3;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    str9 = str9;
                    break;
                case 0:
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1372.f4898, f);
                    i2 |= 1;
                    str3 = str3;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    str9 = str9;
                    break;
                case 1:
                    f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1372.f4898, f2);
                    i2 |= 2;
                    str9 = str9;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 2:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str9);
                    i2 |= 4;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 3:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str10);
                    i2 |= 8;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 4:
                    str2 = str2;
                    str7 = str7;
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str11);
                    i2 |= 16;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 5:
                    str2 = str2;
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str7);
                    i2 |= 32;
                    str6 = str11;
                    str2 = str2;
                    break;
                case 6:
                    str7 = str7;
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num3);
                    i2 |= 64;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 7:
                    str7 = str7;
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str8);
                    i2 |= 128;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 8:
                    str7 = str7;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str);
                    i2 |= bc.e;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 9:
                    str7 = str7;
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str5);
                    i2 |= 512;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 10:
                    str7 = str7;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num);
                    i2 |= 1024;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 11:
                    str7 = str7;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str4);
                    i2 |= 2048;
                    str6 = str11;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str7 = str7;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str3);
                    i2 |= 4096;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 13:
                    str7 = str7;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C2899.f9270, str2);
                    i2 |= 8192;
                    str6 = str11;
                    str7 = str7;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str7 = str7;
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C1888.f6259, l);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 15:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, (InterfaceC1767) interfaceC1780Arr[15].getValue(), list);
                    i = 32768;
                    i2 |= i;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 16:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C1680.f5658, num2);
                    i = 65536;
                    i2 |= i;
                    str6 = str11;
                    str7 = str7;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        String str12 = str2;
        String str13 = str7;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3319(i2, f, f2, str9, str10, str6, str13, num3, str8, str, str5, num, str4, str3, str12, l, list, num2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3319.f10516;
        C1372 c1372 = C1372.f4898;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1372);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1372);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[15].getValue()), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3319 c3319 = (C3319) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3319.f10516;
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1372, c3319.f10517);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1372, c3319.f10518);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3319.f10519);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3319.f10520);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3319.f10521);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3319.f10522);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3319.f10523);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3319.f10524);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3319.f10525);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3319.f10526);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3319.f10527);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3319.f10528);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3319.f10529);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c2899, c3319.f10530);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, C1888.f6259, c3319.f10531);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, (InterfaceC1767) interfaceC1780Arr[15].getValue(), c3319.f10532);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c1680, c3319.f10533);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
