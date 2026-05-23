package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2214 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2214 f7193;

    static {
        C2214 c2214 = new C2214();
        f7193 = c2214;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.NewSendMsgResp", c2214, 4);
        c2360.m4338("baseResponse", false);
        c2360.m4339(new C0380(1, 8));
        c2360.m4338("count", false);
        c2360.m4339(new C0380(2, 8));
        c2360.m4338("list", false);
        c2360.m4339(new C0380(3, 8));
        c2360.m4338("noKnow", false);
        c2360.m4339(new C0380(4, 8));
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
        InterfaceC1758[] interfaceC1758Arr = C2219.f7203;
        
        int i = 0;
        C0383 c0383 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                c0383 = (C0383) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C0381.f1783, c0383);
                i |= 1;
            } else if (iMo2230 == 1) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                i |= 2;
            } else if (iMo2230 == 2) {
                list = (List) interfaceC0766Mo2512.mo2237(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo2230 != 3) {
                    throw new C3501(iMo2230);
                }
                num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num2);
                i |= 8;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2219(i, c0383, num, list, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C2219.f7203;
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(C0381.f1783), AbstractC2205.m4056(c1665), interfaceC1758Arr[2].getValue(), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2219 c2219 = (C2219) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C2219.f7203;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C0381.f1783, c2219.f7204);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c2219.f7205);
        interfaceC0767Mo2796.mo2245(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), c2219.f7206);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c2219.f7207);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
