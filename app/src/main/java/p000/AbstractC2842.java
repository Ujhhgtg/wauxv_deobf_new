package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᤞᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2842 extends AbstractC2203 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static String m4849(String str) {
        if (AbstractC2841.m4836("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM4839 = AbstractC2841.m4839(str);
        int length = str.length();
        listM4839.size();
        int iM2211 = AbstractC0745.m2211(listM4839);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM4839) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC0745.m2213();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM2211) || !AbstractC2841.m4836(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC3681.m5332(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0744.m2194(arrayList, sb, "\n", "", "", null);
        return sb.toString();
    }
}
