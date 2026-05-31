package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᤞᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3043 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3043 f9745;

    static {
        C3043 c3043 = new C3043();
        f9745 = c3043;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.SizeProto", c3043, 3);
        AbstractC2647.m4626(c2405, "width", false, 1);
        AbstractC2647.m4626(c2405, "height", false, 2);
        AbstractC2647.m4626(c2405, "totalSize", false, 3);
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
        Float f = null;
        boolean z = true;
        int i = 0;
        Float f2 = null;
        Float f3 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1372.f4898, f);
                i |= 1;
            } else if (iMo2331 == 1) {
                f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1372.f4898, f2);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                f3 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1372.f4898, f3);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3045(i, f, f2, f3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1372 c1372 = C1372.f4898;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1372)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3045 c3045 = (C3045) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1372, c3045.f9746);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1372, c3045.f9747);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1372, c3045.f9748);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
