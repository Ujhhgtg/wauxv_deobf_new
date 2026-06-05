package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ能不能ᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0202Ujhhgtgfeyxiexzf extends AbstractC1937feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m1279Ujhhgtgfeyxiexzf(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static int m1280Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static Map m1281Ujhhgtgfeyxiexzf(C1381feyxiexzfUjhhgtg... c1381feyxiexzfUjhhgtgArr) {
        if (c1381feyxiexzfUjhhgtgArr.length <= 0) {
            return C3308feyxiexzfUjhhgtg.f10345Ujhhgtgfeyxiexzf;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1280Ujhhgtgfeyxiexzf(c1381feyxiexzfUjhhgtgArr.length));
        m1282Ujhhgtgfeyxiexzf(linkedHashMap, c1381feyxiexzfUjhhgtgArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final void m1282Ujhhgtgfeyxiexzf(HashMap map, C1381feyxiexzfUjhhgtg[] c1381feyxiexzfUjhhgtgArr) {
        for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : c1381feyxiexzfUjhhgtgArr) {
            map.put(c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Map m1283Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C3308feyxiexzfUjhhgtg.f10345Ujhhgtgfeyxiexzf;
        }
        if (size == 1) {
            C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) arrayList.get(0);
            return Collections.singletonMap(c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1280Ujhhgtgfeyxiexzf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg2 = (C1381feyxiexzfUjhhgtg) it.next();
            linkedHashMap.put(c1381feyxiexzfUjhhgtg2.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg2.f4875Ujhhgtgfeyxiexzf);
        }
        return linkedHashMap;
    }
}
