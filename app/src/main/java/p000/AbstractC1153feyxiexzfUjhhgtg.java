package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153feyxiexzfUjhhgtg extends AbstractC3590Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static String m2645feyxiexzfUjhhgtg(String str) {
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM2634feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2634feyxiexzfUjhhgtg(str);
        int length = str.length();
        listM2634feyxiexzfUjhhgtg.size();
        int iM4191Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(listM2634feyxiexzfUjhhgtg);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM2634feyxiexzfUjhhgtg) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM4191Ujhhgtgfeyxiexzf) || !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC0217Ujhhgtgfeyxiexzf.m1332feyxiexzfUjhhgtg(str2.charAt(i3))) {
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
        AbstractC2856feyxiexzfUjhhgtg.m4241feyxiexzfUjhhgtg(arrayList, sb, "\n", "", "", null);
        return sb.toString();
    }
}
