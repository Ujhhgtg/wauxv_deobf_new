package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0185 extends AbstractC2139 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0185 f1291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final TreeMap f1292 = new TreeMap();

    static {
        C0185 c0185 = new C0185();
        f1291 = c0185;
        c0185.f7068 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0185 m1373(C0185 c0185, C0173 c0173) {
        C0185 c0186 = new C0185();
        c0186.m1375(c0185);
        c0186.m1374(c0173);
        c0186.f7068 = false;
        return c0186;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0185) {
            return this.f1292.equals(((C0185) obj).f1292);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1292.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("annotations{");
        boolean z = true;
        for (C0173 c0173 : this.f1292.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0173.mo1360());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1374(C0173 c0173) {
        m4109();
        if (c0173 == null) {
            throw new NullPointerException("annotation == null");
        }
        C0917 c0917 = c0173.f1258;
        TreeMap treeMap = this.f1292;
        if (!treeMap.containsKey(c0917)) {
            treeMap.put(c0917, c0173);
        } else {
            throw new IllegalArgumentException("duplicate type: " + c0917.f3408.mo1360());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1375(C0185 c0185) {
        m4109();
        if (c0185 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c0185.f1292.values().iterator();
        while (it.hasNext()) {
            m1374((C0173) it.next());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0185 c0185) {
        Iterator it = this.f1292.values().iterator();
        Iterator it2 = c0185.f1292.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM1362 = ((C0173) it.next()).compareTo((C0173) it2.next());
            if (iM1362 != 0) {
                return iM1362;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
