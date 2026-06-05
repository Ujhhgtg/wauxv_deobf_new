package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3614Ujhhgtgfeyxiexzf extends AbstractC0856feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public float[] f11248Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11249Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Object mo1455Ujhhgtgfeyxiexzf() {
        return Arrays.copyOf(this.f11248Ujhhgtgfeyxiexzf, this.f11249Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1456Ujhhgtgfeyxiexzf(int i) {
        float[] fArr = this.f11248Ujhhgtgfeyxiexzf;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f11248Ujhhgtgfeyxiexzf = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1457Ujhhgtgfeyxiexzf() {
        return this.f11249Ujhhgtgfeyxiexzf;
    }
}
