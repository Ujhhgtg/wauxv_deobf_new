package p000;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0178 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final HashSet f1269 = new HashSet(Arrays.asList("gt", "lt", "lteq", "gteq", "or", "and", "bitwise_and", "bitwise_or", "bitwise_xor", "mod", "pow", "left_shift", "right_shift", "right_unsigned_shift", "and_assign", "or_assign", "xor_assign", "mod_assign", "pow_assign", "left_shift_assign", "right_shift_assign", "right_unsigned_shift_assign"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m1365(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m1366(int i, String str) {
        int i2;
        int length = str.length();
        if (i < length) {
            char cCharAt = str.charAt(i);
            int i3 = -1;
            if (cCharAt == '\"') {
                if (m1365(i, str)) {
                    for (int i4 = i + 3; i4 + 2 < str.length(); i4++) {
                        if (m1365(i4, str)) {
                            i3 = i4;
                            break;
                        }
                    }
                    if (i3 >= 0) {
                        return i3 + 3;
                    }
                } else {
                    while (true) {
                        i++;
                        if (i >= str.length()) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 != '\\') {
                            if (cCharAt2 == '\"') {
                                i3 = i;
                                break;
                            }
                        } else {
                            i++;
                        }
                    }
                    if (i3 >= 0) {
                        return i3 + 1;
                    }
                }
            } else if (cCharAt == '\'') {
                while (true) {
                    i++;
                    if (i >= str.length()) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i);
                    if (cCharAt3 != '\\') {
                        if (cCharAt3 == '\'') {
                            i3 = i;
                            break;
                        }
                        if (cCharAt3 == '\n' || cCharAt3 == '\r') {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
                if (i3 >= 0) {
                    return i3 + 1;
                }
            } else if (cCharAt == '/' && (i2 = i + 1) < length) {
                char cCharAt4 = str.charAt(i2);
                if (cCharAt4 == '/') {
                    int i5 = i + 2;
                    while (i5 < length && str.charAt(i5) != '\n' && str.charAt(i5) != '\r') {
                        i5++;
                    }
                    return i5;
                }
                if (cCharAt4 == '*') {
                    int i6 = i + 2;
                    while (true) {
                        int i7 = i6 + 1;
                        if (i7 >= str.length()) {
                            break;
                        }
                        if (str.charAt(i6) == '*' && str.charAt(i7) == '/') {
                            i3 = i6;
                            break;
                        }
                        i6 = i7;
                    }
                    if (i3 >= 0) {
                        return i3 + 2;
                    }
                }
            }
            return length;
        }
        return i;
    }
}
