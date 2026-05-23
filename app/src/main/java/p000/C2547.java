package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2547 extends C2436 {

    public int f8104;

    public final long f8105;

    public C2547(C2427 c2427, C2439 c2439, long j, InterfaceC2654 interfaceC2654) {
        super(c2427, c2439, interfaceC2654);
        this.f8104 = -1;
        if (j == 19500) {
            int iM4403 = c2439.m4403(EnumC2429.DEFAULT);
            if (iM4403 < 0) {
                throw new IllegalArgumentException(("Expected positive length for " + interfaceC2654 + ", but got " + iM4403).toString());
            }
            j = -iM4403;
        }
        this.f8105 = j;
    }

    @Override // p000.C2436, p000.InterfaceC0766
    public final int mo2230(InterfaceC2654 interfaceC2654) {
        long j = this.f8105;
        C2439 c2439 = this.f7737;
        if (j > 0) {
            if ((this.f8104 == -1 ? c2439.f7749 : c2439.m4416()) == ((int) (j & 2147483647L))) {
                int i = this.f8104 + 1;
                this.f8104 = i;
                return i;
            }
            c2439.f7751 = true;
            int i2 = (c2439.f7749 << 3) | c2439.f7750.f7735;
            c2439.m4418(c2439.f7752);
            c2439.f7752 = i2;
            return -1;
        }
        long j2 = -j;
        int i3 = this.f8104 + 1;
        this.f8104 = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c2439.f7751) {
            C0521 c0521 = c2439.f7748;
            if (c0521.f2203 - c0521.f2204 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // p000.C2436
    public final long mo3689(InterfaceC2654 interfaceC2654, int i) {
        long j = this.f8105;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }
}
