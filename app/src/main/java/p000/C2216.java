package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2216 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C2216 f7194;

    static {
        C2216 c2216 = new C2216();
        f7194 = c2216;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.NewSendMsgResp.MicroMsgRespNew", c2216, 8);
        c2360.m4338("ret", false);
        c2360.m4339(new C0380(1, 8));
        c2360.m4338("toUserName", false);
        c2360.m4339(new C0380(2, 8));
        c2360.m4338("msgId", false);
        c2360.m4339(new C0380(3, 8));
        c2360.m4338("clientMsgId", false);
        c2360.m4339(new C0380(4, 8));
        c2360.m4338("createTime", false);
        c2360.m4339(new C0380(5, 8));
        c2360.m4338("serverTime", false);
        c2360.m4339(new C0380(6, 8));
        c2360.m4338("type", false);
        c2360.m4339(new C0380(7, 8));
        c2360.m4338("newMsgId", false);
        c2360.m4339(new C0380(8, 8));
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
        Integer num = null;
        C2615 c2615 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    c2615 = (C2615) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2613.f8491, c2615);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num6);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1862.f6185, l);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2218(i, num, c2615, num2, num3, num4, num5, num6, l);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1665), AbstractC2205.m4056(C2613.f8491), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C1862.f6185)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2218 c2218 = (C2218) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c2218.f7195);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C2613.f8491, c2218.f7196);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c2218.f7197);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c2218.f7198);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c2218.f7199);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c2218.f7200);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c2218.f7201);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, C1862.f6185, c2218.f7202);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
