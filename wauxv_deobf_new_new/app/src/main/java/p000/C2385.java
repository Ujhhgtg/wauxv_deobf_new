package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᛸᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2385 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2385 f7648;

    static {
        C2385 c2385 = new C2385();
        f7648 = c2385;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.other.PayMsgPb", c2385, 12);
        c2405.m4350("username", false);
        c2405.m4351(new C0355(1, 9));
        c2405.m4350("transId", false);
        c2405.m4351(new C0355(2, 9));
        c2405.m4350("fee", false);
        c2405.m4351(new C0355(3, 9));
        c2405.m4350("feeType", false);
        c2405.m4351(new C0355(4, 9));
        c2405.m4350("timestamp", false);
        c2405.m4351(new C0355(5, 9));
        c2405.m4350("scene", false);
        c2405.m4351(new C0355(6, 9));
        c2405.m4350("status", false);
        c2405.m4351(new C0355(7, 9));
        c2405.m4350("displayName", false);
        c2405.m4351(new C0355(8, 9));
        c2405.m4350("outTradeNo", false);
        c2405.m4351(new C0355(9, 9));
        c2405.m4350("msgType", false);
        c2405.m4351(new C0355(10, 9));
        c2405.m4350("type", false);
        c2405.m4351(new C0355(11, 9));
        c2405.m4350("headImgUrl", false);
        c2405.m4351(new C0355(12, 9));
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
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Double d = null;
        String str5 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str3);
                    i |= 1;
                    continue;
                case 1:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str4);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1099.f4114, d);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str5);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num4);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str6);
                    i |= 128;
                    break;
                case 8:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str7);
                    i |= bc.e;
                    break;
                case 9:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num);
                    i |= 512;
                    break;
                case 10:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str);
                    i |= 1024;
                    break;
                case 11:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str2);
                    i |= 2048;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            str3 = str3;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C2387(i, str3, str4, d, str5, num2, num3, num4, str6, str7, num, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(C1099.f4114);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C2387 c2387 = (C2387) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c2387.f7649);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c2387.f7650);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1099.f4114, c2387.f7651);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c2387.f7652);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c2387.f7653);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c2387.f7654);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c2387.f7655);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c2387.f7656);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c2387.f7657);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c2387.f7658);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c2387.f7659);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c2387.f7660);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
