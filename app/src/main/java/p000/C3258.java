package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᲀᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3258 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3258 f10348;

    static {
        C3258 c3258 = new C3258();
        f10348 = c3258;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.sp1Proto", c3258, 17);
        AbstractC2668.m4680(c2360, "longitude", false, 1);
        AbstractC2668.m4680(c2360, "latitude", false, 2);
        AbstractC2668.m4680(c2360, "city", false, 3);
        AbstractC2668.m4680(c2360, "poiName", false, 4);
        AbstractC2668.m4680(c2360, "poiAddress", false, 5);
        AbstractC2668.m4680(c2360, "poiClassifyId", false, 6);
        AbstractC2668.m4680(c2360, "poiClassifyType", false, 7);
        AbstractC2668.m4680(c2360, "province", false, 8);
        AbstractC2668.m4680(c2360, "region", false, 9);
        AbstractC2668.m4680(c2360, "country", false, 10);
        AbstractC2668.m4680(c2360, "source", false, 11);
        AbstractC2668.m4680(c2360, "buildingId", false, 12);
        AbstractC2668.m4680(c2360, "floorName", false, 13);
        AbstractC2668.m4680(c2360, "poiFullName", false, 14);
        AbstractC2668.m4680(c2360, "flag", false, 15);
        AbstractC2668.m4680(c2360, "product_id", false, 16);
        AbstractC2668.m4680(c2360, "commercialization_flag", false, 17);
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
        InterfaceC1758[] interfaceC1758Arr = C3260.f10349;
        interfaceC0766Mo2512.getClass();
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
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    str3 = str3;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    str9 = str9;
                    break;
                case 0:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1365.f4873, f);
                    i2 |= 1;
                    str3 = str3;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    str9 = str9;
                    break;
                case 1:
                    f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1365.f4873, f2);
                    i2 |= 2;
                    str9 = str9;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 2:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str9);
                    i2 |= 4;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 3:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str10);
                    i2 |= 8;
                    str6 = str11;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 4:
                    str2 = str2;
                    str7 = str7;
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str11);
                    i2 |= 16;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 5:
                    str2 = str2;
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str7);
                    i2 |= 32;
                    str6 = str11;
                    str2 = str2;
                    break;
                case 6:
                    str7 = str7;
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num3);
                    i2 |= 64;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 7:
                    str7 = str7;
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i2 |= 128;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 8:
                    str7 = str7;
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str);
                    i2 |= bc.e;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 9:
                    str7 = str7;
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str5);
                    i2 |= 512;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 10:
                    str7 = str7;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num);
                    i2 |= 1024;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 11:
                    str7 = str7;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str4);
                    i2 |= 2048;
                    str6 = str11;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str7 = str7;
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str3);
                    i2 |= 4096;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 13:
                    str7 = str7;
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C2839.f9108, str2);
                    i2 |= 8192;
                    str6 = str11;
                    str7 = str7;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str7 = str7;
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C1862.f6185, l);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 15:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, (InterfaceC1743) interfaceC1758Arr[15].getValue(), list);
                    i = 32768;
                    i2 |= i;
                    str6 = str11;
                    str7 = str7;
                    break;
                case 16:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C1665.f5622, num2);
                    i = 65536;
                    i2 |= i;
                    str6 = str11;
                    str7 = str7;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        String str12 = str2;
        String str13 = str7;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3260(i2, f, f2, str9, str10, str6, str13, num3, str8, str, str5, num, str4, str3, str12, l, list, num2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3260.f10349;
        C1365 c1365 = C1365.f4873;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1365);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1365);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1862.f6185), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[15].getValue()), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3260 c3260 = (C3260) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3260.f10349;
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1365, c3260.f10350);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1365, c3260.f10351);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3260.f10352);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3260.f10353);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3260.f10354);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3260.f10355);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3260.f10356);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3260.f10357);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3260.f10358);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3260.f10359);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3260.f10360);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3260.f10361);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3260.f10362);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c2839, c3260.f10363);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, C1862.f6185, c3260.f10364);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, (InterfaceC1743) interfaceC1758Arr[15].getValue(), c3260.f10365);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c1665, c3260.f10366);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
