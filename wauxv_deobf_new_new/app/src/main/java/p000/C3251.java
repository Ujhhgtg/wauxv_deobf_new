package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3251 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3251 f10374;

    static {
        C3251 c3251 = new C3251();
        f10374 = c3251;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.o22Proto", c3251, 5);
        AbstractC2647.m4626(c2405, "contact", false, 1);
        AbstractC2647.m4626(c2405, "enable_click_author", false, 2);
        AbstractC2647.m4626(c2405, "h5_url", false, 3);
        AbstractC2647.m4626(c2405, "friend_data", false, 4);
        AbstractC2647.m4626(c2405, "lite_app_param", false, 5);
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
        C3015 c3015 = null;
        Integer num = null;
        String str = null;
        C3135 c3135 = null;
        C3325 c3325 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                c3015 = (C3015) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C3013.f9623, c3015);
                i |= 1;
            } else if (iMo2331 == 1) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                i |= 2;
            } else if (iMo2331 == 2) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str);
                i |= 4;
            } else if (iMo2331 == 3) {
                c3135 = (C3135) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3133.f10006, c3135);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                c3325 = (C3325) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3323.f10538, c3325);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3253(i, c3015, num, str, c3135, c3325);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C3013.f9623), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C2899.f9270), AbstractC1471.m3392(C3133.f10006), AbstractC1471.m3392(C3323.f10538)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3253 c3253 = (C3253) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C3013.f9623, c3253.f10375);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1680.f5658, c3253.f10376);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C2899.f9270, c3253.f10377);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3133.f10006, c3253.f10378);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C3323.f10538, c3253.f10379);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
