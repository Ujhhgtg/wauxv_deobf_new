package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛳᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2428Ujhhgtgfeyxiexzf extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f7860Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        List list = this.f7860Ujhhgtgfeyxiexzf;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2421Ujhhgtgfeyxiexzf) it.next()).mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
            }
            iM4960Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4960Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList));
        } else {
            iM4960Ujhhgtgfeyxiexzf = 0;
        }
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(3);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(2, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4955Ujhhgtgfeyxiexzf((byte) 0, 1);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
