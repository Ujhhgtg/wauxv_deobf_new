package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᤝᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0680 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public long f2571 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C0680 f2572;

    public final String toString() {
        if (this.f2572 == null) {
            return Long.toBinaryString(this.f2571);
        }
        return this.f2572.toString() + "xx" + Long.toBinaryString(this.f2571);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2165(int i) {
        if (i < 64) {
            this.f2571 &= ~(1 << i);
            return;
        }
        C0680 c0680 = this.f2572;
        if (c0680 != null) {
            c0680.m2165(i - 64);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2166(int i) {
        C0680 c0680 = this.f2572;
        if (c0680 == null) {
            return i >= 64 ? Long.bitCount(this.f2571) : Long.bitCount(this.f2571 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2571 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2571) + c0680.m2166(i - 64);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2167() {
        if (this.f2572 == null) {
            this.f2572 = new C0680();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m2168(int i) {
        if (i < 64) {
            return (this.f2571 & (1 << i)) != 0;
        }
        m2167();
        return this.f2572.m2168(i - 64);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2169(int i, boolean z) {
        if (i >= 64) {
            m2167();
            this.f2572.m2169(i - 64, z);
            return;
        }
        long j = this.f2571;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f2571 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m2172(i);
        } else {
            m2165(i);
        }
        if (z2 || this.f2572 != null) {
            m2167();
            this.f2572.m2169(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m2170(int i) {
        if (i >= 64) {
            m2167();
            return this.f2572.m2170(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f2571;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f2571 = j3;
        long j4 = j - 1;
        this.f2571 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0680 c0680 = this.f2572;
        if (c0680 != null) {
            if (c0680.m2168(0)) {
                m2172(63);
            }
            this.f2572.m2170(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2171() {
        this.f2571 = 0L;
        C0680 c0680 = this.f2572;
        if (c0680 != null) {
            c0680.m2171();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2172(int i) {
        if (i < 64) {
            this.f2571 |= 1 << i;
        } else {
            m2167();
            this.f2572.m2172(i - 64);
        }
    }
}
