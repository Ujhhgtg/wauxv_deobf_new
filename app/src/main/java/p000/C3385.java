package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3385 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3385 f10664;

    static {
        C3385 c3385 = new C3385();
        f10664 = c3385;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ze1Proto", c3385, 4);
        AbstractC2668.m4680(c2360, "cdnTransInfo", false, 1);
        AbstractC2668.m4680(c2360, "anchor_video_params", false, 2);
        AbstractC2668.m4680(c2360, "audience_cdn_quality_cfg", false, 3);
        AbstractC2668.m4680(c2360, "audience_cdn_url", false, 4);
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
        InterfaceC1758[] interfaceC1758Arr = C3387.f10665;
        
        int i = 0;
        List list = null;
        C3155 c3155 = null;
        Integer num = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2230 == 1) {
                c3155 = (C3155) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3153.f10042, c3155);
                i |= 2;
            } else if (iMo2230 == 2) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3387(i, list, c3155, num, str);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056((InterfaceC1743) C3387.f10665[0].getValue()), AbstractC2205.m4056(C3153.f10042), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(C2839.f9108)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3387 c3387 = (C3387) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) C3387.f10665[0].getValue(), c3387.f10666);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C3153.f10042, c3387.f10667);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3387.f10668);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C2839.f9108, c3387.f10669);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
