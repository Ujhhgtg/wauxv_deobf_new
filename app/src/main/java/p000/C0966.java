package p000;

import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0966 extends AbstractC2270 {

    public final C0215 f3507;

    public byte[] f3508;

    public final boolean f3509;

    public final C0913 f3510;

    public C0966(C0215 c0215, boolean z, C0913 c0913) {
        super(1, -1);
        if (c0215 == null) {
            throw new NullPointerException("code == null");
        }
        this.f3507 = c0215;
        this.f3509 = z;
        this.f3510 = c0913;
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5729;
    }

    @Override // p000.AbstractC2270
    public final void mo1224(C1986 c1986, int i) {
        try {
            byte[] bArrM2468 = m2468(c1986.f8534, null, null, false);
            this.f3508 = bArrM2468;
            m4153(bArrM2468.length);
        } catch (RuntimeException e) {
            throw C1238.m2884("...while placing debug info for " + this.f3510.mo1214(), e);
        }
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        if (c0519.m1833()) {
            c0519.m1832(m4151() + " debug info");
            m2468(c1023, null, c0519, true);
        }
        c0519.m1837(this.f3508);
    }

    public final byte[] m2468(C1023 c1023, String str, C0519 c0519, boolean z) {
        C0215 c0215 = this.f3507;
        c0215.m1247();
        C2383 c2383 = (C2383) c0215.f1333;
        c0215.m1247();
        C1828 c1828 = (C1828) c0215.f1334;
        c0215.m1247();
        C0951 c0951 = (C0951) c0215.f1335;
        C0965 c0965 = new C0965(c2383, c1828, c1023, c0951.m2445(), c0951.f3471, this.f3509, this.f3510);
        if (c0519 == null) {
            try {
                return c0965.m2461();
            } catch (IOException e) {
                throw C1238.m2884("...while encoding debug info", e);
            }
        }
        c0965.f3504 = str;
        c0965.f3503 = c0519;
        c0965.f3505 = z;
        try {
            return c0965.m2461();
        } catch (IOException e2) {
            throw C1238.m2884("...while encoding debug info", e2);
        }
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
    }
}
