package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0675Ujhhgtgfeyxiexzf extends AbstractC0856feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int[] f2793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f2794Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Object mo1455Ujhhgtgfeyxiexzf() {
        return Arrays.copyOf(this.f2793Ujhhgtgfeyxiexzf, this.f2794Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1456Ujhhgtgfeyxiexzf(int i) {
        int[] iArr = this.f2793Ujhhgtgfeyxiexzf;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2793Ujhhgtgfeyxiexzf = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC0856feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1457Ujhhgtgfeyxiexzf() {
        return this.f2794Ujhhgtgfeyxiexzf;
    }
}
