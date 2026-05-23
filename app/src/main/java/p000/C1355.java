package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1355 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C1355 f4851;

    static {
        C1355 c1355 = new C1355();
        f4851 = c1355;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("wx.demo.hook.ui.FloatActionButtonHook.FabMenuItem", c1355, 6);
        c2360.m4338("desc", false);
        c2360.m4338("order", false);
        c2360.m4338("icon", false);
        c2360.m4338("type", false);
        c2360.m4338("action", false);
        c2360.m4338("enable", false);
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
        
        int i = 0;
        int iMo2238 = 0;
        boolean zMo2241 = false;
        String strMo2235 = null;
        String strMo2236 = null;
        String strMo2237 = null;
        String strMo2238 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo2235 = interfaceC0766Mo2512.mo2235(interfaceC2654, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo2238 = interfaceC0766Mo2512.mo2238(interfaceC2654, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo2236 = interfaceC0766Mo2512.mo2235(interfaceC2654, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo2237 = interfaceC0766Mo2512.mo2235(interfaceC2654, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo2238 = interfaceC0766Mo2512.mo2235(interfaceC2654, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo2241 = interfaceC0766Mo2512.mo2241(interfaceC2654, 5);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C1357(i, strMo2235, iMo2238, strMo2236, strMo2237, strMo2238, zMo2241);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{c2839, C1665.f5622, c2839, c2839, c2839, C0441.f2008};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1357 c1357 = (C1357) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 0, c1357.f4852);
        interfaceC0767Mo2796.mo2249(1, c1357.f4853, interfaceC2654);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 2, c1357.f4854);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 3, c1357.f4855);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 4, c1357.f4856);
        interfaceC0767Mo2796.mo2244(interfaceC2654, 5, c1357.f4857);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
