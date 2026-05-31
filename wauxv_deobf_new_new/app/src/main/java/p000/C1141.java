package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1141 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long[] f4232 = new long[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2715 f4233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1446 f4234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f4235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long[] f4236;

    /* JADX WARN: Multi-variable type inference failed */
    public C1141(InterfaceC2715 interfaceC2715, InterfaceC1437 interfaceC1437) {
        this.f4233 = interfaceC2715;
        this.f4234 = (AbstractC1446) interfaceC1437;
        int iMo3641 = interfaceC2715.mo3641();
        if (iMo3641 <= 64) {
            this.f4235 = iMo3641 != 64 ? (-1) << iMo3641 : 0L;
            this.f4236 = f4232;
            return;
        }
        this.f4235 = 0L;
        int i = (iMo3641 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo3641 & 63) != 0) {
            jArr[i - 1] = (-1) << iMo3641;
        }
        this.f4236 = jArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2876(int i) {
        if (i < 64) {
            this.f4235 = (1 << i) | this.f4235;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.f4236;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᲇᛸ, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᛸᤞᲀᲇ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m2877() {
        ?? r8;
        int iNumberOfTrailingZeros;
        InterfaceC2715 interfaceC2715 = this.f4233;
        int iMo3641 = interfaceC2715.mo3641();
        do {
            long j = this.f4235;
            r8 = this.f4234;
            if (j == -1) {
                if (iMo3641 <= 64) {
                    return -1;
                }
                long[] jArr = this.f4236;
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
                        if (((Boolean) r8.mo1342(interfaceC2715, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f4235 |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) r8.mo1342(interfaceC2715, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
