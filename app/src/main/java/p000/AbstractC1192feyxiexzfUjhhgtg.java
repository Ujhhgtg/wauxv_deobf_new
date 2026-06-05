package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳ要点脸能不能ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192feyxiexzfUjhhgtg extends AbstractC1184feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static boolean m2679feyxiexzfUjhhgtg(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static String m2680feyxiexzfUjhhgtg(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static String m2681feyxiexzfUjhhgtg(String str, String str2, String str3) {
        int iM2626feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2626feyxiexzfUjhhgtg(str, str2, 0, false);
        if (iM2626feyxiexzfUjhhgtg < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM2626feyxiexzfUjhhgtg);
            sb.append(str3);
            i2 = iM2626feyxiexzfUjhhgtg + length;
            if (iM2626feyxiexzfUjhhgtg >= str.length()) {
                break;
            }
            iM2626feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2626feyxiexzfUjhhgtg(str, str2, iM2626feyxiexzfUjhhgtg + i, false);
        } while (iM2626feyxiexzfUjhhgtg > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
