package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152feyxiexzfUjhhgtg extends AbstractC1192feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static boolean m2623feyxiexzfUjhhgtg(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m2629feyxiexzfUjhhgtg(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m2627feyxiexzfUjhhgtg(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static boolean m2624feyxiexzfUjhhgtg(CharSequence charSequence, char c) {
        return m2628feyxiexzfUjhhgtg(c, 0, 2, charSequence) >= 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static int m2625feyxiexzfUjhhgtg(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static final int m2626feyxiexzfUjhhgtg(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m2627feyxiexzfUjhhgtg(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final int m2627feyxiexzfUjhhgtg(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0680Ujhhgtgfeyxiexzf c0680Ujhhgtgfeyxiexzf;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM2625feyxiexzfUjhhgtg = m2625feyxiexzfUjhhgtg(charSequence);
            if (i3 > iM2625feyxiexzfUjhhgtg) {
                i3 = iM2625feyxiexzfUjhhgtg;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c0680Ujhhgtgfeyxiexzf = new C0680Ujhhgtgfeyxiexzf(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c0680Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c0680Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf;
        int i6 = c0680Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
        int i7 = c0680Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m2635feyxiexzfUjhhgtg(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static int m2628feyxiexzfUjhhgtg(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m2630feyxiexzfUjhhgtg(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static /* synthetic */ int m2629feyxiexzfUjhhgtg(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m2626feyxiexzfUjhhgtg(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final int m2630feyxiexzfUjhhgtg(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM2625feyxiexzfUjhhgtg = m2625feyxiexzfUjhhgtg(charSequence);
        if (i > iM2625feyxiexzfUjhhgtg) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC0217Ujhhgtgfeyxiexzf.m1320Ujhhgtgfeyxiexzf(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM2625feyxiexzfUjhhgtg) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static boolean m2631feyxiexzfUjhhgtg(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC0217Ujhhgtgfeyxiexzf.m1332feyxiexzfUjhhgtg(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static int m2632feyxiexzfUjhhgtg(int i, String str, String str2) {
        int iM2625feyxiexzfUjhhgtg = (i & 2) != 0 ? m2625feyxiexzfUjhhgtg(str) : 0;
        return str == null ? m2627feyxiexzfUjhhgtg(str, str2, iM2625feyxiexzfUjhhgtg, 0, false, true) : str.lastIndexOf(str2, iM2625feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static int m2633feyxiexzfUjhhgtg(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m2625feyxiexzfUjhhgtg(str);
        }
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (str != null) {
            return str.lastIndexOf(cArr[0], i);
        }
        int iM2625feyxiexzfUjhhgtg = m2625feyxiexzfUjhhgtg(str);
        if (i > iM2625feyxiexzfUjhhgtg) {
            i = iM2625feyxiexzfUjhhgtg;
        }
        while (-1 < i) {
            if (AbstractC0217Ujhhgtgfeyxiexzf.m1320Ujhhgtgfeyxiexzf(cArr[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final List m2634feyxiexzfUjhhgtg(String str) {
        C0071Ujhhgtgfeyxiexzf c0071Ujhhgtgfeyxiexzf = new C0071Ujhhgtgfeyxiexzf(str);
        if (!c0071Ujhhgtgfeyxiexzf.hasNext()) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        Object next = c0071Ujhhgtgfeyxiexzf.next();
        if (!c0071Ujhhgtgfeyxiexzf.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c0071Ujhhgtgfeyxiexzf.hasNext()) {
            arrayList.add(c0071Ujhhgtgfeyxiexzf.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static final boolean m2635feyxiexzfUjhhgtg(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0217Ujhhgtgfeyxiexzf.m1320Ujhhgtgfeyxiexzf(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final List m2636feyxiexzfUjhhgtg(CharSequence charSequence, String str) {
        int iM2626feyxiexzfUjhhgtg = m2626feyxiexzfUjhhgtg(charSequence, str, 0, false);
        if (iM2626feyxiexzfUjhhgtg == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM2626feyxiexzfUjhhgtg).toString());
            length = str.length() + iM2626feyxiexzfUjhhgtg;
            iM2626feyxiexzfUjhhgtg = m2626feyxiexzfUjhhgtg(charSequence, str, length, false);
        } while (iM2626feyxiexzfUjhhgtg != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static List m2637Ujhhgtgfeyxiexzf(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return m2636feyxiexzfUjhhgtg(charSequence, String.valueOf(cArr[0]));
        }
        C0646Ujhhgtgfeyxiexzf c0646Ujhhgtgfeyxiexzf = new C0646Ujhhgtgfeyxiexzf(1, new C3254feyxiexzfUjhhgtg(charSequence, new C0784feyxiexzfUjhhgtg(1, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(c0646Ujhhgtgfeyxiexzf, 10));
        Iterator it = c0646Ujhhgtgfeyxiexzf.iterator();
        while (true) {
            C3253feyxiexzfUjhhgtg c3253feyxiexzfUjhhgtg = (C3253feyxiexzfUjhhgtg) it;
            if (!c3253feyxiexzfUjhhgtg.hasNext()) {
                return arrayList;
            }
            C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = (C0682Ujhhgtgfeyxiexzf) c3253feyxiexzfUjhhgtg.next();
            arrayList.add(charSequence.subSequence(c0682Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf, c0682Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf + 1).toString());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static List m2638Ujhhgtgfeyxiexzf(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m2636feyxiexzfUjhhgtg(str, str2);
            }
        }
        C0646Ujhhgtgfeyxiexzf c0646Ujhhgtgfeyxiexzf = new C0646Ujhhgtgfeyxiexzf(1, new C3254feyxiexzfUjhhgtg(str, new C0784feyxiexzfUjhhgtg(2, Arrays.asList(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(c0646Ujhhgtgfeyxiexzf, 10));
        Iterator it = c0646Ujhhgtgfeyxiexzf.iterator();
        while (true) {
            C3253feyxiexzfUjhhgtg c3253feyxiexzfUjhhgtg = (C3253feyxiexzfUjhhgtg) it;
            if (!c3253feyxiexzfUjhhgtg.hasNext()) {
                return arrayList;
            }
            C0682Ujhhgtgfeyxiexzf c0682Ujhhgtgfeyxiexzf = (C0682Ujhhgtgfeyxiexzf) c3253feyxiexzfUjhhgtg.next();
            arrayList.add(str.subSequence(c0682Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf, c0682Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf + 1).toString());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m2639Ujhhgtgfeyxiexzf(String str, String str2, String str3) {
        int iM2629feyxiexzfUjhhgtg = m2629feyxiexzfUjhhgtg(str, str2, 0, false, 6);
        return iM2629feyxiexzfUjhhgtg == -1 ? str3 : str.substring(str2.length() + iM2629feyxiexzfUjhhgtg, str.length());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m2640Ujhhgtgfeyxiexzf(String str, String str2) {
        int iM2632feyxiexzfUjhhgtg = m2632feyxiexzfUjhhgtg(6, str, str2);
        return iM2632feyxiexzfUjhhgtg == -1 ? str : str.substring(str2.length() + iM2632feyxiexzfUjhhgtg, str.length());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static String m2641Ujhhgtgfeyxiexzf(String str, String str2) {
        int iM2629feyxiexzfUjhhgtg = m2629feyxiexzfUjhhgtg(str, str2, 0, false, 6);
        return iM2629feyxiexzfUjhhgtg == -1 ? str : str.substring(0, iM2629feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m2642Ujhhgtgfeyxiexzf(String str, String str2) {
        int iM2632feyxiexzfUjhhgtg = m2632feyxiexzfUjhhgtg(6, str, str2);
        return iM2632feyxiexzfUjhhgtg == -1 ? str : str.substring(0, iM2632feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static String m2643feyxiexzfUjhhgtg(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static CharSequence m2644feyxiexzfUjhhgtg(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM1332feyxiexzfUjhhgtg = AbstractC0217Ujhhgtgfeyxiexzf.m1332feyxiexzfUjhhgtg(str.charAt(!z ? i : length));
            if (z) {
                if (!zM1332feyxiexzfUjhhgtg) {
                    break;
                }
                length--;
            } else if (zM1332feyxiexzfUjhhgtg) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
