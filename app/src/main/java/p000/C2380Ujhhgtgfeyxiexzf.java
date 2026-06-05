package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛴᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2380Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2394Ujhhgtgfeyxiexzf f7745Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf f7746Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f7744Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f7747Ujhhgtgfeyxiexzf = 8;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int[] f7748Ujhhgtgfeyxiexzf = new int[8];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int[] f7749Ujhhgtgfeyxiexzf = new int[8];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float[] f7750Ujhhgtgfeyxiexzf = new float[8];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f7751Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f7752Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f7753Ujhhgtgfeyxiexzf = false;

    public C2380Ujhhgtgfeyxiexzf(C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f7745Ujhhgtgfeyxiexzf = c2394Ujhhgtgfeyxiexzf;
        this.f7746Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        int i = this.f7751Ujhhgtgfeyxiexzf;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f7744Ujhhgtgfeyxiexzf; i2++) {
            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(string, " -> "));
            sbM2707Ujhhgtgfeyxiexzf.append(this.f7750Ujhhgtgfeyxiexzf[i]);
            sbM2707Ujhhgtgfeyxiexzf.append(" : ");
            StringBuilder sbM2707Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(sbM2707Ujhhgtgfeyxiexzf.toString());
            sbM2707Ujhhgtgfeyxiexzf2.append(((C1224feyxiexzfUjhhgtg[]) this.f7746Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf)[this.f7748Ujhhgtgfeyxiexzf[i]]);
            string = sbM2707Ujhhgtgfeyxiexzf2.toString();
            i = this.f7749Ujhhgtgfeyxiexzf[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3628Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f7751Ujhhgtgfeyxiexzf;
            C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf = this.f7745Ujhhgtgfeyxiexzf;
            if (i == -1) {
                this.f7751Ujhhgtgfeyxiexzf = 0;
                this.f7750Ujhhgtgfeyxiexzf[0] = f;
                this.f7748Ujhhgtgfeyxiexzf[0] = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
                this.f7749Ujhhgtgfeyxiexzf[0] = -1;
                c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf++;
                c1224feyxiexzfUjhhgtg.m2684Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf);
                this.f7744Ujhhgtgfeyxiexzf++;
                if (this.f7753Ujhhgtgfeyxiexzf) {
                    return;
                }
                int i2 = this.f7752Ujhhgtgfeyxiexzf + 1;
                this.f7752Ujhhgtgfeyxiexzf = i2;
                int[] iArr = this.f7748Ujhhgtgfeyxiexzf;
                if (i2 >= iArr.length) {
                    this.f7753Ujhhgtgfeyxiexzf = true;
                    this.f7752Ujhhgtgfeyxiexzf = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f7744Ujhhgtgfeyxiexzf; i4++) {
                int i5 = this.f7748Ujhhgtgfeyxiexzf[i];
                int i6 = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
                if (i5 == i6) {
                    float[] fArr = this.f7750Ujhhgtgfeyxiexzf;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f7751Ujhhgtgfeyxiexzf) {
                            this.f7751Ujhhgtgfeyxiexzf = this.f7749Ujhhgtgfeyxiexzf[i];
                        } else {
                            int[] iArr2 = this.f7749Ujhhgtgfeyxiexzf;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c1224feyxiexzfUjhhgtg.m2685Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf);
                        }
                        if (this.f7753Ujhhgtgfeyxiexzf) {
                            this.f7752Ujhhgtgfeyxiexzf = i;
                        }
                        c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf--;
                        this.f7744Ujhhgtgfeyxiexzf--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f7749Ujhhgtgfeyxiexzf[i];
            }
            int length = this.f7752Ujhhgtgfeyxiexzf;
            int i7 = length + 1;
            if (this.f7753Ujhhgtgfeyxiexzf) {
                int[] iArr3 = this.f7748Ujhhgtgfeyxiexzf;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f7748Ujhhgtgfeyxiexzf;
            if (length >= iArr4.length && this.f7744Ujhhgtgfeyxiexzf < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f7748Ujhhgtgfeyxiexzf;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f7748Ujhhgtgfeyxiexzf;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f7747Ujhhgtgfeyxiexzf * 2;
                this.f7747Ujhhgtgfeyxiexzf = i9;
                this.f7753Ujhhgtgfeyxiexzf = false;
                this.f7752Ujhhgtgfeyxiexzf = length - 1;
                this.f7750Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7750Ujhhgtgfeyxiexzf, i9);
                this.f7748Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7748Ujhhgtgfeyxiexzf, this.f7747Ujhhgtgfeyxiexzf);
                this.f7749Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7749Ujhhgtgfeyxiexzf, this.f7747Ujhhgtgfeyxiexzf);
            }
            this.f7748Ujhhgtgfeyxiexzf[length] = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
            this.f7750Ujhhgtgfeyxiexzf[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f7749Ujhhgtgfeyxiexzf;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f7749Ujhhgtgfeyxiexzf[length] = this.f7751Ujhhgtgfeyxiexzf;
                this.f7751Ujhhgtgfeyxiexzf = length;
            }
            c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf++;
            c1224feyxiexzfUjhhgtg.m2684Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf);
            this.f7744Ujhhgtgfeyxiexzf++;
            if (!this.f7753Ujhhgtgfeyxiexzf) {
                this.f7752Ujhhgtgfeyxiexzf++;
            }
            int i10 = this.f7752Ujhhgtgfeyxiexzf;
            int[] iArr8 = this.f7748Ujhhgtgfeyxiexzf;
            if (i10 >= iArr8.length) {
                this.f7753Ujhhgtgfeyxiexzf = true;
                this.f7752Ujhhgtgfeyxiexzf = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3629Ujhhgtgfeyxiexzf() {
        int i = this.f7751Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i != -1 && i2 < this.f7744Ujhhgtgfeyxiexzf; i2++) {
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg = ((C1224feyxiexzfUjhhgtg[]) this.f7746Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf)[this.f7748Ujhhgtgfeyxiexzf[i]];
            if (c1224feyxiexzfUjhhgtg != null) {
                c1224feyxiexzfUjhhgtg.m2685Ujhhgtgfeyxiexzf(this.f7745Ujhhgtgfeyxiexzf);
            }
            i = this.f7749Ujhhgtgfeyxiexzf[i];
        }
        this.f7751Ujhhgtgfeyxiexzf = -1;
        this.f7752Ujhhgtgfeyxiexzf = -1;
        this.f7753Ujhhgtgfeyxiexzf = false;
        this.f7744Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float m3630Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg) {
        int i = this.f7751Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i != -1 && i2 < this.f7744Ujhhgtgfeyxiexzf; i2++) {
            if (this.f7748Ujhhgtgfeyxiexzf[i] == c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf) {
                return this.f7750Ujhhgtgfeyxiexzf[i];
            }
            i = this.f7749Ujhhgtgfeyxiexzf[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m3631Ujhhgtgfeyxiexzf() {
        return this.f7744Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C1224feyxiexzfUjhhgtg m3632Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f7751Ujhhgtgfeyxiexzf;
        for (int i3 = 0; i2 != -1 && i3 < this.f7744Ujhhgtgfeyxiexzf; i3++) {
            if (i3 == i) {
                return ((C1224feyxiexzfUjhhgtg[]) this.f7746Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf)[this.f7748Ujhhgtgfeyxiexzf[i2]];
            }
            i2 = this.f7749Ujhhgtgfeyxiexzf[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float m3633Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f7751Ujhhgtgfeyxiexzf;
        for (int i3 = 0; i2 != -1 && i3 < this.f7744Ujhhgtgfeyxiexzf; i3++) {
            if (i3 == i) {
                return this.f7750Ujhhgtgfeyxiexzf[i2];
            }
            i2 = this.f7749Ujhhgtgfeyxiexzf[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3634Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, float f) {
        if (f == 0.0f) {
            m3635Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, true);
            return;
        }
        int i = this.f7751Ujhhgtgfeyxiexzf;
        C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf = this.f7745Ujhhgtgfeyxiexzf;
        if (i == -1) {
            this.f7751Ujhhgtgfeyxiexzf = 0;
            this.f7750Ujhhgtgfeyxiexzf[0] = f;
            this.f7748Ujhhgtgfeyxiexzf[0] = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
            this.f7749Ujhhgtgfeyxiexzf[0] = -1;
            c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf++;
            c1224feyxiexzfUjhhgtg.m2684Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf);
            this.f7744Ujhhgtgfeyxiexzf++;
            if (this.f7753Ujhhgtgfeyxiexzf) {
                return;
            }
            int i2 = this.f7752Ujhhgtgfeyxiexzf + 1;
            this.f7752Ujhhgtgfeyxiexzf = i2;
            int[] iArr = this.f7748Ujhhgtgfeyxiexzf;
            if (i2 >= iArr.length) {
                this.f7753Ujhhgtgfeyxiexzf = true;
                this.f7752Ujhhgtgfeyxiexzf = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f7744Ujhhgtgfeyxiexzf; i4++) {
            int i5 = this.f7748Ujhhgtgfeyxiexzf[i];
            int i6 = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
            if (i5 == i6) {
                this.f7750Ujhhgtgfeyxiexzf[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f7749Ujhhgtgfeyxiexzf[i];
        }
        int length = this.f7752Ujhhgtgfeyxiexzf;
        int i7 = length + 1;
        if (this.f7753Ujhhgtgfeyxiexzf) {
            int[] iArr2 = this.f7748Ujhhgtgfeyxiexzf;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f7748Ujhhgtgfeyxiexzf;
        if (length >= iArr3.length && this.f7744Ujhhgtgfeyxiexzf < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f7748Ujhhgtgfeyxiexzf;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f7748Ujhhgtgfeyxiexzf;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f7747Ujhhgtgfeyxiexzf * 2;
            this.f7747Ujhhgtgfeyxiexzf = i9;
            this.f7753Ujhhgtgfeyxiexzf = false;
            this.f7752Ujhhgtgfeyxiexzf = length - 1;
            this.f7750Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7750Ujhhgtgfeyxiexzf, i9);
            this.f7748Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7748Ujhhgtgfeyxiexzf, this.f7747Ujhhgtgfeyxiexzf);
            this.f7749Ujhhgtgfeyxiexzf = Arrays.copyOf(this.f7749Ujhhgtgfeyxiexzf, this.f7747Ujhhgtgfeyxiexzf);
        }
        this.f7748Ujhhgtgfeyxiexzf[length] = c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf;
        this.f7750Ujhhgtgfeyxiexzf[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f7749Ujhhgtgfeyxiexzf;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f7749Ujhhgtgfeyxiexzf[length] = this.f7751Ujhhgtgfeyxiexzf;
            this.f7751Ujhhgtgfeyxiexzf = length;
        }
        c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf++;
        c1224feyxiexzfUjhhgtg.m2684Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf);
        int i10 = this.f7744Ujhhgtgfeyxiexzf + 1;
        this.f7744Ujhhgtgfeyxiexzf = i10;
        if (!this.f7753Ujhhgtgfeyxiexzf) {
            this.f7752Ujhhgtgfeyxiexzf++;
        }
        int[] iArr7 = this.f7748Ujhhgtgfeyxiexzf;
        if (i10 >= iArr7.length) {
            this.f7753Ujhhgtgfeyxiexzf = true;
        }
        if (this.f7752Ujhhgtgfeyxiexzf >= iArr7.length) {
            this.f7753Ujhhgtgfeyxiexzf = true;
            this.f7752Ujhhgtgfeyxiexzf = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float m3635Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, boolean z) {
        int i = this.f7751Ujhhgtgfeyxiexzf;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f7744Ujhhgtgfeyxiexzf) {
            if (this.f7748Ujhhgtgfeyxiexzf[i] == c1224feyxiexzfUjhhgtg.f4535Ujhhgtgfeyxiexzf) {
                if (i == this.f7751Ujhhgtgfeyxiexzf) {
                    this.f7751Ujhhgtgfeyxiexzf = this.f7749Ujhhgtgfeyxiexzf[i];
                } else {
                    int[] iArr = this.f7749Ujhhgtgfeyxiexzf;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c1224feyxiexzfUjhhgtg.m2685Ujhhgtgfeyxiexzf(this.f7745Ujhhgtgfeyxiexzf);
                }
                c1224feyxiexzfUjhhgtg.f4544Ujhhgtgfeyxiexzf--;
                this.f7744Ujhhgtgfeyxiexzf--;
                this.f7748Ujhhgtgfeyxiexzf[i] = -1;
                if (this.f7753Ujhhgtgfeyxiexzf) {
                    this.f7752Ujhhgtgfeyxiexzf = i;
                }
                return this.f7750Ujhhgtgfeyxiexzf[i];
            }
            i2++;
            i3 = i;
            i = this.f7749Ujhhgtgfeyxiexzf[i];
        }
        return 0.0f;
    }
}
