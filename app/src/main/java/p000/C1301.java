package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1301 extends AbstractC1930 {

    public final TreeMap f4727;

    public C1301(C1023 c1023) {
        super("field_ids", c1023, 4);
        this.f4727 = new TreeMap();
    }

    @Override // p000.AbstractC2643
    public final Collection mo1923() {
        return this.f4727.values();
    }

    public final int m3017(C0899 c0899) {
        if (c0899 == null) {
            throw new NullPointerException("ref == null");
        }
        m4637();
        C1300 c1300 = (C1300) this.f4727.get(c0899);
        if (c1300 != null) {
            return c1300.m3345();
        }
        throw new IllegalArgumentException("not found");
    }

    public final synchronized C1300 m3018(C0899 c0899) {
        C1300 c1300;
        try {
            if (c0899 == null) {
                throw new NullPointerException("field == null");
            }
            m4638();
            c1300 = (C1300) this.f4727.get(c0899);
            if (c1300 == null) {
                c1300 = new C1300(c0899);
                this.f4727.put(c0899, c1300);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1300;
    }
}
