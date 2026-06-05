package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3452feyxiexzfUjhhgtg extends AbstractC2461feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f10737Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public List f10738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0394Ujhhgtgfeyxiexzf f10739Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4960Ujhhgtgfeyxiexzf;
        int iM4962Ujhhgtgfeyxiexzf;
        List list = this.f10737Ujhhgtgfeyxiexzf;
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
        List<C2803Ujhhgtgfeyxiexzf> list2 = this.f10738Ujhhgtgfeyxiexzf;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list2, 10));
            for (C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf : list2) {
                int i = c2803Ujhhgtgfeyxiexzf.f8117Ujhhgtgfeyxiexzf;
                if (i < 0) {
                    throw new IllegalStateException("not has id");
                }
                arrayList2.add(Long.valueOf((((long) c2803Ujhhgtgfeyxiexzf.f8118Ujhhgtgfeyxiexzf) << 32) | ((long) i)));
            }
            long[] jArrM4254Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4254Ujhhgtgfeyxiexzf(arrayList2);
            c3470Ujhhgtgfeyxiexzf.m4968Ujhhgtgfeyxiexzf(8, jArrM4254Ujhhgtgfeyxiexzf.length, 8);
            for (int length = jArrM4254Ujhhgtgfeyxiexzf.length - 1; -1 < length; length--) {
                long j = jArrM4254Ujhhgtgfeyxiexzf[length];
                c3470Ujhhgtgfeyxiexzf.m4965Ujhhgtgfeyxiexzf(8, 0);
                ByteBuffer byteBuffer = c3470Ujhhgtgfeyxiexzf.f10782Ujhhgtgfeyxiexzf;
                int i2 = c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf - 8;
                c3470Ujhhgtgfeyxiexzf.f10783Ujhhgtgfeyxiexzf = i2;
                byteBuffer.putLong(i2, j);
            }
            iM4962Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4962Ujhhgtgfeyxiexzf();
        } else {
            iM4962Ujhhgtgfeyxiexzf = 0;
        }
        C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = this.f10739Ujhhgtgfeyxiexzf;
        int iMo1527Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf != null ? c0394Ujhhgtgfeyxiexzf.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf) : 0;
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(7);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(6, iMo1527Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(4, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(3, iM4962Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(1, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4960Ujhhgtgfeyxiexzf);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4950Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
        interfaceC3549feyxiexzfUjhhgtg.invoke(c0394Ujhhgtgfeyxiexzf);
        this.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m4951Ujhhgtgfeyxiexzf(String... strArr) {
        this.f10737Ujhhgtgfeyxiexzf = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(strArr);
    }
}
