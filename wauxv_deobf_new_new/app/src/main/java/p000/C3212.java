package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲇᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3212 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3212 f10209;

    static {
        C3212 c3212 = new C3212();
        f10209 = c3212;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.mb3Proto", c3212, 21);
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
        AbstractC2647.m4626(c2405, "u", false, 15);
        AbstractC2647.m4626(c2405, "v", false, 16);
        AbstractC2647.m4626(c2405, "w", false, 23);
        AbstractC2647.m4626(c2405, "x", false, 24);
        AbstractC2647.m4626(c2405, "y", false, 25);
        AbstractC2647.m4626(c2405, "z", false, 26);
        AbstractC2647.m4626(c2405, "A_", false, 27);
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
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        C3229 c3229 = null;
        C3229 c32210 = null;
        C3229 c32211 = null;
        Integer num8 = null;
        C3229 c32212 = null;
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
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    num3 = num3;
                    num2 = num2;
                    num12 = num12;
                    break;
                case 0:
                    num10 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num10);
                    i2 |= 1;
                    num3 = num3;
                    num = num;
                    num2 = num2;
                    num12 = num12;
                    break;
                case 1:
                    num11 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num11);
                    i2 |= 2;
                    num12 = num12;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 2:
                    num12 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num12);
                    i2 |= 4;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 3:
                    num13 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num13);
                    i2 |= 8;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 4:
                    num14 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num14);
                    i2 |= 16;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 5:
                    num15 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num15);
                    i2 |= 32;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 6:
                    num16 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num16);
                    i2 |= 64;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 7:
                    num17 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num17);
                    i2 |= 128;
                    num9 = num9;
                    num = num;
                    num2 = num2;
                    break;
                case 8:
                    num2 = num2;
                    num = num;
                    num9 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num9);
                    i2 |= bc.e;
                    num = num;
                    num2 = num2;
                    break;
                case 9:
                    num2 = num2;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i2 |= 512;
                    num9 = num9;
                    num2 = num2;
                    break;
                case 10:
                    num = num;
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num4);
                    i2 |= 1024;
                    num9 = num9;
                    num = num;
                    break;
                case 11:
                    num = num;
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1680.f5658, num5);
                    i2 |= 2048;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num = num;
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1680.f5658, num3);
                    i2 |= 4096;
                    num9 = num9;
                    num = num;
                    break;
                case 13:
                    num = num;
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C1680.f5658, num2);
                    i2 |= 8192;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    num = num;
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C1680.f5658, num6);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num9 = num9;
                    num = num;
                    break;
                case 15:
                    num7 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C1680.f5658, num7);
                    i = 32768;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 16:
                    c3229 = (C3229) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C3227.f10327, c3229);
                    i = 65536;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c32210 = (C3229) interfaceC0764Mo2636.mo2340(interfaceC2715, 17, C3227.f10327, c32210);
                    i = 131072;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case Opcodes.LDC /* 18 */:
                    c32211 = (C3229) interfaceC0764Mo2636.mo2340(interfaceC2715, 18, C3227.f10327, c32211);
                    i = 262144;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 19:
                    num8 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 19, C1680.f5658, num8);
                    i = 524288;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                case 20:
                    c32212 = (C3229) interfaceC0764Mo2636.mo2340(interfaceC2715, 20, C3227.f10327, c32212);
                    i = 1048576;
                    i2 |= i;
                    num9 = num9;
                    num = num;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Integer num18 = num2;
        Integer num19 = num9;
        Integer num20 = num10;
        Integer num21 = num11;
        Integer num22 = num12;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        Integer num23 = num5;
        return new C3214(i2, num20, num21, num22, num13, num14, num15, num16, num17, num19, num, num4, num23, num3, num18, num6, num7, c3229, c32210, c32211, num8, c32212);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3399 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33910 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33911 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33912 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33913 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33914 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33915 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33916 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M33917 = AbstractC1471.m3392(c1680);
        C3227 c3227 = C3227.f10327;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, interfaceC1767M3399, interfaceC1767M33910, interfaceC1767M33911, interfaceC1767M33912, interfaceC1767M33913, interfaceC1767M33914, interfaceC1767M33915, interfaceC1767M33916, interfaceC1767M33917, AbstractC1471.m3392(c3227), AbstractC1471.m3392(c3227), AbstractC1471.m3392(c3227), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c3227)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3214 c3214 = (C3214) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3214.f10210);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3214.f10211);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3214.f10212);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3214.f10213);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3214.f10214);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3214.f10215);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3214.f10216);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3214.f10217);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3214.f10218);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3214.f10219);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3214.f10220);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1680, c3214.f10221);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1680, c3214.f10222);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c1680, c3214.f10223);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c1680, c3214.f10224);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, c1680, c3214.f10225);
        C3227 c3227 = C3227.f10327;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, c3227, c3214.f10226);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 17, c3227, c3214.f10227);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 18, c3227, c3214.f10228);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 19, c1680, c3214.f10229);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 20, c3227, c3214.f10230);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
