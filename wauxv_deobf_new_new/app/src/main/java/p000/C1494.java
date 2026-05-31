package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1494 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1494 f5290;

    static {
        C1494 c1494 = new C1494();
        f5290 = c1494;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("wx.demo.hook.ui.group.factory.GroupConstFactory.GroupItem", c1494, 5);
        c2405.m4350("type", false);
        c2405.m4350("order", false);
        c2405.m4350("title", false);
        c2405.m4350("enable", false);
        c2405.m4350("idList", false);
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
        InterfaceC1780[] interfaceC1780Arr = C1496.f5291;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        int iMo2339 = 0;
        boolean zMo2342 = false;
        String strMo2336 = null;
        String strMo2337 = null;
        String[] strArr = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                strMo2336 = interfaceC0764Mo2636.mo2336(interfaceC2715, 0);
                i |= 1;
            } else if (iMo2331 == 1) {
                iMo2339 = interfaceC0764Mo2636.mo2339(interfaceC2715, 1);
                i |= 2;
            } else if (iMo2331 == 2) {
                strMo2337 = interfaceC0764Mo2636.mo2336(interfaceC2715, 2);
                i |= 4;
            } else if (iMo2331 == 3) {
                zMo2342 = interfaceC0764Mo2636.mo2342(interfaceC2715, 3);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                strArr = (String[]) interfaceC0764Mo2636.mo2338(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), strArr);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C1496(i, strMo2336, iMo2339, strMo2337, zMo2342, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C1496.f5291;
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{c2899, C1680.f5658, c2899, C0416.f1980, interfaceC1780Arr[4].getValue()};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1496 c1496 = (C1496) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C1496.f5291;
        interfaceC0765Mo2918.mo2351(interfaceC2715, 0, c1496.f5292);
        interfaceC0765Mo2918.mo2350(1, c1496.f5293, interfaceC2715);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 2, c1496.f5294);
        interfaceC0765Mo2918.mo2345(interfaceC2715, 3, c1496.f5295);
        interfaceC0765Mo2918.mo2346(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), c1496.f5296);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
