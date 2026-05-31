package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᛸᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0970 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0225 f3524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f3525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f3526;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0912 f3527;

    public C0970(C0225 c0225, boolean z, C0912 c0912) {
        super(1, -1);
        if (c0225 == null) {
            throw new NullPointerException("code == null");
        }
        this.f3524 = c0225;
        this.f3526 = z;
        this.f3527 = c0912;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5772;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        try {
            byte[] bArrM2587 = m2587(c2017.f8699, null, null, false);
            this.f3525 = bArrM2587;
            m4282(bArrM2587.length);
        } catch (RuntimeException e) {
            throw C1240.m3003("...while placing debug info for " + this.f3527.mo1360(), e);
        }
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        if (c0496.m1927()) {
            c0496.m1926(m4280() + " debug info");
            m2587(c1026, null, c0496, true);
        }
        c0496.m1931(this.f3525);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final byte[] m2587(C1026 c1026, String str, C0496 c0496, boolean z) {
        C0225 c0225 = this.f3524;
        c0225.m1393();
        C2436 c2436 = (C2436) c0225.f1407;
        c0225.m1393();
        C1855 c1855 = (C1855) c0225.f1408;
        c0225.m1393();
        C0954 c0954 = (C0954) c0225.f1409;
        C0969 c0969 = new C0969(c2436, c1855, c1026, c0954.m2564(), c0954.f3486, this.f3526, this.f3527);
        if (c0496 == null) {
            try {
                return c0969.m2580();
            } catch (IOException e) {
                throw C1240.m3003("...while encoding debug info", e);
            }
        }
        c0969.f3521 = str;
        c0969.f3520 = c0496;
        c0969.f3522 = z;
        try {
            return c0969.m2580();
        } catch (IOException e2) {
            throw C1240.m3003("...while encoding debug info", e2);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
    }
}
