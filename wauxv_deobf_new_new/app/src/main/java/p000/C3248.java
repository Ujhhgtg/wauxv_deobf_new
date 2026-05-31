package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3248 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3248 f10360;

    static {
        C3248 c3248 = new C3248();
        f10360 = c3248;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.nr5Proto", c3248, 13);
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
        Integer num = null;
        String str = null;
        C3379 c3379 = null;
        C3443 c3443 = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        C3328 c3328 = null;
        C3286 c3286 = null;
        C3428 c3428 = null;
        C3334 c3334 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str3 = str2;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    str2 = str3;
                    z = false;
                    i = i;
                    str = str;
                    break;
                case 0:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str3);
                    i |= 1;
                    str = str;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                    i |= 2;
                    str2 = str3;
                    break;
                case 2:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num3);
                    i |= 4;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 3:
                    c3328 = (C3328) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3326.f10545, c3328);
                    i |= 8;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 4:
                    c3286 = (C3286) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3284.f10432, c3286);
                    i |= 16;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 5:
                    c3428 = (C3428) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3426.f10788, c3428);
                    i |= 32;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 6:
                    c3334 = (C3334) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3332.f10570, c3334);
                    i |= 64;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 7:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num4);
                    i |= 128;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 8:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num5);
                    i |= bc.e;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 9:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i |= 512;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 10:
                    c3379 = (C3379) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C3377.f10679, c3379);
                    i |= 1024;
                    str2 = str3;
                    num2 = num2;
                    break;
                case 11:
                    c3443 = (C3443) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C3441.f10828, c3443);
                    i |= 2048;
                    str2 = str3;
                    num2 = num2;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C2899.f9270, str);
                    i |= 4096;
                    str2 = str3;
                    num2 = num2;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3250(i, str2, num2, num3, c3328, c3286, c3428, c3334, num4, num5, num, c3379, c3443, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3326.f10545), AbstractC1471.m3392(C3284.f10432), AbstractC1471.m3392(C3426.f10788), AbstractC1471.m3392(C3332.f10570), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3377.f10679), AbstractC1471.m3392(C3441.f10828), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3250 c3250 = (C3250) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3250.f10361);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3250.f10362);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3250.f10363);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3326.f10545, c3250.f10364);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C3284.f10432, c3250.f10365);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C3426.f10788, c3250.f10366);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, C3332.f10570, c3250.f10367);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3250.f10368);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3250.f10369);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3250.f10370);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, C3377.f10679, c3250.f10371);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, C3441.f10828, c3250.f10372);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c2899, c3250.f10373);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
