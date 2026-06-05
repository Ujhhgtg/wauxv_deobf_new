package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2415Ujhhgtgfeyxiexzf extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7825Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public List f7826Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2415Ujhhgtgfeyxiexzf(int i) {
        this.f7825Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        int iM4960Ujhhgtgfeyxiexzf2;
        switch (this.f7825Ujhhgtgfeyxiexzf) {
            case 0:
                List list = this.f7826Ujhhgtgfeyxiexzf;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C2414Ujhhgtgfeyxiexzf) it.next()).mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
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
            default:
                List list2 = this.f7826Ujhhgtgfeyxiexzf;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((C2812Ujhhgtgfeyxiexzf) it2.next()).mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
                    }
                    iM4960Ujhhgtgfeyxiexzf2 = c3470Ujhhgtgfeyxiexzf.m4960Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList2));
                } else {
                    iM4960Ujhhgtgfeyxiexzf2 = 0;
                }
                c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(3);
                c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(2, 0);
                c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf2);
                c3470Ujhhgtgfeyxiexzf.m4955Ujhhgtgfeyxiexzf((byte) 0, 1);
                int iM4961Ujhhgtgfeyxiexzf2 = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
                c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf2);
                return iM4961Ujhhgtgfeyxiexzf2;
        }
    }
}
