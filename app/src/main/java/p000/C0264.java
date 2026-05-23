package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0264 extends C2705 implements Map {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0259 f1458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0261 f1459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0263 f1460;

    public C0264(C0264 c0264) {
        super(0);
        mo1917(c0264);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0259 c0259 = this.f1458;
        if (c0259 != null) {
            return c0259;
        }
        C0259 c02510 = new C0259(this);
        this.f1458 = c02510;
        return c02510;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0261 c0261 = this.f1459;
        if (c0261 != null) {
            return c0261;
        }
        C0261 c0262 = new C0261(this);
        this.f1459 = c0262;
        return c0262;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4702(map.size() + this.f8716);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0263 c0263 = this.f1460;
        if (c0263 != null) {
            return c0263;
        }
        C0263 c0264 = new C0263(this);
        this.f1460 = c0264;
        return c0264;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1365(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean m1366(Collection collection) {
        int i = this.f8716;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8716;
    }
}
