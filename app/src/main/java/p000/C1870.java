package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1870 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashMap f6215 = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long f6216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f6217;

    public C1870(long j) {
        this.f6216 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized Object m3649(Object obj) {
        C1869 c1869;
        c1869 = (C1869) this.f6215.get(obj);
        return c1869 != null ? c1869.f6213 : null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int mo3650(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Object m3652(Object obj, Object obj2) {
        int iMo3650 = mo3650(obj2);
        long j = iMo3650;
        if (j >= this.f6216) {
            mo3651(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f6217 += j;
        }
        C1869 c1869 = (C1869) this.f6215.put(obj, obj2 == null ? null : new C1869(iMo3650, obj2));
        if (c1869 != null) {
            this.f6217 -= (long) c1869.f6214;
            if (!c1869.f6213.equals(obj2)) {
                mo3651(obj, c1869.f6213);
            }
        }
        m3653(this.f6216);
        return c1869 != null ? c1869.f6213 : null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3653(long j) {
        while (this.f6217 > j) {
            Iterator it = this.f6215.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C1869 c1869 = (C1869) entry.getValue();
            this.f6217 -= (long) c1869.f6214;
            Object key = entry.getKey();
            it.remove();
            mo3651(key, c1869.f6213);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo3651(Object obj, Object obj2) {
    }
}
