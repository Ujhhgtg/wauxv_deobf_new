package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲀᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3083 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3083 f9852;

    static {
        C3083 c3083 = new C3083();
        f9852 = c3083;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gj1Proto", c3083, 8);
        AbstractC2668.m4680(c2360, "charge_flag", false, 1);
        AbstractC2668.m4680(c2360, "is_purchased", false, 2);
        AbstractC2668.m4680(c2360, "purchase_user_count", false, 3);
        AbstractC2668.m4680(c2360, "purchase_heat", false, 4);
        AbstractC2668.m4680(c2360, "unit_price_in_wecoin", false, 5);
        AbstractC2668.m4680(c2360, "need_get_payment_items", false, 6);
        AbstractC2668.m4680(c2360, "prompt_wording", false, 8);
        AbstractC2668.m4680(c2360, "charge_is_member_free", false, 9);
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
        
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
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
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C0441.f2008, bool);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1665.f5622, num2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1862.f6185, l);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C1665.f5622, num4);
                    i |= 32;
                    break;
                case 6:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str);
                    i |= 64;
                    break;
                case 7:
                    num5 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C1665.f5622, num5);
                    i |= 128;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3085(i, num, bool, num2, l, num3, num4, str, num5);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        C1665 c1665 = C1665.f5622;
        return new InterfaceC1743[]{AbstractC2205.m4056(c1665), AbstractC2205.m4056(C0441.f2008), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C1862.f6185), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C2839.f9108), AbstractC2205.m4056(c1665)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3085 c3085 = (C3085) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3085.f9853);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C0441.f2008, c3085.f9854);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1665, c3085.f9855);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C1862.f6185, c3085.f9856);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3085.f9857);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c1665, c3085.f9858);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, C2839.f9108, c3085.f9859);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, c1665, c3085.f9860);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
