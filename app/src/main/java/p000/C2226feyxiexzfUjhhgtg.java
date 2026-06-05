package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2226feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static int f7241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public ArrayList f7242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f7243Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f7244Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ArrayList f7245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f7246Ujhhgtgfeyxiexzf;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f7244Ujhhgtgfeyxiexzf;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM2705Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.f7243Ujhhgtgfeyxiexzf, "] <");
        for (C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf : this.f7242Ujhhgtgfeyxiexzf) {
            StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(strM2705Ujhhgtgfeyxiexzf, " ");
            sbM4805Ujhhgtgfeyxiexzf.append(c3655Ujhhgtgfeyxiexzf.f11623Ujhhgtgfeyxiexzf);
            strM2705Ujhhgtgfeyxiexzf = sbM4805Ujhhgtgfeyxiexzf.toString();
        }
        return AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2705Ujhhgtgfeyxiexzf, " >");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3387Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        int size = this.f7242Ujhhgtgfeyxiexzf.size();
        if (this.f7246Ujhhgtgfeyxiexzf != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2226feyxiexzfUjhhgtg c2226feyxiexzfUjhhgtg = (C2226feyxiexzfUjhhgtg) arrayList.get(i);
                if (this.f7246Ujhhgtgfeyxiexzf == c2226feyxiexzfUjhhgtg.f7243Ujhhgtgfeyxiexzf) {
                    m3389Ujhhgtgfeyxiexzf(this.f7244Ujhhgtgfeyxiexzf, c2226feyxiexzfUjhhgtg);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m3388Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, int i) {
        int iM1086Ujhhgtgfeyxiexzf;
        int iM1086Ujhhgtgfeyxiexzf2;
        ArrayList arrayList = this.f7242Ujhhgtgfeyxiexzf;
        if (arrayList.size() == 0) {
            return 0;
        }
        C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf = (C3656Ujhhgtgfeyxiexzf) ((C3655Ujhhgtgfeyxiexzf) arrayList.get(0)).f11609feyxiexzfUjhhgtg;
        c0072Ujhhgtgfeyxiexzf.m1105Ujhhgtgfeyxiexzf();
        c3656Ujhhgtgfeyxiexzf.mo1812Ujhhgtgfeyxiexzf(c0072Ujhhgtgfeyxiexzf, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C3655Ujhhgtgfeyxiexzf) arrayList.get(i2)).mo1812Ujhhgtgfeyxiexzf(c0072Ujhhgtgfeyxiexzf, false);
        }
        if (i == 0 && c3656Ujhhgtgfeyxiexzf.f11640Ujhhgtgfeyxiexzf > 0) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1876Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, c0072Ujhhgtgfeyxiexzf, arrayList, 0);
        }
        if (i == 1 && c3656Ujhhgtgfeyxiexzf.f11641feyxiexzfUjhhgtg > 0) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1876Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf, c0072Ujhhgtgfeyxiexzf, arrayList, 1);
        }
        try {
            c0072Ujhhgtgfeyxiexzf.m1101Ujhhgtgfeyxiexzf();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f7245Ujhhgtgfeyxiexzf = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = (C3655Ujhhgtgfeyxiexzf) arrayList.get(i3);
            C1866feyxiexzfUjhhgtg c1866feyxiexzfUjhhgtg = new C1866feyxiexzfUjhhgtg();
            new WeakReference(c3655Ujhhgtgfeyxiexzf);
            C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg);
            C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg);
            C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg);
            C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg);
            C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11602feyxiexzfUjhhgtg);
            this.f7245Ujhhgtgfeyxiexzf.add(c1866feyxiexzfUjhhgtg);
        }
        if (i == 0) {
            iM1086Ujhhgtgfeyxiexzf = C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg);
            iM1086Ujhhgtgfeyxiexzf2 = C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg);
            c0072Ujhhgtgfeyxiexzf.m1105Ujhhgtgfeyxiexzf();
        } else {
            iM1086Ujhhgtgfeyxiexzf = C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg);
            iM1086Ujhhgtgfeyxiexzf2 = C0072Ujhhgtgfeyxiexzf.m1086Ujhhgtgfeyxiexzf(c3656Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg);
            c0072Ujhhgtgfeyxiexzf.m1105Ujhhgtgfeyxiexzf();
        }
        return iM1086Ujhhgtgfeyxiexzf2 - iM1086Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3389Ujhhgtgfeyxiexzf(int i, C2226feyxiexzfUjhhgtg c2226feyxiexzfUjhhgtg) {
        int i2 = c2226feyxiexzfUjhhgtg.f7243Ujhhgtgfeyxiexzf;
        for (C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf : this.f7242Ujhhgtgfeyxiexzf) {
            ArrayList arrayList = c2226feyxiexzfUjhhgtg.f7242Ujhhgtgfeyxiexzf;
            if (!arrayList.contains(c3655Ujhhgtgfeyxiexzf)) {
                arrayList.add(c3655Ujhhgtgfeyxiexzf);
            }
            if (i == 0) {
                c3655Ujhhgtgfeyxiexzf.f11629feyxiexzfUjhhgtg = i2;
            } else {
                c3655Ujhhgtgfeyxiexzf.f11630Ujhhgtgfeyxiexzf = i2;
            }
        }
        this.f7246Ujhhgtgfeyxiexzf = i2;
    }
}
