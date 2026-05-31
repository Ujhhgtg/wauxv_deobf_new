package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1361 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1361 f4873;

    static {
        C1361 c1361 = new C1361();
        f4873 = c1361;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("wx.demo.hook.ui.FloatActionButtonHook.FabMenuItem", c1361, 6);
        c2405.m4350("desc", false);
        c2405.m4350("order", false);
        c2405.m4350("icon", false);
        c2405.m4350("type", false);
        c2405.m4350("action", false);
        c2405.m4350("enable", false);
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
        int iMo2339 = 0;
        boolean zMo2342 = false;
        String strMo2336 = null;
        String strMo2337 = null;
        String strMo2338 = null;
        String strMo2339 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo2336 = interfaceC0764Mo2636.mo2336(interfaceC2715, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo2339 = interfaceC0764Mo2636.mo2339(interfaceC2715, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo2337 = interfaceC0764Mo2636.mo2336(interfaceC2715, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo2338 = interfaceC0764Mo2636.mo2336(interfaceC2715, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo2339 = interfaceC0764Mo2636.mo2336(interfaceC2715, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo2342 = interfaceC0764Mo2636.mo2342(interfaceC2715, 5);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C1363(i, strMo2336, iMo2339, strMo2337, strMo2338, strMo2339, zMo2342);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{c2899, C1680.f5658, c2899, c2899, c2899, C0416.f1980};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1363 c1363 = (C1363) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 0, c1363.f4874);
        interfaceC0765Mo2918.mo2350(1, c1363.f4875, interfaceC2715);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 2, c1363.f4876);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 3, c1363.f4877);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 4, c1363.f4878);
        interfaceC0765Mo2918.mo2345(interfaceC2715, 5, c1363.f4879);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
