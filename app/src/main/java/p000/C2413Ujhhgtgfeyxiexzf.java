package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2413Ujhhgtgfeyxiexzf extends AbstractC0417Ujhhgtgfeyxiexzf implements Comparable, InterfaceC1724Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f7820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f7821Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final TreeMap f7822Ujhhgtgfeyxiexzf;

    public C2413Ujhhgtgfeyxiexzf(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, int i) {
        if (c3057Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("type == null");
        }
        if (i == 0) {
            throw new NullPointerException("visibility == null");
        }
        this.f7820Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
        this.f7821Ujhhgtgfeyxiexzf = i;
        this.f7822Ujhhgtgfeyxiexzf = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2413Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf = (C2413Ujhhgtgfeyxiexzf) obj;
        if (this.f7820Ujhhgtgfeyxiexzf.equals(c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf) && this.f7821Ujhhgtgfeyxiexzf == c2413Ujhhgtgfeyxiexzf.f7821Ujhhgtgfeyxiexzf) {
            return this.f7822Ujhhgtgfeyxiexzf.equals(c2413Ujhhgtgfeyxiexzf.f7822Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f7821Ujhhgtgfeyxiexzf) + ((this.f7822Ujhhgtgfeyxiexzf.hashCode() + (this.f7820Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC1225feyxiexzfUjhhgtg.m2689Ujhhgtgfeyxiexzf(this.f7821Ujhhgtgfeyxiexzf));
        sb.append("-annotation ");
        sb.append(this.f7820Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        sb.append(" {");
        boolean z = true;
        for (C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf : this.f7822Ujhhgtgfeyxiexzf.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
            sb.append(": ");
            sb.append(c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3665Ujhhgtgfeyxiexzf(C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf) {
        m1729Ujhhgtgfeyxiexzf();
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf;
        TreeMap treeMap = this.f7822Ujhhgtgfeyxiexzf;
        if (treeMap.get(c3056Ujhhgtgfeyxiexzf) == null) {
            treeMap.put(c3056Ujhhgtgfeyxiexzf, c0412Ujhhgtgfeyxiexzf);
        } else {
            throw new IllegalArgumentException("name already added: " + c3056Ujhhgtgfeyxiexzf);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf) {
        int iCompareTo = this.f7820Ujhhgtgfeyxiexzf.compareTo(c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = c2413Ujhhgtgfeyxiexzf.f7821Ujhhgtgfeyxiexzf;
        int i2 = this.f7821Ujhhgtgfeyxiexzf;
        if (i2 == 0 || i == 0) {
            throw null;
        }
        int i3 = i2 - i;
        if (i3 != 0) {
            return i3;
        }
        Iterator it = this.f7822Ujhhgtgfeyxiexzf.values().iterator();
        Iterator it2 = c2413Ujhhgtgfeyxiexzf.f7822Ujhhgtgfeyxiexzf.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf = (C0412Ujhhgtgfeyxiexzf) it.next();
            C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf2 = (C0412Ujhhgtgfeyxiexzf) it2.next();
            int iCompareTo2 = c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf.compareTo(c0412Ujhhgtgfeyxiexzf2.f2233Ujhhgtgfeyxiexzf);
            if (iCompareTo2 == 0) {
                iCompareTo2 = c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf.compareTo(c0412Ujhhgtgfeyxiexzf2.f2234Ujhhgtgfeyxiexzf);
            }
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m3667Ujhhgtgfeyxiexzf(C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf) {
        m1729Ujhhgtgfeyxiexzf();
        this.f7822Ujhhgtgfeyxiexzf.put(c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf, c0412Ujhhgtgfeyxiexzf);
    }
}
