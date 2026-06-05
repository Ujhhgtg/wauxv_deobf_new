package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3211feyxiexzfUjhhgtg extends AbstractC0856feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public double[] f9908Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f9909Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Object mo1455Ujhhgtgfeyxiexzf() {
        return Arrays.copyOf(this.f9908Ujhhgtgfeyxiexzf, this.f9909Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1456Ujhhgtgfeyxiexzf(int i) {
        double[] dArr = this.f9908Ujhhgtgfeyxiexzf;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f9908Ujhhgtgfeyxiexzf = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1457Ujhhgtgfeyxiexzf() {
        return this.f9909Ujhhgtgfeyxiexzf;
    }
}
