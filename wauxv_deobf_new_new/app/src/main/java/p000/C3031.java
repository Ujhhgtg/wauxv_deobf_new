package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3031 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3031 f9670;

    static {
        C3031 c3031 = new C3031();
        f9670 = c3031;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.LocationProto", c3031, 15);
        AbstractC2647.m4626(c2405, "longitude", false, 1);
        AbstractC2647.m4626(c2405, "latitude", false, 2);
        AbstractC2647.m4626(c2405, "city", false, 3);
        AbstractC2647.m4626(c2405, "poiName", false, 4);
        AbstractC2647.m4626(c2405, "poiAddress", false, 5);
        AbstractC2647.m4626(c2405, "poiClassifyId", false, 6);
        AbstractC2647.m4626(c2405, "poiClassifyType", false, 7);
        AbstractC2647.m4626(c2405, "n", false, 8);
        AbstractC2647.m4626(c2405, "poiScale", false, 9);
        AbstractC2647.m4626(c2405, "poiClickableStatus", false, 10);
        AbstractC2647.m4626(c2405, "type", false, 11);
        AbstractC2647.m4626(c2405, "accuracy", false, 12);
        AbstractC2647.m4626(c2405, "t", false, 14);
        AbstractC2647.m4626(c2405, "poiAddressName", false, 15);
        AbstractC2647.m4626(c2405, "country", false, 16);
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
        String str;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
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
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    num2 = num2;
                    str2 = str2;
                    f3 = f3;
                    str5 = str5;
                    break;
                case 0:
                    f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1372.f4898, f2);
                    i |= 1;
                    num2 = num2;
                    str2 = str2;
                    f3 = f3;
                    str5 = str5;
                    break;
                case 1:
                    str = str5;
                    f3 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1372.f4898, f3);
                    i |= 2;
                    str4 = str4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 2:
                    str = str5;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str4);
                    i |= 4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 3:
                    str2 = str2;
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str5);
                    i |= 8;
                    str4 = str4;
                    str2 = str2;
                    break;
                case 4:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str6);
                    i |= 16;
                    str5 = str5;
                    break;
                case 5:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str7);
                    i |= 32;
                    str5 = str5;
                    break;
                case 6:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num4);
                    i |= 64;
                    str5 = str5;
                    break;
                case 7:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str8);
                    i |= 128;
                    str5 = str5;
                    break;
                case 8:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num5);
                    i |= bc.e;
                    str5 = str5;
                    break;
                case 9:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i |= 512;
                    str5 = str5;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num3);
                    i |= 1024;
                    str5 = str5;
                    break;
                case 11:
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C1372.f4898, f);
                    i |= 2048;
                    str5 = str5;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1680.f5658, num2);
                    i |= 4096;
                    str5 = str5;
                    break;
                case 13:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C2899.f9270, str2);
                    i |= 8192;
                    str5 = str5;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C2899.f9270, str3);
                    i |= Http2.INITIAL_MAX_FRAME_SIZE;
                    str5 = str5;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        String str9 = str2;
        String str10 = str5;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3033(i, f2, f3, str4, str10, str6, str7, num4, str8, num5, num, num3, f, num2, str9, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1372 c1372 = C1372.f4898;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1372);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1372);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3033 c3033 = (C3033) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1372, c3033.f9671);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1372, c3033.f9672);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3033.f9673);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3033.f9674);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3033.f9675);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3033.f9676);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3033.f9677);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3033.f9678);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3033.f9679);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3033.f9680);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3033.f9681);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c1372, c3033.f9682);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1680, c3033.f9683);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, c2899, c3033.f9684);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, c2899, c3033.f9685);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
