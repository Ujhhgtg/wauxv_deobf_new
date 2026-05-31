package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲁᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0983 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final HashSet f3606 = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final HashSet f3607 = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m2649(String str) {
        int iM2657 = m2657(str.length() - 1, str);
        if (iM2657 < 0) {
            return null;
        }
        while (iM2657 >= 1 && str.charAt(iM2657) == ']' && str.charAt(iM2657 - 1) == '[') {
            iM2657 = m2657(iM2657 - 2, str);
        }
        if (iM2657 < 0) {
            return null;
        }
        int i = iM2657 + 1;
        while (iM2657 >= 0 && Character.isJavaIdentifierPart(str.charAt(iM2657))) {
            iM2657--;
        }
        int i2 = iM2657 + 1;
        if (i2 >= i) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        if (Character.isJavaIdentifierStart(strSubstring.charAt(0))) {
            return strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m2650(String str, int i, char c, char c2) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int iM2655 = m2655(i, str);
            if (iM2655 > i) {
                i = iM2655 - 1;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m2651(int i, String str) {
        int iM2656 = m2656(i, str);
        if (iM2656 < str.length()) {
            if (m2658(iM2656, str, "throws")) {
                int iM2657 = m2656(iM2656, str);
                if (m2658(iM2657, str, "throws")) {
                    iM2657 += 6;
                    int length = str.length();
                    loop0: while (true) {
                        boolean z = true;
                        while (true) {
                            if (iM2657 < length) {
                                iM2657 = m2656(iM2657, str);
                                if (iM2657 < length) {
                                    char cCharAt = str.charAt(iM2657);
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
                                                    iM2657++;
                                                    if (iM2657 >= length) {
                                                        break;
                                                    }
                                                    char cCharAt2 = str.charAt(iM2657);
                                                    if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.' && cCharAt2 != '$') {
                                                        break;
                                                    }
                                                }
                                                z = false;
                                            }
                                        } else if (cCharAt == ',') {
                                            iM2657++;
                                        }
                                    }
                                }
                            }
                            iM2657 = -1;
                            break loop0;
                        }
                    }
                }
                if (iM2657 >= 0) {
                    iM2656 = m2656(iM2657, str);
                    if (iM2656 >= str.length() && str.charAt(iM2656) == '{') {
                        return iM2656;
                    }
                }
            } else if (iM2656 >= str.length()) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m2652(ArrayList arrayList, int i) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static String m2653(String str, ArrayList arrayList, int i) {
        String strM2654;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            String str2 = (String) arrayList.get(i2);
            String strM2649 = m2649(str2);
            if (strM2649 == null) {
                strM2654 = m2654(str2);
            } else {
                int iM2657 = m2657(str2.length() - 1, str2);
                while (iM2657 >= 1 && str2.charAt(iM2657) == ']' && str2.charAt(iM2657 - 1) == '[') {
                    iM2657 = m2657(iM2657 - 2, str2);
                }
                int i3 = -1;
                if (iM2657 >= 0) {
                    int i4 = iM2657 + 1;
                    while (iM2657 >= 0 && Character.isJavaIdentifierPart(str2.charAt(iM2657))) {
                        iM2657--;
                    }
                    int i5 = iM2657 + 1;
                    if (i5 < i4 && strM2649.equals(str2.substring(i5, i4))) {
                        i3 = i5;
                    }
                }
                strM2654 = i3 < 0 ? m2654(str2) : m2654(str2.substring(0, i3) + str2.substring(strM2649.length() + i3));
            }
            sb.append(strM2654);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static String m2654(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int iM2656 = 0;
        while (iM2656 < length) {
            int iM2655 = m2655(iM2656, str);
            if (iM2655 <= iM2656) {
                char cCharAt = str.charAt(iM2656);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        int i = iM2656 + 1;
                        iM2655 = str.length();
                        while (i < iM2655) {
                            char cCharAt2 = str.charAt(i);
                            if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.') {
                                break;
                            }
                            i++;
                        }
                        iM2656 = m2656(i, str);
                        if (iM2656 < iM2655 && str.charAt(iM2656) == '(') {
                            iM2656 = m2650(str, iM2656, '(', ')');
                            if (iM2656 < 0) {
                            }
                        }
                    } else if (m2658(iM2656, str, "final")) {
                        iM2656 += 5;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                iM2656++;
            }
            iM2656 = iM2655;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m2655(int i, String str) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static int m2656(int i, String str) {
        int length = str.length();
        while (i < length) {
            while (i < length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            int iM2655 = m2655(i, str);
            if (iM2655 <= i || i + 1 >= length || str.charAt(i) != '/') {
                break;
            }
            i = iM2655;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static int m2657(int i, String str) {
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static boolean m2658(int i, String str, String str2) {
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static C0982 m2659(int i, String str) {
        int iM2657;
        int i2;
        int iM2656;
        int iM2651;
        int iM2650;
        C0982 c0982;
        char c;
        boolean z;
        boolean z2;
        char cCharAt;
        int iM2658 = m2657(i - 1, str) + 1;
        int i3 = iM2658;
        while (i3 > 0 && Character.isJavaIdentifierPart(str.charAt(i3 - 1))) {
            i3--;
        }
        if (i3 < iM2658) {
            String strSubstring = str.substring(i3, iM2658);
            boolean z3 = false;
            if (Character.isJavaIdentifierStart(strSubstring.charAt(0)) && !f3606.contains(strSubstring) && ((iM2657 = m2657(i3 - 1, str)) < 0 || ((cCharAt = str.charAt(iM2657)) != '.' && cCharAt != ':' && cCharAt != '$'))) {
                char c2 = '(';
                char c3 = ')';
                int iM2652 = m2650(str, i, '(', ')');
                if (iM2652 >= 0 && (((iM2656 = m2656((i2 = iM2652 + 1), str)) >= str.length() || !str.startsWith("->", iM2656)) && (iM2651 = m2651(i2, str)) >= 0 && (iM2650 = m2650(str, iM2651, '{', '}')) >= 0)) {
                    String strSubstring2 = str.substring(i + 1, iM2652);
                    C0449 c0449 = new C0449();
                    c0449.f2050 = true;
                    if (!strSubstring2.trim().isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        int length = strSubstring2.length();
                        int i4 = 0;
                        int i5 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        int iMax3 = 0;
                        int iMax4 = 0;
                        c0982 = null;
                        while (true) {
                            c = '[';
                            if (i5 >= length) {
                                break;
                            }
                            int iM2655 = m2655(i5, strSubstring2);
                            if (iM2655 > i5) {
                                i5 = iM2655;
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
                                c0449.f2048 = true;
                                if (!c0449.f2049) {
                                    c0449.f2050 = true;
                                    break;
                                }
                                break;
                            }
                            ?? Trim = ((String) arrayList.get(i6)).trim();
                            if (Trim.isEmpty()) {
                                c0449.f2048 = z3;
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
                                int iM2659 = m2655(r15, Trim);
                                if (iM2659 > r15) {
                                    r15 = iM2659;
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
                                    c0449.f2048 = false;
                                    break;
                                }
                                z = false;
                                c0449.f2049 = true;
                                z2 = true;
                            } else {
                                z = false;
                                z = false;
                                if (z4) {
                                    c0449.f2050 = false;
                                    z2 = z4;
                                } else {
                                    c0449.f2051++;
                                    z2 = z4;
                                }
                            }
                            String strM2649 = m2649(strTrim);
                            if (strM2649 == null) {
                                c0449.f2048 = z;
                                break;
                            }
                            ((ArrayList) c0449.f2052).add(strTrim);
                            ((ArrayList) c0449.f2053).add(strM2649);
                            ((ArrayList) c0449.f2054).add(strSubstring3);
                            i6++;
                            z3 = z ? 1 : 0;
                            c2 = '(';
                            c3 = ')';
                            c = '[';
                            z4 = z2;
                        }
                    } else {
                        c0449.f2048 = true;
                        z = false;
                        c0982 = null;
                    }
                    if (!c0449.f2048) {
                        return c0982;
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
                                    if (!str2.isEmpty() && !f3607.contains(str2)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        i3--;
                    }
                    C0982 c0983 = new C0982();
                    c0983.f3602 = i3;
                    c0983.f3603 = iM2650 + 1;
                    c0983.f3604 = strSubstring;
                    c0983.f3605 = c0449;
                    return c0983;
                }
            }
        }
        return null;
    }
}
