package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛴ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0395Ujhhgtgfeyxiexzf extends AbstractC1961feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f2142Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object f2143Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0395Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, int i) {
        super("method_handles", c3268feyxiexzfUjhhgtg, 8);
        this.f2142Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                super("proto_ids", c3268feyxiexzfUjhhgtg, 4);
                this.f2143Ujhhgtgfeyxiexzf = new TreeMap();
                break;
            case 2:
                super("string_ids", c3268feyxiexzfUjhhgtg, 4);
                this.f2143Ujhhgtgfeyxiexzf = new TreeMap();
                break;
            case 3:
                super("type_ids", c3268feyxiexzfUjhhgtg, 4);
                this.f2143Ujhhgtgfeyxiexzf = new TreeMap();
                break;
            case 4:
                super(null, c3268feyxiexzfUjhhgtg, 4);
                C0535Ujhhgtgfeyxiexzf c0535Ujhhgtgfeyxiexzf = new C0535Ujhhgtgfeyxiexzf();
                c0535Ujhhgtgfeyxiexzf.m1911Ujhhgtgfeyxiexzf(0);
                this.f2143Ujhhgtgfeyxiexzf = Collections.singletonList(c0535Ujhhgtgfeyxiexzf);
                break;
            default:
                this.f2143Ujhhgtgfeyxiexzf = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Collection mo1505Ujhhgtgfeyxiexzf() {
        switch (this.f2142Ujhhgtgfeyxiexzf) {
            case 0:
                return ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values();
            case 1:
                return ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values();
            case 2:
                return ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values();
            case 3:
                return ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values();
            default:
                return (List) this.f2143Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC1961feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1298Ujhhgtgfeyxiexzf() {
        switch (this.f2142Ujhhgtgfeyxiexzf) {
            case 0:
                Iterator it = ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C0387Ujhhgtgfeyxiexzf) it.next()).m1911Ujhhgtgfeyxiexzf(i);
                    i++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    ((C0861feyxiexzfUjhhgtg) it2.next()).m1911Ujhhgtgfeyxiexzf(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values().iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    ((C1146feyxiexzfUjhhgtg) it3.next()).m1911Ujhhgtgfeyxiexzf(i3);
                    i3++;
                }
                break;
            case 3:
                Iterator it4 = ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).values().iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    ((C1788Ujhhgtgfeyxiexzf) it4.next()).m1911Ujhhgtgfeyxiexzf(i4);
                    i4++;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int m1665Ujhhgtgfeyxiexzf(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf) {
        if (c3056Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("string == null");
        }
        m2563Ujhhgtgfeyxiexzf();
        C1146feyxiexzfUjhhgtg c1146feyxiexzfUjhhgtg = (C1146feyxiexzfUjhhgtg) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c3056Ujhhgtgfeyxiexzf);
        if (c1146feyxiexzfUjhhgtg != null) {
            return c1146feyxiexzfUjhhgtg.m1909Ujhhgtgfeyxiexzf();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int m1666Ujhhgtgfeyxiexzf(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf) {
        if (c3057Ujhhgtgfeyxiexzf != null) {
            return m1668Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf);
        }
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int m1667Ujhhgtgfeyxiexzf(C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg) {
        if (c0870feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("prototype == null");
        }
        m2563Ujhhgtgfeyxiexzf();
        C0861feyxiexzfUjhhgtg c0861feyxiexzfUjhhgtg = (C0861feyxiexzfUjhhgtg) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c0870feyxiexzfUjhhgtg);
        if (c0861feyxiexzfUjhhgtg != null) {
            return c0861feyxiexzfUjhhgtg.m1909Ujhhgtgfeyxiexzf();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int m1668Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        if (c1784feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("type == null");
        }
        m2563Ujhhgtgfeyxiexzf();
        C1788Ujhhgtgfeyxiexzf c1788Ujhhgtgfeyxiexzf = (C1788Ujhhgtgfeyxiexzf) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c1784feyxiexzfUjhhgtg);
        if (c1788Ujhhgtgfeyxiexzf != null) {
            return c1788Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
        }
        throw new IllegalArgumentException("not found: " + c1784feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public synchronized C1788Ujhhgtgfeyxiexzf m1669Ujhhgtgfeyxiexzf(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf) {
        C1788Ujhhgtgfeyxiexzf c1788Ujhhgtgfeyxiexzf;
        try {
            if (c3057Ujhhgtgfeyxiexzf == null) {
                throw new NullPointerException("type == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf;
            c1788Ujhhgtgfeyxiexzf = (C1788Ujhhgtgfeyxiexzf) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c1784feyxiexzfUjhhgtg);
            if (c1788Ujhhgtgfeyxiexzf == null) {
                c1788Ujhhgtgfeyxiexzf = new C1788Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf);
                ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).put(c1784feyxiexzfUjhhgtg, c1788Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1788Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public synchronized void m1670Ujhhgtgfeyxiexzf(C3153Ujhhgtgfeyxiexzf c3153Ujhhgtgfeyxiexzf) {
        try {
            if (c3153Ujhhgtgfeyxiexzf == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            if (((C0387Ujhhgtgfeyxiexzf) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c3153Ujhhgtgfeyxiexzf)) == null) {
                ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).put(c3153Ujhhgtgfeyxiexzf, new C0387Ujhhgtgfeyxiexzf(c3153Ujhhgtgfeyxiexzf));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m1671Ujhhgtgfeyxiexzf(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf) {
        C1146feyxiexzfUjhhgtg c1146feyxiexzfUjhhgtg = new C1146feyxiexzfUjhhgtg(c3056Ujhhgtgfeyxiexzf);
        synchronized (this) {
            m2564Ujhhgtgfeyxiexzf();
            if (((C1146feyxiexzfUjhhgtg) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c3056Ujhhgtgfeyxiexzf)) != null) {
                return;
            }
            ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).put(c3056Ujhhgtgfeyxiexzf, c1146feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public synchronized void m1672Ujhhgtgfeyxiexzf(C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg) {
        try {
            if (c0870feyxiexzfUjhhgtg == null) {
                throw new NullPointerException("prototype == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            if (((C0861feyxiexzfUjhhgtg) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c0870feyxiexzfUjhhgtg)) == null) {
                ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).put(c0870feyxiexzfUjhhgtg, new C0861feyxiexzfUjhhgtg(c0870feyxiexzfUjhhgtg));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public synchronized void m1673Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        try {
            if (c1784feyxiexzfUjhhgtg == null) {
                throw new NullPointerException("type == null");
            }
            m2564Ujhhgtgfeyxiexzf();
            if (((C1788Ujhhgtgfeyxiexzf) ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).get(c1784feyxiexzfUjhhgtg)) == null) {
                ((TreeMap) this.f2143Ujhhgtgfeyxiexzf).put(c1784feyxiexzfUjhhgtg, new C1788Ujhhgtgfeyxiexzf(new C3057Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    private final void m1664Ujhhgtgfeyxiexzf() {
    }
}
