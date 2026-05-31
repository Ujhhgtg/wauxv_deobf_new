package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᛸᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1302 extends AbstractC1961 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TreeMap f4726;

    public C1302(C1026 c1026) {
        super("field_ids", c1026, 4);
        this.f4726 = new TreeMap();
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Collection mo2018() {
        return this.f4726.values();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m3120(C0898 c0898) {
        if (c0898 == null) {
            throw new NullPointerException("ref == null");
        }
        m4671();
        C1301 c1301 = (C1301) this.f4726.get(c0898);
        if (c1301 != null) {
            return c1301.m3509();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized C1301 m3121(C0898 c0898) {
        C1301 c1301;
        try {
            if (c0898 == null) {
                throw new NullPointerException("field == null");
            }
            m4672();
            c1301 = (C1301) this.f4726.get(c0898);
            if (c1301 == null) {
                c1301 = new C1301(c0898);
                this.f4726.put(c0898, c1301);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1301;
    }
}
