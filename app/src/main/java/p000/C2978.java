package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2978 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2978 f9563;

    static {
        C2978 c2978 = new C2978();
        f9563 = c2978;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ReadershareProto", c2978, 11);
        AbstractC2668.m4680(c2360, "itemshowtype", false, 1);
        AbstractC2668.m4680(c2360, "nativepage", false, 2);
        AbstractC2668.m4680(c2360, "digest", false, 3);
        AbstractC2668.m4680(c2360, "width", false, 4);
        AbstractC2668.m4680(c2360, "height", false, 5);
        AbstractC2668.m4680(c2360, "pubtime", false, 6);
        AbstractC2668.m4680(c2360, "duration", false, 7);
        AbstractC2668.m4680(c2360, "vid", false, 8);
        AbstractC2668.m4680(c2360, "funcflag", false, 9);
        AbstractC2668.m4680(c2360, "cover", false, 10);
        AbstractC2668.m4680(c2360, "ispaysubscribe", false, 11);
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
        interfaceC0766Mo2512.getClass();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str3 = null;
        Integer num8 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num2);
                    i |= 1;
                    break;
                case 1:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num3);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C2839.f9108, str2);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num4);
                    i |= 8;
                    break;
                case 4:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num5);
                    i |= 16;
                    break;
                case 5:
                    num6 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num6);
                    i |= 32;
                    break;
                case 6:
                    num7 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1665.f5622, num7);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C2839.f9108, str3);
                    i |= 128;
                    break;
                case 8:
                    num8 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C1665.f5622, num8);
                    i |= bc.e;
                    break;
                case 9:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C2839.f9108, str);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C1665.f5622, num);
                    i |= 1024;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
            z = z;
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C2980(i, num2, num3, str2, num4, num5, num6, num7, str3, num8, str, num);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C2980 c2980 = (C2980) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c2980.f9564);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c2980.f9565);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c2839, c2980.f9566);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c1665, c2980.f9567);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c2980.f9568);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c2980.f9569);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1665, c2980.f9570);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c2839, c2980.f9571);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, c1665, c2980.f9572);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, c2839, c2980.f9573);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c1665, c2980.f9574);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
