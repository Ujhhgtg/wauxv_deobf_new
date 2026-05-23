package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3050 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3050 f9763;

    static {
        C3050 c3050 = new C3050();
        f9763 = c3050;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.dc5Proto", c3050, 6);
        AbstractC2668.m4680(c2360, "switch_skin_info_list", false, 1);
        AbstractC2668.m4680(c2360, "default_skin_id", false, 2);
        AbstractC2668.m4680(c2360, "selected_skin_id", false, 3);
        AbstractC2668.m4680(c2360, "custom_text", false, 4);
        AbstractC2668.m4680(c2360, "specific_custom_text", false, 5);
        AbstractC2668.m4680(c2360, "antispam_custom_text", false, 6);
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
        InterfaceC1758[] interfaceC1758Arr = C3052.f9764;
        interfaceC0766Mo2512.getClass();
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
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
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C0441.f2008, bool);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str4);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3052(i, list, str, str2, str3, bool, str4);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056((InterfaceC1743) C3052.f9764[0].getValue());
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C0441.f2008), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3052 c3052 = (C3052) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) C3052.f9764[0].getValue(), c3052.f9765);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3052.f9766);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3052.f9767);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3052.f9768);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, C0441.f2008, c3052.f9769);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3052.f9770);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
