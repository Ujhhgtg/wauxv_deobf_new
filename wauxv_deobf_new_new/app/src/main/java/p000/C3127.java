package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3127 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3127 f9994;

    static {
        C3127 c3127 = new C3127();
        f9994 = c3127;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ff1Proto", c3127, 7);
        AbstractC2647.m4626(c2405, "live_mic_id", false, 1);
        AbstractC2647.m4626(c2405, "mic_seq", false, 2);
        AbstractC2647.m4626(c2405, "mic_sdk_user_id", false, 3);
        AbstractC2647.m4626(c2405, "mic_contact", false, 4);
        AbstractC2647.m4626(c2405, "status", false, 5);
        AbstractC2647.m4626(c2405, "mic_audience_list", false, 6);
        AbstractC2647.m4626(c2405, "mic_sdk_live_id", false, 7);
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
        InterfaceC1780[] interfaceC1780Arr = C3129.f9995;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        C3166 c3166 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                    i |= 4;
                    break;
                case 3:
                    c3166 = (C3166) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3164.f10076, c3166);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num);
                    i |= 16;
                    break;
                case 5:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num2);
                    i |= 64;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3129(i, str, l, str2, c3166, num, list, num2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3129.f9995;
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C1888.f6259);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(C3164.f10076);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, AbstractC1471.m3392(c1680), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[5].getValue()), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3129 c3129 = (C3129) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3129.f9995;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3129.f9996);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1888.f6259, c3129.f9997);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3129.f9998);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3164.f10076, c3129.f9999);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3129.f10000);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), c3129.f10001);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3129.f10002);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
