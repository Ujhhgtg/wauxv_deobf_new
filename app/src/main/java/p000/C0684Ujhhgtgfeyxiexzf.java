package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛴ能不能ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0684Ujhhgtgfeyxiexzf extends AbstractC0417Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C0684Ujhhgtgfeyxiexzf f2812Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int[] f2813Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2814Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f2815Ujhhgtgfeyxiexzf;

    static {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(0);
        f2812Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
        c0684Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
    }

    public C0684Ujhhgtgfeyxiexzf(int i) {
        super(true);
        try {
            this.f2813Ujhhgtgfeyxiexzf = new int[i];
            this.f2814Ujhhgtgfeyxiexzf = 0;
            this.f2815Ujhhgtgfeyxiexzf = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C0684Ujhhgtgfeyxiexzf m1941Ujhhgtgfeyxiexzf(int i) {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(1);
        c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i);
        c0684Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        return c0684Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0684Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = (C0684Ujhhgtgfeyxiexzf) obj;
        if (this.f2815Ujhhgtgfeyxiexzf != c0684Ujhhgtgfeyxiexzf.f2815Ujhhgtgfeyxiexzf || this.f2814Ujhhgtgfeyxiexzf != c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf) {
            return false;
        }
        for (int i = 0; i < this.f2814Ujhhgtgfeyxiexzf; i++) {
            if (this.f2813Ujhhgtgfeyxiexzf[i] != c0684Ujhhgtgfeyxiexzf.f2813Ujhhgtgfeyxiexzf[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2814Ujhhgtgfeyxiexzf; i2++) {
            i = (i * 31) + this.f2813Ujhhgtgfeyxiexzf[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2814Ujhhgtgfeyxiexzf * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f2814Ujhhgtgfeyxiexzf; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f2813Ujhhgtgfeyxiexzf[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m1942Ujhhgtgfeyxiexzf(int i) {
        m1729Ujhhgtgfeyxiexzf();
        int i2 = this.f2814Ujhhgtgfeyxiexzf;
        int[] iArr = this.f2813Ujhhgtgfeyxiexzf;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2813Ujhhgtgfeyxiexzf = iArr2;
        }
        int[] iArr3 = this.f2813Ujhhgtgfeyxiexzf;
        int i3 = this.f2814Ujhhgtgfeyxiexzf;
        int i4 = i3 + 1;
        this.f2814Ujhhgtgfeyxiexzf = i4;
        iArr3[i3] = i;
        if (!this.f2815Ujhhgtgfeyxiexzf || i4 <= 1) {
            return;
        }
        this.f2815Ujhhgtgfeyxiexzf = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m1943Ujhhgtgfeyxiexzf(int i) {
        int i2;
        int i3 = this.f2814Ujhhgtgfeyxiexzf;
        if (!this.f2815Ujhhgtgfeyxiexzf) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f2813Ujhhgtgfeyxiexzf[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f2813Ujhhgtgfeyxiexzf[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f2813Ujhhgtgfeyxiexzf[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m1944Ujhhgtgfeyxiexzf(int i) {
        if (i >= this.f2814Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f2813Ujhhgtgfeyxiexzf[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf m1945Ujhhgtgfeyxiexzf() {
        int i = this.f2814Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(i);
        for (int i2 = 0; i2 < i; i2++) {
            c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(this.f2813Ujhhgtgfeyxiexzf[i2]);
        }
        return c0684Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1946Ujhhgtgfeyxiexzf(int i, int i2) {
        m1729Ujhhgtgfeyxiexzf();
        if (i >= this.f2814Ujhhgtgfeyxiexzf) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f2813Ujhhgtgfeyxiexzf[i] = i2;
            this.f2815Ujhhgtgfeyxiexzf = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m1947Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f2814Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException("newSize > size");
        }
        m1729Ujhhgtgfeyxiexzf();
        this.f2814Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1948Ujhhgtgfeyxiexzf() {
        m1729Ujhhgtgfeyxiexzf();
        if (this.f2815Ujhhgtgfeyxiexzf) {
            return;
        }
        Arrays.sort(this.f2813Ujhhgtgfeyxiexzf, 0, this.f2814Ujhhgtgfeyxiexzf);
        this.f2815Ujhhgtgfeyxiexzf = true;
    }
}
