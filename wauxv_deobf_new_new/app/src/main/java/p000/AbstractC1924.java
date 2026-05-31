package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1924 extends AbstractC1468 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static Object m3871(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m3872(int i) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static Map m3873(C2348... c2348Arr) {
        if (c2348Arr.length <= 0) {
            return C1192.f4327;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3872(c2348Arr.length));
        m3874(linkedHashMap, c2348Arr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final void m3874(HashMap map, C2348[] c2348Arr) {
        for (C2348 c2348 : c2348Arr) {
            map.put(c2348.f7567, c2348.f7568);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static Map m3875(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C1192.f4327;
        }
        if (size == 1) {
            C2348 c2348 = (C2348) arrayList.get(0);
            return Collections.singletonMap(c2348.f7567, c2348.f7568);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3872(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2348 c2349 = (C2348) it.next();
            linkedHashMap.put(c2349.f7567, c2349.f7568);
        }
        return linkedHashMap;
    }
}
