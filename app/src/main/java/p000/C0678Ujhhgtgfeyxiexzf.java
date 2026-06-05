package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0678Ujhhgtgfeyxiexzf implements InterfaceC0674Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final long f2799Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f2800Ujhhgtgfeyxiexzf;

    public C0678Ujhhgtgfeyxiexzf(long j, int i) {
        this.f2799Ujhhgtgfeyxiexzf = j;
        this.f2800Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC0674Ujhhgtgfeyxiexzf
    public final C0667Ujhhgtgfeyxiexzf toInstant() {
        long j = C0667Ujhhgtgfeyxiexzf.f2779Ujhhgtgfeyxiexzf.f2781Ujhhgtgfeyxiexzf;
        long j2 = this.f2799Ujhhgtgfeyxiexzf;
        if (j2 >= j && j2 <= C0667Ujhhgtgfeyxiexzf.f2780Ujhhgtgfeyxiexzf.f2781Ujhhgtgfeyxiexzf) {
            return AbstractC1937feyxiexzfUjhhgtg.m3279Ujhhgtgfeyxiexzf(this.f2800Ujhhgtgfeyxiexzf, j2);
        }
        throw new C0670Ujhhgtgfeyxiexzf("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
