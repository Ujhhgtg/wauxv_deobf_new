package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3179 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3179 f10116;

    static {
        C3179 c3179 = new C3179();
        f10116 = c3179;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.kbProto", c3179, 14);
        AbstractC2647.m4626(c2405, "d", false, 1);
        AbstractC2647.m4626(c2405, "e", false, 2);
        AbstractC2647.m4626(c2405, "f", false, 3);
        AbstractC2647.m4626(c2405, "g", false, 4);
        AbstractC2647.m4626(c2405, "h", false, 5);
        AbstractC2647.m4626(c2405, "i", false, 6);
        AbstractC2647.m4626(c2405, "j", false, 7);
        AbstractC2647.m4626(c2405, "n", false, 8);
        AbstractC2647.m4626(c2405, "o", false, 9);
        AbstractC2647.m4626(c2405, "p", false, 10);
        AbstractC2647.m4626(c2405, "q", false, 11);
        AbstractC2647.m4626(c2405, "r", false, 12);
        AbstractC2647.m4626(c2405, "s", false, 13);
        AbstractC2647.m4626(c2405, "t", false, 14);
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
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str10 = null;
        String str11 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str12 = str6;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    str6 = str12;
                    str3 = str3;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 0:
                    str11 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str11);
                    i |= 1;
                    str6 = str12;
                    str3 = str3;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    str7 = str7;
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str12);
                    i |= 2;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 2:
                    str2 = str2;
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str7);
                    i |= 4;
                    str6 = str12;
                    str2 = str2;
                    break;
                case 3:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str8);
                    i |= 8;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 4:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str9);
                    i |= 16;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 5:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num);
                    i |= 32;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 6:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num2);
                    i |= 64;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 7:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num3);
                    i |= 128;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 8:
                    str10 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str10);
                    i |= bc.e;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 9:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 10:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str4);
                    i |= 1024;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 11:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str5);
                    i |= 2048;
                    str6 = str12;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str3);
                    i |= 4096;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 13:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C2899.f9270, str2);
                    i |= 8192;
                    str6 = str12;
                    str7 = str7;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        String str13 = str2;
        String str14 = str7;
        String str15 = str11;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3181(i, str15, str6, str14, str8, str9, num, num2, num3, str10, str, str4, str5, str3, str13);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3181 c3181 = (C3181) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3181.f10117);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3181.f10118);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3181.f10119);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3181.f10120);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3181.f10121);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3181.f10122);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3181.f10123);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3181.f10124);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3181.f10125);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3181.f10126);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3181.f10127);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c3181.f10128);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3181.f10129);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c2899, c3181.f10130);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
