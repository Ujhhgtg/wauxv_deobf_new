package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛲᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106feyxiexzfUjhhgtg extends AbstractC3612feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Set m2575Ujhhgtgfeyxiexzf(Set set, Set set2) {
        if (set2.isEmpty()) {
            return AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(set);
        }
        if (!(set2 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(set2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!set2.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }
}
