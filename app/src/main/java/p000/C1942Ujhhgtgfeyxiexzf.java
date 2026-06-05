package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸ᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1942Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final EnumC0704Ujhhgtgfeyxiexzf f6416Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final ArrayList f6417Ujhhgtgfeyxiexzf;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1942Ujhhgtgfeyxiexzf(EnumC0704Ujhhgtgfeyxiexzf enumC0704Ujhhgtgfeyxiexzf, ArrayList arrayList) {
        int iM3287Ujhhgtgfeyxiexzf = m3287Ujhhgtgfeyxiexzf(arrayList);
        AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg = (AbstractC1335feyxiexzfUjhhgtg) arrayList.get(0);
        super(iM3287Ujhhgtgfeyxiexzf, m3287Ujhhgtgfeyxiexzf(arrayList) + (abstractC1335feyxiexzfUjhhgtg.mo1294Ujhhgtgfeyxiexzf() * arrayList.size()));
        if (enumC0704Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f6417Ujhhgtgfeyxiexzf = arrayList;
        this.f6416Ujhhgtgfeyxiexzf = enumC0704Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m3287Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC1335feyxiexzfUjhhgtg) arrayList.get(0)).f4812Ujhhgtgfeyxiexzf);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1942Ujhhgtgfeyxiexzf.class.getName());
        sb.append(this.f6417Ujhhgtgfeyxiexzf);
        return sb.toString();
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        Iterator it = this.f6417Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((AbstractC1335feyxiexzfUjhhgtg) it.next()).mo1274Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return this.f6416Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        int iM2859Ujhhgtgfeyxiexzf = i + this.f4812Ujhhgtgfeyxiexzf;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        for (AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg : this.f6417Ujhhgtgfeyxiexzf) {
            int iMo1294Ujhhgtgfeyxiexzf = abstractC1335feyxiexzfUjhhgtg.mo1294Ujhhgtgfeyxiexzf();
            int i4 = abstractC1335feyxiexzfUjhhgtg.f4812Ujhhgtgfeyxiexzf;
            if (z) {
                z = false;
                i2 = iMo1294Ujhhgtgfeyxiexzf;
                i3 = i4;
            } else {
                if (iMo1294Ujhhgtgfeyxiexzf != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (i4 != i3) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM2859Ujhhgtgfeyxiexzf = abstractC1335feyxiexzfUjhhgtg.m2859Ujhhgtgfeyxiexzf(c0295Ujhhgtgfeyxiexzf, iM2859Ujhhgtgfeyxiexzf) + iMo1294Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        ArrayList arrayList = this.f6417Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + " " + this.f6416Ujhhgtgfeyxiexzf.f2911Ujhhgtgfeyxiexzf);
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1335feyxiexzfUjhhgtg) it.next()).mo1295Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf);
        }
    }
}
