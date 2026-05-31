package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᲀᲁᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1487 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1487 f5282;

    static {
        C1487 c1487 = new C1487();
        f5282 = c1487;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.other.GmailList", c1487, 2);
        c2405.m4350("count", false);
        c2405.m4351(new C0355(1, 5));
        c2405.m4350("list", false);
        c2405.m4351(new C0355(2, 5));
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
        C1486 c1486 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else {
                if (iMo2331 != 1) {
                    throw new C3558(iMo2331);
                }
                c1486 = (C1486) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1484.f5278, c1486);
                i |= 2;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, descriptor);
            throw null;
        }
        C1489 c1489 = new C1489();
        c1489.f5283 = num;
        c1489.f5284 = c1486;
        return c1489;
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C1484.f5278)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1489 c1489 = (C1489) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c1489.f5283);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1484.f5278, c1489.f5284);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
