package p000;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2149 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final WeakHashMap f7093 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String[] f7094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String[] f7095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f7096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f7097;

    public C2149(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f7096 = listAsList;
        int size = listAsList.size();
        this.f7097 = size;
        this.f7094 = new String[size + 1];
        this.f7095 = new String[size + 1];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2149 m4113(String str) {
        WeakHashMap weakHashMap = f7093;
        if (weakHashMap.containsKey(str)) {
            C2149 c2149 = (C2149) weakHashMap.get(str);
            if (c2149 != null) {
                return c2149;
            }
            weakHashMap.remove(str);
        }
        C2149 c21410 = new C2149(str);
        weakHashMap.put(str, c21410);
        String[] strArr = c21410.f7094;
        int i = c21410.f7097;
        strArr[i] = str;
        String[] strArr2 = c21410.f7095;
        strArr2[i] = str;
        if (i == 1) {
            return c21410;
        }
        List list = c21410.f7096;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c21410;
    }
}
