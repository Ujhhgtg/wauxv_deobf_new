package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤝᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0467 extends HashMap {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1832(String str) {
        String strM1833 = C0468.m1833(str);
        String str2 = (strM1833.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM1833} : C0468.f2084.split(strM1833))[1];
        if (containsKey(str2)) {
            ((C0463) get(str2)).f2078.add(str);
            return;
        }
        C0463 c0463 = new C0463();
        ArrayList arrayList = new ArrayList();
        c0463.f2078 = arrayList;
        arrayList.add(str);
        put(str2, c0463);
    }
}
