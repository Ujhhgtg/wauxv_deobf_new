package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤞᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2901 extends AbstractC2909 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static boolean m4861(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m4867(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m4865(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static boolean m4862(CharSequence charSequence, char c) {
        return m4866(c, 0, 2, charSequence) >= 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static int m4863(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static final int m4864(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m4865(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static final int m4865(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C1677 c1677;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM4863 = m4863(charSequence);
            if (i3 > iM4863) {
                i3 = iM4863;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c1677 = new C1677(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c1677 = new C1679(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c1677.f5652;
        int i6 = c1677.f5651;
        int i7 = c1677.f5650;
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
            while (!m4873(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static int m4866(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m4868(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static /* synthetic */ int m4867(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m4864(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static final int m4868(CharSequence charSequence, char[] cArr, int i, boolean z) {
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
        int iM4863 = m4863(charSequence);
        if (i > iM4863) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC2727.m4699(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM4863) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public static boolean m4869(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC2727.m4704(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public static int m4870(int i, String str, String str2) {
        int iM4863 = (i & 2) != 0 ? m4863(str) : 0;
        return str == null ? m4865(str, str2, iM4863, 0, false, true) : str.lastIndexOf(str2, iM4863);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public static int m4871(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m4863(str);
        }
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (str != null) {
            return str.lastIndexOf(cArr[0], i);
        }
        int iM4863 = m4863(str);
        if (i > iM4863) {
            i = iM4863;
        }
        while (-1 < i) {
            if (AbstractC2727.m4699(cArr[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static final List m4872(String str) {
        C1815 c1815 = new C1815(str);
        if (!c1815.hasNext()) {
            return C1191.f4326;
        }
        Object next = c1815.next();
        if (!c1815.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c1815.hasNext()) {
            arrayList.add(c1815.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public static final boolean m4873(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC2727.m4699(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public static final List m4874(CharSequence charSequence, String str) {
        int iM4864 = m4864(charSequence, str, 0, false);
        if (iM4864 == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM4864).toString());
            length = str.length() + iM4864;
            iM4864 = m4864(charSequence, str, length, false);
        } while (iM4864 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public static List m4875(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return m4874(charSequence, String.valueOf(cArr[0]));
        }
        C1643 c1643 = new C1643(new C1012(charSequence, new C2501(cArr, 1), 0), 1);
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(c1643, 10));
        Iterator it = c1643.iterator();
        while (true) {
            C1011 c1011 = (C1011) it;
            if (!c1011.hasNext()) {
                return arrayList;
            }
            C1679 c1679 = (C1679) c1011.next();
            arrayList.add(charSequence.subSequence(c1679.f5650, c1679.f5651 + 1).toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public static List m4876(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m4874(str, str2);
            }
        }
        C1643 c1643 = new C1643(new C1012(str, new C2501(Arrays.asList(strArr), 2), 0), 1);
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(c1643, 10));
        Iterator it = c1643.iterator();
        while (true) {
            C1011 c1011 = (C1011) it;
            if (!c1011.hasNext()) {
                return arrayList;
            }
            C1679 c1679 = (C1679) c1011.next();
            arrayList.add(str.subSequence(c1679.f5650, c1679.f5651 + 1).toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public static String m4877(String str, String str2, String str3) {
        int iM4867 = m4867(str, str2, 0, false, 6);
        return iM4867 == -1 ? str3 : str.substring(str2.length() + iM4867, str.length());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public static String m4878(String str, String str2) {
        int iM4870 = m4870(6, str, str2);
        return iM4870 == -1 ? str : str.substring(str2.length() + iM4870, str.length());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public static String m4879(String str, String str2) {
        int iM4867 = m4867(str, str2, 0, false, 6);
        return iM4867 == -1 ? str : str.substring(0, iM4867);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public static String m4880(String str, String str2) {
        int iM4870 = m4870(6, str, str2);
        return iM4870 == -1 ? str : str.substring(0, iM4870);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public static String m4881(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2795(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public static CharSequence m4882(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM4704 = AbstractC2727.m4704(str.charAt(!z ? i : length));
            if (z) {
                if (!zM4704) {
                    break;
                }
                length--;
            } else if (zM4704) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
