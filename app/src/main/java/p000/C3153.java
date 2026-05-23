package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᤞᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3153 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3153 f10042;

    static {
        C3153 c3153 = new C3153();
        f10042 = c3153;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.mb3Proto", c3153, 21);
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
        AbstractC2668.m4680(c2360, "u", false, 15);
        AbstractC2668.m4680(c2360, "v", false, 16);
        AbstractC2668.m4680(c2360, "w", false, 23);
        AbstractC2668.m4680(c2360, "x", false, 24);
        AbstractC2668.m4680(c2360, "y", false, 25);
        AbstractC2668.m4680(c2360, "z", false, 26);
        AbstractC2668.m4680(c2360, "A_", false, 27);
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
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        C3170 c3170 = null;
        C3170 c3171 = null;
        C3170 c3172 = null;
        Integer num8 = null;
        C3170 c3173 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            num9 = num9;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    num3 = num3;
                    num2 = num2;
                    num12 = num12;
                    break;
                case 0:
                    num10 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num10);
                    i2 |= 1;
                    num3 = num3;
                    num = num;
                    num2 = num2;
                    num12 = num12;
                    break;
                case 1:
                    num11 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num11);
                    i2 |= 2;
                    num12 = num12;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 2:
                    num12 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num12);
                    i2 |= 4;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 3:
                    num13 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num13);
                    i2 |= 8;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 4:
                    num14 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num14);
                    i2 |= 16;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 5:
                    num15 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num15);
                    i2 |= 32;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 6:
                    num16 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num16);
                    i2 |= 64;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 7:
                    num17 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num17);
                    i2 |= 128;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 8:
                    num2 = num2;
                    num = num;
                    num9 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num9);
                    i2 |= bc.e;
                    num = num;
                    num2 = num2;
                    break;
                case 9:
                    num2 = num2;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C1665.f5622, num);
                    i2 |= 512;
                    num9 = num9;
                    num2 = num2;
                    break;
                case 10:
                    num = num;
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num4);
                    i2 |= 1024;
                    num9 = num9;
                    num = num;
                    break;
                case 11:
                    num = num;
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C1665.f5622, num5);
                    i2 |= 2048;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num = num;
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C1665.f5622, num3);
                    i2 |= 4096;
                    num9 = num9;
                    num = num;
                    break;
                case 13:
                    num = num;
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, C1665.f5622, num2);
                    i2 |= 8192;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    num = num;
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C1665.f5622, num6);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num9 = num9;
                    num = num;
                    break;
                case 15:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C1665.f5622, num7);
                    i = 32768;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 16:
                    c3170 = (C3170) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C3168.f10160, c3170);
                    i = 65536;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3171 = (C3170) interfaceC0766Mo2512.mo2239(interfaceC2654, 17, C3168.f10160, c3171);
                    i = 131072;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.LDC /* 18 */:
                    c3172 = (C3170) interfaceC0766Mo2512.mo2239(interfaceC2654, 18, C3168.f10160, c3172);
                    i = 262144;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 19:
                    num8 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 19, C1665.f5622, num8);
                    i = 524288;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 20:
                    c3173 = (C3170) interfaceC0766Mo2512.mo2239(interfaceC2654, 20, C3168.f10160, c3173);
                    i = 1048576;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        Integer num18 = num2;
        Integer num19 = num9;
        Integer num20 = num10;
        Integer num21 = num11;
        Integer num22 = num12;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        Integer num23 = num5;
        return new C3155(i2, num20, num21, num22, num13, num14, num15, num16, num17, num19, num, num4, num23, num3, num18, num6, num7, c3170, c3171, c3172, num8, c3173);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40510 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40511 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40512 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40513 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40514 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40515 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40516 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40517 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40518 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40519 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40520 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M40521 = AbstractC2205.m4056(c1665);
        C3168 c3168 = C3168.f10160;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, interfaceC1743M40510, interfaceC1743M40511, interfaceC1743M40512, interfaceC1743M40513, interfaceC1743M40514, interfaceC1743M40515, interfaceC1743M40516, interfaceC1743M40517, interfaceC1743M40518, interfaceC1743M40519, interfaceC1743M40520, interfaceC1743M40521, AbstractC2205.m4056(c3168), AbstractC2205.m4056(c3168), AbstractC2205.m4056(c3168), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c3168)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3155 c3155 = (C3155) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3155.f10043);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3155.f10044);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3155.f10045);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c3155.f10046);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3155.f10047);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3155.f10048);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3155.f10049);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3155.f10050);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c3155.f10051);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c1665, c3155.f10052);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c3155.f10053);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, c1665, c3155.f10054);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, c1665, c3155.f10055);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, c1665, c3155.f10056);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, c1665, c3155.f10057);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, c1665, c3155.f10058);
        C3168 c3168 = C3168.f10160;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, c3168, c3155.f10059);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 17, c3168, c3155.f10060);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 18, c3168, c3155.f10061);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 19, c1665, c3155.f10062);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 20, c3168, c3155.f10063);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
