package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2422Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2425Ujhhgtgfeyxiexzf f7839Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2420Ujhhgtgfeyxiexzf[] f7840Ujhhgtgfeyxiexzf;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2422Ujhhgtgfeyxiexzf(C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        try {
            TreeMap treeMap = c2425Ujhhgtgfeyxiexzf.f7854Ujhhgtgfeyxiexzf;
            super(4, (treeMap.size() * 4) + 4);
            this.f7839Ujhhgtgfeyxiexzf = c2425Ujhhgtgfeyxiexzf;
            this.f7840Ujhhgtgfeyxiexzf = new C2420Ujhhgtgfeyxiexzf[treeMap.size()];
            Iterator it = Collections.unmodifiableCollection(treeMap.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f7840Ujhhgtgfeyxiexzf[i] = new C2420Ujhhgtgfeyxiexzf((C2413Ujhhgtgfeyxiexzf) it.next(), c3268feyxiexzfUjhhgtg);
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f7839Ujhhgtgfeyxiexzf.f7854Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10273Ujhhgtgfeyxiexzf;
        C2420Ujhhgtgfeyxiexzf[] c2420UjhhgtgfeyxiexzfArr = this.f7840Ujhhgtgfeyxiexzf;
        int length = c2420UjhhgtgfeyxiexzfArr.length;
        for (int i = 0; i < length; i++) {
            c2420UjhhgtgfeyxiexzfArr[i] = (C2420Ujhhgtgfeyxiexzf) c0295Ujhhgtgfeyxiexzf.m1510Ujhhgtgfeyxiexzf(c2420UjhhgtgfeyxiexzfArr[i]);
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2898Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo2622Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        return this.f7839Ujhhgtgfeyxiexzf.compareTo(((C2422Ujhhgtgfeyxiexzf) abstractC1335feyxiexzfUjhhgtg).f7839Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        Arrays.sort(this.f7840Ujhhgtgfeyxiexzf, C2420Ujhhgtgfeyxiexzf.f7833Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        C2420Ujhhgtgfeyxiexzf[] c2420UjhhgtgfeyxiexzfArr = this.f7840Ujhhgtgfeyxiexzf;
        int length = c2420UjhhgtgfeyxiexzfArr.length;
        if (zM3888Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + " annotation set");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(length)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(length);
        for (int i = 0; i < length; i++) {
            int iM2857Ujhhgtgfeyxiexzf = c2420UjhhgtgfeyxiexzfArr[i].m2857Ujhhgtgfeyxiexzf();
            if (zM3888Ujhhgtgfeyxiexzf) {
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  entries[" + Integer.toHexString(i) + "]: " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf));
                C2420Ujhhgtgfeyxiexzf c2420Ujhhgtgfeyxiexzf = c2420UjhhgtgfeyxiexzfArr[i];
                c2420Ujhhgtgfeyxiexzf.getClass();
                C2413Ujhhgtgfeyxiexzf c2413Ujhhgtgfeyxiexzf = c2420Ujhhgtgfeyxiexzf.f7834Ujhhgtgfeyxiexzf;
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "    visibility: ".concat(AbstractC1225feyxiexzfUjhhgtg.m2689Ujhhgtgfeyxiexzf(c2413Ujhhgtgfeyxiexzf.f7821Ujhhgtgfeyxiexzf)));
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "    type: " + c2413Ujhhgtgfeyxiexzf.f7820Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
                for (C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf : Collections.unmodifiableCollection(c2413Ujhhgtgfeyxiexzf.f7822Ujhhgtgfeyxiexzf.values())) {
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "    " + c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + ": " + C2073feyxiexzfUjhhgtg.m3367Ujhhgtgfeyxiexzf(c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf));
                }
            }
            c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
        }
    }
}
