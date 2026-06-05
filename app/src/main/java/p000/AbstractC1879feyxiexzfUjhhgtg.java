package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1879feyxiexzfUjhhgtg extends AbstractC1883feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C1386feyxiexzfUjhhgtg[] f6277Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public String f6278Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f6279Ujhhgtgfeyxiexzf;

    public AbstractC1879feyxiexzfUjhhgtg() {
        this.f6277Ujhhgtgfeyxiexzf = null;
        this.f6279Ujhhgtgfeyxiexzf = 0;
    }

    public C1386feyxiexzfUjhhgtg[] getPathData() {
        return this.f6277Ujhhgtgfeyxiexzf;
    }

    public String getPathName() {
        return this.f6278Ujhhgtgfeyxiexzf;
    }

    public void setPathData(C1386feyxiexzfUjhhgtg[] c1386feyxiexzfUjhhgtgArr) {
        if (!AbstractC2855feyxiexzfUjhhgtg.m4195Ujhhgtgfeyxiexzf(this.f6277Ujhhgtgfeyxiexzf, c1386feyxiexzfUjhhgtgArr)) {
            this.f6277Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4204feyxiexzfUjhhgtg(c1386feyxiexzfUjhhgtgArr);
            return;
        }
        C1386feyxiexzfUjhhgtg[] c1386feyxiexzfUjhhgtgArr2 = this.f6277Ujhhgtgfeyxiexzf;
        for (int i = 0; i < c1386feyxiexzfUjhhgtgArr.length; i++) {
            c1386feyxiexzfUjhhgtgArr2[i].f4882Ujhhgtgfeyxiexzf = c1386feyxiexzfUjhhgtgArr[i].f4882Ujhhgtgfeyxiexzf;
            int i2 = 0;
            while (true) {
                float[] fArr = c1386feyxiexzfUjhhgtgArr[i].f4883Ujhhgtgfeyxiexzf;
                if (i2 < fArr.length) {
                    c1386feyxiexzfUjhhgtgArr2[i].f4883Ujhhgtgfeyxiexzf[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC1879feyxiexzfUjhhgtg(AbstractC1879feyxiexzfUjhhgtg abstractC1879feyxiexzfUjhhgtg) {
        this.f6277Ujhhgtgfeyxiexzf = null;
        this.f6279Ujhhgtgfeyxiexzf = 0;
        this.f6278Ujhhgtgfeyxiexzf = abstractC1879feyxiexzfUjhhgtg.f6278Ujhhgtgfeyxiexzf;
        this.f6277Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4204feyxiexzfUjhhgtg(abstractC1879feyxiexzfUjhhgtg.f6277Ujhhgtgfeyxiexzf);
    }
}
