package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0525 implements InterfaceC1754 {

    public final int f2212;

    public final int f2213;

    public final int f2214;

    public final C1660 f2215;

    public final C0536 f2216;

    public C0525(int i, int i2, int i3, C1660 c1660, C0536 c0536) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int i4 = c1660.f5610;
        for (int i5 = 0; i5 < i4; i5++) {
            if (c1660.m3384(i5) < 0) {
                StringBuilder sbM2787 = AbstractC1194.m2787(i5, "successors[", "] == ");
                sbM2787.append(c1660.m3384(i5));
                throw new IllegalArgumentException(sbM2787.toString());
            }
        }
        if (c0536 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f2212 = i;
        this.f2213 = i2;
        this.f2214 = i3;
        this.f2215 = c1660;
        this.f2216 = c0536;
    }

    public final String toString() {
        return "{" + AbstractC1460.m3223(this.f2212) + ": " + AbstractC1460.m3223(this.f2213) + ".." + AbstractC1460.m3223(this.f2214) + '}';
    }

    @Override // p000.InterfaceC1754
    public final int mo1576() {
        return this.f2212;
    }
}
