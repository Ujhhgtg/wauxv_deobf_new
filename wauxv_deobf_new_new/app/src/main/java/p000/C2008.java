package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2008 extends AbstractC3552 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f6655;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2008(C1026 c1026, int i) {
        super("method_handles", c1026, 8);
        this.f6654 = i;
        switch (i) {
            case 1:
                super("proto_ids", c1026, 4);
                this.f6655 = new TreeMap();
                break;
            case 2:
                super("string_ids", c1026, 4);
                this.f6655 = new TreeMap();
                break;
            case 3:
                super("type_ids", c1026, 4);
                this.f6655 = new TreeMap();
                break;
            case 4:
                super(null, c1026, 4);
                C1533 c1533 = new C1533();
                c1533.m3511(0);
                this.f6655 = Collections.singletonList(c1533);
                break;
            default:
                this.f6655 = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Collection mo2018() {
        switch (this.f6654) {
            case 0:
                return ((TreeMap) this.f6655).values();
            case 1:
                return ((TreeMap) this.f6655).values();
            case 2:
                return ((TreeMap) this.f6655).values();
            case 3:
                return ((TreeMap) this.f6655).values();
            default:
                return (List) this.f6655;
        }
    }

    @Override // p000.AbstractC3552
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2019() {
        switch (this.f6654) {
            case 0:
                Iterator it = ((TreeMap) this.f6655).values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C2007) it.next()).m3511(i);
                    i++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) this.f6655).values().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    ((C2481) it2.next()).m3511(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) this.f6655).values().iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    ((C2895) it3.next()).m3511(i3);
                    i3++;
                }
                break;
            case 3:
                Iterator it4 = ((TreeMap) this.f6655).values().iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    ((C3509) it4.next()).m3511(i4);
                    i4++;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int m3999(C0916 c0916) {
        if (c0916 == null) {
            throw new NullPointerException("string == null");
        }
        m4671();
        C2895 c2895 = (C2895) ((TreeMap) this.f6655).get(c0916);
        if (c2895 != null) {
            return c2895.m3509();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int m4000(C0917 c0917) {
        if (c0917 != null) {
            return m4002(c0917.f3408);
        }
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int m4001(C2492 c2492) {
        if (c2492 == null) {
            throw new NullPointerException("prototype == null");
        }
        m4671();
        C2481 c2481 = (C2481) ((TreeMap) this.f6655).get(c2492);
        if (c2481 != null) {
            return c2481.m3509();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int m4002(C3505 c3505) {
        if (c3505 == null) {
            throw new NullPointerException("type == null");
        }
        m4671();
        C3509 c3509 = (C3509) ((TreeMap) this.f6655).get(c3505);
        if (c3509 != null) {
            return c3509.m3509();
        }
        throw new IllegalArgumentException("not found: " + c3505);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public synchronized C3509 m4003(C0917 c0917) {
        C3509 c3509;
        try {
            if (c0917 == null) {
                throw new NullPointerException("type == null");
            }
            m4672();
            C3505 c3505 = c0917.f3408;
            c3509 = (C3509) ((TreeMap) this.f6655).get(c3505);
            if (c3509 == null) {
                c3509 = new C3509(c0917);
                ((TreeMap) this.f6655).put(c3505, c3509);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3509;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public synchronized void m4004(C0911 c0911) {
        try {
            if (c0911 == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m4672();
            if (((C2007) ((TreeMap) this.f6655).get(c0911)) == null) {
                ((TreeMap) this.f6655).put(c0911, new C2007(c0911));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m4005(C0916 c0916) {
        C2895 c2895 = new C2895(c0916);
        synchronized (this) {
            m4672();
            if (((C2895) ((TreeMap) this.f6655).get(c0916)) != null) {
                return;
            }
            ((TreeMap) this.f6655).put(c0916, c2895);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public synchronized void m4006(C2492 c2492) {
        try {
            if (c2492 == null) {
                throw new NullPointerException("prototype == null");
            }
            m4672();
            if (((C2481) ((TreeMap) this.f6655).get(c2492)) == null) {
                ((TreeMap) this.f6655).put(c2492, new C2481(c2492));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public synchronized void m4007(C3505 c3505) {
        try {
            if (c3505 == null) {
                throw new NullPointerException("type == null");
            }
            m4672();
            if (((C3509) ((TreeMap) this.f6655).get(c3505)) == null) {
                ((TreeMap) this.f6655).put(c3505, new C3509(new C0917(c3505)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    private final void m3998() {
    }
}
