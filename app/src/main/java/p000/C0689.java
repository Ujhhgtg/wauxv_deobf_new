package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲇᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0689 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public long f2573 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C0689 f2574;

    public final String toString() {
        if (this.f2574 == null) {
            return Long.toBinaryString(this.f2573);
        }
        return this.f2574.toString() + "xx" + Long.toBinaryString(this.f2573);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2070(int i) {
        if (i < 64) {
            this.f2573 &= ~(1 << i);
            return;
        }
        C0689 c0689 = this.f2574;
        if (c0689 != null) {
            c0689.m2070(i - 64);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2071(int i) {
        C0689 c0689 = this.f2574;
        if (c0689 == null) {
            return i >= 64 ? Long.bitCount(this.f2573) : Long.bitCount(this.f2573 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2573 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2573) + c0689.m2071(i - 64);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2072() {
        if (this.f2574 == null) {
            this.f2574 = new C0689();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m2073(int i) {
        if (i < 64) {
            return (this.f2573 & (1 << i)) != 0;
        }
        m2072();
        return this.f2574.m2073(i - 64);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2074(int i, boolean z) {
        if (i >= 64) {
            m2072();
            this.f2574.m2074(i - 64, z);
            return;
        }
        long j = this.f2573;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f2573 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m2077(i);
        } else {
            m2070(i);
        }
        if (z2 || this.f2574 != null) {
            m2072();
            this.f2574.m2074(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m2075(int i) {
        if (i >= 64) {
            m2072();
            return this.f2574.m2075(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f2573;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f2573 = j3;
        long j4 = j - 1;
        this.f2573 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0689 c0689 = this.f2574;
        if (c0689 != null) {
            if (c0689.m2073(0)) {
                m2077(63);
            }
            this.f2574.m2075(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2076() {
        this.f2573 = 0L;
        C0689 c0689 = this.f2574;
        if (c0689 != null) {
            c0689.m2076();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2077(int i) {
        if (i < 64) {
            this.f2573 |= 1 << i;
        } else {
            m2072();
            this.f2574.m2077(i - 64);
        }
    }
}
