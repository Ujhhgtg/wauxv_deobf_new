package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3098Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final HashSet f9633Ujhhgtgfeyxiexzf = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final HashSet f9634Ujhhgtgfeyxiexzf = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m4606Ujhhgtgfeyxiexzf(String str) {
        int iM4614Ujhhgtgfeyxiexzf = m4614Ujhhgtgfeyxiexzf(str.length() - 1, str);
        if (iM4614Ujhhgtgfeyxiexzf < 0) {
            return null;
        }
        while (iM4614Ujhhgtgfeyxiexzf >= 1 && str.charAt(iM4614Ujhhgtgfeyxiexzf) == ']' && str.charAt(iM4614Ujhhgtgfeyxiexzf - 1) == '[') {
            iM4614Ujhhgtgfeyxiexzf = m4614Ujhhgtgfeyxiexzf(iM4614Ujhhgtgfeyxiexzf - 2, str);
        }
        if (iM4614Ujhhgtgfeyxiexzf < 0) {
            return null;
        }
        int i = iM4614Ujhhgtgfeyxiexzf + 1;
        while (iM4614Ujhhgtgfeyxiexzf >= 0 && Character.isJavaIdentifierPart(str.charAt(iM4614Ujhhgtgfeyxiexzf))) {
            iM4614Ujhhgtgfeyxiexzf--;
        }
        int i2 = iM4614Ujhhgtgfeyxiexzf + 1;
        if (i2 >= i) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        if (Character.isJavaIdentifierStart(strSubstring.charAt(0))) {
            return strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m4607Ujhhgtgfeyxiexzf(String str, int i, char c, char c2) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int iM4612Ujhhgtgfeyxiexzf = m4612Ujhhgtgfeyxiexzf(i, str);
            if (iM4612Ujhhgtgfeyxiexzf > i) {
                i = iM4612Ujhhgtgfeyxiexzf - 1;
            } else {
                char cCharAt = str.charAt(i);
                if (cCharAt == c) {
                    i2++;
                } else if (cCharAt == c2 && (i2 = i2 - 1) == 0) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m4608Ujhhgtgfeyxiexzf(int i, String str) {
        int iM4613Ujhhgtgfeyxiexzf = m4613Ujhhgtgfeyxiexzf(i, str);
        if (iM4613Ujhhgtgfeyxiexzf < str.length()) {
            if (m4615Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf, str, "throws")) {
                int iM4613Ujhhgtgfeyxiexzf2 = m4613Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf, str);
                if (m4615Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf2, str, "throws")) {
                    iM4613Ujhhgtgfeyxiexzf2 += 6;
                    int length = str.length();
                    loop0: while (true) {
                        boolean z = true;
                        while (true) {
                            if (iM4613Ujhhgtgfeyxiexzf2 < length) {
                                iM4613Ujhhgtgfeyxiexzf2 = m4613Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf2, str);
                                if (iM4613Ujhhgtgfeyxiexzf2 < length) {
                                    char cCharAt = str.charAt(iM4613Ujhhgtgfeyxiexzf2);
                                    if (cCharAt == '{') {
                                        if (!z) {
                                            break loop0;
                                        }
                                        break loop0;
                                    }
                                    if (cCharAt != ';') {
                                        if (z) {
                                            if (Character.isJavaIdentifierStart(cCharAt)) {
                                                while (true) {
                                                    iM4613Ujhhgtgfeyxiexzf2++;
                                                    if (iM4613Ujhhgtgfeyxiexzf2 >= length) {
                                                        break;
                                                    }
                                                    char cCharAt2 = str.charAt(iM4613Ujhhgtgfeyxiexzf2);
                                                    if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.' && cCharAt2 != '$') {
                                                        break;
                                                    }
                                                }
                                                z = false;
                                            }
                                        } else if (cCharAt == ',') {
                                            iM4613Ujhhgtgfeyxiexzf2++;
                                        }
                                    }
                                }
                            }
                            iM4613Ujhhgtgfeyxiexzf2 = -1;
                            break loop0;
                        }
                    }
                }
                if (iM4613Ujhhgtgfeyxiexzf2 >= 0) {
                    iM4613Ujhhgtgfeyxiexzf = m4613Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf2, str);
                    if (iM4613Ujhhgtgfeyxiexzf >= str.length() && str.charAt(iM4613Ujhhgtgfeyxiexzf) == '{') {
                        return iM4613Ujhhgtgfeyxiexzf;
                    }
                }
            } else if (iM4613Ujhhgtgfeyxiexzf >= str.length()) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String m4609Ujhhgtgfeyxiexzf(ArrayList arrayList, int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static String m4610Ujhhgtgfeyxiexzf(String str, ArrayList arrayList, int i) {
        String strM4611Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            String str2 = (String) arrayList.get(i2);
            String strM4606Ujhhgtgfeyxiexzf = m4606Ujhhgtgfeyxiexzf(str2);
            if (strM4606Ujhhgtgfeyxiexzf == null) {
                strM4611Ujhhgtgfeyxiexzf = m4611Ujhhgtgfeyxiexzf(str2);
            } else {
                int iM4614Ujhhgtgfeyxiexzf = m4614Ujhhgtgfeyxiexzf(str2.length() - 1, str2);
                while (iM4614Ujhhgtgfeyxiexzf >= 1 && str2.charAt(iM4614Ujhhgtgfeyxiexzf) == ']' && str2.charAt(iM4614Ujhhgtgfeyxiexzf - 1) == '[') {
                    iM4614Ujhhgtgfeyxiexzf = m4614Ujhhgtgfeyxiexzf(iM4614Ujhhgtgfeyxiexzf - 2, str2);
                }
                int i3 = -1;
                if (iM4614Ujhhgtgfeyxiexzf >= 0) {
                    int i4 = iM4614Ujhhgtgfeyxiexzf + 1;
                    while (iM4614Ujhhgtgfeyxiexzf >= 0 && Character.isJavaIdentifierPart(str2.charAt(iM4614Ujhhgtgfeyxiexzf))) {
                        iM4614Ujhhgtgfeyxiexzf--;
                    }
                    int i5 = iM4614Ujhhgtgfeyxiexzf + 1;
                    if (i5 < i4 && strM4606Ujhhgtgfeyxiexzf.equals(str2.substring(i5, i4))) {
                        i3 = i5;
                    }
                }
                strM4611Ujhhgtgfeyxiexzf = i3 < 0 ? m4611Ujhhgtgfeyxiexzf(str2) : m4611Ujhhgtgfeyxiexzf(str2.substring(0, i3) + str2.substring(strM4606Ujhhgtgfeyxiexzf.length() + i3));
            }
            sb.append(strM4611Ujhhgtgfeyxiexzf);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static String m4611Ujhhgtgfeyxiexzf(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int iM4613Ujhhgtgfeyxiexzf = 0;
        while (iM4613Ujhhgtgfeyxiexzf < length) {
            int iM4612Ujhhgtgfeyxiexzf = m4612Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf, str);
            if (iM4612Ujhhgtgfeyxiexzf <= iM4613Ujhhgtgfeyxiexzf) {
                char cCharAt = str.charAt(iM4613Ujhhgtgfeyxiexzf);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        int i = iM4613Ujhhgtgfeyxiexzf + 1;
                        iM4612Ujhhgtgfeyxiexzf = str.length();
                        while (i < iM4612Ujhhgtgfeyxiexzf) {
                            char cCharAt2 = str.charAt(i);
                            if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.') {
                                break;
                            }
                            i++;
                        }
                        iM4613Ujhhgtgfeyxiexzf = m4613Ujhhgtgfeyxiexzf(i, str);
                        if (iM4613Ujhhgtgfeyxiexzf < iM4612Ujhhgtgfeyxiexzf && str.charAt(iM4613Ujhhgtgfeyxiexzf) == '(') {
                            iM4613Ujhhgtgfeyxiexzf = m4607Ujhhgtgfeyxiexzf(str, iM4613Ujhhgtgfeyxiexzf, '(', ')');
                            if (iM4613Ujhhgtgfeyxiexzf < 0) {
                            }
                        }
                    } else if (m4615Ujhhgtgfeyxiexzf(iM4613Ujhhgtgfeyxiexzf, str, "final")) {
                        iM4613Ujhhgtgfeyxiexzf += 5;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                iM4613Ujhhgtgfeyxiexzf++;
            }
            iM4613Ujhhgtgfeyxiexzf = iM4612Ujhhgtgfeyxiexzf;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m4612Ujhhgtgfeyxiexzf(int i, String str) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int length = str.length();
        if (i < 0 || i >= length) {
            return i;
        }
        if (i < 0 || 3 + i > str.length() || !str.regionMatches(i, "\"\"\"", 0, 3)) {
            char cCharAt3 = str.charAt(i);
            if (cCharAt3 == '\"') {
                do {
                    i++;
                    while (i < length) {
                        cCharAt2 = str.charAt(i);
                        if (cCharAt2 == '\\') {
                            i += 2;
                        }
                    }
                } while (cCharAt2 != '\"');
                return i + 1;
            }
            if (cCharAt3 == '\'') {
                do {
                    i++;
                    while (i < length) {
                        cCharAt = str.charAt(i);
                        if (cCharAt == '\\') {
                            i += 2;
                        }
                    }
                } while (cCharAt != '\'');
                return i + 1;
            }
            if (cCharAt3 != '/' || (i2 = i + 1) >= length) {
                return i;
            }
            char cCharAt4 = str.charAt(i2);
            if (cCharAt4 == '/') {
                int i3 = i + 2;
                while (i3 < length) {
                    char cCharAt5 = str.charAt(i3);
                    if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                        break;
                    }
                    i3++;
                }
                return i3;
            }
            if (cCharAt4 != '*') {
                return i;
            }
            int iIndexOf = str.indexOf("*/", i + 2);
            if (iIndexOf >= 0) {
                return iIndexOf + 2;
            }
        } else {
            int iIndexOf2 = str.indexOf("\"\"\"", i + 3);
            if (iIndexOf2 >= 0) {
                return iIndexOf2 + 3;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static int m4613Ujhhgtgfeyxiexzf(int i, String str) {
        int length = str.length();
        while (i < length) {
            while (i < length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            int iM4612Ujhhgtgfeyxiexzf = m4612Ujhhgtgfeyxiexzf(i, str);
            if (iM4612Ujhhgtgfeyxiexzf <= i || i + 1 >= length || str.charAt(i) != '/') {
                break;
            }
            i = iM4612Ujhhgtgfeyxiexzf;
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static int m4614Ujhhgtgfeyxiexzf(int i, String str) {
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m4615Ujhhgtgfeyxiexzf(int i, String str, String str2) {
        int i2;
        int length;
        return i >= 0 && str2.length() + i <= str.length() && str.regionMatches(i, str2, 0, str2.length()) && ((i2 = i + (-1)) < 0 || !Character.isJavaIdentifierPart(str.charAt(i2))) && ((length = str2.length() + i) >= str.length() || !Character.isJavaIdentifierPart(str.charAt(length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C3102Ujhhgtgfeyxiexzf m4616Ujhhgtgfeyxiexzf(int i, String str) {
        int iM4614Ujhhgtgfeyxiexzf;
        int i2;
        int iM4613Ujhhgtgfeyxiexzf;
        int iM4608Ujhhgtgfeyxiexzf;
        int iM4607Ujhhgtgfeyxiexzf;
        C3102Ujhhgtgfeyxiexzf c3102Ujhhgtgfeyxiexzf;
        char c;
        boolean z;
        boolean z2;
        char cCharAt;
        int iM4614Ujhhgtgfeyxiexzf2 = m4614Ujhhgtgfeyxiexzf(i - 1, str) + 1;
        int i3 = iM4614Ujhhgtgfeyxiexzf2;
        while (i3 > 0 && Character.isJavaIdentifierPart(str.charAt(i3 - 1))) {
            i3--;
        }
        if (i3 < iM4614Ujhhgtgfeyxiexzf2) {
            String strSubstring = str.substring(i3, iM4614Ujhhgtgfeyxiexzf2);
            boolean z3 = false;
            if (Character.isJavaIdentifierStart(strSubstring.charAt(0)) && !f9633Ujhhgtgfeyxiexzf.contains(strSubstring) && ((iM4614Ujhhgtgfeyxiexzf = m4614Ujhhgtgfeyxiexzf(i3 - 1, str)) < 0 || ((cCharAt = str.charAt(iM4614Ujhhgtgfeyxiexzf)) != '.' && cCharAt != ':' && cCharAt != '$'))) {
                char c2 = '(';
                char c3 = ')';
                int iM4607Ujhhgtgfeyxiexzf2 = m4607Ujhhgtgfeyxiexzf(str, i, '(', ')');
                if (iM4607Ujhhgtgfeyxiexzf2 >= 0 && (((iM4613Ujhhgtgfeyxiexzf = m4613Ujhhgtgfeyxiexzf((i2 = iM4607Ujhhgtgfeyxiexzf2 + 1), str)) >= str.length() || !str.startsWith("->", iM4613Ujhhgtgfeyxiexzf)) && (iM4608Ujhhgtgfeyxiexzf = m4608Ujhhgtgfeyxiexzf(i2, str)) >= 0 && (iM4607Ujhhgtgfeyxiexzf = m4607Ujhhgtgfeyxiexzf(str, iM4608Ujhhgtgfeyxiexzf, '{', '}')) >= 0)) {
                    String strSubstring2 = str.substring(i + 1, iM4607Ujhhgtgfeyxiexzf2);
                    C2567Ujhhgtgfeyxiexzf c2567Ujhhgtgfeyxiexzf = new C2567Ujhhgtgfeyxiexzf();
                    c2567Ujhhgtgfeyxiexzf.f8314Ujhhgtgfeyxiexzf = true;
                    if (!strSubstring2.trim().isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        int length = strSubstring2.length();
                        int i4 = 0;
                        int i5 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        int iMax3 = 0;
                        int iMax4 = 0;
                        c3102Ujhhgtgfeyxiexzf = null;
                        while (true) {
                            c = '[';
                            if (i5 >= length) {
                                break;
                            }
                            int iM4612Ujhhgtgfeyxiexzf = m4612Ujhhgtgfeyxiexzf(i5, strSubstring2);
                            if (iM4612Ujhhgtgfeyxiexzf > i5) {
                                i5 = iM4612Ujhhgtgfeyxiexzf;
                            } else {
                                char cCharAt2 = strSubstring2.charAt(i5);
                                if (cCharAt2 == '(') {
                                    iMax++;
                                } else if (cCharAt2 == ')') {
                                    iMax = Math.max(0, iMax - 1);
                                } else if (cCharAt2 == '[') {
                                    iMax2++;
                                } else if (cCharAt2 == ']') {
                                    iMax2 = Math.max(0, iMax2 - 1);
                                } else if (cCharAt2 == '{') {
                                    iMax3++;
                                } else if (cCharAt2 == '}') {
                                    iMax3 = Math.max(0, iMax3 - 1);
                                } else if (cCharAt2 == '<') {
                                    iMax4++;
                                } else if (cCharAt2 == '>') {
                                    iMax4 = Math.max(0, iMax4 - 1);
                                } else if (cCharAt2 == ',' && iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                                    arrayList.add(strSubstring2.substring(i4, i5));
                                    i4 = i5 + 1;
                                }
                                i5++;
                            }
                        }
                        arrayList.add(strSubstring2.substring(i4));
                        boolean z4 = false;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                z = z3;
                                c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf = true;
                                if (!c2567Ujhhgtgfeyxiexzf.f8313Ujhhgtgfeyxiexzf) {
                                    c2567Ujhhgtgfeyxiexzf.f8314Ujhhgtgfeyxiexzf = true;
                                    break;
                                }
                                break;
                            }
                            ?? Trim = ((String) arrayList.get(i6)).trim();
                            if (Trim.isEmpty()) {
                                c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf = z3;
                                z = z3;
                                break;
                            }
                            int length2 = Trim.length();
                            ?? r15 = z3;
                            int iMax5 = r15 == true ? 1 : 0;
                            int iMax6 = iMax5 == true ? 1 : 0;
                            int iMax7 = iMax6 == true ? 1 : 0;
                            int iMax8 = iMax7 == true ? 1 : 0;
                            while (true) {
                                if (r15 >= length2) {
                                    r15 = -1;
                                    break;
                                }
                                int iM4612Ujhhgtgfeyxiexzf2 = m4612Ujhhgtgfeyxiexzf(r15, Trim);
                                if (iM4612Ujhhgtgfeyxiexzf2 > r15) {
                                    r15 = iM4612Ujhhgtgfeyxiexzf2;
                                } else {
                                    char cCharAt3 = Trim.charAt(r15);
                                    if (cCharAt3 == c2) {
                                        iMax5++;
                                    } else if (cCharAt3 == c3) {
                                        iMax5 = Math.max(z3 ? 1 : 0, iMax5 - 1);
                                    } else if (cCharAt3 == c) {
                                        iMax6++;
                                    } else if (cCharAt3 == ']') {
                                        iMax6 = Math.max(z3 ? 1 : 0, iMax6 - 1);
                                    } else if (cCharAt3 == '{') {
                                        iMax7++;
                                    } else if (cCharAt3 == '}') {
                                        iMax7 = Math.max(z3 ? 1 : 0, iMax7 - 1);
                                    } else if (cCharAt3 == '<') {
                                        iMax8++;
                                    } else if (cCharAt3 == '>') {
                                        iMax8 = Math.max(z3 ? 1 : 0, iMax8 - 1);
                                    } else {
                                        if (cCharAt3 == '=' && iMax5 == 0 && iMax6 == 0 && iMax7 == 0 && iMax8 == 0) {
                                            char cCharAt4 = r15 > 0 ? Trim.charAt(r15 - 1) : z3 ? 1 : 0;
                                            int i7 = r15 + 1;
                                            char cCharAt5 = i7 < length2 ? Trim.charAt(i7) : z3 ? 1 : 0;
                                            if (cCharAt4 != '=' && cCharAt4 != '!' && cCharAt4 != '<') {
                                                if (cCharAt4 != '>' && cCharAt5 != '=') {
                                                    break;
                                                }
                                            }
                                            r15 = i7;
                                        }
                                        z3 = false;
                                        c2 = '(';
                                        c3 = ')';
                                        c = '[';
                                    }
                                    r15++;
                                    z3 = false;
                                    c2 = '(';
                                    c3 = ')';
                                    c = '[';
                                }
                            }
                            String strTrim = (r15 >= 0 ? Trim.substring(0, r15) : Trim).trim();
                            String strSubstring3 = r15 >= 0 ? Trim.substring(r15 + 1) : null;
                            if (strSubstring3 != null) {
                                strSubstring3 = strSubstring3.trim();
                                if (strSubstring3.isEmpty()) {
                                    z = false;
                                    c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf = false;
                                    break;
                                }
                                z = false;
                                c2567Ujhhgtgfeyxiexzf.f8313Ujhhgtgfeyxiexzf = true;
                                z2 = true;
                            } else {
                                z = false;
                                z = false;
                                if (z4) {
                                    c2567Ujhhgtgfeyxiexzf.f8314Ujhhgtgfeyxiexzf = false;
                                    z2 = z4;
                                } else {
                                    c2567Ujhhgtgfeyxiexzf.f8315Ujhhgtgfeyxiexzf++;
                                    z2 = z4;
                                }
                            }
                            String strM4606Ujhhgtgfeyxiexzf = m4606Ujhhgtgfeyxiexzf(strTrim);
                            if (strM4606Ujhhgtgfeyxiexzf == null) {
                                c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf = z;
                                break;
                            }
                            ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8316Ujhhgtgfeyxiexzf).add(strTrim);
                            ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8317Ujhhgtgfeyxiexzf).add(strM4606Ujhhgtgfeyxiexzf);
                            ((ArrayList) c2567Ujhhgtgfeyxiexzf.f8318Ujhhgtgfeyxiexzf).add(strSubstring3);
                            i6++;
                            z3 = z ? 1 : 0;
                            c2 = '(';
                            c3 = ')';
                            c = '[';
                            z4 = z2;
                        }
                    } else {
                        c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf = true;
                        z = false;
                        c3102Ujhhgtgfeyxiexzf = null;
                    }
                    if (!c2567Ujhhgtgfeyxiexzf.f8312Ujhhgtgfeyxiexzf) {
                        return c3102Ujhhgtgfeyxiexzf;
                    }
                    loop1: while (i3 > 0) {
                        char cCharAt6 = str.charAt(i3 - 1);
                        if (cCharAt6 == ';' || cCharAt6 == '{' || cCharAt6 == '}') {
                            break;
                        }
                        if (cCharAt6 == '\n' || cCharAt6 == '\r') {
                            int i8 = i3;
                            while (i8 > 0) {
                                char cCharAt7 = str.charAt(i8 - 1);
                                if (cCharAt7 == '\n' || cCharAt7 == '\r') {
                                    break;
                                }
                                i8--;
                            }
                            String strTrim2 = str.substring(i8, i3).trim();
                            if (strTrim2.isEmpty()) {
                                break;
                            }
                            if (strTrim2.startsWith("@")) {
                                continue;
                            } else {
                                if (strTrim2.startsWith("//") || strTrim2.startsWith("/*") || strTrim2.startsWith("*")) {
                                    break;
                                }
                                String[] strArrSplit = strTrim2.split("\\s+");
                                if (strArrSplit.length == 0) {
                                    break;
                                }
                                int length3 = strArrSplit.length;
                                for (?? r6 = z; r6 < length3; r6++) {
                                    String str2 = strArrSplit[r6];
                                    if (!str2.isEmpty() && !f9634Ujhhgtgfeyxiexzf.contains(str2)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        i3--;
                    }
                    C3102Ujhhgtgfeyxiexzf c3102Ujhhgtgfeyxiexzf2 = new C3102Ujhhgtgfeyxiexzf();
                    c3102Ujhhgtgfeyxiexzf2.f9645Ujhhgtgfeyxiexzf = i3;
                    c3102Ujhhgtgfeyxiexzf2.f9646Ujhhgtgfeyxiexzf = iM4607Ujhhgtgfeyxiexzf + 1;
                    c3102Ujhhgtgfeyxiexzf2.f9647Ujhhgtgfeyxiexzf = strSubstring;
                    c3102Ujhhgtgfeyxiexzf2.f9648Ujhhgtgfeyxiexzf = c2567Ujhhgtgfeyxiexzf;
                    return c3102Ujhhgtgfeyxiexzf2;
                }
            }
        }
        return null;
    }
}
