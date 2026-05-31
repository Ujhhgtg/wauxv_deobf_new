package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1921 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f6337;

    public C1921(int i) {
        this.f6336 = i;
        switch (i) {
            case 1:
                this.f6337 = AbstractC2240.m4259(new C2096(this));
                break;
            default:
                C2899 c2899 = C2899.f9270;
                C1740 c1740 = C1740.f5874;
                this.f6337 = AbstractC2235.m4194("kotlin.collections.Map.Entry", C2911.f9282, new InterfaceC2715[0], new C1898(18));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲇᛸᲁ] */
    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        switch (this.f6336) {
            case 0:
                return (C2717) this.f6337;
            default:
                return (InterfaceC2715) this.f6337.getValue();
        }
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        switch (this.f6336) {
            case 0:
                C2717 c2717 = (C2717) this.f6337;
                InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(c2717);
                interfaceC0764Mo2636.getClass();
                Object obj = AbstractC3744.f11722;
                Object objMo2338 = obj;
                Object objMo2339 = objMo2338;
                while (true) {
                    int iMo2331 = interfaceC0764Mo2636.mo2331(c2717);
                    if (iMo2331 == -1) {
                        if (objMo2338 == obj) {
                            throw new C1667("Element 'key' is missing");
                        }
                        if (objMo2339 == obj) {
                            throw new C1667("Element 'value' is missing");
                        }
                        C1920 c1920 = new C1920(objMo2338, objMo2339);
                        interfaceC0764Mo2636.mo2329(c2717);
                        return c1920;
                    }
                    if (iMo2331 == 0) {
                        objMo2338 = interfaceC0764Mo2636.mo2338(c2717, 0, C2899.f9270, null);
                    } else {
                        if (iMo2331 != 1) {
                            throw new C1667(AbstractC1095.m2794(iMo2331, "Invalid index: "));
                        }
                        objMo2339 = interfaceC0764Mo2636.mo2338(c2717, 1, C1740.f5874, null);
                    }
                }
                break;
            default:
                InterfaceC2715 interfaceC2715Mo1509 = mo1509();
                InterfaceC0764 interfaceC0764Mo2637 = interfaceC0978.mo2636(interfaceC2715Mo1509);
                interfaceC0764Mo2637.getClass();
                int iMo2332 = interfaceC0764Mo2637.mo2331(mo1509());
                if (iMo2332 != -1) {
                    throw new C1667(AbstractC1095.m2794(iMo2332, "Unexpected index "));
                }
                interfaceC0764Mo2637.mo2329(interfaceC2715Mo1509);
                return C3554.UNIT;
        }
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        switch (this.f6336) {
            case 0:
                C2717 c2717 = (C2717) this.f6337;
                InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(c2717);
                Map.Entry entry = (Map.Entry) obj;
                interfaceC0765Mo2918.mo2346(c2717, 0, C2899.f9270, entry.getKey());
                interfaceC0765Mo2918.mo2346(c2717, 1, C1740.f5874, entry.getValue());
                interfaceC0765Mo2918.mo2343(c2717);
                break;
            default:
                interfaceC1207.mo2918(mo1509()).mo2343(mo1509());
                break;
        }
    }
}
