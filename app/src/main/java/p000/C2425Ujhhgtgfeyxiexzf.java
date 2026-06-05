package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2425Ujhhgtgfeyxiexzf extends AbstractC0417Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2425Ujhhgtgfeyxiexzf f7853Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final TreeMap f7854Ujhhgtgfeyxiexzf = new TreeMap();

    static {
        C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf = new C2425Ujhhgtgfeyxiexzf();
        f7853Ujhhgtgfeyxiexzf = c2425Ujhhgtgfeyxiexzf;
        c2425Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static C2425Ujhhgtgfeyxiexzf m3672Ujhhgtgfeyxiexzf(C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf, C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf) {
        C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf2 = new C2425Ujhhgtgfeyxiexzf();
        c2425Ujhhgtgfeyxiexzf2.m3674Ujhhgtgfeyxiexzf(c2425Ujhhgtgfeyxiexzf);
        c2425Ujhhgtgfeyxiexzf2.m3673Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf);
        c2425Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
        return c2425Ujhhgtgfeyxiexzf2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2425Ujhhgtgfeyxiexzf) {
            return this.f7854Ujhhgtgfeyxiexzf.equals(((C2425Ujhhgtgfeyxiexzf) obj).f7854Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7854Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("annotations{");
        boolean z = true;
        for (C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf : this.f7854Ujhhgtgfeyxiexzf.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c2413Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3673Ujhhgtgfeyxiexzf(C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf) {
        m1729Ujhhgtgfeyxiexzf();
        if (c2413Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("annotation == null");
        }
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf;
        TreeMap treeMap = this.f7854Ujhhgtgfeyxiexzf;
        if (!treeMap.containsKey(c3057Ujhhgtgfeyxiexzf)) {
            treeMap.put(c3057Ujhhgtgfeyxiexzf, c2413Ujhhgtgfeyxiexzf);
        } else {
            throw new IllegalArgumentException("duplicate type: " + c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3674Ujhhgtgfeyxiexzf(C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf) {
        m1729Ujhhgtgfeyxiexzf();
        if (c2425Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c2425Ujhhgtgfeyxiexzf.f7854Ujhhgtgfeyxiexzf.values().iterator();
        while (it.hasNext()) {
            m3673Ujhhgtgfeyxiexzf((C2413Ujhhgtgfeyxiexzf) it.next());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf) {
        Iterator it = this.f7854Ujhhgtgfeyxiexzf.values().iterator();
        Iterator it2 = c2425Ujhhgtgfeyxiexzf.f7854Ujhhgtgfeyxiexzf.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM3666Ujhhgtgfeyxiexzf = ((C2413Ujhhgtgfeyxiexzf) it.next()).compareTo((C2413Ujhhgtgfeyxiexzf) it2.next());
            if (iM3666Ujhhgtgfeyxiexzf != 0) {
                return iM3666Ujhhgtgfeyxiexzf;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
