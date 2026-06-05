package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ能不能ᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0295Ujhhgtgfeyxiexzf extends AbstractC1090feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2419Ujhhgtgfeyxiexzf f1743Ujhhgtgfeyxiexzf = new C2419Ujhhgtgfeyxiexzf(14);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f1744Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final HashMap f1745Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f1746Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f1747Ujhhgtgfeyxiexzf;

    public C0295Ujhhgtgfeyxiexzf(String str, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, int i, int i2) {
        super(str, c3268feyxiexzfUjhhgtg, i);
        this.f1744Ujhhgtgfeyxiexzf = new ArrayList(100);
        this.f1745Ujhhgtgfeyxiexzf = new HashMap(100);
        this.f1746Ujhhgtgfeyxiexzf = i2;
        this.f1747Ujhhgtgfeyxiexzf = -1;
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int mo1504Ujhhgtgfeyxiexzf(AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf) {
        return ((AbstractC1335feyxiexzfUjhhgtg) abstractC0691Ujhhgtgfeyxiexzf).m2857Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Collection mo1505Ujhhgtgfeyxiexzf() {
        return this.f1744Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo1506Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1744Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC1335feyxiexzfUjhhgtg) arrayList.get(i)).mo1274Ujhhgtgfeyxiexzf(this.f4172Ujhhgtgfeyxiexzf);
                i++;
            }
        }
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int mo1507Ujhhgtgfeyxiexzf() {
        m2563Ujhhgtgfeyxiexzf();
        return this.f1747Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1508Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        boolean z = true;
        int iMo1294Ujhhgtgfeyxiexzf = 0;
        for (AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg : this.f1744Ujhhgtgfeyxiexzf) {
            if (zM3888Ujhhgtgfeyxiexzf) {
                if (z) {
                    z = false;
                } else {
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, "\n");
                }
            }
            int i = abstractC1335feyxiexzfUjhhgtg.f4812Ujhhgtgfeyxiexzf - 1;
            int i2 = (~i) & (iMo1294Ujhhgtgfeyxiexzf + i);
            if (iMo1294Ujhhgtgfeyxiexzf != i2) {
                c2608Ujhhgtgfeyxiexzf.m3898Ujhhgtgfeyxiexzf(i2 - iMo1294Ujhhgtgfeyxiexzf);
                iMo1294Ujhhgtgfeyxiexzf = i2;
            }
            abstractC1335feyxiexzfUjhhgtg.mo1295Ujhhgtgfeyxiexzf(this.f4172Ujhhgtgfeyxiexzf, c2608Ujhhgtgfeyxiexzf);
            iMo1294Ujhhgtgfeyxiexzf += abstractC1335feyxiexzfUjhhgtg.mo1294Ujhhgtgfeyxiexzf();
        }
        if (iMo1294Ujhhgtgfeyxiexzf != this.f1747Ujhhgtgfeyxiexzf) {
            throw new RuntimeException("output size mismatch");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m1509Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        m2564Ujhhgtgfeyxiexzf();
        try {
            if (abstractC1335feyxiexzfUjhhgtg.f4812Ujhhgtgfeyxiexzf > this.f4173Ujhhgtgfeyxiexzf) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f1744Ujhhgtgfeyxiexzf.add(abstractC1335feyxiexzfUjhhgtg);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final synchronized AbstractC1335feyxiexzfUjhhgtg m1510Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        m2564Ujhhgtgfeyxiexzf();
        AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg2 = (AbstractC1335feyxiexzfUjhhgtg) this.f1745Ujhhgtgfeyxiexzf.get(abstractC1335feyxiexzfUjhhgtg);
        if (abstractC1335feyxiexzfUjhhgtg2 != null) {
            return abstractC1335feyxiexzfUjhhgtg2;
        }
        m1509Ujhhgtgfeyxiexzf(abstractC1335feyxiexzfUjhhgtg);
        this.f1745Ujhhgtgfeyxiexzf.put(abstractC1335feyxiexzfUjhhgtg, abstractC1335feyxiexzfUjhhgtg);
        return abstractC1335feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m1511Ujhhgtgfeyxiexzf() {
        m2563Ujhhgtgfeyxiexzf();
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f1746Ujhhgtgfeyxiexzf);
        ArrayList arrayList = this.f1744Ujhhgtgfeyxiexzf;
        if (iM2713feyxiexzfUjhhgtg == 1) {
            Collections.sort(arrayList, f1743Ujhhgtgfeyxiexzf);
        } else if (iM2713feyxiexzfUjhhgtg == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo1294Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg = (AbstractC1335feyxiexzfUjhhgtg) arrayList.get(i);
            try {
                int iM2859Ujhhgtgfeyxiexzf = abstractC1335feyxiexzfUjhhgtg.m2859Ujhhgtgfeyxiexzf(this, iMo1294Ujhhgtgfeyxiexzf);
                if (iM2859Ujhhgtgfeyxiexzf < iMo1294Ujhhgtgfeyxiexzf) {
                    throw new RuntimeException("bogus place() result for " + abstractC1335feyxiexzfUjhhgtg);
                }
                iMo1294Ujhhgtgfeyxiexzf = abstractC1335feyxiexzfUjhhgtg.mo1294Ujhhgtgfeyxiexzf() + iM2859Ujhhgtgfeyxiexzf;
            } catch (RuntimeException e) {
                throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while placing " + abstractC1335feyxiexzfUjhhgtg, e);
            }
        }
        this.f1747Ujhhgtgfeyxiexzf = iMo1294Ujhhgtgfeyxiexzf;
    }
}
