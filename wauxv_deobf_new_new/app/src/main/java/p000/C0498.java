package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0498 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f2159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final byte[] f2161;

    public C0498(int i, byte[] bArr) {
        this.f2161 = bArr;
        this.f2159 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1938(int i) {
        int i2 = this.f2160;
        int i3 = this.f2159;
        if (i <= i3 - i2) {
            return;
        }
        throw new C1667("Unexpected EOF, available " + (i3 - this.f2160) + " bytes, requested: " + i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int m1939() {
        int i = this.f2160;
        if (i >= this.f2159) {
            return -1;
        }
        this.f2160 = i + 1;
        return this.f2161[i] & 255;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long m1940(boolean z) {
        int i = this.f2160;
        int i2 = this.f2159;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new C1667("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f2161;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f2160 = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f2160 = i4;
                return j3 ^ (-128);
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM1939 = m1939();
            j2 |= ((long) (iM1939 & 127)) << i5;
            if ((iM1939 & 128) == 0) {
                return j2;
            }
        }
        throw new C1667("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    public C0498(byte[] bArr, int i, int i2) {
        this.f2161 = bArr;
        this.f2159 = i;
        this.f2160 = i2;
    }
}
