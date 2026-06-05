package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0845feyxiexzfUjhhgtg extends C2394Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1224feyxiexzfUjhhgtg[] f3329Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C1224feyxiexzfUjhhgtg[] f3330Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f3331Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C0844feyxiexzfUjhhgtg f3332Ujhhgtgfeyxiexzf;

    @Override // p000.C2394Ujhhgtgfeyxiexzf
    public final String toString() {
        C0844feyxiexzfUjhhgtg c0844feyxiexzfUjhhgtg = this.f3332Ujhhgtgfeyxiexzf;
        String str = " goal -> (" + this.f7781Ujhhgtgfeyxiexzf + ") : ";
        for (int i = 0; i < this.f3331Ujhhgtgfeyxiexzf; i++) {
            c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf = this.f3329Ujhhgtgfeyxiexzf[i];
            str = str + c0844feyxiexzfUjhhgtg + " ";
        }
        return str;
    }

    @Override // p000.C2394Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1224feyxiexzfUjhhgtg mo2248Ujhhgtgfeyxiexzf(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f3331Ujhhgtgfeyxiexzf; i2++) {
            C1224feyxiexzfUjhhgtg[] c1224feyxiexzfUjhhgtgArr = this.f3329Ujhhgtgfeyxiexzf;
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg = c1224feyxiexzfUjhhgtgArr[i2];
            if (!zArr[c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf]) {
                C0844feyxiexzfUjhhgtg c0844feyxiexzfUjhhgtg = this.f3332Ujhhgtgfeyxiexzf;
                c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtg;
                int i3 = 8;
                if (i != -1) {
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2 = c1224feyxiexzfUjhhgtgArr[i];
                    while (i3 >= 0) {
                        float f = c1224feyxiexzfUjhhgtg2.f4541Ujhhgtgfeyxiexzf[i3];
                        float f2 = c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f3329Ujhhgtgfeyxiexzf[i];
    }

    @Override // p000.C2394Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean mo2249Ujhhgtgfeyxiexzf() {
        return this.f3331Ujhhgtgfeyxiexzf == 0;
    }

    @Override // p000.C2394Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo2250Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf, boolean z) {
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg = c2394Ujhhgtgfeyxiexzf.f7780Ujhhgtgfeyxiexzf;
        if (c1224feyxiexzfUjhhgtg == null) {
            return;
        }
        float[] fArr = c1224feyxiexzfUjhhgtg.f4541Ujhhgtgfeyxiexzf;
        C2380Ujhhgtgfeyxiexzf c2380Ujhhgtgfeyxiexzf = c2394Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf;
        int iM3631Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM3631Ujhhgtgfeyxiexzf; i++) {
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf.m3632Ujhhgtgfeyxiexzf(i);
            float fM3633Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf.m3633Ujhhgtgfeyxiexzf(i);
            C0844feyxiexzfUjhhgtg c0844feyxiexzfUjhhgtg = this.f3332Ujhhgtgfeyxiexzf;
            c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf;
            if (c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf.f4534Ujhhgtgfeyxiexzf) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf;
                    float f = (fArr[i2] * fM3633Ujhhgtgfeyxiexzf) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    c0844feyxiexzfUjhhgtg.f3328Ujhhgtgfeyxiexzf.m2252Ujhhgtgfeyxiexzf(c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM3633Ujhhgtgfeyxiexzf;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i3] = f3;
                    } else {
                        c0844feyxiexzfUjhhgtg.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i3] = 0.0f;
                    }
                }
                m2251Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf);
            }
            this.f7781Ujhhgtgfeyxiexzf = (c2394Ujhhgtgfeyxiexzf.f7781Ujhhgtgfeyxiexzf * fM3633Ujhhgtgfeyxiexzf) + this.f7781Ujhhgtgfeyxiexzf;
        }
        m2252Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2251Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg) {
        int i;
        int i2 = this.f3331Ujhhgtgfeyxiexzf + 1;
        C1224feyxiexzfUjhhgtg[] c1224feyxiexzfUjhhgtgArr = this.f3329Ujhhgtgfeyxiexzf;
        if (i2 > c1224feyxiexzfUjhhgtgArr.length) {
            C1224feyxiexzfUjhhgtg[] c1224feyxiexzfUjhhgtgArr2 = (C1224feyxiexzfUjhhgtg[]) Arrays.copyOf(c1224feyxiexzfUjhhgtgArr, c1224feyxiexzfUjhhgtgArr.length * 2);
            this.f3329Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtgArr2;
            this.f3330Ujhhgtgfeyxiexzf = (C1224feyxiexzfUjhhgtg[]) Arrays.copyOf(c1224feyxiexzfUjhhgtgArr2, c1224feyxiexzfUjhhgtgArr2.length * 2);
        }
        C1224feyxiexzfUjhhgtg[] c1224feyxiexzfUjhhgtgArr3 = this.f3329Ujhhgtgfeyxiexzf;
        int i3 = this.f3331Ujhhgtgfeyxiexzf;
        c1224feyxiexzfUjhhgtgArr3[i3] = c1224feyxiexzfUjhhgtg;
        int i4 = i3 + 1;
        this.f3331Ujhhgtgfeyxiexzf = i4;
        if (i4 > 1 && c1224feyxiexzfUjhhgtgArr3[i3].f4535Ujhhgtgfeyxiexzf > c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf) {
            int i5 = 0;
            while (true) {
                i = this.f3331Ujhhgtgfeyxiexzf;
                if (i5 >= i) {
                    break;
                }
                this.f3330Ujhhgtgfeyxiexzf[i5] = this.f3329Ujhhgtgfeyxiexzf[i5];
                i5++;
            }
            Arrays.sort(this.f3330Ujhhgtgfeyxiexzf, 0, i, new C2419Ujhhgtgfeyxiexzf(18));
            for (int i6 = 0; i6 < this.f3331Ujhhgtgfeyxiexzf; i6++) {
                this.f3329Ujhhgtgfeyxiexzf[i6] = this.f3330Ujhhgtgfeyxiexzf[i6];
            }
        }
        c1224feyxiexzfUjhhgtg.f4534Ujhhgtgfeyxiexzf = true;
        c1224feyxiexzfUjhhgtg.m2684Ujhhgtgfeyxiexzf(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m2252Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg) {
        int i = 0;
        while (i < this.f3331Ujhhgtgfeyxiexzf) {
            if (this.f3329Ujhhgtgfeyxiexzf[i] == c1224feyxiexzfUjhhgtg) {
                while (true) {
                    int i2 = this.f3331Ujhhgtgfeyxiexzf;
                    if (i >= i2 - 1) {
                        this.f3331Ujhhgtgfeyxiexzf = i2 - 1;
                        c1224feyxiexzfUjhhgtg.f4534Ujhhgtgfeyxiexzf = false;
                        return;
                    } else {
                        C1224feyxiexzfUjhhgtg[] c1224feyxiexzfUjhhgtgArr = this.f3329Ujhhgtgfeyxiexzf;
                        int i3 = i + 1;
                        c1224feyxiexzfUjhhgtgArr[i] = c1224feyxiexzfUjhhgtgArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
