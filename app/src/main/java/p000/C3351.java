package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3351 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3351 f10566;

    static {
        C3351 c3351 = new C3351();
        f10566 = c3351;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.x12Proto", c3351, 9);
        AbstractC2668.m4680(c2360, "mediaType", false, 1);
        AbstractC2668.m4680(c2360, "url", false, 2);
        AbstractC2668.m4680(c2360, "thumbUrl", false, 3);
        AbstractC2668.m4680(c2360, "width", false, 4);
        AbstractC2668.m4680(c2360, "height", false, 5);
        AbstractC2668.m4680(c2360, "videoPlayDuration", false, 6);
        AbstractC2668.m4680(c2360, "fullCoverUrl", false, 7);
        AbstractC2668.m4680(c2360, "fullClipInset", false, 8);
        AbstractC2668.m4680(c2360, "coverUrl", false, 9);
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
        Integer num = null;
        String str = null;
        String str2 = null;
        Float f = null;
        Float f2 = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i |= 4;
                    break;
                case 3:
                    f = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1365.f4873, f);
                    i |= 8;
                    break;
                case 4:
                    f2 = (Float) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1365.f4873, f2);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str4);
                    i |= 128;
                    break;
                case 8:
                    str5 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C2839.f9108, str5);
                    i |= bc.e;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3353(i, num, str, str2, f, f2, num2, str3, str4, str5);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        C1365 c1365 = C1365.f4873;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1365), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3353 c3353 = (C3353) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3353.f10567);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3353.f10568);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3353.f10569);
        C1365 c1365 = C1365.f4873;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1365, c3353.f10570);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1365, c3353.f10571);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3353.f10572);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3353.f10573);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c3353.f10574);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c2839, c3353.f10575);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
