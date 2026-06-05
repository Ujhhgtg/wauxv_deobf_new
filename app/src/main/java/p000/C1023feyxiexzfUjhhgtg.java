package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛴ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1023feyxiexzfUjhhgtg extends AbstractC1005feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final RectF f4003Ujhhgtgfeyxiexzf = new RectF();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float f4004Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f4005Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f4006Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f4007Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f4008Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f4009Ujhhgtgfeyxiexzf;

    public C1023feyxiexzfUjhhgtg(float f, float f2, float f3, float f4) {
        this.f4004Ujhhgtgfeyxiexzf = f;
        this.f4005Ujhhgtgfeyxiexzf = f2;
        this.f4006Ujhhgtgfeyxiexzf = f3;
        this.f4007Ujhhgtgfeyxiexzf = f4;
    }

    @Override // p000.AbstractC1005feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2502Ujhhgtgfeyxiexzf(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3925Ujhhgtgfeyxiexzf;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f4006Ujhhgtgfeyxiexzf;
        float f2 = this.f4007Ujhhgtgfeyxiexzf;
        RectF rectF = f4003Ujhhgtgfeyxiexzf;
        rectF.set(this.f4004Ujhhgtgfeyxiexzf, this.f4005Ujhhgtgfeyxiexzf, f, f2);
        path.arcTo(rectF, this.f4008Ujhhgtgfeyxiexzf, this.f4009Ujhhgtgfeyxiexzf, false);
        path.transform(matrix);
    }
}
