package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲈᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3068 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3068 f9827;

    static {
        C3068 c3068 = new C3068();
        f9827 = c3068;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ff1Proto", c3068, 7);
        AbstractC2668.m4680(c2360, "live_mic_id", false, 1);
        AbstractC2668.m4680(c2360, "mic_seq", false, 2);
        AbstractC2668.m4680(c2360, "mic_sdk_user_id", false, 3);
        AbstractC2668.m4680(c2360, "mic_contact", false, 4);
        AbstractC2668.m4680(c2360, "status", false, 5);
        AbstractC2668.m4680(c2360, "mic_audience_list", false, 6);
        AbstractC2668.m4680(c2360, "mic_sdk_live_id", false, 7);
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
        InterfaceC1758[] interfaceC1758Arr = C3070.f9828;
        interfaceC0766Mo2512.getClass();
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        C3106 c3106 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i |= 4;
                    break;
                case 3:
                    c3106 = (C3106) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3104.f9908, c3106);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num);
                    i |= 16;
                    break;
                case 5:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num2);
                    i |= 64;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3070(i, str, l, str2, c3106, num, list, num2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3070.f9828;
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C1862.f6185);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(C3104.f9908);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, AbstractC2205.m4056(c1665), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[5].getValue()), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3070 c3070 = (C3070) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3070.f9828;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3070.f9829);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1862.f6185, c3070.f9830);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3070.f9831);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3104.f9908, c3070.f9832);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3070.f9833);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), c3070.f9834);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c3070.f9835);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
