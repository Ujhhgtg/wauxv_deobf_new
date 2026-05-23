package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1482 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C1482 f5257;

    static {
        C1482 c1482 = new C1482();
        f5257 = c1482;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("wx.demo.hook.ui.group.factory.GroupConstFactory.GroupItem", c1482, 5);
        c2360.m4338("type", false);
        c2360.m4338("order", false);
        c2360.m4338("title", false);
        c2360.m4338("enable", false);
        c2360.m4338("idList", false);
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
        InterfaceC1758[] interfaceC1758Arr = C1484.f5258;
        
        int i = 0;
        int iMo2238 = 0;
        boolean zMo2241 = false;
        String strMo2235 = null;
        String strMo2236 = null;
        String[] strArr = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                strMo2235 = interfaceC0766Mo2512.mo2235(interfaceC2654, 0);
                i |= 1;
            } else if (iMo2230 == 1) {
                iMo2238 = interfaceC0766Mo2512.mo2238(interfaceC2654, 1);
                i |= 2;
            } else if (iMo2230 == 2) {
                strMo2236 = interfaceC0766Mo2512.mo2235(interfaceC2654, 2);
                i |= 4;
            } else if (iMo2230 == 3) {
                zMo2241 = interfaceC0766Mo2512.mo2241(interfaceC2654, 3);
                i |= 8;
            } else {
                if (iMo2230 != 4) {
                    throw new C3501(iMo2230);
                }
                strArr = (String[]) interfaceC0766Mo2512.mo2237(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), strArr);
                i |= 16;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C1484(i, strMo2235, iMo2238, strMo2236, zMo2241, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C1484.f5258;
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{c2839, C1665.f5622, c2839, C0441.f2008, interfaceC1758Arr[4].getValue()};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1484 c1484 = (C1484) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C1484.f5258;
        interfaceC0767Mo2796.mo2250(interfaceC2654, 0, c1484.f5259);
        interfaceC0767Mo2796.mo2249(1, c1484.f5260, interfaceC2654);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 2, c1484.f5261);
        interfaceC0767Mo2796.mo2244(interfaceC2654, 3, c1484.f5262);
        interfaceC0767Mo2796.mo2245(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), c1484.f5263);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
