package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᛸᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1898 extends AbstractC2205 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public static Object m3692(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public static int m3693(int i) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public static Map m3694(C2315... c2315Arr) {
        if (c2315Arr.length <= 0) {
            return C1190.f4330;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3693(c2315Arr.length));
        m3695(linkedHashMap, c2315Arr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public static final void m3695(HashMap map, C2315[] c2315Arr) {
        for (C2315 c2315 : c2315Arr) {
            map.put(c2315.f7445, c2315.f7446);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public static Map m3696(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C1190.f4330;
        }
        if (size == 1) {
            C2315 c2315 = (C2315) arrayList.get(0);
            return Collections.singletonMap(c2315.f7445, c2315.f7446);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3693(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2315 c2316 = (C2315) it.next();
            linkedHashMap.put(c2316.f7445, c2316.f7446);
        }
        return linkedHashMap;
    }
}
