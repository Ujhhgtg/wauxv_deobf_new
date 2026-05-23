package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1281 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C1281 f4687;

    static {
        C1281 c1281 = new C1281();
        f4687 = c1281;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.FavInfoProto.VoiceInfoProto", c1281, 6);
        c2360.m4338("duration", false);
        c2360.m4339(new C0380(10, 3));
        c2360.m4338("fileCacheType", false);
        c2360.m4339(new C0380(16, 3));
        c2360.m4338("md5Checksum", false);
        c2360.m4339(new C0380(17, 3));
        c2360.m4338("fileSize", false);
        c2360.m4339(new C0380(19, 3));
        c2360.m4338("fileCacheName", false);
        c2360.m4339(new C0380(20, 3));
        c2360.m4338("filePath", true);
        c2360.m4339(new C0380(21, 3));
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
        int iMo2239 = 0;
        String strMo2235 = null;
        String strMo2236 = null;
        String strMo2237 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo2238 = interfaceC0766Mo2512.mo2238(interfaceC2654, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo2235 = interfaceC0766Mo2512.mo2235(interfaceC2654, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo2236 = interfaceC0766Mo2512.mo2235(interfaceC2654, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo2239 = interfaceC0766Mo2512.mo2238(interfaceC2654, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo2237 = interfaceC0766Mo2512.mo2235(interfaceC2654, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str);
                    i |= 32;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C1283(i, iMo2238, strMo2235, strMo2236, iMo2239, strMo2237, str);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{c1665, c2839, c2839, c1665, c2839, interfaceC1743M4056};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1283 c1283 = (C1283) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        int i = c1283.f4688;
        String str = c1283.f4693;
        interfaceC0767Mo2796.mo2249(0, i, interfaceC2654);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 1, c1283.f4689);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 2, c1283.f4690);
        interfaceC0767Mo2796.mo2249(3, c1283.f4691, interfaceC2654);
        interfaceC0767Mo2796.mo2250(interfaceC2654, 4, c1283.f4692);
        if (interfaceC0767Mo2796.mo2254() || str != null) {
            interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C2839.f9108, str);
        }
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
