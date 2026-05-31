package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2010 extends AbstractC1961 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TreeMap f6656;

    public C2010(C1026 c1026) {
        super("method_ids", c1026, 4);
        this.f6656 = new TreeMap();
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Collection mo2018() {
        return this.f6656.values();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m4008(AbstractC0890 abstractC0890) {
        if (abstractC0890 == null) {
            throw new NullPointerException("ref == null");
        }
        m4671();
        C2009 c2009 = (C2009) this.f6656.get(abstractC0890);
        if (c2009 != null) {
            return c2009.m3509();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized void m4009(AbstractC0890 abstractC0890) {
        try {
            if (abstractC0890 == null) {
                throw new NullPointerException("method == null");
            }
            m4672();
            if (((C2009) this.f6656.get(abstractC0890)) == null) {
                this.f6656.put(abstractC0890, new C2009(abstractC0890));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
