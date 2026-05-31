package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0274 extends C2767 implements Map {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0269 f1532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0271 f1533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0273 f1534;

    public C0274(C0274 c0274) {
        super(0);
        mo2012(c0274);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0269 c0269 = this.f1532;
        if (c0269 != null) {
            return c0269;
        }
        C0269 c02610 = new C0269(this);
        this.f1532 = c02610;
        return c02610;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0271 c0271 = this.f1533;
        if (c0271 != null) {
            return c0271;
        }
        C0271 c0272 = new C0271(this);
        this.f1533 = c0272;
        return c0272;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4739(map.size() + this.f8887);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0273 c0273 = this.f1534;
        if (c0273 != null) {
            return c0273;
        }
        C0273 c0274 = new C0273(this);
        this.f1534 = c0274;
        return c0274;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1511(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean m1512(Collection collection) {
        int i = this.f8887;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8887;
    }
}
