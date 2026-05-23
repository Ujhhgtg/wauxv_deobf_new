package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1979 extends AbstractC1930 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TreeMap f6551;

    public C1979(C1023 c1023) {
        super("method_ids", c1023, 4);
        this.f6551 = new TreeMap();
    }

    @Override // p000.AbstractC2643
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Collection mo1923() {
        return this.f6551.values();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m3814(AbstractC0891 abstractC0891) {
        if (abstractC0891 == null) {
            throw new NullPointerException("ref == null");
        }
        m4637();
        C1978 c1978 = (C1978) this.f6551.get(abstractC0891);
        if (c1978 != null) {
            return c1978.m3345();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized void m3815(AbstractC0891 abstractC0891) {
        try {
            if (abstractC0891 == null) {
                throw new NullPointerException("method == null");
            }
            m4638();
            if (((C1978) this.f6551.get(abstractC0891)) == null) {
                this.f6551.put(abstractC0891, new C1978(abstractC0891));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
