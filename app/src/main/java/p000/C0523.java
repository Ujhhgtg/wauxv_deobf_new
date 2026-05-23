package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0523 {

    public static final int[] f2208;

    public byte[] f2209 = new byte[32];

    public int f2210;

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        f2208 = iArr;
    }

    public final void m1847(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f2209[this.f2210 + i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
        }
        byte[] bArr = this.f2209;
        int i3 = this.f2210;
        bArr[i3 + i] = (byte) j;
        this.f2210 = i + 1 + i3;
    }

    public final void m1848(int i) {
        int i2 = this.f2210 + i;
        if (i2 <= this.f2209.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC0270.m1382(this.f2209, 0, 0, bArr, 14);
        this.f2209 = bArr;
    }

    public final void m1849(int i) {
        m1848(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.f2209;
            int i3 = this.f2210;
            this.f2210 = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    public final void m1850(long j) {
        m1848(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.f2209;
            int i2 = this.f2210;
            this.f2210 = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }
}
