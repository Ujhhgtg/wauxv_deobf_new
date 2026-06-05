package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3433feyxiexzfUjhhgtg extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f10699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2946feyxiexzfUjhhgtg f10700Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        List list = this.f10699Ujhhgtgfeyxiexzf;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C3426feyxiexzfUjhhgtg) it.next()).mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
            }
            iM4960Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4960Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList));
        } else {
            iM4960Ujhhgtgfeyxiexzf = 0;
        }
        C2946feyxiexzfUjhhgtg c2946feyxiexzfUjhhgtg = this.f10700Ujhhgtgfeyxiexzf;
        int iMo1527Ujhhgtgfeyxiexzf = c2946feyxiexzfUjhhgtg != null ? c2946feyxiexzfUjhhgtg.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf) : 0;
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(3);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(2, iMo1527Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4955Ujhhgtgfeyxiexzf((byte) 0, 1);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4922Ujhhgtgfeyxiexzf(Class cls) {
        C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg = new C3426feyxiexzfUjhhgtg();
        C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
        C2812Ujhhgtgfeyxiexzf.m4140Ujhhgtgfeyxiexzf(c2812Ujhhgtgfeyxiexzf, AbstractC3273feyxiexzfUjhhgtg.m4780Ujhhgtgfeyxiexzf(cls));
        c3426feyxiexzfUjhhgtg.f10690Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
        List arrayList = this.f10699Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f10699Ujhhgtgfeyxiexzf = arrayList;
        arrayList.add(c3426feyxiexzfUjhhgtg);
    }
}
