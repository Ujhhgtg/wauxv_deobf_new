package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲇᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3236 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3236 f10345;

    static {
        C3236 c3236 = new C3236();
        f10345 = c3236;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ne5Proto", c3236, 3);
        AbstractC2647.m4626(c2405, "d", false, 1);
        AbstractC2647.m4626(c2405, "e", false, 2);
        AbstractC2647.m4626(c2405, "f", false, 3);
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
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        C3048 c3048 = null;
        Integer num = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C0416.f1980, bool);
                i |= 1;
            } else if (iMo2331 == 1) {
                c3048 = (C3048) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3046.f9749, c3048);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3238(i, bool, c3048, num);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C0416.f1980), AbstractC1471.m3392(C3046.f9749), AbstractC1471.m3392(C1680.f5658)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3238 c3238 = (C3238) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C0416.f1980, c3238.f10346);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3046.f9749, c3238.f10347);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1680.f5658, c3238.f10348);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
