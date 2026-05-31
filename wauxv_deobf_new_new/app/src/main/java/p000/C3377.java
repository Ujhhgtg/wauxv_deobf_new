package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤝᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3377 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3377 f10679;

    static {
        C3377 c3377 = new C3377();
        f10679 = c3377;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.vq5Proto", c3377, 4);
        AbstractC2647.m4626(c2405, "d", false, 1);
        AbstractC2647.m4626(c2405, "e", false, 2);
        AbstractC2647.m4626(c2405, "f", false, 3);
        AbstractC2647.m4626(c2405, "g", false, 4);
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
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                i |= 2;
            } else if (iMo2331 == 2) {
                num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num3);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num4);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3379(i, num, num2, num3, num4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3379 c3379 = (C3379) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3379.f10680);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3379.f10681);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3379.f10682);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3379.f10683);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
