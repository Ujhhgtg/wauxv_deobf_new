package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2687Ujhhgtgfeyxiexzf extends AbstractC0856feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public char[] f8578Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8579Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Object mo1455Ujhhgtgfeyxiexzf() {
        return Arrays.copyOf(this.f8578Ujhhgtgfeyxiexzf, this.f8579Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1456Ujhhgtgfeyxiexzf(int i) {
        char[] cArr = this.f8578Ujhhgtgfeyxiexzf;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8578Ujhhgtgfeyxiexzf = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1457Ujhhgtgfeyxiexzf() {
        return this.f8579Ujhhgtgfeyxiexzf;
    }
}
