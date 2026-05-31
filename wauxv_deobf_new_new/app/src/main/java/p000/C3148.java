package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲈᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3148 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3148 f10036;

    static {
        C3148 c3148 = new C3148();
        f10036 = c3148;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.gm1Proto", c3148, 3);
        AbstractC2647.m4626(c2405, "anchor_shop_tag", false, 1);
        AbstractC2647.m4626(c2405, "anchor_shop_tag_url", false, 2);
        AbstractC2647.m4626(c2405, "lite_app_info", false, 3);
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
        Integer num = null;
        boolean z = true;
        int i = 0;
        String str = null;
        C3126 c3126 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                c3126 = (C3126) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3124.f9982, c3126);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3150(i, num, str, c3126);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C2899.f9270), AbstractC1471.m3392(C3124.f9982)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3150 c3150 = (C3150) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c3150.f10037);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C2899.f9270, c3150.f10038);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C3124.f9982, c3150.f10039);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
