package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3119 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3119 f9948;

    static {
        C3119 c3119 = new C3119();
        f9948 = c3119;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.kbProto", c3119, 14);
        AbstractC2668.m4680(c2360, "d", false, 1);
        AbstractC2668.m4680(c2360, "e", false, 2);
        AbstractC2668.m4680(c2360, "f", false, 3);
        AbstractC2668.m4680(c2360, "g", false, 4);
        AbstractC2668.m4680(c2360, "h", false, 5);
        AbstractC2668.m4680(c2360, "i", false, 6);
        AbstractC2668.m4680(c2360, "j", false, 7);
        AbstractC2668.m4680(c2360, "n", false, 8);
        AbstractC2668.m4680(c2360, "o", false, 9);
        AbstractC2668.m4680(c2360, "p", false, 10);
        AbstractC2668.m4680(c2360, "q", false, 11);
        AbstractC2668.m4680(c2360, "r", false, 12);
        AbstractC2668.m4680(c2360, "s", false, 13);
        AbstractC2668.m4680(c2360, "t", false, 14);
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
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        interfaceC0766Mo2512.getClass();
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
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    str6 = str12;
                    str3 = str3;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 0:
                    str11 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str11);
                    i |= 1;
                    str6 = str12;
                    str3 = str3;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    str7 = str7;
                    str6 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str12);
                    i |= 2;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 2:
                    str2 = str2;
                    str7 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str7);
                    i |= 4;
                    str6 = str12;
                    str2 = str2;
                    break;
                case 3:
                    str8 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str8);
                    i |= 8;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 4:
                    str9 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str9);
                    i |= 16;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 5:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num);
                    i |= 32;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 6:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num2);
                    i |= 64;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 7:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num3);
                    i |= 128;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 8:
                    str10 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str10);
                    i |= bc.e;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 9:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 10:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str4);
                    i |= 1024;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 11:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C2839.f9108, str5);
                    i |= 2048;
                    str6 = str12;
                    str7 = str7;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C2839.f9108, str3);
                    i |= 4096;
                    str6 = str12;
                    str7 = str7;
                    break;
                case 13:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C2839.f9108, str2);
                    i |= 8192;
                    str6 = str12;
                    str7 = str7;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        String str13 = str2;
        String str14 = str7;
        String str15 = str11;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3121(i, str15, str6, str14, str8, str9, num, num2, num3, str10, str, str4, str5, str3, str13);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3121 c3121 = (C3121) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3121.f9949);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3121.f9950);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3121.f9951);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3121.f9952);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3121.f9953);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3121.f9954);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3121.f9955);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3121.f9956);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3121.f9957);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c3121.f9958);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3121.f9959);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c2839, c3121.f9960);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c2839, c3121.f9961);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c2839, c3121.f9962);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
