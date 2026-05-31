package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲈᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2356 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2356 f7580;

    static {
        C2356 c2356 = new C2356();
        f7580 = c2356;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("wx.demo.hook.chat.PanelEmojiHook.PanelEmojiGroupConfig", c2356, 4);
        c2405.m4350("dirName", false);
        c2405.m4350("title", false);
        c2405.m4350("order", false);
        c2405.m4350("enable", true);
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
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                strMo2336 = interfaceC0764Mo2636.mo2336(interfaceC2715, 0);
                i |= 1;
            } else if (iMo2331 == 1) {
                strMo2337 = interfaceC0764Mo2636.mo2336(interfaceC2715, 1);
                i |= 2;
            } else if (iMo2331 == 2) {
                iMo2339 = interfaceC0764Mo2636.mo2339(interfaceC2715, 2);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                zMo2342 = interfaceC0764Mo2636.mo2342(interfaceC2715, 3);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C2358(i, strMo2336, strMo2337, iMo2339, zMo2342);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{c2899, c2899, C1680.f5658, C0416.f1980};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C2358 c2358 = (C2358) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        String str = c2358.f7581;
        boolean z = c2358.f7584;
        interfaceC0765Mo2918.mo2351(interfaceC2715, 0, str);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 1, c2358.f7582);
        interfaceC0765Mo2918.mo2350(2, c2358.f7583, interfaceC2715);
        if (interfaceC0765Mo2918.mo2355() || !z) {
            interfaceC0765Mo2918.mo2345(interfaceC2715, 3, z);
        }
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
