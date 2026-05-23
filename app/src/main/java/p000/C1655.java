package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1655 implements InterfaceC1656 {

    public final long f5601;

    public final int f5602;

    public C1655(long j, int i) {
        this.f5601 = j;
        this.f5602 = i;
    }

    @Override // p000.InterfaceC1656
    public final C1652 toInstant() {
        C1652 c1652 = C1652.f5595;
        C1652 c1653 = C1652.f5595;
        long j = c1653.f5597;
        long j2 = this.f5601;
        if (j2 >= j) {
            C1652 c1654 = C1652.f5596;
            if (j2 <= c1654.f5597) {
                long j3 = this.f5602;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? c1654 : c1653;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new C1652(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new C1653("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
