package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛳᛴ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0963feyxiexzfUjhhgtg extends AbstractC0417Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg[] f3833Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3834Ujhhgtgfeyxiexzf;

    static {
        new C0963feyxiexzfUjhhgtg(0);
    }

    public C0963feyxiexzfUjhhgtg(int i) {
        super(i != 0);
        this.f3833Ujhhgtgfeyxiexzf = new C0961feyxiexzfUjhhgtg[i];
        this.f3834Ujhhgtgfeyxiexzf = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0963feyxiexzfUjhhgtg)) {
            return false;
        }
        C0963feyxiexzfUjhhgtg c0963feyxiexzfUjhhgtg = (C0963feyxiexzfUjhhgtg) obj;
        C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr = c0963feyxiexzfUjhhgtg.f3833Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr2 = this.f3833Ujhhgtgfeyxiexzf;
        int length = c0961feyxiexzfUjhhgtgArr2.length;
        if (length != c0961feyxiexzfUjhhgtgArr.length || size() != c0963feyxiexzfUjhhgtg.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = c0961feyxiexzfUjhhgtgArr2[i];
            Object obj2 = c0961feyxiexzfUjhhgtgArr[i];
            if (c0961feyxiexzfUjhhgtg != obj2 && (c0961feyxiexzfUjhhgtg == null || !c0961feyxiexzfUjhhgtg.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr = this.f3833Ujhhgtgfeyxiexzf;
        int length = c0961feyxiexzfUjhhgtgArr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = c0961feyxiexzfUjhhgtgArr[i];
            iHashCode = (iHashCode * 31) + (c0961feyxiexzfUjhhgtg == null ? 0 : c0961feyxiexzfUjhhgtg.hashCode());
        }
        return iHashCode;
    }

    public final int size() {
        int i = this.f3834Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg : this.f3833Ujhhgtgfeyxiexzf) {
            if (c0961feyxiexzfUjhhgtg != null) {
                i2++;
            }
        }
        this.f3834Ujhhgtgfeyxiexzf = i2;
        return i2;
    }

    public final String toString() {
        C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr = this.f3833Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder(c0961feyxiexzfUjhhgtgArr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg : c0961feyxiexzfUjhhgtgArr) {
            if (c0961feyxiexzfUjhhgtg != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c0961feyxiexzfUjhhgtg);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg m2461Ujhhgtgfeyxiexzf(int i) {
        try {
            return this.f3833Ujhhgtgfeyxiexzf[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2462Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        int i;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2;
        C0961feyxiexzfUjhhgtg[] c0961feyxiexzfUjhhgtgArr = this.f3833Ujhhgtgfeyxiexzf;
        m1729Ujhhgtgfeyxiexzf();
        if (c0961feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("spec == null");
        }
        this.f3834Ujhhgtgfeyxiexzf = -1;
        try {
            int i2 = c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
            c0961feyxiexzfUjhhgtgArr[i2] = c0961feyxiexzfUjhhgtg;
            if (i2 > 0 && (c0961feyxiexzfUjhhgtg2 = c0961feyxiexzfUjhhgtgArr[(i = i2 - 1)]) != null && c0961feyxiexzfUjhhgtg2.m2455Ujhhgtgfeyxiexzf() == 2) {
                c0961feyxiexzfUjhhgtgArr[i] = null;
            }
            if (c0961feyxiexzfUjhhgtg.m2455Ujhhgtgfeyxiexzf() == 2) {
                c0961feyxiexzfUjhhgtgArr[i2 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m2463Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        try {
            this.f3833Ujhhgtgfeyxiexzf[c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf] = null;
            this.f3834Ujhhgtgfeyxiexzf = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }
}
