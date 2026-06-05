package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2879feyxiexzfUjhhgtg extends C2667feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f9146Ujhhgtgfeyxiexzf;

    public C2879feyxiexzfUjhhgtg(C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, boolean z) {
        super(c2501feyxiexzfUjhhgtg);
        this.f9146Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo4014Ujhhgtgfeyxiexzf(byte b) {
        if (this.f9146Ujhhgtgfeyxiexzf) {
            mo4020Ujhhgtgfeyxiexzf(String.valueOf(b & 255));
        } else {
            m4018Ujhhgtgfeyxiexzf(String.valueOf(b & 255));
        }
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo4016Ujhhgtgfeyxiexzf(int i) {
        boolean z = this.f9146Ujhhgtgfeyxiexzf;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo4020Ujhhgtgfeyxiexzf(unsignedString);
        } else {
            m4018Ujhhgtgfeyxiexzf(unsignedString);
        }
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo4017Ujhhgtgfeyxiexzf(long j) {
        boolean z = this.f9146Ujhhgtgfeyxiexzf;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo4020Ujhhgtgfeyxiexzf(unsignedString);
        } else {
            m4018Ujhhgtgfeyxiexzf(unsignedString);
        }
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo4019Ujhhgtgfeyxiexzf(short s) {
        if (this.f9146Ujhhgtgfeyxiexzf) {
            mo4020Ujhhgtgfeyxiexzf(String.valueOf(s & 65535));
        } else {
            m4018Ujhhgtgfeyxiexzf(String.valueOf(s & 65535));
        }
    }
}
