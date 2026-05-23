package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3246 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3246 f10301;

    static {
        C3246 c3246 = new C3246();
        f10301 = c3246;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.s40Proto", c3246, 5);
        AbstractC2668.m4680(c2360, "component_name", false, 1);
        AbstractC2668.m4680(c2360, "component_value_list", false, 2);
        AbstractC2668.m4680(c2360, "select_component_key", false, 3);
        AbstractC2668.m4680(c2360, "seq", false, 4);
        AbstractC2668.m4680(c2360, "component_key", false, 5);
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
        InterfaceC1758[] interfaceC1758Arr = C3248.f10302;
        
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                i |= 1;
            } else if (iMo2230 == 1) {
                list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, (InterfaceC1743) interfaceC1758Arr[1].getValue(), list);
                i |= 2;
            } else if (iMo2230 == 2) {
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                i |= 4;
            } else if (iMo2230 == 3) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str3);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3248(i, str, list, str2, num, str3);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3248.f10302;
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{AbstractC2205.m4056(c2839), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[1].getValue()), AbstractC2205.m4056(c2839), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3248 c3248 = (C3248) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3248.f10302;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3248.f10303);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, (InterfaceC1743) interfaceC1758Arr[1].getValue(), c3248.f10304);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3248.f10305);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C1665.f5622, c3248.f10306);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3248.f10307);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
