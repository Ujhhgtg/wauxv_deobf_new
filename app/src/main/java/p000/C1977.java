package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1977 extends AbstractC3495 {

    public final /* synthetic */ int f6549;

    public final Object f6550;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977(C1023 c1023, int i) {
        super("method_handles", c1023, 8);
        this.f6549 = i;
        switch (i) {
            case 1:
                super("proto_ids", c1023, 4);
                this.f6550 = new TreeMap();
                break;
            case 2:
                super("string_ids", c1023, 4);
                this.f6550 = new TreeMap();
                break;
            case 3:
                super("type_ids", c1023, 4);
                this.f6550 = new TreeMap();
                break;
            case 4:
                super(null, c1023, 4);
                C1521 c1521 = new C1521();
                c1521.m3347(0);
                this.f6550 = Collections.singletonList(c1521);
                break;
            default:
                this.f6550 = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC2643
    public final Collection mo1923() {
        switch (this.f6549) {
            case 0:
                return ((TreeMap) this.f6550).values();
            case 1:
                return ((TreeMap) this.f6550).values();
            case 2:
                return ((TreeMap) this.f6550).values();
            case 3:
                return ((TreeMap) this.f6550).values();
            default:
                return (List) this.f6550;
        }
    }

    @Override // p000.AbstractC3495
    public final void mo1924() {
        switch (this.f6549) {
            case 0:
                Iterator it = ((TreeMap) this.f6550).values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C1976) it.next()).m3347(i);
                    i++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) this.f6550).values().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    ((C2428) it2.next()).m3347(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) this.f6550).values().iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    ((C2835) it3.next()).m3347(i3);
                    i3++;
                }
                break;
            case 3:
                Iterator it4 = ((TreeMap) this.f6550).values().iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    ((C3452) it4.next()).m3347(i4);
                    i4++;
                }
                break;
        }
    }

    public int m3805(C0917 c0917) {
        if (c0917 == null) {
            throw new NullPointerException("string == null");
        }
        m4637();
        C2835 c2835 = (C2835) ((TreeMap) this.f6550).get(c0917);
        if (c2835 != null) {
            return c2835.m3345();
        }
        throw new IllegalArgumentException("not found");
    }

    public int m3806(C0918 c0918) {
        if (c0918 != null) {
            return m3808(c0918.f3401);
        }
        throw new NullPointerException("type == null");
    }

    public int m3807(C2440 c2440) {
        if (c2440 == null) {
            throw new NullPointerException("prototype == null");
        }
        m4637();
        C2428 c2428 = (C2428) ((TreeMap) this.f6550).get(c2440);
        if (c2428 != null) {
            return c2428.m3345();
        }
        throw new IllegalArgumentException("not found");
    }

    public int m3808(C3448 c3448) {
        if (c3448 == null) {
            throw new NullPointerException("type == null");
        }
        m4637();
        C3452 c3452 = (C3452) ((TreeMap) this.f6550).get(c3448);
        if (c3452 != null) {
            return c3452.m3345();
        }
        throw new IllegalArgumentException("not found: " + c3448);
    }

    public synchronized C3452 m3809(C0918 c0918) {
        C3452 c3452;
        try {
            if (c0918 == null) {
                throw new NullPointerException("type == null");
            }
            m4638();
            C3448 c3448 = c0918.f3401;
            c3452 = (C3452) ((TreeMap) this.f6550).get(c3448);
            if (c3452 == null) {
                c3452 = new C3452(c0918);
                ((TreeMap) this.f6550).put(c3448, c3452);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3452;
    }

    public synchronized void m3810(C0912 c0912) {
        try {
            if (c0912 == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m4638();
            if (((C1976) ((TreeMap) this.f6550).get(c0912)) == null) {
                ((TreeMap) this.f6550).put(c0912, new C1976(c0912));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void m3811(C0917 c0917) {
        C2835 c2835 = new C2835(c0917);
        synchronized (this) {
            m4638();
            if (((C2835) ((TreeMap) this.f6550).get(c0917)) != null) {
                return;
            }
            ((TreeMap) this.f6550).put(c0917, c2835);
        }
    }

    public synchronized void m3812(C2440 c2440) {
        try {
            if (c2440 == null) {
                throw new NullPointerException("prototype == null");
            }
            m4638();
            if (((C2428) ((TreeMap) this.f6550).get(c2440)) == null) {
                ((TreeMap) this.f6550).put(c2440, new C2428(c2440));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m3813(C3448 c3448) {
        try {
            if (c3448 == null) {
                throw new NullPointerException("type == null");
            }
            m4638();
            if (((C3452) ((TreeMap) this.f6550).get(c3448)) == null) {
                ((TreeMap) this.f6550).put(c3448, new C3452(new C0918(c3448)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void m3804() {
    }
}
