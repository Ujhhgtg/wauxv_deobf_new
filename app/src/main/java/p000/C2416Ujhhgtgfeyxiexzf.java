package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2416Ujhhgtgfeyxiexzf extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f7827Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f7828Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m3668Ujhhgtgfeyxiexzf(C2416Ujhhgtgfeyxiexzf c2416Ujhhgtgfeyxiexzf, String str) {
        c2416Ujhhgtgfeyxiexzf.getClass();
        C2417Ujhhgtgfeyxiexzf c2417Ujhhgtgfeyxiexzf = new C2417Ujhhgtgfeyxiexzf();
        c2417Ujhhgtgfeyxiexzf.f7829Ujhhgtgfeyxiexzf = new C1155feyxiexzfUjhhgtg(str, 5, false);
        c2417Ujhhgtgfeyxiexzf.f7830Ujhhgtgfeyxiexzf = 8;
        List arrayList = c2416Ujhhgtgfeyxiexzf.f7827Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c2416Ujhhgtgfeyxiexzf.f7827Ujhhgtgfeyxiexzf = arrayList;
        arrayList.add(c2417Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC1937feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo1527Ujhhgtgfeyxiexzf(C3470Ujhhgtgfeyxiexzf c3470Ujhhgtgfeyxiexzf) {
        int iM4962Ujhhgtgfeyxiexzf;
        int iM4962Ujhhgtgfeyxiexzf2;
        List list = this.f7827Ujhhgtgfeyxiexzf;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1918Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2690Ujhhgtgfeyxiexzf(((C2417Ujhhgtgfeyxiexzf) it.next()).f7830Ujhhgtgfeyxiexzf)));
            }
            byte[] bArrM5229feyxiexzfUjhhgtg = AbstractC3611Ujhhgtgfeyxiexzf.m5229feyxiexzfUjhhgtg(arrayList);
            c3470Ujhhgtgfeyxiexzf.m4968Ujhhgtgfeyxiexzf(1, bArrM5229feyxiexzfUjhhgtg.length, 1);
            for (int length = bArrM5229feyxiexzfUjhhgtg.length - 1; -1 < length; length--) {
                c3470Ujhhgtgfeyxiexzf.m4954Ujhhgtgfeyxiexzf(bArrM5229feyxiexzfUjhhgtg[length]);
            }
            iM4962Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4962Ujhhgtgfeyxiexzf();
        } else {
            iM4962Ujhhgtgfeyxiexzf = 0;
        }
        List list2 = this.f7827Ujhhgtgfeyxiexzf;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C2417Ujhhgtgfeyxiexzf) it2.next()).f7829Ujhhgtgfeyxiexzf.mo1527Ujhhgtgfeyxiexzf(c3470Ujhhgtgfeyxiexzf)));
            }
            int[] iArrM4252feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList2);
            c3470Ujhhgtgfeyxiexzf.m4968Ujhhgtgfeyxiexzf(4, iArrM4252feyxiexzfUjhhgtg.length, 4);
            for (int length2 = iArrM4252feyxiexzfUjhhgtg.length - 1; -1 < length2; length2--) {
                c3470Ujhhgtgfeyxiexzf.m4956Ujhhgtgfeyxiexzf(iArrM4252feyxiexzfUjhhgtg[length2]);
            }
            iM4962Ujhhgtgfeyxiexzf2 = c3470Ujhhgtgfeyxiexzf.m4962Ujhhgtgfeyxiexzf();
        } else {
            iM4962Ujhhgtgfeyxiexzf2 = 0;
        }
        byte bM4791Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4791Ujhhgtgfeyxiexzf(this.f7828Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4967Ujhhgtgfeyxiexzf(4);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(3, 0);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(1, iM4962Ujhhgtgfeyxiexzf2);
        c3470Ujhhgtgfeyxiexzf.m4957Ujhhgtgfeyxiexzf(0, iM4962Ujhhgtgfeyxiexzf);
        c3470Ujhhgtgfeyxiexzf.m4955Ujhhgtgfeyxiexzf(bM4791Ujhhgtgfeyxiexzf, 2);
        int iM4961Ujhhgtgfeyxiexzf = c3470Ujhhgtgfeyxiexzf.m4961Ujhhgtgfeyxiexzf();
        c3470Ujhhgtgfeyxiexzf.m4963Ujhhgtgfeyxiexzf(iM4961Ujhhgtgfeyxiexzf);
        return iM4961Ujhhgtgfeyxiexzf;
    }
}
