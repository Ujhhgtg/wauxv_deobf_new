package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2646 {

    public final byte[] f8539;

    public int f8540;

    public int f8541;

    public boolean f8542;

    public final boolean f8543;

    public C2646 f8544;

    public C2646 f8545;

    public C2646() {
        this.f8539 = new byte[8192];
        this.f8543 = true;
        this.f8542 = false;
    }

    public final C2646 m4645() {
        C2646 c2646 = this.f8544;
        C2646 c2647 = c2646 != this ? c2646 : null;
        C2646 c2648 = this.f8545;
        c2648.f8544 = c2646;
        this.f8544.f8545 = c2648;
        this.f8544 = null;
        this.f8545 = null;
        return c2647;
    }

    public final void m4646(C2646 c2646) {
        c2646.f8545 = this;
        c2646.f8544 = this.f8544;
        this.f8544.f8545 = c2646;
        this.f8544 = c2646;
    }

    public final C2646 m4647() {
        this.f8542 = true;
        return new C2646(this.f8539, this.f8540, this.f8541, true, false);
    }

    public final void m4648(C2646 c2646, int i) {
        boolean z = c2646.f8543;
        byte[] bArr = c2646.f8539;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c2646.f8541;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c2646.f8542) {
                throw new IllegalArgumentException();
            }
            int i4 = c2646.f8540;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0270.m1382(bArr, i4, i2, bArr, 2);
            c2646.f8541 -= c2646.f8540;
            c2646.f8540 = 0;
        }
        int i5 = c2646.f8541;
        int i6 = this.f8540;
        AbstractC0270.m1378(this.f8539, i5, i6, bArr, i6 + i);
        c2646.f8541 += i;
        this.f8540 += i;
    }

    public C2646(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f8539 = bArr;
        this.f8540 = i;
        this.f8541 = i2;
        this.f8542 = z;
        this.f8543 = z2;
    }
}
