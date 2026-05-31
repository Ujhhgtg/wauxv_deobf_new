package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲁᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0575 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final char[] f2368 = new char[Opcodes.LNEG];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f2369 = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m2122('b', 8);
        m2122('t', 9);
        m2122('n', 10);
        m2122('f', 12);
        m2122('r', 13);
        m2122('/', 47);
        m2122('\"', 34);
        m2122('\\', 92);
        byte[] bArr = f2369;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m2122(char c, int i) {
        if (c != 'u') {
            f2368[c] = (char) i;
        }
    }
}
