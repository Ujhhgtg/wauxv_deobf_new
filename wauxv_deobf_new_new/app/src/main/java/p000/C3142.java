package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲀᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3142 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3142 f10019;

    static {
        C3142 c3142 = new C3142();
        f10019 = c3142;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gj1Proto", c3142, 8);
        AbstractC2647.m4626(c2405, "charge_flag", false, 1);
        AbstractC2647.m4626(c2405, "is_purchased", false, 2);
        AbstractC2647.m4626(c2405, "purchase_user_count", false, 3);
        AbstractC2647.m4626(c2405, "purchase_heat", false, 4);
        AbstractC2647.m4626(c2405, "unit_price_in_wecoin", false, 5);
        AbstractC2647.m4626(c2405, "need_get_payment_items", false, 6);
        AbstractC2647.m4626(c2405, "prompt_wording", false, 8);
        AbstractC2647.m4626(c2405, "charge_is_member_free", false, 9);
        descriptor = c2405;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return descriptor;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        interfaceC0764Mo2636.getClass();
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
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C0416.f1980, bool);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1888.f6259, l);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num4);
                    i |= 32;
                    break;
                case 6:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str);
                    i |= 64;
                    break;
                case 7:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num5);
                    i |= 128;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3144(i, num, bool, num2, l, num3, num4, str, num5);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1680), AbstractC1471.m3392(C0416.f1980), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C2899.f9270), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3144 c3144 = (C3144) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3144.f10020);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C0416.f1980, c3144.f10021);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3144.f10022);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1888.f6259, c3144.f10023);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3144.f10024);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3144.f10025);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, C2899.f9270, c3144.f10026);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3144.f10027);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
