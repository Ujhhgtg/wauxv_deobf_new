package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2681 implements Iterable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2678 f8668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2678 f8669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final WeakHashMap f8670 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8671 = 0;

    public final boolean equals(Object obj) {
        C2677 c2677;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2681)) {
            return false;
        }
        C2681 c2681 = (C2681) obj;
        if (this.f8671 != c2681.f8671) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2681.iterator();
        while (true) {
            c2677 = (C2677) it;
            if (!c2677.hasNext()) {
                break;
            }
            C2677 c2678 = (C2677) it2;
            if (!c2678.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2677.next();
            Object next = c2678.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c2677.hasNext() || ((C2677) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2677 c2677 = (C2677) it;
            if (!c2677.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2677.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2677 c2677 = new C2677(this.f8668, this.f8669, 0);
        this.f8670.put(c2677, Boolean.FALSE);
        return c2677;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2677 c2677 = (C2677) it;
            if (!c2677.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2677.next()).toString());
            if (c2677.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public C2678 mo3104(Object obj) {
        C2678 c2678 = this.f8668;
        while (c2678 != null && !c2678.f8661.equals(obj)) {
            c2678 = c2678.f8663;
        }
        return c2678;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public Object mo3105(Object obj) {
        C2678 c2678Mo3104 = mo3104(obj);
        if (c2678Mo3104 == null) {
            return null;
        }
        this.f8671--;
        WeakHashMap weakHashMap = this.f8670;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2680) it.next()).mo4665(c2678Mo3104);
            }
        }
        C2678 c2678 = c2678Mo3104.f8664;
        if (c2678 != null) {
            c2678.f8663 = c2678Mo3104.f8663;
        } else {
            this.f8668 = c2678Mo3104.f8663;
        }
        C2678 c2679 = c2678Mo3104.f8663;
        if (c2679 != null) {
            c2679.f8664 = c2678;
        } else {
            this.f8669 = c2678;
        }
        c2678Mo3104.f8663 = null;
        c2678Mo3104.f8664 = null;
        return c2678Mo3104.f8662;
    }
}
