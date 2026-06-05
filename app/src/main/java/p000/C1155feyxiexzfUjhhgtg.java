package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛳ能不能要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1155feyxiexzfUjhhgtg extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f4348Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f4349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f4350Ujhhgtgfeyxiexzf;

    public C1155feyxiexzfUjhhgtg(String str, int i, boolean z) {
        this.f4348Ujhhgtgfeyxiexzf = str;
        this.f4349Ujhhgtgfeyxiexzf = i;
        this.f4350Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        String str = this.f4348Ujhhgtgfeyxiexzf;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        if (str.length() == 0 && this.f4349Ujhhgtgfeyxiexzf != 5) {
            this.f4349Ujhhgtgfeyxiexzf = 5;
        }
        int iM4959Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4959Ujhhgtgfeyxiexzf(str);
        int i = this.f4349Ujhhgtgfeyxiexzf;
        byte b = 1;
        if (i != 1) {
            byte b2 = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    b2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw null;
                        }
                        b = b2;
                    }
                } else {
                    b = b2;
                }
            }
        } else {
            b = 0;
        }
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(3);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4959Ujhhgtgfeyxiexzf);
        boolean z = this.f4350Ujhhgtgfeyxiexzf;
        if (z) {
            c3470Ujhhgtgfeyxiexzf.m4965Ujhhgtgfeyxiexzf(1, 0);
            ByteBuffer byteBuffer = c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf;
            int i2 = c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf - 1;
            c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            c3470Ujhhgtgfeyxiexzf.m4966Ujhhgtgfeyxiexzf(2);
        } else {
            c3470Ujhhgtgfeyxiexzf.getClass();
        }
        c3470Ujhhgtgfeyxiexzf.m4955Ujhhgtgfeyxiexzf(b, 1);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
