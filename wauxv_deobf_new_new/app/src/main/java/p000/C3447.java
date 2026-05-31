package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3447 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3447 f10837;

    static {
        C3447 c3447 = new C3447();
        f10837 = c3447;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.zg4Proto", c3447, 4);
        AbstractC2647.m4626(c2405, "target_type", false, 1);
        AbstractC2647.m4626(c2405, "target_num", false, 2);
        AbstractC2647.m4626(c2405, "current_num", false, 3);
        AbstractC2647.m4626(c2405, "gift_product_id", false, 4);
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
        Long l = null;
        Long l2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                i |= 2;
            } else if (iMo2331 == 2) {
                l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1888.f6259, l2);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3449(i, num, l, l2, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C1680.f5658);
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888), AbstractC1471.m3392(C2899.f9270)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3449 c3449 = (C3449) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c3449.f10838);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3449.f10839);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1888, c3449.f10840);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C2899.f9270, c3449.f10841);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
