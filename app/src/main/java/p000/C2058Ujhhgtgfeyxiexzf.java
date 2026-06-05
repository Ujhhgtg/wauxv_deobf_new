package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2058Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2866feyxiexzfUjhhgtg f6763Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf f6764Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2866feyxiexzfUjhhgtg[] f6765Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f6766Ujhhgtgfeyxiexzf;

    public C2058Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg, C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf, C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr) {
        super(c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf);
        if (c2866feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("user == null");
        }
        if (c0684Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("cases == null");
        }
        if (c2866feyxiexzfUjhhgtgArr == null) {
            throw new NullPointerException("targets == null");
        }
        int i = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
        if (i != c2866feyxiexzfUjhhgtgArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (i > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f6763Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtg;
        this.f6764Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
        this.f6765Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtgArr;
        boolean z = true;
        if (i >= 2) {
            long jM3352Ujhhgtgfeyxiexzf = m3352Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf);
            long j = (((long) c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf) * 4) + 2;
            if (jM3352Ujhhgtgfeyxiexzf < 0 || jM3352Ujhhgtgfeyxiexzf > (j * 5) / 4) {
                z = false;
            }
        }
        this.f6766Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static long m3352Ujhhgtgfeyxiexzf(C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf) {
        long jM1944Ujhhgtgfeyxiexzf = (((((long) c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf - 1)) - ((long) c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(0))) + 1) * 2) + 4;
        if (jM1944Ujhhgtgfeyxiexzf <= 2147483647L) {
            return jM1944Ujhhgtgfeyxiexzf;
        }
        return -1L;
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder(100);
        C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr = this.f6765Ujhhgtgfeyxiexzf;
        int length = c2866feyxiexzfUjhhgtgArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f6764Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i));
            sb.append(": ");
            sb.append(c2866feyxiexzfUjhhgtgArr[i]);
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final int mo1865Ujhhgtgfeyxiexzf() {
        boolean z = this.f6766Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = this.f6764Ujhhgtgfeyxiexzf;
        return (int) (z ? m3352Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf) : (((long) c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf) * 4) + 2);
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final String mo1866Ujhhgtgfeyxiexzf() {
        int iM4544Ujhhgtgfeyxiexzf = this.f6763Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf();
        StringBuilder sb = new StringBuilder(100);
        C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr = this.f6765Ujhhgtgfeyxiexzf;
        int length = c2866feyxiexzfUjhhgtgArr.length;
        sb.append(this.f6766Ujhhgtgfeyxiexzf ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf));
        for (int i = 0; i < length; i++) {
            int iM4544Ujhhgtgfeyxiexzf2 = c2866feyxiexzfUjhhgtgArr[i].m4544Ujhhgtgfeyxiexzf();
            sb.append("\n  ");
            sb.append(this.f6764Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i));
            sb.append(": ");
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf2));
            sb.append(" // ");
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2805Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf2 - iM4544Ujhhgtgfeyxiexzf));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        return new C2058Ujhhgtgfeyxiexzf(this.f9499Ujhhgtgfeyxiexzf, this.f6763Ujhhgtgfeyxiexzf, this.f6764Ujhhgtgfeyxiexzf, this.f6765Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo1867Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        int iM4544Ujhhgtgfeyxiexzf;
        int iM4544Ujhhgtgfeyxiexzf2 = this.f6763Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf();
        int iMo3162Ujhhgtgfeyxiexzf = AbstractC3212feyxiexzfUjhhgtg.f9994feyxiexzfUjhhgtg.f10102Ujhhgtgfeyxiexzf.mo3162Ujhhgtgfeyxiexzf();
        C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr = this.f6765Ujhhgtgfeyxiexzf;
        int length = c2866feyxiexzfUjhhgtgArr.length;
        boolean z = this.f6766Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = this.f6764Ujhhgtgfeyxiexzf;
        int i = 0;
        if (!z) {
            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(512);
            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(length);
            for (int i2 = 0; i2 < length; i2++) {
                c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i2));
            }
            while (i < length) {
                c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtgArr[i].m4544Ujhhgtgfeyxiexzf() - iM4544Ujhhgtgfeyxiexzf2);
                i++;
            }
            return;
        }
        int iM1944Ujhhgtgfeyxiexzf = length == 0 ? 0 : c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(0);
        int iM1944Ujhhgtgfeyxiexzf2 = ((length == 0 ? 0 : c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(length - 1)) - iM1944Ujhhgtgfeyxiexzf) + 1;
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(bc.e);
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(iM1944Ujhhgtgfeyxiexzf2);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM1944Ujhhgtgfeyxiexzf);
        int i3 = 0;
        while (i < iM1944Ujhhgtgfeyxiexzf2) {
            if (c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i3) > iM1944Ujhhgtgfeyxiexzf + i) {
                iM4544Ujhhgtgfeyxiexzf = iMo3162Ujhhgtgfeyxiexzf;
            } else {
                iM4544Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtgArr[i3].m4544Ujhhgtgfeyxiexzf() - iM4544Ujhhgtgfeyxiexzf2;
                i3++;
            }
            c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM4544Ujhhgtgfeyxiexzf);
            i++;
        }
    }
}
