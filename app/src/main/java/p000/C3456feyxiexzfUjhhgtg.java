package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲᛱfeyxiexzfᛱ能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3456feyxiexzfUjhhgtg extends AbstractC2461feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f10745Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2812Ujhhgtgfeyxiexzf f10746Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        List list = this.f10745Ujhhgtgfeyxiexzf;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c3470Ujhhgtgfeyxiexzf.m4959Ujhhgtgfeyxiexzf((String) it.next())));
            }
            iM4960Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4960Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList));
        } else {
            iM4960Ujhhgtgfeyxiexzf = 0;
        }
        C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = this.f10746Ujhhgtgfeyxiexzf;
        int iMo1527Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf != null ? c2812Ujhhgtgfeyxiexzf.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf) : 0;
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(6);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(5, iMo1527Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(3, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(1, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4952Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
        interfaceC3549feyxiexzfUjhhgtg.invoke(c2812Ujhhgtgfeyxiexzf);
        this.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m4953Ujhhgtgfeyxiexzf(String... strArr) {
        this.f10745Ujhhgtgfeyxiexzf = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(strArr);
    }
}
