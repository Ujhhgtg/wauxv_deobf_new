package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲈᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1706 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1706 f5790;

    static {
        C1706 c1706 = new C1706();
        f5790 = c1706;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.JSLoginResp", c1706, 12);
        c2405.m4350("baseResponse", false);
        c2405.m4351(new C0355(1, 6));
        c2405.m4350("jsapiBaseResp", false);
        c2405.m4351(new C0355(2, 6));
        c2405.m4350("code", false);
        c2405.m4351(new C0355(3, 6));
        c2405.m4350("scopeList", false);
        c2405.m4351(new C0355(4, 6));
        c2405.m4350("appName", false);
        c2405.m4351(new C0355(5, 6));
        c2405.m4350("appIconUrl", false);
        c2405.m4351(new C0355(6, 6));
        c2405.m4350("openid", false);
        c2405.m4351(new C0355(7, 6));
        c2405.m4350("sessionKey", false);
        c2405.m4351(new C0355(8, 6));
        c2405.m4350("sessionTicket", false);
        c2405.m4351(new C0355(9, 6));
        c2405.m4350("lifespan", false);
        c2405.m4351(new C0355(10, 6));
        c2405.m4350("state", false);
        c2405.m4351(new C0355(11, 6));
        c2405.m4350("signature", false);
        c2405.m4351(new C0355(12, 6));
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
        C0358 c0358 = null;
        C1710 c1710 = null;
        String str3 = null;
        C1713 c1713 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    c0358 = (C0358) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C0356.f1754, c0358);
                    i |= 1;
                    continue;
                case 1:
                    c1710 = (C1710) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1708.f5791, c1710);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str3);
                    i |= 4;
                    break;
                case 3:
                    c1713 = (C1713) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1711.f5794, c1713);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str7);
                    i |= 128;
                    break;
                case 8:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str8);
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
            c0358 = c0358;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C1714(i, c0358, c1710, str3, c1713, str4, str5, str6, str7, str8, num, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C0356.f1754);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C1708.f5791);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1711.f5794), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1714 c1714 = (C1714) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C0356.f1754, c1714.f5800);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1708.f5791, c1714.f5801);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c1714.f5802);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1711.f5794, c1714.f5803);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c1714.f5804);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c1714.f5805);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c1714.f5806);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c1714.f5807);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c1714.f5808);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, C1680.f5658, c1714.f5809);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c1714.f5810);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, c2899, c1714.f5811);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
