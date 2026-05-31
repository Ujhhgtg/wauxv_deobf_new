package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1499 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int[] f5312;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f5314 = 8.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f5315 = 8.0f;

    public C1499(int[] iArr, int i) {
        this.f5312 = iArr;
        this.f5313 = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        float f2 = i4;
        float f3 = paint.getFontMetrics().ascent + f2;
        float f4 = this.f5315;
        RectF rectF = new RectF(f, f3, (2 * f4) + fMeasureText + f, paint.getFontMetrics().descent + f2);
        int color = paint.getColor();
        Shader shader = paint.getShader();
        paint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f5312, (float[]) null, Shader.TileMode.CLAMP));
        float f5 = this.f5314;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        paint.setColor(this.f5313);
        paint.setShader(null);
        canvas.drawText(charSequence, i, i2, f + f4, f2, paint);
        paint.setColor(color);
        paint.setShader(shader);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) ((2 * this.f5315) + paint.measureText(charSequence, i, i2));
    }
}
