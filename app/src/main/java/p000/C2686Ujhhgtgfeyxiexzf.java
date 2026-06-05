package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛲᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2686Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final char[] f8576Ujhhgtgfeyxiexzf = new char[Opcodes.LNEG];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f8577Ujhhgtgfeyxiexzf = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m4028Ujhhgtgfeyxiexzf('b', 8);
        m4028Ujhhgtgfeyxiexzf('t', 9);
        m4028Ujhhgtgfeyxiexzf('n', 10);
        m4028Ujhhgtgfeyxiexzf('f', 12);
        m4028Ujhhgtgfeyxiexzf('r', 13);
        m4028Ujhhgtgfeyxiexzf('/', 47);
        m4028Ujhhgtgfeyxiexzf('\"', 34);
        m4028Ujhhgtgfeyxiexzf('\\', 92);
        byte[] bArr = f8577Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = JSONB.Constants.BC_SYMBOL;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4028Ujhhgtgfeyxiexzf(char c, int i) {
        if (c != 'u') {
            f8576Ujhhgtgfeyxiexzf[c] = (char) i;
        }
    }
}
