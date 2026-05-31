package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᛸᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1086 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1086 f3910;

    static {
        C1086 c1086 = new C1086();
        f3910 = c1086;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.other.DisturbSetting", c1086, 4);
        c2405.m4350("nightSetting", false);
        c2405.m4351(new C0355(1, 1));
        c2405.m4350("nightTime", false);
        c2405.m4351(new C0355(2, 1));
        c2405.m4350("allDaySetting", false);
        c2405.m4351(new C0355(3, 1));
        c2405.m4350("allDayTime", false);
        c2405.m4351(new C0355(4, 1));
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
        boolean z = true;
        int i = 0;
        Integer num = null;
        C1091 c1091 = null;
        String str = null;
        C1091 c1092 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                c1091 = (C1091) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1089.f3915, c1091);
                i |= 2;
            } else if (iMo2331 == 2) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                c1092 = (C1091) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1089.f3915, c1092);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, descriptor);
            throw null;
        }
        C1088 c1088 = new C1088();
        c1088.f3911 = num;
        c1088.f3912 = c1091;
        c1088.f3913 = str;
        c1088.f3914 = c1092;
        return c1088;
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C1680.f5658);
        C1089 c1089 = C1089.f3915;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1089), AbstractC1471.m3392(C2899.f9270), AbstractC1471.m3392(c1089)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1088 c1088 = (C1088) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c1088.f3911);
        C1089 c1089 = C1089.f3915;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1089, c1088.f3912);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C2899.f9270, c1088.f3913);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1089, c1088.f3914);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
