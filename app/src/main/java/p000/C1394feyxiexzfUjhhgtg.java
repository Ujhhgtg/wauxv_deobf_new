package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛲᛳᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1394feyxiexzfUjhhgtg implements InterfaceC1227feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC2595feyxiexzfUjhhgtg f4893Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2598feyxiexzfUjhhgtg f4894Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C1086feyxiexzfUjhhgtg f4895Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f4896Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f4897Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public long f4898Ujhhgtgfeyxiexzf;

    public C1394feyxiexzfUjhhgtg(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
        this.f4893Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg.mo2104Ujhhgtgfeyxiexzf();
        this.f4894Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.f8400Ujhhgtgfeyxiexzf;
        this.f4895Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg;
        this.f4896Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg != null ? c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4897Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
        }
        if (this.f4897Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = this.f4895Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.f4894Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg3 != null && (c1086feyxiexzfUjhhgtg3 != (c1086feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg2.f8400Ujhhgtgfeyxiexzf) || this.f4896Ujhhgtgfeyxiexzf != c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f4893Ujhhgtgfeyxiexzf.mo2115Ujhhgtgfeyxiexzf(this.f4898Ujhhgtgfeyxiexzf + 1)) {
            return -1L;
        }
        if (this.f4895Ujhhgtgfeyxiexzf == null && (c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg2.f8400Ujhhgtgfeyxiexzf) != null) {
            this.f4895Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg;
            this.f4896Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        }
        long jMin = Math.min(j, c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf - this.f4898Ujhhgtgfeyxiexzf);
        this.f4894Ujhhgtgfeyxiexzf.m3858Ujhhgtgfeyxiexzf(this.f4898Ujhhgtgfeyxiexzf, c2598feyxiexzfUjhhgtg, jMin);
        this.f4898Ujhhgtgfeyxiexzf += jMin;
        return jMin;
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f4893Ujhhgtgfeyxiexzf.timeout();
    }
}
