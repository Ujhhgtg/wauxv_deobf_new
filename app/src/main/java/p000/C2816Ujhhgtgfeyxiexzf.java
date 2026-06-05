package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2816Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public long f8965Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C2816Ujhhgtgfeyxiexzf f8966Ujhhgtgfeyxiexzf;

    public final String toString() {
        if (this.f8966Ujhhgtgfeyxiexzf == null) {
            return Long.toBinaryString(this.f8965Ujhhgtgfeyxiexzf);
        }
        return this.f8966Ujhhgtgfeyxiexzf.toString() + "xx" + Long.toBinaryString(this.f8965Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4144Ujhhgtgfeyxiexzf(int i) {
        if (i < 64) {
            this.f8965Ujhhgtgfeyxiexzf &= ~(1 << i);
            return;
        }
        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = this.f8966Ujhhgtgfeyxiexzf;
        if (c2816Ujhhgtgfeyxiexzf != null) {
            c2816Ujhhgtgfeyxiexzf.m4144Ujhhgtgfeyxiexzf(i - 64);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m4145Ujhhgtgfeyxiexzf(int i) {
        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = this.f8966Ujhhgtgfeyxiexzf;
        if (c2816Ujhhgtgfeyxiexzf == null) {
            return i >= 64 ? Long.bitCount(this.f8965Ujhhgtgfeyxiexzf) : Long.bitCount(this.f8965Ujhhgtgfeyxiexzf & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f8965Ujhhgtgfeyxiexzf & ((1 << i) - 1));
        }
        return Long.bitCount(this.f8965Ujhhgtgfeyxiexzf) + c2816Ujhhgtgfeyxiexzf.m4145Ujhhgtgfeyxiexzf(i - 64);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4146Ujhhgtgfeyxiexzf() {
        if (this.f8966Ujhhgtgfeyxiexzf == null) {
            this.f8966Ujhhgtgfeyxiexzf = new C2816Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m4147Ujhhgtgfeyxiexzf(int i) {
        if (i < 64) {
            return (this.f8965Ujhhgtgfeyxiexzf & (1 << i)) != 0;
        }
        m4146Ujhhgtgfeyxiexzf();
        return this.f8966Ujhhgtgfeyxiexzf.m4147Ujhhgtgfeyxiexzf(i - 64);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4148Ujhhgtgfeyxiexzf(int i, boolean z) {
        if (i >= 64) {
            m4146Ujhhgtgfeyxiexzf();
            this.f8966Ujhhgtgfeyxiexzf.m4148Ujhhgtgfeyxiexzf(i - 64, z);
            return;
        }
        long j = this.f8965Ujhhgtgfeyxiexzf;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f8965Ujhhgtgfeyxiexzf = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4151Ujhhgtgfeyxiexzf(i);
        } else {
            m4144Ujhhgtgfeyxiexzf(i);
        }
        if (z2 || this.f8966Ujhhgtgfeyxiexzf != null) {
            m4146Ujhhgtgfeyxiexzf();
            this.f8966Ujhhgtgfeyxiexzf.m4148Ujhhgtgfeyxiexzf(0, z2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m4149Ujhhgtgfeyxiexzf(int i) {
        if (i >= 64) {
            m4146Ujhhgtgfeyxiexzf();
            return this.f8966Ujhhgtgfeyxiexzf.m4149Ujhhgtgfeyxiexzf(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f8965Ujhhgtgfeyxiexzf;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f8965Ujhhgtgfeyxiexzf = j3;
        long j4 = j - 1;
        this.f8965Ujhhgtgfeyxiexzf = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = this.f8966Ujhhgtgfeyxiexzf;
        if (c2816Ujhhgtgfeyxiexzf != null) {
            if (c2816Ujhhgtgfeyxiexzf.m4147Ujhhgtgfeyxiexzf(0)) {
                m4151Ujhhgtgfeyxiexzf(63);
            }
            this.f8966Ujhhgtgfeyxiexzf.m4149Ujhhgtgfeyxiexzf(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m4150Ujhhgtgfeyxiexzf() {
        this.f8965Ujhhgtgfeyxiexzf = 0L;
        C2816Ujhhgtgfeyxiexzf c2816Ujhhgtgfeyxiexzf = this.f8966Ujhhgtgfeyxiexzf;
        if (c2816Ujhhgtgfeyxiexzf != null) {
            c2816Ujhhgtgfeyxiexzf.m4150Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4151Ujhhgtgfeyxiexzf(int i) {
        if (i < 64) {
            this.f8965Ujhhgtgfeyxiexzf |= 1 << i;
        } else {
            m4146Ujhhgtgfeyxiexzf();
            this.f8966Ujhhgtgfeyxiexzf.m4151Ujhhgtgfeyxiexzf(i - 64);
        }
    }
}
