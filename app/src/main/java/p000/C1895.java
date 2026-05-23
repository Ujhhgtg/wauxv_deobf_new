package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᛸᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1895 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f6263;

    public C1895(int i) {
        this.f6262 = i;
        switch (i) {
            case 1:
                this.f6263 = AbstractC1458.m3163(new C2083(this));
                break;
            default:
                C2839 c2839 = C2839.f9108;
                C1717 c1717 = C1717.f5811;
                this.f6263 = AbstractC1459.m3174("kotlin.collections.Map.Entry", C2851.f9113, new InterfaceC2654[0], new C1884(2));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲁᛸᲈᲇ] */
    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        switch (this.f6262) {
            case 0:
                return (C2656) this.f6263;
            default:
                return (InterfaceC2654) this.f6263.getValue();
        }
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        switch (this.f6262) {
            case 0:
                C2656 c2656 = (C2656) this.f6263;
                InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(c2656);
                
                Object obj = AbstractC0968.f3515;
                Object objMo2237 = obj;
                Object objMo2238 = objMo2237;
                while (true) {
                    int iMo2230 = interfaceC0766Mo2512.mo2230(c2656);
                    if (iMo2230 == -1) {
                        if (objMo2237 == obj) {
                            throw new C1653("Element 'key' is missing");
                        }
                        if (objMo2238 == obj) {
                            throw new C1653("Element 'value' is missing");
                        }
                        C1894 c1894 = new C1894(objMo2237, objMo2238);
                        interfaceC0766Mo2512.mo2228(c2656);
                        return c1894;
                    }
                    if (iMo2230 == 0) {
                        objMo2237 = interfaceC0766Mo2512.mo2237(c2656, 0, C2839.f9108, null);
                    } else {
                        if (iMo2230 != 1) {
                            throw new C1653(AbstractC1194.m2779(iMo2230, "Invalid index: "));
                        }
                        objMo2238 = interfaceC0766Mo2512.mo2237(c2656, 1, C1717.f5811, null);
                    }
                }
                break;
            default:
                InterfaceC2654 interfaceC2654Mo1363 = mo1363();
                InterfaceC0766 interfaceC0766Mo2513 = interfaceC0974.mo2512(interfaceC2654Mo1363);
                
                int iMo2231 = interfaceC0766Mo2513.mo2230(mo1363());
                if (iMo2231 != -1) {
                    throw new C1653(AbstractC1194.m2779(iMo2231, "Unexpected index "));
                }
                interfaceC0766Mo2513.mo2228(interfaceC2654Mo1363);
                return Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        switch (this.f6262) {
            case 0:
                C2656 c2656 = (C2656) this.f6263;
                InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(c2656);
                Map.Entry entry = (Map.Entry) obj;
                interfaceC0767Mo2796.mo2245(c2656, 0, C2839.f9108, entry.getKey());
                interfaceC0767Mo2796.mo2245(c2656, 1, C1717.f5811, entry.getValue());
                interfaceC0767Mo2796.mo2242(c2656);
                break;
            default:
                interfaceC1206.mo2796(mo1363()).mo2242(mo1363());
                break;
        }
    }
}
