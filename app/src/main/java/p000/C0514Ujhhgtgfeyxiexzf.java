package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛳᛲ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0514Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf[] f2456Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int[] f2457Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f2458Ujhhgtgfeyxiexzf;

    public C0514Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr) {
        super(c3216feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
        this.f2456Ujhhgtgfeyxiexzf = abstractC3638UjhhgtgfeyxiexzfArr;
        this.f2457Ujhhgtgfeyxiexzf = new int[abstractC3638UjhhgtgfeyxiexzfArr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f2457Ujhhgtgfeyxiexzf;
            if (i >= iArr.length) {
                this.f2458Ujhhgtgfeyxiexzf = -1;
                return;
            } else {
                if (abstractC3638UjhhgtgfeyxiexzfArr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            }
        }
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr = this.f2456Ujhhgtgfeyxiexzf;
            if (i >= abstractC3638UjhhgtgfeyxiexzfArr.length) {
                return sb.toString();
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(abstractC3638UjhhgtgfeyxiexzfArr[i].mo1392Ujhhgtgfeyxiexzf());
            i++;
        }
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String mo1803Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr = this.f2456Ujhhgtgfeyxiexzf;
            if (i >= abstractC3638UjhhgtgfeyxiexzfArr.length) {
                return sb.toString();
            }
            if (this.f2457Ujhhgtgfeyxiexzf[i] == -1) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(abstractC3638UjhhgtgfeyxiexzfArr[i].mo4533Ujhhgtgfeyxiexzf());
            sb.append('@');
            int iM1807Ujhhgtgfeyxiexzf = m1807Ujhhgtgfeyxiexzf(i);
            if (iM1807Ujhhgtgfeyxiexzf < 65536) {
                sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM1807Ujhhgtgfeyxiexzf));
            } else {
                sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1807Ujhhgtgfeyxiexzf));
            }
            i++;
        }
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String mo1804Ujhhgtgfeyxiexzf() {
        return mo1802Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1805Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg) {
        return new C0514Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg, this.f9499Ujhhgtgfeyxiexzf, this.f9500Ujhhgtgfeyxiexzf, this.f2456Ujhhgtgfeyxiexzf, this.f2457Ujhhgtgfeyxiexzf, this.f2458Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        return new C0514Ujhhgtgfeyxiexzf(this.f9498Ujhhgtgfeyxiexzf, this.f9499Ujhhgtgfeyxiexzf, c0960feyxiexzfUjhhgtg, this.f2456Ujhhgtgfeyxiexzf, this.f2457Ujhhgtgfeyxiexzf, this.f2458Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m1807Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f2457Ujhhgtgfeyxiexzf[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "index not yet set for constant ", " value = ");
        sbM4804Ujhhgtgfeyxiexzf.append(this.f2456Ujhhgtgfeyxiexzf[i]);
        throw new IllegalStateException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    public C0514Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr, int[] iArr, int i) {
        super(c3216feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
        this.f2456Ujhhgtgfeyxiexzf = abstractC3638UjhhgtgfeyxiexzfArr;
        this.f2457Ujhhgtgfeyxiexzf = iArr;
        this.f2458Ujhhgtgfeyxiexzf = i;
    }
}
