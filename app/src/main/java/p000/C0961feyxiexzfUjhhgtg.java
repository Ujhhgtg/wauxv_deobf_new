package p000;

import com.umeng.analytics.pro.bv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛳᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0961feyxiexzfUjhhgtg implements InterfaceC1793feyxiexzfUjhhgtg, InterfaceC1724Ujhhgtgfeyxiexzf, Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final ConcurrentHashMap f3828Ujhhgtgfeyxiexzf = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C3511Ujhhgtgfeyxiexzf f3829Ujhhgtgfeyxiexzf = new C3511Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f3830Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC1793feyxiexzfUjhhgtg f3831Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0258Ujhhgtgfeyxiexzf f3832Ujhhgtgfeyxiexzf;

    public C0961feyxiexzfUjhhgtg(int i, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg, C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC1793feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("type == null");
        }
        this.f3830Ujhhgtgfeyxiexzf = i;
        this.f3831Ujhhgtgfeyxiexzf = interfaceC1793feyxiexzfUjhhgtg;
        this.f3832Ujhhgtgfeyxiexzf = c0258Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C0961feyxiexzfUjhhgtg m2451Ujhhgtgfeyxiexzf(int i, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg, C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf) {
        C0965feyxiexzfUjhhgtg c0965feyxiexzfUjhhgtg = (C0965feyxiexzfUjhhgtg) f3829Ujhhgtgfeyxiexzf.get();
        c0965feyxiexzfUjhhgtg.f3836Ujhhgtgfeyxiexzf = i;
        c0965feyxiexzfUjhhgtg.f3837Ujhhgtgfeyxiexzf = interfaceC1793feyxiexzfUjhhgtg;
        c0965feyxiexzfUjhhgtg.f3838Ujhhgtgfeyxiexzf = c0258Ujhhgtgfeyxiexzf;
        ConcurrentHashMap concurrentHashMap = f3828Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) concurrentHashMap.get(c0965feyxiexzfUjhhgtg);
        if (c0961feyxiexzfUjhhgtg == null) {
            c0961feyxiexzfUjhhgtg = new C0961feyxiexzfUjhhgtg(c0965feyxiexzfUjhhgtg.f3836Ujhhgtgfeyxiexzf, c0965feyxiexzfUjhhgtg.f3837Ujhhgtgfeyxiexzf, c0965feyxiexzfUjhhgtg.f3838Ujhhgtgfeyxiexzf);
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2 = (C0961feyxiexzfUjhhgtg) concurrentHashMap.putIfAbsent(c0961feyxiexzfUjhhgtg, c0961feyxiexzfUjhhgtg);
            if (c0961feyxiexzfUjhhgtg2 != null) {
                return c0961feyxiexzfUjhhgtg2;
            }
        }
        return c0961feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0961feyxiexzfUjhhgtg) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) obj;
            return m2453Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg.f3832Ujhhgtgfeyxiexzf);
        }
        if (!(obj instanceof C0965feyxiexzfUjhhgtg)) {
            return false;
        }
        C0965feyxiexzfUjhhgtg c0965feyxiexzfUjhhgtg = (C0965feyxiexzfUjhhgtg) obj;
        return m2453Ujhhgtgfeyxiexzf(c0965feyxiexzfUjhhgtg.f3836Ujhhgtgfeyxiexzf, c0965feyxiexzfUjhhgtg.f3837Ujhhgtgfeyxiexzf, c0965feyxiexzfUjhhgtg.f3838Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType() {
        return this.f3831Ujhhgtgfeyxiexzf.getType();
    }

    public final int hashCode() {
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf = this.f3832Ujhhgtgfeyxiexzf;
        return ((this.f3831Ujhhgtgfeyxiexzf.hashCode() + ((c0258Ujhhgtgfeyxiexzf != null ? c0258Ujhhgtgfeyxiexzf.hashCode() : 0) * 31)) * 31) + this.f3830Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return m2458Ujhhgtgfeyxiexzf(false);
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return m2458Ujhhgtgfeyxiexzf(true);
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final int mo2410Ujhhgtgfeyxiexzf() {
        return this.f3831Ujhhgtgfeyxiexzf.mo2410Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo2411Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        int i = c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtg.f3832Ujhhgtgfeyxiexzf;
        int i2 = this.f3830Ujhhgtgfeyxiexzf;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c0961feyxiexzfUjhhgtg) {
            return 0;
        }
        int iCompareTo = this.f3831Ujhhgtgfeyxiexzf.getType().f6017Ujhhgtgfeyxiexzf.compareTo(c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType().f6017Ujhhgtgfeyxiexzf);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf2 = this.f3832Ujhhgtgfeyxiexzf;
        if (c0258Ujhhgtgfeyxiexzf2 == null) {
            return c0258Ujhhgtgfeyxiexzf == null ? 0 : -1;
        }
        if (c0258Ujhhgtgfeyxiexzf == null) {
            return 1;
        }
        return c0258Ujhhgtgfeyxiexzf2.compareTo(c0258Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo2412Ujhhgtgfeyxiexzf() {
        return this.f3831Ujhhgtgfeyxiexzf.mo2412Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m2453Ujhhgtgfeyxiexzf(int i, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg, C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf) {
        if (this.f3830Ujhhgtgfeyxiexzf != i || !this.f3831Ujhhgtgfeyxiexzf.equals(interfaceC1793feyxiexzfUjhhgtg)) {
            return false;
        }
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf2 = this.f3832Ujhhgtgfeyxiexzf;
        if (c0258Ujhhgtgfeyxiexzf2 != c0258Ujhhgtgfeyxiexzf) {
            return c0258Ujhhgtgfeyxiexzf2 != null && c0258Ujhhgtgfeyxiexzf2.equals(c0258Ujhhgtgfeyxiexzf);
        }
        return true;
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final InterfaceC1793feyxiexzfUjhhgtg mo2413Ujhhgtgfeyxiexzf() {
        return this.f3831Ujhhgtgfeyxiexzf.mo2413Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m2454Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        return m2456Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg) && this.f3830Ujhhgtgfeyxiexzf == c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m2455Ujhhgtgfeyxiexzf() {
        return this.f3831Ujhhgtgfeyxiexzf.getType().m3119Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean m2456Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        if (c0961feyxiexzfUjhhgtg != null && this.f3831Ujhhgtgfeyxiexzf.getType().equals(c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType())) {
            Object obj = c0961feyxiexzfUjhhgtg.f3832Ujhhgtgfeyxiexzf;
            C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf = this.f3832Ujhhgtgfeyxiexzf;
            if (c0258Ujhhgtgfeyxiexzf == obj) {
                return true;
            }
            if (c0258Ujhhgtgfeyxiexzf != null && c0258Ujhhgtgfeyxiexzf.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final String m2457Ujhhgtgfeyxiexzf() {
        return AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(this.f3830Ujhhgtgfeyxiexzf, bv.aE);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final String m2458Ujhhgtgfeyxiexzf(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m2457Ujhhgtgfeyxiexzf());
        sb.append(":");
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf = this.f3832Ujhhgtgfeyxiexzf;
        if (c0258Ujhhgtgfeyxiexzf != null) {
            sb.append(c0258Ujhhgtgfeyxiexzf.toString());
        }
        InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg = this.f3831Ujhhgtgfeyxiexzf;
        C1784feyxiexzfUjhhgtg type = interfaceC1793feyxiexzfUjhhgtg.getType();
        sb.append(type);
        if (type != interfaceC1793feyxiexzfUjhhgtg) {
            sb.append("=");
            if (z && (interfaceC1793feyxiexzfUjhhgtg instanceof C3056Ujhhgtgfeyxiexzf)) {
                sb.append(((C3056Ujhhgtgfeyxiexzf) interfaceC1793feyxiexzfUjhhgtg).m4537Ujhhgtgfeyxiexzf());
            } else if (z && (interfaceC1793feyxiexzfUjhhgtg instanceof AbstractC3638Ujhhgtgfeyxiexzf)) {
                sb.append(interfaceC1793feyxiexzfUjhhgtg.mo1392Ujhhgtgfeyxiexzf());
            } else {
                sb.append(interfaceC1793feyxiexzfUjhhgtg);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg m2459Ujhhgtgfeyxiexzf(int i) {
        return this.f3830Ujhhgtgfeyxiexzf == i ? this : m2451Ujhhgtgfeyxiexzf(i, this.f3831Ujhhgtgfeyxiexzf, this.f3832Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg m2460Ujhhgtgfeyxiexzf(InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg) {
        return m2451Ujhhgtgfeyxiexzf(this.f3830Ujhhgtgfeyxiexzf, interfaceC1793feyxiexzfUjhhgtg, this.f3832Ujhhgtgfeyxiexzf);
    }
}
