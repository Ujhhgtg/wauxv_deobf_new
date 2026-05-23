package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2972 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2972 f9503;

    static {
        C2972 c2972 = new C2972();
        f9503 = c2972;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.LocationProto", c2972, 15);
        AbstractC2668.m4680(c2360, "longitude", false, 1);
        AbstractC2668.m4680(c2360, "latitude", false, 2);
        AbstractC2668.m4680(c2360, "city", false, 3);
        AbstractC2668.m4680(c2360, "poiName", false, 4);
        AbstractC2668.m4680(c2360, "poiAddress", false, 5);
        AbstractC2668.m4680(c2360, "poiClassifyId", false, 6);
        AbstractC2668.m4680(c2360, "poiClassifyType", false, 7);
        AbstractC2668.m4680(c2360, "n", false, 8);
        AbstractC2668.m4680(c2360, "poiScale", false, 9);
        AbstractC2668.m4680(c2360, "poiClickableStatus", false, 10);
        AbstractC2668.m4680(c2360, "type", false, 11);
        AbstractC2668.m4680(c2360, "accuracy", false, 12);
        AbstractC2668.m4680(c2360, "t", false, 14);
        AbstractC2668.m4680(c2360, "poiAddressName", false, 15);
        AbstractC2668.m4680(c2360, "country", false, 16);
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
        String str;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        interfaceC0766Mo2512.getClass();
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num4 = null;
        String str8 = null;
        Integer num5 = null;
        Float f2 = null;
        Float f3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            str4 = str4;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    num2 = num2;
                    str2 = str2;
                    f3 = f3;
                    str5 = str5;
                    break;
                case 0:
                    f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1365.f4873, f2);
                    i |= 1;
                    num2 = num2;
                    str2 = str2;
                    f3 = f3;
                    str5 = str5;
                    break;
                case 1:
                    str = str5;
                    f3 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1365.f4873, f3);
                    i |= 2;
                    str4 = str4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 2:
                    str = str5;
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str4);
                    i |= 4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 3:
                    str2 = str2;
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str5);
                    i |= 8;
                    str4 = str4;
                    str2 = str2;
                    break;
                case 4:
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str6);
                    i |= 16;
                    str5 = str5;
                    break;
                case 5:
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str7);
                    i |= 32;
                    str5 = str5;
                    break;
                case 6:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num4);
                    i |= 64;
                    str5 = str5;
                    break;
                case 7:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str8);
                    i |= 128;
                    str5 = str5;
                    break;
                case 8:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num5);
                    i |= bc.e;
                    str5 = str5;
                    break;
                case 9:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num);
                    i |= 512;
                    str5 = str5;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num3);
                    i |= 1024;
                    str5 = str5;
                    break;
                case 11:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1365.f4873, f);
                    i |= 2048;
                    str5 = str5;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1665.f5622, num2);
                    i |= 4096;
                    str5 = str5;
                    break;
                case 13:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C2839.f9108, str2);
                    i |= 8192;
                    str5 = str5;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C2839.f9108, str3);
                    i |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str5 = str5;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        String str9 = str2;
        String str10 = str5;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2974(i, f2, f3, str4, str10, str6, str7, num4, str8, num5, num, num3, f, num2, str9, str3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1365 c1365 = C1365.f4873;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1365);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1365);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2974 c2974 = (C2974) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1365, c2974.f9504);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1365, c2974.f9505);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2974.f9506);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c2974.f9507);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c2974.f9508);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c2974.f9509);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c2974.f9510);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c2974.f9511);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c2974.f9512);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c2974.f9513);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c2974.f9514);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1365, c2974.f9515);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1665, c2974.f9516);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c2839, c2974.f9517);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c2839, c2974.f9518);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
