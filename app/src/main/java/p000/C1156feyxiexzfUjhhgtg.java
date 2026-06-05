package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛳ要点脸ᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1156feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C1156feyxiexzfUjhhgtg f4351Ujhhgtgfeyxiexzf = new C1156feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet m2648Ujhhgtgfeyxiexzf(int i, int i2, byte[] bArr) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(i, bArr);
            int i4 = i + i2;
            while (true) {
                i3 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
                int i5 = i3 + 1;
                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c2344Ujhhgtgfeyxiexzf.m3543Ujhhgtgfeyxiexzf(i6));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final byte[] m2649Ujhhgtgfeyxiexzf(Object obj) {
        int i;
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (String str : set) {
            if (str == null) {
                i2 += 5;
                iArr[i3] = -1;
            } else {
                int iM3535Ujhhgtgfeyxiexzf = C2344Ujhhgtgfeyxiexzf.m3535Ujhhgtgfeyxiexzf(str);
                strArr[i3] = str;
                iArr[i3] = iM3535Ujhhgtgfeyxiexzf;
                if ((iM3535Ujhhgtgfeyxiexzf >> 7) == 0) {
                    i = 1;
                } else if ((iM3535Ujhhgtgfeyxiexzf >> 14) == 0) {
                    i = 2;
                } else if ((iM3535Ujhhgtgfeyxiexzf >> 21) == 0) {
                    i = 3;
                } else {
                    i = (iM3535Ujhhgtgfeyxiexzf >> 28) == 0 ? 4 : 5;
                }
                i2 = i + iM3535Ujhhgtgfeyxiexzf + i2;
            }
            i3++;
        }
        C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf = new C2344Ujhhgtgfeyxiexzf(i2);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            int i6 = c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf;
            int i7 = i5;
            while ((i7 & (-128)) != 0) {
                ((byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf)[i6] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
                i6++;
            }
            ((byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf)[i6] = (byte) i7;
            c2344Ujhhgtgfeyxiexzf.f7648Ujhhgtgfeyxiexzf = i6 + 1;
            if (i5 >= 0) {
                c2344Ujhhgtgfeyxiexzf.m3552Ujhhgtgfeyxiexzf(strArr[i4]);
            }
        }
        return (byte[]) c2344Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
    }
}
