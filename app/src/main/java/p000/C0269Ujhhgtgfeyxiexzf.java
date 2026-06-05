package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0269Ujhhgtgfeyxiexzf extends AbstractC0856feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public long[] f1662Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f1663Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object mo1455Ujhhgtgfeyxiexzf() {
        return Arrays.copyOf(this.f1662Ujhhgtgfeyxiexzf, this.f1663Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo1456Ujhhgtgfeyxiexzf(int i) {
        long[] jArr = this.f1662Ujhhgtgfeyxiexzf;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f1662Ujhhgtgfeyxiexzf = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int mo1457Ujhhgtgfeyxiexzf() {
        return this.f1663Ujhhgtgfeyxiexzf;
    }
}
