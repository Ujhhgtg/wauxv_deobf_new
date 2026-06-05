package p000;

import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2636feyxiexzfUjhhgtg extends AbstractC0644Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3136Ujhhgtgfeyxiexzf f8476Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2638feyxiexzfUjhhgtg f8477Ujhhgtgfeyxiexzf = null;

    public C2636feyxiexzfUjhhgtg(C3136Ujhhgtgfeyxiexzf c3136Ujhhgtgfeyxiexzf) {
        this.f8476Ujhhgtgfeyxiexzf = c3136Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8476Ujhhgtgfeyxiexzf.compareTo(((C2636feyxiexzfUjhhgtg) obj).f8476Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C3135Ujhhgtgfeyxiexzf c3135Ujhhgtgfeyxiexzf = this.f8476Ujhhgtgfeyxiexzf.f9727Ujhhgtgfeyxiexzf.f9753Ujhhgtgfeyxiexzf;
        C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10271Ujhhgtgfeyxiexzf;
        if (c3135Ujhhgtgfeyxiexzf == null) {
            c2635feyxiexzfUjhhgtg.getClass();
            throw new NullPointerException("callSite == null");
        }
        C2638feyxiexzfUjhhgtg c2638feyxiexzfUjhhgtg = (C2638feyxiexzfUjhhgtg) ((TreeMap) c2635feyxiexzfUjhhgtg.f8475Ujhhgtgfeyxiexzf).get(c3135Ujhhgtgfeyxiexzf);
        if (c2638feyxiexzfUjhhgtg == null) {
            C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10273Ujhhgtgfeyxiexzf;
            c2638feyxiexzfUjhhgtg = new C2638feyxiexzfUjhhgtg(c3135Ujhhgtgfeyxiexzf);
            c0295Ujhhgtgfeyxiexzf.m1509Ujhhgtgfeyxiexzf(c2638feyxiexzfUjhhgtg);
            ((TreeMap) c2635feyxiexzfUjhhgtg.f8475Ujhhgtgfeyxiexzf).put(c3135Ujhhgtgfeyxiexzf, c2638feyxiexzfUjhhgtg);
        }
        this.f8477Ujhhgtgfeyxiexzf = c2638feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2893Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1294Ujhhgtgfeyxiexzf() {
        return 4;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1295Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        int iM2857Ujhhgtgfeyxiexzf = this.f8477Ujhhgtgfeyxiexzf.m2857Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m1910Ujhhgtgfeyxiexzf() + ' ' + this.f8476Ujhhgtgfeyxiexzf.toString());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "call_site_off: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
    }
}
