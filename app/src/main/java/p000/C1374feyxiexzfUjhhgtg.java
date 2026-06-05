package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛴᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1374feyxiexzfUjhhgtg extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f4867Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2946feyxiexzfUjhhgtg f4868Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        List<C1378feyxiexzfUjhhgtg> list = this.f4867Ujhhgtgfeyxiexzf;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            for (C1378feyxiexzfUjhhgtg c1378feyxiexzfUjhhgtg : list) {
                if (c1378feyxiexzfUjhhgtg == null) {
                    c1378feyxiexzfUjhhgtg = new C1378feyxiexzfUjhhgtg();
                }
                arrayList.add(Integer.valueOf(c1378feyxiexzfUjhhgtg.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
            }
            iM4960Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4960Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList));
        } else {
            iM4960Ujhhgtgfeyxiexzf = 0;
        }
        C2946feyxiexzfUjhhgtg c2946feyxiexzfUjhhgtg = this.f4868Ujhhgtgfeyxiexzf;
        int iMo1527Ujhhgtgfeyxiexzf = c2946feyxiexzfUjhhgtg != null ? c2946feyxiexzfUjhhgtg.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf) : 0;
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(2);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(1, iMo1527Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
