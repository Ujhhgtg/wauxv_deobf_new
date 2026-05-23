package p000;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᛸᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2116 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final WeakHashMap f6969 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String[] f6970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String[] f6971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f6972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6973;

    public C2116(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f6972 = listAsList;
        int size = listAsList.size();
        this.f6973 = size;
        this.f6970 = new String[size + 1];
        this.f6971 = new String[size + 1];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2116 m3929(String str) {
        WeakHashMap weakHashMap = f6969;
        if (weakHashMap.containsKey(str)) {
            C2116 c2116 = (C2116) weakHashMap.get(str);
            if (c2116 != null) {
                return c2116;
            }
            weakHashMap.remove(str);
        }
        C2116 c2117 = new C2116(str);
        weakHashMap.put(str, c2117);
        String[] strArr = c2117.f6970;
        int i = c2117.f6973;
        strArr[i] = str;
        String[] strArr2 = c2117.f6971;
        strArr2[i] = str;
        if (i == 1) {
            return c2117;
        }
        List list = c2117.f6972;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c2117;
    }
}
