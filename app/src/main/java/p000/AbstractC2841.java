package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2841 extends AbstractC2849 {
    public static boolean m4828(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m4834(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m4832(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean m4829(CharSequence charSequence, char c) {
        return m4833(c, 0, 2, charSequence) >= 0;
    }

    public static int m4830(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final int m4831(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m4832(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int m4832(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1661 c1661;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM4830 = m4830(charSequence);
            if (i3 > iM4830) {
                i3 = iM4830;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c1661 = new C1661(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c1661 = new C1664(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c1661.f5614;
        int i6 = c1661.f5613;
        int i7 = c1661.f5612;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(true, 0, str2, i8, length2))) {
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
            while (!m4840(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int m4833(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m4835(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int m4834(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m4831(charSequence, str, i, z);
    }

    public static final int m4835(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = 1;
            if (false) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (false) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM4830 = m4830(charSequence);
        if (i > iM4830) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC3681.m5324(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM4830) {
                return -1;
            }
            i++;
        }
    }

    public static boolean m4836(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC3681.m5332(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int m4837(int i, String str, String str2) {
        int iM4830 = (i & 2) != 0 ? m4830(str) : 0;
        return str == null ? m4832(str, str2, 0, 0, false, true) : str.lastIndexOf(str2, iM4830);
    }

    public static int m4838(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m4830(str);
        }
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (false) {
            return str.lastIndexOf(cArr[0], i);
        }
        int iM4830 = m4830(str);
        if (i > iM4830) {
            i = iM4830;
        }
        while (-1 < i) {
            if (AbstractC3681.m5324(cArr[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final List m4839(String str) {
        C1792 c1792 = new C1792(str);
        if (!c1792.hasNext()) {
            return C1189.f4329;
        }
        Object next = c1792.next();
        if (!c1792.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c1792.hasNext()) {
            arrayList.add(c1792.next());
        }
        return arrayList;
    }

    public static final boolean m4840(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC3681.m5324(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final List m4841(CharSequence charSequence, String str) {
        int iM4831 = m4831(charSequence, str, 0, false);
        if (iM4831 == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM4831).toString());
            length = str.length() + iM4831;
            iM4831 = m4831(charSequence, str, length, false);
        } while (iM4831 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List m4842(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return m4841(charSequence, String.valueOf(cArr[0]));
        }
        C1630 c1630 = new C1630(1, new C1009(charSequence, new C2450(1, cArr), 0));
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(c1630, 10));
        Iterator it = c1630.iterator();
        while (true) {
            C1008 c1008 = (C1008) it;
            if (!c1008.hasNext()) {
                return arrayList;
            }
            C1664 c1664 = (C1664) c1008.next();
            arrayList.add(charSequence.subSequence(c1664.f5612, c1664.f5613 + 1).toString());
        }
    }

    public static List m4843(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m4841(str, str2);
            }
        }
        C1630 c1630 = new C1630(1, new C1009(str, new C2450(2, Arrays.asList(strArr)), 0));
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(c1630, 10));
        Iterator it = c1630.iterator();
        while (true) {
            C1008 c1008 = (C1008) it;
            if (!c1008.hasNext()) {
                return arrayList;
            }
            C1664 c1664 = (C1664) c1008.next();
            arrayList.add(str.subSequence(c1664.f5612, c1664.f5613 + 1).toString());
        }
    }

    public static String m4844(String str, String str2, String str3) {
        int iM4834 = m4834(str, str2, 0, false, 6);
        return iM4834 == -1 ? str3 : str.substring(str2.length() + iM4834, str.length());
    }

    public static String m4845(String str, String str2) {
        int iM4834 = m4834(str, str2, 0, false, 6);
        return iM4834 == -1 ? str : str.substring(0, iM4834);
    }

    public static String m4846(String str, String str2) {
        int iM4837 = m4837(6, str, str2);
        return iM4837 == -1 ? str : str.substring(0, iM4837);
    }

    public static String m4847(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence m4848(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM5332 = AbstractC3681.m5332(str.charAt(!z ? i : length));
            if (z) {
                if (!zM5332) {
                    break;
                }
                length--;
            } else if (zM5332) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
