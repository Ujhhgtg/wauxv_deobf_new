package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1752 {

    public static final C1752 f5859 = new C1752();

    public short f5860;

    public int f5861;

    public int[] f5862;

    public short f5863;

    public short f5864;

    public short f5865;

    public short f5866;

    public C1412 f5867;

    public C1752 f5868;

    public C0221 f5869;

    public C1752 f5870;

    public final String toString() {
        return "L" + System.identityHashCode(this);
    }

    public final void m3501(int i, int i2, int i3) {
        if (this.f5862 == null) {
            this.f5862 = new int[6];
        }
        int[] iArr = this.f5862;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f5862 = iArr2;
        }
        int[] iArr3 = this.f5862;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    public final C1752 m3502() {
        C1412 c1412 = this.f5867;
        return c1412 == null ? this : c1412.f5085;
    }

    public final C1752 m3503(C1752 c1752) {
        for (C0221 c0221 = this.f5869; c0221 != null; c0221 = (C0221) c0221.f1353) {
            if ((this.f5860 & 16) == 0 || c0221 != ((C0221) this.f5869.f1353)) {
                C1752 c1753 = (C1752) c0221.f1352;
                if (c1753.f5870 == null) {
                    c1753.f5870 = c1752;
                    c1752 = c1753;
                }
            }
        }
        return c1752;
    }

    public final void m3504(C0516 c0516, int i, boolean z) {
        if ((this.f5860 & 4) != 0) {
            if (z) {
                c0516.m1823(this.f5861 - i);
                return;
            } else {
                c0516.m1824(this.f5861 - i);
                return;
            }
        }
        if (z) {
            m3501(i, 536870912, c0516.f2191);
            c0516.m1823(-1);
        } else {
            m3501(i, 268435456, c0516.f2191);
            c0516.m1824(-1);
        }
    }

    public final boolean m3505(byte[] bArr, int i) {
        this.f5860 = (short) (this.f5860 | 4);
        this.f5861 = i;
        int[] iArr = this.f5862;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f5862;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i7 = bArr[i3] & 255;
                    if (i7 < 198) {
                        bArr[i3] = (byte) (i7 + 49);
                    } else {
                        bArr[i3] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            }
        }
        return z;
    }
}
