package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛳ能不能ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0988feyxiexzfUjhhgtg extends C0866feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f3887Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final long f3888Ujhhgtgfeyxiexzf;

    public C0988feyxiexzfUjhhgtg(C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg, C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg, long j, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        super(c0858feyxiexzfUjhhgtg, c0871feyxiexzfUjhhgtg, interfaceC1121feyxiexzfUjhhgtg);
        this.f3887Ujhhgtgfeyxiexzf = -1;
        if (j == 19500) {
            int iM2305Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg.m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT);
            if (iM2305Ujhhgtgfeyxiexzf < 0) {
                throw new IllegalArgumentException(("Expected positive length for " + interfaceC1121feyxiexzfUjhhgtg + ", but got " + iM2305Ujhhgtgfeyxiexzf).toString());
            }
            j = -iM2305Ujhhgtgfeyxiexzf;
        }
        this.f3888Ujhhgtgfeyxiexzf = j;
    }

    @Override // p000.C0866feyxiexzfUjhhgtg, p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final int mo1185Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        long j = this.f3888Ujhhgtgfeyxiexzf;
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        if (j > 0) {
            if ((this.f3887Ujhhgtgfeyxiexzf == -1 ? c0871feyxiexzfUjhhgtg.f3385Ujhhgtgfeyxiexzf : c0871feyxiexzfUjhhgtg.m2318Ujhhgtgfeyxiexzf()) == ((int) (j & 2147483647L))) {
                int i = this.f3887Ujhhgtgfeyxiexzf + 1;
                this.f3887Ujhhgtgfeyxiexzf = i;
                return i;
            }
            c0871feyxiexzfUjhhgtg.f3387Ujhhgtgfeyxiexzf = true;
            int i2 = (c0871feyxiexzfUjhhgtg.f3385Ujhhgtgfeyxiexzf << 3) | c0871feyxiexzfUjhhgtg.f3386Ujhhgtgfeyxiexzf.f3378Ujhhgtgfeyxiexzf;
            c0871feyxiexzfUjhhgtg.m2320Ujhhgtgfeyxiexzf(c0871feyxiexzfUjhhgtg.f3388Ujhhgtgfeyxiexzf);
            c0871feyxiexzfUjhhgtg.f3388Ujhhgtgfeyxiexzf = i2;
            return -1;
        }
        long j2 = -j;
        int i3 = this.f3887Ujhhgtgfeyxiexzf + 1;
        this.f3887Ujhhgtgfeyxiexzf = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c0871feyxiexzfUjhhgtg.f3387Ujhhgtgfeyxiexzf) {
            C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = c0871feyxiexzfUjhhgtg.f3384Ujhhgtgfeyxiexzf;
            if (c2615feyxiexzfUjhhgtg.f8432Ujhhgtgfeyxiexzf - c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // p000.C0866feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ */
    public final long mo1222feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        long j = this.f3888Ujhhgtgfeyxiexzf;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }
}
