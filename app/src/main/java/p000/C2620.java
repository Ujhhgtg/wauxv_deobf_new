package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2620 implements Iterable {

    public C2617 f8503;

    public C2617 f8504;

    public final WeakHashMap f8505 = new WeakHashMap();

    public int f8506 = 0;

    public final boolean equals(Object obj) {
        C2616 c2616;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2620)) {
            return false;
        }
        C2620 c2620 = (C2620) obj;
        if (this.f8506 != c2620.f8506) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2620.iterator();
        while (true) {
            c2616 = (C2616) it;
            if (!c2616.hasNext()) {
                break;
            }
            C2616 c2617 = (C2616) it2;
            if (!c2617.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2616.next();
            Object next = c2617.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c2616.hasNext() || ((C2616) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2616 c2616 = (C2616) it;
            if (!c2616.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2616.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2616 c2616 = new C2616(this.f8503, this.f8504, 0);
        this.f8505.put(c2616, Boolean.FALSE);
        return c2616;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2616 c2616 = (C2616) it;
            if (!c2616.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2616.next()).toString());
            if (c2616.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public C2617 mo3001(Object obj) {
        C2617 c2617 = this.f8503;
        while (c2617 != null && !c2617.f8496.equals(obj)) {
            c2617 = c2617.f8498;
        }
        return c2617;
    }

    public Object mo3002(Object obj) {
        C2617 c2617Mo3001 = mo3001(obj);
        if (c2617Mo3001 == null) {
            return null;
        }
        this.f8506--;
        WeakHashMap weakHashMap = this.f8505;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2619) it.next()).mo4631(c2617Mo3001);
            }
        }
        C2617 c2617 = c2617Mo3001.f8499;
        if (c2617 != null) {
            c2617.f8498 = c2617Mo3001.f8498;
        } else {
            this.f8503 = c2617Mo3001.f8498;
        }
        C2617 c2618 = c2617Mo3001.f8498;
        if (c2618 != null) {
            c2618.f8499 = c2617;
        } else {
            this.f8504 = c2617;
        }
        c2617Mo3001.f8498 = null;
        c2617Mo3001.f8499 = null;
        return c2617Mo3001.f8497;
    }
}
