package p000;

import java.util.TreeMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0547 extends AbstractC1628 implements Comparable {

    public final C0895 f2258;

    public C0549 f2259 = null;

    public C0547(C0895 c0895) {
        this.f2258 = c0895;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2258.compareTo(((C0547) obj).f2258);
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        C0894 c0894 = this.f2258.f3335.f3361;
        C0548 c0548 = c1023.f3748;
        if (c0894 == null) {
            
            throw new NullPointerException("callSite == null");
        }
        C0549 c0549 = (C0549) ((TreeMap) c0548.f2262).get(c0894);
        if (c0549 == null) {
            C1986 c1986 = c1023.f3750;
            c0549 = new C0549(c0894);
            c1986.m3854(c0549);
            ((TreeMap) c0548.f2262).put(c0894, c0549);
        }
        this.f2259 = c0549;
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5720;
    }

    @Override // p000.AbstractC1675
    public final int mo1921() {
        return 4;
    }

    @Override // p000.AbstractC1675
    public final void mo1922(C1023 c1023, C0519 c0519) {
        int iM4150 = this.f2259.m4150();
        if (c0519.m1833()) {
            c0519.m1831(0, m3346() + ' ' + this.f2258.toString());
            c0519.m1831(4, "call_site_off: ".concat(AbstractC1460.m3224(iM4150)));
        }
        c0519.m1839(iM4150);
    }
}
