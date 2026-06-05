package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ要点脸能不能ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0209Ujhhgtgfeyxiexzf extends C3382feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final float f1469Ujhhgtgfeyxiexzf;

    public C0209Ujhhgtgfeyxiexzf(float f) {
        this.f1469Ujhhgtgfeyxiexzf = f - 0.001f;
    }

    @Override // p000.C3382feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1288Ujhhgtgfeyxiexzf(float f, float f2, float f3, C1007feyxiexzfUjhhgtg c1007feyxiexzfUjhhgtg) {
        double d = this.f1469Ujhhgtgfeyxiexzf;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        c1007feyxiexzfUjhhgtg.m2506Ujhhgtgfeyxiexzf(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        c1007feyxiexzfUjhhgtg.m2505Ujhhgtgfeyxiexzf(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        c1007feyxiexzfUjhhgtg.m2505Ujhhgtgfeyxiexzf(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
