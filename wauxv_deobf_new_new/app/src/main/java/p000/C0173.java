package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0173 extends AbstractC2139 implements Comparable, InterfaceC3466 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0917 f1258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f1259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TreeMap f1260;

    public C0173(C0917 c0917, int i) {
        if (c0917 == null) {
            throw new NullPointerException("type == null");
        }
        if (i == 0) {
            throw new NullPointerException("visibility == null");
        }
        this.f1258 = c0917;
        this.f1259 = i;
        this.f1260 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0173)) {
            return false;
        }
        C0173 c0173 = (C0173) obj;
        if (this.f1258.equals(c0173.f1258) && this.f1259 == c0173.f1259) {
            return this.f1260.equals(c0173.f1260);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2844.m4792(this.f1259) + ((this.f1260.hashCode() + (this.f1258.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return mo1360();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String mo1360() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2844.m4768(this.f1259));
        sb.append("-annotation ");
        sb.append(this.f1258.f3408.mo1360());
        sb.append(" {");
        boolean z = true;
        for (C2152 c2152 : this.f1260.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c2152.f7102.mo1360());
            sb.append(": ");
            sb.append(c2152.f7103.mo1360());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1361(C2152 c2152) {
        m4109();
        C0916 c0916 = c2152.f7102;
        TreeMap treeMap = this.f1260;
        if (treeMap.get(c0916) == null) {
            treeMap.put(c0916, c2152);
        } else {
            throw new IllegalArgumentException("name already added: " + c0916);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0173 c0173) {
        int iCompareTo = this.f1258.compareTo(c0173.f1258);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = c0173.f1259;
        int i2 = this.f1259;
        if (i2 == 0 || i == 0) {
            throw null;
        }
        int i3 = i2 - i;
        if (i3 != 0) {
            return i3;
        }
        Iterator it = this.f1260.values().iterator();
        Iterator it2 = c0173.f1260.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            C2152 c2152 = (C2152) it.next();
            C2152 c2153 = (C2152) it2.next();
            int iCompareTo2 = c2152.f7102.compareTo(c2153.f7102);
            if (iCompareTo2 == 0) {
                iCompareTo2 = c2152.f7103.compareTo(c2153.f7103);
            }
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m1363(C2152 c2152) {
        m4109();
        this.f1260.put(c2152.f7102, c2152);
    }
}
