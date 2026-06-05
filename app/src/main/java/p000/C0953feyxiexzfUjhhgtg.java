package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴ要点脸能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0953feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractC2229feyxiexzfUjhhgtg f3820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ArrayList f3821Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static long m2440Ujhhgtgfeyxiexzf(C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg, long j) {
        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg.f10227Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c3259feyxiexzfUjhhgtg.f10234Ujhhgtgfeyxiexzf;
        if (abstractC2229feyxiexzfUjhhgtg instanceof C0552Ujhhgtgfeyxiexzf) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg = (InterfaceC3257feyxiexzfUjhhgtg) arrayList.get(i);
            if (interfaceC3257feyxiexzfUjhhgtg instanceof C3259feyxiexzfUjhhgtg) {
                C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = (C3259feyxiexzfUjhhgtg) interfaceC3257feyxiexzfUjhhgtg;
                if (c3259feyxiexzfUjhhgtg2.f10227Ujhhgtgfeyxiexzf != abstractC2229feyxiexzfUjhhgtg) {
                    jMin = Math.min(jMin, m2440Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, ((long) c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf) + j));
                }
            }
        }
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg3 = abstractC2229feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg4 = abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf;
        if (c3259feyxiexzfUjhhgtg != c3259feyxiexzfUjhhgtg3) {
            return jMin;
        }
        long jMo3395Ujhhgtgfeyxiexzf = j - abstractC2229feyxiexzfUjhhgtg.mo3395Ujhhgtgfeyxiexzf();
        return Math.min(Math.min(jMin, m2440Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg4, jMo3395Ujhhgtgfeyxiexzf)), jMo3395Ujhhgtgfeyxiexzf - ((long) c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static long m2441Ujhhgtgfeyxiexzf(C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg, long j) {
        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg.f10227Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c3259feyxiexzfUjhhgtg.f10234Ujhhgtgfeyxiexzf;
        if (abstractC2229feyxiexzfUjhhgtg instanceof C0552Ujhhgtgfeyxiexzf) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg = (InterfaceC3257feyxiexzfUjhhgtg) arrayList.get(i);
            if (interfaceC3257feyxiexzfUjhhgtg instanceof C3259feyxiexzfUjhhgtg) {
                C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = (C3259feyxiexzfUjhhgtg) interfaceC3257feyxiexzfUjhhgtg;
                if (c3259feyxiexzfUjhhgtg2.f10227Ujhhgtgfeyxiexzf != abstractC2229feyxiexzfUjhhgtg) {
                    jMax = Math.max(jMax, m2441Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, ((long) c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf) + j));
                }
            }
        }
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg3 = abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg4 = abstractC2229feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf;
        if (c3259feyxiexzfUjhhgtg != c3259feyxiexzfUjhhgtg3) {
            return jMax;
        }
        long jMo3395Ujhhgtgfeyxiexzf = abstractC2229feyxiexzfUjhhgtg.mo3395Ujhhgtgfeyxiexzf() + j;
        return Math.max(Math.max(jMax, m2441Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg4, jMo3395Ujhhgtgfeyxiexzf)), jMo3395Ujhhgtgfeyxiexzf - ((long) c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf));
    }
}
