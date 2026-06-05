package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3313feyxiexzfUjhhgtg extends AbstractC3318feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final double f10350Ujhhgtgfeyxiexzf;

    public C3313feyxiexzfUjhhgtg(double d) {
        this.f10350Ujhhgtgfeyxiexzf = d;
    }

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(1);
        double d = this.f10350Ujhhgtgfeyxiexzf;
        if (d != 0.0d) {
            c3470Ujhhgtgfeyxiexzf.m4965Ujhhgtgfeyxiexzf(8, 0);
            ByteBuffer byteBuffer = c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf;
            int i = c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf - 8;
            c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf = i;
            byteBuffer.putDouble(i, d);
            c3470Ujhhgtgfeyxiexzf.m4966Ujhhgtgfeyxiexzf(0);
        }
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
