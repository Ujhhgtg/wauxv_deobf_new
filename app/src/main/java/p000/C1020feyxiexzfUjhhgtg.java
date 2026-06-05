package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛲᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1020feyxiexzfUjhhgtg extends AbstractC1004feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1022feyxiexzfUjhhgtg f3997Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f3998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f3999Ujhhgtgfeyxiexzf;

    public C1020feyxiexzfUjhhgtg(C1022feyxiexzfUjhhgtg c1022feyxiexzfUjhhgtg, float f, float f2) {
        this.f3997Ujhhgtgfeyxiexzf = c1022feyxiexzfUjhhgtg;
        this.f3998Ujhhgtgfeyxiexzf = f;
        this.f3999Ujhhgtgfeyxiexzf = f2;
    }

    @Override // p000.AbstractC1004feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2501Ujhhgtgfeyxiexzf(Matrix matrix, C1015feyxiexzfUjhhgtg c1015feyxiexzfUjhhgtg, int i, Canvas canvas) {
        C1022feyxiexzfUjhhgtg c1022feyxiexzfUjhhgtg = this.f3997Ujhhgtgfeyxiexzf;
        float f = c1022feyxiexzfUjhhgtg.f4002Ujhhgtgfeyxiexzf;
        float f2 = this.f3999Ujhhgtgfeyxiexzf;
        float f3 = c1022feyxiexzfUjhhgtg.f4001Ujhhgtgfeyxiexzf;
        float f4 = this.f3998Ujhhgtgfeyxiexzf;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f3924Ujhhgtgfeyxiexzf;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m2519Ujhhgtgfeyxiexzf());
        c1015feyxiexzfUjhhgtg.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c1015feyxiexzfUjhhgtg.f3969Ujhhgtgfeyxiexzf;
        int[] iArr = C1015feyxiexzfUjhhgtg.f3960Ujhhgtgfeyxiexzf;
        iArr[0] = i2;
        iArr[1] = c1015feyxiexzfUjhhgtg.f3968Ujhhgtgfeyxiexzf;
        iArr[2] = c1015feyxiexzfUjhhgtg.f3967Ujhhgtgfeyxiexzf;
        Paint paint = c1015feyxiexzfUjhhgtg.f3966Ujhhgtgfeyxiexzf;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C1015feyxiexzfUjhhgtg.f3961Ujhhgtgfeyxiexzf, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float m2519Ujhhgtgfeyxiexzf() {
        C1022feyxiexzfUjhhgtg c1022feyxiexzfUjhhgtg = this.f3997Ujhhgtgfeyxiexzf;
        return (float) Math.toDegrees(Math.atan((c1022feyxiexzfUjhhgtg.f4002Ujhhgtgfeyxiexzf - this.f3999Ujhhgtgfeyxiexzf) / (c1022feyxiexzfUjhhgtg.f4001Ujhhgtgfeyxiexzf - this.f3998Ujhhgtgfeyxiexzf)));
    }
}
