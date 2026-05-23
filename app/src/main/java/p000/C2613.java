package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2613 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2613 f8491;

    static {
        C2613 c2613 = new C2613();
        f8491 = c2613;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.base.SKBuiltinString_t", c2613, 1);
        c2360.m4338("string", false);
        c2360.m4339(new C2612());
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
        
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else {
                if (iMo2230 != 0) {
                    throw new C3501(iMo2230);
                }
                str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                i = 1;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        if (1 != i) {
            AbstractC1270.m2997(0, 1, descriptor);
            throw null;
        }
        C2615 c2615 = new C2615();
        c2615.f8492 = str;
        return c2615;
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056(C2839.f9108)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, ((C2615) obj).f8492);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
