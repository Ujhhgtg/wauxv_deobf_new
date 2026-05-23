package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1135 {

    public static final long[] f4220 = new long[0];

    public final InterfaceC2654 f4221;

    public final AbstractC1438 f4222;

    public long f4223;

    public final long[] f4224;

    /* JADX WARN: Multi-variable type inference failed */
    public C1135(InterfaceC2654 interfaceC2654, InterfaceC1429 interfaceC1429) {
        this.f4221 = interfaceC2654;
        this.f4222 = (AbstractC1438) interfaceC1429;
        int iMo3473 = interfaceC2654.mo3473();
        if (iMo3473 <= 64) {
            this.f4223 = iMo3473 != 64 ? (-1) << iMo3473 : 0L;
            this.f4224 = f4220;
            return;
        }
        this.f4223 = 0L;
        int i = (iMo3473 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo3473 & 63) != 0) {
            jArr[i - 1] = (-1) << iMo3473;
        }
        this.f4224 = jArr;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᛸᲇ, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲇᲁᤞᛸ] */
    public final int m2733() {
        ?? r8;
        int iNumberOfTrailingZeros;
        InterfaceC2654 interfaceC2654 = this.f4221;
        int iMo3473 = interfaceC2654.mo3473();
        do {
            long j = this.f4223;
            r8 = this.f4222;
            if (j == -1) {
                if (iMo3473 <= 64) {
                    return -1;
                }
                long[] jArr = this.f4224;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) r8.mo1196(interfaceC2654, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = -1L;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f4223 |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) r8.mo1196(interfaceC2654, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
