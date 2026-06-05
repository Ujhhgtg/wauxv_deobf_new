package p000;

import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212Ujhhgtgfeyxiexzf extends AbstractC1961feyxiexzfUjhhgtg {
    @Override // p000.AbstractC1961feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo1298Ujhhgtgfeyxiexzf() {
        if (mo1505Ujhhgtgfeyxiexzf().size() <= 65536) {
            Iterator it = mo1505Ujhhgtgfeyxiexzf().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((AbstractC0211Ujhhgtgfeyxiexzf) it.next()).m1911Ujhhgtgfeyxiexzf(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo1505Ujhhgtgfeyxiexzf().iterator();
        while (it2.hasNext()) {
            String str = ((AbstractC0211Ujhhgtgfeyxiexzf) it2.next()).f3017Ujhhgtgfeyxiexzf.m4540Ujhhgtgfeyxiexzf().f9450Ujhhgtgfeyxiexzf;
            int iLastIndexOf = str.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : str.substring(str.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C0392Ujhhgtgfeyxiexzf ? "method" : "field", Integer.valueOf(mo1505Ujhhgtgfeyxiexzf().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            throw new C3269feyxiexzfUjhhgtg(formatter.toString(), null);
        } finally {
            formatter.close();
        }
    }
}
