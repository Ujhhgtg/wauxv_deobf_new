package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2635feyxiexzfUjhhgtg extends AbstractC1961feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final TreeMap f8474Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Object f8475Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2635feyxiexzfUjhhgtg(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, int i) {
        super("call_site_ids", c3268feyxiexzfUjhhgtg, 4);
        this.f8473Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                super("class_defs", c3268feyxiexzfUjhhgtg, 4);
                this.f8474Ujhhgtgfeyxiexzf = new TreeMap();
                this.f8475Ujhhgtgfeyxiexzf = null;
                break;
            default:
                this.f8474Ujhhgtgfeyxiexzf = new TreeMap();
                this.f8475Ujhhgtgfeyxiexzf = new TreeMap();
                break;
        }
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Collection mo1505Ujhhgtgfeyxiexzf() {
        switch (this.f8473Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f8474Ujhhgtgfeyxiexzf.values();
            default:
                ArrayList arrayList = (ArrayList) this.f8475Ujhhgtgfeyxiexzf;
                return arrayList != null ? arrayList : this.f8474Ujhhgtgfeyxiexzf.values();
        }
    }

    @Override // p000.AbstractC1961feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1298Ujhhgtgfeyxiexzf() {
        switch (this.f8473Ujhhgtgfeyxiexzf) {
            case 0:
                Iterator it = this.f8474Ujhhgtgfeyxiexzf.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((C2636feyxiexzfUjhhgtg) it.next()).m1911Ujhhgtgfeyxiexzf(i);
                    i++;
                }
                break;
            default:
                TreeMap treeMap = this.f8474Ujhhgtgfeyxiexzf;
                int size = treeMap.size();
                this.f8475Ujhhgtgfeyxiexzf = new ArrayList(size);
                Iterator it2 = treeMap.keySet().iterator();
                int iM3969Ujhhgtgfeyxiexzf = 0;
                while (it2.hasNext()) {
                    iM3969Ujhhgtgfeyxiexzf = m3969Ujhhgtgfeyxiexzf(iM3969Ujhhgtgfeyxiexzf, size - iM3969Ujhhgtgfeyxiexzf, (C1784feyxiexzfUjhhgtg) it2.next());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int m3969Ujhhgtgfeyxiexzf(int i, int i2, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        C2813Ujhhgtgfeyxiexzf c2813Ujhhgtgfeyxiexzf = (C2813Ujhhgtgfeyxiexzf) this.f8474Ujhhgtgfeyxiexzf.get(c1784feyxiexzfUjhhgtg);
        if (c2813Ujhhgtgfeyxiexzf == null || c2813Ujhhgtgfeyxiexzf.f2695Ujhhgtgfeyxiexzf >= 0) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c1784feyxiexzfUjhhgtg);
        }
        int i3 = i2 - 1;
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c2813Ujhhgtgfeyxiexzf.f8954Ujhhgtgfeyxiexzf;
        if (c3057Ujhhgtgfeyxiexzf != null) {
            i = m3969Ujhhgtgfeyxiexzf(i, i3, c3057Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf);
        }
        C1773Ujhhgtgfeyxiexzf c1773Ujhhgtgfeyxiexzf = c2813Ujhhgtgfeyxiexzf.f8955Ujhhgtgfeyxiexzf;
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = c1773Ujhhgtgfeyxiexzf == null ? C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf : c1773Ujhhgtgfeyxiexzf.f5949Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m3969Ujhhgtgfeyxiexzf(i, i3, interfaceC1790feyxiexzfUjhhgtg.getType(i4));
        }
        c2813Ujhhgtgfeyxiexzf.m1911Ujhhgtgfeyxiexzf(i);
        ((ArrayList) this.f8475Ujhhgtgfeyxiexzf).add(c2813Ujhhgtgfeyxiexzf);
        return i + 1;
    }
}
