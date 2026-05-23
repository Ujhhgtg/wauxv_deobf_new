package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3044 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3044 f9755;

    static {
        C3044 c3044 = new C3044();
        f9755 = c3044;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.cy1Proto", c3044, 3);
        AbstractC2668.m4680(c2360, "post_guide_topic_tags", false, 1);
        AbstractC2668.m4680(c2360, "bg_color_top_hex", false, 2);
        AbstractC2668.m4680(c2360, "bg_color_bottom_hex", false, 3);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3046.f9756;
        
        List list = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2230 == 1) {
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str);
                i |= 2;
            } else {
                if (iMo2230 != 2) {
                    throw new C3501(iMo2230);
                }
                str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                i |= 4;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3046(i, list, str, str2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056((InterfaceC1743) C3046.f9756[0].getValue());
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3046 c3046 = (C3046) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) C3046.f9756[0].getValue(), c3046.f9757);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3046.f9758);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c3046.f9759);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
