package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0521 {

    public final int f2203;

    public int f2204;

    public final byte[] f2205;

    public C0521(int i, byte[] bArr) {
        this.f2205 = bArr;
        this.f2203 = i;
    }

    public void m1844(int i) {
        int i2 = this.f2204;
        int i3 = this.f2203;
        if (i <= i3 - i2) {
            return;
        }
        throw new C1653("Unexpected EOF, available " + (i3 - this.f2204) + " bytes, requested: " + i);
    }

    public int m1845() {
        int i = this.f2204;
        if (i >= this.f2203) {
            return -1;
        }
        this.f2204 = i + 1;
        return this.f2205[i] & 255;
    }

    public long m1846(boolean z) {
        int i = this.f2204;
        int i2 = this.f2203;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new C1653("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f2205;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f2204 = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f2204 = i4;
                return j3 ^ (-128);
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM1845 = m1845();
            j2 |= ((long) (iM1845 & 127)) << i5;
            if ((iM1845 & 128) == 0) {
                return j2;
            }
        }
        throw new C1653("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    public C0521(byte[] bArr, int i, int i2) {
        this.f2205 = bArr;
        this.f2203 = i;
        this.f2204 = i2;
    }
}
