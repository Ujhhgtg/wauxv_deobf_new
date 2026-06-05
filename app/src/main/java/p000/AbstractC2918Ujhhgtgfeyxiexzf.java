package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2918Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte[] f9202Ujhhgtgfeyxiexzf = "0123456789abcdef".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final boolean m4285Ujhhgtgfeyxiexzf(C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg, int i, byte[] bArr, int i2) {
        int i3 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        byte[] bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                i3 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String m4286Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(j2) == 13) {
                String strM3864feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.m3864feyxiexzfUjhhgtg(j2, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
                c2598feyxiexzfUjhhgtg.skip(2L);
                return strM3864feyxiexzfUjhhgtg;
            }
        }
        String strM3864feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg.m3864feyxiexzfUjhhgtg(j, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        c2598feyxiexzfUjhhgtg.skip(1L);
        return strM3864feyxiexzfUjhhgtg2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int m4287Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, C1470feyxiexzfUjhhgtg c1470feyxiexzfUjhhgtg, boolean z) {
        int i;
        int i2;
        int i3;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg;
        int i4;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
        int i5 = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf;
        int i6 = c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf;
        int[] iArr = c1470feyxiexzfUjhhgtg.f5109Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = c1086feyxiexzfUjhhgtg2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c1086feyxiexzfUjhhgtg3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c1086feyxiexzfUjhhgtg3 = c1086feyxiexzfUjhhgtg3.f4164Ujhhgtgfeyxiexzf;
                            int i16 = c1086feyxiexzfUjhhgtg3.f4160Ujhhgtgfeyxiexzf;
                            byte[] bArr2 = c1086feyxiexzfUjhhgtg3.f4159Ujhhgtgfeyxiexzf;
                            i2 = c1086feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf;
                            if (c1086feyxiexzfUjhhgtg3 == c1086feyxiexzfUjhhgtg2) {
                                i3 = i16;
                                bArr = bArr2;
                                c1086feyxiexzfUjhhgtg3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg4 = c1086feyxiexzfUjhhgtg3.f4164Ujhhgtgfeyxiexzf;
                        i3 = c1086feyxiexzfUjhhgtg4.f4160Ujhhgtgfeyxiexzf;
                        byte[] bArr3 = c1086feyxiexzfUjhhgtg4.f4159Ujhhgtgfeyxiexzf;
                        i4 = c1086feyxiexzfUjhhgtg4.f4161Ujhhgtgfeyxiexzf;
                        if (c1086feyxiexzfUjhhgtg4 != c1086feyxiexzfUjhhgtg2) {
                            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c1086feyxiexzfUjhhgtg = null;
                        }
                    } else {
                        c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c1086feyxiexzfUjhhgtg3 = c1086feyxiexzfUjhhgtg;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c1086feyxiexzfUjhhgtg3 = c1086feyxiexzfUjhhgtg;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
