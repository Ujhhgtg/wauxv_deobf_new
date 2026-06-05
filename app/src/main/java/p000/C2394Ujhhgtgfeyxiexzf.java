package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2394Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2380Ujhhgtgfeyxiexzf f7783Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C1224feyxiexzfUjhhgtg f7780Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public float f7781Ujhhgtgfeyxiexzf = 0.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f7782Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f7784Ujhhgtgfeyxiexzf = false;

    public C2394Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f7783Ujhhgtgfeyxiexzf = new C2380Ujhhgtgfeyxiexzf(this, c2366Ujhhgtgfeyxiexzf);
    }

    public String toString() {
        boolean z;
        String strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(this.f7780Ujhhgtgfeyxiexzf == null ? "0" : "" + this.f7780Ujhhgtgfeyxiexzf, " = ");
        if (this.f7781Ujhhgtgfeyxiexzf != 0.0f) {
            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf);
            sbM2707Ujhhgtgfeyxiexzf.append(this.f7781Ujhhgtgfeyxiexzf);
            strM2703Ujhhgtgfeyxiexzf = sbM2707Ujhhgtgfeyxiexzf.toString();
            z = true;
        } else {
            z = false;
        }
        int iM3631Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM3631Ujhhgtgfeyxiexzf; i++) {
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3632Ujhhgtgfeyxiexzf(i);
            if (c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf != null) {
                float fM3633Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3633Ujhhgtgfeyxiexzf(i);
                if (fM3633Ujhhgtgfeyxiexzf != 0.0f) {
                    String string = c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf.toString();
                    if (z) {
                        if (fM3633Ujhhgtgfeyxiexzf > 0.0f) {
                            strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " + ");
                        } else {
                            strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " - ");
                            fM3633Ujhhgtgfeyxiexzf *= -1.0f;
                        }
                    } else if (fM3633Ujhhgtgfeyxiexzf < 0.0f) {
                        strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, "- ");
                        fM3633Ujhhgtgfeyxiexzf *= -1.0f;
                    }
                    strM2703Ujhhgtgfeyxiexzf = fM3633Ujhhgtgfeyxiexzf == 1.0f ? AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, string) : strM2703Ujhhgtgfeyxiexzf + fM3633Ujhhgtgfeyxiexzf + " " + string;
                    z = true;
                }
            }
        }
        return !z ? AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, "0.0") : strM2703Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3656Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, int i) {
        this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c0072Ujhhgtgfeyxiexzf.m1096Ujhhgtgfeyxiexzf(i), 1.0f);
        this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c0072Ujhhgtgfeyxiexzf.m1096Ujhhgtgfeyxiexzf(i), -1.0f);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3657Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7781Ujhhgtgfeyxiexzf = i;
        }
        if (z) {
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, 1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, -1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg3, -1.0f);
        } else {
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, -1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, 1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3658Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7781Ujhhgtgfeyxiexzf = i;
        }
        if (z) {
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, 1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, -1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg3, 1.0f);
        } else {
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, -1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, 1.0f);
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public C1224feyxiexzfUjhhgtg mo2248Ujhhgtgfeyxiexzf(boolean[] zArr) {
        return m3659Ujhhgtgfeyxiexzf(zArr, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public boolean mo2249Ujhhgtgfeyxiexzf() {
        return this.f7780Ujhhgtgfeyxiexzf == null && this.f7781Ujhhgtgfeyxiexzf == 0.0f && this.f7783Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf() == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C1224feyxiexzfUjhhgtg m3659Ujhhgtgfeyxiexzf(boolean[] zArr, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg) {
        int i;
        int iM3631Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf();
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM3631Ujhhgtgfeyxiexzf; i2++) {
            float fM3633Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3633Ujhhgtgfeyxiexzf(i2);
            if (fM3633Ujhhgtgfeyxiexzf < 0.0f) {
                C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3632Ujhhgtgfeyxiexzf(i2);
                if ((zArr == null || !zArr[c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf.f4535Ujhhgtgfeyxiexzf]) && c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf != c1224feyxiexzfUjhhgtg && (((i = c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf.f4545Ujhhgtgfeyxiexzf) == 3 || i == 4) && fM3633Ujhhgtgfeyxiexzf < f)) {
                    f = fM3633Ujhhgtgfeyxiexzf;
                    c1224feyxiexzfUjhhgtg2 = c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf;
                }
            }
        }
        return c1224feyxiexzfUjhhgtg2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3660Ujhhgtgfeyxiexzf(C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg) {
        C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2 = this.f7780Ujhhgtgfeyxiexzf;
        if (c1224feyxiexzfUjhhgtg2 != null) {
            this.f7783Ujhhgtgfeyxiexzf.m3634Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, -1.0f);
            this.f7780Ujhhgtgfeyxiexzf.f4536Ujhhgtgfeyxiexzf = -1;
            this.f7780Ujhhgtgfeyxiexzf = null;
        }
        float fM3635Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3635Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, true) * (-1.0f);
        this.f7780Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtg;
        if (fM3635Ujhhgtgfeyxiexzf == 1.0f) {
            return;
        }
        this.f7781Ujhhgtgfeyxiexzf /= fM3635Ujhhgtgfeyxiexzf;
        C2380Ujhhgtgfeyxiexzf c2380Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf;
        int i = c2380Ujhhgtgfeyxiexzf.f7751Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i != -1 && i2 < c2380Ujhhgtgfeyxiexzf.f7744Ujhhgtgfeyxiexzf; i2++) {
            float[] fArr = c2380Ujhhgtgfeyxiexzf.f7750Ujhhgtgfeyxiexzf;
            fArr[i] = fArr[i] / fM3635Ujhhgtgfeyxiexzf;
            i = c2380Ujhhgtgfeyxiexzf.f7749Ujhhgtgfeyxiexzf[i];
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m3661Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg, boolean z) {
        if (c1224feyxiexzfUjhhgtg.f4539Ujhhgtgfeyxiexzf) {
            float fM3630Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf.m3630Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg);
            this.f7781Ujhhgtgfeyxiexzf = (c1224feyxiexzfUjhhgtg.f4538Ujhhgtgfeyxiexzf * fM3630Ujhhgtgfeyxiexzf) + this.f7781Ujhhgtgfeyxiexzf;
            this.f7783Ujhhgtgfeyxiexzf.m3635Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, z);
            if (z) {
                c1224feyxiexzfUjhhgtg.m2685Ujhhgtgfeyxiexzf(this);
            }
            if (this.f7783Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf() == 0) {
                this.f7784Ujhhgtgfeyxiexzf = true;
                c0072Ujhhgtgfeyxiexzf.f1114Ujhhgtgfeyxiexzf = true;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public void mo2250Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, C2394Ujhhgtgfeyxiexzf c2394Ujhhgtgfeyxiexzf, boolean z) {
        C2380Ujhhgtgfeyxiexzf c2380Ujhhgtgfeyxiexzf = this.f7783Ujhhgtgfeyxiexzf;
        c2380Ujhhgtgfeyxiexzf.getClass();
        float fM3630Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf.m3630Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf.f7780Ujhhgtgfeyxiexzf);
        c2380Ujhhgtgfeyxiexzf.m3635Ujhhgtgfeyxiexzf(c2394Ujhhgtgfeyxiexzf.f7780Ujhhgtgfeyxiexzf, z);
        C2380Ujhhgtgfeyxiexzf c2380Ujhhgtgfeyxiexzf2 = c2394Ujhhgtgfeyxiexzf.f7783Ujhhgtgfeyxiexzf;
        int iM3631Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf2.m3631Ujhhgtgfeyxiexzf();
        for (int i = 0; i < iM3631Ujhhgtgfeyxiexzf; i++) {
            C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf = c2380Ujhhgtgfeyxiexzf2.m3632Ujhhgtgfeyxiexzf(i);
            c2380Ujhhgtgfeyxiexzf.m3628Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf, c2380Ujhhgtgfeyxiexzf2.m3630Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtgM3632Ujhhgtgfeyxiexzf) * fM3630Ujhhgtgfeyxiexzf, z);
        }
        this.f7781Ujhhgtgfeyxiexzf = (c2394Ujhhgtgfeyxiexzf.f7781Ujhhgtgfeyxiexzf * fM3630Ujhhgtgfeyxiexzf) + this.f7781Ujhhgtgfeyxiexzf;
        if (z) {
            c2394Ujhhgtgfeyxiexzf.f7780Ujhhgtgfeyxiexzf.m2685Ujhhgtgfeyxiexzf(this);
        }
        if (this.f7780Ujhhgtgfeyxiexzf == null || this.f7783Ujhhgtgfeyxiexzf.m3631Ujhhgtgfeyxiexzf() != 0) {
            return;
        }
        this.f7784Ujhhgtgfeyxiexzf = true;
        c0072Ujhhgtgfeyxiexzf.f1114Ujhhgtgfeyxiexzf = true;
    }
}
