package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱᛴᛳ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3316feyxiexzfUjhhgtg extends AbstractC3318feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f10353Ujhhgtgfeyxiexzf;

    public C3316feyxiexzfUjhhgtg(float f) {
        this.f10353Ujhhgtgfeyxiexzf = f;
    }

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(1);
        float f = this.f10353Ujhhgtgfeyxiexzf;
        if (f != 0.0d) {
            c3470Ujhhgtgfeyxiexzf.m4965Ujhhgtgfeyxiexzf(4, 0);
            ByteBuffer byteBuffer = c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf;
            int i = c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf - 4;
            c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf = i;
            byteBuffer.putFloat(i, f);
            c3470Ujhhgtgfeyxiexzf.m4966Ujhhgtgfeyxiexzf(0);
        }
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
