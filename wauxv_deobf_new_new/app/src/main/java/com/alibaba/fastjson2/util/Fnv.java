package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Fnv {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    public static long hashCode64(String... strArr) {
        if (strArr.length == 1) {
            return hashCode64(strArr[0]);
        }
        long jHashCode64 = MAGIC_HASH_CODE;
        for (String str : strArr) {
            jHashCode64 = (jHashCode64 ^ hashCode64(str)) * MAGIC_PRIME;
        }
        return jHashCode64;
    }

    public static long hashCode64LCase(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= str.length()) {
                if (str.length() - i2 > 8) {
                    break;
                }
                long j = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt = str.charAt(length);
                    if (cCharAt != '-' && cCharAt != '_' && cCharAt != ' ') {
                        if (cCharAt >= 'A' && cCharAt <= 'Z') {
                            cCharAt = (char) (cCharAt + ' ');
                        }
                        j = (j << 8) | ((long) cCharAt);
                    }
                }
                if (j == 0) {
                    break;
                }
                return j;
            }
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > 255 || (i == 0 && cCharAt2 == 0)) {
                break;
            }
            if (cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ' ') {
                i2++;
            }
            i++;
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt3 = str.charAt(i3);
            if (cCharAt3 != '-' && cCharAt3 != '_' && cCharAt3 != ' ') {
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                }
                j2 = (j2 ^ ((long) cCharAt3)) * MAGIC_PRIME;
            }
        }
        return j2;
    }

    private static long hashCode64UTF8(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        return hashCode64(cArr, 0, IOUtils.decodeUTF8(bArr, i, i2, cArr));
    }

    public static long hashCode64(byte[] bArr, int i, int i2, boolean z) {
        if (!z) {
            return hashCode64UTF8(bArr, i, i2);
        }
        if (i2 > 0 && i2 <= 8) {
            long longLE = IOUtils.getLongLE(bArr, i) & ((-1) >>> ((8 - i2) << 3));
            if (longLE != 0) {
                return longLE;
            }
        }
        long j = MAGIC_HASH_CODE;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j ^ ((long) bArr[i + i3])) * MAGIC_PRIME;
        }
        return j;
    }

    public static long hashCode64(char[] cArr, int i, int i2) {
        if (i2 <= 8) {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    long j = 0;
                    for (int i4 = i2 - 1; i4 >= 0; i4--) {
                        j = (j << 8) | ((long) cArr[i + i4]);
                    }
                    if (j == 0) {
                        break;
                    }
                    return j;
                }
                char c = cArr[i + i3];
                if (c > 255 || (i3 == 0 && c == 0)) {
                    break;
                }
                i3++;
            }
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 ^ ((long) cArr[i + i5])) * MAGIC_PRIME;
        }
        return j2;
    }

    public static long hashCode64(String str) {
        if (str.length() <= 8) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt > 255 || (i == 0 && cCharAt == 0)) {
                        break;
                    }
                    i++;
                } else {
                    long jCharAt = 0;
                    for (int length = str.length() - 1; length >= 0; length--) {
                        jCharAt = (jCharAt << 8) | ((long) str.charAt(length));
                    }
                    if (jCharAt == 0) {
                        break;
                    }
                    return jCharAt;
                }
            }
        }
        long jCharAt2 = MAGIC_HASH_CODE;
        for (int i2 = 0; i2 < str.length(); i2++) {
            jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * MAGIC_PRIME;
        }
        return jCharAt2;
    }
}
