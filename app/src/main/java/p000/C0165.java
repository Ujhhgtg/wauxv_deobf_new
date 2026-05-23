package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲇᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0165 extends AbstractC2106 implements Comparable, InterfaceC3407 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0918 f1190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f1191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final TreeMap f1192;

    public C0165(C0918 c0918, int i) {
        if (c0918 == null) {
            throw new NullPointerException("type == null");
        }
        if (i == 0) {
            throw new NullPointerException("visibility == null");
        }
        this.f1190 = c0918;
        this.f1191 = i;
        this.f1192 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0165)) {
            return false;
        }
        C0165 c0165 = (C0165) obj;
        if (this.f1190.equals(c0165.f1190) && this.f1191 == c0165.f1191) {
            return this.f1192.equals(c0165.f1192);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2784.m4759(this.f1191) + ((this.f1192.hashCode() + (this.f1190.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return mo1214();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String mo1214() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2784.m4734(this.f1191));
        sb.append("-annotation ");
        sb.append(this.f1190.f3401.mo1214());
        sb.append(" {");
        boolean z = true;
        for (C2119 c2119 : this.f1192.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c2119.f6978.mo1214());
            sb.append(": ");
            sb.append(c2119.f6979.mo1214());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1215(C2119 c2119) {
        m3925();
        C0917 c0917 = c2119.f6978;
        TreeMap treeMap = this.f1192;
        if (treeMap.get(c0917) == null) {
            treeMap.put(c0917, c2119);
        } else {
            throw new IllegalArgumentException("name already added: " + c0917);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0165 c0165) {
        int iCompareTo = this.f1190.compareTo(c0165.f1190);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = c0165.f1191;
        int i2 = this.f1191;
        if (i2 == 0 || i == 0) {
            throw null;
        }
        int i3 = i2 - i;
        if (i3 != 0) {
            return i3;
        }
        Iterator it = this.f1192.values().iterator();
        Iterator it2 = c0165.f1192.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            C2119 c2119 = (C2119) it.next();
            C2119 c21110 = (C2119) it2.next();
            int iCompareTo2 = c2119.f6978.compareTo(c21110.f6978);
            if (iCompareTo2 == 0) {
                iCompareTo2 = c2119.f6979.compareTo(c21110.f6979);
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
    public final void m1217(C2119 c2119) {
        m3925();
        this.f1192.put(c2119.f6978, c2119);
    }
}
