package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0630Ujhhgtgfeyxiexzf extends ReplacementSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int[] f2677Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2678Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f2679Ujhhgtgfeyxiexzf = 8.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f2680Ujhhgtgfeyxiexzf = 8.0f;

    public C0630Ujhhgtgfeyxiexzf(int[] iArr, int i) {
        this.f2677Ujhhgtgfeyxiexzf = iArr;
        this.f2678Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        float f2 = i4;
        float f3 = paint.getFontMetrics().ascent + f2;
        float f4 = this.f2680Ujhhgtgfeyxiexzf;
        RectF rectF = new RectF(f, f3, (2 * f4) + fMeasureText + f, paint.getFontMetrics().descent + f2);
        int color = paint.getColor();
        Shader shader = paint.getShader();
        paint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f2677Ujhhgtgfeyxiexzf, (float[]) null, Shader.TileMode.CLAMP));
        float f5 = this.f2679Ujhhgtgfeyxiexzf;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        paint.setColor(this.f2678Ujhhgtgfeyxiexzf);
        paint.setShader(null);
        canvas.drawText(charSequence, i, i2, f + f4, f2, paint);
        paint.setColor(color);
        paint.setShader(shader);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) ((2 * this.f2680Ujhhgtgfeyxiexzf) + paint.measureText(charSequence, i, i2));
    }
}
