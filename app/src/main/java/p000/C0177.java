package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0177 extends AbstractC2106 implements Comparable {

    public static final C0177 f1223;

    public final TreeMap f1224 = new TreeMap();

    static {
        C0177 c0177 = new C0177();
        f1223 = c0177;
        c0177.f6944 = false;
    }

    public static C0177 m1227(C0177 c0177, C0165 c0165) {
        C0177 c0178 = new C0177();
        c0178.m1229(c0177);
        c0178.m1228(c0165);
        c0178.f6944 = false;
        return c0178;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0177) {
            return this.f1224.equals(((C0177) obj).f1224);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1224.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("annotations{");
        boolean z = true;
        for (C0165 c0165 : this.f1224.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0165.mo1214());
        }
        sb.append("}");
        return sb.toString();
    }

    public final void m1228(C0165 c0165) {
        m3925();
        if (c0165 == null) {
            throw new NullPointerException("annotation == null");
        }
        C0918 c0918 = c0165.f1190;
        TreeMap treeMap = this.f1224;
        if (!treeMap.containsKey(c0918)) {
            treeMap.put(c0918, c0165);
        } else {
            throw new IllegalArgumentException("duplicate type: " + c0918.f3401.mo1214());
        }
    }

    public final void m1229(C0177 c0177) {
        m3925();
        if (c0177 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c0177.f1224.values().iterator();
        while (it.hasNext()) {
            m1228((C0165) it.next());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0177 c0177) {
        Iterator it = this.f1224.values().iterator();
        Iterator it2 = c0177.f1224.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM1216 = ((C0165) it.next()).compareTo((C0165) it2.next());
            if (iM1216 != 0) {
                return iM1216;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
