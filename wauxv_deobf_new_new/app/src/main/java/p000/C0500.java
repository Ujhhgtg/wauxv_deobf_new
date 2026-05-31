package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0500 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f2164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public byte[] f2165 = new byte[32];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2166;

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        f2164 = iArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1941(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f2165[this.f2166 + i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
        }
        byte[] bArr = this.f2165;
        int i3 = this.f2166;
        bArr[i3 + i] = (byte) j;
        this.f2166 = i + 1 + i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1942(int i) {
        int i2 = this.f2166 + i;
        if (i2 <= this.f2165.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC0280.m1528(this.f2165, 0, 0, bArr, 14);
        this.f2165 = bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1943(int i) {
        m1942(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.f2165;
            int i3 = this.f2166;
            this.f2166 = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1944(long j) {
        m1942(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.f2165;
            int i2 = this.f2166;
            this.f2166 = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }
}
