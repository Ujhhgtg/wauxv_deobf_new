package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1896 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashMap f6289 = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long f6290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f6291;

    public C1896(long j) {
        this.f6290 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final synchronized Object m3827(Object obj) {
        C1895 c1895;
        c1895 = (C1895) this.f6289.get(obj);
        return c1895 != null ? c1895.f6287 : null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int mo3828(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final synchronized Object m3830(Object obj, Object obj2) {
        int iMo3828 = mo3828(obj2);
        long j = iMo3828;
        if (j >= this.f6290) {
            mo3829(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f6291 += j;
        }
        C1895 c1895 = (C1895) this.f6289.put(obj, obj2 == null ? null : new C1895(obj2, iMo3828));
        if (c1895 != null) {
            this.f6291 -= (long) c1895.f6288;
            if (!c1895.f6287.equals(obj2)) {
                mo3829(obj, c1895.f6287);
            }
        }
        m3831(this.f6290);
        return c1895 != null ? c1895.f6287 : null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized void m3831(long j) {
        while (this.f6291 > j) {
            Iterator it = this.f6289.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C1895 c1895 = (C1895) entry.getValue();
            this.f6291 -= (long) c1895.f6288;
            Object key = entry.getKey();
            it.remove();
            mo3829(key, c1895.f6287);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo3829(Object obj, Object obj2) {
    }
}
