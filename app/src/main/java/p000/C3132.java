package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3132 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3132 f9983;

    static {
        C3132 c3132 = new C3132();
        f9983 = c3132;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.lh1Proto", c3132, 4);
        AbstractC2668.m4680(c2360, "members", false, 1);
        AbstractC2668.m4680(c2360, "reward_wecoin", false, 2);
        AbstractC2668.m4680(c2360, "result", false, 3);
        AbstractC2668.m4680(c2360, "count", false, 4);
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
        InterfaceC1758[] interfaceC1758Arr = C3134.f9984;
        
        int i = 0;
        List list = null;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2230 == 1) {
                l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1862.f6185, l);
                i |= 2;
            } else if (iMo2230 == 2) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                l2 = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1862.f6185, l2);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3134(i, list, l, num, l2);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056((InterfaceC1743) C3134.f9984[0].getValue());
        C1862 c1862 = C1862.f6185;
        return new InterfaceC1743[]{interfaceC1743M4056, AbstractC2205.m4056(c1862), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(c1862)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3134 c3134 = (C3134) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) C3134.f9984[0].getValue(), c3134.f9985);
        C1862 c1862 = C1862.f6185;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1862, c3134.f9986);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C1665.f5622, c3134.f9987);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1862, c3134.f9988);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
